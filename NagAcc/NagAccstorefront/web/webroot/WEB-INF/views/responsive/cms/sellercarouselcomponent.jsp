<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>


<div class="slider_component simple-banner">
    <div id="homepage_slider" class="svw" style="padding:20px">
      <ul>
         <c:forEach items="${banner}" var="ban" varStatus="status">
               <li>
               <img src="${ban.sellerBanner.url}" width="800px">
            </li>
            </c:forEach>
      </ul>
   </div>
</div>