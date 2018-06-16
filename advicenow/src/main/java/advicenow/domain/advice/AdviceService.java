package advicenow.domain.advice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdviceService {

	@Autowired
	private AdviceRepository adviceRepository;

	private final AtomicLong counter = new AtomicLong();

	public void createSampleAdvice() throws Exception {
		this.adviceRepository.deleteAll();

		// save a couple of Advices
		this.adviceRepository.save(AdviceMock.getAdvice(counter));

		// fetch all Users
		System.out.println("Advices found with findAll():");
		System.out.println("-------------------------------");
		for (Advice advice : this.adviceRepository.findAll()) {
			System.out.println(advice);
		}
		System.out.println();

		// fetch an individual Advice
		System.out.println("Advice found with findByAdviceId(1):");
		System.out.println("--------------------------------");
		System.out.println(this.adviceRepository.findByAdviceId(new Long(1)));

		System.out.println("Advices found with findByAskUserId(1):");
		System.out.println("--------------------------------");
		for (Advice advice : this.adviceRepository.findByAskUserId(new Long(1))) {
			System.out.println(advice);
		}
		
		System.out.println("Advices found with findByGiveUserId(2):");
		System.out.println("--------------------------------");
		for (Advice advice : this.adviceRepository.findByGiveUserId(new Long(1))) {
			System.out.println(advice);
		}
	}
}
