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
import com.leanplum.messagetemplates.OperaSheetRequest;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.api.Callback;
import defpackage.cej;
import defpackage.fof;
import defpackage.lw0;
import defpackage.nml;
import defpackage.odf;
import defpackage.orm;
import defpackage.rw7;
import defpackage.skm;
import defpackage.sw7;
import defpackage.tcl;
import defpackage.tw7;
import defpackage.umi;
import defpackage.vnf;
import defpackage.wnf;
import defpackage.x5f;
import defpackage.xx1;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J/\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010!J-\u0010$\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\"H\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/leanplum/messagetemplates/OperaSubscriptionSheet;", "", "<init>", "()V", "Landroid/content/Context;", "currentContext", "Ltcl;", "taskExecutor", "", "register", "(Landroid/content/Context;Ltcl;)V", "context", "Lcom/leanplum/ActionContext;", "actionContext", "initializeSheetRequest", "(Landroid/content/Context;Ltcl;Lcom/leanplum/ActionContext;)V", "Lorm;", "usageReporter", "Lskm;", "unfilteredUsageReporter", "onValidated", "(Ltcl;Lcom/leanplum/ActionContext;Lorm;Lskm;)V", "onOffersApplied", "Lcom/leanplum/messagetemplates/ResourceWrapper;", "resourceWrapper", "onResourceLoaded", "(Lcom/leanplum/messagetemplates/ResourceWrapper;Lcom/leanplum/ActionContext;Lorm;Lskm;)V", "Lcej;", "request", "addSheetRequest", "(Lcej;)V", "Lcom/leanplum/messagetemplates/OperaSheetRequest$Model;", "createModel", "(Lcom/leanplum/ActionContext;Lcom/leanplum/messagetemplates/ResourceWrapper;)Lcom/leanplum/messagetemplates/OperaSheetRequest$Model;", "Lcom/opera/api/Callback;", "callback", "loadResource", "(Ltcl;Lcom/leanplum/ActionContext;Lcom/opera/api/Callback;)V", "", "NAME", "Ljava/lang/String;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OperaSubscriptionSheet {
    public static final int $stable = 0;

    @NotNull
    public static final OperaSubscriptionSheet INSTANCE = new OperaSubscriptionSheet();

    @NotNull
    public static final String NAME = "Subscription Sheet";

    private OperaSubscriptionSheet() {
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    private final void addSheetRequest(cej request) {
        Object currentActivity = LeanplumActivityHelper.getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof BrowserActivity)) {
            return;
        }
        ?? r1 = (BrowserActivity) currentActivity;
        if (r1.isFinishing()) {
            return;
        }
        r1.I0().a(request);
    }

    private final OperaSheetRequest.Model createModel(ActionContext actionContext, ResourceWrapper resourceWrapper) {
        String strStringNamed = actionContext.stringNamed(OperaArgs.PRIMARY_TEXT);
        if (strStringNamed == null || strStringNamed.length() == 0) {
            strStringNamed = null;
        }
        OperaSheetRequest.Button button = strStringNamed != null ? new OperaSheetRequest.Button(strStringNamed, new vnf(actionContext, (byte) 3), null) : null;
        String strStringNamed2 = actionContext.stringNamed(OperaArgs.SECONDARY_TEXT);
        if (strStringNamed2 == null || strStringNamed2.length() == 0) {
            strStringNamed2 = null;
        }
        return new OperaSheetRequest.Model(OperaSheetRequest.SheetType.SUBSCRIPTION_SHEET, actionContext.getMessageId(), actionContext.stringNamed("Title"), actionContext.stringNamed(MessageTemplateConstants.Args.MESSAGE), button, strStringNamed2 != null ? new OperaSheetRequest.Button(strStringNamed2, new vnf(actionContext, (byte) 4), null) : null, resourceWrapper, actionContext.booleanNamed(OperaArgs.FULL_WIDTH_BUTTONS), actionContext.booleanNamed(OperaArgs.SHOW_CLOSE_BUTTON) ? new vnf(actionContext, (byte) 5) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeSheetRequest(Context context, tcl taskExecutor, ActionContext actionContext) {
        UtilsKt.validateActionUrl(context, actionContext, OperaArgs.PRIMARY_ACTION, new fof(context, taskExecutor, actionContext, (byte) 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeSheetRequest$lambda$0(Context context, tcl tclVar, ActionContext actionContext, tw7 tw7Var) {
        String[] strArr = OperaApplication.K;
        x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
        x5f x5fVar2 = ((OperaApplication) context.getApplicationContext()).L().d;
        if (tw7Var instanceof rw7) {
            DiscardInfo discardInfo = (DiscardInfo) ((rw7) tw7Var).a;
            x5fVar.p0(discardInfo.message, discardInfo.reason, actionContext.getMessageId());
        } else if (!(tw7Var instanceof sw7)) {
            h9o.p();
        } else {
            INSTANCE.onValidated(tclVar, actionContext, x5fVar, x5fVar2);
        }
    }

    private final void loadResource(tcl taskExecutor, ActionContext actionContext, Callback callback) {
        String strStringNamed = actionContext.stringNamed(OperaArgs.HERO_IMAGE);
        if (strStringNamed == null || strStringNamed.length() == 0 || strStringNamed.equals("None")) {
            callback.run(ResourceWrapper.EMPTY);
            return;
        }
        umi umiVar = (umi) taskExecutor;
        nml nmlVarE = umiVar.e(new odf((byte) 7));
        nmlVarE.b(umiVar.f(new lw0(callback, (byte) 5)));
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

    private final void onOffersApplied(tcl taskExecutor, ActionContext actionContext, orm usageReporter, skm unfilteredUsageReporter) {
        loadResource(taskExecutor, actionContext, new wnf(actionContext, usageReporter, unfilteredUsageReporter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onOffersApplied$lambda$0(ActionContext actionContext, orm ormVar, skm skmVar, ResourceWrapper resourceWrapper) {
        INSTANCE.onResourceLoaded(resourceWrapper, actionContext, ormVar, skmVar);
    }

    private final void onResourceLoaded(ResourceWrapper resourceWrapper, ActionContext actionContext, orm usageReporter, skm unfilteredUsageReporter) {
        UtilsKt.performStringSubstitution(createModel(actionContext, resourceWrapper), new wnf(usageReporter, unfilteredUsageReporter, actionContext, (byte) 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResourceLoaded$lambda$0(orm ormVar, skm skmVar, ActionContext actionContext, tw7 tw7Var) {
        if (tw7Var instanceof rw7) {
            DiscardInfo discardInfo = (DiscardInfo) ((rw7) tw7Var).a;
            ((x5f) ormVar).p0(discardInfo.message, discardInfo.reason, actionContext.getMessageId());
        } else if (!(tw7Var instanceof sw7)) {
            h9o.p();
        } else {
            INSTANCE.addSheetRequest(new OperaSheetRequest((OperaSheetRequest.Model) ((sw7) tw7Var).a, ormVar, skmVar));
        }
    }

    private final void onValidated(tcl taskExecutor, ActionContext actionContext, orm usageReporter, skm unfilteredUsageReporter) {
        SubscriptionOffersKt.applySubscriptionOffers(actionContext, new xx1((Object) taskExecutor, (Object) actionContext, (Object) usageReporter, (Object) unfilteredUsageReporter, (byte) 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onValidated$lambda$0(tcl tclVar, ActionContext actionContext, orm ormVar, skm skmVar, tw7 tw7Var) {
        if (tw7Var instanceof rw7) {
            DiscardInfo discardInfo = (DiscardInfo) ((rw7) tw7Var).a;
            ((x5f) ormVar).p0(discardInfo.message, discardInfo.reason, actionContext.getMessageId());
        } else if (!(tw7Var instanceof sw7)) {
            h9o.p();
        } else {
            INSTANCE.onOffersApplied(tclVar, actionContext, ormVar, skmVar);
        }
    }

    public static final void register(@NotNull final Context currentContext, @NotNull final tcl taskExecutor) {
        ActionArgs actionArgsWith = new ActionArgs().with("Title", Util.getApplicationName(currentContext)).with(MessageTemplateConstants.Args.MESSAGE, MessageTemplateConstants.Values.CONFIRM_MESSAGE);
        Boolean bool = Boolean.FALSE;
        Leanplum.defineAction(NAME, 3, actionArgsWith.with(OperaArgs.FULL_WIDTH_BUTTONS, bool).with(OperaArgs.SHOW_CLOSE_BUTTON, bool).with(OperaArgs.PRIMARY_TEXT, MessageTemplateConstants.Values.OK_TEXT).with(OperaArgs.SECONDARY_TEXT, "").withFile(OperaArgs.HERO_IMAGE, "").withAction(OperaArgs.PRIMARY_ACTION, null).withAction(OperaArgs.SECONDARY_ACTION, null).with(OperaArgs.OFFERS, ""), new ActionCallback() { // from class: com.leanplum.messagetemplates.OperaSubscriptionSheet.register.1
            @Override // com.leanplum.callbacks.ActionCallback
            public boolean onResponse(final ActionContext actionContext) {
                final Context context = currentContext;
                final tcl tclVar = taskExecutor;
                Leanplum.addOnceVariablesChangedAndNoDownloadsPendingHandler(new VariablesChangedCallback() { // from class: com.leanplum.messagetemplates.OperaSubscriptionSheet$register$1$onResponse$1
                    @Override // com.leanplum.callbacks.VariablesChangedCallback
                    public void variablesChanged() {
                        final Context context2 = context;
                        final tcl tclVar2 = tclVar;
                        final ActionContext actionContext2 = actionContext;
                        LeanplumActivityHelper.queueActionUponActive(new PostponableAction() { // from class: com.leanplum.messagetemplates.OperaSubscriptionSheet$register$1$onResponse$1$variablesChanged$1
                            @Override // java.lang.Runnable
                            public void run() {
                                OperaSubscriptionSheet.INSTANCE.initializeSheetRequest(context2, tclVar2, actionContext2);
                            }
                        });
                    }
                });
                return true;
            }
        });
    }
}
