package com.cesarbassani.apprest.resources;

import com.cesarbassani.apprest.domain.Cliente;
import com.cesarbassani.apprest.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService ClienteService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Cliente> find(@PathVariable("id") Integer id) {
        Cliente obj = ClienteService.find(id);
        return ResponseEntity.ok().body(obj);
    }
}
