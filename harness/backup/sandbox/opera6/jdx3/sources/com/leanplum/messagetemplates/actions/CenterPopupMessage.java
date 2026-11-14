package com.leanplum.messagetemplates.actions;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.messagetemplates.MessageTemplate;
import com.leanplum.messagetemplates.controllers.CenterPopupController;
import com.leanplum.messagetemplates.options.CenterPopupOptions;

/* loaded from: classes.dex */
public class CenterPopupMessage implements MessageTemplate {
    private static final String CENTER_POPUP = "Center Popup";

    @Override // com.leanplum.messagetemplates.MessageTemplate
    @NonNull
    public ActionArgs createActionArgs(Context context) {
        return CenterPopupOptions.toArgs(context);
    }

    @Override // com.leanplum.messagetemplates.MessageTemplate
    @NonNull
    public String getName() {
        return CENTER_POPUP;
    }

    @Override // com.leanplum.messagetemplates.MessageTemplate
    public void handleAction(ActionContext actionContext) {
        Activity currentActivity = LeanplumActivityHelper.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        new CenterPopupController(currentActivity, new CenterPopupOptions(actionContext)).show();
    }

    @Override // com.leanplum.messagetemplates.MessageTemplate
    public boolean waitFilesAndVariables() {
        return true;
    }
}
