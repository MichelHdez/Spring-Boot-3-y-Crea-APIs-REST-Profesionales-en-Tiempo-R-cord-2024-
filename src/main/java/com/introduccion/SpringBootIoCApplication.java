package com.introduccion;

import com.introduccion.repository.ProductRepositoryA;
import com.introduccion.repository.ProductRepositoryB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootIoCApplication  implements CommandLineRunner {

	@Autowired
	private ProductRepositoryA productRepositoryA;

	@Autowired
	private ProductRepositoryB productRepositoryB;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIoCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola mundo con la interfaz CommandLineRunner");
	}

	@Bean
	public CommandLineRunner comandoGenerico(){
		return args -> {
			System.out.println("Hola mundo con la interfaz CommandLineRunner con expresión Lambda");
		};
	}

	@Bean
	public CommandLineRunner comandoUtilizandoAutowired(){
		return args -> {
			System.out.println("PRODUCT REPOSITORY A");
			productRepositoryA.save("Mouse A");
			productRepositoryA.remove("Teclado A");

			System.out.println("PRODUCT REPOSITORY B");
			productRepositoryB.save("Bocinas B");
			productRepositoryB.remove("Monitor B");
		};
	}

}
