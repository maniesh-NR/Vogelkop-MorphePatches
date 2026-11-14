package defpackage;

import android.content.Context;
import android.media.MediaDrmException;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Size;
import androidx.core.app.NotificationCompat;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hv5 implements iv5, mfa, yh8, mp8, n19, ds9, csg, p9d, lse, vye, tgg, lo7, wn8, bti {
    public static hv5 a;

    public static ruf H(int i, int i2, suf sufVar, tuf tufVar, uuf uufVar, vuf vufVar, qii qiiVar, Size size, String str) {
        qii qiiVar2 = qii.g;
        qii qiiVar3 = (i2 & 8) != 0 ? qiiVar2 : qiiVar;
        suf sufVar2 = (i2 & 64) != 0 ? null : sufVar;
        uuf uufVar2 = (i2 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0 ? null : uufVar;
        vuf vufVar2 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : vufVar;
        l08 l08Var = l08.a;
        if (qiiVar3 == qii.i || qiiVar3 == qii.h || ((qiiVar3 == qii.k || qiiVar3 == qii.l) && Build.VERSION.SDK_INT >= 35)) {
            return new puf(size, i, str, qiiVar3, tufVar, sufVar2, uufVar2, vufVar2, l08Var);
        }
        if (qiiVar3 == qiiVar2) {
            return new quf(size, i, str, tufVar, sufVar2, uufVar2, vufVar2, l08Var);
        }
        qp2.n("Check failed.");
        return null;
    }

    public static w2b I(String str) {
        h58 h58Var = w2b.g;
        w4 w4VarE = sko.e(h58Var, h58Var);
        while (w4VarE.hasNext()) {
            w2b w2bVar = (w2b) w4VarE.next();
            if (w2bVar.a.equals(str)) {
                return w2bVar;
            }
        }
        h9o.h("Collection contains no element matching the predicate.");
        return null;
    }

    public static Locale J(String str) {
        List listL = igg.a.l(0, str);
        String str2 = (String) CollectionsKt.M(0, listL);
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) CollectionsKt.M(1, listL);
        return new Locale(str2, str3 != null ? str3 : "");
    }

    public final Object A(JSONObject jSONObject) {
        return new gse(jSONObject.optString("origin", "firebase"), jSONObject.getString("news_entry_id"), jSONObject.optString("rule_id", null), jSONObject.getString("action_type"), jSONObject.getLong("ts"));
    }

    public final boolean B() {
        return true;
    }

    @Override // defpackage.yh8
    public final wh8 C(byte[] bArr, List list, int i, HashMap map) {
        throw new IllegalStateException();
    }

    public final void D(Object obj, String[] strArr) {
        ((Bundle) obj).putStringArray("data", strArr);
    }

    @Override // defpackage.yh8
    public final boolean E(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    public final String F(String str) {
        return str;
    }

    @Override // defpackage.n19
    public final void G(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(com.google.android.gms.common.api.ResolvableApiException r5, com.opera.android.weather.ui.WeatherWidgetActivity r6, nt5 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof rz9
            if (r0 == 0) goto L13
            r0 = r7
            rz9 r0 = (rz9) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            rz9 r0 = new rz9
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.t
            px5 r7 = px5.a
            int r1 = r0.v
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            defpackage.ybh.y(r4)
            t0i r4 = (t0i) r4
            java.lang.Object r4 = r4.a
            goto L45
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            return r3
        L32:
            defpackage.ybh.y(r4)
            u11 r4 = new u11
            r1 = 13
            r4.<init>(r6, r5, r3, r1)
            r0.v = r2
            java.lang.Object r4 = defpackage.zch.A(r4, r0)
            if (r4 != r7) goto L45
            return r7
        L45:
            java.lang.Throwable r5 = t0i.d(r4)
            if (r5 != 0) goto L51
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.getClass()
            return r4
        L51:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv5.K(com.google.android.gms.common.api.ResolvableApiException, com.opera.android.weather.ui.WeatherWidgetActivity, nt5):java.lang.Object");
    }

    @Override // defpackage.n19
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.vye
    public final boolean b(b8e b8eVar) {
        return false;
    }

    @Override // defpackage.vye
    public final int c() {
        return 8;
    }

    @Override // defpackage.yh8
    public final void closeSession(byte[] bArr) {
    }

    @Override // defpackage.mfa
    public final v1g d(ifa ifaVar, efa efaVar) {
        return new lfa(ifaVar, efaVar);
    }

    @Override // defpackage.csg
    public final CharSequence e(Preference preference) {
        return ((ListPreference) preference).a.getString(2132020045);
    }

    public final Object f() {
        try {
            return new khi(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            rqd.p(e);
            return null;
        }
    }

    @Override // defpackage.yh8
    public final void g(tw2 tw2Var) {
    }

    @Override // defpackage.yh8
    public final xh8 getProvisionRequest() {
        throw new IllegalStateException();
    }

    public final void h(Object obj, String str, String str2) {
        ((Bundle) obj).putString(str, str2);
    }

    public final void i(hra hraVar, List list) {
    }

    @Override // defpackage.yh8
    public final int j() {
        return 1;
    }

    @Override // defpackage.mfa
    public final v1g k() {
        return new lfa(ifa.n, null);
    }

    public final String m(String str) {
        return str;
    }

    public final String n() {
        return "https://news.opera-api.com/us/en/";
    }

    @Override // defpackage.vye
    public final boolean o(b8e b8eVar) {
        return x7d.q(coh.b(ui6.e0(b8eVar), false));
    }

    @Override // defpackage.yh8
    public final byte[] openSession() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // defpackage.vye
    public final void p(m3c m3cVar, long j, oea oeaVar, int i, boolean z) {
        tah tahVar = m3cVar.F;
        wye wyeVar = (wye) tahVar.e;
        zbe zbeVar = wye.U;
        ((wye) tahVar.e).f1(wye.a0, wyeVar.W0(j), oeaVar, 1, z);
    }

    @Override // defpackage.yh8
    public final byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.yh8
    public final void provideProvisionResponse(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.vye
    public final boolean q(oea oeaVar, m3c m3cVar) {
        return false;
    }

    @Override // defpackage.yh8
    public final Map queryKeyStatus(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.n19
    public final Object r(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    @Override // defpackage.yh8
    public final void release() {
    }

    @Override // defpackage.yh8
    public final void restoreKeys(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.yh8
    public final oo9 s(byte[] bArr) {
        throw new IllegalStateException();
    }

    public final Object t(vdg vdgVar) {
        return vdgVar.I;
    }

    @Override // defpackage.vye
    public final boolean u(m3c m3cVar) {
        f0j f0jVarW = m3cVar.w();
        boolean z = false;
        if (f0jVarW != null && f0jVarW.d) {
            z = true;
        }
        return !z;
    }

    public final Object v() {
        return new Bundle();
    }

    public final List w(hra hraVar) {
        return l08.a;
    }

    public final no7 x(Context context) {
        return new tvg(context, 17, "ps");
    }

    public final JSONObject y(Object obj) throws JSONException {
        gse gseVar = (gse) obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("origin", gseVar.a);
        jSONObject.put("news_entry_id", gseVar.b);
        jSONObject.put("rule_id", gseVar.c);
        jSONObject.put("action_type", gseVar.d);
        jSONObject.put("ts", gseVar.e);
        return jSONObject;
    }

    public final String z() {
        return "https://news.opera-api.com/";
    }
}
