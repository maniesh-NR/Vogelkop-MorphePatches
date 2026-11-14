package ads_mobile_sdk;

import android.content.Context;
import android.os.Build;
import defpackage.eyo;
import defpackage.o0g;
import defpackage.p3p;
import defpackage.z1m;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class im3 implements eyo {
    public static final /* synthetic */ int k = 0;
    public final Context a;
    public final String b;
    public final xq0 c;
    public nx5 d;
    public nx5 e;
    public ux2 f;
    public qr0 g;
    public final pfe h = new pfe();
    public final ynb i = o0g.e();
    public String j;

    public im3(Context context, String str, xq0 xq0Var) {
        this.a = context;
        this.b = str;
        this.c = xq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009d A[Catch: all -> 0x011c, TryCatch #4 {all -> 0x011c, blocks: (B:35:0x0099, B:37:0x009d, B:40:0x00a2, B:42:0x00b7, B:48:0x00c1, B:45:0x00bc), top: B:81:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5 A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:51:0x00e9, B:53:0x00f5, B:54:0x00fb), top: B:80:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fb A[Catch: all -> 0x0116, TRY_LEAVE, TryCatch #3 {all -> 0x0116, blocks: (B:51:0x00e9, B:53:0x00f5, B:54:0x00fb), top: B:80:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.im3 r12, nt5 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.im3.a(ads_mobile_sdk.im3, nt5):java.lang.Object");
    }

    @Override // defpackage.eyo
    public final Object a() {
        pfe pfeVar = this.h;
        if (!pfeVar.j()) {
            return null;
        }
        try {
            return this.j;
        } finally {
            pfeVar.l((Object) null);
        }
    }

    @Override // defpackage.eyo
    public final Object a(nt5 nt5Var) {
        return a(this, nt5Var);
    }

    public final String a(String str) {
        qr0 qr0Var = this.g;
        if (qr0Var == null) {
            qr0Var = null;
        }
        if (((Boolean) qr0Var.a("gads:restore_reduced_ua:enabled", Boolean.TRUE, fo.a)).booleanValue()) {
            String str2 = Build.VERSION.RELEASE;
            String str3 = Build.MODEL;
            String str4 = Build.ID;
            StringBuilder sbN = z1m.n("Android ", str2, "; ", str3, " Build/");
            sbN.append(str4);
            str = kotlin.text.c.o(str, "Android 10; K", sbN.toString());
        }
        String strM = p3p.m(str, " (Mobile; ", this.b, ")");
        this.j = strM;
        return strM;
    }

    @Override // defpackage.eyo
    public final Object b(nt5 nt5Var) {
        Object objZ = this.i.Z(nt5Var);
        return objZ == px5.a ? objZ : Unit.a;
    }
}
