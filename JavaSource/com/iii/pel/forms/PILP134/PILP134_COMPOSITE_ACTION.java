package com.iii.pel.forms.PILP134;

import com.iii.pel.forms.PILQ002.PILQ002_PRINT_ACTION;

public class PILP134_COMPOSITE_ACTION {
	
	private CUST_DETL_UPD_ACTION CUST_DETL_UPD_ACTION_BEAN;
	
	
	public CUST_DETL_UPD_ACTION getCUST_DETL_UPD_ACTION_BEAN() {
		return CUST_DETL_UPD_ACTION_BEAN;
	}


	public void setCUST_DETL_UPD_ACTION_BEAN(
			CUST_DETL_UPD_ACTION cUST_DETL_UPD_ACTION_BEAN) {
		CUST_DETL_UPD_ACTION_BEAN = cUST_DETL_UPD_ACTION_BEAN;
	}


	public PILP134_COMPOSITE_ACTION(){
		CUST_DETL_UPD_ACTION_BEAN=new CUST_DETL_UPD_ACTION();
		CUST_DETL_UPD_ACTION_BEAN.compositeAction = this;
		/*ADDED BY GOPI ZBILQC-1733435*/
		PILP134_PRINT_ACTION_BEAN = new PILP134_PRINT_ACTION();
		PILP134_PRINT_ACTION_BEAN.compositeAction = this;
			//end
	}
	/*ADDED BY GOPI ZBILQC-1733435 */
	private PILP134_PRINT_ACTION PILP134_PRINT_ACTION_BEAN;


	public PILP134_PRINT_ACTION getPILP134_PRINT_ACTION_BEAN() {
		return PILP134_PRINT_ACTION_BEAN;
	}


	public void setPILP134_PRINT_ACTION_BEAN(
			PILP134_PRINT_ACTION pILP134_PRINT_ACTION_BEAN) {
		PILP134_PRINT_ACTION_BEAN = pILP134_PRINT_ACTION_BEAN;
	}
	
//END
}
