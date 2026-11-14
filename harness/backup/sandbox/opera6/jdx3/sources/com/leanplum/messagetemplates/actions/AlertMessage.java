package com.leanplum.messagetemplates.actions;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import androidx.annotation.NonNull;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.internal.Util;
import com.leanplum.messagetemplates.MessageTemplate;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import defpackage.oz0;

/* loaded from: classes.dex */
public class AlertMessage implements MessageTemplate {
    private static final String ALERT = "Alert";

    @Override // com.leanplum.messagetemplates.MessageTemplate
    @NonNull
    public ActionArgs createActionArgs(Context context) {
        return new ActionArgs().with("Title", Util.getApplicationName(context)).with(MessageTemplateConstants.Args.MESSAGE, MessageTemplateConstants.Values.ALERT_MESSAGE).with(MessageTemplateConstants.Args.DISMISS_TEXT, MessageTemplateConstants.Values.OK_TEXT).withAction(MessageTemplateConstants.Args.DISMISS_ACTION, null);
    }

    @Override // com.leanplum.messagetemplates.MessageTemplate
    @NonNull
    public String getName() {
        return ALERT;
    }

    @Override // com.leanplum.messagetemplates.MessageTemplate
    public void handleAction(ActionContext actionContext) {
        Activity currentActivity = LeanplumActivityHelper.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        new AlertDialog.Builder(currentActivity).setTitle(actionContext.stringNamed("Title")).setMessage(actionContext.stringNamed(MessageTemplateConstants.Args.MESSAGE)).setCancelable(false).setPositiveButton(actionContext.stringNamed(MessageTemplateConstants.Args.DISMISS_TEXT), new oz0(actionContext, (byte) 0)).create().show();
    }
}
