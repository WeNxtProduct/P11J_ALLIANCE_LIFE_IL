package com.iii.pel.forms.PILT007;

public interface PILT007_SQL_QUERY_CONSTANTS {
	
	String PILT007_COMPOSITE_ACTION_QUERY = "SELECT 'X' FROM PT_IL_CLAIM_PAID " + "WHERE CP_APPR_FLAG = 'A' " + "AND CP_CLAIM_SYS_ID = ?";
	
	String L_VALID_CLAIM_NO_QUERY = "SELECT CLAIM_NO FROM PT_IL_CLAIM WHERE  CLAIM_NO=? AND NVL(CLAIM_CLOSE_FLAG, 'N') = 'N'";
	
	String NEW_SETTLEMENT_QUERY = "SELECT 'X' FROM PT_IL_CLAIM_PAID WHERE CP_CLAIM_SYS_ID=?";
	
	String L_CHECK_BENF_PAID_QUERY1 = "SELECT CP_SYS_ID,CP_CCD_SYS_ID FROM PT_IL_CLAIM_PAID " + 
				"WHERE CP_CLAIM_SYS_ID = ? " + 
				"AND   CP_CLM_PAID_STATUS = 'A' " +
				"AND   CP_APPR_FLAG = 'Y'";
	
	String L_CHECK_BENF_PAID_QUERY2 = "SELECT 'X' FROM PT_IL_CLAIM_BENEFICIARY " + 
						"WHERE CBEN_CLAIM_SYS_ID = ? " /*+ 
						"AND CBEN_CP_SYS_ID = ?"*/;
	
	/*String L_CHECK_BENF_PAID_QUERY2 = "SELECT 'X' FROM PT_IL_CLAIM_BENEFICIARY " + 
										"WHERE CBEN_CLAIM_SYS_ID = ? " + 
										"AND CBEN_PBEN_SYS_ID = ?";*/
	
	String L_CHECK_BENF_PAID_QUERY3 = "SELECT CCD_COVER_CODE FROM PT_IL_CLAIM_COVER_DTLS " + 
						"WHERE  CCD_SYS_ID=? " + 
						"AND CCD_CLAIM_SYS_ID = ?";
	
	String L_CHECK_BENEFICIARY_QUERY1 = "SELECT SUM(CP_LC_PAID_AMT),SUM(CP_FC_PAID_AMT) " +
						"FROM PT_IL_CLAIM_PAID " + 
						"WHERE CP_CLAIM_SYS_ID = ? " + 
						"AND CP_CLM_PAID_STATUS = 'A' " + 
						"AND   CP_APPR_FLAG = 'Y' ";
	
	/*Commentted &Modified by saritha on 12-01-2018 for ssp call id : ZBLIFE-1464092*/
	
	/*String L_CHECK_BENEFICIARY_QUERY2 = "SELECT SUM(CBEN_LC_PAID_AMT),SUM(CBEN_FC_PAID_AMT) " +
						"FROM PT_IL_CLAIM_BENEFICIARY " + 
						"WHERE CBEN_CLAIM_SYS_ID = ? " + 
						"AND  CBEN_CP_SYS_ID IN (SELECT CP_SYS_ID " +
						"FROM PT_IL_CLAIM_PAID " + 
						"WHERE CP_CLAIM_SYS_ID = ? " + 
						"AND CP_CLM_PAID_STATUS = 'A' " + 
						"AND   CP_APPR_FLAG = 'Y') ";*/
	
	String L_CHECK_BENEFICIARY_QUERY2 = "SELECT TRUNC(SUM(CBEN_LC_PAID_AMT), CURR_DECIMAL), TRUNC(SUM(CBEN_FC_PAID_AMT), CURR_DECIMAL) "
			+ "FROM PT_IL_CLAIM_BENEFICIARY, PT_IL_CLAIM, FM_CURRENCY WHERE CBEN_CLAIM_SYS_ID = CLAIM_SYS_ID AND CLAIM_CURR_CODE = CURR_CODE "
			+ "AND CBEN_CLAIM_SYS_ID = ? AND CBEN_CP_SYS_ID IN (SELECT CP_SYS_ID FROM PT_IL_CLAIM_PAID WHERE CP_CLAIM_SYS_ID = ? "
			+ "AND CP_CLM_PAID_STATUS = 'A' AND CP_APPR_FLAG = 'Y') GROUP BY CURR_DECIMAL";

	/*End*/
	  
	
	String L_CHECK_BENEFICIARY_QUERY3 = "SELECT CLAIM_LC_RLA_AMOUNT FROM PT_IL_CLAIM " + 
						"WHERE CLAIM_SYS_ID = ?";
	
	String L_CHECK_ESTAMT_PAIDAMT_QUERY1 = "SELECT SUM(CP_FC_PAID_AMT), SUM(CP_LC_PAID_AMT) FROM PT_IL_CLAIM_PAID " + "WHERE  CP_CLAIM_SYS_ID  =  (   " + "SELECT CLAIM_SYS_ID  FROM  PT_IL_CLAIM   " + "WHERE  CLAIM_NO  = ?) AND CP_SET_FLAG <> 'CF' ";
	
	String L_CHECK_ESTAMT_PAIDAMT_QUERY2="SELECT PLAN_TYPE FROM PM_IL_PLAN WHERE  PLAN_CODE =("+"SELECT POL_PLAN_CODE FROM PT_IL_POLICY WHERE POL_NO = ?)";
	
	String P9ILPK_CLAIM_F_GET_CLAIM_YEAR_QUERY = "SELECT P9ILPK_CLAIM.F_GET_CLAIM_YEAR(?, ?) FROM DUAL";
	
	String PT_IL_CLAIM_ACTION_QUERY1 = "SELECT COUNT(*) FROM PT_IL_CLAIM_PAID " + 
				"WHERE CP_CLAIM_SYS_ID = ? " + 
				"AND CP_APPR_FLAG IN ('A','R') " + 
				"AND CP_CLM_PAID_STATUS IN ('A','R')";
	
	String PT_IL_CLAIM_ACTION_QUERY2 = "SELECT COUNT(*) FROM PT_IL_CLAIM_PAID " + 
						"WHERE CP_CLAIM_SYS_ID = ? " + 
						"AND CP_APPR_FLAG IN ('N','Y') " + 
						"AND CP_CLM_PAID_STATUS IN ('A','R','P')";
	
	String PT_IL_CLAIM_QUERY_ACTION_QUERY1 = "SELECT CLAIM_POL_NO, CLAIM_SYS_ID,CLAIM_POL_SYS_ID, CLAIM_NO, POAD_ASSR_CODE, POAD_ASSURED_NAME " + "FROM PT_IL_POL_ASSURED_DTLS, PT_IL_CLAIM " + "WHERE POAD_ASSR_CODE=CLAIM_ASSR_CODE AND POAD_POL_SYS_ID=CLAIM_POL_SYS_ID " + "AND CLAIM_POL_NO LIKE NVL(?,CLAIM_POL_NO) " + "AND CLAIM_NO LIKE NVL(?,CLAIM_NO)";
	
	String SWISS_SQL_CLAIM_BENEFICIARY_QUERY1 = "SELECT DECODE(?, 'ENG', BANK_NAME, BANK_NAME_BL) FROM  FM_BANK WHERE  BANK_CODE  = ?";
	
