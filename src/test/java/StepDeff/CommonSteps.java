package StepDeff;

import Com.Tem.App.Login;
import Urils.DependencyUtil;
import io.cucumber.java.en.Given;

public class CommonSteps {

    DependencyUtil service;

    public CommonSteps(DependencyUtil service) {
        this.service = service;
    }

    String userName = "ase";
    String password = "123";

    Login login;

    @Given("I have signed in to Netflix")
    public void i_have_signed_in_to_netflix() {
        //service.scenario.write("I have something");
        login = new Login(userName, password);
        System.out.println("Signed in..." + " " + login.getUserName() + " " + login.getPassword());
    }
}
