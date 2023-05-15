<?php
  $location = $_POST['Locatie'];
  $date = $_POST['Data'];
	$email_from = 'danut.lup2002@gmail.com';

	$email_subject = "New Form submission";

	$email_body = "You need to delivery a car to "$location " on "$date.

  $to = "yourname@yourwebsite.com";

  $headers = "From: $email_from \r\n";

  $headers .= "Reply-To: $visitor_email \r\n";

  mail($to,$email_subject,$email_body,$headers);

 ?>