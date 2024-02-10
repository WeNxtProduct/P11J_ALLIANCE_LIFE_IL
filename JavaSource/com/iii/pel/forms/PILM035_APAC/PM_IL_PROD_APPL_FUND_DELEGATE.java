package com.iii.pel.forms.PILM035_APAC;

import java.sql.Connection;
import java.sql.ResultSet;

import com.iii.apps.persistence.CRUDHandler;
import com.iii.premia.common.utils.CommonUtils;

public class PM_IL_PROD_APPL_FUND_DELEGATE {
	public void executeSelectStatement(
			PILM035_APAC_COMPOSITE_ACTION PILM035_APAC_COMPOSITE_ACTION_BEAN)
			throws Exception {
		String selectStatement = "SELECT ROWID, PM_IL_PROD_APPL_FUND.* FROM PM_IL_PROD_APPL_FUND "
				+ "WHERE PAF_PROD_CODE = ? AND PAF_FUND_DIR_TYPE = 'P' ";
		Connection connection = null;
		ResultSet resultSet = null;
		PILM035_APAC_COMPOSITE_ACTION_BEAN
				.getPM_IL_PROD_APPL_FUND_ACTION_BEAN()
				.getDataList_PM_IL_PROD_APPL_FUND().clear();
		try {
			connection = CommonUtils.getConnection();
			resultSet = new CRUDHandler().executeSelectStatement(
					selectStatement, connection,
					new Object[] { PILM035_APAC_COMPOSITE_ACTION_BEAN
							.getPM_IL_PRODUCT_ACTION_BEAN()
							.getPM_IL_PRODUCT_BEAN().getPROD_CODE() });
			while (resultSet.next()) {
				PM_IL_PROD_APPL_FUND PM_IL_PROD_APPL_FUND_BEAN = new PM_IL_PROD_APPL_FUND();
				PM_IL_PROD_APPL_FUND_BEAN
						.setROWID(resultSet.getString("ROWID"));
				PM_IL_PROD_APPL_FUND_BEAN.setPAF_PROD_CODE(resultSet
						.getString("PAF_PROD_CODE"));
				PM_IL_PROD_APPL_FUND_BEAN.setPAF_FUND_CODE(resultSet
						.getString("PAF_FUND_CODE"));
				PM_IL_PROD_APPL_FUND_BEAN.setPAF_FUND_PERC(resultSet
						.getDouble("PAF_FUND_PERC"));
				PM_IL_PROD_APPL_FUND_BEAN.setPAF_DEFAULT_YN(resultSet
						.getString("PAF_DEFAULT_YN"));
				PM_IL_PROD_APPL_FUND_BEAN.setPAF_CR_DT(resultSet
						.getDate("PAF_CR_DT"));
				PM_IL_PROD_APPL_FUND_BEAN.setPAF_CR_UID(resultSet
						.getString("PAF_CR_UID"));
				PM_IL_PROD_APPL_FUND_BEAN.setPAF_UPD_DT(resultSet
						.getDate("PAF_UPD_DT"));
				PM_IL_PROD_APPL_FUND_BEAN.setPAF_UPD_UID(resultSet
						.getString("PAF_UPD_UID"));
				PM_IL_PROD_APPL_FUND_BEAN.setPAF_FUND_DIR_TYPE(resultSet
						.getString("PAF_FUND_DIR_TYPE"));

				PILM035_APAC_COMPOSITE_ACTION_BEAN
						.getPM_IL_PROD_APPL_FUND_ACTION_BEAN()
						.getDataList_PM_IL_PROD_APPL_FUND().add(
								PM_IL_PROD_APPL_FUND_BEAN);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		finally {
			CommonUtils.closeCursor(resultSet);
		}
	}

}
