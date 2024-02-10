package com.iii.pel.forms.PILQ020;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.component.UIData;
import javax.faces.component.UIInput;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import org.richfaces.component.html.HtmlCalendar;

import com.iii.premia.common.action.CommonAction;
import com.iii.premia.common.constants.PELConstants;
import com.iii.premia.common.errorUtil.ErrorHelpUtil;
import com.iii.premia.common.errorUtil.Messages;
import com.iii.premia.common.utils.CommonUtils;

public class PT_IL_PYMT_DTLS_ACTION extends CommonAction {

	private HtmlOutputLabel COMP_PD_PAY_MODE_LABEL;

	private HtmlSelectOneMenu COMP_PD_PAY_MODE;

	private HtmlOutputLabel COMP_PD_LC_AMT_LABEL;

	private HtmlInputText COMP_PD_LC_AMT;

	private HtmlOutputLabel COMP_PD_CHQ_DT_LABEL;

	private HtmlCalendar COMP_PD_CHQ_DT;

	private HtmlOutputLabel COMP_PD_BANK_NAME_LABEL;

	private HtmlInputText COMP_PD_BANK_NAME;

	private HtmlOutputLabel COMP_PD_CHQ_NO_LABEL;

	private HtmlInputText COMP_PD_CHQ_NO;

	private PT_IL_PYMT_DTLS PT_IL_PYMT_DTLS_BEAN;

	public PILQ020_COMPOSITE_ACTION compositeAction;

	private PT_IL_PYMT_DTLS_HELPER helper;

	private List<PT_IL_PYMT_DTLS> dataList_PT_IL_PYMT_DTLS = new ArrayList<PT_IL_PYMT_DTLS>();

	private UIData dataTable;

	private List<SelectItem> listPD_PAY_MODE = new ArrayList<SelectItem>();

	public PT_IL_PYMT_DTLS_ACTION() {

		PT_IL_PYMT_DTLS_BEAN = new PT_IL_PYMT_DTLS();
		helper = new PT_IL_PYMT_DTLS_HELPER();
	}

	public HtmlOutputLabel getCOMP_PD_PAY_MODE_LABEL() {
		return COMP_PD_PAY_MODE_LABEL;
	}

	public HtmlSelectOneMenu getCOMP_PD_PAY_MODE() {
		return COMP_PD_PAY_MODE;
	}

	public void setCOMP_PD_PAY_MODE_LABEL(HtmlOutputLabel COMP_PD_PAY_MODE_LABEL) {
		this.COMP_PD_PAY_MODE_LABEL = COMP_PD_PAY_MODE_LABEL;
	}

	public void setCOMP_PD_PAY_MODE(HtmlSelectOneMenu COMP_PD_PAY_MODE) {
		this.COMP_PD_PAY_MODE = COMP_PD_PAY_MODE;
	}

	public HtmlOutputLabel getCOMP_PD_LC_AMT_LABEL() {
		return COMP_PD_LC_AMT_LABEL;
	}

	public HtmlInputText getCOMP_PD_LC_AMT() {
		return COMP_PD_LC_AMT;
	}

	public void setCOMP_PD_LC_AMT_LABEL(HtmlOutputLabel COMP_PD_LC_AMT_LABEL) {
		this.COMP_PD_LC_AMT_LABEL = COMP_PD_LC_AMT_LABEL;
	}

	public void setCOMP_PD_LC_AMT(HtmlInputText COMP_PD_LC_AMT) {
		this.COMP_PD_LC_AMT = COMP_PD_LC_AMT;
	}

	public HtmlOutputLabel getCOMP_PD_CHQ_DT_LABEL() {
		return COMP_PD_CHQ_DT_LABEL;
	}

	public HtmlCalendar getCOMP_PD_CHQ_DT() {
		return COMP_PD_CHQ_DT;
	}

	public void setCOMP_PD_CHQ_DT_LABEL(HtmlOutputLabel COMP_PD_CHQ_DT_LABEL) {
		this.COMP_PD_CHQ_DT_LABEL = COMP_PD_CHQ_DT_LABEL;
	}

	public void setCOMP_PD_CHQ_DT(HtmlCalendar COMP_PD_CHQ_DT) {
		this.COMP_PD_CHQ_DT = COMP_PD_CHQ_DT;
	}

	public HtmlOutputLabel getCOMP_PD_BANK_NAME_LABEL() {
		return COMP_PD_BANK_NAME_LABEL;
	}

	public HtmlInputText getCOMP_PD_BANK_NAME() {
		return COMP_PD_BANK_NAME;
	}

	public void setCOMP_PD_BANK_NAME_LABEL(
			HtmlOutputLabel COMP_PD_BANK_NAME_LABEL) {
		this.COMP_PD_BANK_NAME_LABEL = COMP_PD_BANK_NAME_LABEL;
	}

	public void setCOMP_PD_BANK_NAME(HtmlInputText COMP_PD_BANK_NAME) {
		this.COMP_PD_BANK_NAME = COMP_PD_BANK_NAME;
	}

	public HtmlOutputLabel getCOMP_PD_CHQ_NO_LABEL() {
		return COMP_PD_CHQ_NO_LABEL;
	}

	public HtmlInputText getCOMP_PD_CHQ_NO() {
		return COMP_PD_CHQ_NO;
	}

	public void setCOMP_PD_CHQ_NO_LABEL(HtmlOutputLabel COMP_PD_CHQ_NO_LABEL) {
		this.COMP_PD_CHQ_NO_LABEL = COMP_PD_CHQ_NO_LABEL;
	}

