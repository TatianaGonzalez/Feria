package feria;

import java.util.Date;

public class Feria {

    private String nombre; //El nombre de la Feria varía depende del mes y la ubicación en donde se encuentre 
    private int numeroDeJuegos; //El total de juegos es 100
    private Date fechaDeFundacion;
    private String comida;
    private Boolean abierta; //Si el 70% de los juegos están activos, la Feria está abierta

    public Feria(
            String nombre, 
            int numeroDeJuegos, 
            Date fechaDeFundacion, 
            String comida, 
            Boolean abierta) {
        this.nombre = nombre;
        this.numeroDeJuegos = numeroDeJuegos;
        this.fechaDeFundacion = fechaDeFundacion;
        this.comida = comida;
        this.abierta = abierta;
    }
    
    /**
     * El método activa juegos de acuerdo al estado en el que estén (buen estado, mantenimiento, mal estado)
     * y se decide si la Feria se puede abrir.
     */
    
    public void activarJuegos(){
        this.numeroDeJuegos += 70;
        this.abierta = true;
    }
    
    /**
     * Este método nos permite cambiar el nombre de la Feria
     * y nos permite elegir el combo de comida que queremos
     * @param nuevoNombre es el nuevo nombre de la Feria
     * @param nuevaComida es la nueva comida (combo) de la Feria
     */
    
    public void combosYReapertura(
            String nuevoNombre,
            String nuevaComida){
        this.nombre = nuevoNombre;
        this.comida = nuevaComida;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeJuegos() {
        return numeroDeJuegos;
    }

    public void setNumeroDeJuegos(int numeroDeJuegos) {
        this.numeroDeJuegos = numeroDeJuegos;
    }

    public Date getFechaDeFundacion() {
        return fechaDeFundacion;
    }

    public void setFechaDeFundacion(Date fechaDeFundacion) {
        this.fechaDeFundacion = fechaDeFundacion;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public Boolean getAbierta() {
        return abierta;
    }

    public void setAbierta(Boolean abierta) {
        this.abierta = abierta;
    }

    
    
    public static void main(String[] args) {
        
    }
    
}
