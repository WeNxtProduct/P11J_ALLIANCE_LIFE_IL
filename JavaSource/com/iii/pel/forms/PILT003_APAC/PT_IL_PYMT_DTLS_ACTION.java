package com.iii.pel.forms.PILT003_APAC;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UIData;
import javax.faces.component.UIInput;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.event.ActionEvent;
import javax.faces.event.PhaseEvent;
import javax.faces.model.SelectItem;

import org.richfaces.component.html.HtmlCalendar;

import com.iii.premia.common.action.CommonAction;
import com.iii.premia.common.constants.PELConstants;
import com.iii.premia.common.errorUtil.ErrorHelpUtil;
import com.iii.premia.common.errorUtil.Messages;
import com.iii.premia.common.utils.CommonUtils;

public class PT_IL_PYMT_DTLS_ACTION extends CommonAction {

	private HtmlOutputLabel COMP_PD_SR_NO_LABEL;

	private HtmlInputText COMP_PD_SR_NO;

	private HtmlOutputLabel COMP_PD_PAY_MODE_LABEL;

	private HtmlSelectOneMenu COMP_PD_PAY_MODE;

	private HtmlOutputLabel COMP_PD_DPD_REF_ID_LABEL;

	private HtmlInputText COMP_PD_DPD_REF_ID;

	private HtmlOutputLabel COMP_PD_FC_AMT_LABEL;

	private HtmlInputText COMP_PD_FC_AMT;

	private HtmlOutputLabel COMP_PD_LC_AMT_LABEL;

	private HtmlInputText COMP_PD_LC_AMT;

	private HtmlOutputLabel COMP_PD_PAID_FOR_LABEL;

	private HtmlSelectOneMenu COMP_PD_PAID_FOR;

	private HtmlOutputLabel COMP_PD_CHQ_NO_LABEL;

	private HtmlInputText COMP_PD_CHQ_NO;

	private HtmlOutputLabel COMP_PD_CHQ_DT_LABEL;

	private HtmlCalendar COMP_PD_CHQ_DT;

	private HtmlOutputLabel COMP_PD_PAYIN_DATE_LABEL;

	private HtmlCalendar COMP_PD_PAYIN_DATE;

	private HtmlOutputLabel COMP_PD_CR_ADVICE_NO_LABEL;

	private HtmlInputText COMP_PD_CR_ADVICE_NO;

	private HtmlOutputLabel COMP_PD_BANK_NAME_LABEL;

	private HtmlInputText COMP_PD_BANK_NAME;

	private HtmlOutputLabel COMP_UI_M_BANK_NAME_DESC_LABEL;

	private HtmlInputText COMP_UI_M_BANK_NAME_DESC;

	private HtmlOutputLabel COMP_PD_BRANCH_NAME_LABEL;

	private HtmlInputText COMP_PD_BRANCH_NAME;

	private HtmlOutputLabel COMP_PD_CUST_NAME_LABEL;

	private HtmlInputText COMP_PD_CUST_NAME;

	private HtmlOutputLabel COMP_PD_ADDR_01_LABEL;

	private HtmlInputText COMP_PD_ADDR_01;

	private HtmlOutputLabel COMP_PD_ADDR_02_LABEL;

	private HtmlInputText COMP_PD_ADDR_02;

	private HtmlOutputLabel COMP_PD_ADDR_03_LABEL;

	private HtmlInputText COMP_PD_ADDR_03;

	private HtmlOutputLabel COMP_PD_REMARKS_LABEL;

	private HtmlInputText COMP_PD_REMARKS;

	private HtmlOutputLabel COMP_PD_CURR_CODE_LABEL;

	private HtmlInputText COMP_PD_CURR_CODE;

	private HtmlOutputLabel COMP_UI_M_PD_CURR_CODE_DESC_LABEL;

	private HtmlInputText COMP_UI_M_PD_CURR_CODE_DESC;

	private HtmlOutputLabel COMP_PD_LC_CHARGE_LABEL;

	private HtmlInputText COMP_PD_LC_CHARGE;

	private HtmlOutputLabel COMP_PD_FC_CHARGE_LABEL;

	private HtmlInputText COMP_PD_FC_CHARGE;

	private HtmlOutputLabel COMP_PD_CC_TYPE_LABEL;

	private HtmlSelectOneMenu COMP_PD_CC_TYPE;

	private HtmlOutputLabel COMP_PD_CC_NO_LABEL;

	private HtmlInputText COMP_PD_CC_NO;

	private HtmlOutputLabel COMP_PD_CC_NAME_LABEL;

	private HtmlInputText COMP_PD_CC_NAME;

	private HtmlOutputLabel COMP_PD_CC_APP_CODE_LABEL;

	private HtmlInputText COMP_PD_CC_APP_CODE;

	private HtmlOutputLabel COMP_UI_M_EXP_DT_LABEL;

	private HtmlInputText COMP_UI_M_EXP_DT;

	private HtmlOutputLabel COMP_PD_OUR_BANK_CODE_LABEL;

	private HtmlInputText COMP_PD_OUR_BANK_CODE;

	private HtmlOutputLabel COMP_PD_DATE_OF_CREDIT_LABEL;

	private HtmlCalendar COMP_PD_DATE_OF_CREDIT;

	private HtmlOutputLabel COMP_PD_TT_REF_NO_LABEL;

	private HtmlInputText COMP_PD_TT_REF_NO;

	private HtmlOutputLabel COMP_PD_TT_CURR_CODE_LABEL;

	private HtmlInputText COMP_PD_TT_CURR_CODE;

	private HtmlOutputLabel COMP_UI_M_OUR_BANK_CODE_LABEL;

	private HtmlInputText COMP_UI_M_OUR_BANK_CODE;

	private HtmlOutputLabel COMP_PD_REM_SLIP_GEN_YN_LABEL;

	private HtmlSelectOneMenu COMP_PD_REM_SLIP_GEN_YN;

	private HtmlOutputLabel COMP_UI_M_CHQ_NO_LABEL;

	private HtmlInputText COMP_UI_M_CHQ_NO;

	private HtmlOutputLabel COMP_PD_PO_MO_NO_LABEL;

	private HtmlInputText COMP_PD_PO_MO_NO;

	private HtmlOutputLabel COMP_PD_PO_MO_DT_LABEL;

	private HtmlCalendar COMP_PD_PO_MO_DT;

	private HtmlOutputLabel COMP_UI_M_REM_SLIP_GEN_YN_LABEL;

	private HtmlSelectOneMenu COMP_UI_M_REM_SLIP_GEN_YN;

	private HtmlOutputLabel COMP_PD_REM_AMT_LABEL;

	private HtmlInputText COMP_PD_REM_AMT;

	private HtmlOutputLabel COMP_UI_M_OUR_BANK_CODE_1_LABEL;

	private HtmlInputText COMP_UI_M_OUR_BANK_CODE_1;

	private HtmlOutputLabel COMP_UI_M_OUR_BANK_CODE_2_LABEL;

	private HtmlInputText COMP_UI_M_OUR_BANK_CODE_2;

	private HtmlOutputLabel COMP_PD_BANK_REF_NO_LABEL;

	private HtmlInputText COMP_PD_BANK_REF_NO;

	private HtmlOutputLabel COMP_UI_M_DATE_OF_CREDIT_LABEL;

	private HtmlCalendar COMP_UI_M_DATE_OF_CREDIT;

