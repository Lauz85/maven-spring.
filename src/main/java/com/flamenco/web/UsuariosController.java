/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.flamenco.web;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition;

@Controller
@RequestMapping("/Usuarios")

/**
 *
 * @author lauraflamenco
 */
public class UsuariosController {
    @RequestMapping (value="/mensaje",method=RequestMethod.GET,
            headers = {"Accept=Application/json"})

 @ResponseBody String mijason() {
     ObjectMapper mapeadorjson= new ObjectMapper();
     return null;
 }  
}
