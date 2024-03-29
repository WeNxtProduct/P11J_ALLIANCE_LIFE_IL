package com.iii.pel.forms.PILR_REP136;

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
	
	 
	
	
	

}
