package com.leanplum.messagetemplates;

import android.graphics.Bitmap;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import defpackage.eg0;
import defpackage.gg0;
import defpackage.i61;
import defpackage.mk5;
import defpackage.nk5;
import defpackage.nml;
import defpackage.odf;
import defpackage.ok5;
import defpackage.orm;
import defpackage.pde;
import defpackage.qln;
import defpackage.tcl;
import defpackage.umi;
import defpackage.vb0;
import defpackage.ws1;
import defpackage.x5f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/leanplum/messagetemplates/OperaConfigBundleSheet;", "", "<init>", "()V", "Lcom/leanplum/ActionContext;", "actionContext", "Ltcl;", "taskExecutor", "Lorm;", "usageReporter", "Lqln;", "wallpaperManager", "Lok5;", "uiProxy", "", "initializeSheetRequest", "(Lcom/leanplum/ActionContext;Ltcl;Lorm;Lqln;Lok5;)V", "", "", "extractCarouselWallpapers", "(Lcom/leanplum/ActionContext;)Ljava/util/List;", "register", "(Ltcl;Lorm;)V", "NAME", "Ljava/lang/String;", "PARAM_CAROUSEL_WALLPAPERS", "ARG_AVATAR_IMAGE", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OperaConfigBundleSheet {
    public static final int $stable = 0;

    @NotNull
    private static final String ARG_AVATAR_IMAGE = "Avatar Image";

    @NotNull
    public static final OperaConfigBundleSheet INSTANCE = new OperaConfigBundleSheet();

    @NotNull
    public static final String NAME = "Config Bundle Sheet";

    @NotNull
    public static final String PARAM_CAROUSEL_WALLPAPERS = "carousel_wallpapers";

    private OperaConfigBundleSheet() {
    }

    private final List<String> extractCarouselWallpapers(ActionContext actionContext) {
        Map<String, ?> map;
        Object obj;
        ActionContext.ContextualValues contextualValues = actionContext.getContextualValues();
        ArrayList arrayList = null;
        if (contextualValues != null && (map = contextualValues.parameters) != null && (obj = map.get(PARAM_CAROUSEL_WALLPAPERS)) != null && (obj instanceof List)) {
            arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (obj2 instanceof String) {
                    arrayList.add(obj2);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeSheetRequest(ActionContext actionContext, tcl taskExecutor, orm usageReporter, qln wallpaperManager, ok5 uiProxy) {
        umi umiVar = (umi) taskExecutor;
        nml nmlVarE = umiVar.e(new odf((byte) 5));
        nmlVarE.b(umiVar.f(new ws1(wallpaperManager, usageReporter, actionContext, uiProxy, (byte) 12)));
        nmlVarE.a(actionContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResourceWrapper initializeSheetRequest$lambda$0(ActionContext actionContext) {
        String strStringNamed = actionContext.stringNamed(ARG_AVATAR_IMAGE);
        return (strStringNamed == null || strStringNamed.length() == 0) ? ResourceWrapper.EMPTY : ResourceWrapper.INSTANCE.getResourceFromInputStream(actionContext.streamNamed(ARG_AVATAR_IMAGE), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeSheetRequest$lambda$1(qln qlnVar, final orm ormVar, final ActionContext actionContext, ok5 ok5Var, final ResourceWrapper resourceWrapper) {
        if (resourceWrapper.image == null) {
            xf8.F0((pde) qlnVar.k.b, v08.a);
            ((x5f) ormVar).p0("Unable to load avatar image for config bundle sheet", eg0.e, actionContext.getMessageId());
            return Unit.a;
        }
        String strStringNamed = actionContext.stringNamed("Title");
        String strStringNamed2 = actionContext.stringNamed(MessageTemplateConstants.Args.MESSAGE);
        String strStringNamed3 = actionContext.stringNamed(OperaArgs.PRIMARY_TEXT);
        Bitmap bitmap = resourceWrapper.image;
        l08 l08VarExtractCarouselWallpapers = INSTANCE.extractCarouselWallpapers(actionContext);
        if (l08VarExtractCarouselWallpapers == null) {
            l08VarExtractCarouselWallpapers = l08.a;
        }
        qlnVar.f.r(new i61((Object) ok5Var, (Object) qlnVar, (Object) ormVar, (Object) new nk5(strStringNamed, strStringNamed2, strStringNamed3, bitmap, l08VarExtractCarouselWallpapers), (Object) new mk5() { // from class: com.leanplum.messagetemplates.OperaConfigBundleSheet$initializeSheetRequest$2$1
            @Override // defpackage.mk5
            public void onFinished(hjm reason) {
                hjm hjmVar = hjm.a;
                if (reason == hjmVar) {
                    actionContext.trackMessageEvent(OperaArgs.PRIMARY_ACTION, 0.0d, null, null);
                }
                orm ormVar2 = ormVar;
                ((x5f) ormVar2).Y(gg0.f, reason == hjmVar ? vb0.b : vb0.d, 1L, resourceWrapper.status, actionContext.getMessageId());
            }
        }, (byte) 1));
        return Unit.a;
    }

    public final void register(@NotNull final tcl taskExecutor, @NotNull final orm usageReporter) {
        Leanplum.defineAction(NAME, 3, new ActionArgs().with("Title", null).with(MessageTemplateConstants.Args.MESSAGE, null).with(OperaArgs.PRIMARY_TEXT, null).withFile(ARG_AVATAR_IMAGE, null), new ActionCallback() { // from class: com.leanplum.messagetemplates.OperaConfigBundleSheet.register.1
            @Override // com.leanplum.callbacks.ActionCallback
            public boolean onResponse(ActionContext context) {
                Leanplum.addOnceVariablesChangedAndNoDownloadsPendingHandler(new OperaConfigBundleSheet$register$1$onResponse$1(context, taskExecutor, usageReporter));
                return true;
            }
        });
    }
}
