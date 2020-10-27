package com.tryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesPage {

        @FindBy(xpath = "//body[1]/header[1]/div[1]/ul[1]/li[1]/a[1]/svg[1]/image[1]")
        private WebElement filesTab;
        @FindBy(linkText = "All files")
        private WebElement All_files;
        // @FindBy (xpath = "//a[contains(text(),'Recent')]")
        // @FindBy (linkText = "Recent")
        @FindBy(className = "nav-icon-recent svg")
        private WebElement Recent;
        // @FindBy (xpath = "//a[contains(text(),'Favorites')]")
        @FindBy(linkText = "Favorites")
        private WebElement Favorites;
        // @FindBy (xpath = "//a[contains(text(),'Shares')]")
        // @FindBy (linkText = "Shares")
        @FindBy(className = "nav-icon-shareoverview svg")
        private WebElement Shares;
        // @FindBy (xpath = "//a[contains(text(),'Tags')]")
        // @FindBy (linkText ="Tags" )
        @FindBy(className = "nav-icon-systemtagsfilter svg")
        private WebElement Tags;
        // @FindBy (xpath = "//a[contains(text(),'Deleted files')]")
        //  @FindBy (linkText = "Deleted files")
        @FindBy(className = "nav-icon-trashbin svg active")
        private WebElement Deleted_files;
        //@FindBy(xpath = "//button[contains(text(),'Settings')]")
        @FindBy(className = "settings-button")
        private WebElement Settings;
        @FindBy(className = "icon icon-add")
        private WebElement plus_sign;
        @FindBy(xpath = "//span[contains(text(),'Upload file')]")
        private WebElement Upload_file;
        @FindBy(xpath = "//span[contains(text(),'New folder')]")
        private WebElement New_folder;
        @FindBy(className = "icon-confirm")
        private WebElement arrow;
        @FindBy(xpath = "//span[contains(text(),'New text file')]")
        private WebElement New_text_file;
        @FindBy(className = "icon-close svg")
        private WebElement close_button;
        @FindBy(xpath = "//tbody/tr[1]/td[2]/a[1]/span[3]/a[2]/span[1]")
        //tbody/tr[2]/td[2]/a[1]/span[3]/a[2]/span[1]
        //tbody/tr[3]/td[2]/a[1]/span[3]/a[2]/span[1]
        private WebElement more_icon;
        @FindBy(xpath = "//span[contains(text(),'Add to favorites')]")
        private WebElement Add_to_favorites;
        @FindBy(xpath = "//span[contains(text(),'Details')]")
        private WebElement Details;
    }