	private HtmlOutputLabel COMP_UI_M_BANK_REF_NO_LABEL;

	private HtmlInputText COMP_UI_M_BANK_REF_NO;

	private HtmlOutputLabel COMP_UI_M_DATE_OF_CREDIT_1_LABEL;

	private HtmlCalendar COMP_UI_M_DATE_OF_CREDIT_1;

	private HtmlOutputLabel COMP_UI_M_DATE_OF_CREDIT_2_LABEL;

	private HtmlCalendar COMP_UI_M_DATE_OF_CREDIT_2;

	private HtmlOutputLabel COMP_UI_M_PD_CC_APP_CODE_LABEL;

	private HtmlInputText COMP_UI_M_PD_CC_APP_CODE;

	private HtmlOutputLabel COMP_UI_M_BANK_REF_NO_1_LABEL;

	private HtmlInputText COMP_UI_M_BANK_REF_NO_1;

	private HtmlOutputLabel COMP_UI_M_PD_CC_TYPE_LABEL;

	private HtmlSelectOneMenu COMP_UI_M_PD_CC_TYPE;

	private HtmlOutputLabel COMP_UI_M_PD_CC_NO_LABEL;

	private HtmlInputText COMP_UI_M_PD_CC_NO;

	private HtmlOutputLabel COMP_UI_M_BANK_REF_NO_2_LABEL;

	private HtmlInputText COMP_UI_M_BANK_REF_NO_2;

	private HtmlOutputLabel COMP_PD_ATM_CARD_NO_LABEL;

	private HtmlInputText COMP_PD_ATM_CARD_NO;

	private HtmlCommandButton COMP_UI_M_BUT_PD_CUST_NAME;

	private HtmlCommandButton COMP_UI_M_BUT_PD_ADDR_01;

	private HtmlCommandButton COMP_UI_M_BUT_PD_ADDR_02;

	private HtmlCommandButton COMP_UI_M_BUT_BANK_LOV;

	private HtmlCommandButton COMP_UI_M_BUT_LOV_DPD_REF_ID;

	private HtmlCommandButton COMP_UI_M_BUT_MORE;

	private HtmlCommandButton COMP_UI_M_BUT_PD_ADDR_03;

	private HtmlCommandButton COMP_UI_M_BUT_PD_REMARKS;

	private HtmlCommandButton COMP_UI_M_BUT_PD_BANK_NAME;

	private HtmlCommandButton COMP_UI_M_BUT_PD_BRANCH_NAME;

	private PT_IL_PYMT_DTLS PT_IL_PYMT_DTLS_BEAN;

	public PILT003_APAC_COMPOSITE_ACTION compositeAction;

	private PT_IL_PYMT_DTLS_HELPER helper;

	private List<PT_IL_PYMT_DTLS> dataList_PT_IL_PYMT_DTLS = new ArrayList<PT_IL_PYMT_DTLS>();

	 private UIData dataTable;

	private List<SelectItem> listPD_PAY_MODE = new ArrayList<SelectItem>();

	private List<SelectItem> listPD_PAID_FOR = new ArrayList<SelectItem>();

	private List<SelectItem> listPD_CC_TYPE = new ArrayList<SelectItem>();

	private List<SelectItem> listPD_REM_SLIP_GEN_YN = new ArrayList<SelectItem>();

	private List<SelectItem> listUI_M_REM_SLIP_GEN_YN = new ArrayList<SelectItem>();

	private List<SelectItem> listUI_M_PD_CC_TYPE = new ArrayList<SelectItem>();



public PT_IL_PYMT_DTLS_ACTION(){


PT_IL_PYMT_DTLS_BEAN = new PT_IL_PYMT_DTLS();
helper = new PT_IL_PYMT_DTLS_HELPER();
}

	public HtmlOutputLabel getCOMP_PD_SR_NO_LABEL() {
		return COMP_PD_SR_NO_LABEL;
	}

	public HtmlInputText getCOMP_PD_SR_NO() {
		return COMP_PD_SR_NO;
	}

	public void setCOMP_PD_SR_NO_LABEL(HtmlOutputLabel COMP_PD_SR_NO_LABEL) {
		this.COMP_PD_SR_NO_LABEL = COMP_PD_SR_NO_LABEL;
	}

