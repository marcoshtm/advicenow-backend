package advicenow.domain.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class ApplicationRunner implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Override
	public void run(String... args) throws Exception {
		userService.createSampleUsers();
	}

	public static void main(String[] args) {
		SpringApplication.run(ApplicationRunner.class, args);
	}
}
