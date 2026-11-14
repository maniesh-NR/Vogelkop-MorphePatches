package defpackage;

import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class ss8 extends k6k {
    public final /* synthetic */ byte d = 1;
    public final Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss8(i7k i7kVar, mbf mbfVar, e6k e6kVar) {
        super(e6kVar, i7kVar);
        this.e = i7kVar;
        this.f = mbfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss8(ts8 ts8Var, e6k e6kVar) {
        super(e6kVar, ts8Var);
        this.f = ts8Var;
        this.e = new hv8(ts8Var.d.getContext());
    }

    @Override // defpackage.k6k
    public final kv8 a() {
        switch (this.d) {
            case 0:
                return ((hv8) this.e).e;
            default:
                jv8 jv8Var = jv8.a;
                return jv8.b;
        }
    }

    @Override // defpackage.k6k
    public final mv8 b(e6k e6kVar) {
        switch (this.d) {
            case 0:
                return e6kVar == e6k.h ? (hv8) this.e : super.b(e6kVar);
            default:
                return jv8.a;
        }
    }

    @Override // defpackage.k6k
    public final int c(bz3 bz3Var) {
        switch (this.d) {
            case 0:
                return jym.j(((i) ((rs8) ((ts8) this.f).u.q())).itemView, bz3Var);
            default:
                return jym.j(((i) ((h7k) ((i7k) this.e).j.q())).itemView, bz3Var);
        }
    }

    @Override // defpackage.k6k
    public final boolean d(bz3 bz3Var) {
        byte b = this.d;
        Object obj = this.f;
        switch (b) {
            case 0:
                return ((ts8) obj).z();
            default:
                boolean z = ((i7k) this.e).z() && !bz3Var.b(e6k.d);
                xf8.F0(((mbf) obj).f, Boolean.valueOf(z));
                return z;
        }
    }
}
