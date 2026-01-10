package builderPattern;

public class HttpRequestBuilder {
    String url;
    String header;
    String params;
    String httpMethod;
    String requestBody;

    public HttpRequestBuilder() {

    }

    public HttpRequestBuilder setRequestBody(String requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    public HttpRequestBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    public HttpRequestBuilder setParams(String params) {
        this.params = params;
        return this;
    }

    public HttpRequestBuilder setHeader(String header) {
        this.header = header;
        return this;
    }

    public HttpRequestBuilder setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    public HttpRequest build() {
        return new HttpRequest(this);
    }

    @Override
    public String toString() {
        return "URL:" + this.url + ",Header:" + this.header + ",HttpMethod:" +
                this.httpMethod + ",params:" + this.params + ",RequestBody:" + this.requestBody;
    }

}
