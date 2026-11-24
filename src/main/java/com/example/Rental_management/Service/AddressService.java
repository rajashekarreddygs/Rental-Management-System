package com.example.Rental_management.Service;

import com.example.Rental_management.Entity.Address;
import com.example.Rental_management.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
@Autowired
    AddressRepository addressRepository;
    public Address insert(Address address)
    {
        return addressRepository.save(address);
    }

    public List<Address> insertMany(List<Address> addresses)
    {
        return addressRepository.saveAll(addresses);
    }


    public List<Address> fetch()
    {
        return addressRepository.findAll();
    }


    public Address fetchById(Integer id)
    {
        return addressRepository.findById(id).orElse(null);
    }

    public Address update(Integer id, Address address)
    {
        Address address1=addressRepository.findById(id).orElse(null);
        if(address1!=null){
            address1.setUser(address.getUser());
            address1.setHouse_address(address.getHouse_address());
            address1.setCity(address.getCity());
            address1.setArea(address.getArea());
            address1.setLatitude(address.getLatitude());
            address1.setLongitude(address.getLongitude());
            address1.setPincod(address.getPincod());
          return addressRepository.save(address1);
        }
        return null;
    }

    public String delete(Integer id)
    {
        if(addressRepository.existsById(id))
        {
            addressRepository.deleteById(id);
            return "deleted succesfully";
        }
        return null;
    }
}
