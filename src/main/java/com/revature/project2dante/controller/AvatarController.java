package com.revature.project2dante.controller;


import com.revature.project2dante.model.Avatar;
import com.revature.project2dante.service.AvatarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avatar")
public class AvatarController {
    private final AvatarService avatarService;

    public AvatarController(AvatarService avatarService) {
        this.avatarService = avatarService;
    }

    @PostMapping
    public Avatar createAvatar(@RequestBody Avatar avatar) {
        return avatarService.createAvatar(avatar);
    }

  //get
    @GetMapping
    public List<Avatar> getAvatar() {
       return  avatarService.getAllAvatars();
    }

    //getById
    @GetMapping("{avatarId}")
    public Avatar getAvatarById(@PathVariable Integer avatarId) {
        return avatarService.getAvatarById(avatarId);
    }

    //updateById
    @PatchMapping("{avatarId}")
    public Avatar updateAvatar(@PathVariable Integer avatarId, @RequestBody Avatar avatar) {
        return avatarService.updateAvatar(avatarId, avatar);
    }


}


