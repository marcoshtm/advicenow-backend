package advicenow.domain.user;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

public class UserMock {
	public static User getNewUserMock(AtomicLong counter) {
		return new User(counter.incrementAndGet(),
						"Louis", 
						"Blevers", 
						"user@email.com", 
						"5551999448092",
						'F',
						LocalDateTime.now(),
						LocalDateTime.now()
						);
	}
}
