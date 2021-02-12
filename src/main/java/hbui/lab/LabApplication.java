package hbui.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LabApplication {

	private static final Logger log = LoggerFactory.getLogger(LabApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LabApplication.class, args);
	}

	/**
	@Bean
	public CommandLineRunner demo(BuddyInfoRepo repository) {
		return (args) -> {
			// save a few customers
			repository.save(new BuddyInfo("Jack", "112 Bean St.", "1234567890"));
			repository.save(new BuddyInfo("Chloe", "999 Silver Ave.", "0987654321"));
			repository.save(new BuddyInfo("Nick", "123 Bauer Cres.", "9998887654"));
			repository.save(new BuddyInfo("Davis", "876 Palm Rd.","1238904567"));
			repository.save(new BuddyInfo("Zaun", "1 Deer Rd.", "8765431290"));

			// fetch all Buddies
			log.info("Buddy found with findAll():");
			log.info("-------------------------------");
			for (BuddyInfo bud : repository.findAll()) {
				log.info(bud.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			BuddyInfo bud = repository.findById(1L);
			log.info("Buddy found with findById(1L):");
			log.info("--------------------------------");
			log.info(bud.toString());
			log.info("");

			// fetch customers by last name
			log.info("Buddy found with findByName('Jack'):");
			log.info("--------------------------------------------");
			repository.findByName("Jack").forEach(bauer -> {
				log.info(bauer.toString());
			});
			log.info("");
		};
	}
	*/
	/**
	@Bean
	public CommandLineRunner demo(AddressBookRepo repository) {
		return (args) -> {
			// save an addressbook
			AddressBook book = new AddressBook();
			book.addBud(new BuddyInfo("Jack", "112 Bean St.", "1234567890"));
			book.addBud(new BuddyInfo("Chloe", "999 Silver Ave.", "0987654321"));
			book.addBud(new BuddyInfo("Nick", "123 Bauer Cres.", "9998887654"));
			book.addBud(new BuddyInfo("Davis", "876 Palm Rd.","1238904567"));
			book.addBud(new BuddyInfo("Zaun", "1 Deer Rd.", "8765431290"));
			repository.save(book);
			// fetch an individual customer by ID
			AddressBook new_book = repository.findById(1L);
			log.info("Book found with findById(1L):");
			log.info("--------------------------------");
			log.info(new_book.toString());
			log.info("");
		};
	}
	**/
}