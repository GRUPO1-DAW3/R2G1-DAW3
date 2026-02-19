public class Tipos_penalizaciones{
//Atributos de la clase Tipos_penalizaciones
    private int ID_tipo_penalizacion;
    private Penalizaciones penalizacion;
    private String gravedad;
    private int dias_bloqueo;
    private String fecha_inicio;
    private String fecha_fin;
    private String motivo;

//metodo constructor de la clase Tipos_penalizaciones
    public Tipos_penalizaciones(int pID_tipo_penalizacion, Penalizaciones pPenalizacion, String pGravedad, int pDias_bloqueo, String pFecha_inicio, String pFecha_fin, String pMotivo){
        this.ID_tipo_penalizacion=pID_tipo_penalizacion;
        this.penalizacion=pPenalizacion;
        this.gravedad=pGravedad;
        this.dias_bloqueo=pDias_bloqueo;
        this.fecha_inicio=pFecha_inicio;
        this.fecha_fin=pFecha_fin;
        this.motivo=pMotivo;
    }

//Getters de la clase tipos_penalizaciones
    public int getID_tipo_penalizacion(){
        return ID_tipo_penalizacion;
    }
    public Penalizaciones getPenalizacion(){
        return penalizacion;
    }
    public String getGravedad(){
        return gravedad;
    }
    public int getDias_bloqueo(){
        return dias_bloqueo;
    }
    public String getFecha_inicio(){
        return fecha_inicio;
    }
    public String getFecha_fin(){
        return fecha_fin;
    }
    public String getMotivo(){
        return motivo;
    }

//Setters de la clase tipos_penalizaciones
    public void setID_tipo_penalizacion(int pID_tipo_penalizacion){
        this.ID_tipo_penalizacion=pID_tipo_penalizacion;
    }

    public void setPenalizacion(Penalizaciones pPenalizacion){
        this.penalizacion=pPenalizacion;
    }

    public void setGravedad(String pGravedad){
        this.gravedad=pGravedad;
    }

    public void setDias_bloqueo(int pDias_bloqueo){
        this.dias_bloqueo=pDias_bloqueo;
    }

    public void setFecha_inicio(String pFecha_inicio){
        this.fecha_inicio=pFecha_inicio;
    }

    public void setFecha_fin(String pFecha_fin){
        this.fecha_fin=pFecha_fin;
    }

    public void setMotivo(String pMotivo){
        this.motivo=pMotivo;
    }

//Equals y toString de la clase tipos_penalizaciones
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tipos_penalizaciones that = (Tipos_penalizaciones) obj;
        return ID_tipo_penalizacion == that.ID_tipo_penalizacion;
    }

    @Override
    public String toString() {
        return ""+ID_tipo_penalizacion+", "+penalizacion+", "+gravedad+", "+dias_bloqueo+", "+fecha_inicio+", "+fecha_fin+", "+motivo;
    }
}