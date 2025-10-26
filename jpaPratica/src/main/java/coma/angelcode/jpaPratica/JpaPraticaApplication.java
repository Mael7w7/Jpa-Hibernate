package coma.angelcode.jpaPratica;


import coma.angelcode.jpaPratica.entities.DoctorEntity;
import coma.angelcode.jpaPratica.entities.PatientEntity;
import coma.angelcode.jpaPratica.entities.PrescriptionEntity;
import coma.angelcode.jpaPratica.entities.QuoteEntity;
import coma.angelcode.jpaPratica.repositories.DoctorRepository;
import coma.angelcode.jpaPratica.repositories.PatientRepository;
import coma.angelcode.jpaPratica.repositories.PrescriptionRepository;
import coma.angelcode.jpaPratica.repositories.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.Month;


@SpringBootApplication
public class JpaPraticaApplication implements CommandLineRunner {
	@Autowired
	private DoctorRepository doctorRepository;

	@Autowired
	private PatientRepository patientRepository;

	@Autowired
	private PrescriptionRepository prescriptionRepository;

	@Autowired
	private QuoteRepository quoteRepository;


	public static void main(String[] args) {
		SpringApplication.run(JpaPraticaApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		//Creamos un doctor
		DoctorEntity doctor = DoctorEntity.builder()
				.doctorName("Angel Hidalgo")
				.phoneNumber("98765432")
				.speciality("Traumatologia")
				.build();

		doctorRepository.save(doctor);

		//Creamos un Paciente

		PatientEntity patient = PatientEntity.builder()
				.PatientName("Camila Ramirez")
				.dni("74635263")
				.dateOfBirth(LocalDate.of(1980, Month.AUGUST, 20))
				.phoneNumber("987654321")
				.build();
		patientRepository.save(patient);


		//Creamos un Cita

		QuoteEntity quote = QuoteEntity.builder()
				.date(LocalDate.of(2002,Month.JULY,20))
				.description("Cita medica por dolor de poto")
				.patientEntity(patient)
				.doctorEntity(doctor)
				.build();
		quoteRepository.save(quote);


		//Creamos una receta
		PrescriptionEntity prescription = PrescriptionEntity.builder()
				.description("X3 PARACETAMOL")
				.issueDate(LocalDate.of(2009,Month.AUGUST,17))
				.quoteEntity(quote)
				.build();

		System.out.println("✅ Datos insertados correctamente.");


	}
}

