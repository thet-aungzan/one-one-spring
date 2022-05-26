package com.example.oneonespring.service;

import com.example.oneonespring.dao.AddressDao;
import com.example.oneonespring.dao.CustomerDao;
import com.example.oneonespring.ds.Address;
import com.example.oneonespring.ds.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class InformationService {

    @Autowired
    private AddressDao addressDao;
    @Autowired
    private CustomerDao customerDao;

    @Transactional
    public void creatDb(){
        Customer customer=new Customer("John Doe","Reading");
        Customer customer1=new Customer("Thomas","Swimming");

        Address address=new Address("Love Lane","Ygn","11111");
        Address address1=new Address("Dream Land","USA","22222");

        customer.setAddress(address);
        customer1.setAddress(address1);

        address.setCustomer(customer);
        address1.setCustomer(customer1);

        addressDao.save(address);
        addressDao.save(address1);

        customerDao.save(customer);
        customerDao.save(customer1);
    }

    @Transactional
    public String findAddressByCustomerId(int customerId){
        Customer customer = customerDao.getById(customerId);
        return customer.getAddress().getStreetName();
    }
@Transactional
    public void findCustomerByAddressId(int addressId){
        Address address = addressDao.getById(addressId);
    System.out.println("Address :"+address.getStreetName());
    System.out.println("Customer Info : "+address.getCustomer());
//        System.out.println(String.format("Address %s has a Customer %s",address.getStreetName(),address.getCustomer().getName()));
    }
}
