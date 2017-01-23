package evolution.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AppleEntity {
	private String name;
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("AppleEntity : The postConstruct method has been called.");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("AppleEntity : The preDestroy method has been called.");
	}
}
