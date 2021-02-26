/**
 * Class to represent an address book
 *
 * @author Hoang Bui 101029049
 */

package hbui.lab;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<BuddyInfo> budList;

    public AddressBook(){
        budList = new ArrayList<BuddyInfo>();
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public List<BuddyInfo> getBudList() {
        return budList;
    }

    public void addBud(BuddyInfo bud){
        budList.add(bud);
    }

    public void removeBud(int index){
        budList.remove(index);
    }

    @Override
    public String toString(){
        String bookContent = "Contents:\n";
        for (BuddyInfo bud: budList) { //iterate through each buddy info in address book
            bookContent += bud + "\n";
        }
        return bookContent;
    }
}
