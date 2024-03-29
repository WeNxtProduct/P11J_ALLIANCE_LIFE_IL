package com.iii.pel.forms.PILM203;

public interface PM_IL_MED_COVER_CONSTANTS {
	
	String PM_IL_MED_COVER_ROWID = "select ROWID FROM PM_IL_COVER WHERE COVER_CODE=?";
	String PM_IL_MED_COVER_SEARCH_QUERY="select ROWID,PM_IL_COVER.* from PM_IL_COVER where rowid = ?";

	String PM_IL_BNF_PRE_DELETE_QUERY1 = "DELETE FROM PM_IL_BNF_DEDB_LINK P WHERE P.BDL_COVER_CODE = ? and P.BDL_BNF_CODE = ?";
	String PM_IL_BNF_PRE_DELETE_QUERY2 = "DELETE FROM PM_IL_BNF_AGE_SETUP P WHERE P.BAS_COVER_CODE = ? and P.BAS_BNF_CODE = ?";
	String PM_IL_BNF_PRE_DELETE_QUERY3 = "DELETE FROM PM_IL_CVR_SBNF_LINK P WHERE P.BSBL_COVER_CODE = ? and P.BSBL_BNF_CODE = ?";
	
	String PM_IL_SBNF$L_VAL_SBNF_UNIQUE$QUERY1="SELECT ROWID FROM PM_IL_CVR_SBNF_LINK WHERE  BSBL_SBNF_CODE  = ?" +
			" AND    BSBL_BNF_CODE   = ?  AND BSBL_COVER_CODE = ?";
}
