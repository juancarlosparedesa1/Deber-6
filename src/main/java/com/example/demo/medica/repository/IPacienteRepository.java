package com.example.demo.medica.repository;

import com.example.demo.medica.modelo.Paciente;

public interface IPacienteRepository {

	// CRUD
	public void insertar(Paciente paciente);

	public Paciente buscar(String cedula);

	public void actualizar(Paciente paciente);

	public void eliminar(String cedula);
}
