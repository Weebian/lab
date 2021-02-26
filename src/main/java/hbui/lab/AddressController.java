/**
 * Class for controller
 *
 * @author Hoang Bui 101029049
 */
package hbui.lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AddressController {
    @Autowired
    private AddressBookRepo repo;

    @Autowired
    private BuddyInfoRepo budRepo;

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
        model.addAttribute("id", Long.toString(id));
        return "addressbook";
    }

    @GetMapping("/bookform")
    public String bookForm() {
        return "bookForm";
    }

    @PostMapping("/bookform")
    public String bookSubmit(Model model) {
        AddressBook book = new AddressBook();
        repo.save(book);
        model.addAttribute("id", Long.toString(book.getId()));
        return "bookDirect";
    }

    @GetMapping("/budform/{id}")
    public String budForm(@PathVariable long id, Model model) {
        model.addAttribute("bud", new BuddyInfo());
        model.addAttribute("id", Long.toString(id));
        return "budForm";
    }

    @PostMapping("/budform/{id}")
    public String budSubmit(@PathVariable long id, @ModelAttribute BuddyInfo bud, Model model) {
        model.addAttribute("bud", bud);
        AddressBook book = repo.findById(id);
        bud.setBook(book);
        budRepo.save(bud);
        return "bookDirect";
    }
}
