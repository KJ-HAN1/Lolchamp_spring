package com.study.lol.controller;

import com.study.lol.Service.AddItemInfoService;
import com.study.lol.dto.AddItemInfoRequest;
import com.study.lol.dto.ItemDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api/item")
@RestController
public class ItemController {

    public final List<ItemDTO> itemList = new ArrayList<ItemDTO>();

    //전체 조회
    @GetMapping("")
    public List<ItemDTO> getAllItems(){return itemList;}

    //단건 조회
    @GetMapping("/fetch/{id}")
    public ItemDTO getOneItem(@PathVariable int id){
        ItemDTO itemInfo = new ItemDTO();
        System.out.print("id : "+id);
        for (int i = 0; i < itemList.size(); i++) {
            if(itemList.get(i).getId() == id){
                itemInfo = itemList.get(i);
                break;
            }
        }
        return itemInfo;
    }

    //아이템 추가
    @PostMapping("")
    public ItemDTO addItem(@RequestBody AddItemInfoRequest itemRequest){
        System.out.println(itemRequest.toString());
        AddItemInfoService addItemInfoService = new AddItemInfoService();
        itemList.add(addItemInfoService.addItemInfo(itemRequest));
        return addItemInfoService.addItemInfo(itemRequest);
    }

    //아이템 삭제
    @DeleteMapping("/delete/{id}")
    public void deleteItem(@PathVariable int id){
        if(id<0 || id>itemList.size()) System.out.println("존재하지 않는 아이템");
        for (int i = 0; i < itemList.size(); i++) {
            if(itemList.get(i).getId()==id){
                System.out.println(itemList.get(i).getName()+"삭제");
                itemList.remove(i);
                break;
            }
        }
    }
    //이름, 가격, 하위?,조합텝?

}
