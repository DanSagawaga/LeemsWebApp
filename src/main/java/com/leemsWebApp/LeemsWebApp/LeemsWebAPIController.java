package com.leemsWebApp.LeemsWebApp;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class LeemsWebAPIController {

    private static AtomicInteger atomicImgIndex = new AtomicInteger(0);

    @GetMapping({"/", "lima"})
    public ResponseEntity<byte[]> getImage() throws Exception{

        System.out.println("Got Request");
        String fileName = String.format("/LimaPics/IMG_%s.JPG", getAndIncrementImageIndex());
        System.out.println("Picked image" + fileName);

        InputStream in = getClass().getResourceAsStream(fileName);
        byte[] fileContent = FileCopyUtils.copyToByteArray(in);
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(fileContent);
    }

    @GetMapping("users")
    public ResponseEntity<String> getUserResponse(){
        return ResponseEntity.ok().contentType(MediaType.TEXT_PLAIN).body("You've git the users enpoint congrats");
    }

    @GetMapping("twitter")
    public String helloWorld(@RequestParam(required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "twitterFeed";
    }

    public int getAndIncrementImageIndex(){
        int index = atomicImgIndex.getAndIncrement();
        if(index == 30){
            atomicImgIndex.set(1);
        }
        return index;
    }


}