package defpackage;

import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class kb6 implements ac6, xb6 {
    public final List a;
    public final bj6 b;
    public final zb6 c;
    public int d = -1;
    public hub e;
    public List f;
    public int g;
    public volatile u7e h;
    public File i;

    public kb6(List list, bj6 bj6Var, zb6 zb6Var) {
        this.a = list;
        this.b = bj6Var;
        this.c = zb6Var;
    }

    @Override // defpackage.ac6
    public final boolean c() {
        while (true) {
            List list = this.f;
            boolean z = false;
            if (list != null && this.g < list.size()) {
                this.h = null;
                while (!z && this.g < this.f.size()) {
                    List list2 = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    v7e v7eVar = (v7e) list2.get(i);
                    File file = this.i;
                    bj6 bj6Var = this.b;
                    this.h = v7eVar.a(file, bj6Var.e, bj6Var.f, bj6Var.i);
                    if (this.h != null && this.b.c(this.h.c.a()) != null) {
                        this.h.c.e(this.b.o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.a.size()) {
                return false;
            }
            hub hubVar = (hub) this.a.get(this.d);
            bj6 bj6Var2 = this.b;
            File fileC = bj6Var2.h.a().c(new lb6(hubVar, bj6Var2.n));
            this.i = fileC;
            if (fileC != null) {
                this.e = hubVar;
                this.f = this.b.c.b.u(fileC);
                this.g = 0;
            }
        }
    }

    @Override // defpackage.ac6
    public final void cancel() {
        u7e u7eVar = this.h;
        if (u7eVar != null) {
            u7eVar.c.cancel();
        }
    }

    @Override // defpackage.xb6
    public final void d(Exception exc) {
        this.c.b(this.e, exc, this.h.c, 3);
    }

    @Override // defpackage.xb6
    public final void g(Object obj) {
        this.c.a(this.e, obj, this.h.c, 3, this.e);
    }
}
