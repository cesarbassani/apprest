package com.cesarbassani.apprest.resources;

import com.cesarbassani.apprest.domain.Categoria;
import com.cesarbassani.apprest.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> find(@PathVariable("id") Integer id) {

        Categoria obj = categoriaService.buscar(id);

        return ResponseEntity.ok().body(obj);
    }
}
