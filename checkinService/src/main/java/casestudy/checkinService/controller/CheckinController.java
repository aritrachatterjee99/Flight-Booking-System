package casestudy.checkinService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import casestudy.checkinService.model.Checkin;
import casestudy.checkinService.service.CheckinService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/checkin")
public class CheckinController {
	@Autowired
	CheckinService checkinService;
	
	@GetMapping("/getbyid/{id}")
	public List<Checkin>getCheckIn(@PathVariable String id){
		return checkinService.getCheckin(id);
	}

}
