package br.com.alura.screensound;

import br.com.alura.screensound.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreensoundApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreensoundApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Verifique se a classe Principal está no pacote correto
		Principal principal = new Principal();
		principal.exibeMenu();
	}

}
