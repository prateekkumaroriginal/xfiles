package com.example.backendone.controller;

import com.example.backendone.domain.Profile;
import com.example.backendone.service.ProfileService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @PostMapping
    public ResponseEntity<Profile> addProfile(@RequestBody Profile profile) {
        return ResponseEntity.ok(profileService.addProfile(profile));
    }

    @GetMapping
    public ResponseEntity<List<Profile>> getProfiles() {
        return ResponseEntity.ok(profileService.getProfiles());
    }

    @PatchMapping
    public ResponseEntity<Profile> updateProfile(@RequestParam Long id, @RequestBody Profile profile) {
        return ResponseEntity.ok(profileService.updateProfile(id, profile));
    }

    @DeleteMapping
    public void deleteProfile(@RequestParam Long id) {
        profileService.deleteProfile(id);
    }
}
