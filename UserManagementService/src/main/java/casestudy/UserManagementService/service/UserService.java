package casestudy.UserManagementService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import casestudy.UserManagementService.model.Flight;
import casestudy.UserManagementService.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userrepo;
	
	
	public List<Flight>getFlightDetailsByOrgDest(String flight_origin,String flight_destination){
		List<Flight>list=userrepo.findAll();
		List<Flight>arrlist=new ArrayList<Flight>();
		for(Flight flight:list) {
			String org=flight.getFlight_origin();
			String dest=flight.getFlight_destination();
			if(org.equals(flight_origin) && dest.equals(flight_destination)) {
				arrlist.add(flight);
			
			}
		}
		return arrlist;
	}
	


}
