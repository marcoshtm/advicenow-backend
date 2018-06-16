package advicenow.domain.advice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationRunner implements CommandLineRunner {

	@Autowired
	private AdviceService adviceService;

	@Override
	public void run(String... args) throws Exception {
		adviceService.createSampleAdvice();
	}

	public static void main(String[] args) {
		SpringApplication.run(ApplicationRunner.class, args);
	}
}
