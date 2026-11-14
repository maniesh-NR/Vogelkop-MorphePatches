package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class rnd extends snd {
    public final Object a = new Object();
    public Executor b;
    public eq6 c;
    public bnd d;
    public ArrayList e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(bnd bndVar, ArrayList arrayList) {
        if (bndVar == null) {
            t3p.q("groupRoute must not be null");
            return;
        }
        synchronized (this.a) {
            Executor executor = this.b;
            if (executor != null) {
                executor.execute(new pnd(this, this.c, bndVar, arrayList, (byte) 0));
            } else {
                this.d = bndVar;
                this.e = new ArrayList(arrayList);
            }
        }
    }

    public abstract void m(String str);

    public abstract void n(String str);

    public abstract void o(ArrayList arrayList);
}
