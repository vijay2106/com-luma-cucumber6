package com.softwaretestingboard.magento;

import com.softwaretestingboard.magento.propertyreader.PropertyReader;
import com.softwaretestingboard.magento.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;


/**
 * Created by Jay Vaghani
 */
public class Hooks extends Utility {
  @Before
  public void SetUP(){
    selectBrowser(PropertyReader.getInstance().getProperty("browser"));

  }
  @After
  public void tearDown(){
    closeBrowser();
  }
}
