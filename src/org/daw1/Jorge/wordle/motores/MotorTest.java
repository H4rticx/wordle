/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daw1.Jorge.wordle.motores;

import java.io.File;
import java.util.Set;
import org.daw1.Jorge.wordle.IMotores;

/**
 *
 * @author alumno
 */
public class MotorTest implements IMotores{

    public MotorTest() {
    }
    
    
    
    @Override
    public boolean  checkPalabra(String palabra){
        return palabra.matches("[A-Z-a-z]{5}");
    }
    @Override
    public String obtenerPalabraAleatoria(){
        return "CICLO";
    }

    @Override
    public void createFile(File file) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<String> cargarFichero(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
