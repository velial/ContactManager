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

@Entity(name = "providers")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Provider {

    @Id
    @Column(name = "ID", unique = true)
    @GeneratedValue
    private Integer id;

    @Column(name = "statusId")
    private Integer status;

    @Column(name = "name")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
