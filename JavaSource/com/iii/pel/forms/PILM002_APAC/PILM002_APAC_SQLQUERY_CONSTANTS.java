package com.iii.pel.forms.PILM002_APAC;

public interface PILM002_APAC_SQLQUERY_CONSTANTS {
	final String FETCH_ROW_COUNT="25";
	
	final String SELECT_ALL_PM_IL_COVER = "SELECT ROWID,PM_IL_COVER.* " +
			"FROM PM_IL_COVER WHERE ROWID= ?";
	
	final String LOV_AWCVR_COVER_CODE="SELECT COVER_CODE,COVER_DESC,COVER_BL_DESC " +
			"FROM PM_IL_COVER WHERE COVER_FRZ_FLAG = 'N'  AND COVER_TYPE IN ('A','S') AND ROWNUM <= ?";
	
	final String SELECT_PM_IL_COVER_BY_COVER_CODE="SELECT COVER_CODE FROM PM_IL_COVER" +
			" WHERE COVER_CODE=?";
	
	final String SELECT_PM_IL_APPL_WOP_COVER_BY_COVER_CODE= "SELECT ROWID,PM_IL_APPL_WOP_COVER.* FROM " +
			"PM_IL_APPL_WOP_COVER WHERE AWCVR_CODE = ?";
	
	final String SELECT_PM_IL_CVR_WAITING_PRD_BY_COVER_CODE="SELECT ROWID,PM_IL_CVR_WAITING_PRD.* FROM " +
			"PM_IL_CVR_WAITING_PRD WHERE CWP_COVER_CODE=?";
	
	final String LOV_CWP_ILLNESS_TYP="SELECT PC_CODE,PC_DESC FROM PM_CODES WHERE " +
			"PC_TYPE = 'IL_ILL_TYP' AND ROWNUM <= ? ";
	
	final String DELETE_PM_IL_APPL_WOP_COVER_BY_COVER_CODE="DELETE FROM PM_IL_APPL_WOP_COVER" +
			" WHERE AWCVR_CODE= ?";
	
	final String DELETE_PM_IL_CVR_WAITING_PRD_BY_COVER_CODE="DELETE FROM PM_IL_CVR_WAITING_PRD" +
			" WHERE CWP_COVER_CODE= ?";
	
	final String SELECT_PP_SYSTEM_BY_COVER_CODE="SELECT COUNT(*) FROM PP_SYSTEM WHERE" +
			" PS_TYPE='IL_CIC_CVR' AND PS_CODE=?";
	
	final String INSERT_PP_SYSTEM="INSERT INTO PP_SYSTEM1( PS_TYPE,PS_TYPE_DESC," +
			"PS_CODE,PS_CODE_DESC,PS_VALUE,PS_USER_MOD_YN,PS_BL_CODE_DESC, PS_CR_DT," +
			"PS_CR_UID,PS_UPD_DT,PS_UPD_UID) VALUES('IL_CIC_CVR','Critical Illness Cover'," +
			"?,?,1,'Y',?,?,?,NULL,NULL)";
	
	final String DELETE_PP_SYSTEM_BY_PS_CODE="DELETE FROM PP_SYSTEM1 WHERE  " +
			"PS_TYPE='IL_CIC_CVR' AND PS_CODE=?";
	
	final String SELECT_PM_IL_COVER_BY_COVER_CODE_AND_COVER_CLASS=
		"SELECT COVER_CODE FROM PM_IL_COVER WHERE COVER_CODE=?	AND COVER_CLASS = ? ";
	
	final String SELECT_PM_IL_COVER_BY_COVER_TYPE="SELECT COVER_CODE,COVER_DESC," +
			"COVER_LONG_DESC,COVER_FRZ_FLAG FROM PM_IL_COVER WHERE COVER_TYPE IN ('A','S')";
	
	final String SELECT_PM_IL_APPL_WOP_COVER_BY_AWCVR_CODE_AWCVR_COVER_CODE=
		"SELECT 'X' FROM   PM_IL_APPL_WOP_COVER WHERE  AWCVR_CODE = ? AND " +
		"AWCVR_COVER_CODE = ?";
	
	final String SELECT_PM_IL_APPL_WOP_COVER_BY_AWCVR_CODE_AWCVR_COVER_CODE_ROW_ID=
		"SELECT 'X' FROM   PM_IL_APPL_WOP_COVER WHERE  AWCVR_CODE = ? AND " +
		"AWCVR_COVER_CODE = ? AND ROWID !=?";
	
	final String SELECT_PM_CODES_BY_PC_TYPE_PC_CODE= "SELECT PC_CODE FROM PM_CODES " +
			"WHERE PC_TYPE = 'IL_ILL_TYP' AND PC_CODE = ?";
	
	String SELECT_PS_VALUE = "SELECT PS_VALUE FROM PP_SYSTEM WHERE PS_TYPE = 'CRE_BAS_CVR'";
	
	final String SELECT_PM_IL_CVR_CONTR_PRD_BY_COVER_CODE="SELECT ROWID,PM_IL_BASIC_CONTRIBUTION.* FROM " +
	"PM_IL_BASIC_CONTRIBUTION WHERE BC_COVER_CODE=?";
	
	final String SELECT_Validate_Item_BC_AGE_FROM="SELECT BC_AGE_FROM,BC_AGE_TO FROM PM_IL_BASIC_CONTRIBUTION  WHERE BC_COVER_CODE = ? AND ROWID != ? ";
	
	final String SELECT_Validate_Item_BC_AGE_FROM_WITHOUTROWID="SELECT BC_AGE_FROM,BC_AGE_TO FROM PM_IL_BASIC_CONTRIBUTION  WHERE BC_COVER_CODE = ? ";
	
	
	
	final String SELECT_Validate_Item_BC_AGE_TO=" SELECT 'X'  FROM PM_IL_BASIC_CONTRIBUTION  WHERE	BC_COVER_CODE = ?  AND ROWID != ?  AND BC_AGE_TO  = ? " ;
	
	final String SELECT_Validate_Item_BC_AGE_TO_WIT_OUT_ROWID=" SELECT 'X'  FROM PM_IL_BASIC_CONTRIBUTION  WHERE	BC_COVER_CODE = ?  AND BC_AGE_TO  = ? " ;


}
