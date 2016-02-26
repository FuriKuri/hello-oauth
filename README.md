# hello-oauth
Simple oauth server

## Installation

### Use docker image
```
docker run -p 9999:9999 furikuri/oauth
```

### Use gradle
```
./gradlew bootRun
```
##

## Usage

### Get code
Use any username. Username == password
```
http://localhost:9999/uaa/oauth/authorize?response_type=code&client_id=acme&redirect_uri=http://furikuri.net
```

### Get and use access token
```
$ curl acme:acmesecret@localhost:9999/uaa/oauth/token  \
-d grant_type=authorization_code -d client_id=acme     \
-d redirect_uri=http://example.com -d code=<code-from-url>

$ TOKEN=<access-token>
$ curl -H "Authorization: Bearer $TOKEN" localhost:9999/uaa/user
```
