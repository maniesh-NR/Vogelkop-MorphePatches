package defpackage;

import android.view.ViewGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class kj8 extends jal implements pkb, hlb {
    public final ypd b;
    public l2l c;
    public final d5a d;

    /* JADX WARN: Illegal instructions before constructor call */
    public kj8(pde pdeVar, lj8 lj8Var, v8a v8aVar, ypd ypdVar, pde pdeVar2) {
        pde pdeVar3;
        d5a d5aVar;
        ViewGroup viewGroup = lj8Var.a;
        super(viewGroup);
        this.b = ypdVar;
        tsd tsdVarW = a26.w(pdeVar, p37.z(viewGroup));
        final byte b = 0;
        this.c = new l2l(l08.a, 0);
        n4l n4lVar = lj8Var.b;
        if (n4lVar != null) {
            final byte b2 = 1;
            final byte b3 = 2;
            pdeVar3 = pdeVar2;
            d5aVar = new d5a(tsdVarW, n4lVar, v8aVar, pdeVar3, new Function0(this) { // from class: jj8
                public final /* synthetic */ kj8 b;

                {
                    this.b = this;
                }

                public final Object invoke() {
                    byte b4 = b;
                    kj8 kj8Var = this.b;
                    switch (b4) {
                        case 0:
                            kj8Var.b.q(kj8Var.c.b);
                            break;
                        case 1:
                            kj8Var.b.p0(kj8Var.c.b);
                            break;
                        default:
                            kj8Var.b.E(kj8Var.c.b);
                            break;
                    }
                    return Unit.a;
                }
            }, new Function0(this) { // from class: jj8
                public final /* synthetic */ kj8 b;

                {
                    this.b = this;
                }

                public final Object invoke() {
                    byte b4 = b2;
                    kj8 kj8Var = this.b;
                    switch (b4) {
                        case 0:
                            kj8Var.b.q(kj8Var.c.b);
                            break;
                        case 1:
                            kj8Var.b.p0(kj8Var.c.b);
                            break;
                        default:
                            kj8Var.b.E(kj8Var.c.b);
                            break;
                    }
                    return Unit.a;
                }
            }, new tu7((Object) this, (byte) 8), new Function0(this) { // from class: jj8
                public final /* synthetic */ kj8 b;

                {
                    this.b = this;
                }

                public final Object invoke() {
                    byte b4 = b3;
                    kj8 kj8Var = this.b;
                    switch (b4) {
                        case 0:
                            kj8Var.b.q(kj8Var.c.b);
                            break;
                        case 1:
                            kj8Var.b.p0(kj8Var.c.b);
                            break;
                        default:
                            kj8Var.b.E(kj8Var.c.b);
                            break;
                    }
                    return Unit.a;
                }
            });
        } else {
            pdeVar3 = pdeVar2;
            d5aVar = null;
        }
        this.d = d5aVar;
        new h5k(tsdVarW, pdeVar3, lj8Var);
        viewGroup.setOnClickListener(new yk4((Object) this, (byte) 23));
    }

    @Override // defpackage.jal
    public final List X() {
        return this.c.a;
    }

    @Override // defpackage.pkb
    public final boolean d() {
        return true;
    }

    @Override // defpackage.jal, defpackage.pkb
    public final int getGroupId() {
        return this.c.b;
    }

    @Override // defpackage.pkb
    public final boolean n() {
        return true;
    }

    @Override // defpackage.hlb
    public final boolean o() {
        return false;
    }

    @Override // defpackage.hlb
    public final boolean y() {
        return false;
    }
}
