package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BackParametrosApplication {
	
	public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	    return builder.sources(BackParametrosApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BackParametrosApplication.class, args);
		//nuevo
		
		
	}

}
