package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class xcc implements mdc, jb4 {
    public final ndc b;
    public final qg4 c;
    public final f8i d;
    public final Object a = new Object();
    public boolean e = false;
    public bp3 f = null;

    public xcc(ndc ndcVar, qg4 qg4Var, f8i f8iVar) {
        this.b = ndcVar;
        this.c = qg4Var;
        this.d = f8iVar;
        if (((qdc) ndcVar.getLifecycle()).i.d(qcc.d)) {
            qg4Var.r();
        } else {
            qg4Var.u();
        }
        ndcVar.getLifecycle().a(this);
    }

    public static void w(List list, f8i f8iVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qrm qrmVar = (qrm) it.next();
            if (qrmVar.o()) {
                synchronized (qrmVar.c) {
                    qrmVar.o = f8iVar;
                }
            }
        }
    }

    @Override // defpackage.jb4
    public final ud4 a() {
        return this.c.a.b;
    }

    public final void c(bp3 bp3Var) {
        synchronized (this.a) {
            if (this.f == null) {
                this.f = bp3Var;
            } else {
                boolean zC = bp3Var.c();
                bp3 bp3Var2 = this.f;
                if (zC) {
                    if (!bp3Var2.c()) {
                        throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                    }
                    ArrayList arrayList = new ArrayList((List) this.f.h);
                    arrayList.addAll((List) bp3Var.h);
                    this.f = new bp3(arrayList, (k8n) bp3Var.c, (List) bp3Var.d);
                } else {
                    if (bp3Var2.c()) {
                        throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                    }
                    this.f = bp3Var;
                    qg4 qg4Var = this.c;
                    qg4Var.A((ArrayList) qg4Var.y());
                }
            }
            qg4 qg4Var2 = this.c;
            k8n k8nVar = (k8n) bp3Var.c;
            synchronized (qg4Var2.m) {
                try {
                    qg4Var2.h = k8nVar;
                } finally {
                }
            }
            qg4 qg4Var3 = this.c;
            List list = (List) bp3Var.d;
            synchronized (qg4Var3.m) {
                qg4Var3.i = list;
            }
            qg4 qg4Var4 = this.c;
            int iB = bp3Var.b();
            synchronized (qg4Var4.m) {
                qg4Var4.j = iB;
            }
            qg4 qg4Var5 = this.c;
            Range range = (Range) bp3Var.e;
            synchronized (qg4Var5.m) {
                qg4Var5.k = range;
            }
            wth wthVarU = s16.u(bp3Var, (xd4) a());
            ((ScheduledExecutorService) bp3Var.j).execute(new zr9(wthVarU, bp3Var, (byte) 17));
            this.c.c((List) bp3Var.h, wthVarU);
        }
    }

    public final mc4 j() {
        return this.c.a.c;
    }

    public final ndc k() {
        ndc ndcVar;
        synchronized (this.a) {
            ndcVar = this.b;
        }
        return ndcVar;
    }

    @ucf(occ.ON_DESTROY)
    public void onDestroy(ndc ndcVar) {
        synchronized (this.a) {
            qg4 qg4Var = this.c;
            qg4Var.A((ArrayList) qg4Var.y());
        }
    }

    @ucf(occ.ON_PAUSE)
    public void onPause(ndc ndcVar) {
        this.c.a.f(false);
    }

    @ucf(occ.ON_RESUME)
    public void onResume(ndc ndcVar) {
        this.c.a.f(true);
    }

    @ucf(occ.ON_START)
    public void onStart(ndc ndcVar) {
        synchronized (this.a) {
            if (!this.e) {
                this.c.r();
            }
        }
    }

    @ucf(occ.ON_STOP)
    public void onStop(ndc ndcVar) {
        synchronized (this.a) {
            if (!this.e) {
                this.c.u();
            }
        }
    }

    public final List r() {
        List listUnmodifiableList;
        synchronized (this.a) {
            listUnmodifiableList = Collections.unmodifiableList(this.c.y());
        }
        return listUnmodifiableList;
    }

    public final void s() {
        synchronized (this.a) {
            if (this.e) {
                return;
            }
            onStop(this.b);
            this.e = true;
        }
    }

    public final void t(bp3 bp3Var) {
        bp3 bp3Var2;
        synchronized (this.a) {
            bp3 bp3Var3 = this.f;
            if (bp3Var3 == null || bp3Var3.c() != bp3Var.b) {
                return;
            }
            if (this.f.c() || bp3Var.b) {
                if (this.f.c() && bp3Var.b) {
                    ArrayList arrayList = new ArrayList((List) this.f.h);
                    arrayList.removeAll((List) bp3Var.h);
                    if (arrayList.isEmpty()) {
                        bp3Var2 = null;
                    } else {
                        bp3 bp3Var4 = this.f;
                        bp3Var2 = new bp3(arrayList, (k8n) bp3Var4.c, (List) bp3Var4.d);
                    }
                    this.f = bp3Var2;
                }
            } else if (this.f != bp3Var) {
                return;
            } else {
                this.f = null;
            }
            ArrayList arrayList2 = new ArrayList((List) bp3Var.h);
            arrayList2.retainAll(this.c.y());
            this.c.A(arrayList2);
            w(arrayList2, null);
        }
    }

    public final void u() {
        synchronized (this.a) {
            List listY = this.c.y();
            this.c.A((ArrayList) listY);
            w(listY, null);
            this.f = null;
        }
    }

    public final void v() {
        synchronized (this.a) {
            if (this.e) {
                this.e = false;
                if (((qdc) this.b.getLifecycle()).i.d(qcc.d)) {
                    onStart(this.b);
                }
            }
        }
    }
}
