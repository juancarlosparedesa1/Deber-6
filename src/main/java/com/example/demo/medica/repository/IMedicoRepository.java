package com.example.demo.medica.repository;

import com.example.demo.medica.modelo.Medico;

public interface IMedicoRepository {

	public void insertar(Medico medico);

	public void eliminar(String cedula);

	public Medico buscar(String cedula);

}
