package hbui.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class simpleTest {
    @Test
    public void checkStonks(){
        BuddyInfo bud = new BuddyInfo("Abe", "123 Louise", "1112223333");
        assertEquals(0, bud.getNumStonks());
        bud.setNumStonks(4);
        assertEquals(4, bud.getNumStonks());
    }
}
