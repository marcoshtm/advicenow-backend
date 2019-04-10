package advicenow.domain.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserRepository repository;
	
	//http://localhost:8080/user
	//http://localhost:8080/user?name=Lisa
	@RequestMapping("/user")
    public User getUser(@RequestParam(value="name", defaultValue="Lisa") String name) {
		return this.repository.findByFirstName(name);
    }
}