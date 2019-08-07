package com.company.DallasAutoParts.service;

import com.company.DallasAutoParts.dao.inventoryRepo;
import com.company.DallasAutoParts.dto.Inventory;
import com.company.DallasAutoParts.dto.Order;
import com.company.DallasAutoParts.dto.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class orderServiceImplementation implements orderService {

    @Autowired
    inventoryRepo inventoryRepository;


    @Override
    public List<Inventory> getAllItems() {

        return inventoryRepository.findAllItems();
    }


    @Override
    public List<Inventory> getItemsByVendorID(Integer vendorID) {
        return inventoryRepository.findItemsByVendorID(vendorID);
    }

    @Override
    public List<Inventory> getItemsByPartType(String partType){
        return inventoryRepository.findItemsByPartType(partType);
    }

    @Override
    public List<Inventory> getItemsByPartName(String partName){
        return inventoryRepository.findItemsByPartName(partName);
    }
    @Override
    public List<Inventory> getItemsByQuantity(Integer quantity){
        return inventoryRepository.findItemsByQuantity(quantity);
    }

    @Override
    public List<Inventory> getItemsByPartTypeAndVendorID(String partType, Integer vendorID){
        List<Inventory> inventoryList = inventoryRepository.findItemsByPartTypeAndVendorID(partType,(vendorID))
                .stream()
                .filter(inventory -> inventory.getPartType() == inventory.getPartType())
                .filter(inventory -> inventory.getVendorID() == inventory.getVendorID())
                .collect(Collectors.toList());
        return inventoryList;
    }

    public Order addItem(Order order) {
        return inventoryRepository.save(order);
    }

}


