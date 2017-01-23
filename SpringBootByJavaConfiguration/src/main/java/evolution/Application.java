package evolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import evolution.entity.AnotherEntity;
import evolution.entity.AnyEntity;
import evolution.entity.AppleEntity;
import evolution.entity.TheOtherEntity;

@SpringBootApplication// It automatically scans all the java configurations under evolution package.
public class Application implements CommandLineRunner {
	@Autowired
	AnyEntity anyEntity;
	
	@Autowired
	AnotherEntity anotherEntity;
	
	@Autowired
	TheOtherEntity theOtherEntity;
	
	@Autowired
	AppleEntity appleEntity;
	
	public void run(String... args) throws Exception {
		System.out.println(anyEntity);
		System.out.println(anotherEntity);
		System.out.println(theOtherEntity);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
