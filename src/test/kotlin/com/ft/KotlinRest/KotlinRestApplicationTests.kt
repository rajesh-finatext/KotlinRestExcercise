package com.ft.KotlinRest

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

class Color {
	fun getRed(): String = "FF0000"
	fun throwException() { throw Exception() }
}

@RunWith(SpringRunner::class)
@SpringBootTest
class KotlinRestApplicationTests {

	@Test
	fun contextLoads() {
	}

	@Test
	fun getRedTest() {
		Assert.assertEquals("FF0000", Color().getRed())
	}

	@Test
	fun getNumTest() {
		Assert.assertEquals(1, 1)
	}

}
