package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class am7 {
    public final int a;
    public final jrd b;
    public final CopyOnWriteArrayList c;

    public am7(CopyOnWriteArrayList copyOnWriteArrayList, int i, jrd jrdVar) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = jrdVar;
    }

    public final void a(ix5 ix5Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            zl7 zl7Var = (zl7) it.next();
            tym.S(zl7Var.a, new gl6(this, zl7Var.b, ix5Var, (byte) 11));
        }
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            zl7 zl7Var = (zl7) it.next();
            tym.S(zl7Var.a, new yl7(this, zl7Var.b, (byte) 1));
        }
    }

    public final void c(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            zl7 zl7Var = (zl7) it.next();
            tym.S(zl7Var.a, new kw4(this, zl7Var.b, i, (byte) 3));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            zl7 zl7Var = (zl7) it.next();
            tym.S(zl7Var.a, new gl6(this, zl7Var.b, exc, (byte) 10));
        }
    }

    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            zl7 zl7Var = (zl7) it.next();
            tym.S(zl7Var.a, new yl7(this, zl7Var.b, (byte) 0));
        }
    }
}
