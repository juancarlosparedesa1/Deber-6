package com.example.demo.medica.Service;

import com.example.demo.medica.modelo.Medico;

public interface IMedicoService {

	public void agregar(Medico medico);

	public void remover(String cedula);
}
