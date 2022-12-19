package com.example.demo.medica.Service;

import java.time.LocalDateTime;

public interface ICitaMedicaService {
	public void agendar(String cedulaPaciente, String cedulaMedico, LocalDateTime fechaCita);
}
