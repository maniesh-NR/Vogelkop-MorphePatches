package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ll9 {
    public final mcj b;
    public final qim c;
    public int i;
    public final ArrayDeque a = new ArrayDeque();
    public final il9 d = new il9(this, 0);
    public final il9 e = new il9(this, 1);
    public final il9 f = new il9(this, 2);
    public final ArrayList g = new ArrayList();
    public int h = 1;

    public ll9(mcj mcjVar, qim qimVar) {
        this.b = mcjVar;
        this.c = qimVar;
        ((dx3) mcjVar.a).getSupportFragmentManager().b0(new jl9(this), true);
    }

    public final void a() {
        if (this.h > 0) {
            return;
        }
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.size() != 0) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                zhj zhjVar = (zhj) it.next();
                if (this.i <= 0 || ucl.class.isAssignableFrom((Class) zhjVar.a.c)) {
                    it.remove();
                    if (ucl.class.isAssignableFrom((Class) zhjVar.a.c)) {
                        this.i++;
                    }
                    this.b.h(zhjVar);
                }
            }
        }
    }

    public final void b(zhj zhjVar) {
        this.a.offer(zhjVar);
        a();
    }
}
