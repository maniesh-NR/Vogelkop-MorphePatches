package defpackage;

/* loaded from: classes.dex */
public final class gsk implements dsk {
    public final Object a = new Object();
    public volatile dsk b;
    public Object c;

    public gsk(dsk dskVar) {
        dskVar.getClass();
        this.b = dskVar;
    }

    public final Object get() {
        if (this.b != null) {
            synchronized (this.a) {
                if (this.b != null) {
                    Object obj = this.b.get();
                    this.c = obj;
                    this.b = null;
                    return obj;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        String strO = this.b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (strO == null) {
            strO = am2.o(new StringBuilder("<supplier that returned "), this.c, ">");
        }
        return am2.o(sb, strO, ")");
    }
}
