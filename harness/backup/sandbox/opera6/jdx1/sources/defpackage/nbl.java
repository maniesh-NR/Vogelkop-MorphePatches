package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class nbl implements bk9 {
    public final eq6 b;
    public r9i c;
    public xwh d;
    public final ArrayList e;
    public final ArrayDeque a = new ArrayDeque();
    public boolean f = false;

    public nbl(eq6 eq6Var) {
        xug.i();
        this.b = eq6Var;
        this.e = new ArrayList();
    }

    @Override // defpackage.bk9
    public final void a(ck9 ck9Var) {
        final byte b = 1;
        ((g7a) x7d.l()).execute(new Runnable(this) { // from class: mbl
            public final /* synthetic */ nbl b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                nbl nblVar = this.b;
                switch (b2) {
                    case 0:
                        nblVar.d = null;
                        nblVar.c();
                        break;
                    default:
                        nblVar.c();
                        break;
                }
            }
        });
    }

    public final void b() {
        xug.i();
        Throwable gwaVar = new gwa(3, "Camera is closed.", (Throwable) null);
        ArrayDeque arrayDeque = this.a;
        Iterator it = arrayDeque.iterator();
        if (it.hasNext()) {
            bp2 bp2Var = (bp2) it.next();
            bp2Var.getClass();
            new koj(bp2Var, gwaVar, (byte) 4);
            throw null;
        }
        arrayDeque.clear();
        ArrayList arrayList = new ArrayList(this.e);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xwh xwhVar = (xwh) obj;
            xwhVar.getClass();
            xug.i();
            if (!xwhVar.c.b.isDone()) {
                xug.i();
                xwhVar.f = true;
                fr4 fr4Var = xwhVar.h;
                Objects.requireNonNull(fr4Var);
                fr4Var.cancel(true);
                xwhVar.d.d(gwaVar);
                xwhVar.e.b(null);
                xug.i();
                new koj((bp2) null, gwaVar, (byte) 4);
                throw null;
            }
        }
    }

    public final void c() {
        xug.i();
        if (this.d == null && !this.f) {
            r9i r9iVar = this.c;
            r9iVar.getClass();
            xug.i();
            if (((igi) r9iVar.d).L() != 0) {
            }
        }
    }
}
