package advicenow.domain.user;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoApplicationRunner implements CommandLineRunner {

	@Autowired
	private UserRepository repository;

	private final AtomicLong counter = new AtomicLong();
	
	@Override
	public void run(String... args) throws Exception {
		this.repository.deleteAll();
		
		// save a couple of Users
		this.repository.save(UserMock.getNewUserMockLouis(counter));
		this.repository.save(UserMock.getNewUserMockLisa(counter));

		// fetch all Users
		System.out.println("Users found with findAll():");
		System.out.println("-------------------------------");
		for (User User : this.repository.findAll()) {
			System.out.println(User);
		}
		System.out.println();

		// fetch an individual User
		System.out.println("User found with findByFirstName('Louis'):");
		System.out.println("--------------------------------");
		System.out.println(this.repository.findByFirstName("Louis"));

		System.out.println("Users found with findByLastName('Blevers'):");
		System.out.println("--------------------------------");
		for (User User : this.repository.findByLastName("Blevers")) {
			System.out.println(User);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(MongoApplicationRunner.class, args);
	}

}
