package evolution.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import evolution.entity.AnyEntity;

@Configuration
public class AnyConfiguration {
	// Unlike full @Configuration, lite @Bean methods cannot easily declare inter-bean dependencies. Usually one @Bean method should not invoke another @Bean method when operating in 'lite' mode.
	@Bean
	public AnyEntity anyEntity() {
		AnyEntity anyEntity = new AnyEntity();
		anyEntity.setName("Chen");
		return anyEntity;
	}
}
