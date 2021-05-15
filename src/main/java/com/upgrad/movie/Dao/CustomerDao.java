package com.upgrad.movie.Dao;

import com.upgrad.movie.entity.Customer;

public interface CustomerDao {
     public Customer save(Customer customer);
     public Customer findById(int id);
     public Customer update(Customer customer);
     public void delete(Customer customer);

}
