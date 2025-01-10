package com.study.lol.Service;

import com.study.lol.dto.AddItemInfoRequest;
import com.study.lol.dto.ItemDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AddItemInfoService {
    public ItemDTO addItemInfo(@RequestBody AddItemInfoRequest itemRequest){
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setId(itemRequest.getId());
        itemDTO.setName(itemRequest.getName());
        itemDTO.setPrice(itemRequest.getPrice());
        itemDTO.setHealth(itemRequest.getHealth());
        itemDTO.setAttack(itemRequest.getAttack());

        return itemDTO;
    }
}
