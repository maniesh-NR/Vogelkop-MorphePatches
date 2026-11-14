package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class djc implements ivh, z2a {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // defpackage.z2a
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((s0i) it.next()).a();
        }
    }

    @Override // defpackage.z2a
    public final void b() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((s0i) it.next()).a();
        }
    }

    @Override // defpackage.z2a
    public final void c() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((s0i) it.next()).a();
        }
    }

    public final void d(s0i s0iVar) {
        this.a.add(s0iVar);
    }

    public final void e(long j, x61 x61Var) {
        Integer num;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            s0i s0iVar = (s0i) it.next();
            if (!s0iVar.d.h0() && !s0iVar.d.isCancelled()) {
                synchronized (s0iVar) {
                    pwh pwhVar = s0iVar.g;
                    if (pwhVar != null && j >= pwhVar.a) {
                        Long l = (Long) x61Var.c(CaptureResult.SENSOR_TIMESTAMP);
                        long frameNumber = x61Var.a.getFrameNumber();
                        if (l != null && s0iVar.f == null) {
                            s0iVar.f = l;
                        }
                        Long l2 = s0iVar.f;
                        if (s0iVar.c == null || l2 == null || l == null || l.longValue() - l2.longValue() <= s0iVar.c.longValue()) {
                            if (s0iVar.e == null) {
                                s0iVar.e = new ho9(frameNumber);
                            }
                            ho9 ho9Var = s0iVar.e;
                            if (ho9Var != null && (num = s0iVar.b) != null && frameNumber - ho9Var.a > num.intValue()) {
                                s0iVar.d.j0(new r0i(1, x61Var));
                            } else if (((Boolean) s0iVar.a.invoke(x61Var)).booleanValue()) {
                                s0iVar.d.j0(new r0i(0, x61Var));
                            }
                        } else {
                            s0iVar.d.j0(new r0i(2, x61Var));
                        }
                    }
                }
            }
            this.a.remove(s0iVar);
        }
    }

    @Override // defpackage.ivh
    public final void n(owh owhVar, long j, x61 x61Var) {
        e(owhVar.r(), x61Var);
    }

    @Override // defpackage.ivh
    public final void o(owh owhVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            s0i s0iVar = (s0i) it.next();
            long jR = owhVar.r();
            synchronized (s0iVar) {
                if (s0iVar.g == null) {
                    s0iVar.g = new pwh(jR);
                }
            }
        }
    }

    @Override // defpackage.ivh
    public final void s(owh owhVar, long j, w61 w61Var) {
        e(owhVar.r(), w61Var.b);
    }
}
