package org.ENSAJ;
import org.ENSAJ.Model.Voiture;
import org.ENSAJ.Repository.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;

@EnableFeignClients
@SpringBootApplication
public class VoitureApplication {
	private VoitureRepository voitureRepository;
	private ClientService clientService;
	public static void main(String[] args) {
		SpringApplication.run(VoitureApplication.class, args);
	}
	@FeignClient(name="SERVICE-CLIENT")
	interface ClientService{
		@GetMapping(path="/clients/{id}")
		public Client clientById(@PathVariable Long id);
	}


    @Transactional
    @Bean
    CommandLineRunner initializeDatabase(VoitureRepository voitureRepository, ClientService clientService) {
        return args -> {
            Client c1 = clientService.clientById(2L);
            Client c2 = clientService.clientById(1L);
            voitureRepository.save(new Voiture(1L, "Jeep", "A 25643", "654", c2));
            voitureRepository.save(new Voiture(3L, "Peugeot", "A 56899", "301", c1));
        };

	}


}
