package com.example.demo;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 *
 * @author Muhammad Rizwan
 */

@SpringUI
public class DexDevUI extends UI{

    @Override
    protected void init(VaadinRequest request) {
        setContent(new Label("lsjdfklsjkljfkldj"));
    }
    
}
