<%@ page pageEncoding="UTF-8"%>
<!-- jsp文件格式编码 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!-- 浏览器显示编码 -->
<html>
<head>
<title>Home</title>
<META http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 浏览器输入编码 -->

<!-- jquery and jquery ui -->
<link type="text/css"
	href="resources/jqueryui/css/hot-sneaks/jquery-ui-1.8.20.custom.css"
	rel="stylesheet" />
<script type="text/javascript"
	src="resources/jqueryui/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript"
	src="resources/jqueryui/js/jquery-ui-1.8.20.custom.min.js"></script>
<!-- highchaets -->
<script src="resources/highcharts/js/highcharts.js"></script>
<script src="resources/highcharts/js/modules/exporting.js"></script>
<script type="text/javascript">

	$(document)
			.ready(
					function() {
						var colors = [ '#4572A7', '#AA4643', '#89A54E',
								'#80699B', '#3D96AE', '#DB843D', '#92A8CD',
								'#A47D7C', '#B5CA92' ]

						var chart;
						var createGongtuChart = function(container, gongtudata,
								jh, date) {

							chart = new Highcharts.Chart({
								chart : {
									renderTo : container,
									type : 'spline',
									//  inverted: true,
									width : 500,
									style : {
										margin : '0 auto'
									}
								},
								title : {
									text : "丼号:" + jh
								},
								subtitle : {
									text : "时间:" + date
								},
								xAxis : {
									allowDecimals : true,
									title : {
										enabled : true,
										text : '位移(m)'
									},
									labels : {
										formatter : function() {
											return this.value;
										}
									},
									maxPadding : 0.05,
									showLastLabel : true
								},
								yAxis : {
									title : {
										text : '负荷(kN)'
									},
									labels : {
										formatter : function() {
											return this.value;
										}
									},
									lineWidth : 1
								},
								legend : {
									enabled : true
								},
								tooltip : {
									formatter : function() {
										return '' + this.x + ' m: ' + this.y
												+ 'kN';
									}
								},
								plotOptions : {
									series : {
										marker : {
											enabled : false
										}
									}
								},
								series : gongtudata
							});
						}

						$(".getData")
								.click(
										function() {

											var charts;
											var name;
											var date;
											if (this.id == "getleft") {
												charts = "chartsleft";
												name = $("#name").val();
												date = $("#date").val();
											} else {
												charts = "chartsright";
												name = $("#name1").val();
												date = $("#date1").val();
											}

											//ajax 请求功图数据 以json格式
											$("#" + charts).html("");

											$
													.getJSON(
															"gongtu?name="
																	+ name
																	+ "&date="
																	+ date,

															function(gongtudata) {
																var length = gongtudata.length;

																var data = [];

																if (length > 0) {

																	var chartContainerID = charts
																			+ gongtudata[0].ID;
																	var chartHtml = "<div id='"+chartContainerID+"' style='min-width: 400px; height: 400px; margin: 0 auto'></div>"
																	$(
																			"#"
																					+ charts)
																			.append(
																					chartHtml);

																	for ( var i = 0; i < length; i++) {
																		data[i] = {
																			name : gongtudata[i].cssj,
																			data : gongtudata[i].sgtData
																		}

																		var detail = "<div style='margin-left:160px;color:"+colors[i]+"'>"
																				+ gongtudata[i].csrq
																				+ " "
																				+ gongtudata[i].cssj
																				+ "<br>"
																				+ "<b>冲次</b> :"
																				+ gongtudata[i].cc
																				+ " (1/min)"
																				+ "	<br><b>冲程</b> :"
																				+ gongtudata[i].cc1
																				+ " (m)"
																				+ "  <br><b>最小载荷</b> :"
																				+ gongtudata[i].zxzh
																				+ "  (kN)"
																				+ "	<br><b>最大载荷</b>  :"
																				+ gongtudata[i].zdzh
																				+ " (kN)<br>"
																				+ "</div><br>";

																		$(
																				"#"
																						+ charts)
																				.append(
																						detail);

																	}

																	createGongtuChart(
																			chartContainerID,
																			data,
																			gongtudata[0].jh,
																			gongtudata[0].csrq);

																}
															}

													);

										})

					});
</script>
</head>
<body>

	<h1>功图示例 !</h1>
	<P>当前时间 ${serverTime}.</P>
	<div id="first" style='float: left; min-width: 360px; margin: 0 0 0 40'>
		丼号：<input type="text" id="name" name="name" value="3310x12" /> 日期：<input
			type="text" id="date" name="date" value="2011-06-17" />
		<button id="getleft" class="getData">查询</button>

		<div id="chartsleft"></div>
	</div>

	<div id="first" style='float: left; min-width: 360px; margin: 0 0 0 40'>
		丼号：<input type="text" id="name1" name="name1" value="105-3" /> 日期：<input
			type="text" id="date1" name="date1" value="2011-06-21" />
		<button id="getright" class="getData">查询</button>

		<div id="chartsright"></div>
	</div>
</body>
</html>
