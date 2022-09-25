package com.example.cursomc.resources;

import com.example.cursomc.domain.Categoria;
import com.example.cursomc.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value="/categorias")
public class  CategoriaResource {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping(value = "/{id}")
    public ResponseEntity <Categoria> find(@PathVariable Integer id) {

        Categoria obj = categoriaService.buscar(id);

        return ResponseEntity.ok().body(obj);

    }


}
