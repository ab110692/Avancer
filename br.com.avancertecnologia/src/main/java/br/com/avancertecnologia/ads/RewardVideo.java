package br.com.avancertecnologia.ads;

import android.content.Context;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public class RewardVideo {

    private RewardedVideoAd rewardedVideoAd;
    private Context context;
    private String token;

    public RewardVideo(Context context, String token) {
        if (context == null) {
            throw new NullPointerException("context não pode ser nulo!");
        }
        if (token.isEmpty()) {
            throw new NullPointerException("Token não pode ser nulo!");
        }

        this.context = context;
        this.token = token;

        MobileAds.initialize(this.context, this.token);

        rewardedVideoAd = MobileAds.getRewardedVideoAdInstance(context);

        this.Load();

    }

    public void Load() {
        rewardedVideoAd.loadAd(this.token, new AdRequest.Builder().build());
    }

    public void SetListernerEvent(RewardedVideoAdListener rewardVideoListener){
        this.rewardedVideoAd.setRewardedVideoAdListener(rewardVideoListener);
    }

    public void Show(){
        if(this.rewardedVideoAd.isLoaded()) {
            this.rewardedVideoAd.show();
        }
    }


}
