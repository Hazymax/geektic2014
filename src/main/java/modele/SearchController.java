package modele;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.ninja_squad.geektic.service.Interet;

@RestController
@RequestMapping("/search")
public class SearchController {
	
	private final List<Interet> interets = new ArrayList<>();	
	private String name;
	
    @RequestMapping(method = RequestMethod.GET, value="/interets")
    @ResponseStatus(HttpStatus.OK)
    public List<Interet> interets(){
        return interets;
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/add")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Interet> add(@RequestBody Interet interet){
    	interets.add(interet);
    	return interets;
    }

}
