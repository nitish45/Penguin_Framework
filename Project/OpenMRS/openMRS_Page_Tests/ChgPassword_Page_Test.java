package openMRS_Page_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import OpenMRS.PropertyReader;
import base_Architecture.BaseClass;
import openMRS_Page_Actions.ChgPassword_Page_Action;
import openMRS_Page_Actions.Home_Page_Action;
import openMRS_Page_Actions.Login_Page_Action;

public class ChgPassword_Page_Test extends BaseClass{
	
    @Test (priority = 1, description="valid Change Password Scenario with wrong new password and confirm password.")
    public void inCorrectPassword () throws InterruptedException {
        
        ChgPassword_Page_Action chgpPA = new ChgPassword_Page_Action(driver);
        String incPassMsgTC9 = chgpPA.passUpdateFailPopUpMsg(PropertyReader.getValue("ui.application.password"),PropertyReader.getValue("ui.application.incorrectnewpasswordTC9"),PropertyReader.getValue("ui.application.incorrectconfpasswordTC9"));
        Assert.assertEquals(PropertyReader.getValue("ui.application.popUpMessageTC9"), incPassMsgTC9);
	    // l
     }

}
