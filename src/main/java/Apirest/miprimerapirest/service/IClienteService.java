package Apirest.miprimerapirest.service;

import Apirest.miprimerapirest.model.dto.ClienteDto;
import Apirest.miprimerapirest.model.entity.Cliente;

import java.util.List;

public interface IClienteService {

    List<Cliente> listAll();

    Cliente save (ClienteDto cliente);

    Cliente findById(Integer id);
    void delete(Cliente cliente);

    boolean existsById(Integer id);


}
