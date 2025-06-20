package com.hscoderadar.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = {
    "com.hscoderadar.domain.users.repository",
    "com.hscoderadar.domain.bookmarks.repository",
    "com.hscoderadar.domain.hscode.repository",
    "com.hscoderadar.domain.news.repository",
    "com.hscoderadar.domain.feeds.repository",
    "com.hscoderadar.domain.notifications.repository",
    "com.hscoderadar.domain.system.repository"
})
@EnableTransactionManagement
public class JpaConfig {

  // JPA 관련 추가 설정이 필요한 경우 여기에 Bean 정의
}