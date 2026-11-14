package com.leanplum.messagetemplates.actions;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.messagetemplates.MessageTemplate;
import com.leanplum.messagetemplates.controllers.InterstitialController;
import com.leanplum.messagetemplates.options.InterstitialOptions;

/* loaded from: classes.dex */
public class InterstitialMessage implements MessageTemplate {
    private static final String INTERSTITIAL = "Interstitial";

    @Override // com.leanplum.messagetemplates.MessageTemplate
    @NonNull
    public ActionArgs createActionArgs(Context context) {
        return InterstitialOptions.toArgs(context);
    }

    @Override // com.leanplum.messagetemplates.MessageTemplate
    @NonNull
    public String getName() {
        return INTERSTITIAL;
    }

    @Override // com.leanplum.messagetemplates.MessageTemplate
    public void handleAction(ActionContext actionContext) {
        Activity currentActivity = LeanplumActivityHelper.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        new InterstitialController(currentActivity, new InterstitialOptions(actionContext)).show();
    }

    @Override // com.leanplum.messagetemplates.MessageTemplate
    public boolean waitFilesAndVariables() {
        return true;
    }
}
