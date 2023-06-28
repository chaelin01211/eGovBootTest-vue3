package egovframework.com.monbigen.safezone.sample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class SampleControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	@DisplayName("sample test")
	void getSample() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/api/sample.do"))
				.andExpect(status().isOk())
				.andDo(print());
	}

	@Test
	@DisplayName("[DB] findAll sample test")
	void getAll() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/api/getAll.do"))
				.andExpect(status().isOk())
				.andDo(print());
	}
}