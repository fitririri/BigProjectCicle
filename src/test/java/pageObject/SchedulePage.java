package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchedulePage {

    public static WebDriver webDriver;

    public SchedulePage(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
    }
    @FindBy(xpath = "//a[@href='/companies/61eba2c85080f47b25ddc8f8/teams/632e85853c6e10177263cc5b']/div[@class='Card_Card__2LWWW']")
    private WebElement teamProject;

    @FindBy(xpath = "//a[@href='/companies/61eba2c85080f47b25ddc8f8/teams/632e85853c6e10177263cc5b/schedules/632e85853c6e10177263cc62']/div[@class='BoxMenu_container__1flgD']")
    private WebElement scheduleIcon;

    @FindBy(xpath = "//div[@class='GlobalActionButton_container__EJ7Lh']")
    private WebElement buttonCreateEvent;

    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement typeEventTitle;

    @FindBy(xpath = "//div[@class='CreateEventPage_schedule__start__agSZ6']//div[@class='CreateEventPage_datePicker__3uZj9']//input[@class='MuiInput-input MuiInputBase-input MuiInputBase-inputAdornedEnd css-mnn31']")
    private WebElement startDate;

    @FindBy(xpath = "//input[@value='08:00 PM']")
    private WebElement startClock;

    @FindBy(xpath = "//div[@class='CreateEventPage_schedule__end__JkxY5']//div[@class='CreateEventPage_datePicker__3uZj9']//input[@class='MuiInput-input MuiInputBase-input MuiInputBase-inputAdornedEnd css-mnn31']")
    private WebElement endDate;

    @FindBy(xpath = "//input[@value='09:00 PM']")
    private WebElement endClock;


    @FindBy(xpath = "//div[@class='fr-element fr-view']/p[1]")
    private WebElement typeYourStory;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    private WebElement buttonPostEvent;

    @FindBy(xpath = "//div[@id='notistack-snackbar']")
    private WebElement textCreateEvent;

    @FindBy(xpath = "//a[@href='/companies/61eba2c85080f47b25ddc8f8/teams/632e85853c6e10177263cc5b/events/63457743c4be5cc234acc0a4']/div[@class='Event_Event__20M2n']")
    private WebElement schedule1;

    @FindBy(xpath = "[data-testid='MoreHorizIcon']")
    private WebElement menuSchedule;
    ////div[@class='RoundActionMenu_container__2ta8s RoundActionMenu_medium__3rLho']

    @FindBy(xpath = "//div[.='Archive This Event']")
    private WebElement deleteEvent;

    @FindBy(xpath = "//div[@id='notistack-snackbar']")
    private WebElement textDeleteEvent;

    public void pressTeamProject(){
        teamProject.click();
    }

    public void pressScheduleIcon(){
        scheduleIcon.click();
    }

    public void pressButtonCreateEvent(){
        buttonCreateEvent.click();
    }

    public void inputTypeEventTitle(String typetitleevent){
        typeEventTitle.sendKeys(typetitleevent);
    }

    public void inputTypeYourStory(String typestory){
        typeYourStory.sendKeys(typestory);
    }

    public void pressButtonPostEvent(){
        buttonPostEvent.click();
    }

    public String verifyTextCreateEvent(){
        return textCreateEvent.getText();
    }

    public void pressSchedule1(){
        schedule1.click();
    }

    public void pressMenuSchedule(){
        menuSchedule.click();
    }

    public void pressDeleteEvent(){
        deleteEvent.click();
    }

    public String verifyTextDeleteEvent(){
        return textDeleteEvent.getText();
    }

}
