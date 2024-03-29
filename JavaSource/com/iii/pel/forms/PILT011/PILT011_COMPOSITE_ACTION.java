package com.iii.pel.forms.PILT011;

public class PILT011_COMPOSITE_ACTION {

	
	private PT_IL_TTY_CLAIM_EST_ACTION PT_IL_TTY_CLAIM_EST_ACTION_BEAN;
	private PT_IL_FAC_CLAIM_PART_CUST_PAID_ACTION PT_IL_FAC_CLAIM_PART_CUST_PAID_ACTION_BEAN;
	private PT_IL_FAC_CLAIM_PART_CUST_EST_ACTION PT_IL_FAC_CLAIM_PART_CUST_EST_ACTION_BEAN;
	private PT_IL_FAC_CLAIM_PAID_ACTION PT_IL_FAC_CLAIM_PAID_ACTION_BEAN;
	private PT_IL_FAC_CLAIM_EST_ACTION PT_IL_FAC_CLAIM_EST_ACTION_BEAN;
	private PH_IL_TTY_CLAIM_EST_ACTION PH_IL_TTY_CLAIM_EST_ACTION_BEAN;
	private PH_IL_FAC_CLAIM_PART_CUST_EST_ACTION PH_IL_FAC_CLAIM_PART_CUST_EST_ACTION_BEAN;
	private PH_IL_FAC_CLAIM_EST_ACTION PH_IL_FAC_CLAIM_EST_ACTION_BEAN;
	private DUMMY_ACTION DUMMY_ACTION_BEAN;
	
	public PILT011_COMPOSITE_ACTION(){
		PT_IL_TTY_CLAIM_EST_ACTION_BEAN = new PT_IL_TTY_CLAIM_EST_ACTION();
		PT_IL_FAC_CLAIM_PART_CUST_PAID_ACTION_BEAN = new PT_IL_FAC_CLAIM_PART_CUST_PAID_ACTION();
		PT_IL_FAC_CLAIM_PART_CUST_EST_ACTION_BEAN = new PT_IL_FAC_CLAIM_PART_CUST_EST_ACTION();
		PT_IL_FAC_CLAIM_PAID_ACTION_BEAN = new PT_IL_FAC_CLAIM_PAID_ACTION();
		PT_IL_FAC_CLAIM_EST_ACTION_BEAN = new PT_IL_FAC_CLAIM_EST_ACTION();
		PH_IL_TTY_CLAIM_EST_ACTION_BEAN = new PH_IL_TTY_CLAIM_EST_ACTION();
		PH_IL_FAC_CLAIM_PART_CUST_EST_ACTION_BEAN = new PH_IL_FAC_CLAIM_PART_CUST_EST_ACTION();
		PH_IL_FAC_CLAIM_EST_ACTION_BEAN = new PH_IL_FAC_CLAIM_EST_ACTION();
		DUMMY_ACTION_BEAN = new DUMMY_ACTION();
		
		PT_IL_TTY_CLAIM_EST_ACTION_BEAN.compositeAction = this;
		PT_IL_FAC_CLAIM_PART_CUST_PAID_ACTION_BEAN.compositeAction = this;
		PT_IL_FAC_CLAIM_PART_CUST_EST_ACTION_BEAN.compositeAction = this;
		PT_IL_FAC_CLAIM_PAID_ACTION_BEAN.compositeAction = this;
		PT_IL_FAC_CLAIM_EST_ACTION_BEAN.compositeAction = this;
		PH_IL_TTY_CLAIM_EST_ACTION_BEAN.compositeAction = this;
		PH_IL_FAC_CLAIM_PART_CUST_EST_ACTION_BEAN.compositeAction = this;
		PH_IL_FAC_CLAIM_EST_ACTION_BEAN.compositeAction = this;
		DUMMY_ACTION_BEAN.compositeAction = this;
		
		
		
	}

	public PT_IL_TTY_CLAIM_EST_ACTION getPT_IL_TTY_CLAIM_EST_ACTION_BEAN() {
		return PT_IL_TTY_CLAIM_EST_ACTION_BEAN;
	}

	public void setPT_IL_TTY_CLAIM_EST_ACTION_BEAN(
			PT_IL_TTY_CLAIM_EST_ACTION pt_il_tty_claim_est_action_bean) {
		PT_IL_TTY_CLAIM_EST_ACTION_BEAN = pt_il_tty_claim_est_action_bean;
	}