	String SWISS_SQL_CLAIM_BENEFICIARY_QUERY2 = "SELECT POL_PROD_CODE FROM  PT_IL_POLICY  WHERE  POL_NO  = ?  AND POL_DS_TYPE  = '2' ";
	
	String SWISS_SQL_CLAIM_BENEFICIARY_QUERY3 = "SELECT NVL(ASD_CHAR_VALUE,'N') FROM PM_IL_APPR_SETUP_DET " + "WHERE  ASD_USER_ID =? " + "AND ASD_CODE = 'BENEFI_YN' " + "AND ? " + "BETWEEN NVL(ASD_FM_PROD_CODE,'0') " + "AND NVL(ASD_TO_PROD_CODE,'zzzzzzzzzzzz')";
	
	String SWISS_SQL_CLAIM_BENEFICIARY_QUERY4 = "SELECT PS_CODE,PS_CODE_DESC FROM PP_SYSTEM WHERE PS_TYPE = 'ILBENFTYPE' ";
	
	String SWISS_SQL_CLAIM_BENEFICIARY_QUERY5 = "SELECT SUM(CP_FC_PAID_AMT),SUM(CP_LC_PAID_AMT) FROM PT_IL_CLAIM_PAID " + "WHERE  CP_CLAIM_SYS_ID = ? AND CP_APPR_FLAG NOT IN ('A','R') ";
	
	String SWISS_SQL_CLAIM_BENEFICIARY_QUERY6 = "SELECT PC_CODE,PC_DESC FROM PM_CODES " + "WHERE  PC_TYPE = ? " + "AND PC_CODE = ?";
	
	String SWISS_SQL_CLAIM_BENEFICIARY_QUERY7 = "SELECT 1, DECODE(?, 'ENG', BANK_NAME, BANK_NAME_BL) FROM  FM_BANK " + "WHERE  BANK_CODE  = ?";
	
	String SWISS_SQL_CLAIM_BENEFICIARY_QUERY8 = "SELECT CBEN_SYS_ID.NEXTVAL FROM DUAL";
	
	String SWISS_SQL_CLAIM_BENEFICIARY_QUERY9 = "SELECT PBEN_SYS_ID FROM PT_IL_POL_BENEFICIARY  " + "WHERE PBEN_POL_SYS_ID = ?  AND PBEN_SR_NO  = ? ";
	
	String SWISS_SQL_CLAIM_BENEFICIARY_QUERY10 = "SELECT PLAN_TYPE FROM PM_IL_PLAN WHERE EXISTS(" + "SELECT POL_PLAN_CODE  FROM  PT_IL_POLICY WHERE  POL_SYS_ID  = ?) ";
	/*CBEN_SR_NO,CBEN_DOB,CBEN_BNF_CODE added by gopi for hands on feed back points,serial no 12 in zb on 09/02/17*/
/*	
 * 
 * Commented by sankara narayanan for benificiarry issue
 * String SWISS_SQL_CLAIM_BENEFICIARY_QUERY11 = "SELECT PT_IL_CLAIM_BENEFICIARY.ROWID, CBEN_SYS_ID,CBEN_CLAIM_SYS_ID,CBEN_CP_SYS_ID,CBEN_PBEN_SYS_ID," +
												 "CBEN_BNF_TYPE,CBEN_RELATION_CODE,CBEN_BNF_NAME,CBEN_BNF_NAME_BL," + "CBEN_PERC,CBEN_LC_PAID_AMT,CBEN_FC_PAID_AMT,CBEN_BANK_CODE,CBEN_ACCT_CODE," + "CBEN_REF_ID1,CBEN_REF_ID2,CBEN_ADDRESS1,CBEN_ADDRESS2,CBEN_ADDRESS3," + "CBEN_STAT_CODE,CBEN_POSTAL_CODE,CBEN_CITY_CODE,"
												 		+ "CBEN_ADDRESS4,CBEN_ADDRESS5,CBEN_REMARKS,CBEN_CATG_CODE,CBEN_AGE,CBEN_GUARDIAN_NAME,CBEN_MICR_CODE,"
												 		+ "CBEN_DIVN_CODE,CBEN_SR_NO,CBEN_DOB,CBEN_BNF_CODE FROM PT_IL_CLAIM_BENEFICIARY WHERE CBEN_CLAIM_SYS_ID=?";*//* AND CBEN_CP_SYS_ID=?*/
	/*end*/
	
	/*Commentted &Modified by saritha on 03-01-2017 for ssp call id : ZBLIFE-1464092*/
	
	/*Added by sankara narayanan for changing the claim benificiary query*/
	//String SWISS_SQL_CLAIM_BENEFICIARY_QUERY11 = "SELECT PT_IL_CLAIM_BENEFICIARY.ROWID, PT_IL_CLAIM_BENEFICIARY.* FROM PT_IL_CLAIM_BENEFICIARY WHERE CBEN_CLAIM_SYS_ID=?";
	//end
	
	String SWISS_SQL_CLAIM_BENEFICIARY_QUERY11 = "SELECT PT_IL_CLAIM_BENEFICIARY.ROWID, PT_IL_CLAIM_BENEFICIARY.* FROM PT_IL_CLAIM_BENEFICIARY WHERE CBEN_CP_SYS_ID=?";
	
	/*End*/
	
	String SWISS_SQL_CLAIM_BENEFICIARY_QUERY12 = "SELECT BANK_CODE,BANK_NAME FROM FM_BANK " + "WHERE BANK_CODE LIKE NVL(?,BANK_CODE) ORDER BY 1 ASC";
	
	String SWISS_SQL_CLAIM_BENEFICIARY_QUERY13 = "SELECT PS_CODE,PS_CODE_DESC,PS_CODE FROM PP_SYSTEM " + "WHERE PS_TYPE ='ILBENFTYPE' AND PS_CODE LIKE NVL(?,PS_CODE) ORDER BY 1 ASC";
	
	String SWISS_SQL_CLAIM_BENEFICIARY_QUERY14 = "SELECT PC_CODE,PC_DESC,PC_CODE FROM PM_CODES " + "WHERE PC_TYPE = 'CITY' AND PC_CODE LIKE NVL(?, PC_CODE) ORDER BY 1 ASC";
	
	String SWISS_SQL_CLAIM_BENEFICIARY_QUERY15 = "SELECT PC_CODE,PC_DESC,PC_CODE FROM PM_CODES " + "WHERE PC_TYPE = 'POSTAL' AND PC_CODE LIKE NVL(?, PC_CODE) AND ROWNUM<10 ORDER BY 1 ASC";
	
	String SWISS_SQL_CLAIM_BENEFICIARY_QUERY16 = "SELECT PC_CODE,PC_DESC,PC_CODE FROM PM_CODES " + "WHERE PC_TYPE ='ILBENFREL' AND PC_CODE LIKE NVL(?,PC_CODE) ORDER BY 1 ASC";
	
	String SWISS_SQL_CLAIM_BENEFICIARY_QUERY17 = "SELECT PC_CODE,PC_DESC,PC_CODE FROM PM_CODES " + "WHERE PC_TYPE = 'STATE' AND PC_CODE LIKE NVL(?, PC_CODE) ORDER BY 1 ASC";
	
	String SWISS_SQL_CLAIM_DUMMY_QUERY1 = "SELECT DISTINCT CP_PAID_DT  FROM  PT_IL_CLAIM_PAID " + "WHERE  CP_CLAIM_SYS_ID = ? AND CP_APPR_FLAG= ? " + "AND NVL(CP_CLM_PAID_STATUS ,?) = ?";
	
