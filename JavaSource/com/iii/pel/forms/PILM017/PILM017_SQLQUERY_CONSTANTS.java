package com.iii.pel.forms.PILM017;

public interface PILM017_SQLQUERY_CONSTANTS {
	
	final String DELETE_PM_IL_JL_AGE_FACTOR="DELETE * FROM DELETE_PM_IL_JL_AGE_FACTOR WHERE ROWID ?";
	final String UPDATE_PM_IL_JL_AGE_FACTOR="UPDATE * FROM DELETE_PM_IL_JL_AGE_FACTOR WHERE ROWID ?";
	final String SELECT_ALL_PM_IL_JL_AGE_FACTOR="SELECT PM_IL_JL_AGE_FACTOR.ROWID,JAF_DIFF_AGE_FROM,JAF_DIFF_AGE_TO,JAF_AGE_FACTOR,JAF_EFF_FM_DT,JAF_EFF_TO_DT FROM PM_IL_JL_AGE_FACTOR";
	}
