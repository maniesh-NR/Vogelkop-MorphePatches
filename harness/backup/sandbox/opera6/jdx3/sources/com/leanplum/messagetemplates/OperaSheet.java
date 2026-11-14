package com.leanplum.messagetemplates;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
import defpackage.ay1;
import defpackage.c37;
import defpackage.cej;
import defpackage.eg0;
import defpackage.gva;
import defpackage.i61;
import defpackage.i8f;
import defpackage.nej;
import defpackage.orm;
import defpackage.q9n;
import defpackage.rqd;
import defpackage.rw7;
import defpackage.skm;
import defpackage.sw7;
import defpackage.t1;
import defpackage.tw7;
import defpackage.vml;
import defpackage.vnf;
import defpackage.wnf;
import defpackage.x5f;
import defpackage.xx1;
import defpackage.yl6;
import java.util.Objects;

/* loaded from: classes.dex */
public class OperaSheet {
    private static final String DEFAULT_BROWSER_COMMAND = "system/default_browser";
    private static final String DEFAULT_BROWSER_SHOW_IN_APP_QUERY = "show_inapp";
    private static final String NAME = "Sheet";

    private static void addSheetRequest(@NonNull cej cejVar) {
        nej nejVar;
        Activity currentActivity = LeanplumActivityHelper.getCurrentActivity();
        if (currentActivity == null || (nejVar = (nej) currentActivity.getSystemService("com.opera.android.ui.SHEET_QUEUE_SERVICE")) == null || currentActivity.isFinishing()) {
            return;
        }
        nejVar.a(cejVar);
    }

