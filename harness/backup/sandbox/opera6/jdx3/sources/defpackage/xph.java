package defpackage;

import androidx.recyclerview.widget.d;

/* loaded from: classes.dex */
public abstract class xph {
    public final d a;
    public final a83 b;

    public xph(d dVar) {
        a83 a83Var = new a83((byte) 15);
        this.b = a83Var;
        this.a = dVar;
        dVar.registerAdapterDataObserver(a83Var);
    }

    public abstract boolean a(int i);
}
