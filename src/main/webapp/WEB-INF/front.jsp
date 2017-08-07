<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<div class="caption">
	<h4>职业列表</h4>
</div>

<!-- 用forEach的嵌套将样式发挥出来 -->
<div class="row">
	<!-- 外循环只执行list的长度除以3次 -->
	<c:forEach begin="0" step="1" end="${listLength/3}" varStatus="status">
		<div class="col-md-4 col-sm-6 col-xs-12 top-margin">
			<!-- 每次内循环循环3次,每次从list中相应的下标开始 -->
			<c:forEach begin="${(status.count-1)*3}" step="1" end="${(status.count-1)*3+2}" items="${professionList}" var="profession">
				<!-- 取出来判断该变量是否为空 -->
				<c:if test = "${profession != null}">
					<div class="warp-border">
						<div class="clearfix">
							<div class="icon-people">
								<img src="../view/images/687.png">
							</div>
							<div class="text">
								<h4 class="">${profession.profession}</h4>
								<p class="text-present">${profession.introduction}</p>
							</div>
						</div>

						<div class="warp-class2">
							<div class="warp-class2-text">
								<div class="iconfont text-padding">
									门槛
									<c:forEach begin="1" end="${profession.threshold}" step="1">
										<img src="../view/images/xx.png">
									</c:forEach>
								</div>
							</div>
							<div class="warp-class2-text">
								<div class="iconfont text-padding text-border-left">
									难易程度
									<c:forEach begin="1" end="${profession.level}" step="1">
										<img src="../view/images/xx.png">
									</c:forEach>
								</div>
							</div>
						</div>
						<div class="warp-class2">
							<div class="warp-class2-text">
								<div class="iconfont text-padding">
									成长周期<span class="iconfont-color"> ${profession.cycle}</span>年
								</div>
							</div>
							<div class="warp-class2-text">
								<div class="iconfont text-padding text-border-left">
									稀缺程度 <span class="iconfont-color">${profession.requirement}</span>家公司需要
								</div>
							</div>
						</div>

						<div class="warp-class2">
							<div class="leftWarp">薪资待遇</div>
							<div class="rightWarp">
								<div class="rightWarp-class">
									<div class="rightWarp-year">
										<!-- 0-1年 -->${profession.timeFirst}</div>
									<div class="rightWarp-wages">${profession.salaryFirst }</div>
								</div>
								<div class="rightWarp-class">
									<div class="rightWarp-year">${profession.timeSecond}</div>
									<div class="rightWarp-wages">${profession.salarySecond }</div>
								</div>
								<div class="rightWarp-class border-bottom">
									<div class="rightWarp-year">${profession.timeThird}</div>
									<div class="rightWarp-wages">${profession.salaryThird }</div>
								</div>
							</div>
						</div>

						<div class="warp-class2">
							<b class="text-b">有${profession.number }人正在学</b>
						</div>
						<div class="warp-class2">
							<p class="text-p">${profession.base }</p>
						</div>

						<div class="flip-container">
							<p class="flip-title">iOS工程师</p>
							<p class="flip-text">iOS是由苹果公司开发的移动操作统，iOS与苹果的Mac OS X操作系统一样，
								也是以Darwin为基础的，因此同样属于类Unix的商业操作系统。国内iOS开发起步相对较晚，
								人才培养机制更是远远跟不上市场发展速度。有限的iOS开发人才成了国内企业必争的资源。
								国内iOS开发起步相对较晚，人才培养机制更是远远跟不上市场发展速度。 有限的iOS开发人才成了国内企业必争的资源。</p>
						</div>
					</div>
				</c:if>
			</c:forEach>
		</div>
	</c:forEach>
</div>
