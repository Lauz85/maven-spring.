/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.flamenco.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author lauraflamenco
 */
        @Configuration 
public class ServiciosFlamenco {
    
@Bean
Persona ejecutarGracia(){
    return new CuentaChistes();
    
}

    
}
