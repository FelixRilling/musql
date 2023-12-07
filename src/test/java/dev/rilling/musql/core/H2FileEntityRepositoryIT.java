package dev.rilling.musql.core;

import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.test.context.ContextConfiguration;

@JdbcTest // Executed with default embedded test database
@ContextConfiguration(classes = {FileEntityRepository.class})
public class H2FileEntityRepositoryIT extends AbstractFileEntityRepositoryIT {
}
