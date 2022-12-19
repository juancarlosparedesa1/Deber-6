package com.example.demo.medica.Service;

import com.example.demo.medica.modelo.Paciente;

public interface IPacienteService {

	public void guardar(Paciente paciente);

	public void modificar(Paciente paciente);

	public Paciente buscar(String cedula);

	public void quitar(String cedula);

}
