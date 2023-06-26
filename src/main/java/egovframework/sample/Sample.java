package egovframework.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class Sample {
	@GetMapping(value = "/sample.do")
	public SampleResultDTO getSample() {
		return new SampleResultDTO().builder().result(true).resultList(new ArrayList<String>() {{
			add("test1");
			add("test2");
		}}).build();
	}
}
