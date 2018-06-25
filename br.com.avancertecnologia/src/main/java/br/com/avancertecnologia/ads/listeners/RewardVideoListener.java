package br.com.avancertecnologia.ads.listeners;

import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

import br.com.avancertecnologia.ads.RewardVideo;

public class RewardVideoListener implements RewardedVideoAdListener {

    private RewardVideo rewardVideo;

    public RewardVideoListener(RewardVideo rewardVideo){
        this.rewardVideo = rewardVideo;
    }

    @Override
    public void onRewardedVideoAdLoaded() {

    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {
        this.rewardVideo.Load();
    }

    @Override
    public void onRewarded(RewardItem rewardItem) {

    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

    }

    @Override
    public void onRewardedVideoCompleted() {

    }

}
