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
public class MunicipalityController {
	@Autowired
	private MunicipalityRepository repository;
    
    @RequestMapping("/municipalities")
    public Iterable<Municipality> municipalities(@RequestParam(value="name", defaultValue="World") String name) {
        return repository.findAll();
    }
    
    @RequestMapping(value = "/municipality" , method = RequestMethod.POST)
    public @ResponseBody Municipality addProject(@RequestBody Municipality jsonProject) {
      return repository.save(jsonProject);
    }
    
    @RequestMapping("/municipality/{id}")
    public Municipality getMunicipality(@PathVariable("id") int id) {
    return repository.findOne(id);
    }
    
    @RequestMapping(value = "/municipality" , method = RequestMethod.PUT)  //U
    public @ResponseBody Municipality update(@RequestBody Municipality item) {
    return repository.save(item);
    } 
    
    @RequestMapping(value = "/municipality" , method = RequestMethod.DELETE)  //D
    public void delete(@RequestBody Municipality item) {
    repository.delete(item);
    //do business logic
    }
}
