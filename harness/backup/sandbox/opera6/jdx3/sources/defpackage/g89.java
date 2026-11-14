package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.install.zza;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g89 {
    public final x5f a;
    public final esg b;
    public final ydj c;
    public final rsp d;
    public Task e;
    public e89 f;
    public fu1 g;
    public zza h;
    public boolean i;
    public boolean l;
    public Integer n;
    public final jdj o;
    public final plh p;
    public final ode j = new ode(Boolean.FALSE);
    public final Object k = new Object();
    public f89 m = f89.a;

    public g89(x5f x5fVar, nv1 nv1Var, esg esgVar, ov1 ov1Var, ydj ydjVar) {
        this.a = x5fVar;
        this.b = esgVar;
        this.c = ydjVar;
        this.d = (rsp) nv1Var.get();
        jdj jdjVarB = ipe.b(0, 16, h04.a);
        this.o = jdjVarB;
        this.p = a26.i(jdjVarB);
        ((umi) esgVar.b).d(new bi2(esgVar, new bn7((Object) this, (byte) 28), (byte) 15)).a(null);
    }

    public final void a(t5d t5dVar) {
        if (this.c.a.a.getLong("update.flexible.dialog_shown", 0L) + 604800000 < System.currentTimeMillis()) {
            b(t5dVar, false);
        }
    }

    public final void b(t5d t5dVar, final boolean z) {
        fu1 fu1Var = this.g;
        ode odeVar = this.j;
        Object objG = odeVar.g();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.a(objG, bool) || fu1Var == null) {
            if (fu1Var == null) {
                c();
                return;
            }
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        nv6 nv6VarB = this.c.a.b();
        ((SharedPreferences.Editor) nv6VarB.a).putLong("update.flexible.dialog_shown", jCurrentTimeMillis);
        nv6VarB.w();
        int iNextInt = mdb.b.nextInt() & 65535;
        odeVar.r(bool);
        this.g = null;
        this.h = null;
        t5dVar.c.put(Integer.valueOf(iNextInt), new ni() { // from class: d89
            @Override // defpackage.ni
            public final void a(int i, Intent intent) {
                g89 g89Var = this.a;
                x5f x5fVar = g89Var.a;
                boolean z2 = z;
                if (i == -1) {
                    x5fVar.O0(vb0.b, z2);
                } else {
                    x5fVar.O0(vb0.c, z2);
                }
                g89Var.j.r(Boolean.FALSE);
                g89Var.c();
            }
        });
        try {
            this.d.getClass();
            PendingIntent pendingIntent = fu1Var.d;
            if ((pendingIntent != null ? pendingIntent : null) == null || fu1Var.e) {
                return;
            }
            fu1Var.e = true;
            t5dVar.startIntentSenderForResult((pendingIntent != null ? pendingIntent : null).getIntentSender(), iNextInt, (Intent) null, 0, 0, 0, (Bundle) null);
        } catch (IntentSender.SendIntentException unused) {
            odeVar.r(Boolean.FALSE);
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111 A[PHI: r3
      0x0111: PHI (r3v2 java.lang.Integer) = (r3v1 java.lang.Integer), (r3v3 java.lang.Integer), (r3v3 java.lang.Integer) binds: [B:65:0x010b, B:55:0x00f4, B:57:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v17, types: [e89] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g89.c():void");
    }
}
