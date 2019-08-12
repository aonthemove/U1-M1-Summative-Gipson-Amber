package com.company.DallasAutoParts.dao;

import com.company.DallasAutoParts.dto.Inventory;
import com.company.DallasAutoParts.dto.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface inventoryRepo extends JpaRepository<Order, Integer> {
    public List<Inventory> findAllItems();
    public List<Inventory> findItemsByVendorID(Integer vendorID);
    public List<Inventory> findItemsByQuantity(Integer quantity);
    public List<Inventory> findItemsByPartType(String partType);
    public List<Inventory> findItemsByPartName(String partName);
    public List<Inventory> findItemsByPartTypeAndVendorID(String partType, Integer VendorID);
}
