package org.jrao.testpacl;

import java.io.File;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class TestPACLPortlet
 */
public class TestPACLPortlet extends MVCPortlet {
	
	public void inputTestFilePath(ActionRequest request, ActionResponse response) {
		String testFilePath = ParamUtil.getString(request, "testFilePath");
		
		File testFile = new File(testFilePath);

		if (testFile.exists()) {
			ExercisePACL.exercisePACL(testFilePath);
		}
		else {
			System.out.println("Invalid test file path: " + testFilePath);
		}
	}
 
}
