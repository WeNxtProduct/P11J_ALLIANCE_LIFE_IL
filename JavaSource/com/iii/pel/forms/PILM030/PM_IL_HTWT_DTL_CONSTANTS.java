package com.iii.pel.forms.PILM030;

public interface PM_IL_HTWT_DTL_CONSTANTS {
	String htwtRangeQuery="SELECT 'X' " +
    " FROM   PM_IL_HTWT_DTL WHERE  " +
    " (HTWT_HEIGHT_FM BETWEEN ? AND ?"+//:PM_IL_HTWT_DTL.HTWT_HEIGHT_FM " and :PM_IL_HTWT_DTL.HTWT_HEIGHT_TO
    " OR  HTWT_HEIGHT_TO BETWEEN ? AND ?"+//:PM_IL_HTWT_DTL.HTWT_HEIGHT_FM and :PM_IL_HTWT_DTL.HTWT_HEIGHT_TO           
    " OR  ? BETWEEN HTWT_HEIGHT_FM AND  HTWT_HEIGHT_TO"+//:PM_IL_HTWT_DTL.HTWT_HEIGHT_FM
    " OR  ? BETWEEN HTWT_HEIGHT_FM AND  HTWT_HEIGHT_TO)"+//:PM_IL_HTWT_DTL.HTWT_HEIGHT_TO
    " AND ((NVL(HTWT_EFF_FM_DT,'01-JAN-1900') BETWEEN " +
    "              NVL(?,'01-JAN-1900') AND " +//:PM_IL_HTWT_DTL.HTWT_EFF_FM_DT
    "              NVL(?,'31-DEC-2999'))"+//:PM_IL_HTWT_DTL.HTWT_EFF_TO_DT
    " OR   (NVL(HTWT_EFF_TO_DT,'31-DEC-2999') BETWEEN " +
    "      NVL(?,'01-JAN-1900') AND " +//:PM_IL_HTWT_DTL.HTWT_EFF_FM_DT
    "      NVL(?,'31-DEC-2999'))"+//:PM_IL_HTWT_DTL.HTWT_EFF_TO_DT
    " OR   (NVL(?,'01-JAN-1900') BETWEEN " +//:PM_IL_HTWT_DTL.HTWT_EFF_FM_DT
    "            NVL(HTWT_EFF_FM_DT,'01-JAN-1900') AND NVL(HTWT_EFF_TO_DT,'31-DEC-2999'))"+
    " OR   (NVL(?,'31-DEC-2999') BETWEEN " +//:PM_IL_HTWT_DTL.HTWT_EFF_TO_DT
    "         NVL(HTWT_EFF_FM_DT,'01-JAN-1900') AND NVL(HTWT_EFF_TO_DT,'31-DEC-2999')))";
	/*[BugId:PREMIAGDC_GL.10.5-00192 corrected the query. Added by: S.Mallika, Dated: 02-Apr-2009*/
	String htwtRangeQueryCompletionUpdate = " AND   ROWID != ? ";//:PM_IL_HTWT_DTL.ROWID

}
