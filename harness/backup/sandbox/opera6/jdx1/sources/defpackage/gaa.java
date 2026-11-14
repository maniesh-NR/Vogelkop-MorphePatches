package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class gaa extends uo5 {
    public uo5[] p0 = new uo5[4];
    public int q0 = 0;

    public final void M(int i, e1o e1oVar, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.q0; i2++) {
            uo5 uo5Var = this.p0[i2];
            ArrayList arrayList2 = e1oVar.a;
            if (!arrayList2.contains(uo5Var)) {
                arrayList2.add(uo5Var);
            }
        }
        for (int i3 = 0; i3 < this.q0; i3++) {
            p37.D(this.p0[i3], i, arrayList, e1oVar);
        }
    }

    public void N() {
    }
}
