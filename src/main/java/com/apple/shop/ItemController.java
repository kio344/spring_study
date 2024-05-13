package com.apple.shop;

import com.apple.shop.entity.Item;
import com.apple.shop.repository.ItemRepository;
import com.apple.shop.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/list")
    public String itemList(Model model){
        var result = itemService.itemList();

        model.addAttribute("items", result);
        return "list.html";
    }

    @GetMapping("/write")
    public String write(){
        return "write.html";
    }

    @PostMapping("/add")
    public String add(@RequestParam String title, @RequestParam Integer price){
        itemService.addItem(title, price);
        return "redirect:/list";
    }
}
