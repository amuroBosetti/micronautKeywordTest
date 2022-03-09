package repository;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import model.Race;
import model.SomethingInstrument;
import org.junit.jupiter.api.Test;

@MicronautTest
public class RepositoryTest {

    @Inject
    private HeroRepository repository;
    @Inject
    private RaceRepository raceRepository;
    @Inject
    private SomethingInstrumentRepository somethingInstrumentRepository;

    @Test
    void xxx() {
        Race race = new Race("dragon");
        raceRepository.save(race);
        SomethingInstrument somethingInstrument = new SomethingInstrument("AL30");
        somethingInstrumentRepository.save(somethingInstrument);

        repository.findByRaceAndSomethingInstrument(race, somethingInstrument);
    }
}
