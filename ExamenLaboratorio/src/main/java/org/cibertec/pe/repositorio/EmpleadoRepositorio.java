package org.cibertec.pe.repositorio;

import org.cibertec.pe.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio  extends JpaRepository<Empleado, String>{

}
