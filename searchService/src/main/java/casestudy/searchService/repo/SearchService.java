package casestudy.searchService.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import casestudy.searchService.model.FlightSearchModel;

@Component
public class SearchService {
	
	@Autowired
	SearchRepo searchrepo;
	public  List<FlightSearchModel> findByorgdest(String origin,String destination){
        return searchrepo.findByorgdest(origin, destination);
    }

}
