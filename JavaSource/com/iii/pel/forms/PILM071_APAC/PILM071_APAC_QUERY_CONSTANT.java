package com.iii.pel.forms.PILM071_APAC;

public interface PILM071_APAC_QUERY_CONSTANT {

	String SELECT_PRE_INSERT = " SELECT COUNT(*) FROM  PM_LIFE_ENDT_NUMBER_SETUP";
	String SELECT_PRE_UPDATE = "SELECT COUNT(*) FROM PM_LIFE_ENDT_NUMBER_SETUP WHERE ROWID <> ? ";
	String FETCH_RECORD = "SELECT TBL.ROWID, TBL.* FROM PM_LIFE_ENDT_NUMBER_SETUP TBL  WHERE ROWID =  ? ";
	String FETCH_SEARCH_RECORD = "SELECT TBL.ROWID, TBL.* FROM PM_LIFE_ENDT_NUMBER_SETUP TBL ";

}
