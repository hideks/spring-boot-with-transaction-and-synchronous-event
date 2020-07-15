package com.hidekscorp.pocs

import com.hidekscorp.pocs.repositories.PocRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PocApplicationTests {

	@Autowired
	lateinit var testRestTemplate: TestRestTemplate

	@Autowired
	lateinit var pocRepository: PocRepository

	@Test
	fun transactionShouldRollbackPocCreation() {
		val response = testRestTemplate.getForEntity("/", String::class.java)
		assertEquals(200, response.statusCodeValue)
		assertEquals(null, response.body)

		val pocList = pocRepository.findAll()

		assertEquals(0, pocList.size)
	}

}
