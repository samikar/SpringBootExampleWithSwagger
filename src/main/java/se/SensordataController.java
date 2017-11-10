package se;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
    
	@RequestMapping(value = "/sensordata" , method = RequestMethod.POST)
	 public @ResponseBody Sensordata create(@RequestBody Sensordata item) {    //C
	 return repository.save(item);
	 } 
	 
	 @RequestMapping("/sensordatas")
	 public Iterable<Sensordata> sensordatas(@RequestParam(value="name", defaultValue="World") String name) { //R
	 return repository.findAll();
	 } 
	 
	 @RequestMapping("/sensordata/{id}")
	 public Sensordata get(@PathVariable("id") int id) {   //R
	 return repository.findOne(id);
	 }

	@RequestMapping(value = "/sensordata" , method = RequestMethod.PUT)  //U
	 public @ResponseBody Sensordata update(@RequestBody Sensordata item) {
	 return repository.save(item);
	 } 
	 
	 @RequestMapping(value = "/sensordata" , method = RequestMethod.DELETE)  //D
	 public void delete(@RequestBody Sensordata item) {
	 repository.delete(item);
	 //do business logic
	 }
}
