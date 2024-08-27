 /*Seccion crearemos la clase para la entidad de una tabla de la aplicacion*/
 package com.proyecto1.prueba.model;
 import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
 
/* @author GAES 6 Ficha:  2721458*/
 /*Llamado de recursos para la generacion de loa patrones de codigo*/
 @Entity
 /*Para que me genere actividad con la base de datos get and set*/
 @Data
  public class cliente {
     //Generacion de la llave primaria y el tipo de campo del id primary key//
    @Id
    //especificaciones al tipo de contenido, especificaciones y el nombrado de la columna//
    @Column
    private Long iduser;
    @Column
    private String nomuser;
    @Column
    private String apellido;
    @Column
    private String email;
    /*hasta aca hemos generado la entidad de una tabla que va a cargar los datos de un aprendiz*/
}
