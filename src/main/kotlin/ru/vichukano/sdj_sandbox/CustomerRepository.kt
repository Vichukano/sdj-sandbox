package ru.vichukano.sdj_sandbox

import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long> {

    fun findCustomerById(id: Long): Customer?

    fun findCustomersByIdIn(ids: List<Long>): List<Customer>

}