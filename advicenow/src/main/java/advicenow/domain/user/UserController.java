package advicenow.domain.user;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserRepository repository;
	
	private final AtomicLong counter = new AtomicLong();
    
	@RequestMapping("/user")
    public User getUser(@RequestParam(value="name", defaultValue="World") String name) {
        //return UserMock.getNewUserMockLouis(counter);
		return this.repository.findByFirstName("Lisa");
    }
}