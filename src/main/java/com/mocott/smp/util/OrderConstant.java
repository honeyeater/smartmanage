package com.mocott.smp.util;

/**
 * Created by xulei on 2018/2/15.
 */
public class OrderConstant {

    // 注入资金订单状态
    public static String Order_First_Pay = "01"; //待支付首付款
    public static String Order_Final_Pay = "02"; //待支付尾款
    public static String Order_Confirm_Period = "03"; //回流中  //保存期
    public static String Order_Period_Finish = "04"; //回流完毕待提取
    public static String Order_Done = "05"; //已完成

    // 提取资金订单状态
    public static String Order_Out_Init = "01" ; //等待处理
    public static String Order_Out_Watting = "02" ; //等待处理
    public static String Order_Out_Done = "03" ; //已处理

    //系统配置项名称
    public static String Sys_First_PayRatio = "PayRatio"; //首付款支付比例

    public static String Sys_Base_Times = "BaseTimes"; //基础倍数
    public static String Sys_Base_Limit = "BaseLimit"; //基础限额
    public static String Rest_Rate = "RestRate"; //利息比例1.0

    public static String Sys_Base_UpTimes = "BaseUpTimes"; //提取基础倍数

    //订单配置时间
    public static String Period_First = "PeriodFirst"; //首付款支付周期(小时)
    public static String Period_Final = "PeriodFinal"; //尾款支付周期(小时)
    public static String Period_Cycle = "PeriodCycle"; //订单周期(小时)
    public static String Period_Save = "PeriodSave"; //订单保存期(小时)

    public static String Period_Draw = "PeriodDraw"; //首付款支付后,默认1天可以提取钱包金额(小时)


    public static String Sum_Limit = "SumLimit"; //钱包限额
}
