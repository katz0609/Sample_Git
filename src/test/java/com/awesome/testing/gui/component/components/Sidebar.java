package com.awesome.testing.gui.component.components;

import org.fluentlenium.core.FluentControl;
import org.fluentlenium.core.components.ComponentInstantiator;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.WebElement;

public class Sidebar extends FluentWebElement {

    public Sidebar(WebElement element, FluentControl control, ComponentInstantiator instantiator) {
        super(element, control, instantiator);
    }
}
