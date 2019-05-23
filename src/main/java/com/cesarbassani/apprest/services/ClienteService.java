package com.cesarbassani.apprest.services;

import com.cesarbassani.apprest.domain.Categoria;
import com.cesarbassani.apprest.domain.Cliente;
import com.cesarbassani.apprest.repositories.CategoriaRepository;
import com.cesarbassani.apprest.repositories.ClienteRepository;
import com.cesarbassani.apprest.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente buscar(Integer id) {
        Optional<Cliente> obj = clienteRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }
}
