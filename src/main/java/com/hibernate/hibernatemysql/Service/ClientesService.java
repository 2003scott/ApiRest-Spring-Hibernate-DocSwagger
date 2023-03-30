package com.hibernate.hibernatemysql.Service;

import com.hibernate.hibernatemysql.Entity.Clientes;

import java.util.List;
import java.util.Optional;

public interface ClientesService {

    List<Clientes> findAll();
    Optional<Clientes> findById(Long id);
    Clientes add(Clientes cli);
    Clientes uppdate(Clientes cli);
    public void delete(Long id);
}
