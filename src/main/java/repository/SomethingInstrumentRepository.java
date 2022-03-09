package repository;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;
import model.SomethingInstrument;

@JdbcRepository(dialect = Dialect.POSTGRES)
public interface SomethingInstrumentRepository extends CrudRepository<SomethingInstrument, Long> {
}
