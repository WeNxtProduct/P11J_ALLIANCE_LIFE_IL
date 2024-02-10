package com.iii.pel.forms.PILR_REP061;

public interface PILR_REP061_QUERY_CONSTANTS {

	
	String DIVISION_QUERY=
		" SELECT DIVN_CODE,DIVN_NAME FROM PM_DIVISION WHERE DIVN_COMP_CODE = '001'" +
		" AND DIVN_FRZ_FLAG = 'N' AND ROWNUM<=? ORDER BY 1 ";
	
	String DIVISION_QUERY_LIKE=
		" SELECT DIVN_CODE,DIVN_NAME FROM PM_DIVISION WHERE DIVN_COMP_CODE = '001'" +
		" AND DIVN_FRZ_FLAG = 'N' AND (DIVN_CODE LIKE ?  OR DIVN_NAME LIKE ?) AND ROWNUM<=? ORDER BY 1 ";
	
	String DEPARTMENT_QUERY=
		" SELECT DEPT_CODE,DEPT_NAME,DEPT_DIVN_CODE FROM PM_DEPARTMENT WHERE DEPT_COMP_CODE = '001' AND " +
		" DEPT_FRZ_FLAG = 'N' AND DEPT_DIVN_CODE BETWEEN ? AND ?  AND ROWNUM<=? ORDER BY 1 ";
	
	String DEPARTMENT_QUERY_LIKE=
		" SELECT DEPT_CODE,DEPT_NAME,DEPT_DIVN_CODE FROM PM_DEPARTMENT WHERE DEPT_COMP_CODE = '001' AND " +
		" DEPT_FRZ_FLAG = 'N' AND DEPT_DIVN_CODE BETWEEN ? AND ?  AND (DEPT_CODE LIKE ? OR DEPT_NAME LIKE ?) AND  ROWNUM<=? ORDER BY 1 ";
	
	String CLASS_QUERY=
		" SELECT CLASS_CODE,CLASS_NAME FROM PM_CLASS WHERE PM_CLASS.CLASS_FRZ_FLAG = 'N' " +
		" AND ROWNUM <=? ORDER BY 1";

	String CLASS_QUERY_LIKE=
		" SELECT CLASS_CODE,CLASS_NAME FROM PM_CLASS WHERE PM_CLASS.CLASS_FRZ_FLAG = 'N' " +
		" AND (CLASS_CODE LIKE ? OR CLASS_NAME LIKE ?) AND ROWNUM <=? ORDER BY 1";
	
	String SUB_CLASS_QUERY=
		" SELECT SC_CODE,SC_NAME FROM PM_SUB_CLASS WHERE PM_SUB_CLASS.SC_FRZ_FLAG = 'N' AND ROWNUM<=? ORDER BY 1";
	
	String SUB_CLASS_QUERY_LIKE=
		" SELECT SC_CODE,SC_NAME FROM PM_SUB_CLASS WHERE PM_SUB_CLASS.SC_FRZ_FLAG = 'N' AND (SC_CODE LIKE ? OR SC_NAME LIKE ?)" +
		" AND ROWNUM<=? ORDER BY 1";

	String CUST_CLASS_WHEN_VALIDATE_ITEM_CURSOR =
		" SELECT CCLAS_CLASS_DESC FROM PM_CUST_CLASS  WHERE  CCLAS_TYPE = ? ORDER BY 1";

	String CUST_CLASS_QUERY = "SELECT CCLAS_CODE,CCLAS_CLASS_DESC FROM PM_CUST_CLASS WHERE CCLAS_FRZ_FLAG = 'N'  AND ROWNUM <=?  ORDER BY 1";

	String CUST_CLASS_QUERY_LIKE = "SELECT CCLAS_CODE,CCLAS_CLASS_DESC FROM PM_CUST_CLASS WHERE CCLAS_FRZ_FLAG = 'N'  AND (CCLAS_CODE LIKE ? OR CCLAS_CLASS_DESC LIKE ?) AND ROWNUM <=? ORDER BY 1";

	String CUST_CODE ="SELECT CUST_CODE,CUST_NAME FROM PM_CUSTOMER WHERE CUST_FRZ_FLAG ='N' AND ROWNUM<=? ORDER BY 1";
	
	String CUST_CODE_LIKE ="SELECT CUST_CODE,CUST_NAME FROM PM_CUSTOMER WHERE CUST_FRZ_FLAG ='N' AND (CUST_CODE LIKE ? OR CUST_NAME LIKE ?) AND ROWNUM<=? ORDER BY 1";

	String FPPC_CUST_CODE ="SELECT CUST_CODE,CUST_NAME FROM PM_CUSTOMER WHERE CUST_FRZ_FLAG ='N' AND ROWNUM<=? ORDER BY 1";
	
	String FPPC_CUST_CODE_LIKE ="SELECT CUST_CODE,CUST_NAME FROM PM_CUSTOMER WHERE AND CUST_FRZ_FLAG ='N' AND (CUST_CODE LIKE ? OR CUST_NAME LIKE ?) AND ROWNUM<=? ORDER BY 1";
	
	
}