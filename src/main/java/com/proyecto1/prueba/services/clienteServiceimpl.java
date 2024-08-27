/*Implementacion de los elementos CRUD, comunicacion de los servicios hacia la base de datos llamada ejemplo
* Logica de todo lo que se requiere para hacer la integracion, comunicacion Y servicios con los datos 
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto1.prueba.services;

import com.proyecto1.prueba.model.cliente;
import com.proyecto1.prueba.repository.clienteRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *Generacion de los metodos para el CRUD
 * @author Jimmy
 */
@Service
public abstract class clienteServiceimpl implements clienteService{

@Autowired
private clienteRepository clienteRepository;
    
@Override
public cliente newCliente(cliente newcliente) {
            return clienteRepository.save(newcliente);
    }

    @Override
public Iterable<cliente> getAll() {
            return this.clienteRepository.findAll();
    }

    @Override
    public cliente modifyCliente(cliente cliente) {
    
        Optional<cliente> clienteEncontrado= this.clienteRepository.findById(cliente.getIduser());
            if (clienteEncontrado.get() !=null) {
                clienteEncontrado.get().setNomuser(cliente.getNomuser());
                clienteEncontrado.get().setApellido(cliente.getApellido());
                clienteEncontrado.get().setEmail(cliente.getEmail());
            return this.newCliente(clienteEncontrado.get());
                
            }
            return null;
    }

    /**
     *
     * @param iduser
     * @return
     */
    @Override
        public Boolean deleteCliente(Long iduser) {
        this.clienteRepository.deleteById(iduser);
        return true;
    }
    
    
}
