package hbui.lab;

import static java.util.function.Predicate.not;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class AppTest {
    @Autowired
    private MockMvc mock;

    @Test
    public void checkStatus() throws Exception {
        this.mock.perform(get("/")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("\"bud\" : {")));
    }

    @Test
    public void testAddressBookForm() throws Exception {
        this.mock.perform(get("/addressbook/1")).andExpect(status().isOk())
                .andExpect(content().string(containsString("Name")));
    }

}
