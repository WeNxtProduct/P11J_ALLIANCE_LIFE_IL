package com.iii.pel.forms.PILM002_APAC;

import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputLabel;

import com.iii.pel.forms.PILT002_APAC.PILT002_APAC_COMPOSITE_ACTION;
import com.iii.premia.common.action.CommonAction;

public class CTRL_ACTION extends CommonAction{

	private HtmlOutputLabel COMP_UI_M_USER_DISP_LABEL;
	public PILT002_APAC_COMPOSITE_ACTION compositeAction;
	private HtmlInputText COMP_UI_M_USER_DISP;

	private CTRL CTRL_BEAN;

	public CTRL_ACTION() {
		CTRL_BEAN = new CTRL();
	}

	public HtmlOutputLabel getCOMP_UI_M_USER_DISP_LABEL() {
		return COMP_UI_M_USER_DISP_LABEL;
	}

	public HtmlInputText getCOMP_UI_M_USER_DISP() {
		return COMP_UI_M_USER_DISP;
	}

	public void setCOMP_UI_M_USER_DISP_LABEL(HtmlOutputLabel COMP_UI_M_USER_DISP_LABEL) {
		this.COMP_UI_M_USER_DISP_LABEL = COMP_UI_M_USER_DISP_LABEL;
	}

	public void setCOMP_UI_M_USER_DISP(HtmlInputText COMP_UI_M_USER_DISP) {
		this.COMP_UI_M_USER_DISP = COMP_UI_M_USER_DISP;
	}

	public CTRL getCTRL_BEAN() {
		return CTRL_BEAN;
	}

	public void setCTRL_BEAN(CTRL CTRL_BEAN) {
		this.CTRL_BEAN = CTRL_BEAN;
	}
}