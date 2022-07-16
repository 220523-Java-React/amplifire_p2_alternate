package com.revature.project2dante.service;

import com.revature.project2dante.model.Avatar;
import com.revature.project2dante.repository.AvatarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvatarService {

    private final AvatarRepository avatarRepository;

    public AvatarService(AvatarRepository avatarRepository) {
        this.avatarRepository = avatarRepository;
    }

    //create
    public Avatar createAvatar(Avatar avatar) {
        return avatarRepository.save(avatar);
    }

    //read
    public List<Avatar> getAllAvatars() {
        return avatarRepository.findAll();
    }

}
