package com.coolead.util;

public class Constant {
	//定义测试网站的常量
	public static final String Url = "http://192.168.1.75:8080/Web/#/login";
    //public static final String Url = "http://192.168.1.38:8080/coolead/#/login";
	//定义用户名的常量
	public static final String username = "cooleadadmin";
	//定义密码常量
	public static final String password = "000000";
	//登录操作校验位
	public static final String assertText = "项目";
	//项目名称常量
	public static final String projectname="西丽湖水库大坝";
	//项目简称常量
	public static final String projectshortname="西丽湖水库大坝";
	//项目金额常量
	public static final String   amount= "3000";
	//街道办常量	
	public static final String community_name="东华门街道办事处";
	//数据库连接地址
	public static final String db_url ="jdbc:mysql://192.168.0.162/em_init";
	//数据库驱动类型
	public static final String db_name="com.mysql.jdbc.Driver"; 
	//数据库帐号
	public static final String db_user = "root";
	//数据库密码
	public static final String db_password = "Szcoolead@2016"; 
	//组织机构名称
	public static final String org_name="新东方";
	public static final String org_shot_name="新东方";
	public static final String org_company="新东方教育集团有限公司";
	public static final String org_owner="司马灰";
	public static final String org_phone="13800138002";	
	public static final String org_comment="自动添加";
	public static final String org_delete_url="//span[contains(text(),'"+Constant.org_name+"')]";
	//新建用户
	public static final String user_name="fishman";
	public static final String real_name ="司马灰";
	public static final String user_company =  "//td[2]/search-box/div/div[2]/div[2]/div/div/ol//span[contains(text(),'" +Constant.org_shot_name+"')]";
	public static final String user_department="//td[4]/search-box/div/div[2]/div[2]/div/div/ol//span[contains(text(),'" +Constant.org_shot_name+"')]";
	//选择要授权的项目
	public static final String project_name="//td[contains(text(),'" + Constant.projectname + "')]";
	//选择组织
	public static final String project_organization="//span[contains(text(),'" + Constant.org_name  +"')]";
    //选择用户复选框
	public static final String user_select="//td[contains(text(),'" + Constant.real_name + "')]/preceding::em[2]";
    //创建项目选择建设单位
	public static final String project_constructor="//div[1]//tbody/tr[3]/td[2]/div/search-box//span[contains(text(),'" +Constant.org_shot_name +"')]";
	//创建项目选择设计单位
	public static final String project_desinger="//*[@id='designUnitId']/div/div[2]/div[2]/div/div/ol//div/div/span[contains(text(),'" + Constant.org_shot_name +"')]";
	//创建项目选择所属部门
	public static final String project_department="//tbody/tr[4]/td[2]/div//div/div/span[contains(text(),'" +Constant.org_shot_name+"')]";
	//创建项目选择监理单位
	public static final String project_supervisor="//div/form/table[1]/tbody/tr[4]/td[4]//div/div/span[contains(text(),'"+ Constant.org_shot_name +"')]";
	//创建项目选择施工单位
	public static final String project_constructor_click="//td[3]/div/search-box/div/div[2]/div[2]/div/div/ol/li[49]/div/div/span[contains(text(),'" + Constant.org_name + "')]";
	//定义时间面板开始时间
	public static final String starte_date="2016-09-18";
	//定义时间面板结束时间
	public static final String end_date="2016-09-18";
	//数据字典类型
	public static final String dictionary_type = "dictionary_type_test";
	//数据字典名称
	public static final String dictionary_name ="dictionary_name_test";
	//数据字典子项代码
	public static final String dictionary_item_code="123";
	//数据字典子项名称
	public static final String dictionary_item_name="123";
	//数据字典子项值
	public static final String dictionary_item_value="123";
	//数据字典子项排序
	public static final String dictionary_item_order="123";
	//服务推送标题
	public static final String service_push_title="push_title_test";
	//服务推送内容
	public static final String service_push_content="push_content_test";
	//创建任务标题
	public static final String task_title="task_title_test";
	//创建任务内容
	public static final String task_content="task_content_test";
	//完成任务输入信息
	public static final String do_task_input ="终于做完了";
	//会议名称
	public static final String meeting_name="2016美国总统大选会议...";
	//会议组织方
	public static final String meeting_organzation="嘉力达节能科技服份有限公司";
	//会议类型
	public static final String meeting_type="专题例会";
	//会议内容
	public static final String meeting_content="下班后留下来。。。";
	//数据字典分包专业代码
	public static final String subject_code="AB";
	//分包专业名称
	public static final String subject_name="安保";
	//专业编码
	public static final String subject_value="1";
	//专业排序号
	public static final String subject_order="1";
	//总控计划补充说明
	public static final String subject_remark="这是一个测试总控计划";	
	//业主单位形象月报描述
	public static final String owner_progress_report_comment="这个月工程进展正常。。。";
	//业主单位形象进度月报退回描述
	public static final String reback_owner_progress_report_comment="测试退回。。。";
}

















