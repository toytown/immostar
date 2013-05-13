<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<%@taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>


	<h3>Do Search</h3>


	<div>
		<form:form modelAttribute="searchReq">

			<div class="form">
				<div class="form_row">
					<label class="left">Rooms: </label><input type="text" class="form_input_small" /> <input type="text"
						class="form_input_small" path="roomsTo" />
				</div>
				<div class="form_row">
					<label class="left">Area: </label><input type="text" class="form_input_small" /><input type="text" class="form_input_small"
						path="areaTo" />
				</div>
				<div class="form_row">
					<label class="left">Price: </label><input type="text" class="form_input_small" /><input type="text"
						class="form_input_small" path="priceTo" />
				</div>
				<div class="form_row">
					<ul class="search_options">
						<li><label class="left"><spring:message code="lbl_provision_free" /></label> <input type="checkbox" /></li>
						<li><label class="left"><spring:message code="lbl_kitchen_available" /></label> <input type="checkbox"  /></li>
						<li><label class="left"><spring:message code="lbl_furnished" /></label> <input type="checkbox" /></li>
						<li><label class="left"><spring:message code="lbl_balcon_available" /></label> <input type="checkbox"  /></li>
						<li><label class="left"><spring:message code="lbl_elevator_available" /></label> <input type="checkbox" /></li>
						<li><label class="left"><spring:message code="lbl_garden_available" /></label> <input type="checkbox"  /></li>
					</ul>
				</div>
				<div class="form_row">
					<label class="uiButton uiButtonConfirm"> <input type="submit" value="Search"/>
					</label>
				</div>

			</div>

		</form:form>
	</div>

