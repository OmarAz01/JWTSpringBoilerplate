# JWTSpringBoilerplate

## Description  
  
This is a boilerplate for SpringBoot applications. It's used to quickly get setup for a new application that requires JWT. Includes a basic JWT setup, MySQL integration, and lombok.  
  
Available endpoints are:  
  
- /api/auth/register
  - Accepts email, username, password and registers the user
- /api/auth/authenticate
  - Accepts email and password and authenticates the user returning a JWT if valid
- api/auth/validate
  - Used to validate the token sent in the header returns an updated token or asks the user to login again if token is expired
- /api/auth/logout
  - Used to logout the user, deletes JWT
