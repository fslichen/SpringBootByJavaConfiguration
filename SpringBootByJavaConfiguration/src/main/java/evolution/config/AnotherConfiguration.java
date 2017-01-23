package evolution.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import evolution.entity.AnotherEntity;

@Configuration
public class AnotherConfiguration {
	@Bean
	public AnotherEntity anotherEntity() {
		AnotherEntity anotherEntity = new AnotherEntity();
		anotherEntity.setName("Chen");
		return anotherEntity;
	}
}
