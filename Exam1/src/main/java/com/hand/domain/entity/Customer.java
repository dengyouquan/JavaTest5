package com.hand.domain.entity;

import com.hand.api.dto.CustomerDTO;
import tk.mybatis.mapper.annotation.KeySql;

import java.util.Date;
import javax.persistence.*;

@Table(name = "customer")
public class Customer extends BaseEntity {
    @Id
    @KeySql(useGeneratedKeys = true)
    @Column(name = "customer_id")
    private Short customerId;

    @Column(name = "store_id")
    private Byte storeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    @Column(name = "address_id")
    private Short addressId;

    private Boolean active;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "last_update")
    private Date lastUpdate;

    /**
     * @return customer_id
     */
    public Short getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId
     */
    public void setCustomerId(Short customerId) {
        this.customerId = customerId;
    }

    /**
     * @return store_id
     */
    public Byte getStoreId() {
        return storeId;
    }

    /**
     * @param storeId
     */
    public void setStoreId(Byte storeId) {
        this.storeId = storeId;
    }

    /**
     * @return first_name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return last_name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return address_id
     */
    public Short getAddressId() {
        return addressId;
    }

    /**
     * @param addressId
     */
    public void setAddressId(Short addressId) {
        this.addressId = addressId;
    }

    /**
     * @return active
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * @param active
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", storeId=" + storeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", addressId=" + addressId +
                ", active=" + active +
                ", createDate=" + createDate +
                ", lastUpdate=" + lastUpdate +
                ", lastUpdate=" + getLastUpdate() +
                '}';
    }

    public Customer() {
    }

    public Customer(CustomerDTO customerDTO) {
        this.setFirstName(customerDTO.getFirst_name());
        this.setLastName(customerDTO.getLast_name());
        this.setEmail(customerDTO.getEmail());
    }

    public void setCustomerDTO(CustomerDTO customerDTO){
        this.setFirstName(customerDTO.getFirst_name());
        this.setLastName(customerDTO.getLast_name());
        this.setEmail(customerDTO.getEmail());
    }
}