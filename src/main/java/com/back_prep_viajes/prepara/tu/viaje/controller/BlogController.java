
package com.back_prep_viajes.prepara.tu.viaje.controller;

import com.back_prep_viajes.prepara.tu.viaje.model.Blog;
import com.back_prep_viajes.prepara.tu.viaje.service.service.impl.BlogService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
    
    @Autowired 
    public BlogService service;
    
    @GetMapping("/blog/listar")
    @ResponseBody
    public List<Blog> obtenerBlog() {
        return service.obtenerBlog();
    }
    
    @PostMapping("/blog/crear")
    @ResponseBody
    public void crearBlog(@RequestBody Blog blog) {
        service.crearBlog(blog);
    }
    
     @DeleteMapping("/blog/eliminar/{id}")
    public void borrarBlog(@PathVariable Long id) {
        service.borrarBlog(id);
    }
    
     @GetMapping("/blog/buscar/{id}")
    @ResponseBody
    public Blog obtenerBlog(@PathVariable Long id) {
        return service.obtenerBlog(id);
    }
    
     @PutMapping("/blog/actualizar")
    public void modificarBlog(@RequestBody Blog blog) {
        service.modificarBlog(blog);
    }
}
