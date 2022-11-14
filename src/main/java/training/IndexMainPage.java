package training;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutionException;
import java.util.stream.Stream;

public class IndexMainPage {

    public long numberOfWord(String word) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://index.hu")).build();
        try {
            return client.sendAsync(request, HttpResponse.BodyHandlers.ofLines())
                    .thenApply(HttpResponse::body)
                    .exceptionally(t -> {
                        t.printStackTrace();
                        return Stream.of("empty");
                    })
                    .thenApply(stream -> stream.filter(s -> s.contains(word)).count())
                    .get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(new IndexMainPage().numberOfWord("rezsi"));
    }
}
