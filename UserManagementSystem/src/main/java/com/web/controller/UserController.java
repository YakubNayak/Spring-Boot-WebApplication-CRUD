package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.model.User;
import com.web.repo.UserRepo;

@Controller
public class UserController {
	@Autowired
	private UserRepo repo;
	

	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/req1")
	public String userregister()
	{
		return "reg";
	}
	@RequestMapping("/register")
	public String register
	(@RequestParam Integer id,
			@RequestParam String name,
			@RequestParam String email,
			@RequestParam String password,
			@RequestParam String gender,
			@RequestParam String address,User u,Model m)
	{
		User ub=repo.save(u);
		return "msg";
	}
	 /* It provides list of Users in model object */    
    @RequestMapping("/viewuser")    
    public String vieweUser(Model model){    
        model.addAttribute("users",repo.findAll());
        return "viewuser";   
    }    
    @RequestMapping(value="/deleteuser/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
    	repo.deleteById(id);    
        return "redirect:/viewuser";    
    }  
    
    @RequestMapping(value="/edituser/{id}")    
    public String edit(@PathVariable int id, Model m){    
        User user=repo.findById(id).get();    
        m.addAttribute("command",user);  
        return "edituser";    
    }    
    /* It updates model object. */    
    @RequestMapping(value="/editu",method = RequestMethod.POST)    
    public String editsave(@RequestParam String name,
    		@RequestParam String email,
    		@RequestParam String password,
    		@RequestParam String gender,
    		@RequestParam String address, User user,Model model){    
       repo.save(user);    
        return "redirect:/viewuser";    
    }    
}


