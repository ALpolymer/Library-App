package gr.aueb.cf.libraryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing//Spring Data provides support to keep track of who created an entity, when it got created, when the update happened and by whom.
public class LibraryappApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryappApplication.class, args);
	}

}
