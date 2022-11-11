package com.neogedom.exceptionhandling.controller;

import com.neogedom.exceptionhandling.exception.InvalidCharacterException;
import com.neogedom.exceptionhandling.model.OlaMundo;
import com.neogedom.exceptionhandling.model.SomarNumero;

import javax.swing.JOptionPane;

import org.apache.logging.log4j.message.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/somar")
public class SomarController {

    @GetMapping(value = "/{numero1}/{numero2}")
    public Integer getSomarNumero(@PathVariable String numero1, @PathVariable String numero2, @PathVariable Integer somarNumero){
       while(true){
        try {
        somarNumero = Integer.parseInt(numero1+numero2);          
        } catch (NumberFormatException ex){
        throw new InvalidCharacterException("Não é permitido letras!");
        //JOptionPane.showMessageDialog(null, "Não é permitido letras!");
        //continue;
        } return somarNumero; 
    } 
    }}
    





    

//@RestController
//@RequestMapping("sum")
//public class SomarController {
//private Integer numero1 ;
//private Integer numero2 ;
//private Integer soma = numero1 + numero2;
//private String letra;
//private Integer numero;

//@GetMapping("/{numero1}/{numero2}")
//public Integer SomarNumero(@PathVariable String numero1, @PathVariable String numero2, @PathVariable Integer soma){
    //return}}
/* try {return numero1+numero2;
} catch(Exception ex){
throw new InvalidCharacterException("Não é permitido letras na soma!");
}}
} */
//@GetMapping("/{letra}/{letra}")
//public (@PathVariable String letra){
//throw new InvalidCharacterException("Não é permitido letras na soma!");
   // return letra;         