	String SWISS_SQL_CLAIM_DUMMY_QUERY2 = "SELECT 1 FROM PT_IL_CLAIM_PAID " + "WHERE  CP_APPR_FLAG = ? AND CP_CLAIM_SYS_ID = ?";
	
	String SWISS_SQL_CLAIM_DUMMY_QUERY3 = "SELECT CP_APPR_FLAG,  CP_CE_SYS_ID,CP_FC_PAID_AMT,CP_LC_PAID_AMT " + "FROM   PT_IL_CLAIM_PAID " + "WHERE  CP_CLAIM_SYS_ID = ? " + "AND    CP_APPR_FLAG    = ? " + "AND    NVL(CP_CLM_PAID_STATUS,'P') = ? " ;
	
	String SWISS_SQL_CLAIM_DUMMY_QUERY4 = "SELECT DISTINCT 1 FROM PT_IL_DOC_TODO_LIST_STATUS " + "WHERE DTLS_CLM_SYS_ID = ? " + "AND DTLS_GROUP_CODE IN (" +"SELECT DTG_GROUP_CODE FROM PM_IL_DOC_TODO_GROUP " 
					+ "WHERE DTG_DS_TYPE = ? " + "AND   DTG_DS_CODE = ? " + "AND   DTG_GROUP_TYPE =?) " + "AND DTLS_APPR_STS IN (?,?)" + "AND NVL(DTLS_MANDATORY_YN,?) =?";
	
	String SWISS_SQL_CLAIM_DUMMY_QUERY5 = "SELECT CCD_LC_EST_AMT,CCD_FC_EST_AMT " + "FROM PT_IL_CLAIM_COVER_DTLS " + "WHERE CCD_CLAIM_SYS_ID = ? " + "AND NVL(CCD_CONFIRM_FLAG,?) = ? " + "AND CCD_LOSS_TYPE =(" +"SELECT  PS_CODE_DESC FROM PP_SYSTEM " + "WHERE PS_TYPE = ?)";
	
	String SWISS_SQL_CLAIM_DUMMY_QUERY6 = "SELECT SUM(CP_LC_PAID_AMT),SUM(CP_FC_PAID_AMT) " + "FROM PT_IL_CLAIM_PAID WHERE  CP_CLAIM_SYS_ID = ? " + "AND    CP_APPR_FLAG != ?";
	
	String SWISS_SQL_CLAIM_DUMMY_QUERY7 = "SELECT CLAIM_DS_CODE FROM   PT_IL_CLAIM " + "WHERE  CLAIM_SYS_ID = ?";
	
	String SWISS_SQL_CLAIM_DUMMY_QUERY8 = "SELECT DS_POST_BO FROM PM_IL_DOC_SETUP " + "WHERE  DS_CODE  =? AND DS_TYPE  =?";
	
	String SWISS_SQL_CLAIM_DUMMY_QUERY9 = "SELECT 'X' FROM PS_IL_DRCR " + "WHERE DRCR_POL_SYS_ID =? " + "AND DRCR_CLM_SYS_ID =? " + "AND DRCR_DOC_TYPE   =? " + "AND    DRCR_POST_YN    =?";
	
	String SWISS_SQL_CLAIM_DUMMY_QUERY10 = "SELECT DISTINCT CCD_COVER_CODE,CCD_LOSS_TYPE," + "CCD_DISAB_TYPE,CCD_PROD_CODE,CCD_COVER_GROUP_CODE " + "FROM    PT_IL_CLAIM_COVER_DTLS " + "WHERE   CCD_CLAIM_SYS_ID  = ?";
	
	String SWISS_SQL_CLAIM_DUMMY_QUERY11 = "SELECT NVL(SUM(NVL(CP_LC_PAID_AMT,0)),0) " + "FROM   PT_IL_CLAIM_PAID " + "WHERE  CP_CCD_SYS_ID IN(SELECT CCD_SYS_ID " + "FROM   PT_IL_CLAIM_COVER_DTLS " + "WHERE  CCD_COVER_CODE = M_CCD_COVER_CODE " + "AND    CCD_LOSS_TYPE  = M_CCD_LOSS_TYPE " + "AND    CCD_DISAB_TYPE = M_CCD_DISAB_TYPE " + "AND    CCD_PROD_CODE  = M_CCD_PROD_CODE " + "AND    CCD_COVER_GROUP_CODE = M_CCD_COVER_GROUP_CODE " + "AND    CCD_CLAIM_SYS_ID IN (SELECT CLAIM_SYS_ID " + "FROM   PT_IL_CLAIM ,PT_IL_POLICY " + "WHERE  CLAIM_POL_SYS_ID = :PT_IL_CLAIM.CLAIM_POL_SYS_ID " + "AND    CLAIM_POL_SYS_ID = POL_SYS_ID " + "AND    CLAIM_ASSR_CODE  = :PT_IL_CLAIM.CLAIM_ASSR_CODE " + "AND    CLAIM_LOSS_DT BETWEEN ADD_MONTHS(POL_START_DT,12*(M_POL_YEAR_NO-1)) " + "AND    ADD_MONTHS(POL_START_DT,12*(M_POL_YEAR_NO)))) " + "AND    NVL(CP_APPR_FLAG,'N') IN ( 'R', 'A')";
	
	String SWISS_SQL_CLAIM_PAID_1_QUERY1 = "SELECT POL_FAC_YN FROM PT_IL_POLICY " + "WHERE POL_SYS_ID = ?";
	
	String SWISS_SQL_CLAIM_PAID_1_QUERY2 = "SELECT 1 FROM PT_IL_CLAIM_PAID " + "WHERE CP_CLAIM_SYS_ID = ? " + "AND CP_PAID_DT > ? " + "AND NVL(CP_APPR_FLAG,'N') != 'N'";
	
	String SWISS_SQL_CLAIM_PAID_1_QUERY3 = "SELECT CE_FC_NET_EST_AMT,SUM(CE_FC_PAID_AMT) FROM  PT_IL_CLAIM_ESTIMATE " + "WHERE  CE_CLAIM_SYS_ID  = ? GROUP BY  CE_FC_NET_EST_AMT";
	
	String SWISS_SQL_CLAIM_PAID_1_QUERY4 = "SELECT CLAIM_CURR_CODE FROM  PT_IL_CLAIM  " + "WHERE  CLAIM_SYS_ID  = ?";
	
	String SWISS_SQL_CLAIM_PAID_1_QUERY5 = "SELECT POL_FAC_YN FROM  PT_IL_POLICY " + "WHERE  POL_SYS_ID  = ? ";
	
	String SWISS_SQL_CLAIM_PAID_1_QUERY6 = "SELECT CLAIM_DS_CODE FROM PT_IL_CLAIM WHERE CLAIM_SYS_ID=?";
	
	String SWISS_SQL_CLAIM_PAID_1_QUERY7 = "SELECT DISTINCT 1 FROM  PT_IL_DOC_TODO_LIST_STATUS " + "WHERE DTLS_CLM_SYS_ID  = ? " + "AND DTLS_GROUP_CODE  IN  (" +"SELECT DTG_GROUP_CODE  FROM  PM_IL_DOC_TODO_GROUP " + "WHERE DTG_DS_TYPE  = '4' " + "AND DTG_DS_CODE  = ? " +"AND DTG_GROUP_TYPE  = 'CHKLST'  )  " + "AND DTLS_APPR_STS  IN ( 'NA'  , 'N'  )  " + "AND NVL(DTLS_MANDATORY_YN, 'N')  = 'Y' ";

