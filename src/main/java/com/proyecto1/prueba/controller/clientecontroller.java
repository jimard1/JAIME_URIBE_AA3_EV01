/*Llamar los metodos para la comnicacion del lado de la WEB
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto1.prueba.controller;

import com.proyecto1.prueba.model.cliente;
import com.proyecto1.prueba.services.clienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**Llamado de elementos que estan dentro de las dependencias*/
@RestController
/*Aca se asociara la ruta url WEB donde se encuentra el ecceso a nuestra aplicacion*/
/*La ruta seria localhost:8080/cliente/nuevo/ de acuerdo a los dos siguientes Mapping*/
/*y nos genere poder ingresar la informacion via WEB*/
@RequestMapping("/cliente")

public class clientecontroller {
    
    @Autowired
    private clienteService clienteService;
    /*Consultas por enlace*/
    @PostMapping("/nuevo")
    /*Aca esta newCliente como parametro*/
    public cliente newCliente(@RequestBody cliente newCliente){
        return this.clienteService.newCliente(newCliente);
    }
/*Iteraccion de los elementos que nos han permitido ingresar la informacion*/
    @GetMapping ("/mostrar")
    public Iterable<cliente> getAll(){
        return clienteService.getAll();
    }
    
    @PostMapping("/Modificar")
    public cliente updateCliente(@RequestBody cliente cliente){
    return this.clienteService.modifyCliente(cliente);
    }
    
    /*Consulta por id*/
    @PostMapping (value="/{id}")
    public Boolean deleteCliente(@PathVariable(value="id") Long id){
    return this.clienteService.deleteCliente(id);
    }
}
