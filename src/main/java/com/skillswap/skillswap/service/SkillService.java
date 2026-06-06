package com.skillswap.skillswap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skillswap.skillswap.entity.Skill;
import com.skillswap.skillswap.repository.SkillRepository;

@Service
public class SkillService {

    private final SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public Skill saveSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }
}