	String SWISS_SQL_CLAIM_PAID_1_QUERY8 = "SELECT CUST_CODE, CUST_NAME, CUST_BL_NAME FROM PM_CUSTOMER " + "WHERE CUST_CLASS IN (" + "SELECT CCLAS_CODE FROM PM_CUST_CLASS, PP_SYSTEM WHERE PS_TYPE ='LOV_CUST') " +	"AND CUST_FRZ_FLAG = 'N' AND (" + "(CUST_CODE IN (" + "SELECT CDIV_CUST_CODE FROM  PM_CUST_DIVN " + "WHERE CDIV_DIVN_CODE = NVL ('HO', CDIV_DIVN_CODE) " + "AND CUST_APPL_ALL_BRAN_YN = 'N')) " + "OR (CUST_APPL_ALL_BRAN_YN = 'Y')) " + "AND CUST_CODE LIKE NVL(?, CUST_CODE) AND ROWNUM<50";
	
	/*added by raja on 10-06-2017 for ZBILQC-1728216�*/
	
	/*Modified by Janani on  21.08.2017 for ZBILQC-1732254*/
	//String SWISS_SQL_CLAIM_PAID_1_QUERY9 = "SELECT PT_IL_CLAIM_PAID.ROWID, CP_SYS_ID, CP_CE_SYS_ID,CP_CLAIM_SYS_ID," + "CP_REF_SYS_ID,CP_CCD_SYS_ID,CP_PAID_DT, CCD_COVER_CODE, COVER_DESC, CP_SCHD_PYMT_DT, " + "CP_ACCNT_PAY_CODE, CLAIM_CURR_CODE, CP_FC_PAID_AMT, CP_LC_PAID_AMT, " + "CP_CLAIM_REJ_REASON, CP_ACCNT_PAY_CODE, CP_CLAIM_PAID_TO, CP_SET_FLAG, " +	"CP_CLM_PAID_STATUS, CP_APPR_FLAG ,CP_FLEX_04,CP_FLEX_05,CP_FLEX_06,CP_FLEX_07,CP_FLEX_08,CP_FLEX_09 FROM PT_IL_CLAIM_PAID, PT_IL_CLAIM_COVER_DTLS, PM_IL_COVER, PT_IL_CLAIM " + "WHERE CCD_CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + "AND CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + "AND COVER_CODE=CCD_COVER_CODE " + "AND CP_CCD_SYS_ID=CCD_SYS_ID " + "AND CLAIM_NO LIKE NVL(?,CLAIM_NO) AND CP_APPR_FLAG IN ( 'A','R')";
	/*String SWISS_SQL_CLAIM_PAID_1_QUERY9 = "SELECT PT_IL_CLAIM_PAID.ROWID, CP_SYS_ID, CP_CE_SYS_ID,CP_CLAIM_SYS_ID," + "CP_REF_SYS_ID,CP_CCD_SYS_ID,CP_PAID_DT, CCD_COVER_CODE, COVER_DESC, CP_SCHD_PYMT_DT, " + "CP_ACCNT_PAY_CODE, CLAIM_CURR_CODE, CP_FC_PAID_AMT, CP_LC_PAID_AMT, " + "CP_CLAIM_REJ_REASON, CP_ACCNT_PAY_CODE, CP_CLAIM_PAID_TO, CP_SET_FLAG, " +	"CP_CLM_PAID_STATUS, CP_APPR_FLAG ,CP_FLEX_04,CP_FLEX_05,CP_FLEX_06 FROM PT_IL_CLAIM_PAID, PT_IL_CLAIM_COVER_DTLS, PM_IL_COVER, PT_IL_CLAIM " + "WHERE CCD_CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + "AND CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + "AND COVER_CODE=CCD_COVER_CODE " + "AND CP_CCD_SYS_ID=CCD_SYS_ID " + "AND CLAIM_NO LIKE NVL(?,CLAIM_NO) AND CP_APPR_FLAG IN ( 'A','R')";*/
	
	
	/*Added by Janani on 14.02.2018 for ZB  for ZB bank details enabling as per Thiags sugges*/
	
	//String SWISS_SQL_CLAIM_PAID_1_QUERY9 = "SELECT PT_IL_CLAIM_PAID.ROWID, CP_SYS_ID, CP_CE_SYS_ID,CP_CLAIM_SYS_ID," + "CP_REF_SYS_ID,CP_CCD_SYS_ID,CP_PAID_DT, CCD_COVER_CODE, COVER_DESC, CP_SCHD_PYMT_DT, " + "CP_ACCNT_PAY_CODE, CLAIM_CURR_CODE, CP_FC_PAID_AMT, CP_LC_PAID_AMT, " + "CP_CLAIM_REJ_REASON, CP_ACCNT_PAY_CODE, CP_CLAIM_PAID_TO, CP_SET_FLAG, " +	"CP_CLM_PAID_STATUS, CP_APPR_FLAG ,CP_FLEX_04,CP_FLEX_05,CP_FLEX_06,CP_FLEX_08,CP_FLEX_09 FROM PT_IL_CLAIM_PAID, PT_IL_CLAIM_COVER_DTLS, PM_IL_COVER, PT_IL_CLAIM " + "WHERE CCD_CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + "AND CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + "AND COVER_CODE=CCD_COVER_CODE " + "AND CP_CCD_SYS_ID=CCD_SYS_ID " + "AND CLAIM_NO LIKE NVL(?,CLAIM_NO) AND CP_APPR_FLAG IN ( 'A','R')";
	
	String SWISS_SQL_CLAIM_PAID_1_QUERY9 = "SELECT PT_IL_CLAIM_PAID.ROWID, CP_SYS_ID, CP_CE_SYS_ID,CP_CLAIM_SYS_ID," + "CP_REF_SYS_ID,CP_CCD_SYS_ID,CP_PAID_DT, CCD_COVER_CODE, COVER_DESC, CP_SCHD_PYMT_DT, " + "CP_ACCNT_PAY_CODE, CLAIM_CURR_CODE, CP_FC_PAID_AMT, CP_LC_PAID_AMT, " + "CP_CLAIM_REJ_REASON, CP_ACCNT_PAY_CODE, CP_CLAIM_PAID_TO, CP_SET_FLAG, " +	"CP_CLM_PAID_STATUS, CP_APPR_FLAG ,CP_FLEX_04,CP_FLEX_05,CP_FLEX_06,CP_FLEX_08,CP_FLEX_09,CP_PAYEE_NAME,CP_FLEX_10, "
			+ "CP_FLEX_11,CP_FLEX_12,CP_FLEX_13,CP_PYMT_MTD FROM PT_IL_CLAIM_PAID, PT_IL_CLAIM_COVER_DTLS, PM_IL_COVER, PT_IL_CLAIM " + "WHERE CCD_CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + "AND CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + "AND COVER_CODE=CCD_COVER_CODE " + "AND CP_CCD_SYS_ID=CCD_SYS_ID " + "AND CLAIM_NO LIKE NVL(?,CLAIM_NO) AND CP_APPR_FLAG IN ( 'A','R')";
	
	/*End*/
	
