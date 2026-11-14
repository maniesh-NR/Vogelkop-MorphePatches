package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class c59 {
    public static final ExecutorService l = Executors.newSingleThreadExecutor(new lhe("Opera FCM"));
    public static final ode m = new ode(Collections.EMPTY_SET);
    public final Context a;
    public m59 b;
    public final j59 c;
    public boolean d;
    public boolean e;
    public HashSet f;
    public final b59 g;
    public final b59 h;
    public final h7f i;
    public Boolean j;
    public final t77 k;

    public c59(Context context, umi umiVar, j59 j59Var) {
        this(context, umiVar, j59Var, "fcm_" + j59Var.e);
    }

    public c59(Context context, umi umiVar, j59 j59Var, String str) {
        byte b = 1;
        this.e = true;
        this.i = new h7f();
        this.k = new t77(this, b);
        this.a = context.getApplicationContext();
        dg7 dg7Var = new dg7(this, (byte) 19);
        ScheduledExecutorService scheduledExecutorService = vml.a;
        this.g = w1h.l(context, umiVar, str, new bg1[]{new dz8(dg7Var, b)});
        this.c = j59Var;
        b59 b59Var = new b59(this, context);
        this.h = b59Var;
        l.execute(new bn7((Object) b59Var, (byte) 26));
    }

    public final void a(m59 m59Var) {
        m59Var.m(this.d ? 2 : 3);
        boolean z = this.d;
        t77 t77Var = this.k;
        if (z) {
            d().k(t77Var);
            return;
        }
        d().p(t77Var);
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) r49.f((String) this.h.get()).b(FirebaseMessaging.class);
        HashSet hashSet = (HashSet) c();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            firebaseMessaging.i.onSuccessTask(new jp5((String) it.next(), (byte) 5));
        }
        if (hashSet.size() > 0) {
            b().edit().remove("subscribed_topics").apply();
        }
        hashSet.clear();
    }

    public final SharedPreferences b() {
        return (SharedPreferences) this.g.get();
    }

    public final Set c() {
        HashSet hashSet = this.f;
        if (hashSet != null) {
            return hashSet;
        }
        HashSet hashSetM = w1h.m(b(), "subscribed_topics");
        this.f = hashSetM;
        return hashSetM;
    }

    public ekc d() {
        return m;
    }

    public void e(String str, String str2, boolean z) {
        h7f h7fVar = this.i;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((q3i) g7fVarH.next()).a(str2);
        }
    }

    public final void f(boolean z) {
        m59 m59Var = this.b;
        if (m59Var != null) {
            m59Var.m(z ? 5 : 4);
            return;
        }
        Boolean bool = this.j;
        if (bool == null || !bool.booleanValue()) {
            this.j = Boolean.valueOf(z);
        }
    }
}
