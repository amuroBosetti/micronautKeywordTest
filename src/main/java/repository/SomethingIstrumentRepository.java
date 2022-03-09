package repository;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;
import model.SomethingIstrument;

@JdbcRepository(dialect = Dialect.POSTGRES)
public interface SomethingIstrumentRepository extends CrudRepository<SomethingIstrument, Long> {
}
