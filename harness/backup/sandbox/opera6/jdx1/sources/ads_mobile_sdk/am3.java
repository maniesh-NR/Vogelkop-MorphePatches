package ads_mobile_sdk;

import defpackage.fsg;
import defpackage.sqo;
import defpackage.vkp;
import defpackage.xf8;
import kotlin.Unit;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class am3 extends k61 {
    public final nx5 c;
    public final vkp d;
    public final p04 e;

    public am3(nx5 nx5Var, vkp vkpVar) {
        super((fw0) null, 3);
        this.c = nx5Var;
        this.d = vkpVar;
        this.e = xf8.h(Integer.MAX_VALUE, null, null, 6);
    }

    @Override // ads_mobile_sdk.k61
    public final Object h(mt5 mt5Var) {
        mt5 mt5Var2 = null;
        sqo sqoVar = new sqo((byte) 10, mt5Var2, this);
        defpackage.na2.B(this.c, h.a, null, new fsg(sqoVar, mt5Var2, (byte) 3), 2);
        return new hv0(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e A[PHI: r10 r11
      0x004e: PHI (r10v4 'this' ads_mobile_sdk.am3) = (r10v9 'this' ads_mobile_sdk.am3), (r10v12 'this' ads_mobile_sdk.am3) binds: [B:20:0x004c, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r11v5 java.lang.Object) = (r11v13 java.lang.Object), (r11v2 java.lang.Object) binds: [B:20:0x004c, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[Catch: Exception -> 0x0086, TRY_LEAVE, TryCatch #1 {Exception -> 0x0086, blocks: (B:13:0x002d, B:26:0x0075, B:28:0x007b), top: B:37:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0072 -> B:26:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(mt5 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.yl3
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.yl3 r0 = (ads_mobile_sdk.yl3) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.yl3 r0 = new ads_mobile_sdk.yl3
            nt5 r11 = (nt5) r11
            r0.<init>(r10, r11)
        L1a:
            java.lang.Object r11 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L37
            if (r2 != r4) goto L31
            android.net.Uri r10 = r0.b
            ads_mobile_sdk.am3 r2 = r0.a
            defpackage.ybh.y(r11)     // Catch: java.lang.Exception -> L86
            goto L75
        L31:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            return r3
        L37:
            ads_mobile_sdk.am3 r10 = r0.a
            defpackage.ybh.y(r11)
            goto L4e
        L3d:
            defpackage.ybh.y(r11)
        L40:
            p04 r11 = r10.e
            r0.a = r10
            r0.b = r3
            r0.e = r5
            java.lang.Object r11 = p04.O(r11, r0)
            if (r11 == r1) goto L71
        L4e:
            kotlin.Pair r11 = (kotlin.Pair) r11
            java.lang.Object r2 = r11.a
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.Object r11 = r11.b
            java.util.Map r11 = (java.util.Map) r11
            vkp r6 = r10.d     // Catch: java.lang.Exception -> L88
            java.net.URL r7 = new java.net.URL     // Catch: java.lang.Exception -> L88
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Exception -> L88
            r7.<init>(r8)     // Catch: java.lang.Exception -> L88
            r0.a = r10     // Catch: java.lang.Exception -> L88
            r0.b = r2     // Catch: java.lang.Exception -> L88
            r0.e = r4     // Catch: java.lang.Exception -> L88
            r8 = 26
            java.lang.Object r11 = defpackage.vkp.b(r6, r7, r11, r0, r8)     // Catch: java.lang.Exception -> L88
            if (r11 != r1) goto L72
        L71:
            return r1
        L72:
            r9 = r2
            r2 = r10
            r10 = r9
        L75:
            rap r11 = (defpackage.rap) r11     // Catch: java.lang.Exception -> L86
            boolean r6 = r11 instanceof ads_mobile_sdk.hv0     // Catch: java.lang.Exception -> L86
            if (r6 == 0) goto L84
            ads_mobile_sdk.hv0 r11 = (ads_mobile_sdk.hv0) r11     // Catch: java.lang.Exception -> L86
            java.lang.Object r11 = r11.b     // Catch: java.lang.Exception -> L86
            ads_mobile_sdk.j21 r11 = (ads_mobile_sdk.j21) r11     // Catch: java.lang.Exception -> L86
            r11.getClass()     // Catch: java.lang.Exception -> L86
        L84:
            r10 = r2
            goto L40
        L86:
            r11 = move-exception
            goto L8c
        L88:
            r11 = move-exception
            r9 = r2
            r2 = r10
            r10 = r9
        L8c:
            vr3 r6 = ads_mobile_sdk.xu0.a
            java.lang.String r11 = r11.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Error while pinging URL: "
            r6.<init>(r7)
            r6.append(r10)
            java.lang.String r10 = ": "
            r6.append(r10)
            r6.append(r11)
            java.lang.String r10 = r6.toString()
            ads_mobile_sdk.xu0.b(r10, r3)
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.am3.k(mt5):java.lang.Object");
    }
}
