package be.phw.httpdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
public class HttpDemoApplication {

	// port to listen connection
	static final int PORT = 8081;

	// verbose mode
	static final boolean verbose = true;

	public static void main(String[] args) {
		SpringApplication.run(HttpDemoApplication.class, args);
		httpServer(args);
	}

	public static void httpServer(String[] args) {
	}

}
