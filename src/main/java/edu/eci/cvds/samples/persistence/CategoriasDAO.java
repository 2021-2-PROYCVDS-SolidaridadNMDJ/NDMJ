package edu.eci.cvds.samples.persistence;
import edu.eci.cvds.samples.entities.Categoria;
import edu.eci.cvds.samples.services.SolidaridadException;
import org.postgresql.util.PSQLException;

import java.util.List;

public interface CategoriasDAO {

    void save(Categoria categoria) throws SolidaridadException;
    void delete( String idCategoria) throws SolidaridadException;
    Categoria load(String nombre) throws SolidaridadException;  
    List<Categoria> load() throws SolidaridadException; 
    void update(Categoria categoriaNombre, String nombre, String descripcion, String estado) throws SolidaridadException, PSQLException;
}