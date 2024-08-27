/*Llamado de conexiones con la clase de clienteRepository
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto1.prueba.repository;

import com.proyecto1.prueba.model.cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jimmy
 */
public interface clienteRepository extends JpaRepository<cliente, Long>{
    
}
