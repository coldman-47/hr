package murraco.service;

import lombok.RequiredArgsConstructor;
import murraco.model.Profile;
import murraco.repository.ProfileRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileService {

    private final ProfileRepository profileRepository;

    public Profile addProfile(Profile profile) {
        return profileRepository.save(profile);
    }

}
