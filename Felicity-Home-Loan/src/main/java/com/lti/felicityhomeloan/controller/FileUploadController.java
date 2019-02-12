package com.lti.felicityhomeloan.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin
public class FileUploadController {
	public static String uploadDirectory = System.getProperty("user.dir")+"/uploads";

	@CrossOrigin
	@RequestMapping("/")
	public String Uploadpage(Model model) {
		return "UploadView";
	}
	

	@CrossOrigin
	@RequestMapping(path="/upload", consumes = "multipart/form-data")
	public String upload(Model model, @RequestParam("image") MultipartFile[] files) {
		StringBuilder fileNames = new StringBuilder();
		for(MultipartFile file : files) {
			Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
			fileNames.append(file.getOriginalFilename());
			try {
				Files.write(fileNameAndPath, file.getBytes());
			} catch(IOException e){
				e.printStackTrace();
			}
		}
		//return "Successfully uploaded files "+fileNames.toString();
		return "{\"status\" : \"Successfully uploaded files\"} "+fileNames.toString();
		//return "UploadStatusView";
	}

}
