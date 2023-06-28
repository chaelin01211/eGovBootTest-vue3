package egovframework.com.monbigen.safezone.sample;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "cnsm_safe_info")
public class SafeInfoEntity {
	@Column(name = "cnsm_id")
	@Id
	private String cnsmId;

	@Column(name = "login_email")
	private String loginEmail;

	@Column(name = "safe_tf")
	private Boolean safeTf;

	private String registrant;

	@Column(name = "regist_tsp")
	private LocalDateTime registTsp;

	private String modifier;

	@Column(name = "modifi_tsp")
	private LocalDateTime modifiTsp;
}
