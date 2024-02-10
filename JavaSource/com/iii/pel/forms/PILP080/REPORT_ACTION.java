package com.iii.pel.forms.PILP080;

import javax.faces.component.UIInput;
import javax.faces.event.ActionEvent;
import javax.faces.event.PhaseEvent;

import com.iii.apps.persistence.CRUDHandler;
import com.iii.premia.common.action.CommonAction;
import com.iii.premia.common.constants.PELConstants;
import com.iii.premia.common.errorUtil.ErrorHelpUtil;
import com.iii.premia.common.utils.CommonUtils;

public class REPORT_ACTION extends CommonAction {

	private REPORT REPORT_BEAN;

	public PILP080_COMPOSITE_ACTION compositeAction;

	private REPORT_HELPER helper;



public REPORT_ACTION(){


REPORT_BEAN = new REPORT();
helper = new REPORT_HELPER();
}

	public REPORT getREPORT_BEAN() {
		return REPORT_BEAN;
	}

	public void setREPORT_BEAN(REPORT REPORT_BEAN) {
		this.REPORT_BEAN = REPORT_BEAN;
	}
	public void saveRecord() {
		try {
			if (getREPORT_BEAN().getROWID() != null) {
				new CRUDHandler().executeInsert(getREPORT_BEAN(), CommonUtils.getConnection());
			} else {
				new CRUDHandler().executeInsert(getREPORT_BEAN(), CommonUtils.getConnection());
			}
			CommonUtils.getConnection().commit();
		} catch (Exception e) {
			getErrorMap().put(PELConstants.PEL_ERROR_WARNING_CURRENT_KEY, e.getMessage());
			getErrorMap().put("SAVE", e.getMessage());
		}
	}


	public void fireFieldValidation(ActionEvent actionEvent) {
		UIInput input = (UIInput) actionEvent.getComponent().getParent();
		ErrorHelpUtil.validate(input, getErrorMap());
	}
	public void onLoad(PhaseEvent event) {
 try {
	if (isBlockFlag()) {
		}
	} catch (Exception e) {
 getErrorMap().put(PELConstants.PEL_ERROR_WARNING_CURRENT_KEY,e.getMessage());
 getErrorMap().put("onLoad",e.getMessage());
 }
 }

}