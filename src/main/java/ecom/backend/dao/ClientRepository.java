package ecom.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ecom.backend.entities.Client;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long>{

}
