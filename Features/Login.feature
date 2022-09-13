Feature: Login Into Gmail and send mail

Scenario: Login with User Credentials on gmail and send mail

	Given User is able to launch chrome browser 
	When User is able to open  URL with "https://www.gmail.com" 
	And User enters username as "abc@domain.com"
	And Click On Next button 
	And user entrs password As "****" 
	And Click On another Next button 
	And Click on Compose Button 
	And Add receipent As "xyz@domain.com" 
	And write subject As "Incubyte" 
	And write body As "Automation QA test for Incubyte" 
	Then Sent the mail
	
	
 