	/*End of ZBILQC-1732254*/
	/*end*/
	
	String SWISS_SQL_CLAIM_PAID_1_QUERY10 = "SELECT SUM(NVL(CE_LC_NET_EST_AMT, 0)),SUM(NVL(CE_FC_NET_EST_AMT, 0)) " + "FROM PT_IL_CLAIM_ESTIMATE, PT_IL_CLAIM " + "WHERE CE_CLAIM_SYS_ID = CLAIM_SYS_ID " + "AND CLAIM_NO=?";
	
	String SWISS_SQL_CLAIM_PAID_1_QUERY11 = "SELECT SUM(NVL(CP_LC_PAID_AMT,0)), SUM(NVL(CP_FC_PAID_AMT,0)) " +"FROM PT_IL_CLAIM_PAID, PT_IL_CLAIM " +	"WHERE CP_CLAIM_SYS_ID = CLAIM_SYS_ID " + "AND NVL(CP_APPR_FLAG,'N') IN ('R', 'A') " + "AND CLAIM_NO=?";
	
	String SWISS_SQL_CLAIM_PAID_1_QUERY12 = "SELECT POL_FAC_YN FROM  PT_IL_POLICY WHERE POL_SYS_ID  = ? ";
	
	String SWISS_SQL_CLAIM_PAID_1_QUERY13 = "SELECT CLAIM_CURR_CODE FROM PT_IL_CLAIM WHERE  CLAIM_SYS_ID = ?";
	
	String SWISS_SQL_CLAIM_PAID_1_QUERY14 = "SELECT SUM(NVL(CE_LC_NET_EST_AMT, 0)), SUM(NVL(CE_FC_NET_EST_AMT, 0)) " + "FROM  PT_IL_CLAIM_ESTIMATE  WHERE  CE_CLAIM_SYS_ID  = ?";
	
	String SWISS_SQL_CLAIM_PAID_1_QUERY15 = "SELECT SUM(NVL(CP_LC_PAID_AMT, 0)), SUM(NVL(CP_FC_PAID_AMT, 0)) " + "FROM  PT_IL_CLAIM_PAID  WHERE  CP_CLAIM_SYS_ID  = ?" + "AND NVL(CP_APPR_FLAG, 'N')  IN ( 'R'  , 'A'  ) ";
	
	String SWISS_SQL_CLAIM_PAID_1_QUERY16 = "SELECT CLAIM_EXCH_RATE FROM PT_IL_CLAIM WHERE CLAIM_SYS_ID=?";
	
	String SWISS_SQL_CLAIM_PAID_1_QUERY17 = "SELECT PLAN_TYPE FROM PM_IL_PLAN WHERE PLAN_CODE=(" + "SELECT POL_PLAN_CODE FROM PT_IL_POLICY WHERE POL_NO= ?) ";
	
	String SWISS_SQL_CLAIM_PAID_1_QUERY18 = "SELECT 1 FROM PT_IL_CLAIM_PAID WHERE CP_CLAIM_SYS_ID=?";
	
	String SWISS_SQL_CLAIM_PAID_1_QUERY19 = "SELECT POL_FAC_YN FROM PT_IL_POLICY WHERE POL_SYS_ID = ?";
	
	String SWISS_SQL_CLAIM_PAID_QUERY1 = "SELECT NVL(CE_LC_EST_AMT, 0), NVL(CE_FC_EST_AMT, 0), " + "NVL(CE_LC_PAID_AMT, 0), NVL(CE_FC_PAID_AMT, 0),NVL(CE_LC_NET_EST_AMT, 0) - NVL(CE_LC_PAID_AMT, 0)," + "NVL(CE_FC_NET_EST_AMT, 0) - NVL(CE_FC_PAID_AMT, 0) " + "FROM  PT_IL_CLAIM_ESTIMATE  " + "WHERE  CE_SYS_ID = ?";
	
	String SWISS_SQL_CLAIM_PAID_QUERY2 = "SELECT CLAIM_CURR_CODE FROM  PT_IL_CLAIM " + "WHERE  CLAIM_SYS_ID  = ?";
	
	String SWISS_SQL_CLAIM_PAID_QUERY3 = "SELECT POL_FAC_YN FROM  PT_IL_POLICY  " + "WHERE  POL_SYS_ID  = ?";
	
	String SWISS_SQL_CLAIM_PAID_QUERY4 = "SELECT SUM(NVL(CE_LC_EST_AMT, 0)), SUM(NVL(CE_FC_EST_AMT, 0)) " + "FROM  PT_IL_CLAIM_ESTIMATE  " + "WHERE  CE_CLAIM_SYS_ID  = ?";
	
	String SWISS_SQL_CLAIM_PAID_QUERY5 = "SELECT SUM(NVL(CP_LC_PAID_AMT, 0)), SUM(NVL(CP_FC_PAID_AMT, 0)) " + "FROM  PT_IL_CLAIM_PAID  " + "WHERE  CP_CLAIM_SYS_ID  = ?" + "AND NVL(CP_APPR_FLAG, 'N')  IN ( 'R'  , 'A'  ) ";
	
	String SWISS_SQL_CLAIM_PAID_QUERY6 = "SELECT CE_FC_NET_EST_AMT,SUM(CE_FC_PAID_AMT) FROM  PT_IL_CLAIM_ESTIMATE " + "WHERE  CE_CLAIM_SYS_ID  = ? GROUP BY  CE_FC_NET_EST_AMT";
	
	String SWISS_SQL_CLAIM_PAID_QUERY7 = "SELECT CLAIM_CURR_CODE FROM  PT_IL_CLAIM  " + "WHERE  CLAIM_SYS_ID  = ?";
	
	String SWISS_SQL_CLAIM_PAID_QUERY8 = "SELECT POL_FAC_YN FROM  PT_IL_POLICY " + "WHERE  POL_SYS_ID  = ? ";
	
	String SWISS_SQL_CLAIM_PAID_QUERY9 = "SELECT CLAIM_DS_CODE FROM PT_IL_CLAIM WHERE CLAIM_SYS_ID=?";
	
	String SWISS_SQL_CLAIM_PAID_QUERY10 = "SELECT DISTINCT 1 FROM  PT_IL_DOC_TODO_LIST_STATUS " + "WHERE DTLS_CLM_SYS_ID  = ? " + "AND DTLS_GROUP_CODE  IN  (" + "SELECT DTG_GROUP_CODE  FROM  PM_IL_DOC_TODO_GROUP " + "WHERE DTG_DS_TYPE  = '4' " + "AND DTG_DS_CODE  = ? " + "AND DTG_GROUP_TYPE  = 'CHKLST'  )  " + "AND DTLS_APPR_STS  IN ( 'NA'  , 'N'  )  " + "AND NVL(DTLS_MANDATORY_YN, 'N')  = 'Y' ";
	
	/*commented and added by ameen for FALCONLIFE-1344105 on 21-10-2016
	 * 
	 * String SWISS_SQL_CLAIM_PAID_QUERY11 = "SELECT CUST_CODE, CUST_NAME, CUST_BL_NAME FROM PM_CUSTOMER " + "WHERE CUST_CLASS IN (" + "SELECT CCLAS_CODE FROM PM_CUST_CLASS, PP_SYSTEM WHERE PS_TYPE ='LOV_CUST') " + "AND CUST_FRZ_FLAG = 'N' AND (" + "(CUST_CODE IN (" + "SELECT CDIV_CUST_CODE FROM  PM_CUST_DIVN " + "WHERE CDIV_DIVN_CODE = NVL ('HO', CDIV_DIVN_CODE) " + "AND CUST_APPL_ALL_BRAN_YN = 'N')) " + "OR (CUST_APPL_ALL_BRAN_YN = 'Y')) " + "AND CUST_CODE LIKE NVL(?, CUST_CODE) AND ROWNUM<50";*/
	
