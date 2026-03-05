package com.mz.ig.core.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mz.ig.core.auth.AbstractResource;
import com.mz.ig.core.entity.CentralEntity;
import com.mz.ig.core.service.CentralServiceImpl;

@RestController
@RequestMapping("/centrals")
public class CentralResource extends AbstractResource {

	@Autowired
	private CentralServiceImpl centralService;

	@PostMapping("/create")
	public CentralEntity createCentral(@RequestBody CentralEntity central) {
		return this.centralService.createCentral(getUserContext(), central);
	}

}
