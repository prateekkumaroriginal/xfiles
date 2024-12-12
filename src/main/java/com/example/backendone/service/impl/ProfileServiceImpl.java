package com.example.backendone.service.impl;

import com.example.backendone.domain.Profile;
import com.example.backendone.repository.ProfileRepository;
import com.example.backendone.service.ProfileService;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public Profile addProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    public List<Profile> getProfiles() {
        return profileRepository.findAll();
    }

    public Profile updateProfile(Long id, Profile profile) {
        Optional<Profile> optionalProfile = profileRepository.findById(id);
        if (optionalProfile.isPresent()) {
            Profile oldProfile = optionalProfile.get();
            if (Objects.nonNull(profile.getEmail())) {
                oldProfile.setEmail(profile.getEmail());
            }
            if (Objects.nonNull(profile.getName())) {
                oldProfile.setName(profile.getName());
            }
            if (Objects.nonNull(profile.getDob())) {
                oldProfile.setDob(profile.getDob());
            }
            if (Objects.nonNull(profile.getOccupation())) {
                oldProfile.setOccupation(profile.getOccupation());
            }
            return profileRepository.save(oldProfile);
        }
        return null;
    }

    public void deleteProfile(Long id) {
        profileRepository.deleteById(id);
    }
}
