package Application;

import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootApplication
@ComponentScan(basePackages = {"Application.Controller"})

public class FrontendApplicationTests {

public static void main(String agrs[])
{
	 SpringApplication.run(FrontendApplicationTests.class);
}
}
