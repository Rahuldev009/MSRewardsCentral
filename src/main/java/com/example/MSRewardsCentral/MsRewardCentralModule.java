package com.example.MSRewardsCentral;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rewardCentral.RewardCentral;

@Configuration
public class MsRewardCentralModule {

    @Bean
    public RewardCentral getRewardCentral() {
        return new RewardCentral();
    }
}
