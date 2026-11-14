package com.leanplum.messagetemplates;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.callbacks.PostponableAction;
import com.leanplum.internal.Util;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import com.opera.android.OperaApplication;
import defpackage.b2l;
import defpackage.b87;
import defpackage.d7l;
import defpackage.dg0;
import defpackage.gg0;
import defpackage.ijm;
import defpackage.nz0;
import defpackage.orm;
import defpackage.vb0;
import defpackage.x5f;
import defpackage.z77;
import java.util.Objects;

/* loaded from: classes.dex */
public class OperaAlert {
    private static final String NAME = "Alert";

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static b87 createDialogRequest(@NonNull final ActionContext actionContext, @NonNull final orm ormVar) {
        return new nz0(false) { // from class: com.leanplum.messagetemplates.OperaAlert.1
            private void logInteraction(@NonNull vb0 vb0Var) {
                orm ormVar2 = ormVar;
                ((x5f) ormVar2).Y(gg0.b, vb0Var, 1L, dg0.b, actionContext.getMessageId());
            }

            @Override // defpackage.jjm
            @NonNull
            public /* bridge */ /* synthetic */ ijm getDefaultPriority() {
                return ijm.b;
            }

            @Override // defpackage.nz0
            @Nullable
            public String getPositiveButtonText(@NonNull Context context) {
                return actionContext.stringNamed(MessageTemplateConstants.Args.DISMISS_TEXT);
            }

            @Override // defpackage.b87
            public boolean isAllowed(@Nullable b2l b2lVar) {
                return b2lVar == null || !((d7l) b2lVar).j.m();
            }

            @Override // defpackage.nz0
            public void onCreateDialog(@NonNull az0 az0Var) {
                az0 title = az0Var.setTitle(actionContext.stringNamed("Title"));
                String strStringNamed = actionContext.stringNamed(MessageTemplateConstants.Args.MESSAGE);
                wy0 wy0Var = title.a;
                wy0Var.f = strStringNamed;
                wy0Var.k = true;
            }

            @Override // defpackage.nz0
            public void onDismissDialog(@NonNull bz0 bz0Var, @NonNull hjm hjmVar) {
                if (hjmVar == hjm.b) {
                    logInteraction(vb0.d);
                }
            }

            @Override // defpackage.nz0
            public void onPositiveButtonClicked(@NonNull bz0 bz0Var) {
                logInteraction(vb0.b);
                actionContext.runActionNamed(MessageTemplateConstants.Args.DISMISS_ACTION);
            }
        };
    }

    public static void register(@NonNull Context context) {
        Leanplum.defineAction(NAME, 3, new ActionArgs().with("Title", Util.getApplicationName(context)).with(MessageTemplateConstants.Args.MESSAGE, MessageTemplateConstants.Values.ALERT_MESSAGE).with(MessageTemplateConstants.Args.DISMISS_TEXT, MessageTemplateConstants.Values.OK_TEXT).withAction(MessageTemplateConstants.Args.DISMISS_ACTION, null), new ActionCallback() { // from class: com.leanplum.messagetemplates.OperaAlert.2
            @Override // com.leanplum.callbacks.ActionCallback
            public boolean onResponse(final ActionContext actionContext) {
                LeanplumActivityHelper.queueActionUponActive(new PostponableAction(this) { // from class: com.leanplum.messagetemplates.OperaAlert.2.1
                    {
                        Objects.requireNonNull(this);
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        z77 z77Var;
                        Activity currentActivity = LeanplumActivityHelper.getCurrentActivity();
                        if (currentActivity == null || (z77Var = (z77) currentActivity.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE")) == null || currentActivity.isFinishing()) {
                            return;
                        }
                        ActionContext actionContext2 = actionContext;
                        String[] strArr = OperaApplication.K;
                        z77Var.a(OperaAlert.createDialogRequest(actionContext2, ((OperaApplication) currentActivity.getApplication()).L().c));
                    }
                });
                return true;
            }
        });
    }
}
