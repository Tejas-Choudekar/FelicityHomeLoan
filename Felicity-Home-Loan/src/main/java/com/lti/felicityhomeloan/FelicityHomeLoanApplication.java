package com.lti.felicityhomeloan;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.lti.felicityhomeloan.controller.FileUploadController;

@SpringBootApplication
@ComponentScan("com.lti")
@EntityScan("com.lti")
public class FelicityHomeLoanApplication {

	public static void main(String[] args) {
		new File(FileUploadController.uploadDirectory).mkdir();
		SpringApplication.run(FelicityHomeLoanApplication.class, args);
	}

}
