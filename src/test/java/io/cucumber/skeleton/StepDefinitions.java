package io.cucumber.skeleton;

import io.cucumber.java.en.Given;

public class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }
    
    
   @Given("I wait {int} hour")
    public void i_wait_hour(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        
    }
    @Given("my belly should growl")
    public void my_belly_should_growl() {
        // Write code here that turns the phrase above into concrete actions
        
    }
}
