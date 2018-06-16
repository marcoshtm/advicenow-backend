package advicenow.domain.advice;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

public class Advice {
	@Id
    private final Long adviceId;
    private final Long askUserId;
    private final Long giveUserId;
    private final AdviceStatus status;
    private final AdviceEvaluation evaluation;
    private final LocalDateTime creationDate;
    private final LocalDateTime closedDate;
    
    public Advice(Long adviceId, Long askUserId, Long giveUserId, AdviceStatus status, AdviceEvaluation evaluation, LocalDateTime creationDate, LocalDateTime closedDate) {
        this.adviceId = adviceId;
        this.askUserId = askUserId;
        this.giveUserId = giveUserId;
        this.status = status;
        this.evaluation = evaluation;
        this.creationDate = creationDate;
        this.closedDate = closedDate;
    }
    
	@Override
	public String toString() {
		return String.format("User[adviceId=%s, askUserId=%s, giveUserId=%s, status='%s', evaluation='%s', creationDate='%s', closedDate='%s']", 
				this.adviceId, this.askUserId, this.giveUserId, this.status, this.evaluation, this.creationDate, this.closedDate);
	}
}