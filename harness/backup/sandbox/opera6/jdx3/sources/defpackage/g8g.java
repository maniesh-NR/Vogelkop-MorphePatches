package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class g8g implements dth {
    public final Set a;
    public final dfe b = new dfe(new zt9[16]);

    public g8g(Set set) {
        this.a = set;
    }

    public final void a() {
        dfe dfeVar = this.b;
        Object[] objArr = dfeVar.a;
        int i = dfeVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            dth dthVar = ((zt9) objArr[i2]).a;
            this.a.remove(dthVar);
            dthVar.a();
        }
    }

    public final void b() {
    }

    public final void c() {
    }
}
