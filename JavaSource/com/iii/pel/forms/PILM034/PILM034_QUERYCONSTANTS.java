package com.iii.pel.forms.PILM034;
public interface PILM034_QUERYCONSTANTS { 
	
	String PM_IL_TAR_DTL_pre_insert_update="SELECT 'X' FROM PM_IL_TAR_DTL WHERE  TD_PARAM_TYPE = ? " +
			"AND TD_TH_CODE =  ? " +
	  " AND (NVL(?,'XXX') BETWEEN NVL(PM_IL_TAR_DTL.TD_PARA_01_FM,'XXX') AND NVL(PM_IL_TAR_DTL.TD_PARA_01_TO,'XXX')" +
	  "	OR NVL(?,'XXX') BETWEEN NVL(PM_IL_TAR_DTL.TD_PARA_01_FM,'XXX') AND NVL(PM_IL_TAR_DTL.TD_PARA_01_TO,'XXX')" +
	  " OR NVL(PM_IL_TAR_DTL.TD_PARA_01_FM,'XXX') BETWEEN NVL(?,'XXX') AND NVL(?,'XXX')" +
	  "	OR NVL(PM_IL_TAR_DTL.TD_PARA_01_TO,'XXX') BETWEEN NVL(?,'XXX') AND NVL(?,'XXX'))" +
	  " AND (NVL(?,'XXX') BETWEEN NVL(PM_IL_TAR_DTL.TD_PARA_02_FM,'XXX') AND NVL(PM_IL_TAR_DTL.TD_PARA_02_TO,'XXX')" +
	  "	OR NVL(?,'XXX') BETWEEN NVL(PM_IL_TAR_DTL.TD_PARA_02_FM,'XXX') AND NVL(PM_IL_TAR_DTL.TD_PARA_02_TO,'XXX')" +
	  "	OR NVL(PM_IL_TAR_DTL.TD_PARA_02_FM,'XXX') BETWEEN NVL(?,'XXX') AND NVL(?,'XXX')" +
	  "	OR NVL(PM_IL_TAR_DTL.TD_PARA_02_TO,'XXX') BETWEEN NVL(?,'XXX') AND NVL(?,'XXX'))" +
	  " AND (NVL(?,'XXX') BETWEEN NVL(PM_IL_TAR_DTL.TD_PARA_03_FM,'XXX') AND NVL(PM_IL_TAR_DTL.TD_PARA_03_TO,'XXX')" +
	  " OR NVL(?,'XXX') BETWEEN NVL(PM_IL_TAR_DTL.TD_PARA_03_FM,'XXX') AND NVL(PM_IL_TAR_DTL.TD_PARA_03_TO,'XXX')" +
	  "	OR NVL(PM_IL_TAR_DTL.TD_PARA_03_FM,'XXX') BETWEEN NVL(?,'XXX') AND NVL(?,'XXX')" +
	  " OR NVL(PM_IL_TAR_DTL.TD_PARA_03_TO,'XXX') BETWEEN NVL(?,'XXX') AND NVL(?,'XXX'))" +
	  " AND (NVL(?,'XXX') BETWEEN NVL(PM_IL_TAR_DTL.TD_PARA_04_FM,'XXX') AND NVL(PM_IL_TAR_DTL.TD_PARA_04_TO,'XXX')" +
	  " OR NVL(?,'XXX') BETWEEN NVL(PM_IL_TAR_DTL.TD_PARA_04_FM,'XXX') AND NVL(PM_IL_TAR_DTL.TD_PARA_04_TO,'XXX')" +
	  " OR NVL(PM_IL_TAR_DTL.TD_PARA_04_FM,'XXX') BETWEEN NVL(?,'XXX') AND NVL(?,'XXX')" +
	  " OR NVL(PM_IL_TAR_DTL.TD_PARA_04_TO,'XXX') BETWEEN NVL(?,'XXX') AND NVL(?,'XXX'))" +
	  " AND (NVL(?,'XXX') BETWEEN NVL(PM_IL_TAR_DTL.TD_PARA_05_FM,'XXX') AND NVL(PM_IL_TAR_DTL.TD_PARA_05_TO,'XXX')" +
	  " OR NVL(?,'XXX') BETWEEN NVL(PM_IL_TAR_DTL.TD_PARA_05_FM,'XXX') AND NVL(PM_IL_TAR_DTL.TD_PARA_05_TO,'XXX')" +
	  " OR NVL(PM_IL_TAR_DTL.TD_PARA_05_FM,'XXX') BETWEEN NVL(?,'XXX') AND NVL(?,'XXX')" +
	  " OR NVL(PM_IL_TAR_DTL.TD_PARA_05_TO,'XXX') BETWEEN NVL(?,'XXX') AND NVL(?,'XXX'))" +
	  " AND (NVL(?,'XXX') BETWEEN NVL(PM_IL_TAR_DTL.TD_PARA_06_FM,'XXX') AND NVL(PM_IL_TAR_DTL.TD_PARA_06_TO,'XXX')" +
	  " OR NVL(?,'XXX') BETWEEN NVL(PM_IL_TAR_DTL.TD_PARA_06_FM,'XXX') AND NVL(PM_IL_TAR_DTL.TD_PARA_06_TO,'XXX')" +
	  " OR NVL(PM_IL_TAR_DTL.TD_PARA_06_FM,'XXX') BETWEEN NVL(?,'XXX') AND NVL(?,'XXX')" +
	  " OR NVL(PM_IL_TAR_DTL.TD_PARA_06_TO,'XXX') BETWEEN NVL(?,'XXX') AND NVL(?,'XXX'))" +
	  " AND (NVL(?,'XXX') BETWEEN NVL(PM_IL_TAR_DTL.TD_PARA_07_FM,'XXX') AND NVL(PM_IL_TAR_DTL.TD_PARA_07_TO,'XXX')" +
	  " OR NVL(?,'XXX') BETWEEN NVL(PM_IL_TAR_DTL.TD_PARA_07_FM,'XXX') AND NVL(PM_IL_TAR_DTL.TD_PARA_07_TO,'XXX')" +
	  " OR NVL(PM_IL_TAR_DTL.TD_PARA_07_FM,'XXX') BETWEEN NVL(?,'XXX') AND NVL(?,'XXX')" +
	  " OR NVL(PM_IL_TAR_DTL.TD_PARA_07_TO,'XXX') BETWEEN NVL(?,'XXX') AND NVL(?,'XXX'))" +
	  " AND (NVL(?,'XXX') BETWEEN NVL(PM_IL_TAR_DTL.TD_PARA_01_FM,'XXX') AND NVL(PM_IL_TAR_DTL.TD_PARA_08_TO,'XXX')" +
	  " OR NVL(?,'XXX') BETWEEN NVL(PM_IL_TAR_DTL.TD_PARA_01_FM,'XXX') AND NVL(PM_IL_TAR_DTL.TD_PARA_08_TO,'XXX')" +
	  " OR NVL(PM_IL_TAR_DTL.TD_PARA_08_FM,'XXX') BETWEEN NVL(?,'XXX') AND NVL(?,'XXX')" +
	  " OR NVL(PM_IL_TAR_DTL.TD_PARA_08_TO,'XXX') BETWEEN NVL(?,'XXX') AND NVL(?,'XXX'))" +
	  " AND (NVL(?,'XXX') BETWEEN NVL(PM_IL_TAR_DTL.TD_PARA_09_FM,'XXX') AND NVL(PM_IL_TAR_DTL.TD_PARA_09_TO,'XXX')" +
	  " OR NVL(?,'XXX') BETWEEN NVL(PM_IL_TAR_DTL.TD_PARA_09_FM,'XXX') AND NVL(PM_IL_TAR_DTL.TD_PARA_09_TO,'XXX')" +
	  " OR NVL(PM_IL_TAR_DTL.TD_PARA_09_FM,'XXX') BETWEEN NVL(?,'XXX') AND NVL(?,'XXX')" +
	  " OR NVL(PM_IL_TAR_DTL.TD_PARA_09_TO,'XXX') BETWEEN NVL(?,'XXX') AND NVL(?,'XXX'))" +
	  " AND (NVL(?,'XXX') BETWEEN NVL(PM_IL_TAR_DTL.TD_PARA_10_FM,'XXX') AND NVL(PM_IL_TAR_DTL.TD_PARA_10_TO,'XXX')" +
	  " OR NVL(?,'XXX') BETWEEN NVL(PM_IL_TAR_DTL.TD_PARA_10_FM,'XXX') AND NVL(PM_IL_TAR_DTL.TD_PARA_10_TO,'XXX')" +
	  " OR NVL(PM_IL_TAR_DTL.TD_PARA_10_FM,'XXX') BETWEEN NVL(?,'XXX') AND NVL(?,'XXX')" +
	  " OR NVL(PM_IL_TAR_DTL.TD_PARA_10_TO,'XXX') BETWEEN NVL(?,'XXX') AND NVL(?,'XXX'))" +
	  " AND ((NVL(?,'01-JAN-1900')  >= NVL(PM_IL_TAR_DTL.TD_EFF_FM_DT,'01-JAN-1900') OR NVL(?,'01-JAN-1900')  <= NVL(PM_IL_TAR_DTL.TD_EFF_FM_DT,'01-JAN-1900'))" +
	  " AND NVL(?,'01-JAN-1900')  <= NVL(PM_IL_TAR_DTL.TD_EFF_TO_DT,'31-DEC-2999')" +
	  " AND NVL(?,'31-DEC-2999')  >= NVL(PM_IL_TAR_DTL.TD_EFF_FM_DT,'01-JAN-1900')" +
	  " AND (NVL(?,'31-DEC-2999')  <= NVL(PM_IL_TAR_DTL.TD_EFF_TO_DT,'31-DEC-2999') OR NVL(?,'31-DEC-2999')  >= NVL(PM_IL_TAR_DTL.TD_EFF_TO_DT,'31-DEC-2999')))";
	