	/*Modified by Janani on 08.02.2018 as per Sivaram sugges. for pay_acct_code desc
	 * 
	 * 
	 * String SWISS_SQL_CLAIM_PAID_QUERY11 = "SELECT CUST_CODE, CUST_NAME, CUST_BL_NAME FROM PM_CUSTOMER " + "WHERE CUST_CLASS IN (" + "SELECT CCLAS_CODE FROM PM_CUST_CLASS, PP_SYSTEM WHERE PS_TYPE ='LOV_CUST') " + "AND CUST_FRZ_FLAG = 'N' AND (" + "(CUST_CODE IN (" + "SELECT CDIV_CUST_CODE FROM  PM_CUST_DIVN " + "WHERE CDIV_DIVN_CODE = NVL ('HO', CDIV_DIVN_CODE) " + "AND CUST_APPL_ALL_BRAN_YN = 'N')) " + "OR (CUST_APPL_ALL_BRAN_YN = 'Y')) " + "AND UPPER(CUST_CODE) LIKE NVL(UPPER(?), CUST_CODE) AND ROWNUM<50";*/
	
	String SWISS_SQL_CLAIM_PAID_QUERY11 = "SELECT CUST_CODE, CUST_NAME, CUST_BL_NAME FROM PM_CUSTOMER " + "WHERE CUST_CLASS IN (" + "SELECT CCLAS_CODE FROM PM_CUST_CLASS, PP_SYSTEM WHERE PS_TYPE ='LOV_CUST') " + " AND (" + "(CUST_CODE IN (" + "SELECT CDIV_CUST_CODE FROM  PM_CUST_DIVN " + "WHERE CDIV_DIVN_CODE = NVL ('HO', CDIV_DIVN_CODE) " + "AND CUST_APPL_ALL_BRAN_YN = 'N')) " + "OR (CUST_APPL_ALL_BRAN_YN = 'Y')) " + "AND UPPER(CUST_CODE) LIKE NVL(UPPER(?), CUST_CODE) AND ROWNUM<50";
	
	
	
	/*added by raja on 10-06-2017 for ZBILQC-1728216�*/
	/*String SWISS_SQL_CLAIM_PAID_QUERY12 = "SELECT PT_IL_CLAIM_PAID.ROWID, CP_SYS_ID, " +
													"CP_CE_SYS_ID,CP_CLAIM_SYS_ID,CP_REF_SYS_ID,CP_CCD_SYS_ID,CCD_COVER_CODE, " +
													"CP_PAID_DT, CP_SCHD_PYMT_DT,CP_ACCNT_PAY_CODE, CLAIM_CURR_CODE, CP_FC_PAID_AMT, " + 
													"CP_LC_PAID_AMT, CP_CLAIM_REJ_REASON, CP_ACCNT_PAY_CODE, " + 
													"CP_CLAIM_PAID_TO, CP_SET_FLAG, CP_CLM_PAID_STATUS, CP_APPR_FLAG ,CP_FLEX_04,CP_FLEX_05,CP_FLEX_06 " + 
													"FROM PT_IL_CLAIM_PAID, PT_IL_CLAIM_COVER_DTLS, PM_IL_COVER, PT_IL_CLAIM " + 
													"WHERE CCD_CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + 
													"AND CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + 
													"AND COVER_CODE=CCD_COVER_CODE " + 
													"AND CP_CCD_SYS_ID=CCD_SYS_ID " + 
													"AND CLAIM_NO LIKE NVL(?,CLAIM_NO) " + 
													"AND CP_APPR_FLAG IN ('Y','N','A')";
	*/
	
	
	/*Modified by Janani on  21.08.2017 for ZBILQC-1732254*/
	
	/*String SWISS_SQL_CLAIM_PAID_QUERY12 = "SELECT PT_IL_CLAIM_PAID.ROWID, CP_SYS_ID, " +
			"CP_CE_SYS_ID,CP_CLAIM_SYS_ID,CP_REF_SYS_ID,CP_CCD_SYS_ID,CCD_COVER_CODE, " +
			"CP_PAID_DT, CP_SCHD_PYMT_DT,CP_ACCNT_PAY_CODE, CLAIM_CURR_CODE, CP_FC_PAID_AMT, " + 
			"CP_LC_PAID_AMT, CP_CLAIM_REJ_REASON, CP_ACCNT_PAY_CODE, " + 
			"CP_CLAIM_PAID_TO, CP_SET_FLAG, CP_CLM_PAID_STATUS, CP_APPR_FLAG ,CP_FLEX_04,CP_FLEX_05,CP_FLEX_06,CP_FLEX_07,CP_FLEX_08,CP_FLEX_09 " + 
			"FROM PT_IL_CLAIM_PAID, PT_IL_CLAIM_COVER_DTLS, PM_IL_COVER, PT_IL_CLAIM " + 
			"WHERE CCD_CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + 
			"AND CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + 
			"AND COVER_CODE=CCD_COVER_CODE " + 
			"AND CP_CCD_SYS_ID=CCD_SYS_ID " + 
			"AND CLAIM_NO LIKE NVL(?,CLAIM_NO) " + 
			"AND CP_APPR_FLAG IN ('Y','N','A')";*/
	
	
	/*
	 * modified by Ameen as per Ajay sugg. to diaplay bank dtls fields on 30-11-2017
	 * String SWISS_SQL_CLAIM_PAID_QUERY12 = "SELECT PT_IL_CLAIM_PAID.ROWID, CP_SYS_ID, " +
			"CP_CE_SYS_ID,CP_CLAIM_SYS_ID,CP_REF_SYS_ID,CP_CCD_SYS_ID,CCD_COVER_CODE, " +
			"CP_PAID_DT, CP_SCHD_PYMT_DT,CP_ACCNT_PAY_CODE, CLAIM_CURR_CODE, CP_FC_PAID_AMT, " + 
			"CP_LC_PAID_AMT, CP_CLAIM_REJ_REASON, CP_ACCNT_PAY_CODE, " + 
			"CP_CLAIM_PAID_TO, CP_SET_FLAG, CP_CLM_PAID_STATUS, CP_APPR_FLAG ,CP_FLEX_04,CP_FLEX_05,CP_FLEX_06,CP_FLEX_08,CP_FLEX_09 " + 
			"FROM PT_IL_CLAIM_PAID, PT_IL_CLAIM_COVER_DTLS, PM_IL_COVER, PT_IL_CLAIM " + 
			"WHERE CCD_CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + 
			"AND CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + 
			"AND COVER_CODE=CCD_COVER_CODE " + 
			"AND CP_CCD_SYS_ID=CCD_SYS_ID " + 
			"AND CLAIM_NO LIKE NVL(?,CLAIM_NO) " + 
			"AND CP_APPR_FLAG IN ('Y','N','A')";*/
	
