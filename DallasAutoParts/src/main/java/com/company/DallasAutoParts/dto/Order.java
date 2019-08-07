package com.company.DallasAutoParts.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Length(max = 4)
    private Integer orderID;
    @NotNull
    @Size(max = 4, message = "Part ID cannot be longer than 4 characters")
    private Integer partID;
    @NotNull
    @Size(max = 4, message = "Vendor ID cannot be longer than 4 characters")
    private Integer vendorID;
    @NotEmpty(message = "Invalid Date")
    private Date startDate;
    @NotEmpty(message = "Invalid Date")
    private Date endDate;
    @NotEmpty
    private BigDecimal price;
    @NotNull
    private Integer quantity;
    @NotEmpty
    private BigDecimal total;
    @NotEmpty
    @Size(max = 50, message = "Part Name cannot be longer than 50 characters")
    private String partName;
    @NotEmpty
    @Size(max = 50, message = "Part Type cannot be longer than 50 characters")
    private String partType;
    @NotNull
    @Size(max = 50, message = "Status cannot be longer than 50 characters")
    private String status;


    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getPartID() {
        return partID;
    }

    public void setPartID(Integer partID) {
        this.partID = partID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getVendorID() {
        return vendorID;
    }

    public void setVendorID(Integer vendorID) {
        this.vendorID = vendorID;
    }

}