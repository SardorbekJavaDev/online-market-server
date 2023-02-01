package online.market.uz;

import online.market.uz.dto.response.BillingInformationResponseDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.time.Instant;
import java.util.UUID;

@SpringBootApplication
@ComponentScan({"online.market.uz.service"})
public class OnlineMarketServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineMarketServerApplication.class, args);
		BillingInformationResponseDTO bb = new BillingInformationResponseDTO();

	}

}
