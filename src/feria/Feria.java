package feria;

import java.util.Date;

public class Feria {

    private String nombre; //Este es el nombre de la feria 
    private int numeroDeJuegos; //Este es el numero de juegos que tiene la feria
    private Date fechaDeFundacion; //Esta es la fecha en la que se fundó la feria
    private String comida; //Comida (combos) que hay en la feria
    private Boolean abierta; //Denota si la feria se puede abrir o no

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
        Feria feriaUno = new Feria(
                "Hawk Magic",
                100,
                new Date(),
                "perro + gaseosa + papas, hamburguesa + gaseosa, dos perros + dos gaseosas, nachos, dulces, entre otros",
                true);
        Feria feriaDos = new Feria(
                "Fantastic city",
                50,
                new Date(),
                "sandwich + jugo hit, empanada + gaseosa + salsas, sancocho + gaseosa + ensalada, entre otros",
                false); 
        
        System.out.println(feriaUno.getNombre());
        System.out.println(feriaUno.getNumeroDeJuegos());
        System.out.println(feriaUno.getAbierta());
        
        feriaUno.activarJuegos();
        
        System.out.println(feriaUno.getNombre());
        System.out.println(feriaUno.getNumeroDeJuegos());
        System.out.println(feriaUno.getAbierta());
                 
        feriaUno.activarJuegos();
    }
    
}
