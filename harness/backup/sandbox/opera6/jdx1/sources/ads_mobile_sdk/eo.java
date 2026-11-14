package ads_mobile_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.prb;
import defpackage.w7p;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class eo implements w7p {
    public final Context b;
    public final xq0 c;
    public final a80 d;
    public final o03 e;
    public final aj f;
    public prb j;
    public boolean p;
    public boolean q;
    public boolean r;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final pfe i = new pfe();
    public final AtomicReference k = new AtomicReference((yz) yz.w().a());
    public final AtomicReference l = new AtomicReference((hb2) hb2.r().a());
    public final AtomicReference m = new AtomicReference((mg2) mg2.r().a());
    public final AtomicReference n = new AtomicReference(n08.a);
    public final AtomicBoolean o = new AtomicBoolean(false);

    public eo(Context context, xq0 xq0Var, a80 a80Var, o03 o03Var, aj ajVar) {
        this.b = context;
        this.c = xq0Var;
        this.d = a80Var;
        this.e = o03Var;
        this.f = ajVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        if (r9 != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084 A[PHI: r8
      0x0084: PHI (r8v3 ads_mobile_sdk.eo) = (r8v2 ads_mobile_sdk.eo), (r8v10 ads_mobile_sdk.eo) binds: [B:25:0x0082, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.eo r8, nt5 r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof ads_mobile_sdk.sn
            if (r0 == 0) goto L16
            r0 = r9
            ads_mobile_sdk.sn r0 = (ads_mobile_sdk.sn) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            ads_mobile_sdk.sn r0 = new ads_mobile_sdk.sn
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L4f
            if (r2 == r7) goto L49
            if (r2 == r6) goto L43
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L37
            ads_mobile_sdk.eo r8 = r0.a
            defpackage.ybh.y(r9)
            goto Lad
        L37:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r3
        L3d:
            ads_mobile_sdk.eo r8 = r0.a
            defpackage.ybh.y(r9)
            goto L84
        L43:
            ads_mobile_sdk.eo r8 = r0.a
            defpackage.ybh.y(r9)
            goto L73
        L49:
            ads_mobile_sdk.eo r8 = r0.a
            defpackage.ybh.y(r9)
            goto L67
        L4f:
            defpackage.ybh.y(r9)
            r8.q = r7
            prb r9 = new prb
            r9.<init>()
            r8.j = r9
            ads_mobile_sdk.xq0 r9 = r8.c
            r0.a = r8
            r0.d = r7
            java.lang.Object r9 = r9.b(r0)
            if (r9 == r1) goto Lac
        L67:
            ads_mobile_sdk.a80 r9 = r8.d
            r0.a = r8
            r0.d = r6
            java.lang.Object r9 = r9.a(r0)
            if (r9 == r1) goto Lac
        L73:
            ads_mobile_sdk.o03 r9 = r8.e
            r0.a = r8
            r0.d = r5
            r9.getClass()
            java.lang.String r2 = ""
            java.lang.Object r9 = ads_mobile_sdk.o03.a(r9, r2, r0)
            if (r9 == r1) goto Lac
        L84:
            ads_mobile_sdk.aj r9 = r8.f
            r0.a = r8
            r0.d = r4
            r9.getClass()
            ads_mobile_sdk.xi r2 = ads_mobile_sdk.xi.x()
            kap r9 = r9.a
            java.lang.Object r9 = r9.get()
            qd6 r9 = (defpackage.qd6) r9
            hmo r5 = new hmo
            r5.<init>(r4, r3, r2)
            java.lang.Object r9 = r9.a(r5, r0)
            if (r9 == r1) goto La6
            kotlin.Unit r9 = kotlin.Unit.a
        La6:
            if (r9 == r1) goto Laa
            kotlin.Unit r9 = kotlin.Unit.a
        Laa:
            if (r9 != r1) goto Lad
        Lac:
            return r1
        Lad:
            java.util.concurrent.atomic.AtomicBoolean r8 = r8.o
            r9 = 0
            r8.set(r9)
            java.lang.String r8 = "Flags were reset because too many sessions have passed without updating flags"
            r9 = 6
            ads_mobile_sdk.xh3.a(r8, r3, r9)
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.eo.a(ads_mobile_sdk.eo, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd A[EDGE_INSN: B:45:0x00dd->B:26:0x00dd BREAK  A[LOOP:0: B:12:0x00a3->B:47:0x00a3], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(ads_mobile_sdk.eo r16, android.app.ActivityManager r17, defpackage.prb r18) {
        /*
            r0 = r18
            r16.getClass()
            r1 = r16
            android.content.Context r1 = r1.b
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.String r3 = "gads:previous_exit_reason_reset_threshold"
            pqb r3 = r0.u(r3)     // Catch: java.lang.Exception -> L1d
            double r3 = r3.d()     // Catch: java.lang.Exception -> L1d
            java.lang.Double r2 = java.lang.Double.valueOf(r3)     // Catch: java.lang.Exception -> L1d
        L1d:
            double r2 = r2.doubleValue()
            r4 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r2 = java.lang.Math.min(r2, r4)
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = java.lang.Math.max(r4, r2)
            int r6 = (int) r2
            r7 = 1
            int r6 = r6 << r7
            r8 = 10
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "gads:previous_exit_reasons_to_scan"
            pqb r9 = r0.u(r9)     // Catch: java.lang.Exception -> L44
            int r9 = r9.f()     // Catch: java.lang.Exception -> L44
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L44
        L44:
            int r8 = r8.intValue()
            int r6 = java.lang.Math.max(r6, r8)
            r8 = 20
            int r6 = java.lang.Math.min(r6, r8)
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.String r8 = "gads:previous_exit_reason_values"
            ads_mobile_sdk.ir0 r9 = defpackage.w7p.a
            r9.getClass()
            prb r9 = ads_mobile_sdk.ir0.b
            pqb r8 = r0.u(r8)     // Catch: java.lang.Exception -> L75
            m5a r10 = new m5a     // Catch: java.lang.Exception -> L75
            r10.<init>()     // Catch: java.lang.Exception -> L75
            java.lang.String r8 = r8.n()     // Catch: java.lang.Exception -> L75
            java.lang.Class<prb> r11 = defpackage.prb.class
            java.lang.Object r8 = r10.b(r11, r8)     // Catch: java.lang.Exception -> L75
            prb r8 = (defpackage.prb) r8     // Catch: java.lang.Exception -> L75
            r9 = r8
        L75:
            r10 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            java.lang.Double r8 = java.lang.Double.valueOf(r10)
            java.lang.String r10 = "gads:unspecified_exit_reason_value"
            pqb r0 = r0.u(r10)     // Catch: java.lang.Exception -> L89
            double r10 = r0.d()     // Catch: java.lang.Exception -> L89
            java.lang.Double r8 = java.lang.Double.valueOf(r10)     // Catch: java.lang.Exception -> L89
        L89:
            double r10 = r8.doubleValue()
            double r4 = java.lang.Math.min(r4, r10)
            java.lang.String r0 = r1.getPackageName()
            r8 = 0
            r10 = r17
            java.util.List r0 = r10.getHistoricalProcessExitReasons(r0, r8, r6)
            java.util.Iterator r0 = r0.iterator()
            r10 = 0
            r12 = r10
        La3:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto Ldd
            java.lang.Object r6 = r0.next()
            android.app.ApplicationExitInfo r6 = h9o.d(r6)
            java.lang.String r14 = r6.getProcessName()
            java.lang.String r15 = r1.getPackageName()
            boolean r14 = kotlin.jvm.internal.Intrinsics.a(r14, r15)
            if (r14 == 0) goto La3
            int r6 = r6.getReason()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            if (r9 == 0) goto Ld2
            pqb r6 = r9.u(r6)     // Catch: java.lang.Exception -> Ld2
            double r14 = r6.d()     // Catch: java.lang.Exception -> Ld2
            goto Ld3
        Ld2:
            r14 = r4
        Ld3:
            double r12 = r12 + r14
            int r6 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r6 < 0) goto Ldd
            int r6 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r6 < 0) goto La3
            goto Lde
        Ldd:
            r7 = r8
        Lde:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.eo.a(ads_mobile_sdk.eo, android.app.ActivityManager, prb):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[Catch: all -> 0x0193, TryCatch #1 {all -> 0x0193, blocks: (B:29:0x0080, B:31:0x008a, B:33:0x0094, B:35:0x009e, B:67:0x0105, B:69:0x010b, B:71:0x0111, B:73:0x0117, B:78:0x0168, B:79:0x017e, B:21:0x005a, B:23:0x0062), top: B:95:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010b A[Catch: all -> 0x0193, TryCatch #1 {all -> 0x0193, blocks: (B:29:0x0080, B:31:0x008a, B:33:0x0094, B:35:0x009e, B:67:0x0105, B:69:0x010b, B:71:0x0111, B:73:0x0117, B:78:0x0168, B:79:0x017e, B:21:0x005a, B:23:0x0062), top: B:95:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0161 A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #5 {all -> 0x018f, blocks: (B:39:0x00c6, B:40:0x00c9, B:43:0x00ce, B:50:0x00df, B:53:0x00e4, B:59:0x00f3, B:62:0x00f8, B:74:0x0152, B:75:0x0158, B:77:0x0161), top: B:102:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.t70 r8, mt5 r9) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.eo.a(ads_mobile_sdk.t70, mt5):java.lang.Object");
    }

    public final Object a(String str, Function1 function1) {
        ah3 ah3Var;
        if (!this.g.get()) {
            xu0.b("Flags have not been initialized!", null);
            IllegalStateException illegalStateException = new IllegalStateException("Flags have not been initialized!");
            illegalStateException.printStackTrace();
            wq wqVar = vq.a;
            if (wqVar == wq.b || wqVar == wq.c) {
                throw illegalStateException;
            }
            if (wqVar == wq.a && (ah3Var = nw.a) != null) {
                ah3Var.a("Flags have not been initialized!", (Throwable) illegalStateException);
            }
        }
        try {
            prb prbVar = this.j;
            if (prbVar == null) {
                prbVar = null;
            }
            return function1.invoke(prbVar.u(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a() {
        Boolean boolValueOf;
        Integer numValueOf;
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("GoogleMobileAds", 0);
        String strN = null;
        try {
            prb prbVar = this.j;
            if (prbVar == null) {
                prbVar = null;
            }
            boolValueOf = Boolean.valueOf(prbVar.u("gads:initialize_webview_before_dagger").c());
        } catch (Exception unused) {
            boolValueOf = null;
        }
        if (!Intrinsics.a(boolValueOf, Boolean.TRUE)) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove("early_webview_init_count");
            editorEdit.remove("early_webview_init_profiles");
            editorEdit.apply();
            return;
        }
        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
        try {
            prb prbVar2 = this.j;
            if (prbVar2 == null) {
                prbVar2 = null;
            }
            numValueOf = Integer.valueOf(prbVar2.u("gads:initialize_webview_before_dagger:count").f());
        } catch (Exception unused2) {
            numValueOf = null;
        }
        editorEdit2.putInt("early_webview_init_count", numValueOf != null ? numValueOf.intValue() : 5);
        editorEdit2.apply();
        try {
            prb prbVar3 = this.j;
            if (prbVar3 == null) {
                prbVar3 = null;
            }
            strN = prbVar3.u("gads:initialize_webview_before_dagger:profiles").n();
        } catch (Exception unused3) {
        }
        if (strN == null) {
            strN = "";
        }
        if (StringsKt.N(strN)) {
            return;
        }
        SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
        editorEdit3.putString("early_webview_init_profiles", strN);
        editorEdit3.apply();
    }
}
