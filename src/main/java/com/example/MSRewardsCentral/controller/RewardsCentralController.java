package com.example.MSRewardsCentral.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rewardCentral.RewardCentral;

import java.util.UUID;

@RestController
public class RewardsCentralController {

    private RewardCentral rewardCentral;

    @Autowired
    public RewardsCentralController(RewardCentral rewardCentral) {
        this.rewardCentral = rewardCentral;
    }

    @RequestMapping("/getAttractionRewardPoints")
    public int getAttractionRewardPoints(@RequestParam UUID attractionId, @RequestParam UUID userId) {
        return rewardCentral.getAttractionRewardPoints(attractionId, userId);
    }

}
