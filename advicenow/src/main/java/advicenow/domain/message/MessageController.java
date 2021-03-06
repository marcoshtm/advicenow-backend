package advicenow.domain.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@Autowired
	private MessageRepository repository;
	
	@RequestMapping("/message")
    public Message findByMessageId(@RequestParam(value="messageId") String messageId) {
		return this.repository.findByMessageId(Long.parseLong(messageId));
    }
	
	@RequestMapping("/messages")
    public List<Message> findByAdviceId(@RequestParam(value="adviceId") String adviceId) {
		return this.repository.findByAdviceId(Long.parseLong(adviceId));
    }
}