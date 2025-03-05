package com.app.taller1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.taller1.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
