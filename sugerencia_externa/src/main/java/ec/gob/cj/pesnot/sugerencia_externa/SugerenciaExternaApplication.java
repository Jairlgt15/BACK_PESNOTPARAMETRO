package ec.gob.cj.pesnot.sugerencia_externa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class SugerenciaExternaApplication  extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	    return builder.sources(SugerenciaExternaApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SugerenciaExternaApplication.class, args);
	}

}
