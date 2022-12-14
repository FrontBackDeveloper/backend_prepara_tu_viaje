
package com.back_prep_viajes.prepara.tu.viaje.service.service.impl;

import com.back_prep_viajes.prepara.tu.viaje.model.Blog;
import com.back_prep_viajes.prepara.tu.viaje.repository.BlogRepository;
import com.back_prep_viajes.prepara.tu.viaje.service.IBlogService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService implements IBlogService{
    @Autowired
    public BlogRepository repository;
    
    @Override
    public List<Blog> obtenerBlog() {
        return repository.findAll();
          }

    @Override
    public void crearBlog(Blog blog) {
        repository.save(blog);
         }

    @Override
    public void borrarBlog(Long id) {
        repository.deleteById(id);
        }

    @Override
    public Blog obtenerBlog(Long id) {
        return repository.findById(id).orElse(null);
       }

    @Override
    public void modificarBlog(Blog blog) {
        repository.save(blog);
        }
    
}
