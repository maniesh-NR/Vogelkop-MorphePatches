package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ezk implements dg8 {
    public static final /* synthetic */ int k = 0;
    public final Context a;
    public final a5o b;
    public final m5o c;
    public final t1h d;
    public final x4o e;
    public final wb5 f;
    public final ArrayList g;
    public Intent h;
    public SystemAlarmService i;
    public final wzg j;

    static {
        qs7.B("SystemAlarmDispatcher");
    }

    public ezk(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.a = applicationContext;
        jvg jvgVar = new jvg(new x5i((byte) 1));
        x4o x4oVarC = x4o.c(systemAlarmService);
        this.e = x4oVarC;
        this.f = new wb5(applicationContext, x4oVarC.b.d, jvgVar);
        this.c = new m5o(x4oVarC.b.f);
        t1h t1hVar = x4oVarC.f;
        this.d = t1hVar;
        a5o a5oVar = x4oVarC.d;
        this.b = a5oVar;
        this.j = new wzg(t1hVar, a5oVar, (byte) 14);
        t1hVar.a(this);
        this.g = new ArrayList();
        this.h = null;
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        qp2.n("Needs to be invoked on the main thread.");
    }

    public final void a(w4o w4oVar, boolean z) {
        eba ebaVar = this.b.d;
        int i = wb5.f;
        Intent intent = new Intent(this.a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        wb5.d(intent, w4oVar);
        ebaVar.execute(new sq1(this, intent, 0, (byte) 6));
    }

    public final void b(int i, Intent intent) {
        qs7 qs7VarX = qs7.x();
        Objects.toString(intent);
        qs7VarX.getClass();
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            qs7.x().getClass();
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.g) {
                ArrayList arrayList = this.g;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                        return;
                    }
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.g) {
            boolean zIsEmpty = this.g.isEmpty();
            this.g.add(intent);
            if (zIsEmpty) {
                d();
            }
        }
    }

    public final void d() {
        c();
        PowerManager.WakeLock wakeLockA = iin.a(this.a, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.e.d.a(new dzk(this, (byte) 0));
        } finally {
            wakeLockA.release();
        }
    }
}
