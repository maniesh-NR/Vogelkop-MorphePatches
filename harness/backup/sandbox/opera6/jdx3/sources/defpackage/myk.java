package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import com.appsflyer.internal.j;
import com.opera.api.Callback;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class myk implements vwl {
    public final bf9 a;
    public final db b;
    public final zwk c;
    public final umi d;
    public final di2 e;
    public final j4c f;
    public final t1 g;
    public final HashMap h = new HashMap();
    public lyk i;
    public r72 j;

    public myk(bf9 bf9Var, db dbVar, zwk zwkVar, umi umiVar, j4c j4cVar, t1 t1Var) {
        this.a = bf9Var;
        this.b = dbVar;
        this.c = zwkVar;
        this.d = umiVar;
        this.e = new di2(umiVar, new pi((byte) 1));
        this.f = j4cVar;
        this.g = t1Var;
        dbVar.a(new nj2(this, (byte) 7));
    }

    public final void a() {
        j.a((SharedPreferences) this.f.get(), "bp");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bpd b() {
        /*
            r5 = this;
            j4c r0 = r5.f
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r1 = "bp"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L24
            t1 r1 = r5.g
            java.lang.Object r1 = r1.get()
            c36 r1 = (defpackage.c36) r1
            r3 = 0
            byte[] r0 = android.util.Base64.decode(r0, r3)
            byte[] r0 = r1.b(r0)
            if (r0 != 0) goto L26
        L24:
            r1 = r2
            goto L2b
        L26:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
        L2b:
            if (r1 == 0) goto L33
            bpd r5 = new bpd
            r5.<init>(r1)
            return r5
        L33:
            db r5 = r5.b
            com.opera.android.oauth2.OAuth2Account r5 = r5.c
            if (r5 == 0) goto L41
            long r0 = r5.g
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L43
        L41:
            r5 = r2
            goto L49
        L43:
            java.lang.Object r5 = J.N.Mv_cyjCV(r0)
            byte[] r5 = (byte[]) r5
        L49:
            if (r5 == 0) goto L51
            bpd r0 = new bpd
            r0.<init>(r5)
            return r0
        L51:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myk.b():bpd");
    }

    public final void c(String str) {
        byte[] bArrD = ((c36) this.g.get()).d(str.getBytes());
        if (bArrD == null) {
            a();
        } else {
            j.c((SharedPreferences) this.f.get(), "bp", Base64.encodeToString(bArrD, 2));
        }
    }

    public final ih4 d(String str, String str2, String str3, byte[] bArr, Runnable runnable, Callback callback) {
        if (this.b.f()) {
            callback.run("Already signed in");
            return bf9.A;
        }
        lyk lykVar = this.i;
        if (lykVar != null) {
            lykVar.cancel();
        }
        this.i = new lyk(this, runnable, callback, str3);
        this.b.i(str, bArr, str2, str3, null);
        return this.i;
    }
}
