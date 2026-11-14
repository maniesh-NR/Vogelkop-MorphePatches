package defpackage;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.d;

/* loaded from: classes.dex */
public final class xke {
    public final w7j a;
    public final m2k b;
    public final d c;
    public final rma d;
    public int e;

    public xke(d dVar, rma rmaVar, b3g b3gVar, m2k m2kVar) {
        a83 a83Var = new a83((Object) this, (byte) 12);
        this.c = dVar;
        this.d = rmaVar;
        b3gVar.getClass();
        w7j w7jVar = new w7j();
        w7jVar.d = b3gVar;
        w7jVar.a = new SparseIntArray(1);
        w7jVar.b = new SparseIntArray(1);
        w7jVar.c = this;
        this.a = w7jVar;
        this.b = m2kVar;
        this.e = dVar.getItemCount();
        dVar.registerAdapterDataObserver(a83Var);
    }
}
