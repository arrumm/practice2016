package ru.qatools.school.pages.blocks.widgetblocks;

import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

/**
 * Created by kurau.
 */
public class WidgetText extends HtmlElement {

    @Name("Картинка текущей погоды")
    @FindBy(css = ".weather-image")
    private WebElement weatherImage;

    @Name("Значение температуры")
    @FindBy(css = ".weather-temperature__digit")
    private WebElement temperature;

    public WebElement getTemperature() {
        return temperature;
    }

    public WebElement getWeatherImage() {
        return weatherImage;
    }

    public Rectangle getRect() {
        return null;
    }
}
