package advicenow.domain.message;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, String> {

	Message findByMessageId(Long messageId);

	List<Message> findByAdviceId(Long adviceId);

}
