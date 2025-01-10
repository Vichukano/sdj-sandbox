package ru.vichukano.sdj_sandbox

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.jdbc.core.JdbcAggregateTemplate

@SpringBootTest
class SdjSandboxApplicationTests {
    @Autowired
    private lateinit var repository: CustomerRepository
    @Autowired
    private lateinit var jdbc: JdbcAggregateTemplate

    @Test
    fun shouldSaveAndFindCustomerFromDb() {
        val customer = Customer(
            id = 100700,
            name = "test-3",
            email = "oxoxo",
        )

        jdbc.insert(customer)

        val found = repository.findCustomerById(100700)
        Assertions.assertNotNull(found)
    }

}
