package projectwithmavan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;
import projectwithmavan.dao.ParticipantDao;
import projectwithmavan.participant.Participant;

@Controller
public class MyControllet {


	@Autowired
	ParticipantDao participantDao;

	
	@RequestMapping("/home")
	public String home(Model m){
		
		String str = "HOME";
		m.addAttribute("name", str);
		return "index";
		
	}
	
	@RequestMapping("/show")
	public String showData(Model m){
		
		String str = "SHOW";
		m.addAttribute("name", str);
		
		List<Participant> p = this.participantDao.getParticipantss();
		m.addAttribute("list", p);
		
		
		return "index";
		
	}
	
	@RequestMapping("/add")
	public String addStudent(Model m){
		
		String str = "ADD";
		Participant p = new Participant();
		m.addAttribute("name", str);
		m.addAttribute("participant", p);
		return "index";
		
	}
	
	@RequestMapping(value="/savedata",method=RequestMethod.POST)
	public String saveStudent(@ModelAttribute("participant") Participant participant, Model m){
		
		
		this.participantDao.createProduct(participant);
		m.addAttribute("msg", "Data Added Successfully.");
		System.out.println(participant);
		
		return "index";
		
	}
	
}
