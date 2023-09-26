package org.cibertec.pe.modelo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {

	@Id
	@Column(name = "idempleado")
	private String Id;
	private String Apellidos;
	private String Nombres;
	private int  Edad;
	private char Sexo;
	private int Salario;

	public Empleado() {
	}
	
	public Empleado(String id, String apellidos, String nombres, int edad, char sexo, int salario) {
		Id = id;
		Apellidos = apellidos;
		Nombres = nombres;
		Edad = edad;
		Sexo = sexo;
		Salario = salario;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public char getSexo() {
		return Sexo;
	}
	public void setSexo(char sexo) {
		Sexo = sexo;
	}
	public int getSalario() {
		return Salario;
	}
	public void setSalario(int salario) {
		Salario = salario;
	}
	
	
}
