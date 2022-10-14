package stepDef;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObject.ChatPage;

import static stepDef.HookStep.webDriver;


public class ChatStep {

    @Given("User already on homepage2")
    public void openHomepage () throws InterruptedException {
        ChatPage chatPage = new ChatPage(webDriver);
        Thread.sleep(3000);
        chatPage.pressTeamProject();
    }


    @When("User type message")
    public void typeMessage() throws InterruptedException {
        ChatPage chatPage = new ChatPage(webDriver);
        Thread.sleep(3000);
        chatPage.pressGroupChatIcon();
        Thread.sleep(2000);
        chatPage.inputTypeMessage("Halo");
    }

    @And("User send message")
    public void sendMessage() throws InterruptedException {
        ChatPage chatPage = new ChatPage(webDriver);
        Thread.sleep(3000);
        chatPage.pressButtonSendMessage();
    }

    @Then("Verify user success send message")
    public void verifySuccessSendMessage() throws InterruptedException {
        ChatPage chatPage = new ChatPage(webDriver);
        Thread.sleep(3000);
        Assert.assertEquals("Halo", chatPage.verifyMessageSent());
    }

//    @And("User delete message")
//    public void deleteMessage() throws InterruptedException {
//        ChatPage chatPage = new ChatPage(webDriver);
//        Thread.sleep(3000);
//        chatPage.pressGroupChatIcon();
//        Thread.sleep(3000);
//        Assert.assertEquals("Halo", chatPage.verifyMessageSent());
//        chatPage.pressMenuMessage();
//        chatPage.pressButtonDeleteMessage();
//        chatPage.pressButtonPopUpDeleteMessage();
//    }
//
//    @Then("Verify user success delete message")
//    public void verifySuccessDeleteMessage() throws InterruptedException {
//        ChatPage chatPage = new ChatPage(webDriver);
//        Thread.sleep(3000);
//        Assert.assertEquals("Delete group chat message success", chatPage.verifyTextDeleteMessage());
//    }
}
