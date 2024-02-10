package com.iii.pel.forms.PM078_A;
public interface PM078_A_QUERYCONSTANTS { 
	String ModuleCode_Values = "SELECT PS_CODE, PS_CODE_DESC FROM PP_SYSTEM WHERE PS_TYPE = 'LIMODCODES' ORDER BY 1";
	
	String ChargeMode_Values = "SELECT LIV_CODE, LIV_CODE_DESC FROM PP_LIST_ITEM_VALUES WHERE LIV_SYS_PARAM = 'CHARGEMODE'";
	
	String ZeroPrem_YN_Values = "SELECT LIV_CODE, LIV_CODE_DESC FROM PP_LIST_ITEM_VALUES WHERE LIV_SYS_PARAM = 'YESNO'";
	
	String RiskLoad_YN_Values = "SELECT LIV_CODE, LIV_CODE_DESC FROM PP_LIST_ITEM_VALUES WHERE LIV_SYS_PARAM = 'YESNO'";
	
	String RiskCalcMTHD_Values = "SELECT LIV_CODE, LIV_CODE_DESC FROM PP_LIST_ITEM_VALUES WHERE LIV_SYS_PARAM = 'WAK_RISK_CAL'";
	
	String WaksExpCalc_MTHD_Values = "SELECT LIV_CODE, LIV_CODE_DESC FROM PP_LIST_ITEM_VALUES WHERE LIV_SYS_PARAM = 'WAK_EXP_CAL'";
	
	String CoverCodeLike = "SELECT COVER_CODE,COVER_DESC FROM PM_IL_COVER WHERE COVER_FRZ_FLAG = 'N' AND (COVER_CODE LIKE ?  OR COVER_DESC LIKE ?) AND ROWNUM<=? ORDER BY 1";
	
	String CoverCode = "SELECT COVER_CODE,COVER_DESC FROM PM_IL_COVER WHERE COVER_FRZ_FLAG = 'N' AND ROWNUM<=? ORDER BY 1 ";
	
	String ProductCode = "SELECT PROD_CODE,PROD_DESC,PROD_BL_DESC FROM PM_IL_PRODUCT WHERE ROWNUM<=? ORDER BY 1";
	
	String ProductCodeLike = "SELECT PROD_CODE,PROD_DESC,PROD_BL_DESC FROM PM_IL_PRODUCT WHERE (PROD_CODE LIKE ?  OR PROD_DESC LIKE ?) AND ROWNUM<=? ORDER BY 1";
	
	String SubClassCode = "SELECT SC_CODE,SC_NAME FROM PM_SUB_CLASS WHERE SC_FRZ_FLAG = 'N' WHERE ROWNUM<=? ORDER BY 1";
	
	String SubClassCodeLike = "SELECT SC_CODE,SC_NAME FROM PM_SUB_CLASS WHERE SC_FRZ_FLAG = 'N' WHERE (SC_CODE LIKE ?  OR SC_NAME LIKE ?) AND ROWNUM<=?";
}