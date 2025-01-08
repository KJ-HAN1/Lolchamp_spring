package com.study.lol.controller;

import com.study.lol.Service.AddCharacterService;
import com.study.lol.Service.AddSkillSetService;
import com.study.lol.dto.AddCharacterRequest;
import com.study.lol.dto.AddSkillsRequest;
import com.study.lol.dto.LolChampDTO;
import com.study.lol.dto.SkillsDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RequestMapping("/api/lol")
@RestController
public class ApiController {

    private final static List<LolChampDTO> totalList = new ArrayList<>();
    private final static List<SkillsDTO> skillsList = new ArrayList<>();
    //전체 List 조회
    @GetMapping("")
    public List<LolChampDTO> getAllInfo() {return totalList;}

    //화면에서 넘겨준 값으로 lolchampdto생성
    @PostMapping("")
    public LolChampDTO addCharacter(@RequestBody AddCharacterRequest characterRequest) {
        System.out.println(characterRequest.toString());
        AddCharacterService addCharacterService = new AddCharacterService();
        totalList.add(addCharacterService.addCharacter(characterRequest));
        return addCharacterService.addCharacter(characterRequest);
    }

    //id값을 통해 skills update
    @PutMapping("/detail/{id}")
    public void addSkillSet (@PathVariable int id, @RequestBody AddSkillsRequest skillsRequest) {
        for (int i = 0; i < totalList.size(); i++) {
            if(totalList.get(i).getId() == id){
                System.out.println("id = " + id +"->"+ skillsRequest.toString());
                AddSkillSetService addSkillSetService = new AddSkillSetService();
                skillsList.add(addSkillSetService.AddSkills(skillsRequest));
                totalList.get(i).setSkillset(skillsList);
            }
        }
    }

    // 상세 정보 조회 (단건 조회)
    @GetMapping("/fetch/{id}")
    public LolChampDTO getOneInfo(@PathVariable int id) {
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

    // delete Character
    @DeleteMapping("/delete/{id}")
    public void deleteCharacter(@PathVariable int id){
        boolean checkId = false;
        for (int i = 0; i <totalList.size() ; i++) {
            if(totalList.get(i).getId() == id){
                System.out.println(totalList.get(i).getName()+" 삭제!");
                totalList.remove(i);
                checkId = true;
                break;
            }
        }
        if(!checkId) System.out.println("존재하지 않는 id");
    }
}