	String PM_IL_TAR_HDR_SelectCaptionValues = "SELECT TP_SRNO,TP_CAPTION, ROWID FROM PM_IL_TAR_PARAM";
	
	String PM_IL_TAR_PARAM_SelectDrpDwnValues = "SELECT  LIV_CODE,LIV_CODE_DESC " +
		"FROM PP_LIST_ITEM,PP_LIST_ITEM_VALUES WHERE LI_SYS_PARAM = LIV_SYS_PARAM " +
		"AND LI_MODULE_NAME = '{0}' AND LI_BLOCK_NAME = '{1}' AND LI_ITEM_NAME = '{2}'";

	/*Modified by Saranya on 13-03-2017 for RM018T - FSD_IL_ZB Life_001-Education Endowment Plan COMMENTS*/
	String PM_IL_TAR_HDR_TH_CODE_LOV_QUERY1="SELECT COVER_CODE, COVER_DESC "+
	  "FROM PM_IL_COVER "+
	 "WHERE ROWNUM <= 20 "+
	   "AND ? IN ('U', 'RI', 'FAC', 'CQS', 'Q', 'RSA','S') "+
	"UNION ALL "+
	"SELECT PC_CODE, PC_DESC "+
	  "FROM PM_CODES "+
	 "WHERE PC_TYPE = 'IL_DISC' "+
	   "AND NVL(PC_FRZ_FLAG, 'N') = 'N' "+
	   "AND ? IN ('D', 'QD') "+
	"UNION ALL "+
	"SELECT PC_CODE, PC_DESC "+
	 "FROM PM_CODES "+
	"WHERE PC_TYPE = 'IL_LOAD' "+
	   "AND NVL(PC_FRZ_FLAG, 'N') = 'N' "+
	   "AND ? IN ('ML', 'L', 'RIL', 'FACL', 'QL') "+
	"UNION ALL "+
	"SELECT PC_CODE, PC_DESC "+
	  "FROM PM_CODES "+
	 "WHERE PC_TYPE = 'IL_MORT_CODE' "+
	   "AND NVL(PC_FRZ_FLAG, 'N') = 'N' "+
	   "AND ? = 'M' "+
	"UNION ALL "+
	"SELECT PC_CODE, PC_DESC "+
	  "FROM PM_CODES "+
	 "WHERE PC_TYPE = 'IL_SA_FACTOR' "+
	   "AND NVL(PC_FRZ_FLAG, 'N') = 'N' "+
	   "AND ? = 'SA' "+
	"UNION ALL "+
	"SELECT PC_CODE, PC_DESC "+
	  "FROM PM_CODES "+
	 "WHERE PC_TYPE = 'IL_VAL_TAR' "+
	   "AND NVL(PC_FRZ_FLAG, 'N') = 'N' "+
	   "AND ? = 'V' "+
	"UNION ALL "+
	"SELECT PC_CODE, PC_DESC "+
	 "FROM PM_CODES "+
	 "WHERE PC_TYPE = 'IL_FOR_MAP' "+
	   "AND NVL(PC_FRZ_FLAG, 'N') = 'N' "+
	   "AND ? = 'FRM' "+
	"UNION ALL "+
	"SELECT PC_CODE, PC_DESC "+
	 "FROM PM_CODES "+
	 "WHERE PC_TYPE = 'IL_FACTORS' "+
	   "AND NVL(PC_FRZ_FLAG, 'N') = 'N' "+
	   "AND ? = 'FTR' "+
	"UNION ALL "+
	"SELECT CGH_GROUP_CODE, CGH_DESC "+
	  "FROM PM_IL_CVR_GROUP_HDR "+
	 "WHERE ? = 'CG' "+
	"UNION ALL "+
	"SELECT PC_CODE, PC_DESC "+
	  "FROM PM_CODES "+
	 "WHERE PC_TYPE = 'IL_CHARGE' "+
	   "AND NVL(PC_FRZ_FLAG, 'N') = 'N' "+
	   "AND ? IN ('C', 'QC','AR')";
	/*End*/

	
	/*String PM_IL_TAR_HDR_TH_CODE_LOV_QUERY1="SELECT COVER_CODE, COVER_DESC FROM " +
			"PM_IL_COVER WHERE ROWNUM <= 20 AND ? IN ('U','RI','FAC','CQS','Q','RSA') UNION ALL SELECT PC_CODE," +
			"PC_DESC FROM PM_CODES WHERE PC_TYPE  = 'IL_DISC' AND NVL(PC_FRZ_FLAG,'N') = 'N' " +
			"AND ? IN ('D', 'QD') UNION ALL SELECT PC_CODE,PC_DESC FROM PM_CODES WHERE PC_TYPE  = 'IL_LOAD'" +
			" AND NVL(PC_FRZ_FLAG,'N') = 'N' AND ? IN ('ML','L','RIL','FACL','QL') UNION " +
			"ALL SELECT PC_CODE,PC_DESC FROM PM_CODES WHERE PC_TYPE  = 'IL_MORT_CODE' " +
			"AND NVL(PC_FRZ_FLAG,'N') = 'N' AND ? = 'M' UNION ALL SELECT PC_CODE,PC_DESC " +
			"FROM PM_CODES WHERE PC_TYPE  = 'IL_SA_FACTOR' AND NVL(PC_FRZ_FLAG,'N') = 'N' " +
			"AND ? = 'SA' UNION ALL SELECT PC_CODE,PC_DESC FROM PM_CODES WHERE PC_TYPE  = 'IL_VAL_TAR'" +
			"AND NVL(PC_FRZ_FLAG,'N') = 'N' AND ? = 'V' UNION ALL SELECT PC_CODE,PC_DESC " +
			"FROM PM_CODES WHERE PC_TYPE  = 'IL_FOR_MAP' AND NVL(PC_FRZ_FLAG,'N') = 'N' " +
			"AND ? = 'FRM' UNION ALL SELECT PC_CODE,PC_DESC FROM PM_CODES WHERE PC_TYPE  = 'IL_FACTORS' " +
			"AND NVL(PC_FRZ_FLAG,'N') = 'N' AND ? = 'FTR' UNION ALL SELECT CGH_GROUP_CODE," +
			"CGH_DESC FROM PM_IL_CVR_GROUP_HDR WHERE ? = 'CG' UNION ALL "+
			"SELECT PC_CODE, PC_DESC FROM PM_CODES WHERE PC_TYPE = 'IL_CHARGE' " +
			"AND NVL(PC_FRZ_FLAG, 'N') = 'N'AND ? IN ('C', 'QC')";
	
*/	
	/*Modified by Saranya on 13-03-2017 for RM018T - FSD_IL_ZB Life_001-Education Endowment Plan COMMENTS*/	
	String PM_IL_TAR_HDR_TH_CODE_LOV_QUERY2="SELECT COVER_CODE, COVER_DESC "+
	  "FROM PM_IL_COVER "+
	 "WHERE ? IN ('U', 'RI', 'FAC', 'CQS', 'Q', 'RSA','S') "+
	   "AND COVER_CODE LIKE ? "+
	"UNION ALL "+
	"SELECT PC_CODE, PC_DESC "+ 
	  "FROM PM_CODES "+
	 "WHERE PC_TYPE = 'IL_DISC' "+
	   "AND NVL(PC_FRZ_FLAG, 'N') = 'N' "+
	   "AND ? IN ('D', 'QD') "+
	   "AND PC_CODE LIKE ? "+
	"UNION ALL "+
	"SELECT PC_CODE, PC_DESC "+
	  "FROM PM_CODES "+
	 "WHERE PC_TYPE = 'IL_LOAD' "+
	  "AND NVL(PC_FRZ_FLAG, 'N') = 'N' "+
	   "AND ? IN ('ML', 'L', 'RIL', 'FACL', 'QL') "+
	   "AND PC_CODE LIKE ? "+
	"UNION ALL "+
	"SELECT PC_CODE, PC_DESC "+
	  "FROM PM_CODES "+
	 "WHERE PC_TYPE = 'IL_MORT_CODE' "+
	   "AND NVL(PC_FRZ_FLAG, 'N') = 'N' "+
	   "AND ? = 'M' "+
	   "AND PC_CODE LIKE ? "+
	"UNION ALL "+
	"SELECT PC_CODE, PC_DESC "+
	  "FROM PM_CODES "+
	 "WHERE PC_TYPE = 'IL_SA_FACTOR' "+
	   "AND NVL(PC_FRZ_FLAG, 'N') = 'N' "+
	   "AND ? = 'SA' "+
	   "AND PC_CODE LIKE ? "+
	"UNION ALL "+
	"SELECT PC_CODE, PC_DESC "+ 
	  "FROM PM_CODES "+
	 "WHERE PC_TYPE = 'IL_VAL_TAR' "+
	   "AND NVL(PC_FRZ_FLAG, 'N') = 'N' "+
	   "AND ? = 'V' "+
	   "AND PC_CODE LIKE ? "+
	"UNION ALL "+
	"SELECT PC_CODE, PC_DESC "+
	 "FROM PM_CODES "+
	 "WHERE PC_TYPE = 'IL_FOR_MAP' "+
	   "AND NVL(PC_FRZ_FLAG, 'N') = 'N' "+
	   "AND ? = 'FRM' "+
	   "AND PC_CODE LIKE ? "+
	"UNION ALL "+
	"SELECT PC_CODE, PC_DESC "+
	  "FROM PM_CODES "+
	 "WHERE PC_TYPE = 'IL_FACTORS' "+
	   "AND NVL(PC_FRZ_FLAG, 'N') = 'N' "+
	   "AND ? = 'FTR' "+
	   "AND PC_CODE LIKE ? "+
	"UNION ALL "+
	"SELECT CGH_GROUP_CODE, CGH_DESC "+
	 "FROM PM_IL_CVR_GROUP_HDR "+
	"WHERE ? = 'CG'  "+
	   "AND CGH_GROUP_CODE LIKE ? "+
	"UNION ALL "+
	"SELECT PC_CODE, PC_DESC "+
	  "FROM PM_CODES "+
	 "WHERE PC_TYPE = 'IL_CHARGE' "+
	  "AND NVL(PC_FRZ_FLAG, 'N') = 'N' "+
	   "AND ? IN ('C', 'QC','AR') "+
	   "AND PC_CODE LIKE ?";

