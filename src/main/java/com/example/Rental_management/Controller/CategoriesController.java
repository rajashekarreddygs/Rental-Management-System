package com.example.Rental_management.Controller;

import com.example.Rental_management.Entity.Categories;
import com.example.Rental_management.Repository.CategoriesRepository;
import com.example.Rental_management.Service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Categories")
public class CategoriesController {
    @Autowired
    CategoriesService categoriesService;
    @PostMapping("/insert")
    public Categories insert(@RequestBody Categories categories)
    {
        return categoriesService.insert(categories);
    }
    @PostMapping("/insertmany")
    public List<Categories> insertmany(@RequestBody List<Categories> categories)
    {
        return categoriesService.insertmany(categories);
    }
    @GetMapping("/fetch")
    public List<Categories> fetch()
    {
        return categoriesService.fetch();
    }
    @GetMapping("/fetch/{id}")
    public Categories fetchbyid(@PathVariable Integer id)
    {
        return categoriesService.fetchbyid(id);
    }
    @PutMapping("/update/{id}")
    public Categories update(@RequestBody Categories categories,@PathVariable Integer id)
    {
        return categoriesService.update(categories,id);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id)
    {
        return categoriesService.delete(id);
    }


}
