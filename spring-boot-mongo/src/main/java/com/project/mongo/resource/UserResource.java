package com.project.mongo.resource;

import com.project.mongo.entity.Customer;
import com.project.mongo.services.CustomerService;
import java.util.List;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author armenar
 */
@RestController
@RequestMapping("/api/user")
@Produces(MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
public class UserResource {
    
     @Autowired
     private CustomerService customerService;
     

    //access http://localhost:9999/api/user/username/?searchkey=armen
    @RequestMapping(method = RequestMethod.GET, value = "/username", params = {"searchkey"})
    public Response findPerson(@RequestParam(value = "searchkey") String searchkey) {
        System.out.println("Username is " +searchkey);
        return Response.ok("ok").type(javax.ws.rs.core.MediaType.APPLICATION_JSON).build();
    }
    // access http://localhost:9999/api/user/all
    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public Response findAllCostumers() {
       Customer obj = new Customer();
       obj.setFirstName("UserFname"+System.currentTimeMillis());
       obj.setLastName("UserLname"+System.currentTimeMillis());
       customerService.save(obj);       
       List<Customer> list =  customerService.findAll();        
       return Response.ok().entity(list).type(javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=utf-8").build();
    }
}
