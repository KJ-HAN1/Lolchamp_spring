package com.study.lol.Service;

import com.study.lol.entity.LolCharacterEntity;
import com.study.lol.repository.LollCharacterRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class LolCharacterService {
    @Autowired
    private LollCharacterRepository lollCharacterRepository;

    @Transactional
    public List<LolCharacterEntity> getDb() {
        System.out.println("GET DB");
        List<LolCharacterEntity> findAllList =  lollCharacterRepository.findAll();

        return findAllList;
    }
}
