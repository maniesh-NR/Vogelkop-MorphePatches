package com.leanplum.messagetemplates;

import android.content.Context;
import android.net.Uri;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.internal.Constants;
import com.leanplum.internal.FileManager;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import com.leanplum.messagetemplates.OperaSheetRequest;
import com.opera.android.BrowserActivity;
import com.opera.api.Callback;
import defpackage.eel;
import defpackage.eg0;
import defpackage.ex1;
import defpackage.fmk;
import defpackage.fx1;
import defpackage.gx1;
import defpackage.hx1;
import defpackage.hz;
import defpackage.ix1;
import defpackage.iyk;
import defpackage.jk6;
import defpackage.o1;
import defpackage.oml;
import defpackage.qlk;
import defpackage.qp2;
import defpackage.rii;
import defpackage.rw7;
import defpackage.sw7;
import defpackage.umi;
import defpackage.vml;
import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aC\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00032\u001a\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a6\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/leanplum/ActionContext;", "actionContext", "", "", "getCategories", "(Lcom/leanplum/ActionContext;)Ljava/util/Set;", Constants.Params.NAME, "Landroid/net/Uri;", "getFileUri", "(Lcom/leanplum/ActionContext;Ljava/lang/String;)Landroid/net/Uri;", "Lcom/leanplum/messagetemplates/OperaSheetRequest$Model;", "model", "Lcom/opera/api/Callback;", "Ltw7;", "Lcom/leanplum/messagetemplates/DiscardInfo;", "callback", "", "performStringSubstitution", "(Lcom/leanplum/messagetemplates/OperaSheetRequest$Model;Lcom/opera/api/Callback;)V", "Landroid/content/Context;", "context", "validateActionUrl", "(Landroid/content/Context;Lcom/leanplum/ActionContext;Ljava/lang/String;Lcom/opera/api/Callback;)V", "validateActionUrlInternal", "(Landroid/content/Context;Lcom/leanplum/ActionContext;Ljava/lang/String;Lmt5;)Ljava/lang/Object;", "getActionUrl", "(Lcom/leanplum/ActionContext;Ljava/lang/String;)Ljava/lang/String;", "app"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UtilsKt {

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 1328)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[jk6.values().length];
            try {
                jk6 jk6Var = jk6.a;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                jk6 jk6Var2 = jk6.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                jk6 jk6Var3 = jk6.a;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                jk6 jk6Var4 = jk6.a;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 1328)
    /* renamed from: com.leanplum.messagetemplates.UtilsKt$getCategories$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 extends nr9 implements Function1<String, String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1, StringsKt.class, "trim", "trim(Ljava/lang/String;)Ljava/lang/String;", 1);
        }

        public final String invoke(String str) {
            return StringsKt.l0(str).toString();
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 1328)
    /* renamed from: com.leanplum.messagetemplates.UtilsKt$getCategories$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 extends nr9 implements Function1<String, Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1, StringsKt.class, "isNotEmpty", "isNotEmpty(Ljava/lang/CharSequence;)Z", 1);
        }

        public final Boolean invoke(String str) {
            return Boolean.valueOf(str.length() > 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lnx5;", "", "<anonymous>", "(Lnx5;)V"}, k = 3, mv = {2, 4, 0})
    @ri6(c = "com.leanplum.messagetemplates.UtilsKt$validateActionUrl$1", f = "Utils.kt", l = {129}, m = "invokeSuspend", v = 2)
    /* renamed from: com.leanplum.messagetemplates.UtilsKt$validateActionUrl$1, reason: invalid class name and case insensitive filesystem */
    static final class C00061 extends kuk implements Function2<nx5, mt5<? super Unit>, Object> {
        final /* synthetic */ ActionContext $actionContext;
        final /* synthetic */ Callback $callback;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $name;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00061(Callback callback, Context context, ActionContext actionContext, String str, mt5<? super C00061> mt5Var) {
            super(2, mt5Var);
            this.$callback = callback;
            this.$context = context;
            this.$actionContext = actionContext;
            this.$name = str;
        }

        public final mt5<Unit> create(Object obj, mt5<?> mt5Var) {
            return new C00061(this.$callback, this.$context, this.$actionContext, this.$name, mt5Var);
        }

        public final Object invoke(nx5 nx5Var, mt5<? super Unit> mt5Var) {
            return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            Callback callback;
            px5 px5Var = px5.a;
            int i = this.label;
            if (i == 0) {
                ybh.y(obj);
                Callback callback2 = this.$callback;
                Context context = this.$context;
                ActionContext actionContext = this.$actionContext;
                String str = this.$name;
                this.L$0 = callback2;
                this.label = 1;
                Object objValidateActionUrlInternal = UtilsKt.validateActionUrlInternal(context, actionContext, str, this);
                if (objValidateActionUrlInternal == px5Var) {
                    return px5Var;
                }
                obj = objValidateActionUrlInternal;
                callback = callback2;
            } else {
                if (i != 1) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                callback = (Callback) this.L$0;
                ybh.y(obj);
            }
            callback.run(obj);
            return Unit.a;
        }
    }

    @ri6(c = "com.leanplum.messagetemplates.UtilsKt", f = "Utils.kt", l = {140}, m = "validateActionUrlInternal", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 560)
    /* renamed from: com.leanplum.messagetemplates.UtilsKt$validateActionUrlInternal$1, reason: invalid class name and case insensitive filesystem */
    static final class C00071 extends nt5 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C00071(mt5<? super C00071> mt5Var) {
            super(mt5Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UtilsKt.validateActionUrlInternal(null, null, null, this);
        }
    }

    public static final String getActionUrl(@NotNull ActionContext actionContext, @NotNull String str) {
        Object objObjectNamed = actionContext.objectNamed(str);
        if (!(objObjectNamed instanceof Map)) {
            return null;
        }
        Object obj = ((Map) objObjectNamed).get(MessageTemplateConstants.Args.URL);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @NotNull
    public static final Set<String> getCategories(@NotNull ActionContext actionContext) {
        Set<String> setH;
        Object obj = Leanplum.messageMetadata().get(actionContext.getMessageId());
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return v08.a;
        }
        Object obj2 = map.get("inappCategories");
        String str = obj2 instanceof String ? (String) obj2 : null;
        return (str == null || (setH = y1j.h(y1j.c(new m2m(StringsKt.Z(str, new String[]{","}), AnonymousClass1.INSTANCE), AnonymousClass2.INSTANCE))) == null) ? v08.a : setH;
    }

    public static final Uri getFileUri(@NotNull ActionContext actionContext, @NotNull String str) {
        String strStringNamed = actionContext.stringNamed(str);
        if (strStringNamed == null || strStringNamed.length() == 0) {
            return null;
        }
        String strFilePath = ActionContext.filePath(strStringNamed);
        if (FileManager.fileExistsAtPath(strFilePath)) {
            return Uri.fromFile(new File(strFilePath));
        }
        return null;
    }

    public static final void performStringSubstitution(@NotNull OperaSheetRequest.Model model, @NotNull Callback callback) {
        boolean z;
        eg0 eg0Var = eg0.d;
        try {
            String str = model.title;
            boolean z2 = false;
            o1 o1VarL = rii.l(0, str);
            byte b = 1;
            if (o1VarL == null) {
                z = false;
            } else {
                while (o1VarL != null) {
                    o1VarL = rii.l(o1VarL.c + o1VarL.d, str);
                }
                z = true;
            }
            if (!z) {
                String str2 = model.message;
                o1 o1VarL2 = rii.l(0, str2);
                if (o1VarL2 != null) {
                    while (o1VarL2 != null) {
                        o1VarL2 = rii.l(o1VarL2.c + o1VarL2.d, str2);
                    }
                    z2 = true;
                }
                if (!z2) {
                    callback.run(new sw7(model));
                    return;
                }
            }
            Object currentActivity = LeanplumActivityHelper.getCurrentActivity();
            if (!(currentActivity instanceof BrowserActivity)) {
                callback.run(new rw7(new DiscardInfo("Invalid activity", eg0Var)));
                return;
            }
            fmk fmkVar = (fmk) ((BrowserActivity) currentActivity).y.a.y().get();
            iyk iykVar = new iyk(callback, model, (byte) 6);
            umi umiVar = vml.d;
            hz hzVar = new hz();
            hzVar.b = iykVar;
            new oml(umiVar.d(new qlk(hzVar, b))).b(null, 5L, TimeUnit.SECONDS, null);
            fmkVar.d.add(hzVar);
            fmkVar.b();
        } catch (eel e) {
            callback.run(new rw7(new DiscardInfo(e.getMessage(), eg0Var)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performStringSubstitution$lambda$0(final Callback callback, final OperaSheetRequest.Model model, ex1 ex1Var) {
        gx1 gx1Var = new gx1() { // from class: com.leanplum.messagetemplates.UtilsKt$performStringSubstitution$1$1
            @Override // defpackage.gx1
            public void handleArgumentLookupResult(fx1 failure) {
                callback.run(new rw7(new DiscardInfo(failure.c, eg0.d)));
            }

            @Override // defpackage.gx1
            public void handleArgumentLookupResult(hx1 success) {
                OperaSheetRequest.Model q0iVar;
                rii riiVar = new rii(success.c, (byte) 7);
                Callback callback2 = callback;
                OperaSheetRequest.Model model2 = model;
                try {
                    p0i p0iVar = t0i.b;
                    q0iVar = OperaSheetRequest.Model.copy$default(model2, null, null, riiVar.x(model2.title), riiVar.x(model2.message), null, null, null, false, null, 499, null);
                } catch (Throwable th) {
                    p0i p0iVar2 = t0i.b;
                    q0iVar = new q0i(th);
                }
                Throwable thD = t0i.d(q0iVar);
                Object sw7Var = thD == null ? new sw7(q0iVar) : new rw7(thD);
                if (sw7Var instanceof rw7) {
                    sw7Var = new rw7(new DiscardInfo(((Throwable) ((rw7) sw7Var).a).getMessage(), eg0.d));
                } else if (!(sw7Var instanceof sw7)) {
                    h9o.p();
                    return;
                }
                callback2.run(sw7Var);
            }
        };
        Object obj = ex1Var.a;
        int iOrdinal = ((ix1) ex1Var.b).ordinal();
        if (iOrdinal == 0) {
            gx1Var.handleArgumentLookupResult((hx1) obj);
        } else {
            if (iOrdinal != 1) {
                return;
            }
            gx1Var.handleArgumentLookupResult((fx1) obj);
        }
    }

    public static final void validateActionUrl(@NotNull Context context, @NotNull ActionContext actionContext, @NotNull String str, @NotNull Callback callback) {
        ndc currentActivity = LeanplumActivityHelper.getCurrentActivity();
        if (currentActivity instanceof BrowserActivity) {
            na2.B(cqp.V(currentActivity.getLifecycle()), (CoroutineContext) null, (rx5) null, new C00061(callback, context, actionContext, str, null), 3);
        } else {
            callback.run(new rw7(new DiscardInfo("Invalid activity", eg0.f)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object validateActionUrlInternal(android.content.Context r5, com.leanplum.ActionContext r6, java.lang.String r7, mt5<? super defpackage.tw7> r8) {
        /*
            boolean r0 = r8 instanceof com.leanplum.messagetemplates.UtilsKt.C00071
            if (r0 == 0) goto L13
            r0 = r8
            com.leanplum.messagetemplates.UtilsKt$validateActionUrlInternal$1 r0 = (com.leanplum.messagetemplates.UtilsKt.C00071) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.leanplum.messagetemplates.UtilsKt$validateActionUrlInternal$1 r0 = new com.leanplum.messagetemplates.UtilsKt$validateActionUrlInternal$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            px5 r1 = px5.a
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L38
            java.lang.Object r5 = r0.L$3
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.L$2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.L$1
            com.leanplum.ActionContext r6 = (com.leanplum.ActionContext) r6
            java.lang.Object r6 = r0.L$0
            android.content.Context r6 = (android.content.Context) r6
            ybh.y(r8)
            goto L6b
        L38:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r4
        L3e:
            ybh.y(r8)
            java.lang.String r6 = getActionUrl(r6, r7)
            if (r6 != 0) goto L4d
            sw7 r5 = new sw7
            r5.<init>(r4)
            return r5
        L4d:
            boolean r7 = defpackage.wqm.s(r6)
            if (r7 == 0) goto L9a
            lk6 r7 = defpackage.lk6.a
            android.net.Uri r8 = android.net.Uri.parse(r6)
            r0.L$0 = r4
            r0.L$1 = r4
            r0.L$2 = r4
            r0.L$3 = r6
            r0.label = r3
            java.lang.Enum r8 = r7.d(r8, r5, r0)
            if (r8 != r1) goto L6a
            return r1
        L6a:
            r5 = r6
        L6b:
            jk6 r8 = (defpackage.jk6) r8
            int r6 = r8.ordinal()
            if (r6 == 0) goto L99
            if (r6 == r3) goto L8c
            r7 = 2
            if (r6 == r7) goto L7f
            r7 = 3
            if (r6 == r7) goto L8c
            h9o.p()
            return r4
        L7f:
            com.leanplum.messagetemplates.DiscardInfo r6 = new com.leanplum.messagetemplates.DiscardInfo
            eg0 r7 = defpackage.eg0.c
            r6.<init>(r5, r7)
            rw7 r5 = new rw7
            r5.<init>(r6)
            return r5
        L8c:
            com.leanplum.messagetemplates.DiscardInfo r6 = new com.leanplum.messagetemplates.DiscardInfo
            eg0 r7 = defpackage.eg0.b
            r6.<init>(r5, r7)
            rw7 r5 = new rw7
            r5.<init>(r6)
            return r5
        L99:
            r6 = r5
        L9a:
            sw7 r5 = new sw7
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.messagetemplates.UtilsKt.validateActionUrlInternal(android.content.Context, com.leanplum.ActionContext, java.lang.String, mt5):java.lang.Object");
    }
}
