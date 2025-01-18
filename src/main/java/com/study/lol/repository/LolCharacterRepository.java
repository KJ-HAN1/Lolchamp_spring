package com.study.lol.repository;

import com.study.lol.entity.LolCharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface LolCharacterRepository extends JpaRepository<LolCharacterEntity, Long> {
    }
