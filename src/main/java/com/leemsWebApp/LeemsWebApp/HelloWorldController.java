package com.leemsWebApp.LeemsWebApp;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Controller
public class HelloWorldController {

    private static AtomicInteger atomicImgIndex = new AtomicInteger(0);



    @GetMapping({"/", "lima"})
    public ResponseEntity<byte[]> getImage() throws Exception{

        System.out.println("Got Request");
        String fileName = String.format("/IMG_%s.JPG", getAndIncrementImageIndex());
        System.out.println("Picked image" + fileName);

        InputStream in = getClass().getResourceAsStream(fileName);
        byte[] fileContent = FileCopyUtils.copyToByteArray(in);
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(fileContent);
    }

    public int getAndIncrementImageIndex(){
        int index = atomicImgIndex.getAndIncrement();
        if(index == 30){
            atomicImgIndex.set(1);
        }
        return index;
    }


}