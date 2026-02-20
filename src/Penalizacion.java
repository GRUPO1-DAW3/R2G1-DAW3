public class Penalizacion {
//Atributos de la clase Penalizacion
    private int ID_penalizacion;
    private Usuario usuario;

//metodo constructor de la clase Penalizacion
    public Penalizacion(int pID_penalizacion, Usuario pUsuario){
        this.ID_penalizacion=pID_penalizacion;
        this.usuario=pUsuario;
    }

//Getters de la clase Penalizacion
    public int getID_penalizacion(){
        return ID_penalizacion;
    }
    public Usuario getUsuario(){
        return usuario;
    }

//Setters de la clase Penalizacion
    public void setID_penalizacion(int pID_penalizacion){
        this.ID_penalizacion=pID_penalizacion;
    }
    public void setUsuario(Usuario pUsuario){
        this.usuario=pUsuario;
    }

//Equals y toString de la clase Penalizacion
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Penalizacion penalizaciones = (Penalizacion) obj;
        return ID_penalizacion == penalizaciones.ID_penalizacion;
    }

    @Override
    public String toString() {
        return ""+ID_penalizacion+", "+usuario;
    }

//Otros metodos de la clase Penalizacion

    //Metodo para comprobar el usuario asociado a esta penalizacion
    public String comprobarUsuario(){
        if (usuario == null) {
            return "No hay usuario asociado a esta penalización.";
        }else{
            return usuario.getNombre(); //Llamamos al getNombre de la clase usuario para obtener el nombre del usuario asociado a esta penalización
        }
    }

}
