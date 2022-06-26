package ecom.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ecom.backend.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
