package com.iii.pel.forms.PILQ003;

public interface PILQ003_QUERY_CONSTANTS {

    // query used for  PRE_FORM method
    
    
    String preFormQUERY_BUY_SELL = "SELECT DS_CURR_RATE_BS  FROM   PM_IL_DOC_SETUP" +
    		"  WHERE DS_TYPE =  ? " +
    		" AND    DS_FRZ_FLAG = 'N'   AND   DS_CODE = ? ";
    
    String preFormQUERY_PP_SYS = "SELECT PS_CODE  FROM   PP_SYSTEM  WHERE  PS_TYPE = 'SITE' ";
    
    String preFormQUERY_PLAN	= " SELECT PLAN_TYPE,PLAN_AGE_TERM_FLAG,PLAN_RED_SA_BASIS,PLAN_CALC_TYPE " +
        		"   FROM   PM_IL_PLAN WHERE  PLAN_CODE  =  ? " +
        		"    AND    PLAN_FRZ_FLAG = 'N' ";
    
    String preFormQUERY_1	= "SELECT NVL(DS_BROKER_YN,'N') DS_BROKER_YN FROM PM_IL_DOC_SETUP " +
    			" WHERE DS_TYPE = ? AND DS_CODE =? ";
  
    String preFormQUERY_2	= "	SELECT COUNT(*)  FROM PM_IL_DOC_MED_HIST " +
    			" WHERE DMH_DS_TYPE =?  AND DMH_DS_CODE = ? ";
   
    String preFormQUERY_3	= "SELECT  ASD_CHAR_VALUE  FROM  PM_IL_APPR_SETUP_DET " +
        		" WHERE   ASD_USER_ID =? AND     ASD_CODE = ? " +
        		" AND  ?  BETWEEN NVL(ASD_FM_PROD_CODE,'0') AND NVL(ASD_TO_PROD_CODE,'zzzzzzzzzzzz')";
   
    String preFormQUERY_4	= "SELECT PS_CODE_DESC  FROM   PP_SYSTEM   WHERE  PS_TYPE = ? " +
    			"  AND    PS_CODE = ? ";
   
    String preFormQUERY_5	= "  SELECT PROD_PREM_CALC_MTHD, PROD_PERIOD_MULTIPLE, PROD_ALLOC_TYPE," +
    			"  PROD_PREM_TARIFF, PROD_SA_TARIFF,PROD_SA_FACTOR, PROD_TOPUP_YN, PROD_MATU_DT," +
    			" PROD_AUTO_UW,	 PROD_SA_ADD_FACTOR   FROM   PM_IL_PRODUCT" +
    			"     WHERE  PROD_CODE=? ";
   
    String preFormQUERY_6	= " SELECT COVER_SA_CALC,COVER_FUND_TYPE,COVER_FUND_MTHD,COVER_VAR_VALUE" +
    			"   FROM   PM_IL_COVER    WHERE  COVER_CODE= ? ";
    
    String preFormQUERY_7	= " SELECT  CSVSD_PARA_VALUE  FROM    PP_COMP_SITE_VALUE_SET_DTL   WHERE   CSVSD_PARA_TYPE = ?";
    
    String preFormQUERY_8	= "SELECT  ASD_CHAR_VALUE FROM    PM_IL_APPR_SETUP_DET" +
        		"  WHERE   ASD_USER_ID =?     AND     ASD_CODE    =? AND  " +
        		" ?  BETWEEN NVL(ASD_FM_PROD_CODE,'0') AND NVL(ASD_TO_PROD_CODE,'zzzzzzzzzzzz')";
    
    
    // end query-----
    
    // FOR L_UPDATE QUERY
    
    	String L_UPDATE_PT_IL_POL_ASSURED_DTLS="UPDATE PT_IL_POL_ASSURED_DTLS SET POAD_CR_UID = POAD_CR_UID  WHERE  POAD_POL_SYS_ID  = ?  ";
	
	String L_UPDATE_PT_IL_POL_ADDL_COVER ="UPDATE PT_IL_POL_ADDL_COVER  SET POAC_CR_UID = POAC_CR_UID  WHERE  POAC_POL_SYS_ID  = ?  ";
	
