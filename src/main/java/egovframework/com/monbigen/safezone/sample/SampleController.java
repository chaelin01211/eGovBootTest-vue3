package egovframework.com.monbigen.safezone.sample;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class SampleController {
	private final SampleService sampleService;

	@GetMapping(value = "/sample.do")
	public SampleResultDTO getSample() {
		return new SampleResultDTO().builder().result(true).resultList(new ArrayList<String>() {{
			add("test1");
			add("test2");
		}}).build();
	}

	@GetMapping(value = "/getAll.do")
	public List<SafeInfoEntity> getAll() {
		return sampleService.findAll();
	}
}
