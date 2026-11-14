package com.leanplum.messagetemplates;

import android.content.Context;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.callbacks.PostponableAction;
import com.leanplum.callbacks.VariablesChangedCallback;
import com.leanplum.internal.Util;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import com.leanplum.messagetemplates.OperaSubscriptionDialog;
import com.leanplum.messagetemplates.OperaSubscriptionDialogRequest;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.api.Callback;
import defpackage.b87;
import defpackage.eof;
import defpackage.fof;
import defpackage.lw0;
import defpackage.nml;
import defpackage.odf;
import defpackage.orm;
import defpackage.rw7;
import defpackage.su;
import defpackage.sw7;
import defpackage.tcl;
import defpackage.tw7;
import defpackage.umi;
import defpackage.x5f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150 H\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/leanplum/messagetemplates/OperaSubscriptionDialog;", "", "<init>", "()V", "Landroid/content/Context;", "currentContext", "Ltcl;", "taskExecutor", "", "register", "(Landroid/content/Context;Ltcl;)V", "context", "Lcom/leanplum/ActionContext;", "actionContext", "initializeDialogRequest", "(Landroid/content/Context;Ltcl;Lcom/leanplum/ActionContext;)V", "Lorm;", "usageReporter", "onValidated", "(Ltcl;Lcom/leanplum/ActionContext;Lorm;)V", "onOffersApplied", "Lcom/leanplum/messagetemplates/ResourceWrapper;", "resourceWrapper", "onResourceLoaded", "(Lcom/leanplum/messagetemplates/ResourceWrapper;Lcom/leanplum/ActionContext;Lorm;)V", "Lb87;", "request", "addDialogRequest", "(Lb87;)V", "Lcom/leanplum/messagetemplates/OperaSubscriptionDialogRequest$Model;", "createModel", "(Lcom/leanplum/ActionContext;Lcom/leanplum/messagetemplates/ResourceWrapper;)Lcom/leanplum/messagetemplates/OperaSubscriptionDialogRequest$Model;", "Lcom/opera/api/Callback;", "callback", "loadResource", "(Ltcl;Lcom/leanplum/ActionContext;Lcom/opera/api/Callback;)V", "", "NAME", "Ljava/lang/String;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OperaSubscriptionDialog {
    public static final int $stable = 0;

    @NotNull
    public static final OperaSubscriptionDialog INSTANCE = new OperaSubscriptionDialog();

    @NotNull
    public static final String NAME = "Subscription Dialog";

    private OperaSubscriptionDialog() {
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    private final void addDialogRequest(b87 request) {
        Object currentActivity = LeanplumActivityHelper.getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof BrowserActivity)) {
            return;
        }
        ?? r1 = (BrowserActivity) currentActivity;
        if (r1.isFinishing()) {
            return;
        }
        r1.z0().a(request);
    }

    private final OperaSubscriptionDialogRequest.Model createModel(final ActionContext actionContext, ResourceWrapper resourceWrapper) {
        OperaSubscriptionDialogRequest.Button button;
        OperaSubscriptionDialogRequest.Button button2;
        String strStringNamed = actionContext.stringNamed(OperaArgs.PRIMARY_TEXT);
        Function0 function0 = null;
        if (strStringNamed == null || strStringNamed.length() == 0) {
            strStringNamed = null;
        }
        if (strStringNamed != null) {
            final byte b = 0;
            button = new OperaSubscriptionDialogRequest.Button(strStringNamed, new Function0() { // from class: gof
                public final Object invoke() {
                    byte b2 = b;
                    ActionContext actionContext2 = actionContext;
                    switch (b2) {
                        case 0:
                            return OperaSubscriptionDialog.createModel$lambda$1$0(actionContext2);
                        case 1:
                            return OperaSubscriptionDialog.createModel$lambda$3$0(actionContext2);
                        default:
                            return OperaSubscriptionDialog.createModel$lambda$4(actionContext2);
                    }
                }
            });
        } else {
            button = null;
        }
        String strStringNamed2 = actionContext.stringNamed(OperaArgs.SECONDARY_TEXT);
        if (strStringNamed2 == null || strStringNamed2.length() == 0) {
            strStringNamed2 = null;
        }
        if (strStringNamed2 != null) {
            final byte b2 = 1;
            button2 = new OperaSubscriptionDialogRequest.Button(strStringNamed2, new Function0() { // from class: gof
                public final Object invoke() {
                    byte b22 = b2;
                    ActionContext actionContext2 = actionContext;
                    switch (b22) {
                        case 0:
                            return OperaSubscriptionDialog.createModel$lambda$1$0(actionContext2);
                        case 1:
                            return OperaSubscriptionDialog.createModel$lambda$3$0(actionContext2);
                        default:
                            return OperaSubscriptionDialog.createModel$lambda$4(actionContext2);
                    }
                }
            });
        } else {
            button2 = null;
        }
        if (actionContext.booleanNamed(OperaArgs.SHOW_CLOSE_BUTTON)) {
            final byte b3 = 2;
            function0 = new Function0() { // from class: gof
                public final Object invoke() {
                    byte b22 = b3;
                    ActionContext actionContext2 = actionContext;
                    switch (b22) {
                        case 0:
                            return OperaSubscriptionDialog.createModel$lambda$1$0(actionContext2);
                        case 1:
                            return OperaSubscriptionDialog.createModel$lambda$3$0(actionContext2);
                        default:
                            return OperaSubscriptionDialog.createModel$lambda$4(actionContext2);
                    }
                }
            };
        }
        return new OperaSubscriptionDialogRequest.Model(actionContext.getMessageId(), actionContext.stringNamed("Title"), actionContext.stringNamed(MessageTemplateConstants.Args.MESSAGE), button, button2, resourceWrapper, actionContext.booleanNamed(OperaArgs.FULL_WIDTH_BUTTONS), function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createModel$lambda$1$0(ActionContext actionContext) {
        actionContext.runTrackedActionNamed(OperaArgs.PRIMARY_ACTION);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createModel$lambda$3$0(ActionContext actionContext) {
        actionContext.runTrackedActionNamed(OperaArgs.SECONDARY_ACTION);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createModel$lambda$4(ActionContext actionContext) {
        actionContext.track(OperaArgs.CLOSE_X_ACTION, 0.0d, null);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeDialogRequest(Context context, tcl taskExecutor, ActionContext actionContext) {
        UtilsKt.validateActionUrl(context, actionContext, OperaArgs.PRIMARY_ACTION, new fof(context, taskExecutor, actionContext, (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeDialogRequest$lambda$0(Context context, tcl tclVar, ActionContext actionContext, tw7 tw7Var) {
        String[] strArr = OperaApplication.K;
        x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
        if (tw7Var instanceof rw7) {
            DiscardInfo discardInfo = (DiscardInfo) ((rw7) tw7Var).a;
            x5fVar.p0(discardInfo.message, discardInfo.reason, actionContext.getMessageId());
        } else if (!(tw7Var instanceof sw7)) {
            h9o.p();
        } else {
            INSTANCE.onValidated(tclVar, actionContext, x5fVar);
        }
    }

    private final void loadResource(tcl taskExecutor, ActionContext actionContext, Callback callback) {
        String strStringNamed = actionContext.stringNamed(OperaArgs.HERO_IMAGE);
        if (strStringNamed == null || strStringNamed.length() == 0 || strStringNamed.equals("None")) {
            callback.run(ResourceWrapper.EMPTY);
            return;
        }
        umi umiVar = (umi) taskExecutor;
        nml nmlVarE = umiVar.e(new odf((byte) 6));
        nmlVarE.b(umiVar.f(new lw0(callback, (byte) 4)));
        nmlVarE.a(actionContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResourceWrapper loadResource$lambda$1(ActionContext actionContext) {
        return ResourceWrapper.INSTANCE.getResourceFromInputStream(actionContext.streamNamed(OperaArgs.HERO_IMAGE), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadResource$run(Callback callback, ResourceWrapper resourceWrapper) {
        callback.run(resourceWrapper);
        return Unit.a;
    }

    private final void onOffersApplied(tcl taskExecutor, ActionContext actionContext, orm usageReporter) {
        loadResource(taskExecutor, actionContext, new eof((Object) actionContext, (Object) usageReporter, (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onOffersApplied$lambda$0(ActionContext actionContext, orm ormVar, ResourceWrapper resourceWrapper) {
        INSTANCE.onResourceLoaded(resourceWrapper, actionContext, ormVar);
    }

    private final void onResourceLoaded(ResourceWrapper resourceWrapper, ActionContext actionContext, orm usageReporter) {
        addDialogRequest(new OperaSubscriptionDialogRequest(createModel(actionContext, resourceWrapper), usageReporter));
    }

    private final void onValidated(tcl taskExecutor, ActionContext actionContext, orm usageReporter) {
        SubscriptionOffersKt.applySubscriptionOffers(actionContext, new su((Object) taskExecutor, (Object) actionContext, (Object) usageReporter, (byte) 29));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onValidated$lambda$0(tcl tclVar, ActionContext actionContext, orm ormVar, tw7 tw7Var) {
        if (tw7Var instanceof rw7) {
            DiscardInfo discardInfo = (DiscardInfo) ((rw7) tw7Var).a;
            ((x5f) ormVar).p0(discardInfo.message, discardInfo.reason, actionContext.getMessageId());
        } else if (!(tw7Var instanceof sw7)) {
            h9o.p();
        } else {
            INSTANCE.onOffersApplied(tclVar, actionContext, ormVar);
        }
    }

    public static final void register(@NotNull final Context currentContext, @NotNull final tcl taskExecutor) {
        ActionArgs actionArgsWith = new ActionArgs().with("Title", Util.getApplicationName(currentContext)).with(MessageTemplateConstants.Args.MESSAGE, MessageTemplateConstants.Values.CONFIRM_MESSAGE);
        Boolean bool = Boolean.FALSE;
        Leanplum.defineAction(NAME, 3, actionArgsWith.with(OperaArgs.FULL_WIDTH_BUTTONS, bool).with(OperaArgs.SHOW_CLOSE_BUTTON, bool).with(OperaArgs.PRIMARY_TEXT, MessageTemplateConstants.Values.OK_TEXT).with(OperaArgs.SECONDARY_TEXT, "").withFile(OperaArgs.HERO_IMAGE, "").withAction(OperaArgs.PRIMARY_ACTION, null).withAction(OperaArgs.SECONDARY_ACTION, null).with(OperaArgs.OFFERS, ""), new ActionCallback() { // from class: com.leanplum.messagetemplates.OperaSubscriptionDialog.register.1
            @Override // com.leanplum.callbacks.ActionCallback
            public boolean onResponse(final ActionContext actionContext) {
                final Context context = currentContext;
                final tcl tclVar = taskExecutor;
                Leanplum.addOnceVariablesChangedAndNoDownloadsPendingHandler(new VariablesChangedCallback() { // from class: com.leanplum.messagetemplates.OperaSubscriptionDialog$register$1$onResponse$1
                    @Override // com.leanplum.callbacks.VariablesChangedCallback
                    public void variablesChanged() {
                        final Context context2 = context;
                        final tcl tclVar2 = tclVar;
                        final ActionContext actionContext2 = actionContext;
                        LeanplumActivityHelper.queueActionUponActive(new PostponableAction() { // from class: com.leanplum.messagetemplates.OperaSubscriptionDialog$register$1$onResponse$1$variablesChanged$1
                            @Override // java.lang.Runnable
                            public void run() {
                                OperaSubscriptionDialog.INSTANCE.initializeDialogRequest(context2, tclVar2, actionContext2);
                            }
                        });
                    }
                });
                return true;
            }
        });
    }
}