	String L_UPDATE_PT_IL_POL_BENEFICIARY ="UPDATE   PT_IL_POL_BENEFICIARY    SET PBEN_CR_UID = PBEN_CR_UID  WHERE  PBEN_POL_SYS_ID  = ?  ";
	
	String L_UPDATE_PT_IL_POL_ASSR_MED_HIST="UPDATE   PT_IL_POL_ASSR_MED_HIST    SET PAMH_CR_UID = PAMH_CR_UID  WHERE  PAMH_POL_SYS_ID  = ? ";
	
	String L_UPDATE_PT_IL_POL_ASSR_ILLNESS_DTLS="UPDATE   PT_IL_POL_ASSR_ILLNESS_DTLS    SET PAID_CR_UID = PAID_CR_UID  WHERE  PAID_POL_SYS_ID  = ?  ";
	
	String L_UPDATE_PT_IL_POL_MED_EXAM_DTL="UPDATE   PT_IL_POL_MED_EXAM_DTL    SET PMED_CR_DT = PMED_CR_DT  WHERE  PMED_POL_SYS_ID  = ?  ";
	
	String L_UPDATE_PT_IL_POL_CHARGE="UPDATE   PT_IL_POL_CHARGE    SET POC_CR_DT = POC_CR_DT  WHERE  POC_POL_SYS_ID  = ?  ";
	
	String L_UPDATE_PT_IL_POL_BROKER_HEAD ="UPDATE   PT_IL_POL_BROKER_HEAD    SET POBH_CR_DT = POBH_CR_DT  WHERE  POBH_POL_SYS_ID  = ?  ";
	/*<!--[ BugId:PREMIAGDC-33 Siva Phanikumar 04-Feb-09 When we press the Endorsement ok button error was coming due to query problem.Now the query has been changed. -->
	Old Query
	String L_UPDATE_9="UPDATE   PT_IL_POL_BROKER_DTL    SET POBD_CR_UID = POBD_CR_UID  WHERE  POBD_POBH_SYS_ID  =  (   SELECT POBH_SYS_ID  FROM  PT_IL_POL_BROKER_HEAD   WHERE  POBH_POL_SYS_ID  = ?  )  ";*/
	
	String L_UPDATE_PT_IL_POL_BROKER_DTL="UPDATE   PT_IL_POL_BROKER_DTL    SET POBD_CR_UID = POBD_CR_UID  WHERE  POBD_POBH_SYS_ID  IN  (   SELECT POBH_SYS_ID  FROM  PT_IL_POL_BROKER_HEAD   WHERE  POBH_POL_SYS_ID  = ?  )  ";
	
	String L_UPDATE_PT_IL_POL_DISC_LOAD="UPDATE   PT_IL_POL_DISC_LOAD    SET PDL_CR_DT = PDL_CR_DT  WHERE  PDL_POL_SYS_ID  = ?  ";
	
	String L_UPDATE_PT_IL_POL_CONDITION="UPDATE   PT_IL_POL_CONDITION    SET PLCOND_CR_DT = PLCOND_CR_DT  WHERE  PLCOND_POL_SYS_ID  = ?  ";
	
	String L_UPDATE_PT_IL_POL_RED_SA="UPDATE   PT_IL_POL_RED_SA    SET PRS_CR_DT = PRS_CR_DT  WHERE  PRS_POL_SYS_ID  = ?  ";
	
	String L_UPDATE_PT_IL_POL_FUND_DTL = "  UPDATE PT_IL_POL_FUND_DTL SET POFD_CR_DT = POFD_CR_DT  WHERE POFD_POL_SYS_ID = ?" ;    
	 
	String L_UPDATE_PT_IL_POL_SA_INST_PYMT_HEAD ="   UPDATE PT_IL_POL_SA_INST_PYMT_HEAD   SET    SIPH_CR_DT = SIPH_CR_DT  WHERE  SIPH_POL_SYS_ID= ?" ;

	String L_UPDATE_PT_IL_POL_SA_INST_PYMT ="  UPDATE PT_IL_POL_SA_INST_PYMT    SET SIPD_CR_DT = SIPD_CR_DT  " +
						" WHERE SIPD_SIPH_SYS_ID IN (SELECT SIPH_SYS_ID FROM PT_IL_POL_SA_INST_PYMT_HEAD" +
						" WHERE SIPD_POL_SYS_ID =? ) ";


    
}
