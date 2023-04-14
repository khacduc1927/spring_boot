package com.example.WebsiteBanDoTheThao.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.WebsiteBanDoTheThao.Model.Admin;
import com.example.WebsiteBanDoTheThao.Repository.AdminRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class AdminController {
	@Autowired
	private AdminRepository AdminRepository;
	
	// Lấy tất cả Admin
	@GetMapping("/Admin")
	public List<Admin> getAllAdmin(){
		return AdminRepository.findAll();
	}	
	
	// Tạo mới Admin <rest api>
	@PostMapping("/Admin")
	public Admin createAdmin(@RequestBody Admin Admin) {
		return AdminRepository.save(Admin);
	}
}
