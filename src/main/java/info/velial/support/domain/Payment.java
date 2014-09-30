package info.velial.support.domain;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

/**
 * Created by Igor on 17.03.14.
 */

@Entity(name = "payments")
public class Payment {

    @Id
    @Column(name = "ID", unique = true)
    @GeneratedValue
    private Integer id;

    @Column(name = "SP_ID")
    private String sp_id;

    @Column(name = "SD_ID")
    private String sd_id;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "SPSTATUSID")
    private Integer spStatusId;

    @Column(name = "STATUS_A")
    private Integer status_a;

    @Column(name = "COUNT_SEND")
    private Integer count_send;

    @Column(name = "COUNT_CHECK")
    private Integer count_check;

    @Column(name = "ERROR_ID")
    private Integer error_id;

    @Column(name = "DATE")
    private Date date;

    @Column(name = "TIME")
    private Time time;

    @Column(name = "PAY_DATE")
    private Date pay_date;

    @Column(name = "PAY_TIME")
    private Time pay_time;

    @Column(name = "DEALER_ID")
    private Integer dealer_id;

    @Column(name = "DEALER_MAIN_ID")
    private Integer dealer_main_id;

    @Column(name = "TERMINAL_ID")
    private Integer terminal_id;

    @Column(name = "GATEWAY_ID")
    private Integer gateway_id;

    @Column(name = "PROVIDER_ID")
    private Integer provider_id;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "ACCOUNT")
    private String acclount;

    @Column(name = "DETAILSDATA")
    private String detailsData;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "amount_cash")
    private Double amount_cash;

    @Column(name = "comment")
    private String comment;

    @Column(name = "DETAILSEXIST")
    private Integer deatilsExist;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSp_id() {
        return sp_id;
    }

    public void setSp_id(String sp_id) {
        this.sp_id = sp_id;
    }

    public String getSd_id() {
        return sd_id;
    }

    public void setSd_id(String sd_id) {
        this.sd_id = sd_id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSpStatusId() {
        return spStatusId;
    }

    public void setSpStatusId(Integer spStatusId) {
        this.spStatusId = spStatusId;
    }

    public Integer getStatus_a() {
        return status_a;
    }

    public void setStatus_a(Integer status_a) {
        this.status_a = status_a;
    }

    public Integer getCount_send() {
        return count_send;
    }

    public void setCount_send(Integer count_send) {
        this.count_send = count_send;
    }

    public Integer getCount_check() {
        return count_check;
    }

    public void setCount_check(Integer count_check) {
        this.count_check = count_check;
    }

    public Integer getError_id() {
        return error_id;
    }

    public void setError_id(Integer error_id) {
        this.error_id = error_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Date getPay_date() {
        return pay_date;
    }

    public void setPay_date(Date pay_date) {
        this.pay_date = pay_date;
    }

    public Time getPay_time() {
        return pay_time;
    }

    public void setPay_time(Time pay_time) {
        this.pay_time = pay_time;
    }

    public Integer getDealer_id() {
        return dealer_id;
    }

    public void setDealer_id(Integer dealer_id) {
        this.dealer_id = dealer_id;
    }

    public Integer getDealer_main_id() {
        return dealer_main_id;
    }

    public void setDealer_main_id(Integer dealer_main_id) {
        this.dealer_main_id = dealer_main_id;
    }

    public Integer getTerminal_id() {
        return terminal_id;
    }

    public void setTerminal_id(Integer terminal_id) {
        this.terminal_id = terminal_id;
    }

    public Integer getGateway_id() {
        return gateway_id;
    }

    public void setGateway_id(Integer gateway_id) {
        this.gateway_id = gateway_id;
    }

    public Integer getProvider_id() {
        return provider_id;
    }

    public void setProvider_id(Integer provider_id) {
        this.provider_id = provider_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAcclount() {
        return acclount;
    }

    public void setAcclount(String acclount) {
        this.acclount = acclount;
    }

    public String getDetailsData() {
        return detailsData;
    }

    public void setDetailsData(String detailsData) {
        this.detailsData = detailsData;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount_cash() {
        return amount_cash;
    }

    public void setAmount_cash(Double amount_cash) {
        this.amount_cash = amount_cash;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getDeatilsExist() {
        return deatilsExist;
    }

    public void setDeatilsExist(Integer deatilsExist) {
        this.deatilsExist = deatilsExist;
    }
}