    @NonNull
    private static OperaSheetRequest.Model createSheetModel(@NonNull Context context, @NonNull ActionContext actionContext, @NonNull ResourceWrapper resourceWrapper, @Nullable String str) {
        OperaSheetRequest.Button button;
        vnf vnfVar;
        OperaSheetRequest.Button button2;
        String strStringNamed = actionContext.stringNamed("Title");
        String strStringNamed2 = actionContext.stringNamed(MessageTemplateConstants.Args.MESSAGE);
        boolean zBooleanNamed = actionContext.booleanNamed(OperaArgs.FULL_WIDTH_BUTTONS);
        boolean zBooleanNamed2 = actionContext.booleanNamed(OperaArgs.SHOW_CLOSE_BUTTON);
        boolean zIsEmpty = TextUtils.isEmpty(actionContext.stringNamed(OperaArgs.PRIMARY_TEXT));
        byte b = 0;
        byte b2 = 1;
        boolean z = actionContext.booleanNamed(OperaArgs.HAS_SECONDARY_BUTTON) && !TextUtils.isEmpty(actionContext.stringNamed(OperaArgs.SECONDARY_TEXT));
        if (zIsEmpty) {
            button = null;
        } else {
            button = new OperaSheetRequest.Button(actionContext.stringNamed(OperaArgs.PRIMARY_TEXT), new vnf(actionContext, b), (str == null || new c37(new t1(context.getApplicationContext(), (byte) 12), new rqd((byte) 26)).A(str) == null) ? null : Uri.parse(str));
        }
        if (z) {
            vnfVar = null;
            button2 = new OperaSheetRequest.Button(actionContext.stringNamed(OperaArgs.SECONDARY_TEXT), new vnf(actionContext, b2), null);
        } else {
            vnfVar = null;
            button2 = null;
        }
        return new OperaSheetRequest.Model(OperaSheetRequest.SheetType.OPERA_SHEET, actionContext.getMessageId(), strStringNamed, strStringNamed2, button, button2, resourceWrapper, zBooleanNamed, zBooleanNamed2 ? new vnf(actionContext, (byte) 2) : vnfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static ResourceWrapper getResourceFromStream(@NonNull ActionContext actionContext, boolean z) {
        return ResourceWrapper.getResourceFromInputStream(actionContext.streamNamed(z ? OperaArgs.LOTTIE_FILE : OperaArgs.HERO_IMAGE), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initializeSheetRequest(@NonNull Context context, @NonNull ActionContext actionContext) {
        String[] strArr = OperaApplication.K;
        UtilsKt.validateActionUrl(context, actionContext, OperaArgs.PRIMARY_ACTION, new xx1((Object) actionContext, (Object) context, (Object) ((OperaApplication) context.getApplicationContext()).L().c, (Object) ((OperaApplication) context.getApplicationContext()).L().d, (byte) 6));
    }

    private static void invokeDefaultBrowserDirectly(@NonNull ActionContext actionContext, @NonNull orm ormVar, @NonNull Runnable runnable, @NonNull String str) {
        Activity currentActivity = LeanplumActivityHelper.getCurrentActivity();
        BrowserActivity browserActivityO = currentActivity != null ? q9n.o(currentActivity) : null;
        if (browserActivityO == null) {
            ((x5f) ormVar).p0("No BrowserActivity available", eg0.f, actionContext.getMessageId());
        } else {
            browserActivityO.y0().b(str, runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$initializeSheetRequest$0(ActionContext actionContext, Context context, orm ormVar, skm skmVar, tw7 tw7Var) {
        tw7Var.getClass();
        if (tw7Var instanceof rw7) {
            lambda$initializeSheetRequest$7(ormVar, actionContext, (DiscardInfo) ((rw7) tw7Var).a);
        } else if (tw7Var instanceof sw7) {
            lambda$initializeSheetRequest$1(actionContext, context, ormVar, skmVar, (String) ((sw7) tw7Var).a);
        } else {
            h9o.p();
        }
    }

    private static /* synthetic */ Object lambda$initializeSheetRequest$1(ActionContext actionContext, Context context, orm ormVar, skm skmVar, String str) {
        i61 i61Var = new i61((Object) actionContext, (Object) context, str, (Object) ormVar, (Object) skmVar, (byte) 4);
        if (shouldBypassSheetForDefaultBrowser(context, str)) {
            invokeDefaultBrowserDirectly(actionContext, ormVar, i61Var, str);
            return null;
        }
        i61Var.run();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initializeSheetRequest$2(ActionContext actionContext, Context context, String str, orm ormVar, skm skmVar) {
        loadResource(actionContext, new ay1(context, (Comparable) actionContext, str, (Object) ormVar, (Object) skmVar, (byte) 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initializeSheetRequest$3(Context context, ActionContext actionContext, String str, orm ormVar, skm skmVar, ResourceWrapper resourceWrapper) {
        UtilsKt.performStringSubstitution(createSheetModel(context, actionContext, resourceWrapper, str), new wnf(ormVar, skmVar, actionContext, (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$initializeSheetRequest$4(orm ormVar, skm skmVar, ActionContext actionContext, tw7 tw7Var) {
        tw7Var.getClass();
        if (tw7Var instanceof rw7) {
            lambda$initializeSheetRequest$6(ormVar, actionContext, (DiscardInfo) ((rw7) tw7Var).a);
        } else if (tw7Var instanceof sw7) {
            lambda$initializeSheetRequest$5(ormVar, skmVar, (OperaSheetRequest.Model) ((sw7) tw7Var).a);
        } else {
            h9o.p();
        }
    }

    private static /* synthetic */ Object lambda$initializeSheetRequest$5(orm ormVar, skm skmVar, OperaSheetRequest.Model model) {
        addSheetRequest(new OperaSheetRequest(model, ormVar, skmVar));
        return null;
    }

    private static /* synthetic */ Object lambda$initializeSheetRequest$6(orm ormVar, ActionContext actionContext, DiscardInfo discardInfo) {
        ((x5f) ormVar).p0(discardInfo.message, discardInfo.reason, actionContext.getMessageId());
        return null;
    }

    private static /* synthetic */ Object lambda$initializeSheetRequest$7(orm ormVar, ActionContext actionContext, DiscardInfo discardInfo) {
        ((x5f) ormVar).p0(discardInfo.message, discardInfo.reason, actionContext.getMessageId());
        return null;
    }

    @SuppressLint({"ThreadConstraint"})
    private static void loadResource(@NonNull final ActionContext actionContext, @NonNull final Callback callback) {
        final boolean z = (TextUtils.isEmpty(actionContext.stringNamed(OperaArgs.LOTTIE_FILE)) || actionContext.stringNamed(OperaArgs.LOTTIE_FILE).equals("None")) ? false : true;
        if ((TextUtils.isEmpty(actionContext.stringNamed(OperaArgs.HERO_IMAGE)) || actionContext.stringNamed(OperaArgs.HERO_IMAGE).equals("None")) && !z) {
            callback.run(ResourceWrapper.EMPTY);
        } else {
            if (he2.a(new AsyncTask<Void, Void, ResourceWrapper>() { // from class: com.leanplum.messagetemplates.OperaSheet.1
                @Override // android.os.AsyncTask
                @NonNull
                public ResourceWrapper doInBackground(@Nullable Void... voidArr) {
                    return OperaSheet.getResourceFromStream(actionContext, z);
                }

                @Override // android.os.AsyncTask
                public void onPostExecute(@NonNull ResourceWrapper resourceWrapper) {
                    callback.run(resourceWrapper);
                }
            }, new Void[0])) {
                return;
            }
            callback.run(getResourceFromStream(actionContext, z));
        }
    }

    public static void register(@NonNull final Context context) {
        ActionArgs actionArgsWith = new ActionArgs().with("Title", Util.getApplicationName(context)).with(MessageTemplateConstants.Args.MESSAGE, MessageTemplateConstants.Values.CONFIRM_MESSAGE).with(OperaArgs.PRIMARY_TEXT, MessageTemplateConstants.Values.OK_TEXT);
        Boolean bool = Boolean.FALSE;
        Leanplum.defineAction(NAME, 3, actionArgsWith.with(OperaArgs.HAS_SECONDARY_BUTTON, bool).with(OperaArgs.FULL_WIDTH_BUTTONS, bool).with(OperaArgs.SHOW_CLOSE_BUTTON, bool).with(OperaArgs.SECONDARY_TEXT, "").withFile(OperaArgs.HERO_IMAGE, "").withFile(OperaArgs.LOTTIE_FILE, "").withAction(OperaArgs.PRIMARY_ACTION, null).withAction(OperaArgs.SECONDARY_ACTION, null), new ActionCallback() { // from class: com.leanplum.messagetemplates.OperaSheet.2
            @Override // com.leanplum.callbacks.ActionCallback
            public boolean onResponse(@NonNull final ActionContext actionContext) {
                final Context context2 = context;
                Leanplum.addOnceVariablesChangedAndNoDownloadsPendingHandler(new VariablesChangedCallback(this) { // from class: com.leanplum.messagetemplates.OperaSheet.2.1
                    {
                        Objects.requireNonNull(this);
                    }

                    @Override // com.leanplum.callbacks.VariablesChangedCallback
                    public void variablesChanged() {
                        final Context context3 = context2;
                        final ActionContext actionContext2 = actionContext;
                        LeanplumActivityHelper.queueActionUponActive(new PostponableAction(this) { // from class: com.leanplum.messagetemplates.OperaSheet.2.1.1
                            {
                                Objects.requireNonNull(this);
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                OperaSheet.initializeSheetRequest(context3, actionContext2);
                            }
                        });
                    }
                });
                return true;
            }
        });
    }

    private static boolean shouldBypassSheetForDefaultBrowser(@NonNull Context context, @Nullable String str) {
        if (str == null) {
            return false;
        }
        try {
            i8f i8fVarA = i8f.a(Uri.parse(str));
            l1b l1bVar = i8fVarA.b;
            if (!DEFAULT_BROWSER_COMMAND.equals(i8fVarA.a)) {
                return false;
            }
            if (l1bVar.containsKey(DEFAULT_BROWSER_SHOW_IN_APP_QUERY)) {
                if (Boolean.parseBoolean((String) l1bVar.get(DEFAULT_BROWSER_SHOW_IN_APP_QUERY))) {
                    return false;
                }
            }
            yl6 yl6Var = new yl6(context, vml.d);
            return yl6Var.c() && !yl6Var.f();
        } catch (gva unused) {
            return false;
        }
    }
}
