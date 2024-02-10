package com.iii.pel.forms.PILM035_APAC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.iii.apps.persistence.CRUDHandler;
import com.iii.apps.persistence.OracleParameter;
import com.iii.apps.persistence.OracleProcedureHandler;
import com.iii.premia.common.constants.PELConstants;
import com.iii.premia.common.errorUtil.Messages;
import com.iii.premia.common.exception.DBException;
import com.iii.premia.common.utils.CommonUtils;

public class PM_IL_PROD_APPL_COVER_1_HELPER {


	public void WHEN_NEW_BLOCK_INSTANCE(
			PILM035_APAC_COMPOSITE_ACTION compositeAction)throws Exception {
		PM_IL_PRODUCT pm_il_product_bean = compositeAction
				.getPM_IL_PRODUCT_ACTION_BEAN().getPM_IL_PRODUCT_BEAN();
		try {
			if ("1".equalsIgnoreCase(pm_il_product_bean
					.getPROD_BROK_CALC_MTHD())
					|| "5".equalsIgnoreCase(pm_il_product_bean
							.getPROD_BROK_CALC_MTHD())) {
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_BCH_CODE().setDisabled(false);
			} else {
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_BCH_CODE().setDisabled(true);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void WHEN_CREATE_RECORD(PILM035_APAC_COMPOSITE_ACTION compositeAction)
														throws Exception{
		PM_IL_PROD_APPL_COVER_1 pm_il_prod_appl_cover_1_bean = compositeAction
				.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
				.getPM_IL_PROD_APPL_COVER_1_BEAN();
		PM_IL_PROD_APPL_COVER pm_il_prod_appl_cover_bean = compositeAction
				.getPM_IL_PROD_APPL_COVER_ACTION_BEAN()
				.getPM_IL_PROD_APPL_COVER_BEAN();
		PM_IL_PRODUCT pm_il_product_bean = compositeAction
				.getPM_IL_PRODUCT_ACTION_BEAN().getPM_IL_PRODUCT_BEAN();
		try {
			pm_il_prod_appl_cover_1_bean.setPAC_MANDATORY_YN("Y");
			pm_il_prod_appl_cover_1_bean.setPAC_DEFAULT_YN("Y");
			pm_il_prod_appl_cover_1_bean.setPAC_TARIFF_TERM_FLAG("1");
			pm_il_prod_appl_cover_1_bean.setPAC_PRODUCTION_PERC(100.0);
			pm_il_prod_appl_cover_1_bean.setPAC_THRESHOLD_PERC(100.0);
			pm_il_prod_appl_cover_1_bean.setPAC_GRP_THRESHOLD_PERC(100.0);

			pm_il_prod_appl_cover_1_bean
					.setPAC_PERIOD(pm_il_prod_appl_cover_bean.getPAC_PERIOD());
			pm_il_prod_appl_cover_1_bean
					.setPAC_PREM_PAY_YRS(pm_il_prod_appl_cover_bean
							.getPAC_PREM_PAY_YRS());
			pm_il_prod_appl_cover_1_bean
					.setPAC_MAX_AGE_ON_MAT(pm_il_prod_appl_cover_bean
							.getPAC_MAX_AGE_ON_MAT());
			pm_il_prod_appl_cover_1_bean.setPAC_COVER_ASSR_TYPE("R");
			if ("1".equalsIgnoreCase(pm_il_product_bean
					.getPROD_BROK_CALC_MTHD())
					|| "5".equalsIgnoreCase(pm_il_product_bean
							.getPROD_BROK_CALC_MTHD())) {
				pm_il_prod_appl_cover_1_bean.setPAC_BCH_CODE(pm_il_product_bean
						.getPROD_BCH_CODE());
				pm_il_prod_appl_cover_1_bean
						.setUI_M_PAC_BCH_CODE_DESC(pm_il_product_bean
								.getPROD_BCH_CODE_DESC());
			}
			pm_il_prod_appl_cover_1_bean.setPAC_BCH_TERM("2");
			compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
					.getCOMP_PAC_DEFAULT_YN().setDisabled(true);
			pm_il_prod_appl_cover_1_bean.setPAC_COVER_START_AGE_VAL_YN("N");
			pm_il_prod_appl_cover_1_bean.setPAC_AGE_BASIS("R");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void PRE_INSERT(PILM035_APAC_COMPOSITE_ACTION compositeAction)throws Exception {
		PM_IL_PROD_APPL_COVER_1 pm_il_prod_appl_cover_1_bean = compositeAction
				.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
				.getPM_IL_PROD_APPL_COVER_1_BEAN();
		PM_IL_PROD_APPL_COVER pm_il_prod_appl_cover_bean = compositeAction
		.getPM_IL_PROD_APPL_COVER_ACTION_BEAN()
		.getPM_IL_PROD_APPL_COVER_BEAN();
		PM_IL_PRODUCT pm_il_product_bean = compositeAction
		.getPM_IL_PRODUCT_ACTION_BEAN().getPM_IL_PRODUCT_BEAN();
		try {
			L_VAL_COVER_UNIQUE_1(compositeAction);
			L_VAL_WOP_COVER_UNIQUE(compositeAction,
					pm_il_prod_appl_cover_1_bean.getPAC_COVER_CODE());
			pm_il_prod_appl_cover_1_bean.setPAC_COVER_CODE(pm_il_prod_appl_cover_bean.getPAC_COVER_CODE());
			pm_il_prod_appl_cover_1_bean.setPAC_PROD_CODE(pm_il_product_bean.getPROD_CODE());
			pm_il_prod_appl_cover_1_bean.setPAC_CR_DT(new CommonUtils()
					.getCurrentSQLDate());
			pm_il_prod_appl_cover_1_bean.setPAC_CR_UID(CommonUtils
					.getControlBean().getM_USER_ID());
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void PRE_UPDATE(PILM035_APAC_COMPOSITE_ACTION compositeAction)
			throws Exception {
		String M_DUMMY = null;
		Connection con = null;
		CRUDHandler handler = new CRUDHandler();
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		String M_COVER_CLASS = null;

		PM_IL_PRODUCT pm_il_product_bean = compositeAction
				.getPM_IL_PRODUCT_ACTION_BEAN().getPM_IL_PRODUCT_BEAN();

		PM_IL_PROD_APPL_COVER_1 pm_il_prod_appl_cover_1_bean = compositeAction
				.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
				.getPM_IL_PROD_APPL_COVER_1_BEAN();

		String c1 = "SELECT 'X'FROM   PM_IL_PROD_APPL_COVER,PM_IL_COVER WHERE  "
				+ "PAC_PROD_CODE  = ? AND "
				+ "PAC_COVER_CODE = COVER_CODE  AND    COVER_CLASS='W' "
				+ "AND PM_IL_PROD_APPL_COVER.ROWID != ? AND PAC_DEFAULT_YN='Y'";

		String c2 = "SELECT COVER_CLASS FROM   PM_IL_COVER WHERE  COVER_CODE=?";

		try {

			con = CommonUtils.getConnection();

			pm_il_prod_appl_cover_1_bean.setPAC_UPD_DT(new CommonUtils()
					.getCurrentSQLDate());
			pm_il_prod_appl_cover_1_bean.setPAC_UPD_UID(CommonUtils
					.getControlBean().getUSER_ID());
			L_VAL_COVER_UNIQUE_1(compositeAction);

			Object[] c1values = { pm_il_product_bean.getPROD_CODE(),
					pm_il_prod_appl_cover_1_bean.getROWID() };
			rs1 = handler.executeSelectStatement(c1, con, c1values);
			while (rs1.next()) {
				M_DUMMY = rs1.getString(1);

			}
			if (M_DUMMY != null) {
				Object[] c2values = { pm_il_prod_appl_cover_1_bean
						.getPAC_COVER_CODE() };

				rs2 = handler.executeSelectStatement(c2, con, c2values);
				while (rs2.next()) {
					M_COVER_CLASS = rs2.getString(1);
				}
			}

			if ((("W".equalsIgnoreCase(CommonUtils.nvl(M_COVER_CLASS, "X"))) && ("Y"
					.equalsIgnoreCase(pm_il_prod_appl_cover_1_bean
							.getPAC_DEFAULT_YN())))) {
				throw new Exception(Messages.getString(
						PELConstants.pelErrorMessagePath, "91407"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} catch (DBException e) {
			e.printStackTrace();
			throw e;
		} finally {
			try {
				CommonUtils.closeCursor(rs1);
				CommonUtils.closeCursor(rs2);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public void POST_QUERY(PILM035_APAC_COMPOSITE_ACTION compositeAction)
			throws Exception {
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		ResultSet rs3 = null;
		ResultSet rs4 = null;
		ResultSet rs5 = null;
		Connection con = null;
		CRUDHandler handler = new CRUDHandler();
		String M_DUMMY = null;
		String M_PAC_BCH_CODE_DESC = null;
		String M_COVER_CLASS = null;
		String M_COVER_SA_CALC = null;
		String M_COVER_SA_CALC_1 = null;

		PM_IL_PROD_APPL_COVER_1 pm_il_prod_appl_cover_1_bean = compositeAction
				.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
				.getPM_IL_PROD_APPL_COVER_1_BEAN();
		DUMMY dummy_bean = compositeAction.getDUMMY_ACTION_BEAN()
				.getDUMMY_BEAN();
		PM_IL_PRODUCT pm_il_product_bean = compositeAction
				.getPM_IL_PRODUCT_ACTION_BEAN().getPM_IL_PRODUCT_BEAN();
		PM_IL_PROD_APPL_COVER pm_il_prod_appl_cover_bean = compositeAction
				.getPM_IL_PROD_APPL_COVER_ACTION_BEAN()
				.getPM_IL_PROD_APPL_COVER_BEAN();
		P_VAL_COVER_1(pm_il_prod_appl_cover_bean
				.getPAC_COVER_CODE(), pm_il_prod_appl_cover_1_bean
				.getUI_M_PAC_COVER_CODE_DESC(), "N", "N");

		String c1 = "SELECT 'X'  FROM   PT_IL_POL_ADDL_COVER,PT_IL_POLICY WHERE  POAC_COVER_CODE = ? AND "
				+ "POAC_POL_SYS_ID = POL_SYS_ID AND  POL_PROD_CODE = ? ";
		String c2 = "SELECT BCH_DESC FROM   PM_BROKER_COMM_HDR WHERE  BCH_CODE = ? ";
		String c3 = "SELECT COVER_CLASS,NVL(COVER_SA_CALC,'X') FROM   PM_IL_COVER WHERE  COVER_CODE = ? ";
		String c4 = "SELECT NVL(COVER_SA_CALC,'X') FROM   PM_IL_COVER WHERE  COVER_CODE = ? ";
		String c5 = " SELECT COVER_DESC FROM PM_IL_COVER WHERE COVER_CODE = ? ";
		try {
			con = CommonUtils.getConnection();
			Object[] c1values = {
					pm_il_prod_appl_cover_1_bean.getPAC_COVER_CODE(),
					pm_il_product_bean.getPROD_CODE() };
			rs1 = handler.executeSelectStatement(c1, con, c1values);
			while (rs1.next()) {
				M_DUMMY = rs1.getString(1);
			}

			Object[] c2values = { pm_il_prod_appl_cover_1_bean
					.getPAC_BCH_CODE() };
			rs2 = handler.executeSelectStatement(c2, con, c2values);
			while (rs2.next()) {
				M_PAC_BCH_CODE_DESC = rs2.getString(1);
				pm_il_prod_appl_cover_1_bean.setUI_M_PAC_BCH_CODE_DESC(M_PAC_BCH_CODE_DESC);
				
			}
			if ((pm_il_product_bean.getPROD_BROK_CALC_MTHD().equals(1))
					&& (pm_il_product_bean.getPROD_BROK_CALC_MTHD().equals(5))) {

				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_BCH_CODE().setDisabled(false);
			} else {
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_BCH_CODE().setDisabled(true);

			}
			Object[] c3values = { pm_il_prod_appl_cover_1_bean
					.getPAC_COVER_CODE() };
			rs3 = handler.executeSelectStatement(c3, con, c3values);
			while (rs3.next()) {
				M_COVER_CLASS = rs3.getString(1);
				M_COVER_SA_CALC = rs3.getString(2);
			}
			Object[] c4values = { pm_il_product_bean.getPROD_PLAN_CODE() };
			rs4 = handler.executeSelectStatement(c4, con, c4values);
			while (rs4.next()) {
				M_COVER_SA_CALC_1 = rs4.getString(1);
			}
			rs5=handler.executeSelectStatement(c5, con, new Object[]{pm_il_prod_appl_cover_1_bean.getPAC_COVER_CODE()});
			if(rs5.next()){
				pm_il_prod_appl_cover_1_bean.setUI_M_PAC_COVER_CODE_DESC(rs5.getString(1));
			}
			if (("M".equalsIgnoreCase(M_COVER_CLASS))
					|| ((("D".equalsIgnoreCase(M_COVER_SA_CALC_1) || "H"
							.equalsIgnoreCase(M_COVER_SA_CALC_1)) && ("G"
							.equalsIgnoreCase(M_COVER_SA_CALC))))) {

				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MED_DAYS().setDisabled(false);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MED_DAYS().setRequired(true);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MED_AMT().setDisabled(false);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MED_AMT().setRequired(true);
				/*compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_SA_FACTOR().setDisabled(false);*/
			}
			if ("H".equalsIgnoreCase(M_COVER_SA_CALC_1)) {
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_SA_ADD_FACTOR().setDisabled(false);
			} else {
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MED_DAYS().setDisabled(true);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MED_DAYS().setRequired(false);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MED_AMT().setDisabled(true);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MED_AMT().setRequired(false);

			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			try {
				CommonUtils.closeCursor(rs1);
				CommonUtils.closeCursor(rs2);
				CommonUtils.closeCursor(rs3);
				CommonUtils.closeCursor(rs4);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void L_VAL_WOP_COVER_UNIQUE(
			PILM035_APAC_COMPOSITE_ACTION compositeAction, String P_COVER_CODE)
			throws Exception {
		PM_IL_PRODUCT pm_il_product_bean = compositeAction
				.getPM_IL_PRODUCT_ACTION_BEAN().getPM_IL_PRODUCT_BEAN();
		Connection con = null;
		CRUDHandler handler = new CRUDHandler();
		ResultSet rs2 = null;
		ResultSet rs1 = null;
		String M_DUMMY = null;
		String M_COVER_CLASS = null;
		String C1 = "SELECT 'X'  FROM   PM_IL_PROD_APPL_COVER,PM_IL_COVER  WHERE PAC_PROD_CODE = ? AND "
				+ "PAC_COVER_CODE = ? AND  COVER_CLASS='W'";

		String C2 = "SELECT COVER_CLASS  FROM   PM_IL_COVER  WHERE COVER_CODE = P_COVER_CODE";
		try {
			con = CommonUtils.getConnection();
			Object[] c1values = { pm_il_product_bean.getPROD_CODE(),P_COVER_CODE};
			rs1 = handler.executeSelectStatement(C1, con, c1values);

			while (rs1.next()) {
				M_DUMMY = rs1.getString(1);
			}
			if (M_DUMMY != null) {
				rs2 = handler.executeSelectStatement(C2, con);
				while (rs2.next()) {
					M_COVER_CLASS = rs2.getString("COVER_CLASS");
				}
				if ("W".equalsIgnoreCase(M_COVER_CLASS)) {
					throw new Exception(Messages.getString(
							PELConstants.pelErrorMessagePath, "91407"));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} catch (DBException e) {
			e.printStackTrace();
			throw e;
		} finally {
			try {
				CommonUtils.closeCursor(rs1);
				CommonUtils.closeCursor(rs2);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void L_VAL_COVER_UNIQUE_1(
			PILM035_APAC_COMPOSITE_ACTION compositeAction) throws Exception {
		PM_IL_PRODUCT pm_il_product_bean = compositeAction
				.getPM_IL_PRODUCT_ACTION_BEAN().getPM_IL_PRODUCT_BEAN();
		PM_IL_PROD_APPL_COVER_1 pm_il_prod_appl_cover_1_bean = compositeAction
				.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
				.getPM_IL_PROD_APPL_COVER_1_BEAN();
		Connection con = null;
		CRUDHandler handler = new CRUDHandler();
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		String C1 = "SELECT 'X'  FROM   PM_IL_PROD_APPL_COVER  WHERE PAC_PROD_CODE = ? AND "
				+ "PAC_COVER_CODE = ?";

		String C2 = "SELECT 'X'  FROM   PM_IL_PROD_APPL_COVER  WHERE PAC_PROD_CODE = ? AND "
				+ "PAC_COVER_CODE = ? AND  ROWID !=?";
		Object[] c2values = { pm_il_product_bean.getPROD_CODE(),
				pm_il_prod_appl_cover_1_bean.getPAC_COVER_CODE(),
				pm_il_prod_appl_cover_1_bean.getROWID() };

		try {
			con = CommonUtils.getConnection();
			if (pm_il_prod_appl_cover_1_bean.getROWID() == null) {
				Object[] c1values = { pm_il_product_bean.getPROD_CODE(),
						pm_il_prod_appl_cover_1_bean.getPAC_COVER_CODE() };
				rs1 = handler.executeSelectStatement(C1, con, c1values);
				while (rs1.next()) {
					throw new Exception(Messages.getString(
							PELConstants.pelErrorMessagePath, "1502"));
				}
			} else {
				rs2 = handler.executeSelectStatement(C2, con, c2values);
				while (rs2.next()) {
					throw new Exception(Messages.getString(
							PELConstants.pelErrorMessagePath, "1502"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} catch (DBException e) {
			e.printStackTrace();
			throw e;
		} finally {
			try {
				CommonUtils.closeCursor(rs1);
				CommonUtils.closeCursor(rs2);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void WHEN_NEW_RECORD_INSTANCE(
			PILM035_APAC_COMPOSITE_ACTION compositeAction) throws Exception {
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		Connection con = null;
		CRUDHandler handler = new CRUDHandler();
		String M_COVER_SA_CALC_1 = null;
		String M_COVER_SA_CALC = null;
		String M_COVER_CLASS = null;
		PM_IL_PROD_APPL_COVER_1 pm_il_prod_appl_cover_1_bean = compositeAction
				.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
				.getPM_IL_PROD_APPL_COVER_1_BEAN();
		PM_IL_PRODUCT pm_il_product_bean = compositeAction
				.getPM_IL_PRODUCT_ACTION_BEAN().getPM_IL_PRODUCT_BEAN();
		String c1 = "SELECT COVER_CLASS,NVL(COVER_SA_CALC,'X') FROM   PM_IL_COVER WHERE  COVER_CODE = ?";
		String c2 = "SELECT NVL(COVER_SA_CALC,'X') FROM   PM_IL_COVER WHERE  COVER_CODE = ?";
		try {
			con = CommonUtils.getConnection();
			Object[] c1values = { pm_il_prod_appl_cover_1_bean.getPAC_COVER_CODE() };
			rs1 = handler.executeSelectStatement(c1, con, c1values);
			while (rs1.next()) {
				M_COVER_CLASS = rs1.getString(1);
				M_COVER_SA_CALC = rs1.getString(2);
				
			}
			Object[] c2values = { pm_il_product_bean.getPROD_PLAN_CODE() };
			rs2 = handler.executeSelectStatement(c2, con, c2values);
			while(rs2.next()){
				M_COVER_SA_CALC_1 = rs2.getString(1);
			}
			if (("M".equalsIgnoreCase(M_COVER_CLASS))
					|| ((("D".equalsIgnoreCase(M_COVER_SA_CALC_1) || "H"
							.equalsIgnoreCase(M_COVER_SA_CALC_1)) && ("G"
							.equalsIgnoreCase(M_COVER_SA_CALC))))) {

				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MED_DAYS().setDisabled(false);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MED_DAYS().setRequired(true);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MED_AMT().setDisabled(false);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MED_AMT().setRequired(true);
				/*compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_SA_FACTOR().setDisabled(false);*/
				/*compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_SA_FACTOR().setRequired(true);*/
			}
			if ("H".equalsIgnoreCase(M_COVER_SA_CALC_1)) {
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_SA_ADD_FACTOR().setDisabled(false);
			} else {
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MED_DAYS().setDisabled(true);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MED_DAYS().setRequired(false);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MED_AMT().setDisabled(true);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MED_AMT().setRequired(false);
			}
			if ("E".equalsIgnoreCase(pm_il_prod_appl_cover_1_bean
					.getPAC_AGE_BASIS())) {
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MAT_PAYEE_AGE().setRequired(true);
			} else if ("R".equalsIgnoreCase(pm_il_prod_appl_cover_1_bean
					.getPAC_AGE_BASIS())) {
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MAT_PAYER_AGE().setRequired(true);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MAT_PAYEE_AGE().setRequired(true);
			} else if ("M".equalsIgnoreCase(pm_il_prod_appl_cover_1_bean
					.getPAC_AGE_BASIS())) {
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MAT_PAYEE_AGE().setRequired(true);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MAT_PAYER_AGE().setRequired(true);
			}
			if ("Y".equalsIgnoreCase(pm_il_prod_appl_cover_1_bean
					.getPAC_COVER_START_AGE_VAL_YN())) {
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_COVER_START_AGE().setRequired(true);
			} else if ("N".equalsIgnoreCase(pm_il_prod_appl_cover_1_bean
					.getPAC_COVER_START_AGE_VAL_YN())) {
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_COVER_START_AGE().setRequired(false);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} 
		catch (DBException e) {
			e.printStackTrace();
			throw e;
		}
		catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally {
			try {
				CommonUtils.closeCursor(rs1);
				CommonUtils.closeCursor(rs2);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public ArrayList<String> P_VAL_COVER_1(String P_COVER_CODE,
			String P_COVER_DESC, String P_NAME_FLAG, String P_ERR_FLAG)
			throws SQLException, Exception {
		Connection con = null;

		ArrayList<String> returnList;

		try {
			con = CommonUtils.getConnection();
			ArrayList<OracleParameter> parameterList = new ArrayList<OracleParameter>();
			ArrayList<OracleParameter> outputList = new ArrayList<OracleParameter>();
			returnList = new ArrayList<String>();
			OracleParameter param1 = new OracleParameter("in1", "STRING", "IN",
					P_COVER_CODE);
			OracleParameter param2 = new OracleParameter("in out2", "STRING",
					"IN OUT", P_COVER_DESC);
			OracleParameter param3 = new OracleParameter("in3", "STRING", "IN",
					P_NAME_FLAG);
			OracleParameter param4 = new OracleParameter("in4", "STRING", "IN",
					P_ERR_FLAG);
			parameterList.add(param1);
			parameterList.add(param2);
			parameterList.add(param3);
			parameterList.add(param4);
			OracleProcedureHandler procHandler = new OracleProcedureHandler();
			outputList = procHandler.execute(parameterList, con,
					"P_VAL_COVER_1");
			Iterator<OracleParameter> it = outputList.iterator();
			while (it.hasNext()) {
				OracleParameter oracleParameter = it.next();
				System.out.println("Output value:::"
						+ oracleParameter.getValue());
				returnList.add(oracleParameter.getValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return returnList;

	}

	public void WHEN_VALIDATE_ITEM_PAC_COVER_CODE(
			PILM035_APAC_COMPOSITE_ACTION compositeAction, Object currValue)
			throws Exception {
		ResultSet rs = null;
		Connection con = null;
		CRUDHandler handler = new CRUDHandler();
		Date M_COVER_EFF_FM_DT = null;
		Date M_COVER_EFF_TO_DT = null;
		String M_COVER_CLASS = null;
		String M_COVER_SA_CALC = null;
		String PAC_COVER_CODE = (String) currValue;
		DateFormat dateFormatter = null;

		PM_IL_PRODUCT pm_il_product_bean = compositeAction
				.getPM_IL_PRODUCT_ACTION_BEAN().getPM_IL_PRODUCT_BEAN();
		PM_IL_PROD_APPL_COVER_1 pm_il_prod_appl_cover_1_bean = compositeAction
				.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
				.getPM_IL_PROD_APPL_COVER_1_BEAN();

		String c1 = "SELECT NVL(COVER_EFF_FM_DT,SYSDATE) COVER_EFF_FM_DT ,"
				+ "NVL(COVER_EFF_TO_DT,SYSDATE) COVER_EFF_TO_DT ,COVER_CLASS, NVL(COVER_SA_CALC,'X') COVER_SA_CALC "
				+ "FROM   PM_IL_COVER WHERE  COVER_CODE = ?";
		try {
			con = CommonUtils.getConnection();
			Object[] c1values = { (String) currValue };
			rs = handler.executeSelectStatement(c1, con, c1values);

			if (PAC_COVER_CODE != null) {
				while (rs.next()) {
					M_COVER_EFF_FM_DT = rs.getDate("COVER_EFF_FM_DT");
					M_COVER_EFF_TO_DT = rs.getDate("COVER_EFF_TO_DT");
					M_COVER_CLASS = rs.getString("COVER_CLASS");
					M_COVER_SA_CALC = rs.getString("COVER_SA_CALC");
				}
			}

			if (((CommonUtils.nvl(pm_il_product_bean.getPROD_EFF_FM_DT(),
					new CommonUtils().getCurrentDate())).after(CommonUtils.nvl(
					M_COVER_EFF_FM_DT, CommonUtils
							.stringToUtilDate("01-JAN-1900"))) && (CommonUtils
					.nvl(pm_il_product_bean.getPROD_EFF_FM_DT(),
							new CommonUtils().getCurrentDate())
					.before(CommonUtils.nvl(M_COVER_EFF_TO_DT, CommonUtils
							.stringToUtilDate("01-JAN-2999")))))
					&& (CommonUtils.nvl(pm_il_product_bean.getPROD_EFF_TO_DT(),
							new CommonUtils().getCurrentDate()))
							.after(CommonUtils
									.nvl(M_COVER_EFF_FM_DT, CommonUtils
											.stringToUtilDate("01-JAN-1900")))
					&& (CommonUtils.nvl(pm_il_product_bean.getPROD_EFF_FM_DT(),
							new CommonUtils().getCurrentDate()))
							.before(CommonUtils
									.nvl(M_COVER_EFF_TO_DT, CommonUtils
											.stringToUtilDate("01-JAN-2999")))) {
				pm_il_prod_appl_cover_1_bean
						.setPAC_COVER_CODE((String) currValue);
				L_VAL_WOP_COVER_UNIQUE(compositeAction,(String)currValue);
				ArrayList<String> coverDesc = null;
				coverDesc = P_VAL_COVER_1((String)currValue,pm_il_prod_appl_cover_1_bean
						.getUI_M_PAC_COVER_CODE_DESC(), "N", "E");
				if(coverDesc.size() > 0 && coverDesc.get(0) != null ){
					pm_il_prod_appl_cover_1_bean.setUI_M_PAC_COVER_CODE_DESC(coverDesc.get(0));
				}
			} else {
				throw new Exception(Messages.getString(
						PELConstants.pelErrorMessagePath, "91065"));
			}

			if ("M".equalsIgnoreCase(M_COVER_CLASS)) {

				compositeAction.getPM_IL_PROD_APPL_COVER_ACTION_BEAN()
						.getCOMP_PAC_MED_DAYS().setDisabled(false);
				compositeAction.getPM_IL_PROD_APPL_COVER_ACTION_BEAN()
						.getCOMP_PAC_MED_DAYS().setRequired(true);
				compositeAction.getPM_IL_PROD_APPL_COVER_ACTION_BEAN()
						.getCOMP_PAC_MED_AMT().setDisabled(false);
				compositeAction.getPM_IL_PROD_APPL_COVER_ACTION_BEAN()
						.getCOMP_PAC_MED_AMT().setRequired(true);
				/*compositeAction.getPM_IL_PROD_APPL_COVER_ACTION_BEAN()
						.getCOMP_PAC_SA_FACTOR().setDisabled(false);*/
			} else {
				compositeAction.getPM_IL_PROD_APPL_COVER_ACTION_BEAN()
						.getCOMP_PAC_MED_DAYS().setDisabled(true);
				compositeAction.getPM_IL_PROD_APPL_COVER_ACTION_BEAN()
						.getCOMP_PAC_MED_DAYS().setRequired(false);
				compositeAction.getPM_IL_PROD_APPL_COVER_ACTION_BEAN()
						.getCOMP_PAC_MED_AMT().setDisabled(true);
				compositeAction.getPM_IL_PROD_APPL_COVER_ACTION_BEAN()
						.getCOMP_PAC_MED_AMT().setRequired(false);
			}
			if (("D".equalsIgnoreCase(M_COVER_SA_CALC))
					|| ("M".equalsIgnoreCase(CommonUtils
							.nvl(M_COVER_CLASS, "X")))) {
				/*compositeAction.getPM_IL_PROD_APPL_COVER_ACTION_BEAN()
						.getCOMP_PAC_SA_FACTOR().setDisabled(false);*/
			} else {
				/*compositeAction.getPM_IL_PROD_APPL_COVER_ACTION_BEAN()
						.getCOMP_PAC_SA_FACTOR().setDisabled(true);*/
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			try {
				CommonUtils.closeCursor(rs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void PRE_DELETE(PILM035_APAC_COMPOSITE_ACTION compositeAction)
			throws Exception {
		Connection con = null;
		ResultSet rs = null;
		CRUDHandler handler = new CRUDHandler();
		String M_DUMMY = null;
		PM_IL_PROD_APPL_COVER_1 pm_il_prod_appl_cover_1_bean = compositeAction
				.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
				.getPM_IL_PROD_APPL_COVER_1_BEAN();
		PM_IL_PRODUCT pm_il_product_bean = compositeAction
				.getPM_IL_PRODUCT_ACTION_BEAN().getPM_IL_PRODUCT_BEAN();
		String c1 = "  SELECT 'X' FROM   PT_IL_POL_ADDL_COVER,PT_IL_POLICY WHERE  POAC_COVER_CODE =? AND"
				+ "POAC_POL_SYS_ID = POL_SYS_ID AND    POL_PROD_CODE = ?";
		Object[] c1values = { pm_il_prod_appl_cover_1_bean.getPAC_COVER_CODE(),
				pm_il_product_bean.getPROD_CODE() };
		rs = handler.executeSelectStatement(c1, con, c1values);
		try {
			if (rs.next()) {
				M_DUMMY = rs.getString(1);
			}
			if (M_DUMMY != null) {
				throw new Exception(Messages.getString(
						PELConstants.pelErrorMessagePath, "91060"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} catch (DBException e) {
			e.printStackTrace();
			throw e;
		} finally {
			try {
				CommonUtils.closeCursor(rs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void WHEN_LIST_CHANGED(
			PILM035_APAC_COMPOSITE_ACTION compositeAction, Object currValue)throws Exception {
		PM_IL_PROD_APPL_COVER_1 pm_il_prod_appl_cover_1_bean = compositeAction
				.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
				.getPM_IL_PROD_APPL_COVER_1_BEAN();
		String PAC_MANDATORY_YN = (String) currValue;
		try {
			if ("Y".equalsIgnoreCase(PAC_MANDATORY_YN)) {
				pm_il_prod_appl_cover_1_bean.setPAC_MANDATORY_YN("Y");
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_DEFAULT_YN().setDisabled(true);
			} else {
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_DEFAULT_YN().setDisabled(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public void WHEN_VALIDATE_ITEM_PAC_PERIOD(
			PILM035_APAC_COMPOSITE_ACTION compositeAction, Object currValue)throws Exception {
		PM_IL_PROD_APPL_COVER_1 pm_il_prod_appl_cover_1_bean = compositeAction
				.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
				.getPM_IL_PROD_APPL_COVER_1_BEAN();
		PM_IL_PROD_APPL_COVER pm_il_prod_appl_cover_bean = compositeAction
				.getPM_IL_PROD_APPL_COVER_ACTION_BEAN()
				.getPM_IL_PROD_APPL_COVER_BEAN();
		PM_IL_PRODUCT pm_il_product_bean = compositeAction
				.getPM_IL_PRODUCT_ACTION_BEAN().getPM_IL_PRODUCT_BEAN();
		Integer PAC_PERIOD = (Integer) currValue;

		try {
			if ((CommonUtils.nvl(PAC_PERIOD, 0) <= 0)
					|| ((null!=PAC_PERIOD&&null!=pm_il_product_bean.getPROD_PERIOD()&&PAC_PERIOD > pm_il_product_bean.getPROD_PERIOD()) || (null!=PAC_PERIOD&&null!=pm_il_prod_appl_cover_bean
							.getPAC_PERIOD()&&PAC_PERIOD > pm_il_prod_appl_cover_bean
							.getPAC_PERIOD()))) {

				throw new Exception(Messages.getString(
						PELConstants.pelErrorMessagePath, "91014",
						new Object[] {
								"Cover Policy term Period ",
								" Greater than 0 ",
								" and Less Than or Equal to "
										+ pm_il_prod_appl_cover_1_bean
												.getPAC_PERIOD() }));

			} else {
				pm_il_prod_appl_cover_1_bean.setPAC_PREM_PAY_YRS(PAC_PERIOD);

			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void WHEN_VALIDATE_ITEM_PAC_PREM_PAY_YRS(
			PILM035_APAC_COMPOSITE_ACTION compositeAction, Object currValue)throws Exception {
		PM_IL_PROD_APPL_COVER_1 pm_il_prod_appl_cover_1_bean = compositeAction
				.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
				.getPM_IL_PROD_APPL_COVER_1_BEAN();

		int PAC_PREM_PAY_YRS = (Integer) currValue;
		try {
			if ((CommonUtils.nvl(PAC_PREM_PAY_YRS, 0) <= 0)
					|| (CommonUtils.nvl(PAC_PREM_PAY_YRS, 0)) > (pm_il_prod_appl_cover_1_bean
							.getPAC_PERIOD())) {
				throw new Exception(Messages.getString(
						PELConstants.pelErrorMessagePath, "91014",
						new Object[] {
								"Cover Premium Paying term Period ",
								" Greater than 0 ",
								" and Less Than or Equal to "
										+ pm_il_prod_appl_cover_1_bean
												.getPAC_PERIOD() }));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void WHEN_VALIDATE_ITEM_PAC_MAX_AGE_ON_MAT(
			PILM035_APAC_COMPOSITE_ACTION compositeAction, Object currValue)throws Exception {
		Integer PAC_MAX_AGE_ON_MAT = (Integer) currValue;
		try {
			if ((CommonUtils.nvl(PAC_MAX_AGE_ON_MAT, 0) <= 0)
					|| ((CommonUtils.nvl(PAC_MAX_AGE_ON_MAT, 0) > (CommonUtils
							.nvl(PAC_MAX_AGE_ON_MAT, 0))))) {

				throw new Exception(Messages.getString(
						PELConstants.pelErrorMessagePath, "91014",
						new Object[] {
								"Maximum Age on Maturity",
								"Greater than 0",
								"and Less Than or Equal to"
										+ CommonUtils
												.nvl(PAC_MAX_AGE_ON_MAT, 0) }));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void WHEN_VALIDATE_ITEM_PAC_BCH_CODE(
			PILM035_APAC_COMPOSITE_ACTION compositeAction, Object currValue)
			throws Exception {

		ResultSet rs = null;
		CRUDHandler handler = new CRUDHandler();
		Connection con = null;
		PM_IL_PROD_APPL_COVER_1 pm_il_prod_appl_cover_1_bean = compositeAction
				.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
				.getPM_IL_PROD_APPL_COVER_1_BEAN();
		String c1 = " SELECT BCH_DESC FROM   PM_BROKER_COMM_HDR  WHERE  BCH_CODE = ?";
		Object[] values = { pm_il_prod_appl_cover_1_bean.getPAC_BCH_CODE() };
		rs = handler.executeSelectStatement(c1, con, values);
		String M_PAC_BCH_CODE_DESC = null;
		String PAC_BCH_CODE = (String) currValue;
		try {
			if (PAC_BCH_CODE != null) {
				M_PAC_BCH_CODE_DESC = rs.getString("M_PAC_BCH_CODE_DESC");
			}
			if (M_PAC_BCH_CODE_DESC != null) {
				pm_il_prod_appl_cover_1_bean
						.setUI_M_PAC_BCH_CODE_DESC(M_PAC_BCH_CODE_DESC);
				throw new Exception(Messages.getString(
						PELConstants.pelErrorMessagePath, "3206",
						new Object[] { "Invalid Commission Code" }));
			} else {
				pm_il_prod_appl_cover_1_bean.setUI_M_PAC_BCH_CODE_DESC(null);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			try {
				CommonUtils.closeCursor(rs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void WHEN_VALIDATE_ITEM_PAC_PRODUCTION_PERC(
			PILM035_APAC_COMPOSITE_ACTION compositeAction, Object currValue)throws Exception {
		Double PAC_PRODUCTION_PERC = (Double) currValue;
		try {
			if (CommonUtils.nvl(PAC_PRODUCTION_PERC, 0) < 0) {
				throw new Exception(Messages.getString(
						PELConstants.pelErrorMessagePath, "60111"));
			}
			if (CommonUtils.nvl(PAC_PRODUCTION_PERC, 0) > 100) {
				throw new Exception(Messages.getString(
						PELConstants.pelErrorMessagePath, "71017"));

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void WHEN_VALIDATE_ITEM_THRESHOLD_PREC(
			PILM035_APAC_COMPOSITE_ACTION compositeAction, Object currValue)throws Exception {
		Double PAC_THRESHOLD_PERC = (Double) currValue;
		try {
			if (CommonUtils.nvl(PAC_THRESHOLD_PERC, 0) < 0) {

				throw new Exception(Messages.getString(
						PELConstants.pelErrorMessagePath, "60111"));
			}
			if (CommonUtils.nvl(PAC_THRESHOLD_PERC, 0) > 100) {
				throw new Exception(Messages.getString(
						PELConstants.pelErrorMessagePath, "71017"));

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void WHEN_VALIDATE_ITEM_PAC_MED_DAYS(
			PILM035_APAC_COMPOSITE_ACTION compositeAction, Object currValue)throws Exception {
		int PAC_MED_DAYS = (Integer) currValue;
		try {
			if (PAC_MED_DAYS <= 0) {
				throw new Exception(Messages.getString(
						PELConstants.pelErrorMessagePath, "71043"));

			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void WHEN_VALIDATE_ITEM_PAC_MED_AMT(
			PILM035_APAC_COMPOSITE_ACTION compositeAction, Object currValue)throws Exception {
		Double PAC_MED_AMT = (Double) currValue;
		try {
			if (PAC_MED_AMT <= 0) {
				throw new Exception(Messages.getString(
						PELConstants.pelErrorMessagePath, "71043"));

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void WHEN_VALIDATE_ITEM_PAC_THRESHOLD_PERC(
			PILM035_APAC_COMPOSITE_ACTION compositeAction, Object currValue)throws Exception {
		Double PAC_THRESHOLD_PERC = (Double) currValue;
		try {
			if (CommonUtils.nvl(PAC_THRESHOLD_PERC, 0) < 0) {

				throw new Exception(Messages.getString(
						PELConstants.pelErrorMessagePath, "60111"));
			}
			if (CommonUtils.nvl(PAC_THRESHOLD_PERC, 0) > 100) {
				throw new Exception(Messages.getString(
						PELConstants.pelErrorMessagePath, "71017"));

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void WHEN_VALIDATE_ITEM_PAC_GRP_THRESHOLD_PERC(
			PILM035_APAC_COMPOSITE_ACTION compositeAction, Object currValue)throws Exception {
		Double PAC_GRP_THRESHOLD_PERC = (Double) currValue;
		try {
			if (CommonUtils.nvl(PAC_GRP_THRESHOLD_PERC, 0) < 0) {
				throw new Exception(Messages.getString(
						PELConstants.pelErrorMessagePath, "60111"));

			}
			if (CommonUtils.nvl(PAC_GRP_THRESHOLD_PERC, 0) > 100) {
				throw new Exception(Messages.getString(
						PELConstants.pelErrorMessagePath, "71017"));

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void WHEN_LIST_CHANGED_PAC_COVER_ASSR_TYPE(
			PILM035_APAC_COMPOSITE_ACTION compositeAction, Object currValue)
			throws Exception {
		Connection con = null;
		CRUDHandler handler = new CRUDHandler();
		ResultSet rs = null;
		PM_IL_PRODUCT pm_il_product_bean = compositeAction
				.getPM_IL_PRODUCT_ACTION_BEAN().getPM_IL_PRODUCT_BEAN();
		PM_IL_PROD_APPL_COVER pm_il_prod_appl_cover_bean = compositeAction
				.getPM_IL_PROD_APPL_COVER_ACTION_BEAN()
				.getPM_IL_PROD_APPL_COVER_BEAN();
		String c1 = "SELECT PAC_COVER_CODE FROM   PM_IL_PROD_APPL_COVER WHERE  PAC_PROD_CODE = ? AND"
				+ "PAC_COVER_CODE = ? AND PAC_COVER_ASSR_TYPE IN('E','R')";
		Object[] c1values = { pm_il_product_bean.getPROD_CODE(),
				pm_il_prod_appl_cover_bean.getPAC_COVER_CODE() };
		rs = handler.executeSelectStatement(c1, con, c1values);
		String c2 = "SELECT PAC_COVER_CODE  FROM   PM_IL_PROD_APPL_COVER  WHERE  PAC_PROD_CODE = ? AND"
				+ "PAC_COVER_CODE = ? AND  PAC_COVER_ASSR_TYPE IN('E','R') AND ROWID <> ?";
		Object[] c2values = { pm_il_product_bean.getPROD_CODE(),
				pm_il_prod_appl_cover_bean.getPAC_COVER_CODE(),
				pm_il_prod_appl_cover_bean.getROWID() };
		rs = handler.executeSelectStatement(c2, con, c2values);
		String M_PAC_COVER_CODE = null;
		String PAC_COVER_ASSR_TYPE = (String) currValue;
		try {
			if ("B".equalsIgnoreCase(PAC_COVER_ASSR_TYPE)) {
				if (pm_il_prod_appl_cover_bean.getROWID() != null) {
					M_PAC_COVER_CODE = rs.getString(1);
				}
				if ("M_PAC_COVER_CODE"
						.equalsIgnoreCase(pm_il_prod_appl_cover_bean
								.getPAC_COVER_CODE())) {

					pm_il_prod_appl_cover_bean.setPAC_COVER_ASSR_TYPE("R");
					throw new Exception(Messages.getString(
							PELConstants.pelErrorMessagePath, "1502"));
				} else {
					if (rs.next()) {
						M_PAC_COVER_CODE = rs.getString(2);

					}
					if ("M_PAC_COVER_CODE"
							.equalsIgnoreCase(pm_il_prod_appl_cover_bean
									.getPAC_COVER_CODE())) {
						pm_il_prod_appl_cover_bean.setPAC_COVER_ASSR_TYPE("R");
						throw new Exception(Messages.getString(
								PELConstants.pelErrorMessagePath, "1502"));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				CommonUtils.closeCursor(rs);
			} catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
		}

	}

	public void WHEN_VALIDATE_ITEM_PAC_COVER_ASSR_TYPE(
			PILM035_APAC_COMPOSITE_ACTION compositeAction, Object currValue)
			throws Exception {
		Connection con = null;
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		String M_PAC_COVER_CODE = null;
		CRUDHandler handler = new CRUDHandler();
		PM_IL_PRODUCT pm_il_product_bean = compositeAction
				.getPM_IL_PRODUCT_ACTION_BEAN().getPM_IL_PRODUCT_BEAN();
		PM_IL_PROD_APPL_COVER pm_il_prod_appl_cover_bean = compositeAction
				.getPM_IL_PROD_APPL_COVER_ACTION_BEAN()
				.getPM_IL_PROD_APPL_COVER_BEAN();
		String C1 = "SELECT PAC_COVER_CODE FROM   PM_IL_PROD_APPL_COVER WHERE  PAC_PROD_CODE  = ?  AND " +
			 "PAC_COVER_CODE = ? AND  PAC_COVER_ASSR_TYPE IN('E','R')";
		String C2 = "SELECT PAC_COVER_CODE  FROM   PM_IL_PROD_APPL_COVER WHERE  PAC_PROD_CODE  = ? AND "
				+ "PAC_COVER_CODE = ? AND PAC_COVER_ASSR_TYPE IN('E','R') AND ROWID <> ? ";
		String PAC_COVER_ASSR_TYPE = (String) currValue;
		try {
			con = CommonUtils.getConnection();
			Object[] c1values = { pm_il_product_bean.getPROD_CODE(),
					pm_il_prod_appl_cover_bean.getPAC_COVER_CODE() };
			rs1 = handler.executeSelectStatement(C1, con, c1values);
			Object[] c2values = { pm_il_product_bean.getPROD_CODE(),
					pm_il_prod_appl_cover_bean.getPAC_COVER_CODE(),
					pm_il_prod_appl_cover_bean.getROWID() };
			rs2 = handler.executeSelectStatement(C2, con, c2values);
			if ("B".equalsIgnoreCase(PAC_COVER_ASSR_TYPE)) {
				if (pm_il_prod_appl_cover_bean.getROWID() != null) {
					M_PAC_COVER_CODE = rs1.getString(1);
				}
				if ("M_PAC_COVER_CODE".equalsIgnoreCase(PAC_COVER_ASSR_TYPE)) {

					pm_il_prod_appl_cover_bean.setPAC_COVER_ASSR_TYPE("R");
					throw new Exception(Messages.getString(
							PELConstants.pelErrorMessagePath, "1502"));
				} else {
					while (rs2.next()) {
						M_PAC_COVER_CODE = rs2.getString(1);

					}
					if ("M_PAC_COVER_CODE"
							.equalsIgnoreCase(pm_il_prod_appl_cover_bean
									.getPAC_COVER_CODE())) {
						pm_il_prod_appl_cover_bean.setPAC_COVER_ASSR_TYPE("R");
						throw new Exception(Messages.getString(
								PELConstants.pelErrorMessagePath, "1502"));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			try {
				CommonUtils.closeCursor(rs1);
				CommonUtils.closeCursor(rs2);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void WHEN_VALIDATE_ITEM_PAC_AGE_BASIS(
			PILM035_APAC_COMPOSITE_ACTION compositeAction, Object currValue)throws Exception {
		PM_IL_PROD_APPL_COVER_1 pm_il_prod_appl_cover_1_bean = compositeAction
				.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
				.getPM_IL_PROD_APPL_COVER_1_BEAN();
		String PAC_AGE_BASIS = (String) currValue;
		try {
			if ("E".equalsIgnoreCase(PAC_AGE_BASIS)) {
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MAT_PAYEE_AGE().setRequired(true);
				pm_il_prod_appl_cover_1_bean.setPAC_MAT_PAYER_AGE(null);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MAT_PAYER_AGE().setRequired(true);
				pm_il_prod_appl_cover_1_bean.setPAC_MAT_PAYEE_AGE(null);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MAT_PAYEE_AGE().setRequired(true);

			} else if ("R".equalsIgnoreCase(PAC_AGE_BASIS)) {
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MAT_PAYER_AGE().setRequired(true);
				pm_il_prod_appl_cover_1_bean.setPAC_MAT_PAYEE_AGE(null);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MAT_PAYEE_AGE().setRequired(true);
			} else if ("M".equalsIgnoreCase(PAC_AGE_BASIS)) {
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MAT_PAYEE_AGE().setRequired(true);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MAT_PAYER_AGE().setRequired(true);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void WHEN_LIST_CHANGED_PAC_AGE_BASIS(
			PILM035_APAC_COMPOSITE_ACTION compositeAction, Object currValue)throws Exception {
		String PAC_AGE_BASIS = null;
		PM_IL_PROD_APPL_COVER_1 pm_il_prod_appl_cover_1_bean = compositeAction
				.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
				.getPM_IL_PROD_APPL_COVER_1_BEAN();
		try {
			if ("E".equalsIgnoreCase(PAC_AGE_BASIS)) {
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MAT_PAYEE_AGE().setRequired(true);
				pm_il_prod_appl_cover_1_bean.setPAC_MAT_PAYER_AGE(null);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MAT_PAYER_AGE().setRequired(true);
				pm_il_prod_appl_cover_1_bean.setPAC_MAT_PAYEE_AGE(null);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MAT_PAYEE_AGE().setRequired(true);

			} else if ("R".equalsIgnoreCase(PAC_AGE_BASIS)) {
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MAT_PAYER_AGE().setRequired(true);
				pm_il_prod_appl_cover_1_bean.setPAC_MAT_PAYEE_AGE(null);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MAT_PAYEE_AGE().setRequired(true);
			} else if ("M".equalsIgnoreCase(PAC_AGE_BASIS)) {
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MAT_PAYEE_AGE().setRequired(true);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_MAT_PAYER_AGE().setRequired(true);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void WHEN_VALIDATE_ITEM_PAC_COVER_START_AGE_VAL_YN(
			PILM035_APAC_COMPOSITE_ACTION compositeAction, Object currValue)throws Exception{
		PM_IL_PROD_APPL_COVER_1 pm_il_prod_appl_cover_1_bean = compositeAction
				.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
				.getPM_IL_PROD_APPL_COVER_1_BEAN();
		String PAC_COVER_START_AGE_VAL_YN = (String) currValue;
		try {
			if ("Y".equalsIgnoreCase(PAC_COVER_START_AGE_VAL_YN)) {
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_COVER_START_AGE().setRequired(true);
			} else if ("N".equalsIgnoreCase(PAC_COVER_START_AGE_VAL_YN)) {
				pm_il_prod_appl_cover_1_bean.setPAC_COVER_START_AGE(null);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.getCOMP_PAC_COVER_START_AGE().setRequired(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void WHEN_VALIDATE_ITEM_PAC_COVER_START_AGE(
			PILM035_APAC_COMPOSITE_ACTION compositeAction, Object currValue)throws Exception{
		Double PAC_COVER_START_AGE = (Double) currValue;
		try {
			if (PAC_COVER_START_AGE < 0) {
				throw new Exception(Messages.getString(
						PELConstants.pelErrorMessagePath, "91341"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void WHEN_VALIDATE_ITEM_PAC_MAT_PAYER_AGE(
			PILM035_APAC_COMPOSITE_ACTION compositeAction, Object currValue)throws Exception {
		Double PAC_MAT_PAYER_AGE = (Double) currValue;
		try {
			if (PAC_MAT_PAYER_AGE < 0) {
				throw new Exception(Messages.getString(
						PELConstants.pelErrorMessagePath, "91341"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void WHEN_VALIDATE_ITEM_PAC_MAT_PAYEE_AGE(
			PILM035_APAC_COMPOSITE_ACTION compositeAction, Object currValue)throws Exception{
		Double PAC_MAT_PAYEE_AGE = (Double) currValue;
		try {
			if (PAC_MAT_PAYEE_AGE < 0) {
				throw new Exception(Messages.getString(
						PELConstants.pelErrorMessagePath, "91341"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void executeQuery(PILM035_APAC_COMPOSITE_ACTION compositeAction)
			throws Exception {
		try {
			new PM_IL_PROD_APPL_COVER_1_DELEGATE()
			.executeSelectStatement(compositeAction);
			
			List<PM_IL_PROD_APPL_COVER_1> dataList = compositeAction
					.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
					.getDataList_PM_IL_PROD_APPL_COVER_1();
			if (dataList != null && dataList.size() > 0) {
				PM_IL_PROD_APPL_COVER_1 PM_IL_PROD_APPL_COVER_1_BEAN = dataList
						.get(0);
				PM_IL_PROD_APPL_COVER_1_BEAN.setRowSelected(true);
				compositeAction.getPM_IL_PROD_APPL_COVER_1_ACTION_BEAN()
						.setPM_IL_PROD_APPL_COVER_1_BEAN(
								PM_IL_PROD_APPL_COVER_1_BEAN);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	
}
