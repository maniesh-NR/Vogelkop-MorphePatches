package ads_mobile_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.webkit.CookieManager;
import defpackage.ayo;
import defpackage.fep;
import defpackage.fsg;
import defpackage.ic4;
import defpackage.mip;
import defpackage.o0g;
import defpackage.oip;
import defpackage.prb;
import defpackage.skp;
import defpackage.w7p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vz extends k61 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final Pattern R = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    public static final prb S;
    public static final prb T;
    public static final Bundle U;
    public final pfe A;
    public prb B;
    public final ft1 C;
    public final ynb D;
    public CookieManager E;
    public SharedPreferences F;
    public final ft1 G;
    public final pfe H;
    public d3k I;
    public boolean J;
    public final pfe K;
    public jr L;
    public i07 M;
    public final pfe N;
    public String O;
    public i07 P;
    public long Q;
    public final Context c;
    public final nx5 d;
    public final bk1 e;
    public final ah3 f;
    public final m5a g;
    public final qr0 h;
    public final ax0 i;
    public final ayo j;
    public final ki k;
    public final ha2 l;
    public final gg3 m;
    public final xk n;
    public final bn0 o;
    public final mip p;
    public final ux2 q;
    public final a3 s;
    public final w7p t;
    public final gr0 u;
    public final xq0 v;
    public final a80 w;
    public final ae2 x;
    public final pfe y;
    public Bundle z;

    static {
        prb prbVar = new prb();
        Boolean bool = Boolean.TRUE;
        prbVar.q("gad_idless", bool);
        Boolean bool2 = Boolean.FALSE;
        prbVar.q("has_special_purposes", bool2);
        S = prbVar;
        prb prbVar2 = new prb();
        prbVar2.q("gad_idless", bool2);
        prbVar2.q("has_special_purposes", bool);
        T = prbVar2;
        U = ic4.m(new Pair("fake_key", "fake_val"));
    }

    public vz(Context context, nx5 nx5Var, bk1 bk1Var, ah3 ah3Var, m5a m5aVar, qr0 qr0Var, ax0 ax0Var, ayo ayoVar, ki kiVar, ha2 ha2Var, gg3 gg3Var, xk xkVar, bn0 bn0Var, mip mipVar, ux2 ux2Var, skp skpVar, a3 a3Var, w7p w7pVar, gr0 gr0Var, xq0 xq0Var, a80 a80Var, ae2 ae2Var) {
        super(fw0.CUI_NAME_SDKINIT_INIT_CONSENT_STATE, 2);
        this.c = context;
        this.d = nx5Var;
        this.e = bk1Var;
        this.f = ah3Var;
        this.g = m5aVar;
        this.h = qr0Var;
        this.i = ax0Var;
        this.j = ayoVar;
        this.k = kiVar;
        this.l = ha2Var;
        this.m = gg3Var;
        this.n = xkVar;
        this.o = bn0Var;
        this.p = mipVar;
        this.q = ux2Var;
        this.s = a3Var;
        this.t = w7pVar;
        this.u = gr0Var;
        this.v = xq0Var;
        this.w = a80Var;
        this.x = ae2Var;
        this.y = new pfe();
        this.z = U;
        this.A = new pfe();
        this.B = S;
        this.C = new ft1((qx) qx.s().a());
        this.D = o0g.e();
        skpVar.getClass();
        this.G = new ft1(String.valueOf(new Random().nextInt(Integer.MAX_VALUE)));
        this.H = new pfe();
        this.K = new pfe();
        this.N = new pfe();
        pn7.b.getClass();
        this.Q = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.vz r10, android.net.Uri r11, android.view.MotionEvent r12, nt5 r13) {
        /*
            boolean r0 = r13 instanceof ads_mobile_sdk.kz
            if (r0 == 0) goto L13
            r0 = r13
            ads_mobile_sdk.kz r0 = (ads_mobile_sdk.kz) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.kz r0 = new ads_mobile_sdk.kz
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.e
            px5 r1 = px5.a
            int r2 = r0.g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            defpackage.ybh.y(r13)
            goto L88
        L2a:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            r10 = 0
            return r10
        L31:
            ads_mobile_sdk.ox r10 = r0.d
            android.view.MotionEvent r12 = r0.c
            android.net.Uri r11 = r0.b
            ads_mobile_sdk.vz r2 = r0.a
            defpackage.ybh.y(r13)
        L3c:
            r6 = r11
            r7 = r12
            goto L5a
        L3f:
            defpackage.ybh.y(r13)
            ads_mobile_sdk.ft1 r13 = r10.C
            r0.a = r10
            r0.b = r11
            r0.c = r12
            ads_mobile_sdk.ox r2 = ads_mobile_sdk.ox.API_ATTRIBUTION_REPORTING
            r0.d = r2
            r0.g = r4
            java.lang.Object r13 = r13.a(r0)
            if (r13 == r1) goto L87
            r6 = r2
            r2 = r10
            r10 = r6
            goto L3c
        L5a:
            ads_mobile_sdk.qx r13 = (ads_mobile_sdk.qx) r13
            hf0 r11 = r13.p()
            boolean r10 = r11.contains(r10)
            r8 = 0
            if (r10 == 0) goto L8b
            ads_mobile_sdk.xk r5 = r2.n
            r0.a = r8
            r0.b = r8
            r0.c = r8
            r0.d = r8
            r0.g = r3
            nx5 r10 = r5.b
            sto r4 = new sto
            r9 = 9
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = 3
            i07 r10 = defpackage.na2.g(r10, r8, r8, r4, r11)
            java.lang.Object r13 = r10.A(r0)
            if (r13 != r1) goto L88
        L87:
            return r1
        L88:
            rap r13 = (defpackage.rap) r13
            return r13
        L8b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.a(ads_mobile_sdk.vz, android.net.Uri, android.view.MotionEvent, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c8 A[Catch: all -> 0x0237, TryCatch #13 {all -> 0x0237, blocks: (B:22:0x005a, B:105:0x01c2, B:107:0x01c8, B:110:0x01d9, B:112:0x01dd), top: B:184:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d9 A[Catch: all -> 0x0237, TryCatch #13 {all -> 0x0237, blocks: (B:22:0x005a, B:105:0x01c2, B:107:0x01c8, B:110:0x01d9, B:112:0x01dd), top: B:184:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0244 A[Catch: all -> 0x026b, TryCatch #6 {all -> 0x026b, blocks: (B:142:0x023d, B:144:0x0244, B:146:0x024b, B:148:0x024f, B:150:0x0253, B:151:0x0254, B:152:0x0259, B:153:0x025a, B:154:0x0261, B:155:0x0262, B:156:0x0269, B:157:0x026a), top: B:172:0x023d }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x026a A[Catch: all -> 0x026b, TRY_LEAVE, TryCatch #6 {all -> 0x026b, blocks: (B:142:0x023d, B:144:0x0244, B:146:0x024b, B:148:0x024f, B:150:0x0253, B:151:0x0254, B:152:0x0259, B:153:0x025a, B:154:0x0261, B:155:0x0262, B:156:0x0269, B:157:0x026a), top: B:172:0x023d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106 A[Catch: all -> 0x0170, TryCatch #10 {all -> 0x0170, blocks: (B:34:0x008e, B:45:0x0100, B:47:0x0106, B:50:0x0117, B:52:0x011b), top: B:179:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117 A[Catch: all -> 0x0170, TryCatch #10 {all -> 0x0170, blocks: (B:34:0x008e, B:45:0x0100, B:47:0x0106, B:50:0x0117, B:52:0x011b), top: B:179:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017d A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:80:0x0176, B:82:0x017d, B:84:0x0184, B:86:0x0188, B:88:0x018c, B:89:0x018d, B:90:0x0192, B:91:0x0193, B:92:0x019a, B:93:0x019b, B:94:0x01a2, B:95:0x01a3), top: B:164:0x0176 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a3 A[Catch: all -> 0x01a4, TRY_LEAVE, TryCatch #1 {all -> 0x01a4, blocks: (B:80:0x0176, B:82:0x017d, B:84:0x0184, B:86:0x0188, B:88:0x018c, B:89:0x018d, B:90:0x0192, B:91:0x0193, B:92:0x019a, B:93:0x019b, B:94:0x01a2, B:95:0x01a3), top: B:164:0x0176 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.vz r13, nt5 r14) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.a(ads_mobile_sdk.vz, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.vz r7, boolean r8, nt5 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.uy
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.uy r0 = (ads_mobile_sdk.uy) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.uy r0 = new ads_mobile_sdk.uy
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.ybh.y(r9)
            goto L71
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r5
        L31:
            boolean r8 = r0.c
            ads_mobile_sdk.ox r7 = r0.b
            ads_mobile_sdk.vz r2 = r0.a
            defpackage.ybh.y(r9)
            goto L53
        L3b:
            defpackage.ybh.y(r9)
            ads_mobile_sdk.ft1 r9 = r7.C
            r0.a = r7
            ads_mobile_sdk.ox r2 = ads_mobile_sdk.ox.API_GET_TOPICS
            r0.b = r2
            r0.c = r8
            r0.f = r4
            java.lang.Object r9 = r9.a(r0)
            if (r9 == r1) goto L70
            r6 = r2
            r2 = r7
            r7 = r6
        L53:
            ads_mobile_sdk.qx r9 = (ads_mobile_sdk.qx) r9
            hf0 r9 = r9.p()
            boolean r7 = r9.contains(r7)
            if (r7 == 0) goto L74
            ads_mobile_sdk.gg3 r7 = r2.m
            r0.a = r5
            r0.b = r5
            r0.f = r3
            r7.getClass()
            java.lang.Object r9 = ads_mobile_sdk.gg3.a(r7, r8, r0)
            if (r9 != r1) goto L71
        L70:
            return r1
        L71:
            rap r9 = (defpackage.rap) r9
            return r9
        L74:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.a(ads_mobile_sdk.vz, boolean, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027c A[PHI: r1
      0x027c: PHI (r1v30 ads_mobile_sdk.vz) = (r1v27 ads_mobile_sdk.vz), (r1v31 ads_mobile_sdk.vz) binds: [B:116:0x027b, B:112:0x026d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.vz r18, boolean r19, boolean r20, nt5 r21) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.a(ads_mobile_sdk.vz, boolean, boolean, nt5):java.lang.Object");
    }

    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size() || !bundle.keySet().containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                if (!a((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
            } else if (!Intrinsics.a(obj, obj2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.vz r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.ky
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.ky r0 = (ads_mobile_sdk.ky) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.ky r0 = new ads_mobile_sdk.ky
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            pfe r5 = r0.b
            ads_mobile_sdk.vz r0 = r0.a
            defpackage.ybh.y(r6)
            r6 = r5
            r5 = r0
            goto L46
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L34:
            defpackage.ybh.y(r6)
            pfe r6 = r5.A
            r0.a = r5
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            prb r5 = r5.B     // Catch: java.lang.Throwable -> L4c
            r6.l(r4)
            return r5
        L4c:
            r5 = move-exception
            r6.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.b(ads_mobile_sdk.vz, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (r8.Z(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.vz r7, boolean r8, boolean r9, nt5 r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.gz
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.gz r0 = (ads_mobile_sdk.gz) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.gz r0 = new ads_mobile_sdk.gz
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.e
            px5 r1 = px5.a
            int r2 = r0.g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.ybh.y(r10)
            goto L89
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r5
        L31:
            boolean r9 = r0.d
            boolean r8 = r0.c
            pfe r7 = r0.b
            ads_mobile_sdk.vz r2 = r0.a
            defpackage.ybh.y(r10)
            r10 = r7
            r7 = r2
            goto L54
        L3f:
            defpackage.ybh.y(r10)
            pfe r10 = r7.H
            r0.a = r7
            r0.b = r10
            r0.c = r8
            r0.d = r9
            r0.g = r4
            java.lang.Object r2 = r10.i(r0)
            if (r2 == r1) goto L88
        L54:
            d3k r2 = r7.I     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L5b
            r2.k(r5)     // Catch: java.lang.Throwable -> L8c
        L5b:
            boolean r2 = r7.J     // Catch: java.lang.Throwable -> L8c
            if (r2 != 0) goto L62
            if (r8 != 0) goto L62
            r4 = 0
        L62:
            r7.J = r4     // Catch: java.lang.Throwable -> L8c
            nx5 r8 = r7.d     // Catch: java.lang.Throwable -> L8c
            ads_mobile_sdk.hz r2 = new ads_mobile_sdk.hz     // Catch: java.lang.Throwable -> L8c
            r2.<init>(r7, r4, r9, r5)     // Catch: java.lang.Throwable -> L8c
            kotlin.coroutines.h r9 = kotlin.coroutines.h.a     // Catch: java.lang.Throwable -> L8c
            fsg r4 = new fsg     // Catch: java.lang.Throwable -> L8c
            r6 = 3
            r4.<init>(r2, r5, r6)     // Catch: java.lang.Throwable -> L8c
            d3k r8 = defpackage.na2.B(r8, r9, r5, r4, r3)     // Catch: java.lang.Throwable -> L8c
            r7.I = r8     // Catch: java.lang.Throwable -> L8c
            r10.l(r5)
            r0.a = r5
            r0.b = r5
            r0.g = r3
            java.lang.Object r7 = r8.Z(r0)
            if (r7 != r1) goto L89
        L88:
            return r1
        L89:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L8c:
            r7 = move-exception
            r10.l(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.b(ads_mobile_sdk.vz, boolean, boolean, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(ads_mobile_sdk.vz r5, mt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.ly
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.ly r0 = (ads_mobile_sdk.ly) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.ly r0 = new ads_mobile_sdk.ly
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            pfe r5 = r0.b
            ads_mobile_sdk.vz r0 = r0.a
            defpackage.ybh.y(r6)
            r6 = r5
            r5 = r0
            goto L46
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L34:
            defpackage.ybh.y(r6)
            pfe r6 = r5.y
            r0.a = r5
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            android.os.Bundle r5 = r5.z     // Catch: java.lang.Throwable -> L4c
            r6.l(r4)
            return r5
        L4c:
            r5 = move-exception
            r6.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.c(ads_mobile_sdk.vz, mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(ads_mobile_sdk.vz r5, mt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.my
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.my r0 = (ads_mobile_sdk.my) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.my r0 = new ads_mobile_sdk.my
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.e
            px5 r1 = px5.a
            int r2 = r0.g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            m5a r5 = r0.d
            m5a r1 = r0.c
            pfe r2 = r0.b
            ads_mobile_sdk.vz r0 = r0.a
            defpackage.ybh.y(r6)
            goto L51
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L36:
            defpackage.ybh.y(r6)
            m5a r6 = r5.g
            pfe r2 = r5.y
            r0.a = r5
            r0.b = r2
            r0.c = r6
            r0.d = r6
            r0.g = r3
            java.lang.Object r0 = r2.i(r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
            r5 = r6
            r1 = r5
        L51:
            android.os.Bundle r6 = r0.z     // Catch: java.lang.Throwable -> L61
            r2.l(r4)
            java.lang.String r5 = r5.g(r6)
            java.lang.Class<prb> r6 = defpackage.prb.class
            java.lang.Object r5 = r1.b(r6, r5)
            return r5
        L61:
            r5 = move-exception
            r2.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.d(ads_mobile_sdk.vz, mt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0150, code lost:
    
        if (r8 != r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3 A[PHI: r6 r9
      0x00b3: PHI (r6v4 ads_mobile_sdk.vz) = (r6v2 ads_mobile_sdk.vz), (r6v5 ads_mobile_sdk.vz) binds: [B:22:0x00b1, B:16:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r9v8 java.lang.Object) = (r9v7 java.lang.Object), (r9v1 java.lang.Object) binds: [B:22:0x00b1, B:16:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012f A[PHI: r2 r3 r8
      0x012f: PHI (r2v17 ads_mobile_sdk.yz) = (r2v14 ads_mobile_sdk.yz), (r2v20 ads_mobile_sdk.yz) binds: [B:44:0x012d, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r3v4 ads_mobile_sdk.vz) = (r3v2 ads_mobile_sdk.vz), (r3v5 ads_mobile_sdk.vz) binds: [B:44:0x012d, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r8v21 ads_mobile_sdk.t70) = (r8v18 ads_mobile_sdk.t70), (r8v26 ads_mobile_sdk.t70) binds: [B:44:0x012d, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object e(ads_mobile_sdk.vz r8, nt5 r9) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.e(ads_mobile_sdk.vz, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object f(ads_mobile_sdk.vz r7, nt5 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.ty
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.ty r0 = (ads_mobile_sdk.ty) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.ty r0 = new ads_mobile_sdk.ty
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.ybh.y(r8)
            goto L6a
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r5
        L31:
            ads_mobile_sdk.ox r7 = r0.b
            ads_mobile_sdk.vz r2 = r0.a
            defpackage.ybh.y(r8)
            goto L4f
        L39:
            defpackage.ybh.y(r8)
            ads_mobile_sdk.ft1 r8 = r7.C
            r0.a = r7
            ads_mobile_sdk.ox r2 = ads_mobile_sdk.ox.API_READ_SESSION_ID
            r0.b = r2
            r0.e = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 == r1) goto L69
            r6 = r2
            r2 = r7
            r7 = r6
        L4f:
            ads_mobile_sdk.qx r8 = (ads_mobile_sdk.qx) r8
            hf0 r8 = r8.p()
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L6d
            ads_mobile_sdk.ft1 r7 = r2.G
            r0.a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r8 = r7.a(r0)
            if (r8 != r1) goto L6a
        L69:
            return r1
        L6a:
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L6d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.f(ads_mobile_sdk.vz, nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d A[Catch: all -> 0x0098, TRY_LEAVE, TryCatch #1 {all -> 0x0098, blocks: (B:13:0x002f, B:28:0x0087, B:30:0x008d), top: B:61:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8 A[Catch: all -> 0x00cf, TryCatch #3 {all -> 0x00cf, blocks: (B:37:0x00a1, B:39:0x00a8, B:41:0x00af, B:43:0x00b3, B:45:0x00b7, B:46:0x00b8, B:47:0x00bd, B:48:0x00be, B:49:0x00c5, B:50:0x00c6, B:51:0x00cd, B:52:0x00ce), top: B:65:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #3 {all -> 0x00cf, blocks: (B:37:0x00a1, B:39:0x00a8, B:41:0x00af, B:43:0x00b3, B:45:0x00b7, B:46:0x00b8, B:47:0x00bd, B:48:0x00be, B:49:0x00c5, B:50:0x00c6, B:51:0x00cd, B:52:0x00ce), top: B:65:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object g(ads_mobile_sdk.vz r7, nt5 r8) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.g(ads_mobile_sdk.vz, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x012d, code lost:
    
        if (r1 == r3) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:25:0x0081, B:27:0x009a, B:28:0x00a4, B:30:0x00a8, B:32:0x00e3, B:33:0x00ef, B:35:0x00f3, B:37:0x00f9, B:39:0x00ff), top: B:52:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4 A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:25:0x0081, B:27:0x009a, B:28:0x00a4, B:30:0x00a8, B:32:0x00e3, B:33:0x00ef, B:35:0x00f3, B:37:0x00f9, B:39:0x00ff), top: B:52:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object h(ads_mobile_sdk.vz r17, nt5 r18) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.h(ads_mobile_sdk.vz, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object i(ads_mobile_sdk.vz r12, nt5 r13) {
        /*
            boolean r0 = r13 instanceof ads_mobile_sdk.yy
            if (r0 == 0) goto L13
            r0 = r13
            ads_mobile_sdk.yy r0 = (ads_mobile_sdk.yy) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.yy r0 = new ads_mobile_sdk.yy
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ads_mobile_sdk.ox r12 = r0.b
            ads_mobile_sdk.vz r0 = r0.a
            defpackage.ybh.y(r13)
            goto L48
        L2c:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r12)
            return r3
        L32:
            defpackage.ybh.y(r13)
            ads_mobile_sdk.ft1 r13 = r12.C
            r0.a = r12
            ads_mobile_sdk.ox r2 = ads_mobile_sdk.ox.API_GET_WEBVIEW_COOKIE
            r0.b = r2
            r0.e = r4
            java.lang.Object r13 = r13.a(r0)
            if (r13 != r1) goto L46
            return r1
        L46:
            r0 = r12
            r12 = r2
        L48:
            ads_mobile_sdk.qx r13 = (ads_mobile_sdk.qx) r13
            hf0 r13 = r13.p()
            boolean r12 = r13.contains(r12)
            if (r12 == 0) goto Lac
            android.webkit.CookieManager r12 = r0.E
            if (r12 == 0) goto L6b
            ads_mobile_sdk.qr0 r13 = r0.h
            java.lang.String r0 = "https://googleads.g.doubleclick.net"
            ads_mobile_sdk.fo r1 = ads_mobile_sdk.fo.a$23
            java.lang.String r2 = "gads:webview_cookie_url"
            java.lang.Object r13 = r13.a(r2, r0, r1)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r12 = r12.getCookie(r13)
            goto L6c
        L6b:
            r12 = r3
        L6c:
            if (r12 == 0) goto Lac
            int r13 = r12.length()
            if (r13 == 0) goto Lac
            java.util.regex.Pattern r13 = ads_mobile_sdk.vz.R
            java.util.regex.Matcher r12 = r13.matcher(r12)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L7f:
            boolean r13 = r12.find()
            if (r13 == 0) goto L9f
            java.lang.String r13 = r12.group(r4)
            if (r13 == 0) goto L7f
            java.lang.String r0 = "id="
            boolean r0 = kotlin.text.c.q(r13, r0, r4)
            if (r0 != 0) goto L9b
            java.lang.String r0 = "ide="
            boolean r0 = kotlin.text.c.q(r13, r0, r4)
            if (r0 == 0) goto L7f
        L9b:
            r5.add(r13)
            goto L7f
        L9f:
            r10 = 0
            r11 = 62
            java.lang.String r6 = "; "
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r12 = kotlin.collections.CollectionsKt.P(r5, r6, r7, r8, r9, r10, r11)
            return r12
        Lac:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.i(ads_mobile_sdk.vz, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object j(ads_mobile_sdk.vz r4, nt5 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.bz
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.bz r0 = (ads_mobile_sdk.bz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.bz r0 = new ads_mobile_sdk.bz
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            px5 r1 = px5.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.ybh.y(r5)
            goto L3c
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.ybh.y(r5)
            ads_mobile_sdk.ft1 r4 = r4.C
            r0.c = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3c
            return r1
        L3c:
            ads_mobile_sdk.qx r5 = (ads_mobile_sdk.qx) r5
            hf0 r4 = r5.p()
            ads_mobile_sdk.ox r5 = ads_mobile_sdk.ox.API_READ_TRUSTLESS_TOKEN
            boolean r4 = r4.contains(r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.j(ads_mobile_sdk.vz, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (b(r11, false, true, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object k(ads_mobile_sdk.vz r11, nt5 r12) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.k(ads_mobile_sdk.vz, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(nt5 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.py
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.py r0 = (ads_mobile_sdk.py) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.py r0 = new ads_mobile_sdk.py
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.ybh.y(r8)
            goto L6e
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r5
        L31:
            ads_mobile_sdk.ox r7 = r0.b
            ads_mobile_sdk.vz r2 = r0.a
            defpackage.ybh.y(r8)
            goto L50
        L39:
            defpackage.ybh.y(r8)
            r0.a = r7
            ads_mobile_sdk.ox r8 = ads_mobile_sdk.ox.API_READ_FIREBASE_APP_ID
            r0.b = r8
            r0.e = r4
            ads_mobile_sdk.ft1 r2 = r7.C
            java.lang.Object r2 = r2.a(r0)
            if (r2 == r1) goto L6d
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L50:
            ads_mobile_sdk.qx r8 = (ads_mobile_sdk.qx) r8
            hf0 r8 = r8.p()
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L71
            ads_mobile_sdk.bn0 r7 = r2.o
            r0.a = r5
            r0.b = r5
            r0.e = r3
            r7.getClass()
            java.lang.Object r8 = ads_mobile_sdk.bn0.a(r7, r0)
            if (r8 != r1) goto L6e
        L6d:
            return r1
        L6e:
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L71:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.A(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(nt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.qy
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.qy r0 = (ads_mobile_sdk.qy) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.qy r0 = new ads_mobile_sdk.qy
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ads_mobile_sdk.ox r6 = r0.b
            ads_mobile_sdk.vz r0 = r0.a
            defpackage.ybh.y(r7)
            goto L4a
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L32:
            defpackage.ybh.y(r7)
            r0.a = r6
            ads_mobile_sdk.ox r7 = ads_mobile_sdk.ox.API_READ_FIREBASE_APP_INSTANCE_ID
            r0.b = r7
            r0.e = r4
            ads_mobile_sdk.ft1 r2 = r6.C
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L4a:
            ads_mobile_sdk.qx r7 = (ads_mobile_sdk.qx) r7
            hf0 r7 = r7.p()
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L65
            ads_mobile_sdk.bn0 r6 = r0.o
            java.lang.String r7 = "getAppInstanceId"
            java.lang.Object r6 = r6.a(r7)
            if (r6 == 0) goto L65
            java.lang.String r6 = r6.toString()
            return r6
        L65:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.B(nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(nt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.ry
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.ry r0 = (ads_mobile_sdk.ry) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.ry r0 = new ads_mobile_sdk.ry
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2c
            ads_mobile_sdk.ox r6 = r0.b
            ads_mobile_sdk.vz r0 = r0.a
            defpackage.ybh.y(r7)
            goto L4a
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r4
        L32:
            defpackage.ybh.y(r7)
            ads_mobile_sdk.ox r7 = ads_mobile_sdk.ox.API_PER_APP_ID_V1
            ads_mobile_sdk.ft1 r2 = r6.C
            r0.a = r6
            r0.b = r7
            r0.e = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L4a:
            ads_mobile_sdk.qx r7 = (ads_mobile_sdk.qx) r7
            hf0 r7 = r7.p()
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto Lad
            ads_mobile_sdk.ha2 r6 = r0.l
            r6.getClass()
            zyk r7 = r6.c     // Catch: java.lang.Exception -> L9f
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Exception -> L9f
            ads_mobile_sdk.ka2 r7 = (ads_mobile_sdk.ka2) r7     // Catch: java.lang.Exception -> L9f
            ads_mobile_sdk.qr0 r6 = r6.a     // Catch: java.lang.Exception -> L9f
            oip r6 = r6.r     // Catch: java.lang.Exception -> L9f
            r6.getClass()     // Catch: java.lang.Exception -> L9f
            java.lang.String r0 = "gads:signal:paid_v1_ttl"
            on7 r1 = pn7.b     // Catch: java.lang.Exception -> L9f
            un7 r1 = un7.h     // Catch: java.lang.Exception -> L9f
            r2 = 182(0xb6, float:2.55E-43)
            long r1 = defpackage.cs5.x0(r2, r1)     // Catch: java.lang.Exception -> L9f
            long r1 = pn7.f(r1)     // Catch: java.lang.Exception -> L9f
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L9f
            ads_mobile_sdk.fo r2 = ads_mobile_sdk.fo.a$16     // Catch: java.lang.Exception -> L9f
            java.lang.Object r6 = r6.a(r0, r1, r2)     // Catch: java.lang.Exception -> L9f
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Exception -> L9f
            long r0 = r6.longValue()     // Catch: java.lang.Exception -> L9f
            r7.getClass()     // Catch: java.lang.Exception -> L9f
            java.lang.Class<ads_mobile_sdk.ka2> r6 = ads_mobile_sdk.ka2.class
            monitor-enter(r6)     // Catch: java.lang.Exception -> L9f
            ads_mobile_sdk.fz0 r7 = r7.a(r0)     // Catch: java.lang.Throwable -> L9d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9d
            ads_mobile_sdk.hv0 r6 = new ads_mobile_sdk.hv0     // Catch: java.lang.Exception -> L9f
            r6.<init>(r7)     // Catch: java.lang.Exception -> L9f
            return r6
        L9b:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9d
            throw r7     // Catch: java.lang.Exception -> L9f
        L9d:
            r7 = move-exception
            goto L9b
        L9f:
            r6 = move-exception
            java.lang.String r7 = "Exception while getting PAIDV1"
            r0 = 4
            ads_mobile_sdk.xh3.a(r7, r6, r0)
            ads_mobile_sdk.bv0 r7 = new ads_mobile_sdk.bv0
            r0 = 6
            r7.<init>(r6, r4, r4, r0)
            return r7
        Lad:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.C(nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(nt5 r9) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.D(nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ee A[Catch: all -> 0x01ef, TRY_LEAVE, TryCatch #5 {all -> 0x01ef, blocks: (B:89:0x01c1, B:91:0x01c8, B:93:0x01cf, B:95:0x01d3, B:97:0x01d7, B:98:0x01d8, B:99:0x01dd, B:100:0x01de, B:101:0x01e5, B:102:0x01e6, B:103:0x01ed, B:104:0x01ee), top: B:113:0x01c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c8 A[Catch: all -> 0x01ef, TryCatch #5 {all -> 0x01ef, blocks: (B:89:0x01c1, B:91:0x01c8, B:93:0x01cf, B:95:0x01d3, B:97:0x01d7, B:98:0x01d8, B:99:0x01dd, B:100:0x01de, B:101:0x01e5, B:102:0x01e6, B:103:0x01ed, B:104:0x01ee), top: B:113:0x01c1 }] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(nt5 r17) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.E(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(nt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.dz
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.dz r0 = (ads_mobile_sdk.dz) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.dz r0 = new ads_mobile_sdk.dz
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ads_mobile_sdk.ox r6 = r0.b
            ads_mobile_sdk.vz r0 = r0.a
            defpackage.ybh.y(r7)
            goto L4a
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L32:
            defpackage.ybh.y(r7)
            r0.a = r6
            ads_mobile_sdk.ox r7 = ads_mobile_sdk.ox.API_READ_AMAZON_FIRE_AD_ID
            r0.b = r7
            r0.e = r4
            ads_mobile_sdk.ft1 r2 = r6.C
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L4a:
            ads_mobile_sdk.qx r7 = (ads_mobile_sdk.qx) r7
            hf0 r7 = r7.p()
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L6d
            android.content.Context r6 = r0.c
            android.content.ContentResolver r6 = r6.getContentResolver()
            if (r6 == 0) goto L6d
            java.lang.String r7 = "limit_ad_tracking"
            r0 = 0
            int r6 = android.provider.Settings.Secure.getInt(r6, r7, r0)
            if (r6 == r4) goto L68
            r4 = r0
        L68:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L6d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.F(nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        if (r3.H(r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(nt5 r10) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.G(nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r7.a(r0, r6) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(nt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.lz
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.lz r0 = (ads_mobile_sdk.lz) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.lz r0 = new ads_mobile_sdk.lz
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.ybh.y(r7)
            goto L66
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r5
        L31:
            pfe r6 = r0.b
            ads_mobile_sdk.vz r2 = r0.a
            defpackage.ybh.y(r7)
            r7 = r6
            r6 = r2
            goto L4c
        L3b:
            defpackage.ybh.y(r7)
            r0.a = r6
            pfe r7 = r6.A
            r0.b = r7
            r0.e = r4
            java.lang.Object r2 = r7.i(r0)
            if (r2 == r1) goto L65
        L4c:
            prb r2 = ads_mobile_sdk.vz.S     // Catch: java.lang.Throwable -> L69
            r6.B = r2     // Catch: java.lang.Throwable -> L69
            r7.l(r5)
            ads_mobile_sdk.ft1 r7 = r6.C
            ads_mobile_sdk.qx r6 = r6.c()
            r0.a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r6 = r7.a(r0, r6)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L69:
            r6 = move-exception
            r7.l(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.H(nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0161, code lost:
    
        if (r9.a(r0, r8) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(nt5 r9) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.I(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.av0 r5, nt5 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.az
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.az r0 = (ads_mobile_sdk.az) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.az r0 = new ads_mobile_sdk.az
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ads_mobile_sdk.av0 r5 = r0.a
            defpackage.ybh.y(r6)
            goto L52
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.ybh.y(r6)
            boolean r6 = r5 instanceof ads_mobile_sdk.bv0
            if (r6 == 0) goto L43
            r6 = r5
            ads_mobile_sdk.bv0 r6 = (ads_mobile_sdk.bv0) r6
            java.lang.Throwable r6 = r6.c
            boolean r6 = r6 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L43
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        L43:
            ads_mobile_sdk.qx r6 = r4.c()
            r0.a = r5
            r0.d = r3
            java.lang.Object r4 = r4.b(r6, r0)
            if (r4 != r1) goto L52
            return r1
        L52:
            r4 = 0
            ads_mobile_sdk.xh3.a(r5, r4)
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.a(ads_mobile_sdk.av0, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.qx r6, nt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.wx
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.wx r0 = (ads_mobile_sdk.wx) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.wx r0 = new ads_mobile_sdk.wx
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ads_mobile_sdk.qx r6 = r0.b
            ads_mobile_sdk.vz r5 = r0.a
            defpackage.ybh.y(r7)
            goto L44
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L32:
            defpackage.ybh.y(r7)
            r0.a = r5
            r0.b = r6
            r0.e = r4
            ads_mobile_sdk.ft1 r7 = r5.C
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            ads_mobile_sdk.qx r7 = (ads_mobile_sdk.qx) r7
            int r0 = r7.o()
            if (r0 <= 0) goto L66
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L66
            nx5 r6 = r5.d
            ads_mobile_sdk.ez r7 = new ads_mobile_sdk.ez
            r0 = 4
            r7.<init>(r5, r3, r0)
            kotlin.coroutines.h r5 = kotlin.coroutines.h.a
            fsg r0 = new fsg
            r1 = 3
            r0.<init>(r7, r3, r1)
            r7 = 2
            defpackage.na2.B(r6, r5, r3, r0, r7)
        L66:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.a(ads_mobile_sdk.qx, nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022a A[Catch: all -> 0x0251, TryCatch #11 {all -> 0x0251, blocks: (B:108:0x0223, B:110:0x022a, B:112:0x0231, B:114:0x0235, B:116:0x0239, B:117:0x023a, B:118:0x023f, B:119:0x0240, B:120:0x0247, B:121:0x0248, B:122:0x024f, B:123:0x0250), top: B:223:0x0223 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0250 A[Catch: all -> 0x0251, TRY_LEAVE, TryCatch #11 {all -> 0x0251, blocks: (B:108:0x0223, B:110:0x022a, B:112:0x0231, B:114:0x0235, B:116:0x0239, B:117:0x023a, B:118:0x023f, B:119:0x0240, B:120:0x0247, B:121:0x0248, B:122:0x024f, B:123:0x0250), top: B:223:0x0223 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x027e A[Catch: all -> 0x0333, TRY_LEAVE, TryCatch #13 {all -> 0x0333, blocks: (B:134:0x0278, B:136:0x027e, B:142:0x0298, B:143:0x029e, B:144:0x02ac, B:172:0x0312), top: B:227:0x0278, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0298 A[Catch: all -> 0x0333, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x0333, blocks: (B:134:0x0278, B:136:0x027e, B:142:0x0298, B:143:0x029e, B:144:0x02ac, B:172:0x0312), top: B:227:0x0278, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0340 A[Catch: all -> 0x0367, TryCatch #3 {all -> 0x0367, blocks: (B:185:0x0339, B:187:0x0340, B:189:0x0347, B:191:0x034b, B:193:0x034f, B:194:0x0350, B:195:0x0355, B:196:0x0356, B:197:0x035d, B:198:0x035e, B:199:0x0365, B:200:0x0366), top: B:213:0x0339 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0366 A[Catch: all -> 0x0367, TRY_LEAVE, TryCatch #3 {all -> 0x0367, blocks: (B:185:0x0339, B:187:0x0340, B:189:0x0347, B:191:0x034b, B:193:0x034f, B:194:0x0350, B:195:0x0355, B:196:0x0356, B:197:0x035d, B:198:0x035e, B:199:0x0365, B:200:0x0366), top: B:213:0x0339 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016e A[Catch: all -> 0x021d, TRY_LEAVE, TryCatch #22 {all -> 0x021d, blocks: (B:58:0x0168, B:60:0x016e, B:66:0x0187, B:67:0x018d, B:68:0x019b, B:96:0x01fe), top: B:240:0x0168, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0187 A[Catch: all -> 0x021d, TRY_ENTER, TRY_LEAVE, TryCatch #22 {all -> 0x021d, blocks: (B:58:0x0168, B:60:0x016e, B:66:0x0187, B:67:0x018d, B:68:0x019b, B:96:0x01fe), top: B:240:0x0168, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ef  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v34, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.os.Bundle r18, mt5 r19) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.a(android.os.Bundle, mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Exception r5, nt5 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.zy
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.zy r0 = (ads_mobile_sdk.zy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.zy r0 = new ads_mobile_sdk.zy
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            java.lang.Exception r5 = r0.a
            defpackage.ybh.y(r6)
            goto L42
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.ybh.y(r6)
            ads_mobile_sdk.qx r6 = r4.c()
            r0.a = r5
            r0.d = r3
            java.lang.Object r4 = r4.b(r6, r0)
            if (r4 != r1) goto L42
            return r1
        L42:
            ads_mobile_sdk.rg3 r4 = ads_mobile_sdk.hh3.a()
            ads_mobile_sdk.ub2 r6 = r4.e()
            r0 = 0
            r6.m = r0
            if (r5 == 0) goto L52
            r4.a(r5)
        L52:
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.a(java.lang.Exception, nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [ads_mobile_sdk.fy, mt5] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [ads_mobile_sdk.vz] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(pqb r9, nt5 r10) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.a(pqb, nt5):java.lang.Object");
    }

    public final void a(Map map, pqb pqbVar, Bundle bundle) {
        ah3 ah3Var = this.f;
        try {
            prb prbVarH = pqbVar.h();
            pqb pqbVarU = prbVarH.u("bk");
            String strN = pqbVarU != null ? pqbVarU.n() : null;
            pqb pqbVarU2 = prbVarH.u("sk");
            String strN2 = pqbVarU2 != null ? pqbVarU2.n() : null;
            pqb pqbVarU3 = prbVarH.u("type");
            Integer numValueOf = pqbVarU3 != null ? Integer.valueOf(pqbVarU3.f()) : null;
            Object obj = map.get(strN2);
            c00 c00Var = c00.STRING;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                if (obj instanceof String) {
                    bundle.putString(strN, (String) obj);
                    return;
                }
                return;
            }
            if (numValueOf == null || numValueOf.intValue() != 1) {
                if (numValueOf != null && numValueOf.intValue() == 2 && (obj instanceof Boolean)) {
                    bundle.putBoolean(strN, ((Boolean) obj).booleanValue());
                    return;
                }
                return;
            }
            if (obj instanceof Integer) {
                bundle.putInt(strN, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(strN, ((Number) obj).longValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(strN, ((Number) obj).floatValue());
            }
        } catch (IllegalStateException e) {
            ah3Var.a("JSON shared preference consent key object parsing failure", (Throwable) e);
        } catch (NumberFormatException e2) {
            ah3Var.a("JSON shared preference consent key object parsing failure", (Throwable) e2);
        } catch (UnsupportedOperationException e3) {
            ah3Var.a("JSON shared preference consent key object parsing failure", (Throwable) e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (r13.u(r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (b(r13, true, false, r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ads_mobile_sdk.qx r14, nt5 r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof ads_mobile_sdk.qz
            if (r0 == 0) goto L13
            r0 = r15
            ads_mobile_sdk.qz r0 = (ads_mobile_sdk.qz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.qz r0 = new ads_mobile_sdk.qz
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L47
            if (r2 == r7) goto L41
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L37
            if (r2 != r4) goto L31
            defpackage.ybh.y(r15)
            goto L6e
        L31:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r13)
            return r3
        L37:
            ads_mobile_sdk.vz r13 = r0.a
            defpackage.ybh.y(r15)
            goto L64
        L3d:
            defpackage.ybh.y(r15)
            goto L8a
        L41:
            ads_mobile_sdk.vz r13 = r0.a
            defpackage.ybh.y(r15)
            goto L7b
        L47:
            defpackage.ybh.y(r15)
            ads_mobile_sdk.qr0 r15 = r13.h
            boolean r2 = r15.w
            ads_mobile_sdk.ft1 r8 = r13.C
            if (r2 != 0) goto L71
            double r9 = r15.x
            r11 = 0
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 > 0) goto L71
            r0.a = r13
            r0.d = r5
            java.lang.Object r14 = r8.a(r0, r14)
            if (r14 == r1) goto L89
        L64:
            r0.a = r3
            r0.d = r4
            java.lang.Object r13 = r13.u(r0)
            if (r13 == r1) goto L89
        L6e:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        L71:
            r0.a = r13
            r0.d = r7
            java.lang.Object r14 = r8.a(r0, r14)
            if (r14 == r1) goto L89
        L7b:
            r0.a = r3
            r0.d = r6
            r13.getClass()
            r14 = 0
            java.lang.Object r13 = b(r13, r7, r14, r0)
            if (r13 != r1) goto L8a
        L89:
            return r1
        L8a:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.b(ads_mobile_sdk.qx, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, nt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.rz
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.rz r0 = (ads_mobile_sdk.rz) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.rz r0 = new ads_mobile_sdk.rz
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            ads_mobile_sdk.ox r5 = r0.c
            java.lang.String r6 = r0.b
            ads_mobile_sdk.vz r0 = r0.a
            defpackage.ybh.y(r7)
            goto L4e
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            r5 = 0
            return r5
        L34:
            defpackage.ybh.y(r7)
            r0.a = r5
            r0.b = r6
            ads_mobile_sdk.ox r7 = ads_mobile_sdk.ox.API_SET_WEBVIEW_COOKIE
            r0.c = r7
            r0.f = r3
            ads_mobile_sdk.ft1 r2 = r5.C
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            r4 = r0
            r0 = r5
            r5 = r7
            r7 = r4
        L4e:
            ads_mobile_sdk.qx r7 = (ads_mobile_sdk.qx) r7
            hf0 r7 = r7.p()
            boolean r5 = r7.contains(r5)
            if (r5 == 0) goto L6f
            android.webkit.CookieManager r5 = r0.E
            if (r5 == 0) goto L6f
            ads_mobile_sdk.qr0 r7 = r0.h
            java.lang.String r0 = "https://googleads.g.doubleclick.net"
            ads_mobile_sdk.fo r1 = ads_mobile_sdk.fo.a$23
            java.lang.String r2 = "gads:webview_cookie_url"
            java.lang.Object r7 = r7.a(r2, r0, r1)
            java.lang.String r7 = (java.lang.String) r7
            r5.setCookie(r7, r6)
        L6f:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.b(java.lang.String, nt5):java.lang.Object");
    }

    public final qx c() {
        fep fepVarS = qx.s();
        fepVarS.c();
        oip oipVar = this.h.r;
        oipVar.getClass();
        fep fepVarS2 = qx.s();
        e7 e7Var = new e7((Object) fepVarS2, (byte) 29);
        e7Var.b();
        e7Var.a(ox.API_READ_SHARED_PREFERENCES_CONSENT_DATA);
        e7Var.b();
        e7Var.a(ox.API_READ_FLAG_VALUES);
        e7Var.b();
        e7Var.a(ox.API_WRITE_FLAG_VALUES);
        e7Var.b();
        e7Var.a(ox.API_READ_CLD_RESPONSE);
        e7Var.b();
        e7Var.a(ox.API_CLEAR_WEBVIEW_COOKIE);
        e7Var.b();
        e7Var.a(ox.API_READ_ANDROID_ID);
        e7Var.b();
        e7Var.a(ox.API_READ_ADVERTISING_ID);
        e7Var.b();
        e7Var.a(ox.API_READ_APP_SET_ID);
        e7Var.b();
        e7Var.a(ox.API_CLEAR_PER_APP_ID_V1);
        e7Var.b();
        e7Var.a(ox.API_CLEAR_PER_APP_ID_V2);
        e7Var.b();
        e7Var.a(ox.API_READ_FIREBASE_APP_ID);
        e7Var.b();
        e7Var.a(ox.API_READ_FIREBASE_APP_INSTANCE_ID);
        e7Var.b();
        e7Var.a(ox.API_READ_FIREBASE_AD_EVENT_ID);
        e7Var.b();
        e7Var.a(ox.API_CLEAR_PERSISTENT_CACHE);
        List list = (List) oipVar.a("gads:consent_allowlist_default:string", ((qx) fepVarS2.a()).q(), fo.a$12);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ox oxVarA = ox.a(((Number) it.next()).intValue());
            if (oxVarA != null) {
                arrayList.add(oxVarA);
            }
        }
        fepVarS.b(arrayList);
        return (qx) fepVarS.a();
    }

    @Override // ads_mobile_sdk.k61
    public final Object h(mt5 mt5Var) {
        return k(this, (nt5) mt5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[Catch: ksb -> 0x0098, TRY_LEAVE, TryCatch #0 {ksb -> 0x0098, blocks: (B:27:0x0068, B:29:0x006e), top: B:50:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0081 -> B:33:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(mt5 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.vx
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.vx r0 = (ads_mobile_sdk.vx) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.vx r0 = new ads_mobile_sdk.vx
            nt5 r8 = (nt5) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L33
            java.util.Iterator r7 = r0.b
            ads_mobile_sdk.vz r2 = r0.a
            defpackage.ybh.y(r8)     // Catch: ksb -> L2e
            goto L84
        L2e:
            r7 = move-exception
        L2f:
            r8 = r7
            r7 = r2
            goto La4
        L33:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            r7 = 0
            return r7
        L3a:
            defpackage.ybh.y(r8)
            m5a r8 = new m5a     // Catch: ksb -> La2
            r8.<init>()     // Catch: ksb -> La2
            ads_mobile_sdk.qr0 r2 = r7.h     // Catch: ksb -> La2
            oip r2 = r2.r     // Catch: ksb -> La0
            java.lang.String r2 = r2.r()     // Catch: ksb -> La2
            java.lang.Class<wpb> r5 = defpackage.wpb.class
            java.lang.Object r8 = r8.b(r5, r2)     // Catch: ksb -> La2
            wpb r8 = (defpackage.wpb) r8     // Catch: ksb -> La2
            boolean r2 = r8 instanceof java.util.Collection     // Catch: ksb -> La2
            if (r2 == 0) goto L5f
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: ksb -> La2
            boolean r2 = r2.isEmpty()     // Catch: ksb -> La2
            if (r2 != 0) goto L92
        L5f:
            java.util.ArrayList r8 = r8.a     // Catch: ksb -> La2
            java.util.Iterator r8 = r8.iterator()     // Catch: ksb -> La2
            r6 = r8
            r8 = r7
            r7 = r6
        L68:
            boolean r2 = r7.hasNext()     // Catch: ksb -> L98
            if (r2 == 0) goto L91
            java.lang.Object r2 = r7.next()     // Catch: ksb -> L98
            pqb r2 = (pqb) r2     // Catch: ksb -> L98
            r0.a = r8     // Catch: ksb -> L98
            r0.b = r7     // Catch: ksb -> L98
            r0.e = r4     // Catch: ksb -> L98
            java.lang.Object r2 = r8.a(r2, r0)     // Catch: ksb -> L98
            if (r2 != r1) goto L81
            return r1
        L81:
            r6 = r2
            r2 = r8
            r8 = r6
        L84:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: ksb -> L2e
            boolean r8 = r8.booleanValue()     // Catch: ksb -> L2e
            if (r8 == 0) goto L8f
            r7 = r2
            r3 = r4
            goto L92
        L8f:
            r8 = r2
            goto L68
        L91:
            r7 = r8
        L92:
            r3 = r3 ^ r4
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)     // Catch: ksb -> La2
            return r7
        L98:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
            goto La4
        L9d:
            r2 = r7
            r7 = r8
            goto L2f
        La0:
            r8 = move-exception
            goto La4
        La2:
            r8 = move-exception
            goto L9d
        La4:
            ads_mobile_sdk.ah3 r7 = r7.f
            java.lang.String r0 = "JSON fallback consent keys set parsing failure"
            r7.a(r0, r8)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.k(mt5):java.lang.Object");
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        oip oipVar = this.h.r;
        oipVar.getClass();
        if (CollectionsKt.E((List) oipVar.a("gads:sp:consent_keys_list", Arrays.asList("IABTCF_AddtlConsent", "IABConsent_CMPPresent", "IABTCF_CmpSdkID", "IABConsent_ConsentString", "IABTCF_gdprApplies", "IABGPP_HDR_GppString", "IABGPP_GppSID", "gad_has_consent_for_cookies", "IABConsent_ParsedPurposeConsents", "personalized_ad_status", "IABTCF_PolicyVersion", "IABUSPrivacy_String", "IABTCF_PurposeConsents", "gad_rdp", "IABConsent_SubjectToGDPR", "IABTCF_TCString", "IABConsent_ParsedVendorConsents", "UMP_eids"), fo.a$15), str)) {
            mt5 mt5Var = null;
            ez ezVar = new ez(this, mt5Var, (byte) 0);
            defpackage.na2.B(this.d, h.a, null, new fsg(ezVar, mt5Var, (byte) 3), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(nt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.yx
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.yx r0 = (ads_mobile_sdk.yx) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.yx r0 = new ads_mobile_sdk.yx
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ads_mobile_sdk.ox r6 = r0.b
            ads_mobile_sdk.vz r0 = r0.a
            defpackage.ybh.y(r7)
            goto L4a
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L32:
            defpackage.ybh.y(r7)
            r0.a = r6
            ads_mobile_sdk.ox r7 = ads_mobile_sdk.ox.API_CLEAR_PERSISTENT_CACHE
            r0.b = r7
            r0.e = r4
            ads_mobile_sdk.ft1 r2 = r6.C
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L4a:
            ads_mobile_sdk.qx r7 = (ads_mobile_sdk.qx) r7
            hf0 r7 = r7.p()
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L6a
            nx5 r6 = r0.d
            ads_mobile_sdk.ez r7 = new ads_mobile_sdk.ez
            r1 = 5
            r7.<init>(r0, r3, r1)
            kotlin.coroutines.h r0 = kotlin.coroutines.h.a
            fsg r1 = new fsg
            r2 = 3
            r1.<init>(r7, r3, r2)
            r7 = 2
            defpackage.na2.B(r6, r0, r3, r1, r7)
        L6a:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.r(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(nt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.ay
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.ay r0 = (ads_mobile_sdk.ay) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.ay r0 = new ads_mobile_sdk.ay
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ads_mobile_sdk.ox r5 = r0.b
            ads_mobile_sdk.vz r0 = r0.a
            defpackage.ybh.y(r6)
            goto L4a
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            r5 = 0
            return r5
        L32:
            defpackage.ybh.y(r6)
            r0.a = r5
            ads_mobile_sdk.ox r6 = ads_mobile_sdk.ox.API_CLEAR_PER_APP_ID_V1
            r0.b = r6
            r0.e = r3
            ads_mobile_sdk.ft1 r2 = r5.C
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L4a:
            ads_mobile_sdk.qx r6 = (ads_mobile_sdk.qx) r6
            hf0 r6 = r6.p()
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L5b
            ads_mobile_sdk.ha2 r5 = r0.l
            r5.a()
        L5b:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.s(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(mt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.cy
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.cy r0 = (ads_mobile_sdk.cy) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.cy r0 = new ads_mobile_sdk.cy
            nt5 r6 = (nt5) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            ads_mobile_sdk.ox r5 = r0.b
            ads_mobile_sdk.vz r0 = r0.a
            defpackage.ybh.y(r6)
            goto L4c
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            r5 = 0
            return r5
        L34:
            defpackage.ybh.y(r6)
            r0.a = r5
            ads_mobile_sdk.ox r6 = ads_mobile_sdk.ox.API_CLEAR_PER_APP_ID_V2
            r0.b = r6
            r0.e = r3
            ads_mobile_sdk.ft1 r2 = r5.C
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L4c:
            ads_mobile_sdk.qx r6 = (ads_mobile_sdk.qx) r6
            hf0 r6 = r6.p()
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L5d
            ads_mobile_sdk.ha2 r5 = r0.l
            r5.b()
        L5d:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.t(mt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r8.r(r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[PHI: r8
      0x006a: PHI (r8v3 'this' ads_mobile_sdk.vz) = (r8v2 'this' ads_mobile_sdk.vz), (r8v8 'this' ads_mobile_sdk.vz) binds: [B:25:0x0068, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(nt5 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.dy
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.dy r0 = (ads_mobile_sdk.dy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.dy r0 = new ads_mobile_sdk.dy
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L49
            if (r2 == r7) goto L43
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L37
            if (r2 != r4) goto L31
            defpackage.ybh.y(r9)
            goto L75
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r3
        L37:
            ads_mobile_sdk.vz r8 = r0.a
            defpackage.ybh.y(r9)
            goto L6a
        L3d:
            ads_mobile_sdk.vz r8 = r0.a
            defpackage.ybh.y(r9)
            goto L60
        L43:
            ads_mobile_sdk.vz r8 = r0.a
            defpackage.ybh.y(r9)
            goto L56
        L49:
            defpackage.ybh.y(r9)
            r0.a = r8
            r0.d = r7
            java.lang.Object r9 = r8.v(r0)
            if (r9 == r1) goto L74
        L56:
            r0.a = r8
            r0.d = r6
            java.lang.Object r9 = r8.s(r0)
            if (r9 == r1) goto L74
        L60:
            r0.a = r8
            r0.d = r5
            java.lang.Object r9 = r8.t(r0)
            if (r9 == r1) goto L74
        L6a:
            r0.a = r3
            r0.d = r4
            java.lang.Object r8 = r8.r(r0)
            if (r8 != r1) goto L75
        L74:
            return r1
        L75:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.u(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(nt5 r11) {
        /*
            r10 = this;
            ads_mobile_sdk.fo r0 = ads_mobile_sdk.fo.a$23
            boolean r1 = r11 instanceof ads_mobile_sdk.ey
            if (r1 == 0) goto L15
            r1 = r11
            ads_mobile_sdk.ey r1 = (ads_mobile_sdk.ey) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e = r2
            goto L1a
        L15:
            ads_mobile_sdk.ey r1 = new ads_mobile_sdk.ey
            r1.<init>(r10, r11)
        L1a:
            java.lang.Object r11 = r1.c
            px5 r2 = px5.a
            int r3 = r1.e
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L34
            if (r3 != r5) goto L2e
            ads_mobile_sdk.ox r10 = r1.b
            ads_mobile_sdk.vz r1 = r1.a
            defpackage.ybh.y(r11)
            goto L4c
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            return r4
        L34:
            defpackage.ybh.y(r11)
            r1.a = r10
            ads_mobile_sdk.ox r11 = ads_mobile_sdk.ox.API_CLEAR_WEBVIEW_COOKIE
            r1.b = r11
            r1.e = r5
            ads_mobile_sdk.ft1 r3 = r10.C
            java.lang.Object r1 = r3.a(r1)
            if (r1 != r2) goto L48
            return r2
        L48:
            r9 = r1
            r1 = r10
            r10 = r11
            r11 = r9
        L4c:
            ads_mobile_sdk.qx r11 = (ads_mobile_sdk.qx) r11
            hf0 r11 = r11.p()
            boolean r10 = r11.contains(r10)
            if (r10 == 0) goto Lc2
            android.webkit.CookieManager r10 = r1.E
            ads_mobile_sdk.qr0 r11 = r1.h
            java.lang.String r2 = "https://googleads.g.doubleclick.net"
            java.lang.String r3 = "gads:webview_cookie_url"
            if (r10 == 0) goto L6c
            java.lang.Object r4 = r11.a(r3, r2, r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r10.getCookie(r4)
        L6c:
            if (r4 == 0) goto Lc2
            java.lang.String r10 = ";"
            java.lang.String[] r10 = new java.lang.String[]{r10}
            r5 = 6
            r6 = 0
            java.util.List r10 = kotlin.text.StringsKt.Y(r4, r10, r6, r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r10 = r10.iterator()
        L83:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L9a
            java.lang.Object r5 = r10.next()
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = kotlin.text.StringsKt.N(r7)
            if (r7 != 0) goto L83
            r4.add(r5)
            goto L83
        L9a:
            int r10 = r4.size()
        L9e:
            if (r6 >= r10) goto Lc2
            java.lang.Object r5 = r4.get(r6)
            int r6 = r6 + 1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r7 = "="
            java.lang.String r5 = kotlin.text.StringsKt.h0(r5, r7)
            java.lang.String r7 = "=; Max-Age=-1; path=/; domain=.doubleclick.net"
            java.lang.String r5 = sko.u(r5, r7)
            android.webkit.CookieManager r7 = r1.E
            if (r7 == 0) goto L9e
            java.lang.Object r8 = r11.a(r3, r2, r0)
            java.lang.String r8 = (java.lang.String) r8
            r7.setCookie(r8, r5)
            goto L9e
        Lc2:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.v(nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r8 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(nt5 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.gy
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.gy r0 = (ads_mobile_sdk.gy) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.gy r0 = new ads_mobile_sdk.gy
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r3) goto L31
            if (r2 != r4) goto L2b
            defpackage.ybh.y(r8)
            goto L7f
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r5
        L31:
            ads_mobile_sdk.ox r7 = r0.b
            ads_mobile_sdk.vz r2 = r0.a
            defpackage.ybh.y(r8)
            goto L50
        L39:
            defpackage.ybh.y(r8)
            r0.a = r7
            ads_mobile_sdk.ox r8 = ads_mobile_sdk.ox.API_READ_ADVERTISING_ID
            r0.b = r8
            r0.e = r3
            ads_mobile_sdk.ft1 r2 = r7.C
            java.lang.Object r2 = r2.a(r0)
            if (r2 == r1) goto L7e
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L50:
            ads_mobile_sdk.qx r8 = (ads_mobile_sdk.qx) r8
            hf0 r8 = r8.p()
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L82
            ayo r7 = r2.j
            android.content.Context r8 = r2.c
            r0.a = r5
            r0.b = r5
            r0.e = r4
            r7.getClass()
            ads_mobile_sdk.hv0 r7 = new ads_mobile_sdk.hv0     // Catch: java.lang.Exception -> L74
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r8 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r8)     // Catch: java.lang.Exception -> L74
            r7.<init>(r8)     // Catch: java.lang.Exception -> L74
            r8 = r7
            goto L7c
        L74:
            r7 = move-exception
            ads_mobile_sdk.bv0 r8 = new ads_mobile_sdk.bv0
            java.lang.String r0 = "Exception caught fetching Ad ID"
            r8.<init>(r7, r5, r0, r4)
        L7c:
            if (r8 != r1) goto L7f
        L7e:
            return r1
        L7f:
            rap r8 = (defpackage.rap) r8
            return r8
        L82:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.w(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(nt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.hy
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.hy r0 = (ads_mobile_sdk.hy) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.hy r0 = new ads_mobile_sdk.hy
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ads_mobile_sdk.ox r6 = r0.b
            ads_mobile_sdk.vz r0 = r0.a
            defpackage.ybh.y(r7)
            goto L4a
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L32:
            defpackage.ybh.y(r7)
            r0.a = r6
            ads_mobile_sdk.ox r7 = ads_mobile_sdk.ox.API_READ_AMAZON_FIRE_AD_ID
            r0.b = r7
            r0.e = r4
            ads_mobile_sdk.ft1 r2 = r6.C
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L4a:
            ads_mobile_sdk.qx r7 = (ads_mobile_sdk.qx) r7
            hf0 r7 = r7.p()
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L65
            android.content.Context r6 = r0.c
            android.content.ContentResolver r6 = r6.getContentResolver()
            if (r6 == 0) goto L65
            java.lang.String r7 = "advertising_id"
            java.lang.String r6 = android.provider.Settings.Secure.getString(r6, r7)
            return r6
        L65:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.x(nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x010d, code lost:
    
        if (r1 == r3) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086 A[Catch: all -> 0x00fa, TryCatch #0 {all -> 0x00fa, blocks: (B:25:0x0082, B:27:0x0086, B:29:0x00c3, B:30:0x00cf, B:32:0x00d3, B:34:0x00d9, B:36:0x00df), top: B:49:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(nt5 r18) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.y(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(nt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.oy
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.oy r0 = (ads_mobile_sdk.oy) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.oy r0 = new ads_mobile_sdk.oy
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ads_mobile_sdk.ox r6 = r0.b
            ads_mobile_sdk.vz r0 = r0.a
            defpackage.ybh.y(r7)
            goto L4a
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L32:
            defpackage.ybh.y(r7)
            r0.a = r6
            ads_mobile_sdk.ox r7 = ads_mobile_sdk.ox.API_READ_FIREBASE_AD_EVENT_ID
            r0.b = r7
            r0.e = r4
            ads_mobile_sdk.ft1 r2 = r6.C
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L4a:
            ads_mobile_sdk.qx r7 = (ads_mobile_sdk.qx) r7
            hf0 r7 = r7.p()
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L65
            ads_mobile_sdk.bn0 r6 = r0.o
            java.lang.String r7 = "generateEventId"
            java.lang.Object r6 = r6.a(r7)
            if (r6 == 0) goto L65
            java.lang.String r6 = r6.toString()
            return r6
        L65:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vz.z(nt5):java.lang.Object");
    }
}
