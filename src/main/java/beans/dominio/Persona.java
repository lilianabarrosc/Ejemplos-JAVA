package beans.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//no es necesario nombrar la tabla si la clase se llama igual
@Table(name="persona")
public class Persona {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) //generacion de la llave primaria, IDENTITY = autoincrementable
	@Column(name="id_persona") //nombre de la columna
	private Integer idPersona; //el jpa guardara el valor de la columna en este atributo
	
	//en este caso el nombre del atributo es igual al nombre de la columna de la bd,
	//por lo que no es necesario especificar el nombre
	@Column(nullable = false, length = 45) 											
	private String nombre;
	
	@Column(name = "apellido_paterno", nullable = false, length = 45)
	private String apePaterno;
	
	@Column(name = "apellido_materno", length = 45)
	private String apeMaterno;
	
	@Column(nullable = false, length = 45)
	private String email;
	
	@Column(length = 45)
	private String telefono;
	
	/*constructores*/
	
	//este constructor es utilizado por jpa
	public Persona() {}
	
	public Persona(Integer idPersona) {
		super();
		this.idPersona = idPersona;
	}
	
	public Persona(String nombre, String apePaterno, String apeMaterno, String email,
			String telefono) {
		super();
		this.nombre = nombre;
		this.apePaterno = apePaterno;
		this.apeMaterno = apeMaterno;
		this.email = email;
		this.telefono = telefono;
	}

	/*Setter's and Getter's*/
	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApePaterno() {
		return apePaterno;
	}

	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	public String getApeMaterno() {
		return apeMaterno;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apePaterno=" + apePaterno + ", apeMaterno="
				+ apeMaterno + ", email=" + email + ", telefono=" + telefono + "]";
	}
	
}
