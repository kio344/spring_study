package com.apple.shop.service;

import com.apple.shop.entity.Item;
import com.apple.shop.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public void addItem(String title, int price){
        Item entity = Item.builder()
                .title(title)
                .price(price)
                .build();
        itemRepository.save(entity);
    }

    public List<Item> itemList(){
        List<Item> list = itemRepository.findAll();
        return list;
    }

}
