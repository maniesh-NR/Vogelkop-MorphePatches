package defpackage;

import ads_mobile_sdk.ak2;
import ads_mobile_sdk.e7;
import ads_mobile_sdk.pb1;
import ads_mobile_sdk.v62;
import android.content.Context;
import android.os.IBinder;
import java.util.HashMap;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import org.chromium.support_lib_boundary.SpeculativeLoadingConfigBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class tmj implements SpeculativeLoadingConfigBoundaryInterface, p9f, ozl, t55, foa, g, cfp, oqp, hqp {
    public final /* synthetic */ byte a;

    public /* synthetic */ tmj(byte b) {
        this.a = b;
    }

    public static ak2 c(int i) {
        if (i == 0) {
            return ak2.b;
        }
        if (i != 1 && i == 2) {
            return ak2.d;
        }
        return ak2.c;
    }

    public static int i(Context context) {
        return fan.a(40.0f, context.getResources());
    }

    public static vmj j(Context context, String str, int i, int i2, int i3) {
        return l(context, str, umj.b, i, i2, na5.b, (i3 & 32) == 0);
    }

    public static vmj l(Context context, String str, umj umjVar, int i, int i2, na5 na5Var, boolean z) {
        return z5i.a0(str) ? new xmj(context, new lxh(2131231724), umjVar, i, i2, na5.e) : new zmj(context, str, null, umjVar, i, i2, na5Var.g(context, str), z);
    }

    public static vmj m(Context context, String str, int i, int i2, na5 na5Var, int i3) {
        int i4 = vmj.g;
        if ((i3 & 4) != 0) {
            i = i(context);
        }
        int i5 = i;
        if ((i3 & 8) != 0) {
            i2 = i(context);
        }
        int i6 = i2;
        if ((i3 & 16) != 0) {
            na5Var = na5.b;
        }
        return l(context, str, umj.c, i5, i6, na5Var, false);
    }

    public final String a() {
        return "omidJsAttestationListener";
    }

    public final void a(String str, JSONObject jSONObject) throws JSONException {
        if ("attest".equals(str)) {
            try {
                String string = jSONObject.getString("mechanism");
                String string2 = jSONObject.getString("version");
                HashMap mapA = v62.a(jSONObject.getJSONObject("attestationArgs"));
                mapA.put("version", string2);
                cgh.d(pb1.b.a.getApplicationContext(), string, new e7(mapA));
            } catch (Exception unused) {
            }
        }
    }

    public final void b() {
    }

    public final twi createSeekMap() {
        return new rv2(-9223372036854775807L);
    }

    public final long d() {
        return System.currentTimeMillis();
    }

    public final void e(pna pnaVar, Object obj) {
        iwn iwnVar = (iwn) obj;
        boolean zContains = pnaVar.a.f.contains(rvn.a);
        pnaVar.d.f(mpa.l, new gwn((mt5) null, iwnVar, zContains));
        pnaVar.e.f(mpa.p, new hwn((mt5) null, iwnVar, zContains));
    }

    public final qb7 f(Context context) {
        qb7 qb7Var;
        qb7 qb7Var2 = qb7.i;
        if (qb7Var2 != null) {
            return qb7Var2;
        }
        synchronized (this) {
            qb7Var = qb7.i;
            if (qb7Var == null) {
                qb7Var = new qb7(context.getApplicationContext(), (byte) 3);
                qb7.i = qb7Var;
            }
        }
        return qb7Var;
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x00ed: MOVE (r9 I:??[OBJECT, ARRAY]) = (r0 I:??[OBJECT, ARRAY]), block:B:56:0x00ec */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    @Override // defpackage.oqp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.ads.interactivemedia.v3.impl.data.zzbs g(com.google.ads.interactivemedia.v3.impl.data.zzbr r10) throws java.lang.Throwable {
        /*
            r9 = this;
            r9 = 0
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lc1 java.io.IOException -> Lc3
            java.lang.String r1 = r10.f()     // Catch: java.lang.Throwable -> Lc1 java.io.IOException -> Lc3
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc1 java.io.IOException -> Lc3
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Lc1 java.io.IOException -> Lc3
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> Lc1 java.io.IOException -> Lc3
            java.lang.String r9 = "User-Agent"
            java.lang.String r1 = r10.g()     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Leb
            r0.setRequestProperty(r9, r1)     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Leb
            int r9 = r10.a()     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Leb
            r0.setConnectTimeout(r9)     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Leb
            int r9 = r10.d()     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Leb
            r0.setReadTimeout(r9)     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Leb
            com.google.ads.interactivemedia.v3.impl.data.zzbq r9 = r10.e()     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Leb
            com.google.ads.interactivemedia.v3.impl.data.zzbq r1 = com.google.ads.interactivemedia.v3.impl.data.zzbq.POST     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Leb
            java.lang.String r2 = "addSuppressed"
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            if (r9 != r1) goto L6a
            r9 = 1
            r0.setDoOutput(r9)     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Leb
            r9 = 0
            r0.setChunkedStreamingMode(r9)     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Leb
            java.lang.String r9 = r10.b()     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Leb
            if (r9 == 0) goto L6a
            java.io.OutputStream r1 = r0.getOutputStream()     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Leb
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L52
            byte[] r9 = r9.getBytes(r4)     // Catch: java.lang.Throwable -> L52
            r1.write(r9)     // Catch: java.lang.Throwable -> L52
            r1.close()     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Leb
            goto L6a
        L52:
            r9 = move-exception
            if (r1 == 0) goto L69
            r1.close()     // Catch: java.lang.Throwable -> L59
            goto L69
        L59:
            r1 = move-exception
            java.lang.Class[] r4 = new java.lang.Class[]{r3}     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> Leb
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r2, r4)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> Leb
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> Leb
            r2.invoke(r9, r1)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> Leb
        L69:
            throw r9     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Leb
        L6a:
            java.io.InputStream r9 = r0.getInputStream()     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Leb
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> La7
            r1.<init>(r9)     // Catch: java.lang.Throwable -> La7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r4.<init>()     // Catch: java.lang.Throwable -> La7
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> La7
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> La7
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> La7
            r6.<init>(r1, r7)     // Catch: java.lang.Throwable -> La7
            r5.<init>(r6)     // Catch: java.lang.Throwable -> La7
        L84:
            java.lang.String r1 = r5.readLine()     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto L8e
            r4.append(r1)     // Catch: java.lang.Throwable -> La7
            goto L84
        L8e:
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> La7
            if (r9 == 0) goto L97
            r9.close()     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Leb
        L97:
            java.lang.String r9 = r0.getContentType()     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Leb
            r0.disconnect()
            java.lang.String r10 = r10.c()
            com.google.ads.interactivemedia.v3.impl.data.zzbs r9 = com.google.ads.interactivemedia.v3.impl.data.zzbs.e(r10, r1, r9)
            return r9
        La7:
            r1 = move-exception
            if (r9 == 0) goto Lbe
            r9.close()     // Catch: java.lang.Throwable -> Lae
            goto Lbe
        Lae:
            r9 = move-exception
            java.lang.Class[] r4 = new java.lang.Class[]{r3}     // Catch: java.lang.Exception -> Lbe java.lang.Throwable -> Leb
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r2, r4)     // Catch: java.lang.Exception -> Lbe java.lang.Throwable -> Leb
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch: java.lang.Exception -> Lbe java.lang.Throwable -> Leb
            r2.invoke(r1, r9)     // Catch: java.lang.Exception -> Lbe java.lang.Throwable -> Leb
        Lbe:
            throw r1     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Leb
        Lbf:
            r9 = move-exception
            goto Lc7
        Lc1:
            r10 = move-exception
            goto Lee
        Lc3:
            r0 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
        Lc7:
            boolean r9 = r9 instanceof java.net.SocketTimeoutException     // Catch: java.lang.Throwable -> Leb
            if (r9 == 0) goto Ldb
            java.lang.String r9 = r10.c()     // Catch: java.lang.Throwable -> Leb
            r10 = 101(0x65, float:1.42E-43)
            com.google.ads.interactivemedia.v3.impl.data.zzbs r9 = com.google.ads.interactivemedia.v3.impl.data.zzbs.d(r10, r9)     // Catch: java.lang.Throwable -> Leb
            if (r0 == 0) goto Lda
            r0.disconnect()
        Lda:
            return r9
        Ldb:
            java.lang.String r9 = r10.c()     // Catch: java.lang.Throwable -> Leb
            r10 = 100
            com.google.ads.interactivemedia.v3.impl.data.zzbs r9 = com.google.ads.interactivemedia.v3.impl.data.zzbs.d(r10, r9)     // Catch: java.lang.Throwable -> Leb
            if (r0 == 0) goto Lea
            r0.disconnect()
        Lea:
            return r9
        Leb:
            r9 = move-exception
            r10 = r9
            r9 = r0
        Lee:
            if (r9 == 0) goto Lf3
            r9.disconnect()
        Lf3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmj.g(com.google.ads.interactivemedia.v3.impl.data.zzbr):com.google.ads.interactivemedia.v3.impl.data.zzbs");
    }

    public final jf2 getKey() {
        return iwn.e;
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingConfigBoundaryInterface
    public final int getMaxPrefetches() {
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingConfigBoundaryInterface
    public final int getMaxPrerenders() {
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingConfigBoundaryInterface
    public final int getPrefetchTTLSeconds() {
        throw null;
    }

    public final long h(lp6 lp6Var) {
        return -1L;
    }

    public final Object k(Function1 function1) {
        fwn fwnVar = new fwn();
        function1.invoke(fwnVar);
        return new iwn(fwnVar.a, fwnVar.c, fwnVar.b);
    }

    public final void startSeek(long j) {
    }

    public final Object zza(IBinder iBinder) {
        int i = dqp.a;
        if (iBinder == null) {
            return null;
        }
        grp grpVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.hsdp.protocol.IHpoaService");
        return grpVarQueryLocalInterface instanceof grp ? grpVarQueryLocalInterface : new mop(iBinder, "com.google.android.play.core.hsdp.protocol.IHpoaService");
    }
}
