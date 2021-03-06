package advicenow.domain.message;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

public class Message {
	@Id
    private final Long messageId;
    private final Long adviceId;
    private final Long userId;
    private final LocalDateTime creationDate;
    private final String message;
    
    public Message(Long messageId, Long adviceId, Long userId, LocalDateTime creationDate, String message) {
        this.messageId = messageId;
        this.adviceId = adviceId;
        this.userId = userId;
        this.creationDate = creationDate;
        this.message = message;
    }
    
	public Long getMessageId() {
		return messageId;
	}

	public Long getAdviceId() {
		return adviceId;
	}

	public Long getUserId() {
		return userId;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return String.format("User[messageId=%s, adviceId=%s, userId=%s, creationDate='%s', message='%s']", 
				this.messageId, this.adviceId, this.userId, this.creationDate, this.message);
	}
}