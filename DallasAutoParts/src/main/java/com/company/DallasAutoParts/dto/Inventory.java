package com.company.DallasAutoParts.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="inventoryList")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Length(max = 4)
    private Integer partID;
    @NotNull
    @Size(max=4, message="Vendor ID cannot be longer than 4 characters")
    private Integer vendorID;
    @NotEmpty
    @Size(max=50, message="Part Name cannot be longer than 50 characters")
    private String partName;
    @NotEmpty
    @Size(max=50, message="Part Type cannot be longer than 50 characters")
    private String partType;
    @NotNull
    @Size(max=50, message="Quantity cannot be longer than 50 characters")
    private Integer quantity;
    @NotNull
    private BigDecimal price;
    @NotNull
    @Size(max=50, message="Status cannot be longer than 50 characters")
    private String status;

    @OneToMany(mappedBy="partID", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JsonIgnore
    private Set<Order> OrderItems;

    public Integer getPartID() {
        return partID;
    }

    public void setPartID(Integer partID) {
        this.partID = partID;
    }

    public Integer getVendorID() {
        return vendorID;
    }

    public void setVendorID(Integer vendorID) {
        this.vendorID = vendorID;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getPartType() {
        return partType;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inventory inventory = (Inventory) o;
        return Objects.equals(getPartID(), inventory.getPartID()) &&
                Objects.equals(getVendorID(), inventory.getVendorID()) &&
                Objects.equals(getPartName(), inventory.getPartName()) &&
                Objects.equals(getPartType(), inventory.getPartType()) &&
                Objects.equals(getPrice(), inventory.getPrice()) &&
                Objects.equals(getQuantity(), inventory.getQuantity()) &&
                Objects.equals(getStatus(), inventory.getStatus()) ;
    }
    @Override
    public int hashCode() {
        return Objects.hash(getPartID(), getPartName(), getPartType(), getPrice(),getQuantity(),getStatus());
    }

    @Override
    public String toString() {
        return "InventoryItems{" +
                "Part ID =" + partID +
                ", Part Name='" + partName + '\'' +
                ", Part Type='" + partType + '\'' +
                ", Price='" + price + '\'' +
                ", Quantity='" + quantity + '\'' +
                ", Status='" + status  +
                '}';
    }

}
