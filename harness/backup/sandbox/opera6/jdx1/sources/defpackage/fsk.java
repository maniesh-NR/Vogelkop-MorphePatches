package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class fsk implements dsk, Serializable {
    public final transient Object a = new Object();
    public final dsk b;
    public volatile transient boolean c;
    public transient Object d;

    public fsk(dsk dskVar) {
        dskVar.getClass();
        this.b = dskVar;
    }

    public final Object get() {
        if (!this.c) {
            synchronized (this.a) {
                if (!this.c) {
                    Object obj = this.b.get();
                    this.d = obj;
                    this.c = true;
                    return obj;
                }
            }
        }
        return this.d;
    }

    public final String toString() {
        return am2.o(new StringBuilder("Suppliers.memoize("), this.c ? am2.o(new StringBuilder("<supplier that returned "), this.d, ">") : this.b, ")");
    }
}
