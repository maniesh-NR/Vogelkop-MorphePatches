package defpackage;

import android.graphics.Rect;
import java.util.List;

/* loaded from: classes.dex */
public abstract class u2o {
    public final g3o a;
    public r9b[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public u2o() {
        this(new g3o((g3o) null));
    }

    public u2o(g3o g3oVar) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = g3oVar;
        c(g3oVar);
    }

    public final void a() {
        r9b[] r9bVarArr = this.b;
        if (r9bVarArr != null) {
            r9b r9bVarI = r9bVarArr[0];
            r9b r9bVarI2 = r9bVarArr[1];
            g3o g3oVar = this.a;
            if (r9bVarI2 == null) {
                r9bVarI2 = g3oVar.a.i(2);
            }
            if (r9bVarI == null) {
                r9bVarI = g3oVar.a.i(1);
            }
            h(r9b.a(r9bVarI, r9bVarI2));
            r9b r9bVar = this.b[n1h.i(16)];
            if (r9bVar != null) {
                g(r9bVar);
            }
            r9b r9bVar2 = this.b[n1h.i(32)];
            if (r9bVar2 != null) {
                e(r9bVar2);
            }
            r9b r9bVar3 = this.b[n1h.i(64)];
            if (r9bVar3 != null) {
                i(r9bVar3);
            }
        }
    }

    public abstract g3o b();

    public void c(g3o g3oVar) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listF = g3oVar.a.f(i);
            int i2 = n1h.i(i);
            this.c[i2] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            if (i != 8) {
                List<Rect> listG = g3oVar.a.g(i);
                this.d[i2] = (Rect[]) listG.toArray(new Rect[listG.size()]);
            }
        }
    }

    public void d(int i, r9b r9bVar) {
        if (this.b == null) {
            this.b = new r9b[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[n1h.i(i2)] = r9bVar;
            }
        }
    }

    public abstract void e(r9b r9bVar);

    public abstract void f(r9b r9bVar);

    public abstract void g(r9b r9bVar);

    public abstract void h(r9b r9bVar);

    public abstract void i(r9b r9bVar);
}
