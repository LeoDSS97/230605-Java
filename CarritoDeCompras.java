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
public class CarritoDeCompras implements OperaArticulo{
              //Generico
    ArrayList<Articulo> ListaArticulos;

    public CarritoDeCompras() {
    }

    public CarritoDeCompras(ArrayList<Articulo> ListaArticulos) {
        this.ListaArticulos = ListaArticulos;
    }    
    
    public ArrayList<Articulo> getListaArticulos() {
        return ListaArticulos;
    }

    public void setListaArticulos(ArrayList<Articulo> ListaArticulos) {
        this.ListaArticulos = new ArrayList(ListaArticulos);
    }

    @Override
    public String toString() {
        return "CarritoDeCompras{" + "ListaArticulos=" + ListaArticulos + '}';
    }

    @Override
    public void agregarArticulo(Articulo articulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarArticulo(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Articulo buscarArticulo(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void listarArticulos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
