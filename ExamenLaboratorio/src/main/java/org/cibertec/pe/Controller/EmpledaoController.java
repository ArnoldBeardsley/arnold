package org.cibertec.pe.Controller;

import java.util.List;

import org.cibertec.pe.modelo.Empleado;
import org.cibertec.pe.servicio.EmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EmpledaoController {
	@Autowired
	private EmpleadoServicio emSer;
	
	@GetMapping("/listar")
	public String Listado (Model m) {
		List<Empleado> emple = emSer.listadoEmpleado();
		m.addAttribute("empleado", emple);
		m.addAttribute("total", emple.size());
		return "listado";
	}
	@GetMapping("/agregar")
	public String Agregar ( Model m) {
		return "agregar";
	}
	
	@PostMapping("/salvar")
	public String salvar ( Empleado e, Model m) {
		emSer.AgregarEmpledao(e);
		return "redirect:/listar";
	}
}
