package com.example.demo.medica.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.medica.modelo.Medico;
import com.example.demo.medica.repository.IMedicoRepository;

@Service
public class MedicoServiceImpl implements IMedicoService {

	@Autowired
	private IMedicoRepository medicoRepository;

	@Override
	public void agregar(Medico medico) {
		// TODO Auto-generated method stub
		this.medicoRepository.insertar(medico);
	}

	@Override
	public void remover(String cedula) {
		// TODO Auto-generated method stub
		this.medicoRepository.eliminar(cedula);
	}

}