	public void setCOMP_PD_CHQ_NO(HtmlInputText COMP_PD_CHQ_NO) {
		this.COMP_PD_CHQ_NO = COMP_PD_CHQ_NO;
	}

	public PT_IL_PYMT_DTLS getPT_IL_PYMT_DTLS_BEAN() {
		return PT_IL_PYMT_DTLS_BEAN;
	}

	public void setPT_IL_PYMT_DTLS_BEAN(PT_IL_PYMT_DTLS PT_IL_PYMT_DTLS_BEAN) {
		this.PT_IL_PYMT_DTLS_BEAN = PT_IL_PYMT_DTLS_BEAN;
	}

	public List<PT_IL_PYMT_DTLS> getDataList_PT_IL_PYMT_DTLS() {
		return dataList_PT_IL_PYMT_DTLS;
	}

	public void setDataListPT_IL_PYMT_DTLS(
			List<PT_IL_PYMT_DTLS> dataList_PT_IL_PYMT_DTLS) {
		this.dataList_PT_IL_PYMT_DTLS = dataList_PT_IL_PYMT_DTLS;
	}

	public void addRow(ActionEvent event) {
		try {
			if (isINSERT_ALLOWED()) {

				PT_IL_PYMT_DTLS_BEAN = new PT_IL_PYMT_DTLS();
				// resetAllComponent();
				// resetSelectedRow();
			} else {

				getErrorMap().put(
						"addRow",
						Messages.getString(
								PELConstants.pelMessagePropertiesPath,
								"errorPanel$message$insertnotallowed"));
				getErrorMap().put(
						PELConstants.PEL_ERROR_WARNING_CURRENT_KEY,
						Messages.getString(
								PELConstants.pelMessagePropertiesPath,
								"errorPanel$message$insertnotallowed"));
			}

		} catch (Exception exc) {
			getErrorMap().put(PELConstants.PEL_ERROR_WARNING_CURRENT_KEY,
					exc.getMessage());
			getErrorMap().put("addRow", exc.getMessage());
		}

	}

	public void saveRecord() {
		try {
			CommonUtils.getConnection().commit();
		} catch (Exception e) {
			getErrorMap().put(PELConstants.PEL_ERROR_WARNING_CURRENT_KEY,
					e.getMessage());
			getErrorMap().put("SAVE", e.getMessage());
		}
	}

	public List<SelectItem> getListPD_PAY_MODE() {
		if (listPD_PAY_MODE.size() == 0) {
			listPD_PAY_MODE.clear();
			try {
				listPD_PAY_MODE = new ArrayList<SelectItem>();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return listPD_PAY_MODE;
	}

	public void setListPD_PAY_MODE(List<SelectItem> listPD_PAY_MODE) {
		this.listPD_PAY_MODE = listPD_PAY_MODE;
	}

	public void fireFieldValidation(ActionEvent actionEvent) {
		UIInput input = (UIInput) actionEvent.getComponent().getParent();
		ErrorHelpUtil.validate(input, getErrorMap());
	}

	public UIData getDataTable() {
		return dataTable;
	}

	public void setDataTable(UIData dataTable) {
		this.dataTable = dataTable;
	}

	public void setDataList_PT_IL_PYMT_DTLS(
			List<PT_IL_PYMT_DTLS> dataList_PT_IL_PYMT_DTLS) {
		this.dataList_PT_IL_PYMT_DTLS = dataList_PT_IL_PYMT_DTLS;
	}
	
	public void onLoad(){
		try{
			if(isBlockFlag()){
				helper.executeQuery(compositeAction);
				setBlockFlag(false);
			}
		}catch (Exception e) {
			getErrorMap().put(PELConstants.PEL_ERROR_WARNING_CURRENT_KEY,
					e.getMessage());
			getErrorMap().put("onLoad", e.getMessage());
		}
	}
	
	public void displayRecords() {
		CommonUtils.clearMaps(this);
		try {
			resetSelectedRow();
			PT_IL_PYMT_DTLS_BEAN = (PT_IL_PYMT_DTLS) dataTable
					.getRowData();
			PT_IL_PYMT_DTLS_BEAN.setRowSelected(true);
			resetAllComponent();
		} catch (Exception exc) {
			getErrorMap().put(PELConstants.PEL_ERROR_WARNING_CURRENT_KEY,
					exc.getMessage());
			getErrorMap().put("displayRecords", exc.getMessage());
		}

	}
	
	private void resetSelectedRow() {
		Iterator<PT_IL_PYMT_DTLS> PT_IL_PYMT_DTLS_BEAN_ITR = dataList_PT_IL_PYMT_DTLS.iterator();
		while (PT_IL_PYMT_DTLS_BEAN_ITR.hasNext()) {
			PT_IL_PYMT_DTLS_BEAN_ITR.next().setRowSelected(false);
		}
	}
	
	/**
	 * Resets all components in PT_IL_PYMT_DTLS_ACTION
	 */
	public void resetAllComponent(){
		// Reseting HtmlInputText
		COMP_PD_LC_AMT.resetValue();
		COMP_PD_BANK_NAME.resetValue();
		COMP_PD_CHQ_NO.resetValue();

		// Reseting HtmlSelectOneMenu
		COMP_PD_PAY_MODE.resetValue();

		// Reseting HtmlCalendar
		COMP_PD_CHQ_DT.resetValue();

	}


}