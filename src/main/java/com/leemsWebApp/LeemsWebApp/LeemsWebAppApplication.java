package com.leemsWebApp.LeemsWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

@SpringBootApplication
public class LeemsWebAppApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(LeemsWebAppApplication.class, args);

	}

}


