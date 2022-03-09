package repository;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;
import model.Race;

@JdbcRepository(dialect = Dialect.POSTGRES)
public interface RaceRepository extends CrudRepository<Race, Long> {

}
