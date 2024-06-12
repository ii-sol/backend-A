package sinhan.server1.domain.auth.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class LoginInfoFindRequest {

    @JsonProperty(value = "phone_num")
    @NotBlank(message = "전화번호를 입력해주세요.")
    @Pattern(regexp = "\\d{3}-\\d{4}-\\d{4}", message = "전화번호 형식이 올바르지 않습니다.")
    private String phoneNum;
    @JsonProperty(value = "account_info")
    @NotBlank(message = "비밀번호를 입력해주세요.")
    @Pattern(regexp = "\\d{6}", message = "비밀번호는 6자리 숫자여야 합니다.")
    private String accountInfo;
}