# User API Spec

## Register User

Endpoint : POST /api/users

Request Body:

```json
{
  "username": "{{username}}",
  "password": "{{password}}",
  "name": "{{name}}"
}
```

Response Body (Success):

```json
{
  "code": 0,
  "message": "OK"
}
```

Response Body (Failed):

```json
{
  "code": {{errorcode}},
  "message": "{{message}}"
}
```

## Login User

Endpoint : POST /api/auth/login

Request Body:

```json
{
  "username": "{{username}}",
  "password": "{{password}}"
}
```

Response Body (Success):

```json
{
  "code": 0,
  "data": {
    "token": "{{TOKEN}}"
  }
}
```

Response Body (Failed):

```json
{
  "code": {{errorcode}},
  "message": "{{message}}"
}
```

## Get User

Endpoint : POST /api/users/current

Request Header:

- X-API-TOKEN : Token (Mandatory)

Response Body (Success):

```json
{
  "code": 0,
  "data": {
    "username": "{{username}}",
    "name": "{{name}}"
  }
}
```

Response Body (Failed):

```json
{
  "code": {{errorcode}},
  "message": "{{message}}"
}
```

## Update User

Endpoint : PATCH /api/users/current

Request Header:

- X-API-TOKEN : Token (Mandatory)

Request Body (Success):

```json
{
  "name": "{{name}}", //put if only want to update name
  "password": "{{password}}" //put if only want to update password
}
```

Response Body (Success):

```json
{
  "code": 0,
  "data": {
    "username": "{{username}}",
    "name": "{{name}}"
  }
}
```

Response Body (Failed):

```json
{
  "code": {{errorcode}},
  "message": "{{message}}"
}
```

## Logout User

Endpoint : DELETE /api/users/current

Request Header:

- X-API-TOKEN : Token (Mandatory)

Response Body (Success):

```json
{
  "code": 0
}
```
