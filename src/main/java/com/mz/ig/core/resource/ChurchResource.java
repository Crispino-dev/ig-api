package com.mz.ig.core.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mz.ig.core.auth.AbstractResource;
import com.mz.ig.core.entity.CentralEntity;
import com.mz.ig.core.entity.ChurchEntity;
import com.mz.ig.core.service.CentralServiceImpl;
import com.mz.ig.core.service.ChurchServiceImpl;

@RestController
@RequestMapping("/churchs")
public class ChurchResource extends AbstractResource {

	@Autowired
	private ChurchServiceImpl churchService;

	@PostMapping("/create")
	public ChurchEntity createChurch(@RequestBody ChurchEntity church) {
		return this.churchService.createChurch(getUserContext(), church);
	}

}
