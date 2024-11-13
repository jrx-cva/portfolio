package Models;

/*
 * En esta clase tendremos los datos de los Usuarios de la aplicación
 */
public class Usuario {
	
	/**
	 * Atributos Usuario
	 */
	private Integer id_usuario;//1
	private Integer id_concesionario;//2
	private String nombre_usuario; //3
	private String contrasenia;//4
	private Integer antiguedad;//5
	private Integer sueldo;//6
	private String tipo_contrato;//7
	private String nif_usuario;//8
	private String email_usuario;//9
	private String estudios;//10
	private RolUsuario rol;
	
	/**
	 * Constructor Usuario
	 * @param id_usuario
	 * @param id_concesionario
	 * @param nombre_usuario
	 * @param contrasenia
	 * @param antiguedad
	 * @param sueldo
	 * @param tipo_contrato
	 * @param nif_usuario
	 * @param email_usuario
	 * @param estudios
	 */
	public Usuario(Integer id_usuario, Integer id_concesionario, String nombre_usuario, String contrasenia, Integer antiguedad,
				Integer sueldo, String tipo_contrato, String nif_usuario, String email_usuario, String estudios, RolUsuario rol) {
		
		this.id_usuario = id_usuario;
		this.id_concesionario = id_concesionario;
		this.nombre_usuario = nombre_usuario;
		this.contrasenia = contrasenia;
		this.antiguedad = antiguedad;
		this.sueldo = sueldo;
		this.tipo_contrato = tipo_contrato;
		this.nif_usuario = nif_usuario;
		this.email_usuario = email_usuario;
		this.estudios = estudios;
		this.rol.compareTo(rol);
		
	}

	public Usuario() {
	}


	/**
	 * Getter id_usuario
	 * @return
	 */
	public Integer getId_usuario() {
		return id_usuario;
	}

	/**
	 * setter id_usuario
	 * @param id_usuario
	 */
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Integer getId_concesionario() {
		return id_concesionario;
	}

	public void setId_concesionario(Integer id_concesionario) {
		this.id_concesionario = id_concesionario;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Integer getSueldo() {
		return sueldo;
	}

	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}

	public String getTipo_contrato() {
		return tipo_contrato;
	}

	public void setTipo_contrato(String tipo_contrato) {
		this.tipo_contrato = tipo_contrato;
	}

	public String getNif_usuario() {
		return nif_usuario;
	}

	public void setNif_usuario(String nif_usuario) {
		this.nif_usuario = nif_usuario;
	}

	public String getEmail_usuario() {
		return email_usuario;
	}

	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	public RolUsuario getRol() {
		return rol;
	}

	public void setRol(RolUsuario rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", id_concesionario=" + id_concesionario + ", nombre_usuario="
				+ nombre_usuario + ", contrasenia=" + contrasenia + ", antiguedad=" + antiguedad + ", sueldo=" + sueldo
				+ ", tipo_contrato=" + tipo_contrato + ", nif_usuario=" + nif_usuario + ", email_usuario="
				+ email_usuario + ", estudios=" + estudios + ", rol=" + rol + "]";
	}

}
