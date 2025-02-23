package com.example.stepperbackend.service.RateDiaryService;

import com.example.stepperbackend.domain.RateDiary;
import com.example.stepperbackend.web.dto.RateDiaryDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface RateDiaryService {

    public RateDiaryDto.RateDiaryWriteResponseDTO writeDiary(MultipartFile image, RateDiaryDto.RateDiaryWriteRequestDTO request, String memberEmail);

    public List<RateDiary> checkRateDiary (String memberEmail);

}
