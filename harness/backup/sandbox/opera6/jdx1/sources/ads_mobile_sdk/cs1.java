package ads_mobile_sdk;

import defpackage.sto;
import defpackage.vkp;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class cs1 {
    public static final Regex i = new Regex("[^/\\\\\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$");
    public final ki0 a;
    public final bq1 b;
    public final nx5 c;
    public final nx5 d;
    public final vkp e;
    public final g0 f;
    public final ux2 g;
    public final kh3 h;

    public cs1(ki0 ki0Var, bq1 bq1Var, nx5 nx5Var, nx5 nx5Var2, vkp vkpVar, g0 g0Var, ux2 ux2Var, kh3 kh3Var) {
        this.a = ki0Var;
        this.b = bq1Var;
        this.c = nx5Var;
        this.d = nx5Var2;
        this.e = vkpVar;
        this.f = g0Var;
        this.g = ux2Var;
        this.h = kh3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad A[PHI: r12 r13 r15
      0x00ad: PHI (r12v2 java.lang.String) = (r12v1 java.lang.String), (r12v4 java.lang.String) binds: [B:19:0x008d, B:24:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r13v6 android.content.pm.ProviderInfo) = (r13v5 android.content.pm.ProviderInfo), (r13v7 android.content.pm.ProviderInfo) binds: [B:19:0x008d, B:24:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r15v1 int) = (r15v0 int), (r15v21 int) binds: [B:19:0x008d, B:24:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.io.ByteArrayInputStream r20, java.lang.String r21, java.lang.String r22, android.content.Context r23, ads_mobile_sdk.cy0 r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cs1.a(java.io.ByteArrayInputStream, java.lang.String, java.lang.String, android.content.Context, ads_mobile_sdk.cy0):void");
    }

    public final void a(String str, cy0 cy0Var, boolean z) {
        vr3 vr3Var = xu0.a;
        mt5 mt5Var = null;
        xu0.c("Store picture error: ".concat(str), null);
        if (z) {
            xh3.a(str, null, 6);
        }
        defpackage.na2.B(this.c, null, null, new sto((Object) this, (Object) cy0Var, (Object) str, mt5Var, (byte) 12), 3);
    }
}
