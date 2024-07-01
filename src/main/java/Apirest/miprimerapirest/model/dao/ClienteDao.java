package Apirest.miprimerapirest.model.dao;

import Apirest.miprimerapirest.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
// Podria usar PagingAndSortingRepository para mostrar mayores resultados ordenados.
public interface ClienteDao extends CrudRepository<Cliente,Integer> {
}
