package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class qzk implements ocf, dg8 {
    public static final /* synthetic */ int k = 0;
    public final Context a;
    public final x4o b;
    public final a5o c;
    public final Object d = new Object();
    public w4o e;
    public final LinkedHashMap f;
    public final HashMap g;
    public final HashMap h;
    public final oji i;
    public SystemForegroundService j;

    static {
        qs7.B("SystemFgDispatcher");
    }

    public qzk(Context context) {
        this.a = context;
        x4o x4oVarC = x4o.c(context);
        this.b = x4oVarC;
        this.c = x4oVarC.d;
        this.e = null;
        this.f = new LinkedHashMap();
        this.h = new HashMap();
        this.g = new HashMap();
        this.i = new oji(x4oVarC.j);
        x4oVarC.f.a(this);
    }

    public final void a(w4o w4oVar, boolean z) {
        Map.Entry entry;
        synchronized (this.d) {
            unb unbVar = ((h5o) this.g.remove(w4oVar)) != null ? (unb) this.h.remove(w4oVar) : null;
            if (unbVar != null) {
                unbVar.k((CancellationException) null);
            }
        }
        ij9 ij9Var = (ij9) this.f.remove(w4oVar);
        if (w4oVar.equals(this.e)) {
            if (this.f.size() > 0) {
                Iterator it = this.f.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.e = (w4o) entry.getKey();
                if (this.j != null) {
                    ij9 ij9Var2 = (ij9) entry.getValue();
                    SystemForegroundService systemForegroundService = this.j;
                    int i = ij9Var2.a;
                    int i2 = ij9Var2.b;
                    Notification notification = ij9Var2.c;
                    systemForegroundService.getClass();
                    if (Build.VERSION.SDK_INT >= 31) {
                        try {
                            systemForegroundService.startForeground(i, notification, i2);
                        } catch (ForegroundServiceStartNotAllowedException unused) {
                            qs7.x().getClass();
                        } catch (SecurityException unused2) {
                            qs7.x().getClass();
                        }
                    } else {
                        systemForegroundService.startForeground(i, notification, i2);
                    }
                    this.j.d.cancel(ij9Var2.a);
                }
            } else {
                this.e = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.j;
        if (ij9Var == null || systemForegroundService2 == null) {
            return;
        }
        qs7 qs7VarX = qs7.x();
        w4oVar.toString();
        qs7VarX.getClass();
        systemForegroundService2.d.cancel(ij9Var.a);
    }

    public final void b(Intent intent) {
        if (this.j == null) {
            qp2.n("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        w4o w4oVar = new w4o(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        qs7.x().getClass();
        if (notification == null) {
            qp2.o("Notification passed in the intent was null.");
            return;
        }
        ij9 ij9Var = new ij9(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f;
        linkedHashMap.put(w4oVar, ij9Var);
        ij9 ij9Var2 = (ij9) linkedHashMap.get(this.e);
        if (ij9Var2 == null) {
            this.e = w4oVar;
        } else {
            this.j.d.notify(intExtra, notification);
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                i |= ((ij9) ((Map.Entry) it.next()).getValue()).b;
            }
            ij9Var = new ij9(ij9Var2.a, ij9Var2.c, i);
        }
        SystemForegroundService systemForegroundService = this.j;
        systemForegroundService.getClass();
        int i2 = Build.VERSION.SDK_INT;
        int i3 = ij9Var.a;
        int i4 = ij9Var.b;
        Notification notification2 = ij9Var.c;
        if (i2 < 31) {
            systemForegroundService.startForeground(i3, notification2, i4);
            return;
        }
        try {
            systemForegroundService.startForeground(i3, notification2, i4);
        } catch (ForegroundServiceStartNotAllowedException unused) {
            qs7.x().getClass();
        } catch (SecurityException unused2) {
            qs7.x().getClass();
        }
    }

    public final void c() {
        this.j = null;
        synchronized (this.d) {
            Iterator it = this.h.values().iterator();
            while (it.hasNext()) {
                ((unb) it.next()).k((CancellationException) null);
            }
        }
        this.b.f.e(this);
    }

    public final void d(h5o h5oVar, fp5 fp5Var) {
        if (fp5Var instanceof ep5) {
            qs7.x().getClass();
            w4o w4oVar = new w4o(h5oVar.a, h5oVar.t);
            int i = ((ep5) fp5Var).a;
            x4o x4oVar = this.b;
            x4oVar.d.a(new mjf(x4oVar.f, new w8k(w4oVar), true, i));
        }
    }

    public final void e(int i) {
        qs7.x().getClass();
        for (Map.Entry entry : this.f.entrySet()) {
            if (((ij9) entry.getValue()).b == i) {
                w4o w4oVar = (w4o) entry.getKey();
                x4o x4oVar = this.b;
                x4oVar.d.a(new mjf(x4oVar.f, new w8k(w4oVar), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.j;
        if (systemForegroundService != null) {
            systemForegroundService.b = true;
            qs7.x().getClass();
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
        }
    }
}
