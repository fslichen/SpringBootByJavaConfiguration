package evolution.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import evolution.entity.AnyEntity;
import evolution.entity.TheOtherEntity;

@Configuration
public class AnyConfiguration {
	// Unlike full @Configuration, lite @Bean methods cannot easily declare inter-bean dependencies. Usually one @Bean method should not invoke another @Bean method when operating in 'lite' mode.
	@Bean
	public AnyEntity anyEntity() {
		AnyEntity anyEntity = new AnyEntity();
		anyEntity.setName("Chen");
		return anyEntity;
	}
	
	@Bean
	@Scope("prototype")// You can customize the scope in this way, the default scope is singleton.
	public TheOtherEntity theOtherEntity() {
		TheOtherEntity theOtherEntity = new TheOtherEntity();
		theOtherEntity.setName("Chen");
		return theOtherEntity;
	}
}
