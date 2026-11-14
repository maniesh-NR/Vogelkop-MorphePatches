package com.leanplum.messagetemplates;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.callbacks.PostponableAction;
import com.leanplum.callbacks.VariablesChangedCallback;
import com.leanplum.messagetemplates.actions.AlertMessage;
import com.leanplum.messagetemplates.actions.CenterPopupMessage;
import com.leanplum.messagetemplates.actions.ConfirmMessage;
import com.leanplum.messagetemplates.actions.InterstitialMessage;
import com.leanplum.messagetemplates.actions.OpenUrlAction;
import com.leanplum.messagetemplates.actions.WebInterstitialMessage;

/* loaded from: classes.dex */
public class MessageTemplates {
    private static DialogCustomizer customizer = null;
    private static boolean registered = false;

    /* renamed from: com.leanplum.messagetemplates.MessageTemplates$2, reason: invalid class name */
    class AnonymousClass2 extends ActionCallback {
        final /* synthetic */ MessageTemplate val$template;

        public AnonymousClass2(MessageTemplate messageTemplate) {
            this.val$template = messageTemplate;
        }

        @Override // com.leanplum.callbacks.ActionCallback
        public boolean onResponse(final ActionContext actionContext) {
            Leanplum.addOnceVariablesChangedAndNoDownloadsPendingHandler(new VariablesChangedCallback() { // from class: com.leanplum.messagetemplates.MessageTemplates.2.1
                @Override // com.leanplum.callbacks.VariablesChangedCallback
                public void variablesChanged() {
                    LeanplumActivityHelper.queueActionUponActive(new PostponableAction() { // from class: com.leanplum.messagetemplates.MessageTemplates.2.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            AnonymousClass2.this.val$template.handleAction(actionContext);
                        }
                    });
                }
            });
            return true;
        }
    }

    private static ActionCallback createCallback(@NonNull final MessageTemplate messageTemplate) {
        return new ActionCallback() { // from class: com.leanplum.messagetemplates.MessageTemplates.1
            @Override // com.leanplum.callbacks.ActionCallback
            public boolean onResponse(final ActionContext actionContext) {
                LeanplumActivityHelper.queueActionUponActive(new PostponableAction() { // from class: com.leanplum.messagetemplates.MessageTemplates.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        messageTemplate.handleAction(actionContext);
                    }
                });
                return true;
            }
        };
    }

    private static ActionCallback createCallbackWaitVarsAndFiles(@NonNull MessageTemplate messageTemplate) {
        return new AnonymousClass2(messageTemplate);
    }

    @Nullable
    public static DialogCustomizer getCustomizer() {
        return customizer;
    }

    public static synchronized void register(Context context) {
        if (registered) {
            return;
        }
        registered = true;
        registerAction(new OpenUrlAction(), context);
        registerTemplate(new AlertMessage(), context);
        registerTemplate(new ConfirmMessage(), context);
        registerTemplate(new CenterPopupMessage(), context);
        registerTemplate(new InterstitialMessage(), context);
        registerTemplate(new WebInterstitialMessage(), context);
    }

    private static void register(@NonNull MessageTemplate messageTemplate, @NonNull Context context, int i) {
        String name = messageTemplate.getName();
        ActionArgs actionArgsCreateActionArgs = messageTemplate.createActionArgs(context);
        Leanplum.defineAction(name, i, actionArgsCreateActionArgs, (messageTemplate.waitFilesAndVariables() || actionArgsCreateActionArgs.containsFile()) ? createCallbackWaitVarsAndFiles(messageTemplate) : createCallback(messageTemplate));
    }

    public static void registerAction(@NonNull MessageTemplate messageTemplate, @NonNull Context context) {
        register(messageTemplate, context, 2);
    }

    public static void registerTemplate(@NonNull MessageTemplate messageTemplate, @NonNull Context context) {
        register(messageTemplate, context, 3);
    }

    public static void setCustomizer(DialogCustomizer dialogCustomizer) {
        customizer = dialogCustomizer;
    }
}
