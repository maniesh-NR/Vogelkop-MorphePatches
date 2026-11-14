package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class a36 implements b36, u38, yn8, qyh, w9c, l0p, xx5, waf, krf, h4h, lo7 {
    public static n8g k(int i, n8g n8gVar, ra5 ra5Var) {
        n8g n8gVar2;
        n8g[] n8gVarArrValues = n8g.values();
        int length = n8gVarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                n8gVar2 = null;
                break;
            }
            n8gVar2 = n8gVarArrValues[i2];
            if (ra5Var.a.getColor(n8gVar2.b) == i) {
                break;
            }
            i2++;
        }
        return n8gVar2 == null ? n8gVar : n8gVar2;
    }

    public static boolean p(String str) {
        return ((Map) hk6.f.getValue()).containsKey(q(str));
    }

    public static String q(String str) {
        return Uri.parse(str).buildUpon().clearQuery().build().toString();
    }

    public static hk6 s(String str) {
        return (hk6) ((Map) hk6.f.getValue()).get(q(str));
    }

    @Override // defpackage.krf
    public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    @Override // defpackage.h4h
    public final void b(int i, Serializable serializable) {
        if (i == 6 || i == 7 || i == 8) {
        }
    }

    @Override // defpackage.l0p
    public final void c(ArrayList arrayList) {
        m5h.c(arrayList, new rqd((byte) 12));
    }

    @Override // defpackage.u38
    public final Object d(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }

    @Override // defpackage.xx5
    public final Object e(wx5 wx5Var) throws wx5 {
        throw wx5Var;
    }

    public final void f(Object obj) {
    }

    @Override // defpackage.l0p
    public final boolean g(vho vhoVar) {
        return vhoVar.a().j == dro.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    @Override // defpackage.w9c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(android.os.Bundle r7) {
        /*
            r6 = this;
            java.lang.String r6 = "_lpx"
            java.lang.String r0 = r7.getString(r6)
            r1 = 0
            if (r0 == 0) goto Lf
            orb r2 = new orb     // Catch: org.json.JSONException -> Lf
            r2.<init>(r0)     // Catch: org.json.JSONException -> Lf
            goto L10
        Lf:
            r2 = r1
        L10:
            java.lang.String r0 = "URL"
            r3 = 0
            if (r2 == 0) goto L2c
            java.lang.String r4 = "__name__"
            java.lang.String r4 = r2.m(r4, r1)
            if (r4 != 0) goto L1f
            r4 = r3
            goto L25
        L1f:
            java.lang.String r5 = "Open URL"
            boolean r4 = r4.equals(r5)
        L25:
            if (r4 == 0) goto L2c
            java.lang.String r2 = r2.m(r0, r1)
            goto L2d
        L2c:
            r2 = r1
        L2d:
            if (r2 == 0) goto L5e
            java.lang.String r4 = wqm.c(r2)
            java.lang.String r5 = "ofa:"
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L3c
            r4 = r1
        L3c:
            if (r4 == 0) goto L5e
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L5e
            java.lang.String r2 = r7.getString(r6)
            if (r2 == 0) goto L50
            orb r3 = new orb     // Catch: org.json.JSONException -> L50
            r3.<init>(r2)     // Catch: org.json.JSONException -> L50
            r1 = r3
        L50:
            r1.p(r4, r0)
            org.json.JSONObject r0 = r1.a
            java.lang.String r0 = r0.toString()
            r7.putString(r6, r0)
            r6 = 1
            return r6
        L5e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a36.h(android.os.Bundle):boolean");
    }

    public final taf i(vaf vafVar) {
        return taf.O;
    }

    @Override // defpackage.qyh
    public final int j(trf trfVar) {
        return 1;
    }

    public final boolean l(Object obj, File file, trf trfVar) throws Throwable {
        try {
            j34.b(((rx9) ((kx9) ((kyh) obj).get()).a.b).a.d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final kb7 m(Context context) {
        kb7 kb7Var;
        kb7 kb7Var2 = kb7.k;
        if (kb7Var2 != null) {
            return kb7Var2;
        }
        synchronized (this) {
            kb7Var = kb7.k;
            if (kb7Var == null) {
                kb7Var = new kb7(gt5.a(context));
                kb7.k = kb7Var;
            }
        }
        return kb7Var;
    }

    public final t3e n() {
        return (t3e) ((ini) u5e.a().c.b).a(uqh.a(t3e.class), (rhk) null, (Function0) null);
    }

    public final obh o() {
        return (obh) ((ini) u5e.a().c.b).a(uqh.a(obh.class), (rhk) null, (Function0) null);
    }

    public final byte[] r(byte[] bArr) {
        return bArr;
    }

    public final no7 x(Context context) {
        return new xnh(context, 17, "features");
    }
}
