package advicenow.domain.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserRepository repository;
	
	@RequestMapping("/user")
    public User getUser(@RequestParam(value="name", defaultValue="Lisa") String name) {
		return this.repository.findByFirstName(name);
    }
}