/*Aca definimos los servicios CRUD de la entidad, crear, actualizar, eliminar y condultar
* y cuales seran los componentes para la interfaz y la denominacion de los servicios
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto1.prueba.services;
import com.proyecto1.prueba.model.cliente;
/* @author Jimmy*/
 public interface clienteService {
    //Aca inicio a generar el puente o conexion la interfaz logica donde el usuario pueda manipular los datos del cliente//
    //Y como van a ser llamados cada uno de los metodos que se llevaran a cabo para realizar las cuatro actividades CRUD//
    //cliente newcliente(cliente newcliente);
    //Parametro para contenido de tipo interactivo que limpie datos y muestre la nueva informacion//
    //Objeto clase o entidad cliente//
    cliente newCliente (cliente newCliente);
    Iterable<cliente> getAll();
    cliente modifyCliente(cliente cliente);
//Condiciones boolenas//
    Boolean deleteCliente (Long iduser);
}