	public void setCOMP_PD_SR_NO(HtmlInputText COMP_PD_SR_NO) {
		this.COMP_PD_SR_NO = COMP_PD_SR_NO;
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

	public HtmlOutputLabel getCOMP_PD_DPD_REF_ID_LABEL() {
		return COMP_PD_DPD_REF_ID_LABEL;
	}

	public HtmlInputText getCOMP_PD_DPD_REF_ID() {
		return COMP_PD_DPD_REF_ID;
	}

	public void setCOMP_PD_DPD_REF_ID_LABEL(HtmlOutputLabel COMP_PD_DPD_REF_ID_LABEL) {
		this.COMP_PD_DPD_REF_ID_LABEL = COMP_PD_DPD_REF_ID_LABEL;
	}

	public void setCOMP_PD_DPD_REF_ID(HtmlInputText COMP_PD_DPD_REF_ID) {
		this.COMP_PD_DPD_REF_ID = COMP_PD_DPD_REF_ID;
	}

	public HtmlOutputLabel getCOMP_PD_FC_AMT_LABEL() {
		return COMP_PD_FC_AMT_LABEL;
	}

	public HtmlInputText getCOMP_PD_FC_AMT() {
		return COMP_PD_FC_AMT;
	}

	public void setCOMP_PD_FC_AMT_LABEL(HtmlOutputLabel COMP_PD_FC_AMT_LABEL) {
		this.COMP_PD_FC_AMT_LABEL = COMP_PD_FC_AMT_LABEL;
	}

	public void setCOMP_PD_FC_AMT(HtmlInputText COMP_PD_FC_AMT) {
		this.COMP_PD_FC_AMT = COMP_PD_FC_AMT;
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

	public HtmlOutputLabel getCOMP_PD_PAID_FOR_LABEL() {
		return COMP_PD_PAID_FOR_LABEL;
	}

	public HtmlSelectOneMenu getCOMP_PD_PAID_FOR() {
		return COMP_PD_PAID_FOR;
	}

	public void setCOMP_PD_PAID_FOR_LABEL(HtmlOutputLabel COMP_PD_PAID_FOR_LABEL) {
		this.COMP_PD_PAID_FOR_LABEL = COMP_PD_PAID_FOR_LABEL;
	}

	public void setCOMP_PD_PAID_FOR(HtmlSelectOneMenu COMP_PD_PAID_FOR) {
		this.COMP_PD_PAID_FOR = COMP_PD_PAID_FOR;
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

	public HtmlOutputLabel getCOMP_PD_PAYIN_DATE_LABEL() {
		return COMP_PD_PAYIN_DATE_LABEL;
	}

	public HtmlCalendar getCOMP_PD_PAYIN_DATE() {
		return COMP_PD_PAYIN_DATE;
	}

	public void setCOMP_PD_PAYIN_DATE_LABEL(HtmlOutputLabel COMP_PD_PAYIN_DATE_LABEL) {
		this.COMP_PD_PAYIN_DATE_LABEL = COMP_PD_PAYIN_DATE_LABEL;
	}

	public void setCOMP_PD_PAYIN_DATE(HtmlCalendar COMP_PD_PAYIN_DATE) {
		this.COMP_PD_PAYIN_DATE = COMP_PD_PAYIN_DATE;
	}

	public HtmlOutputLabel getCOMP_PD_CR_ADVICE_NO_LABEL() {
		return COMP_PD_CR_ADVICE_NO_LABEL;
	}

	public HtmlInputText getCOMP_PD_CR_ADVICE_NO() {
		return COMP_PD_CR_ADVICE_NO;
	}

	public void setCOMP_PD_CR_ADVICE_NO_LABEL(HtmlOutputLabel COMP_PD_CR_ADVICE_NO_LABEL) {
		this.COMP_PD_CR_ADVICE_NO_LABEL = COMP_PD_CR_ADVICE_NO_LABEL;
	}

	public void setCOMP_PD_CR_ADVICE_NO(HtmlInputText COMP_PD_CR_ADVICE_NO) {
		this.COMP_PD_CR_ADVICE_NO = COMP_PD_CR_ADVICE_NO;
	}

	public HtmlOutputLabel getCOMP_PD_BANK_NAME_LABEL() {
		return COMP_PD_BANK_NAME_LABEL;
	}

	public HtmlInputText getCOMP_PD_BANK_NAME() {
		return COMP_PD_BANK_NAME;
	}

	public void setCOMP_PD_BANK_NAME_LABEL(HtmlOutputLabel COMP_PD_BANK_NAME_LABEL) {
		this.COMP_PD_BANK_NAME_LABEL = COMP_PD_BANK_NAME_LABEL;
	}

	public void setCOMP_PD_BANK_NAME(HtmlInputText COMP_PD_BANK_NAME) {
		this.COMP_PD_BANK_NAME = COMP_PD_BANK_NAME;
	}

	public HtmlOutputLabel getCOMP_UI_M_BANK_NAME_DESC_LABEL() {
		return COMP_UI_M_BANK_NAME_DESC_LABEL;
	}

	public HtmlInputText getCOMP_UI_M_BANK_NAME_DESC() {
		return COMP_UI_M_BANK_NAME_DESC;
	}

	public void setCOMP_UI_M_BANK_NAME_DESC_LABEL(HtmlOutputLabel COMP_UI_M_BANK_NAME_DESC_LABEL) {
		this.COMP_UI_M_BANK_NAME_DESC_LABEL = COMP_UI_M_BANK_NAME_DESC_LABEL;
	}

	public void setCOMP_UI_M_BANK_NAME_DESC(HtmlInputText COMP_UI_M_BANK_NAME_DESC) {
		this.COMP_UI_M_BANK_NAME_DESC = COMP_UI_M_BANK_NAME_DESC;
	}

	public HtmlOutputLabel getCOMP_PD_BRANCH_NAME_LABEL() {
		return COMP_PD_BRANCH_NAME_LABEL;
	}

	public HtmlInputText getCOMP_PD_BRANCH_NAME() {
		return COMP_PD_BRANCH_NAME;
	}

	public void setCOMP_PD_BRANCH_NAME_LABEL(HtmlOutputLabel COMP_PD_BRANCH_NAME_LABEL) {
		this.COMP_PD_BRANCH_NAME_LABEL = COMP_PD_BRANCH_NAME_LABEL;
	}

	public void setCOMP_PD_BRANCH_NAME(HtmlInputText COMP_PD_BRANCH_NAME) {
		this.COMP_PD_BRANCH_NAME = COMP_PD_BRANCH_NAME;
	}

	public HtmlOutputLabel getCOMP_PD_CUST_NAME_LABEL() {
		return COMP_PD_CUST_NAME_LABEL;
	}

	public HtmlInputText getCOMP_PD_CUST_NAME() {
		return COMP_PD_CUST_NAME;
	}

	public void setCOMP_PD_CUST_NAME_LABEL(HtmlOutputLabel COMP_PD_CUST_NAME_LABEL) {
		this.COMP_PD_CUST_NAME_LABEL = COMP_PD_CUST_NAME_LABEL;
	}

	public void setCOMP_PD_CUST_NAME(HtmlInputText COMP_PD_CUST_NAME) {
		this.COMP_PD_CUST_NAME = COMP_PD_CUST_NAME;
	}

	public HtmlOutputLabel getCOMP_PD_ADDR_01_LABEL() {
		return COMP_PD_ADDR_01_LABEL;
	}

	public HtmlInputText getCOMP_PD_ADDR_01() {
		return COMP_PD_ADDR_01;
	}

	public void setCOMP_PD_ADDR_01_LABEL(HtmlOutputLabel COMP_PD_ADDR_01_LABEL) {
		this.COMP_PD_ADDR_01_LABEL = COMP_PD_ADDR_01_LABEL;
	}

	public void setCOMP_PD_ADDR_01(HtmlInputText COMP_PD_ADDR_01) {
		this.COMP_PD_ADDR_01 = COMP_PD_ADDR_01;
	}

	public HtmlOutputLabel getCOMP_PD_ADDR_02_LABEL() {
		return COMP_PD_ADDR_02_LABEL;
	}

	public HtmlInputText getCOMP_PD_ADDR_02() {
		return COMP_PD_ADDR_02;
	}

	public void setCOMP_PD_ADDR_02_LABEL(HtmlOutputLabel COMP_PD_ADDR_02_LABEL) {
		this.COMP_PD_ADDR_02_LABEL = COMP_PD_ADDR_02_LABEL;
	}

	public void setCOMP_PD_ADDR_02(HtmlInputText COMP_PD_ADDR_02) {
		this.COMP_PD_ADDR_02 = COMP_PD_ADDR_02;
	}

	public HtmlOutputLabel getCOMP_PD_ADDR_03_LABEL() {
		return COMP_PD_ADDR_03_LABEL;
	}

	public HtmlInputText getCOMP_PD_ADDR_03() {
		return COMP_PD_ADDR_03;
	}

	public void setCOMP_PD_ADDR_03_LABEL(HtmlOutputLabel COMP_PD_ADDR_03_LABEL) {
		this.COMP_PD_ADDR_03_LABEL = COMP_PD_ADDR_03_LABEL;
	}

	public void setCOMP_PD_ADDR_03(HtmlInputText COMP_PD_ADDR_03) {
		this.COMP_PD_ADDR_03 = COMP_PD_ADDR_03;
	}

	public HtmlOutputLabel getCOMP_PD_REMARKS_LABEL() {
		return COMP_PD_REMARKS_LABEL;
	}

	public HtmlInputText getCOMP_PD_REMARKS() {
		return COMP_PD_REMARKS;
	}

	public void setCOMP_PD_REMARKS_LABEL(HtmlOutputLabel COMP_PD_REMARKS_LABEL) {
		this.COMP_PD_REMARKS_LABEL = COMP_PD_REMARKS_LABEL;
	}

	public void setCOMP_PD_REMARKS(HtmlInputText COMP_PD_REMARKS) {
		this.COMP_PD_REMARKS = COMP_PD_REMARKS;
	}

	public HtmlOutputLabel getCOMP_PD_CURR_CODE_LABEL() {
		return COMP_PD_CURR_CODE_LABEL;
	}

	public HtmlInputText getCOMP_PD_CURR_CODE() {
		return COMP_PD_CURR_CODE;
	}

	public void setCOMP_PD_CURR_CODE_LABEL(HtmlOutputLabel COMP_PD_CURR_CODE_LABEL) {
		this.COMP_PD_CURR_CODE_LABEL = COMP_PD_CURR_CODE_LABEL;
	}

	public void setCOMP_PD_CURR_CODE(HtmlInputText COMP_PD_CURR_CODE) {
		this.COMP_PD_CURR_CODE = COMP_PD_CURR_CODE;
	}

	public HtmlOutputLabel getCOMP_UI_M_PD_CURR_CODE_DESC_LABEL() {
		return COMP_UI_M_PD_CURR_CODE_DESC_LABEL;
	}

	public HtmlInputText getCOMP_UI_M_PD_CURR_CODE_DESC() {
		return COMP_UI_M_PD_CURR_CODE_DESC;
	}

	public void setCOMP_UI_M_PD_CURR_CODE_DESC_LABEL(HtmlOutputLabel COMP_UI_M_PD_CURR_CODE_DESC_LABEL) {
		this.COMP_UI_M_PD_CURR_CODE_DESC_LABEL = COMP_UI_M_PD_CURR_CODE_DESC_LABEL;
	}

	public void setCOMP_UI_M_PD_CURR_CODE_DESC(HtmlInputText COMP_UI_M_PD_CURR_CODE_DESC) {
		this.COMP_UI_M_PD_CURR_CODE_DESC = COMP_UI_M_PD_CURR_CODE_DESC;
	}

	public HtmlOutputLabel getCOMP_PD_LC_CHARGE_LABEL() {
		return COMP_PD_LC_CHARGE_LABEL;
	}

	public HtmlInputText getCOMP_PD_LC_CHARGE() {
		return COMP_PD_LC_CHARGE;
	}

	public void setCOMP_PD_LC_CHARGE_LABEL(HtmlOutputLabel COMP_PD_LC_CHARGE_LABEL) {
		this.COMP_PD_LC_CHARGE_LABEL = COMP_PD_LC_CHARGE_LABEL;
	}

	public void setCOMP_PD_LC_CHARGE(HtmlInputText COMP_PD_LC_CHARGE) {
		this.COMP_PD_LC_CHARGE = COMP_PD_LC_CHARGE;
	}

	public HtmlOutputLabel getCOMP_PD_FC_CHARGE_LABEL() {
		return COMP_PD_FC_CHARGE_LABEL;
	}

	public HtmlInputText getCOMP_PD_FC_CHARGE() {
		return COMP_PD_FC_CHARGE;
	}

	public void setCOMP_PD_FC_CHARGE_LABEL(HtmlOutputLabel COMP_PD_FC_CHARGE_LABEL) {
		this.COMP_PD_FC_CHARGE_LABEL = COMP_PD_FC_CHARGE_LABEL;
	}

	public void setCOMP_PD_FC_CHARGE(HtmlInputText COMP_PD_FC_CHARGE) {
		this.COMP_PD_FC_CHARGE = COMP_PD_FC_CHARGE;
	}

	public HtmlOutputLabel getCOMP_PD_CC_TYPE_LABEL() {
		return COMP_PD_CC_TYPE_LABEL;
	}

	public HtmlSelectOneMenu getCOMP_PD_CC_TYPE() {
		return COMP_PD_CC_TYPE;
	}

	public void setCOMP_PD_CC_TYPE_LABEL(HtmlOutputLabel COMP_PD_CC_TYPE_LABEL) {
		this.COMP_PD_CC_TYPE_LABEL = COMP_PD_CC_TYPE_LABEL;
	}

	public void setCOMP_PD_CC_TYPE(HtmlSelectOneMenu COMP_PD_CC_TYPE) {
		this.COMP_PD_CC_TYPE = COMP_PD_CC_TYPE;
	}

	public HtmlOutputLabel getCOMP_PD_CC_NO_LABEL() {
		return COMP_PD_CC_NO_LABEL;
	}

	public HtmlInputText getCOMP_PD_CC_NO() {
		return COMP_PD_CC_NO;
	}

	public void setCOMP_PD_CC_NO_LABEL(HtmlOutputLabel COMP_PD_CC_NO_LABEL) {
		this.COMP_PD_CC_NO_LABEL = COMP_PD_CC_NO_LABEL;
	}

	public void setCOMP_PD_CC_NO(HtmlInputText COMP_PD_CC_NO) {
		this.COMP_PD_CC_NO = COMP_PD_CC_NO;
	}

	public HtmlOutputLabel getCOMP_PD_CC_NAME_LABEL() {
		return COMP_PD_CC_NAME_LABEL;
	}

	public HtmlInputText getCOMP_PD_CC_NAME() {
		return COMP_PD_CC_NAME;
	}

	public void setCOMP_PD_CC_NAME_LABEL(HtmlOutputLabel COMP_PD_CC_NAME_LABEL) {
		this.COMP_PD_CC_NAME_LABEL = COMP_PD_CC_NAME_LABEL;
	}

	public void setCOMP_PD_CC_NAME(HtmlInputText COMP_PD_CC_NAME) {
		this.COMP_PD_CC_NAME = COMP_PD_CC_NAME;
	}

	public HtmlOutputLabel getCOMP_PD_CC_APP_CODE_LABEL() {
		return COMP_PD_CC_APP_CODE_LABEL;
	}

	public HtmlInputText getCOMP_PD_CC_APP_CODE() {
		return COMP_PD_CC_APP_CODE;
	}

	public void setCOMP_PD_CC_APP_CODE_LABEL(HtmlOutputLabel COMP_PD_CC_APP_CODE_LABEL) {
		this.COMP_PD_CC_APP_CODE_LABEL = COMP_PD_CC_APP_CODE_LABEL;
	}

	public void setCOMP_PD_CC_APP_CODE(HtmlInputText COMP_PD_CC_APP_CODE) {
		this.COMP_PD_CC_APP_CODE = COMP_PD_CC_APP_CODE;
	}

	public HtmlOutputLabel getCOMP_UI_M_EXP_DT_LABEL() {
		return COMP_UI_M_EXP_DT_LABEL;
	}

	public HtmlInputText getCOMP_UI_M_EXP_DT() {
		return COMP_UI_M_EXP_DT;
	}

	public void setCOMP_UI_M_EXP_DT_LABEL(HtmlOutputLabel COMP_UI_M_EXP_DT_LABEL) {
		this.COMP_UI_M_EXP_DT_LABEL = COMP_UI_M_EXP_DT_LABEL;
	}

	public void setCOMP_UI_M_EXP_DT(HtmlInputText COMP_UI_M_EXP_DT) {
		this.COMP_UI_M_EXP_DT = COMP_UI_M_EXP_DT;
	}

	public HtmlOutputLabel getCOMP_PD_OUR_BANK_CODE_LABEL() {
		return COMP_PD_OUR_BANK_CODE_LABEL;
	}

	public HtmlInputText getCOMP_PD_OUR_BANK_CODE() {
		return COMP_PD_OUR_BANK_CODE;
	}

	public void setCOMP_PD_OUR_BANK_CODE_LABEL(HtmlOutputLabel COMP_PD_OUR_BANK_CODE_LABEL) {
		this.COMP_PD_OUR_BANK_CODE_LABEL = COMP_PD_OUR_BANK_CODE_LABEL;
	}

	public void setCOMP_PD_OUR_BANK_CODE(HtmlInputText COMP_PD_OUR_BANK_CODE) {
		this.COMP_PD_OUR_BANK_CODE = COMP_PD_OUR_BANK_CODE;
	}

	public HtmlOutputLabel getCOMP_PD_DATE_OF_CREDIT_LABEL() {
		return COMP_PD_DATE_OF_CREDIT_LABEL;
	}

	public HtmlCalendar getCOMP_PD_DATE_OF_CREDIT() {
		return COMP_PD_DATE_OF_CREDIT;
	}

	public void setCOMP_PD_DATE_OF_CREDIT_LABEL(HtmlOutputLabel COMP_PD_DATE_OF_CREDIT_LABEL) {
		this.COMP_PD_DATE_OF_CREDIT_LABEL = COMP_PD_DATE_OF_CREDIT_LABEL;
	}

	public void setCOMP_PD_DATE_OF_CREDIT(HtmlCalendar COMP_PD_DATE_OF_CREDIT) {
		this.COMP_PD_DATE_OF_CREDIT = COMP_PD_DATE_OF_CREDIT;
	}

	public HtmlOutputLabel getCOMP_PD_TT_REF_NO_LABEL() {
		return COMP_PD_TT_REF_NO_LABEL;
	}

	public HtmlInputText getCOMP_PD_TT_REF_NO() {
		return COMP_PD_TT_REF_NO;
	}

	public void setCOMP_PD_TT_REF_NO_LABEL(HtmlOutputLabel COMP_PD_TT_REF_NO_LABEL) {
		this.COMP_PD_TT_REF_NO_LABEL = COMP_PD_TT_REF_NO_LABEL;
	}

	public void setCOMP_PD_TT_REF_NO(HtmlInputText COMP_PD_TT_REF_NO) {
		this.COMP_PD_TT_REF_NO = COMP_PD_TT_REF_NO;
	}

	public HtmlOutputLabel getCOMP_PD_TT_CURR_CODE_LABEL() {
		return COMP_PD_TT_CURR_CODE_LABEL;
	}

	public HtmlInputText getCOMP_PD_TT_CURR_CODE() {
		return COMP_PD_TT_CURR_CODE;
	}

	public void setCOMP_PD_TT_CURR_CODE_LABEL(HtmlOutputLabel COMP_PD_TT_CURR_CODE_LABEL) {
		this.COMP_PD_TT_CURR_CODE_LABEL = COMP_PD_TT_CURR_CODE_LABEL;
	}

	public void setCOMP_PD_TT_CURR_CODE(HtmlInputText COMP_PD_TT_CURR_CODE) {
		this.COMP_PD_TT_CURR_CODE = COMP_PD_TT_CURR_CODE;
	}

	public HtmlOutputLabel getCOMP_UI_M_OUR_BANK_CODE_LABEL() {
		return COMP_UI_M_OUR_BANK_CODE_LABEL;
	}

	public HtmlInputText getCOMP_UI_M_OUR_BANK_CODE() {
		return COMP_UI_M_OUR_BANK_CODE;
	}

	public void setCOMP_UI_M_OUR_BANK_CODE_LABEL(HtmlOutputLabel COMP_UI_M_OUR_BANK_CODE_LABEL) {
		this.COMP_UI_M_OUR_BANK_CODE_LABEL = COMP_UI_M_OUR_BANK_CODE_LABEL;
	}

	public void setCOMP_UI_M_OUR_BANK_CODE(HtmlInputText COMP_UI_M_OUR_BANK_CODE) {
		this.COMP_UI_M_OUR_BANK_CODE = COMP_UI_M_OUR_BANK_CODE;
	}

	public HtmlOutputLabel getCOMP_PD_REM_SLIP_GEN_YN_LABEL() {
		return COMP_PD_REM_SLIP_GEN_YN_LABEL;
	}

	public HtmlSelectOneMenu getCOMP_PD_REM_SLIP_GEN_YN() {
		return COMP_PD_REM_SLIP_GEN_YN;
	}

	public void setCOMP_PD_REM_SLIP_GEN_YN_LABEL(HtmlOutputLabel COMP_PD_REM_SLIP_GEN_YN_LABEL) {
		this.COMP_PD_REM_SLIP_GEN_YN_LABEL = COMP_PD_REM_SLIP_GEN_YN_LABEL;
	}

	public void setCOMP_PD_REM_SLIP_GEN_YN(HtmlSelectOneMenu COMP_PD_REM_SLIP_GEN_YN) {
		this.COMP_PD_REM_SLIP_GEN_YN = COMP_PD_REM_SLIP_GEN_YN;
	}

	public HtmlOutputLabel getCOMP_UI_M_CHQ_NO_LABEL() {
		return COMP_UI_M_CHQ_NO_LABEL;
	}

	public HtmlInputText getCOMP_UI_M_CHQ_NO() {
		return COMP_UI_M_CHQ_NO;
	}

	public void setCOMP_UI_M_CHQ_NO_LABEL(HtmlOutputLabel COMP_UI_M_CHQ_NO_LABEL) {
		this.COMP_UI_M_CHQ_NO_LABEL = COMP_UI_M_CHQ_NO_LABEL;
	}

	public void setCOMP_UI_M_CHQ_NO(HtmlInputText COMP_UI_M_CHQ_NO) {
		this.COMP_UI_M_CHQ_NO = COMP_UI_M_CHQ_NO;
	}

	public HtmlOutputLabel getCOMP_PD_PO_MO_NO_LABEL() {
		return COMP_PD_PO_MO_NO_LABEL;
	}

	public HtmlInputText getCOMP_PD_PO_MO_NO() {
		return COMP_PD_PO_MO_NO;
	}

	public void setCOMP_PD_PO_MO_NO_LABEL(HtmlOutputLabel COMP_PD_PO_MO_NO_LABEL) {
		this.COMP_PD_PO_MO_NO_LABEL = COMP_PD_PO_MO_NO_LABEL;
	}

	public void setCOMP_PD_PO_MO_NO(HtmlInputText COMP_PD_PO_MO_NO) {
		this.COMP_PD_PO_MO_NO = COMP_PD_PO_MO_NO;
	}

	public HtmlOutputLabel getCOMP_PD_PO_MO_DT_LABEL() {
		return COMP_PD_PO_MO_DT_LABEL;
	}

	public HtmlCalendar getCOMP_PD_PO_MO_DT() {
		return COMP_PD_PO_MO_DT;
	}

	public void setCOMP_PD_PO_MO_DT_LABEL(HtmlOutputLabel COMP_PD_PO_MO_DT_LABEL) {
		this.COMP_PD_PO_MO_DT_LABEL = COMP_PD_PO_MO_DT_LABEL;
	}

	public void setCOMP_PD_PO_MO_DT(HtmlCalendar COMP_PD_PO_MO_DT) {
		this.COMP_PD_PO_MO_DT = COMP_PD_PO_MO_DT;
	}

	public HtmlOutputLabel getCOMP_UI_M_REM_SLIP_GEN_YN_LABEL() {
		return COMP_UI_M_REM_SLIP_GEN_YN_LABEL;
	}

	public HtmlSelectOneMenu getCOMP_UI_M_REM_SLIP_GEN_YN() {
		return COMP_UI_M_REM_SLIP_GEN_YN;
	}

	public void setCOMP_UI_M_REM_SLIP_GEN_YN_LABEL(HtmlOutputLabel COMP_UI_M_REM_SLIP_GEN_YN_LABEL) {
		this.COMP_UI_M_REM_SLIP_GEN_YN_LABEL = COMP_UI_M_REM_SLIP_GEN_YN_LABEL;
	}

	public void setCOMP_UI_M_REM_SLIP_GEN_YN(HtmlSelectOneMenu COMP_UI_M_REM_SLIP_GEN_YN) {
		this.COMP_UI_M_REM_SLIP_GEN_YN = COMP_UI_M_REM_SLIP_GEN_YN;
	}

	public HtmlOutputLabel getCOMP_PD_REM_AMT_LABEL() {
		return COMP_PD_REM_AMT_LABEL;
	}

	public HtmlInputText getCOMP_PD_REM_AMT() {
		return COMP_PD_REM_AMT;
	}

	public void setCOMP_PD_REM_AMT_LABEL(HtmlOutputLabel COMP_PD_REM_AMT_LABEL) {
		this.COMP_PD_REM_AMT_LABEL = COMP_PD_REM_AMT_LABEL;
	}

	public void setCOMP_PD_REM_AMT(HtmlInputText COMP_PD_REM_AMT) {
		this.COMP_PD_REM_AMT = COMP_PD_REM_AMT;
	}

	public HtmlOutputLabel getCOMP_UI_M_OUR_BANK_CODE_1_LABEL() {
		return COMP_UI_M_OUR_BANK_CODE_1_LABEL;
	}

	public HtmlInputText getCOMP_UI_M_OUR_BANK_CODE_1() {
		return COMP_UI_M_OUR_BANK_CODE_1;
	}

	public void setCOMP_UI_M_OUR_BANK_CODE_1_LABEL(HtmlOutputLabel COMP_UI_M_OUR_BANK_CODE_1_LABEL) {
		this.COMP_UI_M_OUR_BANK_CODE_1_LABEL = COMP_UI_M_OUR_BANK_CODE_1_LABEL;
	}

	public void setCOMP_UI_M_OUR_BANK_CODE_1(HtmlInputText COMP_UI_M_OUR_BANK_CODE_1) {
		this.COMP_UI_M_OUR_BANK_CODE_1 = COMP_UI_M_OUR_BANK_CODE_1;
	}

	public HtmlOutputLabel getCOMP_UI_M_OUR_BANK_CODE_2_LABEL() {
		return COMP_UI_M_OUR_BANK_CODE_2_LABEL;
	}

	public HtmlInputText getCOMP_UI_M_OUR_BANK_CODE_2() {
		return COMP_UI_M_OUR_BANK_CODE_2;
	}

	public void setCOMP_UI_M_OUR_BANK_CODE_2_LABEL(HtmlOutputLabel COMP_UI_M_OUR_BANK_CODE_2_LABEL) {
		this.COMP_UI_M_OUR_BANK_CODE_2_LABEL = COMP_UI_M_OUR_BANK_CODE_2_LABEL;
	}

	public void setCOMP_UI_M_OUR_BANK_CODE_2(HtmlInputText COMP_UI_M_OUR_BANK_CODE_2) {
		this.COMP_UI_M_OUR_BANK_CODE_2 = COMP_UI_M_OUR_BANK_CODE_2;
	}

	public HtmlOutputLabel getCOMP_PD_BANK_REF_NO_LABEL() {
		return COMP_PD_BANK_REF_NO_LABEL;
	}

	public HtmlInputText getCOMP_PD_BANK_REF_NO() {
		return COMP_PD_BANK_REF_NO;
	}

	public void setCOMP_PD_BANK_REF_NO_LABEL(HtmlOutputLabel COMP_PD_BANK_REF_NO_LABEL) {
		this.COMP_PD_BANK_REF_NO_LABEL = COMP_PD_BANK_REF_NO_LABEL;
	}

	public void setCOMP_PD_BANK_REF_NO(HtmlInputText COMP_PD_BANK_REF_NO) {
		this.COMP_PD_BANK_REF_NO = COMP_PD_BANK_REF_NO;
	}

	public HtmlOutputLabel getCOMP_UI_M_DATE_OF_CREDIT_LABEL() {
		return COMP_UI_M_DATE_OF_CREDIT_LABEL;
	}

	public HtmlCalendar getCOMP_UI_M_DATE_OF_CREDIT() {
		return COMP_UI_M_DATE_OF_CREDIT;
	}

	public void setCOMP_UI_M_DATE_OF_CREDIT_LABEL(HtmlOutputLabel COMP_UI_M_DATE_OF_CREDIT_LABEL) {
		this.COMP_UI_M_DATE_OF_CREDIT_LABEL = COMP_UI_M_DATE_OF_CREDIT_LABEL;
	}

	public void setCOMP_UI_M_DATE_OF_CREDIT(HtmlCalendar COMP_UI_M_DATE_OF_CREDIT) {
		this.COMP_UI_M_DATE_OF_CREDIT = COMP_UI_M_DATE_OF_CREDIT;
	}

	public HtmlOutputLabel getCOMP_UI_M_BANK_REF_NO_LABEL() {
		return COMP_UI_M_BANK_REF_NO_LABEL;
	}

	public HtmlInputText getCOMP_UI_M_BANK_REF_NO() {
		return COMP_UI_M_BANK_REF_NO;
	}

	public void setCOMP_UI_M_BANK_REF_NO_LABEL(HtmlOutputLabel COMP_UI_M_BANK_REF_NO_LABEL) {
		this.COMP_UI_M_BANK_REF_NO_LABEL = COMP_UI_M_BANK_REF_NO_LABEL;
	}

	public void setCOMP_UI_M_BANK_REF_NO(HtmlInputText COMP_UI_M_BANK_REF_NO) {
		this.COMP_UI_M_BANK_REF_NO = COMP_UI_M_BANK_REF_NO;
	}

	public HtmlOutputLabel getCOMP_UI_M_DATE_OF_CREDIT_1_LABEL() {
		return COMP_UI_M_DATE_OF_CREDIT_1_LABEL;
	}

	public HtmlCalendar getCOMP_UI_M_DATE_OF_CREDIT_1() {
		return COMP_UI_M_DATE_OF_CREDIT_1;
	}

	public void setCOMP_UI_M_DATE_OF_CREDIT_1_LABEL(HtmlOutputLabel COMP_UI_M_DATE_OF_CREDIT_1_LABEL) {
		this.COMP_UI_M_DATE_OF_CREDIT_1_LABEL = COMP_UI_M_DATE_OF_CREDIT_1_LABEL;
	}

	public void setCOMP_UI_M_DATE_OF_CREDIT_1(HtmlCalendar COMP_UI_M_DATE_OF_CREDIT_1) {
		this.COMP_UI_M_DATE_OF_CREDIT_1 = COMP_UI_M_DATE_OF_CREDIT_1;
	}

	public HtmlOutputLabel getCOMP_UI_M_DATE_OF_CREDIT_2_LABEL() {
		return COMP_UI_M_DATE_OF_CREDIT_2_LABEL;
	}

	public HtmlCalendar getCOMP_UI_M_DATE_OF_CREDIT_2() {
		return COMP_UI_M_DATE_OF_CREDIT_2;
	}

	public void setCOMP_UI_M_DATE_OF_CREDIT_2_LABEL(HtmlOutputLabel COMP_UI_M_DATE_OF_CREDIT_2_LABEL) {
		this.COMP_UI_M_DATE_OF_CREDIT_2_LABEL = COMP_UI_M_DATE_OF_CREDIT_2_LABEL;
	}

	public void setCOMP_UI_M_DATE_OF_CREDIT_2(HtmlCalendar COMP_UI_M_DATE_OF_CREDIT_2) {
		this.COMP_UI_M_DATE_OF_CREDIT_2 = COMP_UI_M_DATE_OF_CREDIT_2;
	}

	public HtmlOutputLabel getCOMP_UI_M_PD_CC_APP_CODE_LABEL() {
		return COMP_UI_M_PD_CC_APP_CODE_LABEL;
	}

	public HtmlInputText getCOMP_UI_M_PD_CC_APP_CODE() {
		return COMP_UI_M_PD_CC_APP_CODE;
	}

	public void setCOMP_UI_M_PD_CC_APP_CODE_LABEL(HtmlOutputLabel COMP_UI_M_PD_CC_APP_CODE_LABEL) {
		this.COMP_UI_M_PD_CC_APP_CODE_LABEL = COMP_UI_M_PD_CC_APP_CODE_LABEL;
	}

	public void setCOMP_UI_M_PD_CC_APP_CODE(HtmlInputText COMP_UI_M_PD_CC_APP_CODE) {
		this.COMP_UI_M_PD_CC_APP_CODE = COMP_UI_M_PD_CC_APP_CODE;
	}

	public HtmlOutputLabel getCOMP_UI_M_BANK_REF_NO_1_LABEL() {
		return COMP_UI_M_BANK_REF_NO_1_LABEL;
	}

	public HtmlInputText getCOMP_UI_M_BANK_REF_NO_1() {
		return COMP_UI_M_BANK_REF_NO_1;
	}

	public void setCOMP_UI_M_BANK_REF_NO_1_LABEL(HtmlOutputLabel COMP_UI_M_BANK_REF_NO_1_LABEL) {
		this.COMP_UI_M_BANK_REF_NO_1_LABEL = COMP_UI_M_BANK_REF_NO_1_LABEL;
	}

	public void setCOMP_UI_M_BANK_REF_NO_1(HtmlInputText COMP_UI_M_BANK_REF_NO_1) {
		this.COMP_UI_M_BANK_REF_NO_1 = COMP_UI_M_BANK_REF_NO_1;
	}

	public HtmlOutputLabel getCOMP_UI_M_PD_CC_TYPE_LABEL() {
		return COMP_UI_M_PD_CC_TYPE_LABEL;
	}

	public HtmlSelectOneMenu getCOMP_UI_M_PD_CC_TYPE() {
		return COMP_UI_M_PD_CC_TYPE;
	}

	public void setCOMP_UI_M_PD_CC_TYPE_LABEL(HtmlOutputLabel COMP_UI_M_PD_CC_TYPE_LABEL) {
		this.COMP_UI_M_PD_CC_TYPE_LABEL = COMP_UI_M_PD_CC_TYPE_LABEL;
	}

	public void setCOMP_UI_M_PD_CC_TYPE(HtmlSelectOneMenu COMP_UI_M_PD_CC_TYPE) {
		this.COMP_UI_M_PD_CC_TYPE = COMP_UI_M_PD_CC_TYPE;
	}

	public HtmlOutputLabel getCOMP_UI_M_PD_CC_NO_LABEL() {
		return COMP_UI_M_PD_CC_NO_LABEL;
	}

	public HtmlInputText getCOMP_UI_M_PD_CC_NO() {
		return COMP_UI_M_PD_CC_NO;
	}

	public void setCOMP_UI_M_PD_CC_NO_LABEL(HtmlOutputLabel COMP_UI_M_PD_CC_NO_LABEL) {
		this.COMP_UI_M_PD_CC_NO_LABEL = COMP_UI_M_PD_CC_NO_LABEL;
	}

	public void setCOMP_UI_M_PD_CC_NO(HtmlInputText COMP_UI_M_PD_CC_NO) {
		this.COMP_UI_M_PD_CC_NO = COMP_UI_M_PD_CC_NO;
	}

	public HtmlOutputLabel getCOMP_UI_M_BANK_REF_NO_2_LABEL() {
		return COMP_UI_M_BANK_REF_NO_2_LABEL;
	}

	public HtmlInputText getCOMP_UI_M_BANK_REF_NO_2() {
		return COMP_UI_M_BANK_REF_NO_2;
	}

	public void setCOMP_UI_M_BANK_REF_NO_2_LABEL(HtmlOutputLabel COMP_UI_M_BANK_REF_NO_2_LABEL) {
		this.COMP_UI_M_BANK_REF_NO_2_LABEL = COMP_UI_M_BANK_REF_NO_2_LABEL;
	}

	public void setCOMP_UI_M_BANK_REF_NO_2(HtmlInputText COMP_UI_M_BANK_REF_NO_2) {
		this.COMP_UI_M_BANK_REF_NO_2 = COMP_UI_M_BANK_REF_NO_2;
	}

	public HtmlOutputLabel getCOMP_PD_ATM_CARD_NO_LABEL() {
		return COMP_PD_ATM_CARD_NO_LABEL;
	}

	public HtmlInputText getCOMP_PD_ATM_CARD_NO() {
		return COMP_PD_ATM_CARD_NO;
	}

	public void setCOMP_PD_ATM_CARD_NO_LABEL(HtmlOutputLabel COMP_PD_ATM_CARD_NO_LABEL) {
		this.COMP_PD_ATM_CARD_NO_LABEL = COMP_PD_ATM_CARD_NO_LABEL;
	}

	public void setCOMP_PD_ATM_CARD_NO(HtmlInputText COMP_PD_ATM_CARD_NO) {
		this.COMP_PD_ATM_CARD_NO = COMP_PD_ATM_CARD_NO;
	}

	public HtmlCommandButton getCOMP_UI_M_BUT_PD_CUST_NAME() {
		return COMP_UI_M_BUT_PD_CUST_NAME;
	}

	public void setCOMP_UI_M_BUT_PD_CUST_NAME(HtmlCommandButton COMP_UI_M_BUT_PD_CUST_NAME) {
		this.COMP_UI_M_BUT_PD_CUST_NAME = COMP_UI_M_BUT_PD_CUST_NAME;
	}

	public HtmlCommandButton getCOMP_UI_M_BUT_PD_ADDR_01() {
		return COMP_UI_M_BUT_PD_ADDR_01;
	}

	public void setCOMP_UI_M_BUT_PD_ADDR_01(HtmlCommandButton COMP_UI_M_BUT_PD_ADDR_01) {
		this.COMP_UI_M_BUT_PD_ADDR_01 = COMP_UI_M_BUT_PD_ADDR_01;
	}

	public HtmlCommandButton getCOMP_UI_M_BUT_PD_ADDR_02() {
		return COMP_UI_M_BUT_PD_ADDR_02;
	}

	public void setCOMP_UI_M_BUT_PD_ADDR_02(HtmlCommandButton COMP_UI_M_BUT_PD_ADDR_02) {
		this.COMP_UI_M_BUT_PD_ADDR_02 = COMP_UI_M_BUT_PD_ADDR_02;
	}

	public HtmlCommandButton getCOMP_UI_M_BUT_BANK_LOV() {
		return COMP_UI_M_BUT_BANK_LOV;
	}

	public void setCOMP_UI_M_BUT_BANK_LOV(HtmlCommandButton COMP_UI_M_BUT_BANK_LOV) {
		this.COMP_UI_M_BUT_BANK_LOV = COMP_UI_M_BUT_BANK_LOV;
	}

	public HtmlCommandButton getCOMP_UI_M_BUT_LOV_DPD_REF_ID() {
		return COMP_UI_M_BUT_LOV_DPD_REF_ID;
	}

	public void setCOMP_UI_M_BUT_LOV_DPD_REF_ID(HtmlCommandButton COMP_UI_M_BUT_LOV_DPD_REF_ID) {
		this.COMP_UI_M_BUT_LOV_DPD_REF_ID = COMP_UI_M_BUT_LOV_DPD_REF_ID;
	}

	public HtmlCommandButton getCOMP_UI_M_BUT_MORE() {
		return COMP_UI_M_BUT_MORE;
	}

	public void setCOMP_UI_M_BUT_MORE(HtmlCommandButton COMP_UI_M_BUT_MORE) {
		this.COMP_UI_M_BUT_MORE = COMP_UI_M_BUT_MORE;
	}

	public HtmlCommandButton getCOMP_UI_M_BUT_PD_ADDR_03() {
		return COMP_UI_M_BUT_PD_ADDR_03;
	}

	public void setCOMP_UI_M_BUT_PD_ADDR_03(HtmlCommandButton COMP_UI_M_BUT_PD_ADDR_03) {
		this.COMP_UI_M_BUT_PD_ADDR_03 = COMP_UI_M_BUT_PD_ADDR_03;
	}

	public HtmlCommandButton getCOMP_UI_M_BUT_PD_REMARKS() {
		return COMP_UI_M_BUT_PD_REMARKS;
	}

	public void setCOMP_UI_M_BUT_PD_REMARKS(HtmlCommandButton COMP_UI_M_BUT_PD_REMARKS) {
		this.COMP_UI_M_BUT_PD_REMARKS = COMP_UI_M_BUT_PD_REMARKS;
	}

	public HtmlCommandButton getCOMP_UI_M_BUT_PD_BANK_NAME() {
		return COMP_UI_M_BUT_PD_BANK_NAME;
	}

	public void setCOMP_UI_M_BUT_PD_BANK_NAME(HtmlCommandButton COMP_UI_M_BUT_PD_BANK_NAME) {
		this.COMP_UI_M_BUT_PD_BANK_NAME = COMP_UI_M_BUT_PD_BANK_NAME;
	}

	public HtmlCommandButton getCOMP_UI_M_BUT_PD_BRANCH_NAME() {
		return COMP_UI_M_BUT_PD_BRANCH_NAME;
	}

	public void setCOMP_UI_M_BUT_PD_BRANCH_NAME(HtmlCommandButton COMP_UI_M_BUT_PD_BRANCH_NAME) {
		this.COMP_UI_M_BUT_PD_BRANCH_NAME = COMP_UI_M_BUT_PD_BRANCH_NAME;
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

	public void setDataListPT_IL_PYMT_DTLS(List<PT_IL_PYMT_DTLS> dataList_PT_IL_PYMT_DTLS) {
		this.dataList_PT_IL_PYMT_DTLS = dataList_PT_IL_PYMT_DTLS;
	}

	public void addRow(ActionEvent event){
	try{
	if (isINSERT_ALLOWED()){
	
	PT_IL_PYMT_DTLS_BEAN = new PT_IL_PYMT_DTLS();
	//resetAllComponent();
	//resetSelectedRow();
	}else{
	
	getErrorMap().put("addRow",Messages.getString(PELConstants.pelMessagePropertiesPath, "errorPanel$message$insertnotallowed"));
	getErrorMap().put(PELConstants.PEL_ERROR_WARNING_CURRENT_KEY,Messages.getString(PELConstants.pelMessagePropertiesPath,"errorPanel$message$insertnotallowed"));
	}
	
	}catch(Exception exc){
	getErrorMap().put(PELConstants.PEL_ERROR_WARNING_CURRENT_KEY,exc.getMessage());
	getErrorMap().put("addRow",exc.getMessage());
	}
	
	}


	public void saveRecord() {
		try {
			CommonUtils.getConnection().commit();
		} catch (Exception e) {
			getErrorMap().put(PELConstants.PEL_ERROR_WARNING_CURRENT_KEY, e.getMessage());
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

	public List<SelectItem> getListPD_PAID_FOR() {
		if (listPD_PAID_FOR.size() == 0) {
			listPD_PAID_FOR.clear();
			try {
				listPD_PAID_FOR = new ArrayList<SelectItem>();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return listPD_PAID_FOR;
	}

	public void setListPD_PAID_FOR(List<SelectItem> listPD_PAID_FOR) {
		this.listPD_PAID_FOR = listPD_PAID_FOR;
	}

	public List<SelectItem> getListPD_CC_TYPE() {
		if (listPD_CC_TYPE.size() == 0) {
			listPD_CC_TYPE.clear();
			try {
				listPD_CC_TYPE = new ArrayList<SelectItem>();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return listPD_CC_TYPE;
	}

	public void setListPD_CC_TYPE(List<SelectItem> listPD_CC_TYPE) {
		this.listPD_CC_TYPE = listPD_CC_TYPE;
	}

	public List<SelectItem> getListPD_REM_SLIP_GEN_YN() {
		if (listPD_REM_SLIP_GEN_YN.size() == 0) {
			listPD_REM_SLIP_GEN_YN.clear();
			try {
				listPD_REM_SLIP_GEN_YN = new ArrayList<SelectItem>();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return listPD_REM_SLIP_GEN_YN;
	}

	public void setListPD_REM_SLIP_GEN_YN(List<SelectItem> listPD_REM_SLIP_GEN_YN) {
		this.listPD_REM_SLIP_GEN_YN = listPD_REM_SLIP_GEN_YN;
	}

	public List<SelectItem> getListUI_M_REM_SLIP_GEN_YN() {
		if (listUI_M_REM_SLIP_GEN_YN.size() == 0) {
			listUI_M_REM_SLIP_GEN_YN.clear();
			try {
				listUI_M_REM_SLIP_GEN_YN = new ArrayList<SelectItem>();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return listUI_M_REM_SLIP_GEN_YN;
	}

	public void setListUI_M_REM_SLIP_GEN_YN(List<SelectItem> listUI_M_REM_SLIP_GEN_YN) {
		this.listUI_M_REM_SLIP_GEN_YN = listUI_M_REM_SLIP_GEN_YN;
	}
	public void onLoad(PhaseEvent event){
		 try {
				if (isBlockFlag()) {
					}
					setBlockFlag(false);
			} catch (Exception e) {
				getErrorMap().put(PELConstants.PEL_ERROR_WARNING_CURRENT_KEY,
						e.getMessage());
				getErrorMap().put("onLoad", e.getMessage());
			} 
	 }

	public List<SelectItem> getListUI_M_PD_CC_TYPE() {
		if (listUI_M_PD_CC_TYPE.size() == 0) {
			listUI_M_PD_CC_TYPE.clear();
			try {
				listUI_M_PD_CC_TYPE = new ArrayList<SelectItem>();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return listUI_M_PD_CC_TYPE;
	}

	public void setListUI_M_PD_CC_TYPE(List<SelectItem> listUI_M_PD_CC_TYPE) {
		this.listUI_M_PD_CC_TYPE = listUI_M_PD_CC_TYPE;
	}
	
	public String mainAction(){
		return "PILT003_APAC_PT_IL_PREM_COLL";
	}

	public void fireFieldValidation(ActionEvent actionEvent) {
		UIInput input = (UIInput) actionEvent.getComponent().getParent();
		ErrorHelpUtil.validate(input, getErrorMap());
	}
}