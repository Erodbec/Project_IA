/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolog;

import org.jpl7.Query;


/**
 *
 * @author ENRIQUE
 */
public class PrologMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prolog pr=new Prolog();
        String resulta=pr.concatenarList();
        System.out.println("El insecto es: "+resulta);
    }
}

