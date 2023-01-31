package online.market.uz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"online.market.uz.service"})
public class OnlineMarketServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineMarketServerApplication.class, args);
	}

}
