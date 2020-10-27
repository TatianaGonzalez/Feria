
package feria;

import java.util.Date;


public class FeriaLibros extends Feria {
  
    private Boolean saleLibros; // Verdadero si toda la feria está con el 20% de descuento
    private int cantidadDeLibrosDis; // La cantidad maxima de libros disponibles de la feria es 10mil
    private int numeroDeVendedores; // Este es la cantidad de vendedores que hay en la feria 

    public FeriaLibros(String nombre,
           int numeroDeJuegos, 
           Date fechaDeFundacion, 
           String comida, 
           Boolean abierta,
           int cantidadDeLibros,
           int numeroDeVenderos,
           boolean saleLibros) {       
        super(nombre, 
              numeroDeJuegos, 
              fechaDeFundacion, 
              comida, 
              abierta);
        
        this.cantidadDeLibrosDis = cantidadDeLibros;
        this.numeroDeVendedores = numeroDeVendedores;
        this.saleLibros = saleLibros;
    }

    public Boolean getSaleLibros() {
        return saleLibros;
    }

    public void setSaleLibros(Boolean saleLibros) {
        this.saleLibros = saleLibros;
    }

    public int getCantidadDeLibrosDis() {
        return cantidadDeLibrosDis;
    }

    public void setCantidadDeLibrosDis(int cantidadDeLibrosDis) {
        this.cantidadDeLibrosDis = cantidadDeLibrosDis;
    }

    public int getNumeroDeVendedores() {
        return numeroDeVendedores;
    }

    public void setNumeroDeVendedores(int numeroDeVendedores) {
        this.numeroDeVendedores = numeroDeVendedores;
    }
        
}
