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

@RestController
public class AddressRestController {
    @Autowired
    private AddressBookRepo repo;

    @Autowired
    private BuddyInfoRepo budRepo;

    public AddressRestController(AddressBookRepo repo) {
        this.repo = repo;
    }
}
