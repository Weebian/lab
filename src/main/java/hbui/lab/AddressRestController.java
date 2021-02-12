/**
 * Class for controller
 *
 * @author Hoang Bui 101029049
 */
package hbui.lab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressRestController {
    private AddressBookRepo repo;

    public AddressRestController(AddressBookRepo repo) {
        this.repo = repo;
    }
}
