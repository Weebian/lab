/**
 * Class to represent the information for a buddy
 *
 * @author Hoang Bui 101029049
 */
package hbui.lab;

import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;

@Entity
public class BuddyInfo {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="book_id")
    @RestResource(path = "book", rel="book")
    private AddressBook book;

    private String name;
    private String address;
    private String phoneNumber;
    private int num_rocks;

    protected BuddyInfo(){}

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Long getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString(){
        return String.format("Buddy[id=%d, name='%s', address='%s', phoneNumber='%s']", id, name, address, phoneNumber);
    }
}
