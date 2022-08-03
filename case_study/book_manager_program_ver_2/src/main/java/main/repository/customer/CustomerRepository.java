package main.repository.customer;

import main.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
