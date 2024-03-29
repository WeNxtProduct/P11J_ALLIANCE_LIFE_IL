package com.iii.pel.forms.PILM040;

public interface PM_IL_MASTER_SQLQUERY_CONSTANTS {
	
	
	 public String PM_IL_MASTER_LOV_QUERY="SELECT PROD_CODE, PROD_DESC FROM PM_IL_PRODUCT WHERE PROD_CODE IS NOT NULL";
	
	 public String PM_IL_MASTER_LOV_QUERY_LIKE="SELECT PROD_CODE,PROD_DESC FROM PM_IL_PRODUCT WHERE PROD_CODE  LIKE ? AND PROD_CODE IS NOT NULL AND ROWNUM <25";
     
	 public String SELECT_ALL_PM_IL_MASTER_POLICY="SELECT PM_IL_MASTER_POLICY.ROWID,MP_CUST_CODE,MP_PROD_CODE,MP_POL_NO,MP_ISSUE_DT,MP_POL_FM_DT,MP_LC_MAX_TPD_BNF,MP_PRE_TPD_BNF_MONTHS,MP_LC_FUNERAL_EXP_LMT,MP_LC_FUNERAL_EXP_AMT,MP_CLM_INTM_DAYS,MP_NOTICE_PRD,MP_LC_FCL,MP_CR_DT,MP_CR_UID,MP_UPD_DT,MP_UPD_UID FROM PM_IL_MASTER_POLICY";
	 
	 public String PM_IL_MASTER_PRODT_CODE_DESC="SELECT PROD_DESC FROM   PM_IL_PRODUCT WHERE  PROD_CODE LIKE ?";
	 
	 public String L_DUP_CHECK_POL_NO_QUERY= "SELECT 'X' FROM  PM_IL_MASTER_POLICY  WHERE  MP_POL_NO = ?";
	 
	 public String PM_IL_MASTER_ROW_ID="SELECT ROWID FROM PM_IL_MASTER_POLICY WHERE MP_POL_NO LIKE ?";
	 
     public String L_DUP_CHECK_POLICY_NO="SELECT 'X' FROM   PM_IL_MASTER_POLICY WHERE  MP_POL_NO =? AND ROWID <> ?";
    
     public String L_GET_PROD_CODE_DESC="SELECT PROD_DESC FROM PM_IL_PRODUCT WHERE  PROD_CODE LIKE ?";
	 
     public String PM_IL_MASTER_POL_NO="SELECT 'X' FROM PT_IL_POLICY WHERE POL_MASTER_POL_NO LIKE ?";
     
//	final String DELETE_PM_IL_FUND_ACCOUNT_SETUP="DELETE FROM PM_IL_FUND_ACCOUNT_SETUP WHERE ROWID ?";
//	final String UPDATE_PM_IL_MASTER_POLICY="UPDATE * FROM PM_IL_FUND_ACCOUNT_SETUP WHERE ROWID=?";
//	final String LOV_FAS_SRC_BUS_FM_TO="SELECT PC_CODE,PC_DESC,PC_BL_DESC FROM PM_CODES" +
//			" WHERE PC_TYPE ='SRC_BUS_TY'AND NVL(PC_FRZ_FLAG,'N') = 'N'";
//	final String LOV_FAS_DEPT_FM_TO_CODE="SELECT DEPT_CODE,DEPT_NAME,DEPT_CODE " +
//			"FROM PM_DEPARTMENT WHERE DEPT_COMP_CODE = ':CTRL.M_COMP_CODE' AND " +
//			"DEPT_DIVN_CODE = ':PM_IL_FUND_ACCOUNT_SETUP.FAS_DIVN_FM_CODE' AND " +
//			"DEPT_FRZ_FLAG  = 'N' AND EXISTS (SELECT 1 FROM PM_APPR_DEPT_SETUP " +
//			"WHERE ADS_DIVN_CODE = DEPT_DIVN_CODE AND ADS_DEPT_CODE = DEPT_CODE" +
//			" AND ADS_USER_ID = NVL('&M_PARA_3',ADS_USER_ID) ANDADS_FRZ_FLAG = 'N')";
//	final String LOV_FAS_DOC_FM_TO_TYPE="SELECT DS_CODE,DS_DESC FROM " +
//			"PM_IL_DOC_SETUP WHERE ( DS_TYPE = '2' OR DS_TYPE = '2')  AND" +
//			"  NVL(DS_FRZ_FLAG ,'N') ='N'";
     
     String PM_IL_MASTER_WHEN_NEW_FORM_QUERY="SELECT 'X' FROM   PM_IL_MASTER_POLICY WHERE  MP_CUST_CODE =?";
     
     String SELECT_DETAILS_FOR_CUST_CODE="SELECT ROWID,PM_IL_MASTER_POLICY.* FROM PM_IL_MASTER_POLICY WHERE MP_CUST_CODE =?";
     
     String PRODUCT_DESC_FOR_PRODUCT_CODE="SELECT PROD_DESC FROM   PM_IL_PRODUCT WHERE  PROD_CODE = ?";
}
