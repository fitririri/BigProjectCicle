package stepDef;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObject.BoardPage;

import static stepDef.HookStep.webDriver;

public class BoardStep {

    //board1
    @Given("User already on homepage")
    public void openHomepageCicle () throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(3000);
        boardPage.pressTeamProject();
    }

    @When("User choose board")
    public void chooseBoard() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(3000);
        boardPage.pressBoardIcon();
        Thread.sleep(2000);

    }
    @And("User add new card")
    public void addNewCard() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(3000);
        boardPage.pressIconAddCard();
        boardPage.inputCardName("Story 1");
        boardPage.pressButtonAddCard();
    }
    @Then("Verify user success create card")
    public void verifyCreateCard() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(3000);
        Assert.assertEquals("Creating card is success", boardPage.verifySuccessAddCard());
    }
    //board2
    @And("User add new list")
    public void addNewList() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(3000);
        boardPage.pressIconAddList();
        boardPage.inputListName("List 1");
        boardPage.pressButtonCreateList();
    }

    @Then("Verify user success create list")
    public void verifyCreateList() throws InterruptedException{
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(3000);
        Assert.assertEquals("Creating list is success", boardPage.verifySuccessAddList());
    }
    //board3
    @And("User archive list")
    public void archiveList() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(3000);
        boardPage.pressIconListAction();
        boardPage.pressButtonArchiveList();
    }

    @Then("Verify user success move list to archive")
    public void verifyArchiveList() throws InterruptedException{
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(3000);
        Assert.assertEquals("List 1 list has been moved to archived", boardPage.verifySuccessListMovedToArchived());
    }
    //board4
    @And("User archive card")
    public void archiveCard() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(3000);
        boardPage.pressIconEditCard();
        boardPage.pressButtonArchiveCard();
    }

    @Then("Verify user success move card to archive")
    public void verifyArchiveCard() throws InterruptedException{
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(3000);
        Assert.assertEquals("Story card has been moved to archived", boardPage.verifySuccedCardMovedToArchived());
    }
    //board5
    @And("User did not input name card")
    public void notInputNameCard() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(3000);
        boardPage.pressIconAddCard();
        boardPage.pressButtonAddCard();
    }

    @Then("Verify card name cannot be empty")
    public void verifyEmptyNameCard() throws InterruptedException{
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(3000);
        Assert.assertEquals("Card name cannot be empty", boardPage.verifyCardNameCannotBeEmpty());
    }

}
