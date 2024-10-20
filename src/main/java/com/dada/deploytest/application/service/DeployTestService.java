package com.dada.deploytest.application.service;

import com.dada.deploytest.presentation.request.ProfileRequest;
import com.dada.deploytest.presentation.response.ProfileResponse;


public interface DeployTestService {
    ProfileResponse getProfileInfo(ProfileRequest bearerToken);
}