package org.snn.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.snn.demo.model.Restaurant;
//import org.snn.demo.repository.RestaurantRepository;
import org.snn.demo.model.Restaurant;
import org.snn.demo.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
public class TestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private RestaurantRepository repository;

    @RequestMapping("/real")
    public List<Restaurant> getAllNames(){

        LOGGER.debug("getting all the names now");
       // repository.findAll().forEach( x->LOGGER.debug("value of all is:"+x));
      /* Restaurant test= repository.findByrestaurantName("Test");
       LOGGER.debug("value of test is:"+test.getRestaurant_name());*/


        return StreamSupport.stream(repository.findAll().spliterator(), false)
                .collect(Collectors.toList());



    }

    @RequestMapping("/")
    public String testControl(){
        String value="logTest";
        LOGGER.trace("doStuff needed more information - {}", value);
        LOGGER.debug("doStuff needed to debug - {}", value);
        LOGGER.info("doStuff took input - {}", value);
        LOGGER.warn("doStuff needed to warn - {}", value);
        LOGGER.error("doStuff encountered an error with value - {}", value);

        System.out.println("what is happening heressss ?");
        return "Hello hello";
    }

    @RequestMapping("/test")
    public String testMethod(){

        System.out.println("we should have a logging framework bruhh");
        return "hey this is a tessssst";

    }

    @RequestMapping("/lala")
    public String bang(){
        return "what whath hahahaah";
    }

}
