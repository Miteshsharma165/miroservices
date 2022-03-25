<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>

	<c:forEach var="list" items="${postList}">
		<div class="container">
			<div class="row mb-5">
				<div class="col  d-flex justify-content-center m-0">
					<div class="card" style="width: 50rem;">
						<div class="card-body m-0">
							<h5 class="card-title bg-danger text-light">${list.postName}</h5>
							<h6 class="card-subtitle mb-2 text-muted">${list.noOfPost}</h6>
							<p class="card-text">${list.minimumAge}</p>
							<p class="card-text">${list.maximumAge}</p>
							<p class="card-text">${list.eligibility}</p>
							<p class="card-text">${list.shortDiscription}</p>
							<a href="${list.notificationDownloadLink}" class="card-link text-danger">Short Notification</a> 
							<a href="${list.goToOfficialWebsite}" class="card-link text-danger">Official Website</a>
							<a href="${list.applyOnline}" class="card-link text-danger">Apply Online</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</c:forEach>




	<!-- <div class="container">
        <div class="row mb-5">
              <div class="col  d-flex justify-content-center m-0">
            <div class="card" style="width: 50rem;">
        <div class="card-body m-0">
          <h5 class="card-title bg-danger text-light">Join Indian Army Short Service Commission SSC 59th Men & 30th Women Entry Online Form 2022</h5>
          <h6 class="card-subtitle mb-2 text-muted">Total Posts 2003</h6>
          <p  class="card-text"> Age 20 to 27</p>
          <p  class="card-text"> Bachelor Degree in Engineering in Related Trade / Post.
      More Details Read Notification.</p>
          <p class="card-text">Indian Army (Join Indian Army) has released the advertisement of 59 SSC Men & 30 SSC Women Recruitment 2022. Any candidate who wants to appear in this Army Technician Recruitment 2022 and fulfill the eligibility, they can apply online from 08 March 2022 to 06 April 2022. Read the advertisement for 59 SSC Men & 30 SSC Women Technician 2022 Recruitment Qualification, age limit, syllabus, selection procedure and all other information.</p>
          
          <a href="#" class="card-link text-danger">DownLoad Short Notification</a>
          <a href="#" class="card-link text-danger">Official Website Link</a>
          <a href="#" class="card-link text-danger">Appliy Online</a>
        </div>
      </div>
          </div>           
       </div>
       <div class="row mb-5">
        <div class="col  d-flex justify-content-center">
      <div class="card" style="width: 50rem;">
  <div class="card-body">
    <h5 class="card-title">Join Indian Army Short Service Commission SSC 59th Men & 30th Women Entry Online Form 2022</h5>
    <h6 class="card-subtitle mb-2 text-muted">Total Posts 2003</h6>
    <p  class="card-text"> Age 20 to 27</p>
    <p  class="card-text"> Bachelor Degree in Engineering in Related Trade / Post.
More Details Read Notification.</p>
    <p class="card-text">Indian Army (Join Indian Army) has released the advertisement of 59 SSC Men & 30 SSC Women Recruitment 2022. Any candidate who wants to appear in this Army Technician Recruitment 2022 and fulfill the eligibility, they can apply online from 08 March 2022 to 06 April 2022. Read the advertisement for 59 SSC Men & 30 SSC Women Technician 2022 Recruitment Qualification, age limit, syllabus, selection procedure and all other information.</p>
    
    <a href="#" class="card-link">DownLoad Short Notification</a>
    <a href="#" class="card-link">Official Website Link</a>
    <a href="#" class="card-link">Appliy Online</a>
  </div>
</div>
    </div>           
 </div>

       
      </div>

 -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>

</body>
</html>