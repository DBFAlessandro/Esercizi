/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblio;


import java.util.ArrayList;

//INTERFACCIA DI SERVIZIO PER COMUNICARE CON LABIBLIOTECA
public interface IBiblioteca extends AutoCloseable

{

    ArrayList<Libro>    getLibri();
    ArrayList<Prestito> getPrestiti();
    ArrayList<Prestito> getPrestiti(Libro libro);
    ArrayList<Prestito> getPrestiti(Utente utente);
    ArrayList<Utente>   getUtenti();
    int getPrestitoMassimo();
    boolean remPrestito(Prestito p) throws ABibliotecaException;
    boolean addPrestito(Prestito p) throws ABibliotecaException;
}

