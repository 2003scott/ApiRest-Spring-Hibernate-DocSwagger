package com.hibernate.hibernatemysql.Service;

import com.hibernate.hibernatemysql.Entity.Clientes;
import com.hibernate.hibernatemysql.Repository.ClientesRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientesServiceImpl implements ClientesService{

    @Autowired
    ClientesRepository clientesRepository;

    @Override
    public List<Clientes> findAll() {
        return clientesRepository.findAll();
    }

    @Override
    public Optional<Clientes> findById(Long id) {
        return clientesRepository.findById(id);
    }

    @Override
    public Clientes add(Clientes cli) {
        return clientesRepository.save(cli);
    }

    @Override
    public Clientes uppdate(Clientes cli ) {
        Clientes objCliente= clientesRepository.getById(cli.getCodcli());
        BeanUtils.copyProperties(cli ,objCliente);
        return clientesRepository.save(objCliente);
    }

    @Override
    public void delete(Long id) {
        clientesRepository.deleteById(id);
    }

}
