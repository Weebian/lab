/**
 * Class for controller
 *
 * @author Hoang Bui 101029049
 */
package hbui.lab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AddressController {
    private static final String template = "Hello, %s!";
    private AddressBookRepo repo;

    public AddressController(AddressBookRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/addressbook/{id}")
    public String showBook(@PathVariable long id, Model model) {
        AddressBook book = repo.findById(id);
        if (book == null){
            model.addAttribute("isEmpty", true);
            return "addressbook";
        }
        System.out.println(book);
        model.addAttribute("isEmpty", false);
        model.addAttribute("book", book.getBudList());
        model.addAttribute("id", id);
        return "addressbook";
    }
}
