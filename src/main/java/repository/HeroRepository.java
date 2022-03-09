package repository;

import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;
import model.Hero;
import model.Race;
import model.SomethingIstrument;

import java.util.Optional;

@JdbcRepository(dialect = Dialect.POSTGRES)
public interface HeroRepository extends CrudRepository<Hero, Long> {

    @Join("race")
    @Join("somethingIstrument")
    Optional<Hero> findByRaceAndSomethingIstrument(Race race, SomethingIstrument somethingIstrument);

}
