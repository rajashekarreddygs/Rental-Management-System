package com.example.Rental_management.Service;

import com.example.Rental_management.Entity.Categories;
import com.example.Rental_management.Repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesService {
    @Autowired
    CategoriesRepository categoriesRepository;
    public Categories insert(Categories categories)
    {
        return categoriesRepository.save(categories);
    }
    public List<Categories> insertmany(List<Categories> categories)
    {
        return categoriesRepository.saveAll(categories);
    }
    public List<Categories> fetch()
    {
        return categoriesRepository.findAll();
    }
    public Categories fetchbyid(Integer id)
    {
        return categoriesRepository.findById(id).orElse(null);
    }
    public Categories update(Categories categories,Integer id)
    {
        Categories categories1=categoriesRepository.findById(id).orElse(null);
        if(categories1!=null)
        {
            categories1.setCategory_name(categories.getCategory_name());
            categories1.setDescription(categories.getDescription());
            return categoriesRepository.save(categories1);
        }
        return null;
    }
    public String delete(Integer id)
    {
        if(categoriesRepository.existsById(id))
        {
            categoriesRepository.findById(id);
            return "Data deleted successfully";
        }
        return "Id doesn't existed";
    }
}
