package com.iii.pel.forms.PILM016_APAC;

public interface PM_IL_CONTRACTOR_SQL_CONSTANTS {
	
	String PM_IL_CONTRACTOR_P_CREATE_NUMBER_SELECT_PS_VALUE="SELECT PS_VALUE FROM  PP_SYSTEM  WHERE  PS_TYPE  = 'NUM_GEN_YN'  AND PS_CODE  = 'CONTRACTOR' ";
	
	String PM_IL_CONTRACTOR_P_CREATE_NUMBER_SELECT_PS_CODE="SELECT PS_CODE FROM  PP_SYSTEM  WHERE  PS_TYPE  = 'IL_CONT_NUM'  AND PS_BL_CODE_DESC  = ?";
	
	String PM_IL_CONTRACTOR_P_CREATE_NUMBER_SELECT_NGS_YN="SELECT    'X',    NGS_DISABLE_YN FROM  PM_NUMBER_GEN_SETUP  WHERE  NGS_CODE  = ? ";
	
	String PM_IL_CONTRACTOR_P_GEN_AUTO_NO_SELECT_NGS_VALUES="SELECT    NGS_CODE,    NGS_PREFIX_YN,    NGS_PREFIX,    NGS_SUFFIX_YN,    NGS_SUFFIX," +
															    "NGS_PAD_YN,    NGS_PAD_LENGTH,    NGS_CHK_DIGIT_YN,    NGS_FIRST_NO,    NGS_CURR_NO," +
															    "NGS_LAST_NO,    NGS_DISABLE_YN FROM  PM_NUMBER_GEN_SETUP  WHERE  NGS_CODE  = ? ";

	String PM_IL_CONTRACTOR_P_GEN_AUTO_NO_SELECT_NGS_CURRNO="SELECT DECODE(SIGN(NGS_LAST_NO - NGS_CURR_NO), - 1, NGS_FIRST_NO, NGS_CURR_NO) FROM  PM_NUMBER_GEN_SETUP  WHERE  NGS_CODE  = ? ";

	String PM_IL_CONTRACTOR_P_GEN_AUTO_NO_UPDATE_PM_NOGENSETUP="UPDATE   PM_NUMBER_GEN_SETUP    SET NGS_CURR_NO =?  WHERE  NGS_CODE  =? ";

	
	String PM_IL_CONTRACTOR_SEARCH_QUERY="SELECT DISTINCT CONT_REF_ID1,CONT_REF_ID2,CONT_NAME,CONT_CODE,ROWID FROM PM_IL_CONTRACTOR WHERE ROWNUM<25 AND CONT_CODE LIKE NVL";
    
	String PM_IL_CONTRACTOR_MASTER_RECORDS_FETCH_QUERY="SELECT ROWID,CONT_CODE,CONT_NAME,CONT_REF_ID2,CONT_REF_ID1,CONT_ADDR1,CONT_ADDR2,CONT_ADDR3,CONT_CONTACT,CONT_TEL_AREA_CODE,CONT_PHONE,"
+"CONT_FAX_AREA_CODE,CONT_FAX,CONT_MOBILE_NO,CONT_AREA,CONT_CITY_CODE,CONT_CITY,CONT_STATE_CODE,CONT_STATE,CONT_COUNT_CODE,"
+"CONT_COUNTRY,CONT_EMAIL_ID,CONT_BIRTH_CERT_NO,CONT_DOB,CONT_MAR_STATUS,CONT_RELIGION,CONT_NATIONALITY_CODE,CONT_RACE,"
+"CONT_EMPLOYER_YN,CONT_PREFERRED_LANG,CONT_AD_BANK_CODE,CONT_REGION,CONT_REMARKS,CONT_BL_ADDR1,CONT_BL_ADDR2,CONT_BL_ADDR3,"
+"CONT_BL_NAME,CONT_BL_CONTACT,CONT_POSTAL_CODE,CONT_CATG_CODE,CONT_LC_POL_DEP_AMT,CONT_LC_POL_UTIL_AMT,CONT_LC_PROP_DEP_AMT,"
+"CONT_LC_PROP_UTIL_AMT,CONT_EFF_FM_DT,CONT_EFF_TO_DT FROM PM_IL_CONTRACTOR WHERE ROWID = ?";
	
	
}
