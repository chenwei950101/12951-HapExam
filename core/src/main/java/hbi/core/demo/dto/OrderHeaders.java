package hbi.core.demo.dto;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by 陈伟 on 2017/1/13.
 */
@Table(name = "HAP_OM _ORDER_HEADERS")
@ExtensionAttribute(
        disable = true
)
public class OrderHeaders extends BaseDTO{
    @Id
    @Column
    @GeneratedValue
    private Long headerId;
    @Column
    private String orderNumber;
    @Column
    private Long companyId;
    private Date orderDate;
    @Column
    private String orderStatus;
    @Column
    private Long customerId;
    @Column
    private Long requestId;
    @Column
    private Long programId;

    //额外新增的字段start
    @Transient
    private Companys companys;
    @Transient
    private Customers customers;
    @Transient
    private List<OrderLines> orderLinesList;
    private Long inventoryItemId;//用于查询的物料ID
    private Double orderPrice;//订单总额
    //额外新增的字段end

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public Long getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Long headerId) {
        this.headerId = headerId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
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

    public Companys getCompanys() {
        return companys;
    }

    public void setCompanys(Companys companys) {
        this.companys = companys;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public List<OrderLines> getOrderLinesList() {
        return orderLinesList;
    }

    public void setOrderLinesList(List<OrderLines> orderLinesList) {
        this.orderLinesList = orderLinesList;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }
}