	/*end*/
	
	
	/*String PM_IL_TAR_HDR_TH_CODE_LOV_QUERY2="SELECT COVER_CODE, COVER_DESC FROM " +
			"PM_IL_COVER WHERE ? IN ('U','RI','FAC','CQS','Q','RSA') AND COVER_CODE  LIKE ? UNION " +
			"ALL SELECT PC_CODE,PC_DESC FROM PM_CODES WHERE PC_TYPE  = 'IL_DISC' AND " +
			"NVL(PC_FRZ_FLAG,'N') = 'N' AND ? IN ('D','QD') AND PC_CODE LIKE ? UNION ALL " +
			"SELECT PC_CODE,PC_DESC FROM PM_CODES WHERE PC_TYPE  = 'IL_LOAD' AND " +
			"NVL(PC_FRZ_FLAG,'N') = 'N' AND ? IN ('ML','L','RIL','FACL','QL') AND " +
			"PC_CODE LIKE ? UNION ALL SELECT PC_CODE,PC_DESC FROM PM_CODES WHERE " +
			"PC_TYPE  = 'IL_MORT_CODE' AND NVL(PC_FRZ_FLAG,'N') = 'N' AND ? = 'M' AND " +
			"PC_CODE LIKE ? UNION ALL SELECT PC_CODE,PC_DESC FROM PM_CODES WHERE " +
			"PC_TYPE  = 'IL_SA_FACTOR' AND NVL(PC_FRZ_FLAG,'N') = 'N' AND ? = 'SA' " +
			"AND PC_CODE LIKE ? UNION ALL SELECT PC_CODE,PC_DESC FROM PM_CODES WHERE " +
			"PC_TYPE  = 'IL_VAL_TAR' AND NVL(PC_FRZ_FLAG,'N') = 'N' AND ? = 'V' AND " +
			"PC_CODE LIKE ? UNION ALL SELECT PC_CODE,PC_DESC FROM PM_CODES WHERE " +
			"PC_TYPE  = 'IL_FOR_MAP' AND NVL(PC_FRZ_FLAG,'N') = 'N' AND ? = 'FRM' AND " +
			"PC_CODE LIKE ? UNION ALL SELECT PC_CODE,PC_DESC FROM PM_CODES WHERE " +
			"PC_TYPE  = 'IL_FACTORS' AND NVL(PC_FRZ_FLAG,'N') = 'N' AND ? = 'FTR' AND " +
			"PC_CODE LIKE ? UNION ALL SELECT CGH_GROUP_CODE,CGH_DESC FROM PM_IL_CVR_GROUP_HDR " +
			"WHERE ? = 'CG' AND CGH_GROUP_CODE LIKE ? UNION ALL SELECT PC_CODE, PC_DESC FROM PM_CODES " +
			"WHERE PC_TYPE = 'IL_CHARGE'AND NVL(PC_FRZ_FLAG, 'N') = 'N' AND ? IN ('C','QC') AND PC_CODE LIKE ? "; */ 
	
	
	
		
}
