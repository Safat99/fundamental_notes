## JWT Token
---
JSON Web Token :
* a compact, URL safe means of representing claims(ownership)
* use to transfer this claims between two parties
* It carries **claims** (informations)
* This claims are encoded as a **JSON object**.

### Structure
---
**Header**.**Payload**.**Signature**
<br>

### Header
Header Contains:
* Algorithm and token-type
* Using HS256(example) algorithm it generates an encoded string.

### Payload
Payload carries claims(information of user to authenticate)
<br>
Claims are physical informations where
* Users information / roles are encoded
* Information of **Token Expiry** are encoded

### Signature
* Signature is computed from
 1. header 
 2. payload and 
 3. A secret string from the developers

* Signature is irreversible
---

### **A legal JWT will be stored in the HttpOnly Cookie**
---
###  What are Cookies
Simply we can call cookies a **Tracker**.
Suppose I enter a website and hit some URLs/links/pages. The cookies will store whicdh APIs are being hit. It can also save infomations from our browser. As a result using this, the ads or others will recommkend me same types of products or others that I have previously visited. Using Cookies users decisions can be manipulated.

## Refresh Token Functionality

steps:

Client  -----> Spring Server

1. Access Token -----[Request with JWT]-----> validate JWT
2. If token is expired, Server will throw Exceptions
3. If token is validated, Server will serve the desired response of the URL.

 client ---[The Refresh Token]------> server

1. Refresh Token ------[Request with JWT] --------> validate JWT
2. If token is verified, Server will return with **new access token**, and **new refresh token**
