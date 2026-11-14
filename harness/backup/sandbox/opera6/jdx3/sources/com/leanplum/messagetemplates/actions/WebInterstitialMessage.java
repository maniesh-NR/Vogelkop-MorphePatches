package com.leanplum.messagetemplates.actions;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.messagetemplates.MessageTemplate;
import com.leanplum.messagetemplates.controllers.WebInterstitialController;
import com.leanplum.messagetemplates.options.WebInterstitialOptions;

/* loaded from: classes.dex */
public class WebInterstitialMessage implements MessageTemplate {
    private static final String WEB_INTERSTITIAL = "Web Interstitial";

    @Override // com.leanplum.messagetemplates.MessageTemplate
    @NonNull
    public ActionArgs createActionArgs(Context context) {
        return WebInterstitialOptions.toArgs();
    }

    @Override // com.leanplum.messagetemplates.MessageTemplate
    @NonNull
    public String getName() {
        return WEB_INTERSTITIAL;
    }

    @Override // com.leanplum.messagetemplates.MessageTemplate
    public void handleAction(ActionContext actionContext) {
        Activity currentActivity = LeanplumActivityHelper.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        new WebInterstitialController(currentActivity, new WebInterstitialOptions(actionContext)).show();
    }
}
