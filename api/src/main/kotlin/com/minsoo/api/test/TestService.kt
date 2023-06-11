package com.minsoo.api.test

import com.minsoo.domain.domain.UserInfo
import com.minsoo.domain.repository.UserInfoRepository
import org.springframework.stereotype.Service


@Service
class TestService(
    private val userInfoRepository: UserInfoRepository
) {
    fun testGetService(userKey: String) = userInfoRepository.findByUserKey(userKey).toDto()

    fun UserInfo.toDto() = TestDto.UserInfoDto(userKey, userRegistrationNumber, userName, userIncomeAmount)
}