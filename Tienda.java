/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author leonardo.sanchez
 */
public class Tienda implements ManejaClientes {

    private int numero;
    private String domicilio;
    private String telefono;
    private String rfc;
    private ArrayList<Cliente> clientes; 
    
    public Tienda(int numero, String telefono, String domicilio, String rfc, ArrayList<Cliente> clientes) {
        this.numero = numero;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.clientes = clientes;
    }
    public Tienda (int numero, String telefono, String domicilio, String rfc)
    {
        System.out.println("Estoy armando una nueva tienda, estoy dentro del constructor");
        this.numero = numero;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.rfc = rfc;
    }
    // Setters
    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    //Getters
    public int getNumero()
    {
        return numero;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public String getRfc() {
        return rfc;
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    @Override
    public String toString() {
        return "Tienda{" + "numero=" + numero + ", telefono=" + telefono + ", domicilio=" + domicilio + ", rfc=" + rfc + ", cliente=" + clientes + '}';
    }   

    @Override
    public void altaCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void bajaCliente(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizaCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente buscaCliente(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void imprimeClientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}