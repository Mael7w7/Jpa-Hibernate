package coma.angelcode.jpaPratica;

import coma.angelcode.jpaPratica.entities.CategoryEntity;
import coma.angelcode.jpaPratica.entities.ProductEntity;
import coma.angelcode.jpaPratica.entities.SupplierEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaPraticaApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(JpaPraticaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {



	}
}
