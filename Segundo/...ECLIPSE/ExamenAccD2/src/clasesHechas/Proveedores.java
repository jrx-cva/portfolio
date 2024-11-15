package clasesHechas;
import java.io.Serializable;

/**
 * Model class of proveedores.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Proveedores implements Serializable {
	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** id. */
	private Integer id;

	/** empresa. */
	private String empresa;

	/** contacto. */
	private String contacto;

	/**
	 * Constructor.
	 */
	public Proveedores() {
	}

	/**
	 * Set the id.
	 * 
	 * @param id
	 *            id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Get the id.
	 * 
	 * @return id
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * Set the empresa.
	 * 
	 * @param empresa
	 *            empresa
	 */
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	/**
	 * Get the empresa.
	 * 
	 * @return empresa
	 */
	public String getEmpresa() {
		return this.empresa;
	}

	/**
	 * Set the contacto.
	 * 
	 * @param contacto
	 *            contacto
	 */
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	/**
	 * Get the contacto.
	 * 
	 * @return contacto
	 */
	public String getContacto() {
		return this.contacto;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Proveedores other = (Proveedores) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
}
