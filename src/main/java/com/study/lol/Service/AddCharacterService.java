package com.study.lol.Service;

import com.study.lol.dto.AddCharacterRequest;
import com.study.lol.dto.LolChampDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AddCharacterService {

//    public LolChampDTO addCharacter( int id,String name,double health,double attack,double mana){
    public LolChampDTO addCharacter(@RequestBody AddCharacterRequest request){

        LolChampDTO lolChampDTO = new LolChampDTO();
        lolChampDTO.setId(request.getId());
        lolChampDTO.setName(request.getName());
        lolChampDTO.setAttack(request.getAttack());
        lolChampDTO.setMana(request.getMana());
        lolChampDTO.setHealth(request.getHealth());

        return lolChampDTO;
    }


}
