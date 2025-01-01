package com.study.lol.controller;

import com.study.lol.dto.AddCharacterRequest;
import com.study.lol.dto.LolChampDTO;
import com.study.lol.dto.Skills;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RequestMapping("/api/lol")
@RestController
public class ApiController {

    private static List<LolChampDTO> totalList = new ArrayList<>();

    @GetMapping("")
    public List<LolChampDTO> index() {
        return totalList;
    }

    //화면에서 넘겨준 값으로 lolchampdto생성
    @PostMapping("")
    public LolChampDTO addCharacter(@RequestBody AddCharacterRequest request) {


        System.out.println(request.toString());
        LolChampDTO lolChampDTO = new LolChampDTO();
        lolChampDTO.setId(request.getId());
        lolChampDTO.setName(request.getName());
        lolChampDTO.setAttack(request.getAttack());
        lolChampDTO.setMana(request.getMana());
        lolChampDTO.setHealth(request.getHealth());
        totalList.add(lolChampDTO);
        return lolChampDTO;
    }

    //id값을 통해 skills input
    @PutMapping("/detail/{id}")
    public void addSkillSet (@PathVariable int id, @RequestBody Skills skills) {

    }

    // 상세 정보 조회 (단건 조회)
    @GetMapping("/fetch/{id}")
    public LolChampDTO getInfo(@PathVariable int id) {
        System.out.println("id : "+id);
        LolChampDTO dto = new LolChampDTO();
        for(int i  = 0; i < totalList.size(); i++){
            if(totalList.get(i).getId() == id) {
                dto = totalList.get(i);
                break;
            }
        }
        return dto;
    }


}
