package com.carcaran.portlet;

import com.carcaran.constants.CarCaranPortletKeys;

import com.liferay.commerce.product.service.CProductLocalServiceUtil;
import com.liferay.commerce.product.service.CommerceCatalogLocalServiceUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.ProcessAction;

import com.liferay.portal.kernel.service.UserServiceUtil;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import org.osgi.service.component.annotations.Component;

import java.io.File;

/**
 * @author hp
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=CarCaran",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + CarCaranPortletKeys.CARCARAN,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class CarCaranPortlet extends MVCPortlet {

	@ProcessAction(name = "addCar")
	public void addCar(ActionRequest actionRequest, ActionResponse actionResponse) {

		try {
			String name = ParamUtil.getString(actionRequest,"name");
			Long price = ParamUtil.getLong(actionRequest,"price");

			UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
			File attachment = uploadPortletRequest.getFile("carImage");

			System.out.println("name : " + name);
			System.out.println("price : " + price);
			System.out.println("attachment : " + attachment);

			actionResponse.setRenderParameter("jspPage", "/view.jsp");

		} catch (Exception e ) {
			System.out.println("Error occur In CarCaranPortlet.java");
			System.out.println("Error occur In addCar method");
			System.out.println("Error : " + e);
		}
	}

}