package autbuska.stanica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class StanicaApplication 
	extends SpringBootServletInitializer {

	public static void main(String[] args) {
		 SpringApplication.run(StanicaApplication.class, args);
	}

}
