package rateLimiter;

public class Client {
    public void sendRequest(RateLimiter rateLimiter) {
        Thread t1 = new Thread(() -> {
            try {
                for (int i = 0; i < 15; i++) {
                    if (rateLimiter.handleRequest("Client 1")) {
                        System.out.println("Client 1 Request Id:" + i + " Allowed");
                    } else {
                        System.out.println("Client 1 Request Id:" + i + " Denied");
                    }
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                for (int i = 0; i < 15; i++) {
                    if (rateLimiter.handleRequest("Client 2")) {
                        System.out.println("Client 2 Request Id:" + i + " Allowed");
                    } else {
                        System.out.println("Client 2 Request Id:" + i + " Denied");
                    }
                    Thread.sleep(500);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

        t1.start();
        t2.start();
    }
}
