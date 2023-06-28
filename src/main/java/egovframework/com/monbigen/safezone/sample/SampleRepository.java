package egovframework.com.monbigen.safezone.sample;

import egovframework.com.monbigen.safezone.sample.SafeInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<SafeInfoEntity, String> {
}
