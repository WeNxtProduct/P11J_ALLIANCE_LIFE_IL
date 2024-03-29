package com.iii.pel.forms.PILT006_APAC;

public interface PT_IL_CLAIM_STATUS_HELPER_SQL_CONSTANTS {

	String STATUS_CODE_WHEN_VALIDATE_SELECT_QUERY1 = "SELECT MAX(CS_SYS_ID) FROM PT_IL_CLAIM_STATUS WHERE CS_CLM_SYS_ID = ? ";
	
	String STATUS_CODE_WHEN_VALIDATE_SELECT_QUERY2 = "SELECT CS_STATUS_CODE FROM  PT_IL_CLAIM_STATUS  WHERE  CS_CLM_SYS_ID  = ?  AND CS_SYS_ID  = ?";
	
	String STATUS_CODE_WHEN_VALIDATE_SELECT_QUERY3 = "SELECT ASD_CHAR_VALUE FROM PM_IL_APPR_SETUP_DET WHERE ASD_CODE  = 'CLM_CLO_OPEN' AND ASD_USER_ID  = ?  AND ?  BETWEEN NVL(ASD_FM_PROD_CODE, 0)  AND  NVL(ASD_TO_PROD_CODE, 'ZZZZZZZZZZZZ') ";
	
	String OK_BUTTON_WHEN_VALIDATE_SELECT_QUERY2 = "SELECT MAX(CS_SYS_ID) FROM PT_IL_CLAIM_STATUS WHERE CS_CLM_SYS_ID  = ? ";
	
	String OK_BUTTON_WHEN_VALIDATE_SELECT_QUERY3 =  "SELECT CS_STATUS_CODE FROM  PT_IL_CLAIM_STATUS  WHERE  CS_CLM_SYS_ID  = ?  AND CS_SYS_ID  = ? ";
	
	String OK_BUTTON_WHEN_VALIDATE_SELECT_QUERY4 =  "SELECT LIV_CODE_DESC FROM PP_LIST_ITEM_VALUES WHERE LIV_SYS_PARAM  = 'IL_CLM_STS'  AND LIV_CODE  = ? ";
	
	String OK_BUTTON_WHEN_VALIDATE_SELECT_QUERY5 = "SELECT CS_STATUS_CODE FROM PT_IL_CLAIM_STATUS WHERE CS_SYS_ID = (SELECT MAX(CS_SYS_ID) FROM PT_IL_CLAIM_STATUS WHERE CS_CLM_SYS_ID = ? )";
	
	String OK_BUTTON_WHEN_VALIDATE_SELECT_QUERY6 = "SELECT DS_TYPE FROM  PM_IL_DOC_SETUP  WHERE  DS_CODE  = ? AND DS_TYPE  = '4' ";
	
	String OK_BUTTON_WHEN_VALIDATE_SELECT_QUERY7 = "SELECT ASD_CHAR_VALUE FROM  PM_IL_APPR_SETUP_DET  WHERE  ASD_CODE  = 'CLM_CLO_OPEN'  AND ASD_USER_ID  = ?  AND ? BETWEEN NVL(ASD_FM_PROD_CODE, 0)  AND  NVL(ASD_TO_PROD_CODE, 'ZZZZZZZZZZZZ') ";
	
	String OK_BUTTON_WHEN_VALIDATE_SELECT_QUERY8 = "SELECT PLAN_TYPE FROM  PM_IL_PLAN  WHERE  PLAN_CODE  = (SELECT POL_PLAN_CODE FROM  PT_IL_POLICY WHERE POL_NO = ? ) ";
	
	
	
	
	
	
	
	
	
	
	
	
	
}
