package countries;

import java.io.IOException;

public class TestBasicQueries {
    public static void main(String[] args) throws IOException {
        final var repo = new CountryRepository();
        System.out.println(repo);
    }
}
