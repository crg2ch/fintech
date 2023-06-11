package com.minsoo.css.service

import com.minsoo.css.dto.LoanRequestDto
import com.minsoo.css.dto.LoanResultDto
import org.springframework.stereotype.Service

@Service
class LoanReviewService {
    fun loanReview(requestInputDto: LoanRequestDto.RequestInputDto): LoanResultDto.ResponseDto {
        if (requestInputDto.userIncomeAmount < 0) throw RuntimeException("Invalid userIncomeAmount Param")
        if (requestInputDto.userIncomeAmount < 10000000) return LoanResultDto.ResponseDto(requestInputDto.userKey, 0.0, 10000000)
        if (requestInputDto.userIncomeAmount < 20000000) return LoanResultDto.ResponseDto(requestInputDto.userKey, 0.0, 20000000)
        if (requestInputDto.userIncomeAmount < 30000000) return LoanResultDto.ResponseDto(requestInputDto.userKey, 0.0, 30000000)
        if (requestInputDto.userIncomeAmount < 40000000) return LoanResultDto.ResponseDto(requestInputDto.userKey, 0.0, 40000000)
        if (requestInputDto.userIncomeAmount < 50000000) return LoanResultDto.ResponseDto(requestInputDto.userKey, 0.0, 50000000)
        if (requestInputDto.userIncomeAmount >= 50000000) return LoanResultDto.ResponseDto(requestInputDto.userKey, 0.0, 60000000)
        throw RuntimeException("Invalid userIncomeAmount Param")
    }
}