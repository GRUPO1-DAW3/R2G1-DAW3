public class Penalizaciones {
//Atributos de la clase Penalizaciones
    private int ID_penalizacion;
    private Usuarios usuario;

//metodo constructor de la clase Penalizaciones
    public Penalizaciones(int pID_penalizacion, Usuarios pUsuario){
        this.ID_penalizacion=pID_penalizacion;
        this.usuario=pUsuario;
    }

//Getters de la clase Penalizaciones
    public int getID_penalizacion(){
        return ID_penalizacion;
    }
    public Usuarios getUsuario(){
        return usuario;
    }

//Setters de la clase Penalizaciones
    public void setID_penalizacion(int pID_penalizacion){
        this.ID_penalizacion=pID_penalizacion;
    }
    public void setUsuario(Usuarios pUsuario){
        this.usuario=pUsuario;
    }

//Equals y toString de la clase Penalizaciones
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Penalizaciones penalizaciones = (Penalizaciones) obj;
        return ID_penalizacion == penalizaciones.ID_penalizacion;
    }

    @Override
    public String toString() {
        return ""+ID_penalizacion+", "+usuario;
    }

//Otros metodos de la clase Penalizaciones

    //Metodo para comprobar el usuario asociado a esta penalizacion
    public String comprobarUsuario(){
        if (usuario == null) {
            return "No hay usuario asociado a esta penalización.";
        }else{
            return usuario.getNombre(); //Llamamos al getNombre de la clase usuario para obtener el nombre del usuario asociado a esta penalización
        }
    }
    
}
