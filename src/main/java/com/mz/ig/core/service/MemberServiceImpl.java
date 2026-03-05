package com.mz.ig.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mz.ig.core.entity.MemberEntity;
import com.mz.ig.core.entity.UserEntity;
import com.mz.ig.core.repository.IMemberRepository;
import com.mz.ig.core.utils.AgeRange;
import com.mz.ig.shared_domain.entity.DTO.AgeRangeDTO;

@Service
public class MemberServiceImpl {

	@Autowired
	private IMemberRepository memberRepository;

	public List<MemberEntity> findAll() {
		return this.memberRepository.findAll();
	}

	public MemberEntity createMember(UserEntity loggedUser, MemberEntity member) {

		AgeRangeDTO ageRangeDTO = AgeRange.calculateAgeRange(member.getBithdate());

		member.setAgeRange(ageRangeDTO.getAgeRange());
		member.setAge(ageRangeDTO.getAge());

		return this.memberRepository.save(member);
	}

}
