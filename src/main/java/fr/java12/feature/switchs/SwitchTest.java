package fr.java12.feature.switchs;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SwitchTest {

    private Switch aSwitch;

    @BeforeEach
    void before(){
        aSwitch = new Switch();
    }

    @Test
    void test_OldSwitch_OldSwitch_given_A_should_return_Excellent() {
        Assertions.assertEquals("Excellent", aSwitch.getGradeUsingOldSwitch('A'));
    }

    @Test
    void test_OldSwitch_given_B_should_return_Well_done() {
        Assertions.assertEquals("Well done", aSwitch.getGradeUsingOldSwitch('B'));
    }

    @Test
    void test_OldSwitch_given_C_should_return_Well_done() {
        Assertions.assertEquals("Well done", aSwitch.getGradeUsingOldSwitch('C'));
    }

    @Test
    void test_OldSwitch_given_D_should_return_Passed() {
        Assertions.assertEquals("Passed", aSwitch.getGradeUsingOldSwitch('D'));
    }

    @Test
    void test_OldSwitch_given_F_should_return_Well_done() {
        Assertions.assertEquals("Try again", aSwitch.getGradeUsingOldSwitch('F'));
    }

    @Test
    void test_OldSwitch_given_WrongNote_should_return_Invalid() {
        Assertions.assertEquals("Invalid", aSwitch.getGradeUsingOldSwitch('G'));
    }

    @Test
    void test_SwitchExpression_OldSwitch_given_A_should_return_Excellent() {
        Assertions.assertEquals("Excellent", aSwitch.getGradeUsingSwitchExpression('A'));
    }

    @Test
    void test_SwitchExpression_given_B_should_return_Well_done() {
        Assertions.assertEquals("Well done", aSwitch.getGradeUsingSwitchExpression('B'));
    }

    @Test
    void test_SwitchExpression_given_C_should_return_Well_done() {
        Assertions.assertEquals("Well done", aSwitch.getGradeUsingSwitchExpression('C'));
    }

    @Test
    void test_SwitchExpression_given_D_should_return_Passed() {
        Assertions.assertEquals("Passed", aSwitch.getGradeUsingSwitchExpression('D'));
    }

    @Test
    void test_SwitchExpression_given_F_should_return_Well_done() {
        Assertions.assertEquals("Try again", aSwitch.getGradeUsingSwitchExpression('F'));
    }

    @Test
    void test_SwitchExpression_given_WrongNote_should_return_Invalid() {
        Assertions.assertEquals("Invalid", aSwitch.getGradeUsingSwitchExpression('G'));
    }

    @AfterEach
    void after(){
        aSwitch = null;
    }
}
