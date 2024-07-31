package yukinarisoftware.session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ServletMain {

    public static void main(String[] args) {
        SpringApplication.run(ServletMain.class);
    }
}
