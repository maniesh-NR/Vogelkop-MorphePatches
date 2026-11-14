package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class o63 extends h6e {
    public final HashSet d;
    public final HashSet e;

    public o63() {
        super(99);
        this.d = new HashSet();
        this.e = new HashSet();
    }

    @Override // defpackage.h6e
    public final void e(RecyclerView recyclerView, int i, int i2) {
        hq8 hq8Var;
        HashSet hashSet = this.e;
        hashSet.clear();
        while (true) {
            HashSet hashSet2 = this.d;
            if (i > i2) {
                hashSet2.clear();
                hashSet2.addAll(hashSet);
                return;
            }
            i iVarN = recyclerView.N(i, false);
            if ((iVarN instanceof fs8) && (hq8Var = ((fs8) iVarN).f) != null) {
                hashSet.add(hq8Var);
                if (!hashSet2.contains(hq8Var)) {
                    h(hq8Var);
                }
            }
            i++;
        }
    }

    @Override // defpackage.h6e
    public final void f() {
        this.d.clear();
    }

    public abstract void h(hq8 hq8Var);

    public final void i() {
        this.d.clear();
    }
}
