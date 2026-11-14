package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import com.leanplum.internal.Clock;
import com.leanplum.internal.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zv9 {
    public final Context a;
    public final b59 b;
    public final Object c = new Object();
    public volatile yv9 d = yv9.d;

    public zv9(Context context, umi umiVar) {
        this.a = context;
        this.b = w1h.l(context, umiVar, "sys_geo", new bg1[]{new a00(this, (byte) 3)});
    }

    public final yv9 a() {
        if (Build.VERSION.SDK_INT >= 31) {
            synchronized (this.c) {
                if (this.d.c > 0) {
                    if (System.currentTimeMillis() - this.d.c < Clock.DAY_MILLIS) {
                        return this.d;
                    }
                }
            }
        }
        Context context = this.a;
        Location lastKnownLocation = (fr3.Q(context, "android.permission.ACCESS_FINE_LOCATION") || fr3.Q(context, "android.permission.ACCESS_COARSE_LOCATION")) ? ((LocationManager) context.getSystemService(Constants.Keys.LOCATION)).getLastKnownLocation("network") : null;
        if (lastKnownLocation == null) {
            return this.d;
        }
        yv9 yv9Var = new yv9(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), System.currentTimeMillis());
        synchronized (this.c) {
            this.d = yv9Var;
            b(this.d);
        }
        return yv9Var;
    }

    public final void b(yv9 yv9Var) throws JSONException {
        String string;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) this.b.get()).edit();
        if (yv9Var == yv9.d) {
            string = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("la", yv9Var.a);
                try {
                    jSONObject.put("lo", yv9Var.b);
                    try {
                        jSONObject.put("ts", yv9Var.c);
                        string = jSONObject.toString();
                    } catch (JSONException e) {
                        t3p.n(e);
                        return;
                    }
                } catch (JSONException e2) {
                    t3p.n(e2);
                    return;
                }
            } catch (JSONException e3) {
                t3p.n(e3);
                return;
            }
        }
        editorEdit.putString("sysutil.location", string).apply();
    }
}
