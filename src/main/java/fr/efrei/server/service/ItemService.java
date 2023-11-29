package fr.efrei.server.service;
import org.springframework.stereotype.Service;
import fr.efrei.server.domain.Item;
import fr.efrei.server.repository.ItemRepository;

import java.util.List;

@Service
public class ItemService {

    public final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> findAll() {
        return itemRepository.findAll();
    }
}