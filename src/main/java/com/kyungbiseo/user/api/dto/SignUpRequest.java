package com.kyungbiseo.user.api.dto;

import com.kyungbiseo.user.domain.Gender;
import com.kyungbiseo.user.domain.Occupation;

public record SignUpRequest(int age, Gender gender, Occupation occupation) {
}