	/*String SWISS_SQL_CLAIM_PAID_QUERY12 = "SELECT PT_IL_CLAIM_PAID.ROWID, CP_SYS_ID, " +
			"CP_CE_SYS_ID,CP_CLAIM_SYS_ID,CP_REF_SYS_ID,CP_CCD_SYS_ID,CCD_COVER_CODE, " +
			"CP_PAID_DT, CP_SCHD_PYMT_DT,CP_ACCNT_PAY_CODE, CLAIM_CURR_CODE, CP_FC_PAID_AMT, " + 
			"CP_LC_PAID_AMT, CP_CLAIM_REJ_REASON, CP_ACCNT_PAY_CODE, " + 
			"CP_CLAIM_PAID_TO, CP_SET_FLAG, CP_CLM_PAID_STATUS, CP_APPR_FLAG ,CP_FLEX_04,CP_FLEX_05,CP_FLEX_06,CP_FLEX_08,CP_FLEX_09 ," +
			"CP_FLEX_10,CP_FLEX_11,CP_FLEX_12,CP_FLEX_13 " + 
			"FROM PT_IL_CLAIM_PAID, PT_IL_CLAIM_COVER_DTLS, PM_IL_COVER, PT_IL_CLAIM " + 
			"WHERE CCD_CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + 
			"AND CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + 
			"AND COVER_CODE=CCD_COVER_CODE " + 
			"AND CP_CCD_SYS_ID=CCD_SYS_ID " + 
			"AND CLAIM_NO LIKE NVL(?,CLAIM_NO) " + 
			"AND CP_APPR_FLAG IN ('Y','N','A')";*/
	
	/*Added by Janani on 14.02.2018 for ZB as per Thiags sugges*/
	String SWISS_SQL_CLAIM_PAID_QUERY12 = "SELECT PT_IL_CLAIM_PAID.ROWID, CP_SYS_ID, " +
			"CP_CE_SYS_ID,CP_CLAIM_SYS_ID,CP_REF_SYS_ID,CP_CCD_SYS_ID,CCD_COVER_CODE, " +
			"CP_PAID_DT, CP_SCHD_PYMT_DT,CP_ACCNT_PAY_CODE, CLAIM_CURR_CODE, CP_FC_PAID_AMT, " + 
			"CP_LC_PAID_AMT, CP_CLAIM_REJ_REASON, CP_ACCNT_PAY_CODE, " + 
			"CP_CLAIM_PAID_TO, CP_SET_FLAG, CP_CLM_PAID_STATUS, CP_APPR_FLAG ,CP_FLEX_04,CP_FLEX_05,CP_FLEX_06,CP_FLEX_08,CP_FLEX_09 ," +
			"CP_FLEX_10,CP_FLEX_11,CP_FLEX_12,CP_FLEX_13,CP_PAYEE_NAME,CP_PYMT_MTD " + 
			"FROM PT_IL_CLAIM_PAID, PT_IL_CLAIM_COVER_DTLS, PM_IL_COVER, PT_IL_CLAIM " + 
			"WHERE CCD_CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + 
			"AND CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + 
			"AND COVER_CODE=CCD_COVER_CODE " + 
			"AND CP_CCD_SYS_ID=CCD_SYS_ID " + 
			"AND CLAIM_NO LIKE NVL(?,CLAIM_NO) " + 
			"AND CP_APPR_FLAG IN ('Y','N','A')";
	
	/*End*/
	
	/*End of ZBILQC-1732254*/
	
	
	/*end*/
	
	String SWISS_SQL_CLAIM_PAID_QUERY13 = "SELECT SUM(NVL(CP_LC_PAID_AMT,0)), SUM(NVL(CP_FC_PAID_AMT,0)) " + "FROM PT_IL_CLAIM_PAID, PT_IL_CLAIM " + "WHERE CP_CLAIM_SYS_ID = CLAIM_SYS_ID " + "AND NVL(CP_APPR_FLAG,'N') IN ('R', 'A') " + "AND CLAIM_NO=?";
	
	String SWISS_SQL_CLAIM_PAID_QUERY14 = "SELECT CP_SYS_ID, CP_CE_SYS_ID,CP_CLAIM_SYS_ID, CP_REF_SYS_ID,CP_CCD_SYS_ID "+ "FROM PT_IL_CLAIM_PAID, PT_IL_CLAIM " + "WHERE CP_CLAIM_SYS_ID = CLAIM_SYS_ID " + "AND NVL(CP_APPR_FLAG,'N') IN ('R', 'A') " + "AND CLAIM_NO=?";
	
	String SWISS_SQL_CLAIM_PAID_QUERY15 = "SELECT SUM( NVL(CE_LC_NET_EST_AMT,0)) ,SUM( NVL(CE_FC_NET_EST_AMT,0)) " + "FROM PT_IL_CLAIM_ESTIMATE, PT_IL_CLAIM " + "WHERE CE_CLAIM_SYS_ID = CLAIM_SYS_ID " + "AND CLAIM_NO=?";
	
	String SWISS_SQL_CLAIM_PAID_QUERY16 = "SELECT 'X' FROM  PT_IL_CLAIM_PAID  " + "WHERE  CP_CE_SYS_ID  = ? " + "AND CP_CLAIM_SYS_ID  = ? " + "AND CP_CLM_PAID_STATUS  = 'Y'  AND CP_CLAIM_REJ_REASON  = 'A' ";
	
	String SWISS_SQL_CLAIM_PAID_QUERY17 = "SELECT    SUM(CP_LC_PAID_AMT),    SUM(CP_FC_PAID_AMT) FROM  PT_IL_CLAIM_PAID  " + "WHERE  CP_CLAIM_SYS_ID  = ?  " + "AND CP_APPR_FLAG  = 'Y'  " + "AND CP_CLM_PAID_STATUS  = 'A' ";
	
	String SWISS_SQL_CLAIM_PAID_QUERY18 = "SELECT PROD_DESC FROM PM_IL_PRODUCT WHERE PROD_CODE=?";
	
	/*Added by saritha on 03-02-2017 for RM018T - DEV_IL_ZB Life_014-Interest on delayed claims*/
	/*String SWISS_SQL_CLAIM_PAID_QUERY19 = "SELECT sum(CP_FC_PAID_AMT)  CP_FC_PAID_AMT  FROM PT_IL_CLAIM_PAID, PT_IL_CLAIM_COVER_DTLS, PM_IL_COVER, PT_IL_CLAIM " + 
													"WHERE CCD_CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + 
													"AND CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + 
													"AND COVER_CODE=CCD_COVER_CODE " + 
													"AND CP_CCD_SYS_ID=CCD_SYS_ID " + 
													"AND CLAIM_NO LIKE NVL(?,CLAIM_NO) " + 
													"AND CP_APPR_FLAG IN ('Y','N','A','R')";*/
	
	
	/*String SWISS_SQL_CLAIM_PAID_QUERY20 = "SELECT sum(CP_FC_PAID_AMT)  CP_FC_PAID_AMT  FROM PT_IL_CLAIM_PAID, PT_IL_CLAIM_COVER_DTLS, PM_IL_COVER, PT_IL_CLAIM " + 
			"WHERE CCD_CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + 
			"AND CLAIM_SYS_ID=CP_CLAIM_SYS_ID " + 
			"AND COVER_CODE=CCD_COVER_CODE " + 
			"AND CP_CCD_SYS_ID=CCD_SYS_ID " + 
			"AND CLAIM_NO LIKE NVL(?,CLAIM_NO) " + 
			"AND CP_APPR_FLAG IN ('Y','N','A','R')";*/
	
