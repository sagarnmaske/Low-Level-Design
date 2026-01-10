package builderPattern;

public class HttpRequest {
    private final String url;
    private final String header;
    private final String params;
    private final String httpMethod;
    private final String requestBody;

    public HttpRequest(HttpRequestBuilder httpRequestBuilder) {
        this.url = httpRequestBuilder.url;
        this.header = httpRequestBuilder.header;
        this.httpMethod = httpRequestBuilder.httpMethod;
        this.params = httpRequestBuilder.params;
        this.requestBody = httpRequestBuilder.requestBody;
    }

    @Override
    public String toString() {
        return "URL:" + this.url + ",Header:" + this.header + ",HttpMethod:" +
                this.httpMethod + ",params:" + this.params + ",RequestBody:" + this.requestBody;
    }
}
