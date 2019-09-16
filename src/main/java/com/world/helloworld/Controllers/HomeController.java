package com.world.helloworld.Controllers;

import com.world.helloworld.Models.Message;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class HomeController {

    private int id = 0;

    @RequestMapping(path="/welcome/{subject}/{body}", method= RequestMethod.GET)
    @ResponseBody
    public Message welcome(@PathVariable ("subject") String subject, @PathVariable ("body") String body){
       Message message = new Message();

       Date date =  new Date();
       long timeNow = date.getTime();


       message.setId(timeNow);
       message.setSubject(subject);
        message.setBody(body);

       return message;
    }

    @RequestMapping(path="/", method= RequestMethod.GET)
    @ResponseBody
    public String index(){


        return "Welcome to the world of Java programming";
    }
}