	/*Commentted &Added by saritha on 10-01-2018*/  
	
	String SWISS_SQL_CLAIM_PAID_QUERY19 = "SELECT SUM( NVL(CE_LC_NET_EST_AMT,0)) ,SUM( NVL(CE_FC_NET_EST_AMT,0)) FROM  PT_IL_CLAIM_ESTIMATE WHERE CE_CLAIM_SYS_ID  = ?";
	String SWISS_SQL_CLAIM_PAID_QUERY20 = "SELECT SUM( NVL(CE_LC_NET_EST_AMT,0)) ,SUM( NVL(CE_FC_NET_EST_AMT,0)) FROM  PT_IL_CLAIM_ESTIMATE WHERE CE_CLAIM_SYS_ID  = ?";
	

	/*End*/	
	
	/*added by gopi for ssp call id ZBILQC-1728295�on 14/06/17*/
	
	String SWISS_SQL_CLAIM_PAID_QUERY21 = "SELECT CUST_NAME FROM PM_CUSTOMER WHERE CUST_CODE=? ";
	/*end*/
	
	
	
	
	String SWISS_SQL_CLAIM_QUERY1 = "SELECT CP_SYS_ID FROM PT_IL_CLAIM_PAID WHERE CP_CLAIM_SYS_ID=?";
	
	String SWISS_SQL_CLAIM_QUERY2 = "SELECT POL_FAC_YN FROM PT_IL_POLICY" + " WHERE  POL_SYS_ID  = ? ";
	
	String SWISS_SQL_CLAIM_QUERY3 = "SELECT CP_APPR_FLAG FROM PT_IL_CLAIM_PAID" + " WHERE  CP_CLAIM_SYS_ID  = ?" + " AND CP_SYS_ID  = ?";
	
	String SWISS_SQL_CLAIM_QUERY4 ="SELECT 'X' FROM  PT_IL_CLAIM_PAID" + " WHERE  CP_CLAIM_SYS_ID  = ?" + " AND CP_SYS_ID  = ? ";
	/*Added by sankaraNarayanan on 16/02/2016 for print */
	//String SWISS_SQL_CLAIM_QUERY5 = "SELECT POL_PROD_CODE, POL_SA_CURR_CODE FROM PT_IL_POLICY" + " WHERE  POL_SYS_ID  = ? ";
	String SWISS_SQL_CLAIM_QUERY5 = "SELECT POL_PROD_CODE,POL_PLAN_CODE,POL_SA_CURR_CODE FROM PT_IL_POLICY" + " WHERE  POL_SYS_ID  = ? ";
	/*end*/
	String SWISS_SQL_CLAIM_QUERY6 = "SELECT COUNT(*) FROM  PT_IL_CLAIM_PAID" + " WHERE  CP_CLAIM_SYS_ID  = ?" + " AND CP_APPR_FLAG  IN  ( 'N'  , 'Y'  )" + " AND CP_CLM_PAID_STATUS  IN ( 'A'  , 'R'  ) ";
	
	String SWISS_SQL_CLAIM_QUERY7 = "SELECT COUNT(*) FROM  PT_IL_CLAIM_PAID" + " WHERE  CP_CLAIM_SYS_ID  = ?" + " AND CP_APPR_FLAG  IN ( 'N'  , 'Y'  )" + " AND CP_CLM_PAID_STATUS  IN ( 'A'  , 'R'  , 'P'  ) ";
	
	String SWISS_SQL_CLAIM_QUERY8 = "SELECT POAD_ASSURED_NAME FROM PT_IL_POL_ASSURED_DTLS" + " WHERE  POAD_POL_SYS_ID  = ? " + " AND POAD_ASSR_CODE  = ? ";
	
	String SWISS_SQL_CLAIM_QUERY9 = "SELECT 1 FROM  PT_IL_CLAIM_PAID P  " + "WHERE  P.CP_CLAIM_SYS_ID  = ? ";
	
	String SWISS_SQL_CLAIM_QUERY10 = "SELECT 1 FROM  PT_IL_CLAIM_PAID P  " + "WHERE  P.CP_CLAIM_SYS_ID  = ? ";
	
	/*commented by Ameen for lov lower case issue ssp call id FALCONLIFE-1344105 on 15-10-2016
	 * String SWISS_SQL_CLAIM_QUERY12 = "SELECT CLAIM_POL_NO FROM PT_IL_CLAIM, PT_IL_POLICY " + "WHERE CLAIM_POL_NO = POL_NO " + "AND CLAIM_POL_NO LIKE NVL(?,CLAIM_POL_NO) " + "AND NVL(POL_STATUS,'N') IN ('A', 'E', 'P') " + "AND POL_NO IS NOT NULL " + "AND POL_DS_TYPE = ? " + "ORDER BY CLAIM_POL_NO";
	 * String SWISS_SQL_CLAIM_QUERY11 = "SELECT CLAIM_NO, CLAIM_LOSS_DT FROM PT_IL_CLAIM " + "WHERE CLAIM_NO LIKE NVL(?, CLAIM_NO) ORDER BY CLAIM_NO";*/
	
	/*Added by Ameen for lov lower case issue ssp call id FALCONLIFE-1344105 on 15-10-2016*/
	String SWISS_SQL_CLAIM_QUERY11 = "SELECT CLAIM_NO, CLAIM_LOSS_DT FROM PT_IL_CLAIM " + "WHERE UPPER(CLAIM_NO) LIKE NVL(UPPER(?), CLAIM_NO) ORDER BY CLAIM_NO";
	String SWISS_SQL_CLAIM_QUERY12 = "SELECT CLAIM_POL_NO FROM PT_IL_CLAIM, PT_IL_POLICY " + "WHERE CLAIM_POL_NO = POL_NO " + "AND UPPER(CLAIM_POL_NO) LIKE NVL(UPPER(?),CLAIM_POL_NO) " + "AND NVL(POL_STATUS,'N') IN ('A', 'E', 'P') " + "AND POL_NO IS NOT NULL " + "AND POL_DS_TYPE = ? " + "ORDER BY CLAIM_POL_NO";
	
	//end
	
	
	String SWISS_SQL_CLAIM_QUERY13 = "SELECT DISTINCT CLAIM_POL_NO, PT_IL_CLAIM.ROWID, CLAIM_NO, POAD_ASSR_CODE, " + "CLAIM_SYS_ID,CLAIM_POL_SYS_ID,CLAIM_DS_CODE,CLAIM_POAD_SERIAL_NO," + "CLAIM_ASSR_CODE,CLAIM_CURR_CODE,CLAIM_EXCH_RATE,CLAIM_FRZ_FLAG, POAD_ASSURED_NAME " + "FROM PT_IL_POL_ASSURED_DTLS, PT_IL_CLAIM " + "WHERE POAD_ASSR_CODE=CLAIM_ASSR_CODE " + "AND CLAIM_NO=?";
	
	String SWISS_SQL_PILT007_QUERY1 = "SELECT PARA_VALUE FROM  FP_PARAMETER  WHERE  PARA_ID  = ? ";
	
	String SWISS_SQL_PILT007_QUERY2 = "SELECT DS_CURR_RATE_BS FROM  PM_IL_DOC_SETUP  WHERE  DS_TYPE  = '1'  AND DS_CODE  = ? ";
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}