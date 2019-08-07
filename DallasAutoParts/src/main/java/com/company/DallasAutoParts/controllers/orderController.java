package com.company.DallasAutoParts.controllers;
import com.company.DallasAutoParts.dto.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import com.company.DallasAutoParts.dto.Inventory;
import com.company.DallasAutoParts.service.orderServiceImplementation;

import org.springframework.http.HttpStatus;


@RestController
@RequestMapping(value="/inventory")
public class orderController {
    @Autowired
    orderServiceImplementation OrderService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public Order addItem(@RequestBody @Valid Order order) {
        return OrderService.addItem(order);
    }

    @GetMapping(value = "/")
    public List<Inventory> getAllItems()
    {
        return OrderService.getAllItems();
    }

    @GetMapping(value = "/VendorID/{vendorID}")
    public List<Inventory> getItemsByVendorID(@PathVariable Integer vendorID) {
        return OrderService.getItemsByVendorID(vendorID);
    }
    @GetMapping(value = "/Quantity/{quantity}")
    public List<Inventory> getItemsByQuantity(@PathVariable Integer quantity) {
        return OrderService.getItemsByQuantity(quantity);
    }

    @GetMapping(value = "/partType/{partType}")
    public List<Inventory> getItemsByPartType(@PathVariable String partType) {
        return OrderService.getItemsByPartType(partType);
    }

    @GetMapping(value = "/partName/{partName}")
    public List<Inventory> getItemsByPartName(@PathVariable String partName) {
        return OrderService.getItemsByPartName(partName);
    }

    @GetMapping(value = "/inventory/{partType}/{vendorID}")
    public List<Inventory> getItemsByPartTypeAndVendorID(@PathVariable String partType,
                                                         @PathVariable Integer vendorID) {
        return OrderService.getItemsByPartTypeAndVendorID(partType, vendorID);
    }

}

