package com.cesarbassani.apprest.resources;

import com.cesarbassani.apprest.domain.Pedido;
import com.cesarbassani.apprest.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {

    @Autowired
    private PedidoService PedidoService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> find(@PathVariable("id") Integer id) {
        Pedido obj = PedidoService.buscar(id);
        return ResponseEntity.ok().body(obj);
    }
}