package jpa.mycat;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by ssab on 17-1-4.
 */
@EnableJpaRepositories(basePackages = {"jpa.mycat"}, enableDefaultTransactions = false)
@Configuration
public class JpaTransactionConfig {
}
