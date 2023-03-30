package com.hibernate.hibernatemysql.RestController;

import com.hibernate.hibernatemysql.Entity.Clientes;
import com.hibernate.hibernatemysql.Service.ClientesService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClientesRestController {

    @Autowired
    private ClientesService clientesService;

    /**
     * http://localhost:8090/api/clientes
     * @return
     */
    @GetMapping
    public List<Clientes> findAll() {
        return clientesService.findAll();
    }

    /**
     * http://localhost:8090/api/clientes/1
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Optional<Clientes> findById(@PathVariable Long id) {
        return clientesService.findById(id);
    }

    @PostMapping
    public Clientes add(@RequestBody Clientes cli) {
        return clientesService.add(cli);
    }

    @PutMapping("/{id}")
    public Clientes uppdate(@PathVariable Long id ,@RequestBody Clientes cli ) {
        cli.setCodcli(id);
        return clientesService.uppdate(cli);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        clientesService.delete(id);
    }

}
