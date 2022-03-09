package repository;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import model.Race;
import model.SomethingIstrument;
import org.junit.jupiter.api.Test;

import java.util.Properties;

@MicronautTest
public class RepositoryTest {

    @Inject
    private HeroRepository repository;
    @Inject
    private RaceRepository raceRepository;
    @Inject
    private SomethingIstrumentRepository somethingIstrumentRepository;

    @Test
    void xxx() {
        Race race = new Race("dragon");
        raceRepository.save(race);
        SomethingIstrument somethingIstrument = new SomethingIstrument("AL30");
        somethingIstrumentRepository.save(somethingIstrument);

        repository.findByRaceAndSomethingIstrument(race, somethingIstrument);
    }
}
