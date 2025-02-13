package org.karrabo.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.pulsar.annotation.EnablePulsar;

@EnablePulsar
@SpringBootApplication
public class KarraboNotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarraboNotificationServiceApplication.class, args);
	}

}
