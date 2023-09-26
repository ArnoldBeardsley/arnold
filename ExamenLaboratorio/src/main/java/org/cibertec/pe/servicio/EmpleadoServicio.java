package org.cibertec.pe.servicio;

import java.util.List;

import org.cibertec.pe.modelo.Empleado;
import org.cibertec.pe.repositorio.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmpleadoServicio implements EmpleadoInterface{
	@Autowired
	private EmpleadoRepositorio emple;
	@Override
	public List<Empleado> listadoEmpleado() {
		return (List<Empleado>) emple.findAll();
	}

	@Override
	public int AgregarEmpledao(Empleado emp) {
		int res = 0;
		Empleado em = emple.save(emp);
		if(em.equals(null)) res =1;
		return res;
	}

}
