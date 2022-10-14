package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatPage {
    public static WebDriver webDriver;

    public ChatPage(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
    }

    @FindBy(xpath = "//h1[.='Sekolah QA']")
    private WebElement textHomepage2;

    @FindBy(xpath = "//a[@href='/companies/61eba2c85080f47b25ddc8f8/teams/632e85853c6e10177263cc5b']/div[@class='Card_Card__2LWWW']")
    private WebElement teamProject;

    @FindBy(xpath = "//a[@href='/companies/61eba2c85080f47b25ddc8f8/teams/632e85853c6e10177263cc5b/group-chats/632e85853c6e10177263cc5f']/div[@class='BoxMenu_container__1flgD']")
    private WebElement groupChatIcon;

    @FindBy(xpath = "//div[@class='fr-element fr-view']")
    private WebElement typeMessage;

    @FindBy(xpath = "//div[@class='CreateMessage_send__2f1ZQ']")
    private WebElement buttonSendMessage;

    @FindBy(xpath = "//p[.='Halo']")
    private WebElement textMessageSent;
    ////p[.='Halo']

    @FindBy(xpath = "[data-testid='AttachFileIcon']")
    private WebElement buttonAttachFile;

    @FindBy(xpath = "(//div[@class='Message_iconOption__3F-Ru'])[1]")
    private WebElement menuMessage;
    //(//div[@class='Message_iconOption__3F-Ru'])[1]
    ////div[@class='Message_iconOption__3F-Ru']
    @FindBy(xpath = "//div[@class='MessageMenuPopUp_menu__1rkRG']")
    private WebElement buttonDeleteMessage;
    //className = "MessageMenuPopUp_menu__1rkRG"

    @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement buttonPopUpDeleteMessage;

    @FindBy(xpath = "//div[@id='notistack-snackbar']")
    private WebElement textDeleteMessage;

    @FindBy(xpath = "//div[12]//a[.='Download']")
    private WebElement buttonDownloadAttachment;

    @FindBy(xpath = "//div[@class='infinite-scroll-component ']//div[@class='Message_balloon__zRoXK']")
    private WebElement boxMessageSent;

    public String verifyHomepage2(){
        return textHomepage2.getText();
    }

    public void pressTeamProject(){
        teamProject.click();
    }

    public void pressGroupChatIcon(){groupChatIcon.click();}

    public void inputTypeMessage(String typemessage){
        typeMessage.sendKeys(typemessage);
    }

    public void pressButtonSendMessage(){
        buttonSendMessage.click();
    }

    public String verifyMessageSent(){
        return textMessageSent.getText();
    }


    public void pressMenuMessage(){menuMessage.click();}

    public void pressButtonDeleteMessage(){
        buttonDeleteMessage.click();
    }

    public void pressButtonPopUpDeleteMessage(){
        buttonPopUpDeleteMessage.click();
    }

    public String verifyTextDeleteMessage(){
        return textDeleteMessage.getText();
    }

    public String verifyBoxMessageSent(){
        return boxMessageSent.getText();
    }

}
