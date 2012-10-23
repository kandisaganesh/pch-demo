package com.bestbuy.pch.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ModelMap;

public class HelloControllerTest {

  HelloController helloController;

  @Before
  public void setUp() throws Exception {

    helloController = new HelloController();

  }

  @Test
  public void printWelcome() {

    ModelMap model = mock(ModelMap.class);
    when(model.addAttribute(anyString(), anyString())).thenReturn(model);
    String result = helloController.printWelcome(model);
    assertEquals("hello", result);

  }

}
