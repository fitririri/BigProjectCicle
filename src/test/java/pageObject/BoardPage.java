package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BoardPage {
    public static WebDriver webDriver;

    public BoardPage(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
    }


    @FindBy(xpath = "//a[@href='/companies/61eba2c85080f47b25ddc8f8/teams/632e85853c6e10177263cc5b']/div[@class='Card_Card__2LWWW']")
    private WebElement teamProject;

    @FindBy(xpath = "//a[@href='/companies/61eba2c85080f47b25ddc8f8/teams/632e85853c6e10177263cc5b/boards/632e85853c6e10177263cc5e']/div[@class='BoxMenu_container__1flgD']")
    private WebElement boardIcon;

    @FindBy(xpath = "//div[@class='ListContainer_ListContainer__outerList__1PG0-']/div[3]//div[@class='ListContainer_ListContainer__buttonBottom__2kZAI']")
    private WebElement iconAddCard;

    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement inputCardName;

    @FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
    private WebElement buttonAddCard;

    @FindBy(xpath = "//div[@id='notistack-snackbar']")
    private WebElement textSuccesAddCard;

    @FindBy(xpath = "//button[@class='btn btn-outline-dark btn-block btn-sm']")
    private WebElement iconAddList;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement inputListName;

    @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement buttonCreateList;

    @FindBy(xpath = "//div[@class='SnackbarContent-root SnackbarItem-contentRoot SnackbarItem-variantSuccess SnackbarItem-lessPadding css-hped4j']")
    private WebElement textSuccessAddList;

    @FindBy(xpath = "//div[@class='ListContainer_ListContainer__outerList__1PG0-']/div[1]//div[@class='RoundActionMenu_container__2ta8s']")
    private WebElement iconListAction;

    @FindBy(xpath = "//div[.='Archive This List']")
    private WebElement buttonArchiveList;

    @FindBy(xpath = "//div[@id='notistack-snackbar']")
    private WebElement textSuccessListMovedToArchived;

    @FindBy(xpath = "//div[@id='editCardMenu']")
    private WebElement iconEditCard;

    @FindBy(xpath = "//div[10]//div[@class='EditCardMenu_menu__2xvBw']")
    private WebElement buttonArchiveCard;

    @FindBy(xpath = "//div[@id='notistack-snackbar']")
    private WebElement textSuccedCardMovedToArchived;

    @FindBy(xpath = "//div[@id='notistack-snackbar']")
    private WebElement textCardNameCannotBeEmpty;


    public void pressTeamProject(){
        teamProject.click();
    }

    public void pressBoardIcon(){
        boardIcon.click();
    }

    public void pressIconAddCard(){
        iconAddCard.click();
    }

    public void inputCardName(String cardname){
        inputCardName.sendKeys(cardname);
    }

    public void pressButtonAddCard(){
        buttonAddCard.click();
    }

    public String verifySuccessAddCard(){
        return textSuccesAddCard.getText();
    }

    public void pressIconAddList(){
        iconAddList.click();
    }

    public void inputListName(String listname){
        inputListName.sendKeys(listname);
    }

    public void pressButtonCreateList(){
        buttonCreateList.click();
    }

    public String verifySuccessAddList(){
        return textSuccessAddList.getText();
    }

    public void pressIconListAction(){
        iconListAction.click();
    }

    public void pressButtonArchiveList(){
        buttonArchiveList.click();
    }

    public String verifySuccessListMovedToArchived(){
        return textSuccessListMovedToArchived.getText();
    }

    public void pressIconEditCard(){
        iconEditCard.click();
    }

    public void pressButtonArchiveCard(){
        buttonArchiveCard.click();
    }

    public String verifySuccedCardMovedToArchived(){
        return textSuccedCardMovedToArchived.getText();
    }

    public String verifyCardNameCannotBeEmpty(){
        return textCardNameCannotBeEmpty.getText();
    }
}
