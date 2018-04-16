package lyn.model;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@ServletComponentScan
@MapperScan("lyn.model.*.dao")
@SpringBootApplication
public class LynTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(LynTemplateApplication.class, args);
	}
}
