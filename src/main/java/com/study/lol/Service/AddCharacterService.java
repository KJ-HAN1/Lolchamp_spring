package com.study.lol.Service;

import com.study.lol.dto.AddCharacterRequest;
import com.study.lol.dto.LolCharacterDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AddCharacterService {

//    public LolChampDTO addCharacter( int id,String name,double health,double attack,double mana){
    public LolCharacterDTO addCharacter(@RequestBody AddCharacterRequest request){

        LolCharacterDTO lolCharacterDTO = new LolCharacterDTO();
        lolCharacterDTO.setId(request.getId());
        lolCharacterDTO.setName(request.getName());
        lolCharacterDTO.setAttack(request.getAttack());
        lolCharacterDTO.setMana(request.getMana());
        lolCharacterDTO.setHealth(request.getHealth());

        return lolCharacterDTO;
    }


}
