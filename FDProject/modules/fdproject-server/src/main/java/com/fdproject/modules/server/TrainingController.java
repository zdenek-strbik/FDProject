package com.fdproject.modules.server;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import java.util.Date;

@Controller
@RequestMapping("training")
public class TrainingController {

   private static Logger LOG = Logger.getLogger(Test.class);

   @PostConstruct
   public void init() {
      LOG.debug("Initializing Test1");
   }

   @RequestMapping(value = "/save", method = RequestMethod.POST)
   public Training save(Training training) {
      training.setId(training.getId() + " " + new Date());
      return training;
   }

   @RequestMapping(value = "/load", method = RequestMethod.GET)
   public String load() {
      double random = Math.random();
      LOG.debug("/load called, returning random number " + random);
      return "Hello " + random;
   }

}
