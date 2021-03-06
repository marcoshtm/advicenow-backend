package advicenow.domain.message;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

public class MessageMock {
	public static Message getNewMessageFromLouis(AtomicLong counter) {
		return new Message(counter.incrementAndGet(),
							new Long(1), 
							new Long(1), 
							LocalDateTime.now(),
							"hi i'd like to ask an advice"
							);
	}
	
	public static Message getNewMessageFromLisa(AtomicLong counter) {
		return new Message(counter.incrementAndGet(),
							new Long(1), 
							new Long(2), 
							LocalDateTime.now().plusDays(1),
							"hi here is your advice"
							);
	}
}
