/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolog;

import java.util.ArrayList;
import java.util.Scanner;
import org.jpl7.Query;

/**
 *
 * @author ENRIQUE
 */
public class Prolog {

    private String[] listaRuta;
    private String listaConcat;
    private String predicado;

    public Prolog() {
        try {
            Query con = new Query("consult('arbolfamiliar.pl')");
            System.out.println((con.hasMoreSolutions() ? "ACEPTADO" : "FALLADO"));
        } catch (Exception e) {
        }
    }

    public String concatenarList() {
        try {

            System.out.println("Compara");
            predicado = "descend(donna,Y).";
            Query ejecutar = new Query(predicado);

            if (ejecutar.hasSolution()) {
                // System.out.println("El insecto es: " + ejecutar.oneSolution().get("C").toString());
                listaConcat = ejecutar.oneSolution().get("Y").toString();
            }

        } catch (Exception e) {
        }

        return listaConcat;
    }
}
