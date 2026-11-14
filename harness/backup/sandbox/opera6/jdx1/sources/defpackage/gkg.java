package defpackage;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class gkg {
    public static int G;
    public final boolean A;
    public final boolean B;
    public int C;
    public final boolean D;
    public final int E;
    public boolean F;
    public final Context a;
    public final String b;
    public final int c;
    public final dkg d;
    public final ekg e;
    public final Handler f;
    public final l2f g;
    public final IntentFilter h;
    public final fkg i;
    public final up1 j;
    public final HashMap k;
    public final Map l;
    public final PendingIntent m;
    public final int n;
    public l1f o;
    public ArrayList p;
    public gk9 q;
    public boolean r;
    public int s;
    public MediaSession.Token t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public gkg(Service service, int i, dkg dkgVar, ekg ekgVar) {
        Context applicationContext = service.getApplicationContext();
        this.a = applicationContext;
        this.b = "media";
        this.c = i;
        this.d = dkgVar;
        this.e = ekgVar;
        this.C = 2131231447;
        int i2 = G;
        G = i2 + 1;
        this.n = i2;
        Looper mainLooper = Looper.getMainLooper();
        cj5 cj5Var = new cj5(this, (byte) 3);
        String str = tym.a;
        this.f = new Handler(mainLooper, cj5Var);
        this.g = new l2f(applicationContext);
        this.i = new fkg(this, (byte) 0);
        this.j = new up1(this, (byte) 13);
        this.h = new IntentFilter();
        this.u = true;
        this.v = true;
        this.y = true;
        this.z = true;
        this.w = true;
        this.x = true;
        this.B = true;
        this.F = true;
        this.E = -1;
        this.A = true;
        this.D = true;
        HashMap map = new HashMap();
        map.put("androidx.media3.ui.notification.play", new d1f(2131231444, applicationContext.getString(2132018926), a(applicationContext, i2, "androidx.media3.ui.notification.play")));
        map.put("androidx.media3.ui.notification.pause", new d1f(2131231443, applicationContext.getString(2132018925), a(applicationContext, i2, "androidx.media3.ui.notification.pause")));
        map.put("androidx.media3.ui.notification.stop", new d1f(2131231448, applicationContext.getString(2132018938), a(applicationContext, i2, "androidx.media3.ui.notification.stop")));
        map.put("androidx.media3.ui.notification.rewind", new d1f(2131231446, applicationContext.getString(2132018932), a(applicationContext, i2, "androidx.media3.ui.notification.rewind")));
        map.put("androidx.media3.ui.notification.ffwd", new d1f(2131231441, applicationContext.getString(2132018918), a(applicationContext, i2, "androidx.media3.ui.notification.ffwd")));
        map.put("androidx.media3.ui.notification.prev", new d1f(2131231445, applicationContext.getString(2132018928), a(applicationContext, i2, "androidx.media3.ui.notification.prev")));
        map.put("androidx.media3.ui.notification.next", new d1f(2131231442, applicationContext.getString(2132018922), a(applicationContext, i2, "androidx.media3.ui.notification.next")));
        this.k = map;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            this.h.addAction((String) it.next());
        }
        Map map2 = Collections.EMPTY_MAP;
        this.l = map2;
        Iterator it2 = map2.keySet().iterator();
        while (it2.hasNext()) {
            this.h.addAction((String) it2.next());
        }
        this.m = a(applicationContext, this.n, "androidx.media3.ui.notification.dismiss");
        this.h.addAction("androidx.media3.ui.notification.dismiss");
    }

    public static PendingIntent a(Context context, int i, String str) {
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra("INSTANCE_ID", i);
        return PendingIntent.getBroadcast(context, i, intent, 201326592);
    }

    public final void b(gk9 gk9Var) {
        z4o.H(Looper.myLooper() == Looper.getMainLooper());
        z4o.w(gk9Var == null || gk9Var.b.I() == Looper.getMainLooper());
        gk9 gk9Var2 = this.q;
        if (gk9Var2 != gk9Var) {
            fkg fkgVar = this.i;
            if (gk9Var2 != null) {
                gk9Var2.g0(fkgVar);
                if (gk9Var == null) {
                    d(false);
                }
            }
            this.q = gk9Var;
            if (gk9Var != null) {
                gk9Var.S(fkgVar);
                Handler handler = this.f;
                if (handler.hasMessages(1)) {
                    return;
                }
                handler.sendEmptyMessage(1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.gk9 r19, android.graphics.Bitmap r20) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gkg.c(gk9, android.graphics.Bitmap):void");
    }

    public final void d(boolean z) {
        if (this.r) {
            this.r = false;
            this.f.removeMessages(1);
            this.g.a(this.c, null);
            this.a.unregisterReceiver(this.j);
            ekg ekgVar = this.e;
            if (ekgVar != null) {
                ekgVar.f(z);
            }
        }
    }
}
