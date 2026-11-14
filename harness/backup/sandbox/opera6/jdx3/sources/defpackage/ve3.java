package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ve3 implements df3 {
    public final /* synthetic */ byte a = 0;
    public final Object b;

    public ve3(af3 af3Var) {
        this.b = af3Var;
    }

    public ve3(ve3 ve3Var) {
        this.b = new WeakReference(ve3Var);
    }

    private final void c() {
    }

    public final void a(mf3 mf3Var) {
        cf3 cf3Var;
        ArrayList arrayList;
        switch (this.a) {
            case 0:
                synchronized (((af3) this.b).f) {
                    cf3Var = ((af3) this.b).c;
                    if (mf3Var.a != 0) {
                        d();
                    }
                    arrayList = new ArrayList(((af3) this.b).d);
                    ((af3) this.b).d.clear();
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((bg1) obj).run(cf3Var);
                }
                return;
            default:
                df3 df3Var = (df3) ((WeakReference) this.b).get();
                if (df3Var != null) {
                    df3Var.a(mf3Var);
                    return;
                }
                return;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                break;
            default:
                df3 df3Var = (df3) ((WeakReference) this.b).get();
                if (df3Var != null) {
                    df3Var.b();
                    break;
                }
                break;
        }
    }

    public final void d() {
        synchronized (((af3) this.b).f) {
            if (((af3) this.b).g == null) {
                return;
            }
            ((af3) this.b).g = null;
            ((af3) this.b).c.a();
            af3 af3Var = (af3) this.b;
            af3Var.c = af3Var.c();
        }
    }
}
