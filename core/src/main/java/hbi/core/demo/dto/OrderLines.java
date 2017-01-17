package hbi.core.demo.dto;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.*;

/**
 * Created by 陈伟 on 2017/1/13.
 */
@Table(name = "HAP_OM_ORDER_LINES")
@ExtensionAttribute(
        disable = true
)
public class OrderLines extends BaseDTO{
    @Id
    @Column
    @GeneratedValue
    private Long lineId;
    @Column
    private Long headerId;
    @Column
    private Long lineNumber;
    @Column
    private Long inventoryItemId;
    @Column
    private String orderQuantityUom;
    @Column
    private Long orderdQuantity;
    @Column
    private Double unitSellingPrice;
    @Column
    private String description;
    @Column
    private Long companyId;
    @Column
    private Long requestId;
    @Column
    private Long programId;
    @Column
    private String addition1;
    @Column
    private String addition2;
    @Column
    private String addition3;
    @Column
    private String addition4;
    @Column
    private String addition5;

    //额外新增的start
    @Transient
    private Items items;

    private String itemDescription;//物料描述
    //额外新增的end


    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public Long getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Long headerId) {
        this.headerId = headerId;
    }

    public Long getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Long lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getOrderQuantityUom() {
        return orderQuantityUom;
    }

    public void setOrderQuantityUom(String orderQuantityUom) {
        this.orderQuantityUom = orderQuantityUom;
    }

    public Long getOrderdQuantity() {
        return orderdQuantity;
    }

    public void setOrderdQuantity(Long orderdQuantity) {
        this.orderdQuantity = orderdQuantity;
    }

    public Double getUnitSellingPrice() {
        return unitSellingPrice;
    }

    public void setUnitSellingPrice(Double unitSellingPrice) {
        this.unitSellingPrice = unitSellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    @Override
    public Long getRequestId() {
        return requestId;
    }

    @Override
    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    @Override
    public Long getProgramId() {
        return programId;
    }

    @Override
    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    public String getAddition1() {
        return addition1;
    }

    public void setAddition1(String addition1) {
        this.addition1 = addition1;
    }

    public String getAddition2() {
        return addition2;
    }

    public void setAddition2(String addition2) {
        this.addition2 = addition2;
    }

    public String getAddition3() {
        return addition3;
    }

    public void setAddition3(String addition3) {
        this.addition3 = addition3;
    }

    public String getAddition4() {
        return addition4;
    }

    public void setAddition4(String addition4) {
        this.addition4 = addition4;
    }

    public String getAddition5() {
        return addition5;
    }

    public void setAddition5(String addition5) {
        this.addition5 = addition5;
    }
}
