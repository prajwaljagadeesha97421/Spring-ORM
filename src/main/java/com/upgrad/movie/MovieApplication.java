package com.upgrad.movie;

import com.upgrad.movie.Dao.CustomerDao;
import com.upgrad.movie.entity.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDateTime;

@SpringBootApplication
public class MovieApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(MovieApplication.class, args);

		CustomerDao customerDao = applicationContext.getBean(CustomerDao.class);

		Customer customer = new Customer();
		customer.setFirstName("Prajwal");
		customer.setLastName("MJ");
		customer.setUserName("user");
		customer.setPassword("8888");
		customer.setDateOfBirth(LocalDateTime.of(1993,3,2,1,2));

		Customer saved = customerDao.save(customer);

		customer.setFirstName("Rakesh");

		Customer updated = customerDao.update(customer);

		Customer finding = customerDao.findById(updated.getCustomerId());

		System.out.println(finding);

		customerDao.delete(customer);

	}

}
