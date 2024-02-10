package com.iii.pel.forms.PILR_REP047;

public interface IP_REP_INFO_SQL_QUERY_CONSTANTS {

	/*[BugId:TRACK_PREMIAGDC_GL.10.5-00168: modified PM_DIVISION to FM_DIVISION. Added by : Mallika.S, 31-Mar-2009 */
	final String IP_REP_INFO_DIVN_CODE_LOV=
		"SELECT DIVN_CODE,DIVN_NAME FROM FM_DIVISION WHERE ROWNUM<?";
	
	final String IP_REP_INFO_DIVN_CODE_LOV_LIKE=
		"SELECT DIVN_CODE,DIVN_NAME FROM FM_DIVISION WHERE DIVN_CODE LIKE ? AND ROWNUM<?";
	
	/*[BugId:TRACK_PREMIAGDC_GL.10.5-00168: modified PM_DEPARTMENT to FM_DEPARTMENT. Added by : Mallika.S, 31-Mar-2009 */
	final String IP_REP_INFO_DEPT_CODE_LOV=
		"SELECT DEPT_CODE,DEPT_NAME FROM FM_DEPARTMENT WHERE ROWNUM<?";
	
	final String IP_REP_INFO_DEPT_CODE_LOV_LIKE=
		"SELECT DEPT_CODE,DEPT_NAME FROM FM_DEPARTMENT WHERE DEPT_CODE LIKE ? AND  ROWNUM<?";
	
	final String IP_REP_INFO_CLASS_CODE_LOV=
		"SELECT CLASS_CODE,CLASS_NAME FROM PM_IL_CLASS WHERE ROWNUM<?";
	
	final String IP_REP_INFO_CLASS_CODE_LOV_LIKE=
		"SELECT CLASS_CODE,CLASS_NAME FROM PM_IL_CLASS WHERE CLASS_CODE LIKE ? AND ROWNUM<?";
	
	final String IP_REP_INFO_PLAN_CODE_LOV=
		"SELECT PLAN_CODE FROM PM_IL_PLAN WHERE ROWNUM<?";
	
	final String IP_REP_INFO_PLAN_CODE_LOV_LIKE=
		"SELECT PLAN_CODE FROM PM_IL_PLAN WHERE PLAN_CODE LIKE ? AND ROWNUM<?"; 
	
	final String IP_REP_INFO_REP_KEY_NO_SEQUENCE=
		"SELECT SEQ_REP_KEY_NO.NEXTVAL FROM DUAL";
	
	/*[BugId:TRACK_PREMIAGDC_GL.10.5-00168: modified PM_DIVISION to FM_DIVISION. Added by : Mallika.S, 31-Mar-2009 */
	final String IP_REP_INFO_BRANCH_CODE_LOV=
		"SELECT DIVN_CODE,DIVN_NAME FROM FM_DIVISION WHERE ROWNUM<?";
	
	final String IP_REP_INFO_BRANCH_CODE_LOV_LIKE=
		"SELECT DIVN_CODE,DIVN_NAME FROM FM_DIVISION WHERE DIVN_CODE LIKE ? AND ROWNUM<?";
	
	
	final String IP_REP_INFO_CLAIM_CODE_LOV=
		"SELECT CLAIM_NO,CLAIM_LOSS_DT FROM PT_IL_CLAIM WHERE ROWNUM<?";
	
	final String IP_REP_INFO_CLAIM_CODE_LOV_LIKE=
		"SELECT CLAIM_NO,CLAIM_LOSS_DT FROM PT_IL_CLAIM WHERE CLAIM_NO LIKE ? AND ROWNUM<?";
	
	final String IP_REP_INFO_CLAIM_TYPE_LOV=
		"SELECT CLAIM_TYPE,CLAIM_LOSS_DT FROM PT_IL_CLAIM WHERE ROWNUM<?";
	
	final String IP_REP_INFO_CLAIM_TYPE_LOV_LIKE=
		"SELECT CLAIM_TYPE,CLAIM_LOSS_DT FROM PT_IL_CLAIM WHERE CLAIM_NO LIKE ? AND ROWNUM<?";
	
	final String IP_REP_INFO_BROKER_CODE_FROM_LOV=
		"SELECT CUST_CODE,CUST_SHORT_NAME FROM PM_CUSTOMER, PM_CUST_CLASS WHERE CUST_CLASS=CCLAS_CODE AND CCLAS_TYPE= '002' AND ROWNUM<?";
	
	final String IP_REP_INFO_BROKER_CODE_FROM_LOV_LIKE=
		"SELECT CUST_CODE,CUST_SHORT_NAME FROM PM_CUSTOMER, PM_CUST_CLASS WHERE CUST_CLASS LIKE ? AND CCLAS_TYPE= '002' AND ROWNUM<?";
	
	
	

}
