package ru.vichukano.sdj_sandbox

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.relational.core.mapping.NamingStrategy

@Configuration
class Config {

    @Bean
    fun namingStrategy(
        @Value("\${app.schema.name}") schema: String
    ): NamingStrategy = object : NamingStrategy {
        override fun getSchema(): String {
            return schema
        }
    }
}