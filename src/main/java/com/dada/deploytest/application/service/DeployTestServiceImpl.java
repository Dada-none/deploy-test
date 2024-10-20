package com.dada.deploytest.application.service;

import com.dada.deploytest.domain.Profile;
import com.dada.deploytest.domain.repository.ProfileRepository;
import com.dada.deploytest.presentation.request.ProfileRequest;
import com.dada.deploytest.presentation.response.ProfileResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class DeployTestServiceImpl implements DeployTestService {

    private final ProfileRepository profileRepository;

    @Override
    public ProfileResponse getProfileInfo(ProfileRequest request) {
        Profile profile = profileRepository.findById(request.getProfileUid())
                .orElseThrow(() -> new IllegalStateException("profile not found"));

        return ProfileResponse.builder()
                .profileUid(request.getProfileUid())
                .name(profile.getName())
                .build();
    }
}
