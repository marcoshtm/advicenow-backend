package advicenow.domain.user;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	private final AtomicLong counter = new AtomicLong();

	public void createSampleUsers() throws Exception {
		this.userRepository.deleteAll();

		// save a couple of Users
		this.userRepository.save(UserMock.getNewUserMockLouis(counter));
		this.userRepository.save(UserMock.getNewUserMockLisa(counter));

		// fetch all Users
		System.out.println("Users found with findAll():");
		System.out.println("-------------------------------");
		for (User User : this.userRepository.findAll()) {
			System.out.println(User);
		}
		System.out.println();

		// fetch an individual User
		System.out.println("User found with findByFirstName('Louis'):");
		System.out.println("--------------------------------");
		System.out.println(this.userRepository.findByFirstName("Louis"));

		System.out.println("Users found with findByLastName('Blevers'):");
		System.out.println("--------------------------------");
		for (User User : this.userRepository.findByLastName("Blevers")) {
			System.out.println(User);
		}
	}
}
