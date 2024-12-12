package acc.br.projetoUM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
public class ProjetoDoisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoDoisApplication.class, args);
	}

}
