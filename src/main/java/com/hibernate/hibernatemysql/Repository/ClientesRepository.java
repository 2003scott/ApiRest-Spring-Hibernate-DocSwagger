package com.hibernate.hibernatemysql.Repository;

import com.hibernate.hibernatemysql.Entity.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Clientes,Long> {

}
