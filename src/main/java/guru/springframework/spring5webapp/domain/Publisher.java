package guru.springframework.spring5webapp.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String Name;
    private String Address;
    private String City;
    private String State;
    private String ZIPCode;

    public Publisher() {

    }

    public Publisher(String name, String address, String city, String state, String ZIPCode) {
        Name = name;
        Address = address;
        City = city;
        State = state;
        this.ZIPCode = ZIPCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publisher publisher = (Publisher) o;

        return Id != null ? Id.equals(publisher.Id) : publisher.Id == null;
    }

    @Override
    public int hashCode() {
        return Id != null ? Id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", ZIPCode='" + ZIPCode + '\'' +
                '}';
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZIPCode() {
        return ZIPCode;
    }

    public void setZIPCode(String ZIPCode) {
        this.ZIPCode = ZIPCode;
    }
}
