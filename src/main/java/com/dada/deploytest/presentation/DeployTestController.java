package com.dada.deploytest.presentation;

import com.dada.deploytest.application.service.DeployTestService;
import com.dada.deploytest.presentation.request.ProfileRequest;
import com.dada.deploytest.presentation.response.ProfileResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/deploy-test")
public class DeployTestController {

    private final DeployTestService deployTestService;

    @GetMapping("/get")
    public ResponseEntity<ProfileResponse> getMyInfo(@RequestBody ProfileRequest request) {
        log.info("[내 정보 가져오기 API] GET /api/v1/deploy-test/get");

        log.info("[내 정보 가져오기 API] 내 정보 가져오기 Service 로직 수행");
        ProfileResponse myInfo = deployTestService.getProfileInfo(request);

        return ResponseEntity.status(HttpStatus.OK).body(myInfo);
    }
}