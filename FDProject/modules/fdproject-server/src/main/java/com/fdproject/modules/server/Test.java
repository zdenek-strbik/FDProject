package com.fdproject.modules.server;

import java.util.Date;
import javax.annotation.PostConstruct;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.apache.log4j.Logger;

@Path("training")
@Produces("application/json")
@Consumes("application/json")
public class Test {

    private static Logger LOG = Logger.getLogger(Test.class);

    @PostConstruct
    public void init() {
        LOG.debug("Initializing Test1");
    }

    @POST
    @Path("/save")
    public Training test(Training training) {
        training.setId(training.getId() + " " + new Date());
        return training;
    }
}
