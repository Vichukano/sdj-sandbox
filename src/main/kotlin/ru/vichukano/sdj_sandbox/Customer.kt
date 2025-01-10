package ru.vichukano.sdj_sandbox

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table(name = "customer")
data class Customer(
    @Id
    val id: Long? = null,
    val name: String,
    val email: String,
)
