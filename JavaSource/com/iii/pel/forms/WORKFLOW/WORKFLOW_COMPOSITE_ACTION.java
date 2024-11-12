package com.iii.pel.forms.WORKFLOW;


public class WORKFLOW_COMPOSITE_ACTION {

	private PGIM_WORKFLOW_BUCKET_ACTION PGIM_WORKFLOW_BUCKET_ACTION_BEAN;
	
	public PGIM_WORKFLOW_BUCKET_ACTION getPGIM_WORKFLOW_BUCKET_ACTION_BEAN() {
		return PGIM_WORKFLOW_BUCKET_ACTION_BEAN;
	}


	public void setPGIM_WORKFLOW_BUCKET_ACTION_BEAN(
			PGIM_WORKFLOW_BUCKET_ACTION pGIM_WORKFLOW_BUCKET_ACTION_BEAN) {
		PGIM_WORKFLOW_BUCKET_ACTION_BEAN = pGIM_WORKFLOW_BUCKET_ACTION_BEAN;
	}

	private PGIM_WF_WORKSTEP_MAPPING_ACTION PGIM_WF_WORKSTEP_MAPPING_ACTION_BEAN;

	public PGIM_WF_WORKSTEP_MAPPING_ACTION getPGIM_WF_WORKSTEP_MAPPING_ACTION_BEAN() {
		return PGIM_WF_WORKSTEP_MAPPING_ACTION_BEAN;
	}


	public void setPGIM_WF_WORKSTEP_MAPPING_ACTION_BEAN(
			PGIM_WF_WORKSTEP_MAPPING_ACTION pGIM_WF_WORKSTEP_MAPPING_ACTION_BEAN) {
		PGIM_WF_WORKSTEP_MAPPING_ACTION_BEAN = pGIM_WF_WORKSTEP_MAPPING_ACTION_BEAN;
	}

	
	private PGIM_WF_MAIL_USGRP_ACTION PGIM_WF_MAIL_USGRP_ACTION_BEAN;


	public PGIM_WF_MAIL_USGRP_ACTION getPGIM_WF_MAIL_USGRP_ACTION_BEAN() {
		return PGIM_WF_MAIL_USGRP_ACTION_BEAN;
	}


	public void setPGIM_WF_MAIL_USGRP_ACTION_BEAN(
			PGIM_WF_MAIL_USGRP_ACTION pGIM_WF_MAIL_USGRP_ACTION_BEAN) {
		PGIM_WF_MAIL_USGRP_ACTION_BEAN = pGIM_WF_MAIL_USGRP_ACTION_BEAN;
	}


	public WORKFLOW_COMPOSITE_ACTION()
	{
		System.out.println("Welcome to PILM107_COMPOSITE_ACTION");
		PGIM_WORKFLOW_BUCKET_ACTION_BEAN=new PGIM_WORKFLOW_BUCKET_ACTION();
		PGIM_WORKFLOW_BUCKET_ACTION_BEAN.compositeAction=this;
		
		PGIM_WF_WORKSTEP_MAPPING_ACTION_BEAN = new PGIM_WF_WORKSTEP_MAPPING_ACTION();
		PGIM_WF_WORKSTEP_MAPPING_ACTION_BEAN.compositeAction = this;
		
		PGIM_WF_MAIL_USGRP_ACTION_BEAN = new PGIM_WF_MAIL_USGRP_ACTION();
		PGIM_WF_MAIL_USGRP_ACTION_BEAN.compositeAction=this;

	}
	

	
	
	


}
