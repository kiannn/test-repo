package repTEST.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
                //=========Thr following changes are made in cloned version===
                short s =2;
                System.out.println("repTEST.demo.DemoApplication.main()");
	}

}
