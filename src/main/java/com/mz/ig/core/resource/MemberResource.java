package com.mz.ig.core.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mz.ig.core.auth.AbstractResource;
import com.mz.ig.core.entity.MemberEntity;
import com.mz.ig.core.service.MemberServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/members")
public class MemberResource extends AbstractResource  {
	
	@Autowired
	private MemberServiceImpl memberService;
	
	@GetMapping("/all")
	public List<MemberEntity> findAll() {
		return this.memberService.findAll();
	}
	
	@PostMapping("/create")
	public MemberEntity createMember(@RequestBody MemberEntity member) {
		return this.memberService.createMember(getUserContext(), member);
	}
	

}
