package com.company.DallasAutoParts.service;

import com.company.DallasAutoParts.dto.Inventory;
import com.company.DallasAutoParts.dto.Vendor;

import java.util.List;

public interface orderService {
    List<Inventory> getAllItems();
    List<Inventory> getItemsByVendorID(Integer vendorID);
    List<Inventory> getItemsByQuantity(Integer quantity);
    List<Inventory> getItemsByPartType(String partType);
    List<Inventory> getItemsByPartName(String partName);
    List<Inventory> getItemsByPartTypeAndVendorID(String partType, Integer VendorID);

}


