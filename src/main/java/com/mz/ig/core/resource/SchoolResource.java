package com.mz.ig.core.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.mz.ig.core.auth.AbstractResource;
import com.mz.ig.core.entity.SchoolEntity;
import com.mz.ig.core.service.ISchoolService;

@RestController
@RequestMapping("/schools")
public class SchoolResource extends AbstractResource {

	@Autowired
	private ISchoolService schoolService;

	@GetMapping("/all")
	public List<SchoolEntity> findAll() {
		return this.schoolService.findAll();
	}

	@PostMapping("/create")
	public SchoolEntity createSchool(@RequestBody SchoolEntity school) {
		return this.schoolService.createSchool(getUserContext(), school);
	}

	@PutMapping("/update/id/{id}")
	public SchoolEntity updateSchoolById(@PathVariable Long id, @RequestBody SchoolEntity school) {
		return this.schoolService.updateSchoolById(getUserContext(), id, school);
	}

}
