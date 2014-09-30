package info.velial.support.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Igor on 20.03.2014.
 */
@Entity(name = "terminals")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Terminal {

    @Id
    @Column(name = "ID", unique = true)
    @GeneratedValue
    private Integer id;

    @Column(name = "dealer_id")
    private Integer dealerId;

    @Column(name = "status")
    private Integer statusId;

    @Column(name = "terminal_type_id")
    private Integer terminalTypeId;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String locationId;

    @Column(name = "address")
    private String address;

    @Column(name = "max_payment")
    private Double max_payment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDealerId() {
        return dealerId;
    }

    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getTerminalTypeId() {
        return terminalTypeId;
    }

    public void setTerminalTypeId(Integer terminalTypeId) {
        this.terminalTypeId = terminalTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getMax_payment() {
        return max_payment;
    }

    public void setMax_payment(Double max_payment) {
        this.max_payment = max_payment;
    }
}
