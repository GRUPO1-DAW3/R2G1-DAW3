public class Prestamos{
//Atributos de la clase Prestamos
    private int ID_prestamo;
    private Usuarios usuario;
    private Ejemplares ejemplar;
    private String fecha_inicio;
    private String fecha_devolucion;

//Metodo constructor de la clase Prestamos
    public Prestamos(int pID_prestamo, Usuarios pUsuario, Ejemplares pEjemplar, String pFecha_inicio, String pFecha_devolucion){
        this.ID_prestamo=pID_prestamo;
        this.usuario=pUsuario;
        this.ejemplar=pEjemplar;
        this.fecha_inicio=pFecha_inicio;
        this.fecha_devolucion=pFecha_devolucion;
    }

//Getters de la clase Prestamos
    public int getID_prestamo(){
        return ID_prestamo;
    }
    public Usuarios getUsuario(){
        return usuario;
    }
    public Ejemplares getEjemplar(){
        return ejemplar;
    }
    public String getFecha_inicio(){
        return fecha_inicio;
    }
    public String getFecha_devolucion(){
        return fecha_devolucion;
    }

//Setters de la clase Prestamos
    public void setID_prestamo(int pID_prestamo){
        this.ID_prestamo=pID_prestamo;
    }
    public void setUsuario(Usuarios pUsuario){
        this.usuario=pUsuario;
    }
    public void setEjemplar(Ejemplares pEjemplar){
        this.ejemplar=pEjemplar;
    }
    public void setFecha_inicio(String pFecha_inicio){
        this.fecha_inicio=pFecha_inicio;
    }
    public void setFecha_devolucion(String pFecha_devolucion){
        this.fecha_devolucion=pFecha_devolucion;
    }

//Equals y toString de la clase Prestamos
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Prestamos prestamos = (Prestamos) obj;
        return ID_prestamo == prestamos.ID_prestamo;
    }

    @Override
    public String toString() {
        if (fecha_devolucion != null) {
            return ""+ID_prestamo+", "+usuario+", "+ejemplar+", "+fecha_inicio+", "+fecha_devolucion;
        } else {
            return ""+ID_prestamo+", "+usuario+", "+ejemplar+", "+fecha_inicio+", "+"No devuelto";
        }
    }
}