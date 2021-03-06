package advicenow.domain.user;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

public class UserMock {
	public static User getNewUserMockLouis(AtomicLong counter) {
		return new User(counter.incrementAndGet(),
						"Louis", 
						"Blevers", 
						"louis.blevers@email.com", 
						"5551999448092",
						'F',
						LocalDate.now(),
						LocalDateTime.now(),
						LocalDateTime.now()
						);
	}
	
	public static User getNewUserMockLisa(AtomicLong counter) {
		return new User(counter.incrementAndGet(),
						"Lisa", 
						"Blevers", 
						"lisa.blevers@email.com", 
						"5551998559911",
						'F',
						LocalDate.now(),
						LocalDateTime.now(),
						LocalDateTime.now()
						);
	}
}
