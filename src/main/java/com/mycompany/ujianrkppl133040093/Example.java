/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ujianrkppl133040093;

import org.apache.log4j.Logger;

/**
 *
 * @author VIKI
 */


public class Example {
    private static Logger log = Logger.getLogger(Example.class);
    
    public static void main(String[] args) {
        log.debug("Ini adalah debug message : contoh log4j");
        log.info("Ini adalah info message : contoh log4j");
        log.fatal("Ini adalah fatal message : contoh log4j");
        log.warn("Ini adalah warn message : contoh log4j");
        log.error("Ini adalah error message : contoh log4j");
    }
    
    
    
}
