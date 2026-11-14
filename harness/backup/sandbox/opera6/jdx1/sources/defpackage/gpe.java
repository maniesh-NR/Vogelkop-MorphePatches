package defpackage;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class gpe {
    public static gpe f;
    public byte a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;

    public gpe() {
        this.c = new Intent("android.intent.action.VIEW");
        this.d = new hv5();
        this.a = (byte) 0;
        this.b = true;
    }

    public gpe(Context context) {
        Executor executorP = f03.p();
        this.c = executorP;
        this.d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.a = (byte) 0;
        executorP.execute(new hpd(this, context, (byte) 14));
    }

    public gpe(qb7 qb7Var) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.c = intent;
        this.d = new hv5();
        this.a = (byte) 0;
        this.b = true;
        if (qb7Var != null) {
            intent.setPackage(((ComponentName) qb7Var.c).getPackageName());
            t66 t66Var = (t66) qb7Var.b;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", t66Var);
            intent.putExtras(bundle);
        }
    }

    public static synchronized gpe b(Context context) {
        gpe gpeVar;
        gpeVar = f;
        if (gpeVar == null) {
            gpeVar = new gpe(context);
            f = gpeVar;
        }
        return gpeVar;
    }

    public final x66 a() {
        Intent intent = (Intent) this.c;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.b);
        ((hv5) this.d).getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", (int) this.a);
        String strA = v66.a();
        if (!TextUtils.isEmpty(strA)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", strA);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (Build.VERSION.SDK_INT >= 34) {
            ActivityOptions activityOptionsA = (ActivityOptions) this.e;
            if (activityOptionsA == null) {
                activityOptionsA = u66.a();
                this.e = activityOptionsA;
            }
            w66.a(activityOptionsA, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.e;
        return new x66(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public final int c() {
        byte b;
        synchronized (this.e) {
            b = this.a;
        }
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            fpe fpeVar = (fpe) it.next();
            if (fpeVar.a.get() == null) {
                copyOnWriteArrayList.remove(fpeVar);
            }
        }
        synchronized (this.e) {
            if (this.b && this.a == i) {
                return;
            }
            this.b = true;
            this.a = i;
            Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
            while (it2.hasNext()) {
                fpe fpeVar2 = (fpe) it2.next();
                fpeVar2.b.execute(new yqd(fpeVar2, (byte) 11));
            }
        }
    }
}
