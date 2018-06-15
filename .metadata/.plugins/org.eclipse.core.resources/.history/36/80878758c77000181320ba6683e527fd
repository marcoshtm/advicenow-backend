package advicenow.domain.message;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

	@Autowired
	private MessageRepository messageRepository;

	private final AtomicLong counter = new AtomicLong();

	public void createSampleMessages() throws Exception {
		this.messageRepository.deleteAll();

		// save a couple of Users
		this.messageRepository.save(MessageMock.getNewMessageFromLouis(counter));
		this.messageRepository.save(MessageMock.getNewMessageFromLisa(counter));

		// fetch all Users
		System.out.println("Message found with findAll():");
		System.out.println("-------------------------------");
		for (Message message : this.messageRepository.findAll()) {
			System.out.println(message);
		}
		System.out.println();

		// fetch an individual User
		System.out.println("User found with findByMessageId(1):");
		System.out.println("--------------------------------");
		System.out.println(this.messageRepository.findByMessageId(new Long(1)));

		System.out.println("Users found with findByAdviceId(1):");
		System.out.println("--------------------------------");
		for (Message message : this.messageRepository.findByAdviceId(new Long(1))) {
			System.out.println(message);
		}
	}
}
