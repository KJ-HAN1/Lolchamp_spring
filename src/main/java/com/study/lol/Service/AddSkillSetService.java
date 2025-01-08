package com.study.lol.Service;

import com.study.lol.dto.AddSkillsRequest;
import com.study.lol.dto.SkillsDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AddSkillSetService {
    public SkillsDTO AddSkills(@RequestBody AddSkillsRequest request){
        SkillsDTO skillsDTO = new SkillsDTO();
        skillsDTO.setName(request.getName());
        skillsDTO.setUseMana(request.getUseMana());
        skillsDTO.setAttackPoint(request.getAttackPoint());
        return skillsDTO;
    }
}
