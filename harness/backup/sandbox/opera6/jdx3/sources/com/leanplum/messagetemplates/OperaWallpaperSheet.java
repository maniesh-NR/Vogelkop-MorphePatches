package com.leanplum.messagetemplates;

import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.callbacks.PostponableAction;
import com.leanplum.callbacks.VariablesChangedCallback;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import com.leanplum.messagetemplates.OperaWallpaperSheet;
import com.opera.android.BrowserActivity;
import defpackage.nml;
import defpackage.odf;
import defpackage.orm;
import defpackage.tcl;
import defpackage.umi;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/leanplum/messagetemplates/OperaWallpaperSheet;", "", "<init>", "()V", "Lcom/leanplum/ActionContext;", "actionContext", "Ltcl;", "taskExecutor", "Lorm;", "usageReporter", "", "initializeSheetRequest", "(Lcom/leanplum/ActionContext;Ltcl;Lorm;)V", "", "argumentName", "Lcom/leanplum/messagetemplates/ResourceWrapper;", "loadResourceWrapper", "(Lcom/leanplum/ActionContext;Ljava/lang/String;)Lcom/leanplum/messagetemplates/ResourceWrapper;", "register", "(Ltcl;Lorm;)V", "NAME", "Ljava/lang/String;", "WALLPAPER_IDS", "AVATAR", "DARK_MODE_AVATAR", "CENTERED_TEXT", "THEME_IDS", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OperaWallpaperSheet {
    public static final int $stable = 0;

    @NotNull
    private static final String AVATAR = "Avatar Image";

    @NotNull
    private static final String CENTERED_TEXT = "Center text";

    @NotNull
    private static final String DARK_MODE_AVATAR = "Avatar Image Dark";

    @NotNull
    public static final OperaWallpaperSheet INSTANCE = new OperaWallpaperSheet();

    @NotNull
    public static final String NAME = "Wallpaper Sheet";

    @NotNull
    private static final String THEME_IDS = "Theme IDs";

    @NotNull
    private static final String WALLPAPER_IDS = "Wallpaper IDs";

    private OperaWallpaperSheet() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeSheetRequest(final ActionContext actionContext, tcl taskExecutor, final orm usageReporter) {
        Object obj;
        Object currentActivity = LeanplumActivityHelper.getCurrentActivity();
        String str = null;
        final BrowserActivity browserActivity = currentActivity instanceof BrowserActivity ? (BrowserActivity) currentActivity : null;
        if (browserActivity == null) {
            return;
        }
        final String strStringNamed = actionContext.stringNamed("Title");
        final String strStringNamed2 = actionContext.stringNamed(MessageTemplateConstants.Args.MESSAGE);
        final String strStringNamed3 = actionContext.stringNamed(OperaArgs.PRIMARY_TEXT);
        final String strStringNamed4 = actionContext.stringNamed(OperaArgs.SECONDARY_TEXT);
        final String strStringNamed5 = actionContext.stringNamed(WALLPAPER_IDS);
        final boolean zBooleanNamed = actionContext.booleanNamed(CENTERED_TEXT);
        Object objObjectNamed = actionContext.objectNamed(OperaArgs.SECONDARY_ACTION);
        final String strStringNamed6 = actionContext.stringNamed(THEME_IDS);
        if ((objObjectNamed instanceof Map) && (obj = ((Map) objObjectNamed).get(MessageTemplateConstants.Args.URL)) != null) {
            str = (String) obj;
        }
        final String str2 = str;
        umi umiVar = (umi) taskExecutor;
        nml nmlVarE = umiVar.e(new odf((byte) 8));
        nmlVarE.b(umiVar.f(new n5o() { // from class: lpf
            public final Object g(Object obj2) {
                return OperaWallpaperSheet.initializeSheetRequest$lambda$1(browserActivity, strStringNamed5, strStringNamed, strStringNamed2, strStringNamed3, strStringNamed4, zBooleanNamed, str2, strStringNamed6, actionContext, usageReporter, (Pair) obj2);
            }
        }));
        nmlVarE.a(actionContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair initializeSheetRequest$lambda$0(ActionContext actionContext) {
        OperaWallpaperSheet operaWallpaperSheet = INSTANCE;
        return new Pair(operaWallpaperSheet.loadResourceWrapper(actionContext, AVATAR), operaWallpaperSheet.loadResourceWrapper(actionContext, DARK_MODE_AVATAR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016a  */
    /* JADX WARN: Type inference failed for: r20v0, types: [android.app.Activity, com.opera.android.BrowserActivity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.leanplum.messagetemplates.OperaWallpaperSheet$initializeSheetRequest$2$1, java.lang.Object, wmn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit initializeSheetRequest$lambda$1(com.opera.android.BrowserActivity r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, boolean r26, java.lang.String r27, java.lang.String r28, final com.leanplum.ActionContext r29, final defpackage.orm r30, final kotlin.Pair r31) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.messagetemplates.OperaWallpaperSheet.initializeSheetRequest$lambda$1(com.opera.android.BrowserActivity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, com.leanplum.ActionContext, orm, kotlin.Pair):kotlin.Unit");
    }

    private final ResourceWrapper loadResourceWrapper(ActionContext actionContext, String str) {
        String strStringNamed = actionContext.stringNamed(str);
        return (strStringNamed == null || strStringNamed.length() == 0) ? ResourceWrapper.EMPTY : ResourceWrapper.INSTANCE.getResourceFromInputStream(actionContext.streamNamed(str), false);
    }

    public final void register(@NotNull final tcl taskExecutor, @NotNull final orm usageReporter) {
        Leanplum.defineAction(NAME, 3, new ActionArgs().with("Title", null).with(MessageTemplateConstants.Args.MESSAGE, null).with(OperaArgs.PRIMARY_TEXT, null).with(OperaArgs.SECONDARY_TEXT, null).withFile(AVATAR, null).withFile(DARK_MODE_AVATAR, null).with(WALLPAPER_IDS, null).with(THEME_IDS, null).with(CENTERED_TEXT, Boolean.FALSE).with(OperaArgs.SECONDARY_ACTION, null), new ActionCallback() { // from class: com.leanplum.messagetemplates.OperaWallpaperSheet.register.1
            @Override // com.leanplum.callbacks.ActionCallback
            public boolean onResponse(final ActionContext actionContext) {
                final tcl tclVar = taskExecutor;
                final orm ormVar = usageReporter;
                Leanplum.addOnceVariablesChangedAndNoDownloadsPendingHandler(new VariablesChangedCallback() { // from class: com.leanplum.messagetemplates.OperaWallpaperSheet$register$1$onResponse$1
                    @Override // com.leanplum.callbacks.VariablesChangedCallback
                    public void variablesChanged() {
                        final ActionContext actionContext2 = actionContext;
                        final tcl tclVar2 = tclVar;
                        final orm ormVar2 = ormVar;
                        LeanplumActivityHelper.queueActionUponActive(new PostponableAction() { // from class: com.leanplum.messagetemplates.OperaWallpaperSheet$register$1$onResponse$1$variablesChanged$1
                            @Override // java.lang.Runnable
                            public void run() {
                                OperaWallpaperSheet.INSTANCE.initializeSheetRequest(actionContext2, tclVar2, ormVar2);
                            }
                        });
                    }
                });
                return true;
            }
        });
    }
}
