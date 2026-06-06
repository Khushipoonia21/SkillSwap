package com.skillswap.skillswap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skillswap.skillswap.entity.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long> {

}