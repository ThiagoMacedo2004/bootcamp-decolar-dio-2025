package dio.java;

import org.hibernate.id.factory.IdentifierGeneratorFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//@EntityScan("dio.java.domain.model")
//@EnableJpaRepositories("dio.java.domain.repository")
@SpringBootApplication
@ComponentScan(basePackages = {
		"dio.java.domain.repository",
		"dio.java.controller",
		"dio.java.domain.model",
		"dio.java.service"
})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
