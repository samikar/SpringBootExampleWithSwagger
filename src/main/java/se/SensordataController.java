package se;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensordataController {
	@Autowired
	private SensordataRepository repository;
    
    @RequestMapping("/sensordatas")
    public Iterable<Sensordata> sensordatas(@RequestParam(value="name", defaultValue="World") String name) {
        return repository.findAll();
    }
    
    @RequestMapping(value = "/sensordatas" , method = RequestMethod.PUT)  //U
    public @ResponseBody Sensordata update(@RequestBody Sensordata item) {
    return repository.save(item);
    } 
    
    @RequestMapping(value = "/sensordatas" , method = RequestMethod.DELETE)  //D
    public void delete(@RequestBody Sensordata item) {
    repository.delete(item);
    //do business logic
    }
}
