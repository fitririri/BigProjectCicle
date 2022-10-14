package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObject.SchedulePage;

import static stepDef.HookStep.webDriver;

public class ScheduleStep {
    @Given("User already on homepage3")
    public void openSchedule () throws InterruptedException {
        SchedulePage schedulePage = new SchedulePage(webDriver);
        Thread.sleep(3000);
        schedulePage.pressTeamProject();

    }
    @When("User create event")
    public void createEvent () throws InterruptedException{
        SchedulePage schedulePage = new SchedulePage(webDriver);
        Thread.sleep(3000);
        schedulePage.pressScheduleIcon();
        schedulePage.pressButtonCreateEvent();
        Thread.sleep(1000);
        schedulePage.inputTypeEventTitle("Belajar Bersama");
        schedulePage.inputTypeYourStory("Kelompok diskusi 1 mengenai dasar pemrograman Java");
        schedulePage.pressButtonPostEvent();
    }

    @Then("Verify user success create event")
    public void verifyCreateEvent () throws InterruptedException{
        SchedulePage schedulePage = new SchedulePage(webDriver);
        Thread.sleep(3000);
        Assert.assertEquals("Create event successful", schedulePage.verifyTextCreateEvent());
    }

//    @When("User delete event")
//    public void deleteEvent () throws InterruptedException {
//        SchedulePage schedulePage = new SchedulePage(webDriver);
//        Thread.sleep(3000);
//        schedulePage.pressScheduleIcon();
//        Thread.sleep(2000);
//        schedulePage.pressSchedule1();
//        schedulePage.pressMenuSchedule();
//        schedulePage.pressDeleteEvent();
//    }
//
//    @Then("Verify user success delete event")
//    public void verifydeleteEvent () throws InterruptedException {
//        SchedulePage schedulePage = new SchedulePage(webDriver);
//        Thread.sleep(3000);
//        Assert.assertEquals("Get Event Detail successful", schedulePage.verifyTextDeleteEvent());
//    }


}
