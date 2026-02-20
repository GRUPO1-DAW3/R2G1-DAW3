public class Usuario {
//Atributos de la clase Usuario
    private int ID_usuario;
    private String DNI;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
    private int telefono;
    private String nombre_usuario;
    private String contraseña;
    private String tipo_usuario;
    private String seguridad_social;

//Metodo constructor de la clase Usuario
    public Usuario(int pID_usuario, String pDNI, String pNombre, String pApellido1, String pApellido2, String pEmail, int pTelefono, String pNombre_usuario, String pContraseña, String pTipo_usuario, String pSeguridad_social){
        this.ID_usuario=pID_usuario;
        this.DNI=pDNI;
        this.nombre=pNombre;
        this.apellido1=pApellido1;
        this.apellido2=pApellido2;
        this.email=pEmail;
        this.telefono=pTelefono;
        this.nombre_usuario=pNombre_usuario;
        this.contraseña=pContraseña;
        this.tipo_usuario=pTipo_usuario;
        this.seguridad_social=pSeguridad_social;
    }

//Getter de la clase Usuario
    public int getID_usuario(){
        return ID_usuario;
    }
    public String getDNI(){
        return DNI;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido1(){
        return apellido1;
    }
    public String getApellido2(){
        return apellido2;
    }
    public String getEmail(){
        return email;
    }
    public int getTelefono(){
        return telefono;
    }
    public String getNombre_usuario(){
        return nombre_usuario;
    }
    public String getContraseña(){
        return contraseña;
    }
    public String getTipo_usuario(){
        return tipo_usuario;
    }
    public String getSeguridad_social(){
        return seguridad_social;
    }
//Setters de la clase Usuario
    public void setID_usuario(int pID_usuario){
        this.ID_usuario=pID_usuario;
    }
    public void setDNI(String pDNI){
        this.DNI=pDNI;
    }
    public void setNombre(String pNombre){
        this.nombre=pNombre;
    }
    public void setApellido1(String pApellido1){
        this.apellido1=pApellido1;
    }
    public void setApellido2(String pApellido2){
        this.apellido2=pApellido2;
    }
    public void setEmail(String pEmail){
        this.email=pEmail;
    }
    public void setTelefono(int pTelefono){
        this.telefono=pTelefono;
    }
    public void setNombre_usuario(String pNombre_usuario){
        this.nombre_usuario=pNombre_usuario;
    }
    public void setContraseña(String pContraseña){
        this.contraseña=pContraseña;
    }
    public void setTipo_usuario(String pTipo_usuario){
        this.tipo_usuario=pTipo_usuario;
    }
    public void setSeguridad_social(String pSeguridad_social){
        this.seguridad_social=pSeguridad_social;
    }

//Equals y toString de la clase Usuarios
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Usuario usuario = (Usuario) obj;
        return ID_usuario == usuario.ID_usuario;
    }

    @Override
    public String toString() {
        return "" + ID_usuario + ", "+nombre + " " + apellido1 + " " + apellido2 + ", " + email + ", " + telefono + ", " + nombre_usuario + ", " + tipo_usuario;
    }
}
