package com.example.backendone.service;

import com.example.backendone.domain.Profile;

import java.util.List;

public interface ProfileService {
    public Profile addProfile(Profile profile);

    public List<Profile> getProfiles();

    public Profile updateProfile(Long id, Profile profile);

    public void deleteProfile(Long id);
}
