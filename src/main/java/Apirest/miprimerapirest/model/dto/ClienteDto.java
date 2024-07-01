package Apirest.miprimerapirest.model.dto;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;


@Data

@ToString
@Builder

public class ClienteDto implements Serializable {

    private Integer idCliente;
    private String nombre;
    private String apellido;
    private String correo;
    private Date fechaRegistro;

}
