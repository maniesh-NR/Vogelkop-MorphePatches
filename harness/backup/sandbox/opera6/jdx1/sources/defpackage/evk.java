package defpackage;

import android.graphics.Canvas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/* loaded from: classes.dex */
public final class evk implements jva {
    public final p8f a;
    public final iuh b;
    public final int c;
    public final int d;

    public evk(p8f p8fVar, iuh iuhVar, int i, int i2) {
        this.a = p8fVar;
        this.b = iuhVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean a() {
        return true;
    }

    public final long b() {
        return 2048L;
    }

    public final void c(Canvas canvas) {
        ArrayList arrayList;
        p8f p8fVar = this.a;
        p8fVar.getClass();
        s64 s64Var = (s64) p8fVar.c;
        iuh iuhVar = this.b;
        if (iuhVar == null) {
            iuhVar = new iuh((byte) 0);
        }
        if (((ree) iuhVar.c) == null) {
            iuhVar.c = new ree(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        igi igiVar = new igi((byte) 0);
        igiVar.b = canvas;
        igiVar.c = p8fVar;
        cfi cfiVar = (cfi) p8fVar.b;
        if (cfiVar != null) {
            ree reeVar = cfiVar.o;
            iwg iwgVar = cfiVar.n;
            s64 s64Var2 = (s64) iuhVar.b;
            if (s64Var2 != null) {
                ArrayList arrayList2 = s64Var2.b;
                if ((arrayList2 != null ? arrayList2.size() : 0) > 0) {
                    s64Var.j((s64) iuhVar.b);
                }
            }
            igiVar.d = new ggi();
            igiVar.e = new Stack();
            igiVar.G0((ggi) igiVar.d, bfi.b());
            ggi ggiVar = (ggi) igiVar.d;
            ggiVar.f = null;
            ggiVar.h = false;
            ((Stack) igiVar.e).push(new ggi(ggiVar));
            igiVar.g = new Stack();
            igiVar.f = new Stack();
            Boolean bool = cfiVar.d;
            if (bool != null) {
                ((ggi) igiVar.d).h = bool.booleanValue();
            }
            igiVar.x0();
            ree reeVar2 = new ree((ree) iuhVar.c);
            nei neiVar = cfiVar.r;
            if (neiVar != null) {
                reeVar2.d = neiVar.e(igiVar, reeVar2.d);
            }
            nei neiVar2 = cfiVar.s;
            if (neiVar2 != null) {
                reeVar2.e = neiVar2.e(igiVar, reeVar2.e);
            }
            igiVar.f0(cfiVar, reeVar2, reeVar, iwgVar);
            igiVar.w0();
            s64 s64Var3 = (s64) iuhVar.b;
            if (s64Var3 != null) {
                ArrayList arrayList3 = s64Var3.b;
                if ((arrayList3 != null ? arrayList3.size() : 0) <= 0 || (arrayList = s64Var.b) == null) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((r64) it.next()).c == 2) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final int getHeight() {
        return this.d;
    }

    public final int getWidth() {
        return this.c;
    }
}
