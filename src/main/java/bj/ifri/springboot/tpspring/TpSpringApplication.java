package bj.ifri.springboot.tpspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TpSpringApplication {


	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(TpSpringApplication.class, args);
	}
}
