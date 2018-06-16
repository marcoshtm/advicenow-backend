package advicenow.domain.advice;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdviceRepository extends MongoRepository<Advice, String> {

	Advice findByAdviceId(Long adviceId);

	List<Advice> findByAskUserId(Long askUserId);

	List<Advice> findByGiveUserId(Long giveUserId);
}
