package egovframework.com.monbigen.safezone.sample;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class SampleService {
	private final SampleRepository sampleRepository;

	public List<SafeInfoEntity> findAll() {
		return sampleRepository.findAll();
	}
}
