package com.study.lol.Service;

import com.study.lol.dto.AddCharacterRequest;
import com.study.lol.dto.LolCharacterDTO;
import com.study.lol.entity.LolCharacterEntity;
import com.study.lol.repository.LolCharacterRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LolCharacterService {
    @Autowired
    private LolCharacterRepository lolCharacterRepository;

    @Transactional
    public List<LolCharacterEntity> getDb() {
        System.out.println("GET DB");
        List<LolCharacterEntity> findAllList =  lolCharacterRepository.findAll();

        return findAllList;
    }

    //addCharacterrequest값 엔티티값으로 변경(DB)
    public LolCharacterEntity convertToEntity(AddCharacterRequest addCharacterRequest){
        LolCharacterEntity lolCharacterEntity = new LolCharacterEntity();
        lolCharacterEntity.setName(addCharacterRequest.getName());
        lolCharacterEntity.setHealth(addCharacterRequest.getHealth());
        lolCharacterEntity.setMana(addCharacterRequest.getMana());
        lolCharacterEntity.setAttackPoint(addCharacterRequest.getAttack());
        lolCharacterEntity.setDefencePoint(addCharacterRequest.getDefence());
    }
// db에 엔티티 저장
    @Transactional
    public LolCharacterEntity addCharacter(LolCharacterEntity lolCharacterEntity) {
        return lolCharacterRepository.save(lolCharacterEntity);
    }
}
