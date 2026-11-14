package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.location.LocationManager;
import android.os.Process;
import android.os.UserManager;
import androidx.camera.core.ImageProcessingUtil;
import com.leanplum.internal.Constants;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.Provider;
import java.util.concurrent.Executors;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i06 implements k06, u38, o7h, ds9, g, p9d, lse, dxg, f06 {
    public static i06 b;
    public final /* synthetic */ byte a;

    public /* synthetic */ i06(byte b2) {
        this.a = b2;
    }

    public i06(byte[] bArr, Provider provider) {
        this.a = (byte) 25;
        if (fki.d(1)) {
            new SecretKeySpec(bArr, "AES");
        } else {
            t3p.w("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(OperaListItem operaListItem, jwk jwkVar) {
        operaListItem.setVisibility(jwkVar.a ? 0 : 8);
        operaListItem.t(jwkVar.b);
    }

    public static r1e e(String str) {
        h58 h58Var = r1e.e;
        w4 w4VarE = sko.e(h58Var, h58Var);
        while (w4VarE.hasNext()) {
            r1e r1eVar = (r1e) w4VarE.next();
            if (Intrinsics.a(r1eVar.a, str)) {
                return r1eVar;
            }
        }
        h9o.h("Collection contains no element matching the predicate.");
        return null;
    }

    public static asc g(z16 z16Var, bp bpVar) {
        loa loaVar = (IOException) bpVar.b;
        if (!(loaVar instanceof loa)) {
            return null;
        }
        int i = loaVar.c;
        if (i != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503) {
            return null;
        }
        if (z16Var.a(1)) {
            return new asc(1, 300000L);
        }
        if (z16Var.a(2)) {
            return new asc(2, 60000L);
        }
        return null;
    }

    public static i06 j() {
        i06 i06Var = b;
        if (i06Var != null) {
            return i06Var;
        }
        i06 i06Var2 = new i06((byte) 16);
        b = i06Var2;
        return i06Var2;
    }

    public static long l(bp bpVar) {
        id6 cause = (IOException) bpVar.b;
        if ((cause instanceof s1g) || (cause instanceof FileNotFoundException) || (cause instanceof ioa) || (cause instanceof vsc)) {
            return -9223372036854775807L;
        }
        while (cause != null) {
            if ((cause instanceof id6) && cause.a == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((bpVar.a - 1) * 1000, 5000);
    }

    public static boolean m(String str) {
        int iCheckPermission;
        try {
            iCheckPermission = t8.a.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (RuntimeException unused) {
            iCheckPermission = -1;
        }
        return iCheckPermission == 0;
    }

    public static boolean n() {
        LocationManager locationManager;
        Context context = t8.a;
        return (((UserManager) context.getSystemService("user")).hasUserRestriction("no_share_location") || (locationManager = (LocationManager) context.getSystemService(Constants.Keys.LOCATION)) == null || !locationManager.isLocationEnabled()) ? false : true;
    }

    @Override // defpackage.lse
    public final Object A(JSONObject jSONObject) throws JSONException {
        return new jse(jSONObject.has("push_level") ? Integer.valueOf(jSONObject.getInt("push_level")) : null, jSONObject.getString("news_device_id"), jSONObject.getString("news_feed_host"), jSONObject.getString("fcm_token"), jSONObject.optString("fb_campaign", null), jSONObject.optString("appsflyer_campaign", null), jSONObject.optString("appsflyer_source", null), jSONObject.optString("appsflyer_adgroup_id", null), jSONObject.optString("appsflyer_af_adset_id", null), jSONObject.optString("install_referrer", null), jSONObject.optString("abgroup", null), jSONObject.optString("user_mode", null));
    }

    public final void D(Object obj, String[] strArr) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        if (strArr != null) {
            JSONArray jSONArray = new JSONArray();
            try {
                for (String str : strArr) {
                    jSONArray.put(str);
                }
                jSONObject.put(Constants.Params.DATA, jSONArray);
            } catch (JSONException unused) {
            }
        }
    }

    public final Object a(Object obj) throws Throwable {
        Throwable th;
        UnsupportedOperationException unsupportedOperationException;
        Bitmap bitmapCreateBitmap;
        eo2 eo2Var = (eo2) obj;
        int i = eo2Var.c;
        Object obj2 = eo2Var.a;
        int i2 = eo2Var.f;
        bl9 bl9Var = null;
        try {
            try {
                if (i == 35) {
                    qya qyaVar = (qya) obj2;
                    boolean z = i2 % 180 != 0;
                    bl9 bl9Var2 = new bl9(aib.u(z ? qyaVar.getHeight() : qyaVar.getWidth(), z ? qyaVar.getWidth() : qyaVar.getHeight(), 1, 2));
                    try {
                        vva vvaVarD = ImageProcessingUtil.d(qyaVar, bl9Var2, ByteBuffer.allocateDirect((qyaVar.getWidth() * qyaVar.getHeight()) << 2), i2, false);
                        qyaVar.close();
                        if (vvaVarD == null) {
                            throw new gwa(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapCreateBitmap = sfe.K(vvaVarD);
                        vvaVarD.close();
                        bl9Var = bl9Var2;
                    } catch (UnsupportedOperationException e) {
                        unsupportedOperationException = e;
                        throw new gwa(0, "Can't convert " + (i == 35 ? "YUV" : "JPEG") + " to bitmap", unsupportedOperationException);
                    } catch (Throwable th2) {
                        th = th2;
                        bl9Var = bl9Var2;
                        if (bl9Var == null) {
                            throw th;
                        }
                        bl9Var.close();
                        throw th;
                    }
                } else {
                    if (i != 256 && i != 4101) {
                        throw new IllegalArgumentException("Invalid postview image format : " + i);
                    }
                    qya qyaVar2 = (qya) obj2;
                    Bitmap bitmapK = sfe.K(qyaVar2);
                    qyaVar2.close();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i2);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapK, 0, 0, bitmapK.getWidth(), bitmapK.getHeight(), matrix, true);
                }
                if (bl9Var != null) {
                    bl9Var.close();
                }
                return bitmapCreateBitmap;
            } catch (UnsupportedOperationException e2) {
                unsupportedOperationException = e2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final Object d(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }

    @Override // defpackage.k06
    public final h06 f() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public final Object get() {
        return new tjb(Executors.newSingleThreadExecutor());
    }

    public final void h(Object obj, String str, String str2) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (str2 == null) {
                jSONObject.put(str, JSONObject.NULL);
            } else {
                jSONObject.put(str, str2);
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(nt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.j8a
            if (r0 == 0) goto L13
            r0 = r6
            j8a r0 = (defpackage.j8a) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            j8a r0 = new j8a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r5 = r0.t
            px5 r6 = px5.a
            int r1 = r0.v
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r4) goto L2b
            ybh.y(r5)
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r2
        L31:
            ybh.y(r5)
            goto L44
        L35:
            ybh.y(r5)
            avj r5 = cak.d
            r0.v = r3
            r5 = 8
            java.lang.Object r5 = mfh.w(r5, r0)
            if (r5 == r6) goto L57
        L44:
            cv6 r5 = bb7.a
            d7a r5 = s6d.a
            d7a r5 = r5.e
            wv0 r1 = new wv0
            r1.<init>(r4, r2, r4)
            r0.v = r4
            java.lang.Object r5 = na2.Z(r5, r1, r0)
            if (r5 != r6) goto L58
        L57:
            return r6
        L58:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i06.i(nt5):java.lang.Object");
    }

    public final int k(int i) {
        return i == 7 ? 6 : 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0081 -> B:22:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0084 -> B:22:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.util.List r6, ud6 r7, nt5 r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.gc6
            if (r0 == 0) goto L13
            r0 = r8
            gc6 r0 = (defpackage.gc6) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            gc6 r0 = new gc6
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r5 = r0.v
            px5 r8 = px5.a
            int r1 = r0.x
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            java.util.Iterator r6 = r0.u
            java.io.Serializable r7 = r0.t
            pqh r7 = (pqh) r7
            ybh.y(r5)     // Catch: java.lang.Throwable -> L7c
            goto L63
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r2
        L37:
            java.io.Serializable r6 = r0.t
            java.util.List r6 = (java.util.List) r6
            ybh.y(r5)
            goto L57
        L3f:
            ybh.y(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            qa6 r1 = new qa6
            r1.<init>(r6, r5, r2, r4)
            r0.t = r5
            r0.x = r4
            java.lang.Object r6 = r7.a(r1, r0)
            if (r6 == r8) goto L7b
            r6 = r5
        L57:
            pqh r5 = new pqh
            r5.<init>()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = r5
        L63:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L8a
            java.lang.Object r5 = r6.next()
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r0.t = r7     // Catch: java.lang.Throwable -> L7c
            r0.u = r6     // Catch: java.lang.Throwable -> L7c
            r0.x = r3     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L7c
            if (r5 != r8) goto L63
        L7b:
            return r8
        L7c:
            r5 = move-exception
            java.lang.Object r1 = r7.a
            if (r1 != 0) goto L84
            r7.a = r5
            goto L63
        L84:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            wf8.a(r1, r5)
            goto L63
        L8a:
            java.lang.Object r5 = r7.a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 != 0) goto L93
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L93:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i06.o(java.util.List, ud6, nt5):java.lang.Object");
    }

    @Override // defpackage.p9d
    public final Object t(vdg vdgVar) {
        return Integer.valueOf(vdgVar.J);
    }

    public final String toString() {
        switch (this.a) {
            case 28:
                return sko.l("CreationExtras.Key@", Integer.toString(hashCode(), CharsKt.checkRadix(16)), "<", uqh.a(w7n.class).c(), ">");
            default:
                return super.toString();
        }
    }

    public final Object v() {
        return new JSONObject();
    }

    @Override // defpackage.lse
    public final JSONObject y(Object obj) throws JSONException {
        jse jseVar = (jse) obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("news_device_id", jseVar.a);
        jSONObject.put("news_feed_host", jseVar.b);
        jSONObject.put("fcm_token", jseVar.c);
        Integer num = jseVar.d;
        if (num != null) {
            jSONObject.put("push_level", num.intValue());
        }
        String str = jseVar.e;
        if (str != null) {
            jSONObject.put("fb_campaign", str);
        }
        String str2 = jseVar.f;
        if (str2 != null) {
            jSONObject.put("appsflyer_campaign", str2);
        }
        String str3 = jseVar.g;
        if (str3 != null) {
            jSONObject.put("appsflyer_source", str3);
        }
        String str4 = jseVar.h;
        if (str4 != null) {
            jSONObject.put("appsflyer_adgroup_id", str4);
        }
        String str5 = jseVar.i;
        if (str5 != null) {
            jSONObject.put("appsflyer_af_adset_id", str5);
        }
        String str6 = jseVar.j;
        if (str6 != null) {
            jSONObject.put("install_referrer", str6);
        }
        String str7 = jseVar.k;
        if (str7 != null) {
            jSONObject.put("abgroup", str7);
        }
        String str8 = jseVar.l;
        if (str8 != null) {
            jSONObject.put("user_mode", str8);
        }
        jSONObject.put("product", "opera");
        return jSONObject;
    }
}
