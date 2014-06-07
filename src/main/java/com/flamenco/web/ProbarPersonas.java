/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.flamenco.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author lauraflamenco
 */
public class ProbarPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 ApplicationContext cts=new AnnotationConfigApplicationContext(ServiciosFlamenco.class);
     Persona  p=cts.getBean(Persona.class);

    System.out.println(p.ejecutarGracia());
    
  }  
}
