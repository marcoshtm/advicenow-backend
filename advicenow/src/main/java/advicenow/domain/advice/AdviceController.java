package advicenow.domain.advice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdviceController {

	@Autowired
	private AdviceRepository repository;
	
	@RequestMapping("/findByAdviceId")
    public Advice findByAdviceId(@RequestParam(value="adviceId") String adviceId) {
		return this.repository.findByAdviceId(Long.parseLong(adviceId));
    }
	
	@RequestMapping("/advicesAsked")
    public List<Advice> findByAskUserId(@RequestParam(value="askUserId") String askUserId) {
		return this.repository.findByAskUserId(Long.parseLong(askUserId));
    }
	
	@RequestMapping("/advicesGived")
    public List<Advice> findByGiveUserId(@RequestParam(value="giveUserId") String giveUserId) {
		return this.repository.findByGiveUserId(Long.parseLong(giveUserId));
    }
}