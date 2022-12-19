package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner; //ejecuta en consola
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.medica.Service.ICitaMedicaService;
import com.example.demo.medica.Service.IMedicoService;
import com.example.demo.medica.Service.IPacienteService;
import com.example.demo.medica.modelo.Medico;
import com.example.demo.medica.modelo.Paciente;

@SpringBootApplication
public class Tarea6Application implements CommandLineRunner {

	@Autowired
	private IPacienteService pacienteService;
	@Autowired
	private IMedicoService medicoService;
	@Autowired
	private ICitaMedicaService citaMedicaService;

	public static void main(String[] args) {
		SpringApplication.run(Tarea6Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		

		// 1

		Paciente paciente = new Paciente();
		paciente.setApellido("Paredes");
		paciente.setCedula("123432423423423234");
		paciente.setNombre("Juan Carlos");
		paciente.setTipo("N"); 

		pacienteService.guardar(paciente);

		//paciente tercera edad
		paciente.setTipo("TE");
		paciente.setApellido("Gonzalez");

		pacienteService.modificar(paciente);

		// 2 Medico crear
		Medico medico = new Medico();
		medico.setApellido("Morales");
		medico.setCedula("123423424234");
		medico.setEspecialidad("cardiologia");
		medico.setNombre("Andres");

		medicoService.agregar(medico);

		// 3
		this.citaMedicaService.agendar("123432423423423234", "123423424234", LocalDateTime.of(2022, 12, 17, 18, 05));
	}

}
