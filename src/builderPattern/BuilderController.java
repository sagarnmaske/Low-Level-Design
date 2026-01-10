package builderPattern;

public class BuilderController {
    public void createRequest(){
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setRequestBody("body");
        httpRequestBuilder.setParams("key");
        httpRequestBuilder.setHttpMethod("Get");
        httpRequestBuilder.setUrl("xyz.com");
        System.out.println(httpRequestBuilder);
        httpRequestBuilder.setHeader("default Headers");
        HttpRequest httpRequest = httpRequestBuilder.build();
        System.out.println(httpRequest);
    }
}
