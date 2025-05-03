#Kullanılacak Web site: http://zero.webappsecurity.com/login.html
#Username: username
#Password: password

#Test Case 1: Login Functionality
#➢ ZeroBank sitesine gidiniz.
#➢ Username ve password giriniz.
#➢ Giriş yaptığınızı doğrulayın

  Feature: Login Functionally

    Scenario: Login with valid username and password
      Given Navigate to website
      And Enter username that as "username" and password that as "password"
      When Click login button
      Then Verify that iser logged in