# spring-security-6-oauth2
Demo of Spring Security 6 with OAuth2 

To know access token is generated here are steps :
1. Open Postman and create a new GET request.
2. URL: http://localhost:8183/oauth2/authorize
3. Add the following query parameters:
   client_id: demo
   response_type: code
   redirect_uri: http://localhost:8182/login/oauth2/code/reg-client
   scope: user.read
4. Open the Authorization tab, select OAuth 2.0 from the type dropdown, and fill in the fields:
   Type: OAuth 2.0
   Grant Type: Authorization Code
   Callback URL: http://127.0.0.1:8182/login/oauth2/code/reg-client
   Auth URL: http://auth-server:8183/oauth2/authorize
   Access Token URL: http://auth-server:8183/oauth2/token
   Client ID: demo
   Client Secret: secret
   Scope: user.read
   State: 12345
   Client Authentication: Send as Basic Auth Header
5. Click on Get New Access Token. This will redirect you to the login page of the authorization server.
6. Login with the credentials (deep / password).
7. After successful login, Postman will automatically exchange the authorization code for an access token.
8. Access Token:
   After the above steps, you should see the access token in Postman under the Manage Tokens section.
   You can also find the access token in the response returned by the authorization server.
9. Use Access Token to Access Resource Server:
   Create a new GET request in Postman.
   URL: http://localhost:8181/hello
   Open the Authorization tab, select Bearer Token from the type dropdown.
   Copy the access token from the Manage Tokens section and paste it into the Token field.
   Send the request. 
   

