package models;

public class Profesor {
    /**
     * Atributos profesor
     */
    private Integer idProfesor;//1
    private String nif;//2
    private String especialidad; //3
    private String nombre;//4
    private String telefono;//5


    /**
     * constructor de profesor
     *
     * @param idProfesor
     * @param nif
     * @param especialidad
     * @param nombre
     * @param telefono
     */
    public Profesor(Integer idProfesor, String nif, String especialidad, String nombre, String telefono) {
        this.idProfesor = idProfesor;
        this.nif = nif;
        this.especialidad = especialidad;
        this.nombre = nombre;
        this.telefono = telefono;

    }


    public Profesor() {
        // TODO Auto-generated constructor stub
    }

    //GETTERS Y SETTERS

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }


    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }


    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    //TO STRING
    @Override
    public String toString() {
        return "Profesor [idProfesor=" + idProfesor + ", nif=" + nif + ", especialidad=" + especialidad + ", nombre="
                + nombre + ", telefono=" + telefono + "]";
    }
}


