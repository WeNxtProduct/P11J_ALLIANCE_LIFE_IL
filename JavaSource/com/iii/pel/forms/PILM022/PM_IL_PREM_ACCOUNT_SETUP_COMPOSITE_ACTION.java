package com.iii.pel.forms.PILM022;

import com.iii.premia.common.exception.DBException;

public class PM_IL_PREM_ACCOUNT_SETUP_COMPOSITE_ACTION {

	PM_IL_PREM_ACCOUNT_SETUP_ACTION PM_IL_PREM_ACCOUNT_SETUP_ACTION;
	
	public PM_IL_PREM_ACCOUNT_SETUP_COMPOSITE_ACTION() throws DBException{
		PM_IL_PREM_ACCOUNT_SETUP_ACTION = new PM_IL_PREM_ACCOUNT_SETUP_ACTION();
	}

	public PM_IL_PREM_ACCOUNT_SETUP_ACTION getPM_IL_PREM_ACCOUNT_SETUP_ACTION() {
		return PM_IL_PREM_ACCOUNT_SETUP_ACTION;
	}

	public void setPM_IL_PREM_ACCOUNT_SETUP_ACTION(
			PM_IL_PREM_ACCOUNT_SETUP_ACTION pm_il_prem_account_setup_action) {
		PM_IL_PREM_ACCOUNT_SETUP_ACTION = pm_il_prem_account_setup_action;
	}
}
