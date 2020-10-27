package com.tryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GalleryPage extends PageBase {

    @FindBy(xpath = "(//span[contains(text(),'Gallery')])[1]")
    private WebElement galleryTab;

    @FindBy(className = "icon icon-add")
    private WebElement plusSign;

    @FindBy(className = "svg icon icon-upload")
    private WebElement upload;

    @FindBy(xpath = "//img[@alt='Sort by name']")
    private WebElement sortAscDesc;

    @FindBy(xpath = "//img[@alt='Sort by date']")
    private WebElement sortByCalendar;

  //  @FindBy(xpath = "//div[@class='image container']")
    // private List<WebElement> galleryList();

    public WebElement getGalleryTab() {
        return galleryTab;
    }

    public WebElement getPlusSign() {
        return plusSign;
    }

    public WebElement getUpload() {
        return upload;
    }

    public WebElement getSortAscDesc() {
        return sortAscDesc;
    }

    public WebElement getSortByCalendar() {
        return sortByCalendar;
    }

}
