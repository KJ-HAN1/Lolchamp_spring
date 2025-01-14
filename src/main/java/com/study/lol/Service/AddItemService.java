package com.study.lol.Service;

import com.study.lol.dto.AddItemRequest;
import com.study.lol.dto.ItemDTO;
import org.springframework.web.bind.annotation.RequestBody;

public class AddItemService {
    public ItemDTO addItem(@RequestBody AddItemRequest itemRequest){
        ItemDTO itemDTO = new ItemDTO();


        return itemDTO;
    }
}
