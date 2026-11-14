package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class b17 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c17 b;

    public /* synthetic */ b17(c17 c17Var, byte b) {
        this.a = b;
        this.b = c17Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        byte b = this.a;
        c17 c17Var = this.b;
        switch (b) {
            case 0:
                int i = c17Var.b;
                eba ebaVar = c17Var.i;
                Context context = c17Var.a;
                ezk ezkVar = c17Var.d;
                w4o w4oVar = c17Var.c;
                String str = w4oVar.a;
                if (c17Var.g >= 2) {
                    qs7.x().getClass();
                    return;
                }
                c17Var.g = (byte) 2;
                qs7.x().getClass();
                Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                wb5.d(intent, w4oVar);
                byte b2 = 6;
                ebaVar.execute(new sq1(ezkVar, intent, i, b2));
                t1h t1hVar = ezkVar.d;
                String str2 = w4oVar.a;
                synchronized (t1hVar.k) {
                    z = t1hVar.c(str2) != null;
                }
                if (!z) {
                    qs7.x().getClass();
                    return;
                }
                qs7.x().getClass();
                Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent2.setAction("ACTION_SCHEDULE_WORK");
                wb5.d(intent2, w4oVar);
                ebaVar.execute(new sq1(ezkVar, intent2, i, b2));
                return;
            default:
                if (c17Var.g != 0) {
                    qs7 qs7VarX = qs7.x();
                    Objects.toString(c17Var.c);
                    qs7VarX.getClass();
                    return;
                }
                c17Var.g = (byte) 1;
                qs7 qs7VarX2 = qs7.x();
                Objects.toString(c17Var.c);
                qs7VarX2.getClass();
                if (!c17Var.d.d.f(c17Var.l, null)) {
                    c17Var.a();
                    return;
                }
                m5o m5oVar = c17Var.d.c;
                w4o w4oVar2 = c17Var.c;
                synchronized (m5oVar.d) {
                    qs7 qs7VarX3 = qs7.x();
                    Objects.toString(w4oVar2);
                    qs7VarX3.getClass();
                    m5oVar.a(w4oVar2);
                    l5o l5oVar = new l5o(m5oVar, w4oVar2);
                    m5oVar.b.put(w4oVar2, l5oVar);
                    m5oVar.c.put(w4oVar2, c17Var);
                    ((Handler) m5oVar.a.a).postDelayed(l5oVar, 600000L);
                }
                return;
        }
    }
}
