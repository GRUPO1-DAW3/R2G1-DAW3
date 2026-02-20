import java.sql.Date;

public class Prestamo{
//Atributos de la clase Prestamo
    private int ID_prestamo;
    private Usuario usuario;
    private Ejemplar ejemplar;
    private Date fecha_inicio;
    private Date fecha_devolucion;

//Metodo constructor de la clase Prestamo
    public Prestamo(int pID_prestamo, Usuario pUsuario, Ejemplar pEjemplar, Date pFecha_inicio, Date pFecha_devolucion){
        this.ID_prestamo=pID_prestamo;
        this.usuario=pUsuario;
        this.ejemplar=pEjemplar;
        this.fecha_inicio=pFecha_inicio;
        this.fecha_devolucion=pFecha_devolucion;
    }

//Getters de la clase Prestamo
    public int getID_prestamo(){
        return ID_prestamo;
    }
    public Usuario getUsuario(){
        return usuario;
    }
    public Ejemplar getEjemplar(){
        return ejemplar;
    }
    //Comprobamos si la fecha de inicio y la fechad de devolucion son nulas o no
    public Date getFecha_inicio(){
        if (fecha_inicio != null) {
            return fecha_inicio;
        } else {
            System.out.println("La fecha de inicio no ha sido establecida.");
            return null;
        }
    }
    public Date getFecha_devolucion(){
        if (fecha_devolucion != null) {
            return fecha_devolucion;
        } else {
            System.out.println("La fecha de devolución no ha sido establecida.");
            return null;
        }
    }
//Setters de la clase Prestamo
    public void setID_prestamo(int pID_prestamo){
        this.ID_prestamo=pID_prestamo;
    }
    public void setUsuario(Usuario pUsuario){
        this.usuario=pUsuario;
    }
    public void setEjemplar(Ejemplar pEjemplar){
        this.ejemplar=pEjemplar;
    }
    //Comprobamos que la fecha de inicio y la fecha de devolucion no sean nulas.
    public void setFecha_inicio(Date pFecha_inicio){
        if (pFecha_inicio != null) {
            this.fecha_inicio = pFecha_inicio;
        } else {
            System.out.println("La fecha de inicio no puede ser nula.");
        }
    }
    public void setFecha_devolucion(Date pFecha_devolucion){
        if (pFecha_devolucion != null) {
            this.fecha_devolucion = pFecha_devolucion;
        } else {
            System.out.println("La fecha de devolución no puede ser nula.");
        }
    }

//Equals y toString de la clase Prestamo
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Prestamo prestamo = (Prestamo) obj;
        return ID_prestamo == prestamo.ID_prestamo;
    }

    @Override
    public String toString() {
        if (fecha_devolucion != null) {
            return ""+ID_prestamo+", "+usuario+", "+ejemplar+", "+fecha_inicio+", "+fecha_devolucion;
        } else {
            return ""+ID_prestamo+", "+usuario+", "+ejemplar+", "+fecha_inicio+", "+"No devuelto";
        }
    }

//Otros metodos de la clase Prestamo
    //Metodo que usaremos para comprobar si un prestamo ha sido o no devuelto
    public String comprobarDevolucion(){
        if (fecha_devolucion != null) {
            return "El préstamo con ID " + ID_prestamo + " ha sido devuelto el " + fecha_devolucion + "."; //Si esta devuelto, muestra la fecha en la que se ha devuelto
        } else {
            return "El préstamo con ID " + ID_prestamo + " no ha sido devuelto aún."; //Si no esta devuelto, muestra que no se ha devuelto
        }
    }
    //Metodo que usaremos para saber cuanto tiempo ha pasado desde que se dio el prestamo hasta que se devolvio
    public long calcularTiempoPretamo(){
        if (fecha_devolucion != null && fecha_inicio != null) {
            long tiempoInicio = fecha_inicio.getTime();
            long tiempoDevolucion = fecha_devolucion.getTime();
            return tiempoDevolucion - tiempoInicio; //Calculamos el tiempo que ha durado el prestamo restando la fecha de inicio a la fecha de devolucion
        } else {
            System.out.println("No se puede calcular el tiempo del préstamo porque alguna de las fechas es nula.");
            return 0;
        }
    }

}