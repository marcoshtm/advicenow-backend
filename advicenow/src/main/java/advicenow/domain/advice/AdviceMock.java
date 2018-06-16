package advicenow.domain.advice;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

public class AdviceMock {
	public static Advice getAdvice(AtomicLong counter) {
		return new Advice(counter.incrementAndGet(),
							new Long(1), 
							new Long(2), 
							AdviceStatus.OPEN,
							AdviceEvaluation.LIKE,
							LocalDateTime.now(),
							LocalDateTime.now()
							);
	}
}
