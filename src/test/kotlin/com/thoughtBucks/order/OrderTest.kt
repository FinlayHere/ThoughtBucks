package com.thoughtBucks.order

import com.thoughtBucks.order.command.CreateOrderCommand
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class OrderControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `should return 200 when create order successful`() {
        val requestBody = "{\"type\":\"Long Black\", \"size\":\"s\", \"sugar\":\"10\"}"
        val mvcResult = mockMvc.perform(MockMvcRequestBuilders
                .post("/api/order")
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestBody))
                .andReturn()
        assertThat(mvcResult.response.status).isEqualTo(HttpStatus.OK.value())
    }

}

@SpringBootTest()
class OrderServiceTest {

    @Autowired
    private lateinit var orderService: OrderService

    @Test
    fun `should generate coffee order when receive create order command`() {
        val createOrderCommand = CreateOrderCommand("Long Black", "s")
        val coffeeOrder = CoffeeOrder("Long Black", "s")
        assertThat(orderService.generateOrder(createOrderCommand)).isEqualTo(coffeeOrder)
    }
}