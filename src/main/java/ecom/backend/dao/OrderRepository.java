package ecom.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ecom.backend.entities.Order;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order, Long>{

}
