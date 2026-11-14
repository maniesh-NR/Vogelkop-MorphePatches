package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.View;
import com.leanplum.internal.Constants;
import com.opera.api.Callback;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.Provider;
import java.util.ArrayList;
import java.util.HashSet;
import javax.crypto.Cipher;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ix5 implements g, v1g, u38, et8, n19, cs9, o9d, psm, lse, gm, lo7, dxg, f06 {
    public static ix5 b;
    public final /* synthetic */ byte a;

    public /* synthetic */ ix5(byte b2) {
        this.a = b2;
    }

    public ix5(fxg fxgVar, i06 i06Var) {
        this.a = (byte) 25;
    }

    public static Typeface k(String str, ki9 ki9Var, int i) {
        if (i == 0 && Intrinsics.a(ki9Var, ki9.e) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (i == 0 && Intrinsics.a(ki9Var, ki9.h) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT_BOLD;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), ki9Var.a, i == 1);
    }

    public static void o(View view) {
        Object tag = view.getTag();
        mt7 mt7Var = tag instanceof mt7 ? (mt7) tag : null;
        if (mt7Var == null) {
            return;
        }
        mt7Var.a.cancel();
    }

    public static y2b p(int i) {
        h58 h58Var = y2b.g;
        w4 w4VarE = sko.e(h58Var, h58Var);
        while (w4VarE.hasNext()) {
            y2b y2bVar = (y2b) w4VarE.next();
            if (y2bVar.a == i) {
                return y2bVar;
            }
        }
        h9o.h("Collection contains no element matching the predicate.");
        return null;
    }

    public static void s(View view, float f) {
        view.setAlpha(f);
        view.setVisibility(f > 0.0f ? 0 : 8);
        view.setClickable(f == 1.0f);
    }

    public static void t(View view, pt7 pt7Var, ot7 ot7Var, boolean z) {
        boolean z2 = pt7Var.a == ot7Var;
        if (z2) {
            view.setEnabled(pt7Var.b);
        }
        w(view, z2, z);
    }

    public static void u(View view, st7 st7Var, rt7 rt7Var) {
        int i = wt7.o;
        boolean z = st7Var.a == rt7Var;
        if (z) {
            view.setEnabled(true);
        }
        w(view, z, false);
    }

    public static void w(View view, boolean z, boolean z2) {
        float alpha = view.getAlpha();
        float f = z ? 1.0f : 0.0f;
        if (alpha == f) {
            Object tag = view.getTag();
            mt7 mt7Var = tag instanceof mt7 ? (mt7) tag : null;
            if (mt7Var == null) {
                return;
            }
            ValueAnimator valueAnimator = mt7Var.a;
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.cancel();
            view.setTag(null);
            return;
        }
        o(view);
        byte b2 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(alpha, f);
        mt7 mt7Var2 = new mt7(valueAnimatorOfFloat);
        valueAnimatorOfFloat.setDuration(pn7.f(wt7.m));
        if (!z && z2) {
            valueAnimatorOfFloat.setStartDelay(pn7.f(wt7.n));
            view.setClickable(false);
        }
        valueAnimatorOfFloat.addUpdateListener(new lt7(view, b2));
        valueAnimatorOfFloat.addListener(new nt7(view, f, (byte) 0));
        view.setTag(mt7Var2);
        valueAnimatorOfFloat.start();
    }

    @Override // defpackage.lse
    public final Object A(JSONObject jSONObject) throws JSONException {
        hse hseVar = new hse(jSONObject.getString("news_device_id"), jSONObject.getString("news_feed_host"));
        JSONArray jSONArray = jSONObject.getJSONArray("events");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            gse gseVar = new gse(jSONObject2.optString("origin", "firebase"), jSONObject2.getString("news_entry_id"), jSONObject2.optString("rule_id", null), jSONObject2.getString("action_type"), jSONObject2.getLong("ts"));
            nse nseVar = hseVar.c;
            ((ArrayList) nseVar.b).add(gseVar);
            nseVar.a();
        }
        return hseVar;
    }

    public final void G(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.gm
    public final void b(String str, String str2) {
    }

    public final String[] c(Object obj) {
        JSONArray jSONArrayOptJSONArray = ((JSONObject) obj).optJSONArray(Constants.Params.DATA);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            arrayList.add(jSONArrayOptJSONArray.optString(i));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final Object d(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }

    public final Object e(Uri uri, ld6 ld6Var) {
        return Long.valueOf(tym.Q(new BufferedReader(new InputStreamReader(ld6Var)).readLine()));
    }

    @Override // defpackage.gm
    public final void f(HashSet hashSet) {
    }

    public final boolean g(Object obj, String str) {
        return ((JSONObject) obj).has(str);
    }

    @Override // defpackage.gm
    public final void h(HashSet hashSet) {
    }

    public final fee i() {
        return fee.k();
    }

    public final boolean j(u3j u3jVar) {
        return false;
    }

    @Override // defpackage.o9d
    public final Object l(udg udgVar) {
        return Integer.valueOf(udgVar.J);
    }

    public final String m(Object obj, String str) {
        JSONObject jSONObject = (JSONObject) obj;
        if (JSONObject.NULL.equals(jSONObject.opt(str))) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    @Override // defpackage.gm
    public final void n(String str) {
    }

    public final void q(Callback callback) {
        avj avjVar = cak.d;
        avj.g(1, new n32(callback, (byte) 4));
    }

    public final Object r(File file) {
        return new FileInputStream(file);
    }

    public final String toString() {
        switch (this.a) {
            case 28:
                return sko.l("CreationExtras.Key@", Integer.toString(hashCode(), CharsKt.checkRadix(16)), "<", uqh.a(rki.class).c(), ">");
            default:
                return super.toString();
        }
    }

    public final qsm v() {
        return new iyd();
    }

    @Override // defpackage.lo7
    public final no7 x(Context context) {
        return new hwf(context, 17, "pls");
    }

    @Override // defpackage.lse
    public final JSONObject y(Object obj) throws JSONException {
        hse hseVar = (hse) obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("news_device_id", hseVar.a);
        jSONObject.put("news_feed_host", hseVar.b);
        jSONObject.put("events", hseVar.c.d());
        return jSONObject;
    }
}
