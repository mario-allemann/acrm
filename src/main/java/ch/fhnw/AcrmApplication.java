package ch.fhnw;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.fhnw.data.domain.Agent;
import ch.fhnw.data.repository.AgentRepository;

@SpringBootApplication
public class AcrmApplication {

	@Autowired
	private AgentRepository agentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AcrmApplication.class, args);
	}
	
	@PostConstruct
	private void init() {
		Agent agent = new Agent();
		agent.setEmail("xyz@xyz");
		agent.setName("Hans Wurst");
		
		agentRepository.save(agent);
	}
}
