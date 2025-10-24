package coma.angelcode.jpaPratica;

import coma.angelcode.jpaPratica.entities.CustomerEntity;
import coma.angelcode.jpaPratica.entities.HotelEntity;
import coma.angelcode.jpaPratica.entities.ReservationEntity;
import coma.angelcode.jpaPratica.entities.RoomEntity;
import coma.angelcode.jpaPratica.repositories.CustomerRepository;
import coma.angelcode.jpaPratica.repositories.HotelRepository;
import coma.angelcode.jpaPratica.repositories.ReservationRepository;
import coma.angelcode.jpaPratica.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class JpaPraticaApplication implements CommandLineRunner {
	@Autowired
	HotelRepository hotelRepo;
	@Autowired
	ReservationRepository reservationRepo;
	@Autowired
	RoomRepository roomRepo;
	@Autowired
	CustomerRepository customerRepo;

	public static void main(String[] args) {
		SpringApplication.run(JpaPraticaApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		// Crear hotel
		HotelEntity hotel = new HotelEntity();
		hotel.setHotelName("Hotel Andino");
		hotel.setHotelAddress("Av. Los Próceres 250, Lima");
		hotel.setPhoneNumber("987654321");
		hotelRepo.save(hotel);

		// Crear habitación
		RoomEntity room = new RoomEntity();
		room.setPrice(new BigDecimal("420.00"));
		room.setType("Matrimonial");
		room.setNumber("334");
		roomRepo.save(room);


		// Crear cliente
		CustomerEntity customer = new CustomerEntity();
		customer.setCustomerName("Ángel Hidalgo");
		customer.setEmail("angel@example.com");
		customer.setPhoneNumber("994585708");
		customerRepo.save(customer);

		// Crear reserva
		ReservationEntity reservation = new ReservationEntity();
		reservation.setStartDate(LocalDate.of(2025, 11, 10));
		reservation.setEndDate(LocalDate.of(2025, 11, 14));
		reservation.setRoomEntity(room);
		reservation.setCustomerEntity(customer);
		reservationRepo.save(reservation);

		System.out.println("✅ Datos insertados correctamente");



	}
}
