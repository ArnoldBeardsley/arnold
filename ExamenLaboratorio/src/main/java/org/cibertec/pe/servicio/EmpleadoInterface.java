package org.cibertec.pe.servicio;

import java.util.List;

import org.cibertec.pe.modelo.Empleado;

public interface EmpleadoInterface {
	public List<Empleado> listadoEmpleado();
	public int AgregarEmpledao(Empleado emp); 
}
