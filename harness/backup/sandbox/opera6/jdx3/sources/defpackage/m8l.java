package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class m8l implements j6l {
    public Context a;
    public final q6l b = new q6l(this, (byte) 3);
    public k6l c;
    public final x5f d;
    public final x5f e;

    public m8l(x5f x5fVar, x5f x5fVar2) {
        this.d = x5fVar;
        this.e = x5fVar2;
    }

    @Override // defpackage.j6l
    public final void K(bde bdeVar) {
        if (bdeVar.a > 0 || bdeVar.b > 0) {
            a();
        }
        if (bdeVar.a > 0 || bdeVar.b > 0 || bdeVar.c > 0) {
            b();
        }
    }

    public final void a() {
        k6l k6lVar = this.c;
        if (k6lVar == null || !((ArrayList) k6lVar.d.b).isEmpty()) {
            return;
        }
        int iS = this.c.s(p6l.a);
        int iS2 = this.c.s(p6l.b);
        x5f x5fVar = this.d;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            bs0 bs0Var = (bs0) new ck0(zpaVar, x56VarF).k.getValue();
            bs0Var.a.o(1, 1, iS2);
            bs0Var.a.o(0, 1, iS);
            x5fVar.U0(x56VarF);
        }
    }

    public final void b() {
        k6l k6lVar = this.c;
        if (k6lVar == null || !((ArrayList) k6lVar.d.b).isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (b2l b2lVar : Collections.unmodifiableList(this.c.b)) {
            int i = ((d7l) b2lVar).j.a().d;
            if (i != 0) {
                if (((d7l) b2lVar).j.m()) {
                    hashSet2.add(Integer.valueOf(i));
                } else {
                    hashSet.add(Integer.valueOf(i));
                }
            }
        }
        int size = hashSet.size();
        int size2 = hashSet2.size();
        x5f x5fVar = this.d;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            bs0 bs0Var = (bs0) new ck0(zpaVar, x56VarF).k.getValue();
            bs0Var.a.o(4, 1, size);
            bs0Var.a.o(5, 1, size2);
            x5fVar.U0(x56VarF);
        }
    }

    @Override // defpackage.j6l
    public final void d(int i) {
        a();
    }
}
