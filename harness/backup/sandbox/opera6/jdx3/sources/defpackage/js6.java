package defpackage;

import android.content.Context;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class js6 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public js6(Context context, fs6 fs6Var, j4c j4cVar, j4c j4cVar2, xoc xocVar, rs6 rs6Var, tn tnVar) {
        this.a = true;
        this.j = new HashSet();
        this.c = context;
        this.d = fs6Var;
        this.e = j4cVar;
        this.f = j4cVar2;
        this.g = xocVar;
        this.h = rs6Var;
        this.i = tnVar;
    }

    public js6(cpk cpkVar, glh glhVar, qlk qlkVar, txi txiVar) {
        opk opkVar = new opk(this, (byte) 1);
        this.i = opkVar;
        byte b = 2;
        this.j = new opk(this, b);
        this.c = cpkVar;
        this.d = glhVar;
        this.e = qlkVar;
        this.f = txiVar;
        ppk ppkVar = new ppk(this);
        this.g = ppkVar;
        this.h = new opk(this, b);
        cpkVar.c.b(opkVar);
        glhVar.b.b(ppkVar);
    }

    public final void a() {
        byte b = 0;
        if (this.b) {
            this.b = false;
            vml.a((opk) this.j);
        }
        if (this.a) {
            txi txiVar = (txi) this.f;
            ((kd7) txiVar.b).f(new opk(this, b));
        }
    }

    public final void b(zmc zmcVar) {
        long j = zmcVar.a().a;
        this.b = true;
        ((tn) this.i).D((Context) this.c, new kqc(j, false), new hs6(this, (byte) 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i) {
        if (!this.a && i == 1) {
            if (this.b) {
                this.b = false;
            } else {
                ((xoc) this.g).a(tg0.i);
            }
        }
        this.a = i;
    }
}