	public PT_IL_FAC_CLAIM_PART_CUST_PAID_ACTION getPT_IL_FAC_CLAIM_PART_CUST_PAID_ACTION_BEAN() {
		return PT_IL_FAC_CLAIM_PART_CUST_PAID_ACTION_BEAN;
	}

	public void setPT_IL_FAC_CLAIM_PART_CUST_PAID_ACTION_BEAN(
			PT_IL_FAC_CLAIM_PART_CUST_PAID_ACTION pt_il_fac_claim_part_cust_paid_action_bean) {
		PT_IL_FAC_CLAIM_PART_CUST_PAID_ACTION_BEAN = pt_il_fac_claim_part_cust_paid_action_bean;
	}

	public PT_IL_FAC_CLAIM_PART_CUST_EST_ACTION getPT_IL_FAC_CLAIM_PART_CUST_EST_ACTION_BEAN() {
		return PT_IL_FAC_CLAIM_PART_CUST_EST_ACTION_BEAN;
	}

	public void setPT_IL_FAC_CLAIM_PART_CUST_EST_ACTION_BEAN(
			PT_IL_FAC_CLAIM_PART_CUST_EST_ACTION pt_il_fac_claim_part_cust_est_action_bean) {
		PT_IL_FAC_CLAIM_PART_CUST_EST_ACTION_BEAN = pt_il_fac_claim_part_cust_est_action_bean;
	}

	public PT_IL_FAC_CLAIM_PAID_ACTION getPT_IL_FAC_CLAIM_PAID_ACTION_BEAN() {
		return PT_IL_FAC_CLAIM_PAID_ACTION_BEAN;
	}

	public void setPT_IL_FAC_CLAIM_PAID_ACTION_BEAN(
			PT_IL_FAC_CLAIM_PAID_ACTION pt_il_fac_claim_paid_action_bean) {
		PT_IL_FAC_CLAIM_PAID_ACTION_BEAN = pt_il_fac_claim_paid_action_bean;
	}

	public PT_IL_FAC_CLAIM_EST_ACTION getPT_IL_FAC_CLAIM_EST_ACTION_BEAN() {
		return PT_IL_FAC_CLAIM_EST_ACTION_BEAN;
	}

	public void setPT_IL_FAC_CLAIM_EST_ACTION_BEAN(
			PT_IL_FAC_CLAIM_EST_ACTION pt_il_fac_claim_est_action_bean) {
		PT_IL_FAC_CLAIM_EST_ACTION_BEAN = pt_il_fac_claim_est_action_bean;
	}

	public PH_IL_TTY_CLAIM_EST_ACTION getPH_IL_TTY_CLAIM_EST_ACTION_BEAN() {
		return PH_IL_TTY_CLAIM_EST_ACTION_BEAN;
	}

	public void setPH_IL_TTY_CLAIM_EST_ACTION_BEAN(
			PH_IL_TTY_CLAIM_EST_ACTION ph_il_tty_claim_est_action_bean) {
		PH_IL_TTY_CLAIM_EST_ACTION_BEAN = ph_il_tty_claim_est_action_bean;
	}

	public PH_IL_FAC_CLAIM_PART_CUST_EST_ACTION getPH_IL_FAC_CLAIM_PART_CUST_EST_ACTION_BEAN() {
		return PH_IL_FAC_CLAIM_PART_CUST_EST_ACTION_BEAN;
	}

	public void setPH_IL_FAC_CLAIM_PART_CUST_EST_ACTION_BEAN(
			PH_IL_FAC_CLAIM_PART_CUST_EST_ACTION ph_il_fac_claim_part_cust_est_action_bean) {
		PH_IL_FAC_CLAIM_PART_CUST_EST_ACTION_BEAN = ph_il_fac_claim_part_cust_est_action_bean;
	}

	public PH_IL_FAC_CLAIM_EST_ACTION getPH_IL_FAC_CLAIM_EST_ACTION_BEAN() {
		return PH_IL_FAC_CLAIM_EST_ACTION_BEAN;
	}

	public void setPH_IL_FAC_CLAIM_EST_ACTION_BEAN(
			PH_IL_FAC_CLAIM_EST_ACTION ph_il_fac_claim_est_action_bean) {
		PH_IL_FAC_CLAIM_EST_ACTION_BEAN = ph_il_fac_claim_est_action_bean;
	}

	public DUMMY_ACTION getDUMMY_ACTION_BEAN() {
		return DUMMY_ACTION_BEAN;
	}

	public void setDUMMY_ACTION_BEAN(DUMMY_ACTION dummy_action_bean) {
		DUMMY_ACTION_BEAN = dummy_action_bean;
	}
	
	
}
