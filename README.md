# hello-oauth
Simple oauth server

## Usage

### Use Docker Image
```
docker run -p 9999:9999 furikuri/oauth
```

### Run server
```
./gradlew bootRun
```

### Call
```
http://localhost:9999/uaa/oauth/authorize?response_type=code&client_id=acme&redirect_uri=http://furikuri.net
```

```
$ curl acme:acmesecret@localhost:9999/uaa/oauth/token  \
-d grant_type=authorization_code -d client_id=acme     \
-d redirect_uri=http://example.com -d code=<code-from-url>

$ TOKEN=<access-token>
$ curl -H "Authorization: Bearer $TOKEN" localhost:9999/uaa/user
```
