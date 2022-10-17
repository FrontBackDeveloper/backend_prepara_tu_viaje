
package com.back_prep_viajes.prepara.tu.viaje.service;

import com.back_prep_viajes.prepara.tu.viaje.model.Blog;
import java.util.List;


public interface IBlogService {
    public List<Blog> obtenerBlog();
    public void crearBlog(Blog blog);
    public void borrarBlog(Long id_blog);
    public Blog obtenerBlog(Long id_blog);
    public void modificarBlog(Blog blog);
}
