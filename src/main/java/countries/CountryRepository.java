package countries;

import base.Repository;

import java.io.IOException;

public final class CountryRepository
        extends Repository<Country> {

    public CountryRepository() throws IOException {
        super(Country.class);
    }
}
