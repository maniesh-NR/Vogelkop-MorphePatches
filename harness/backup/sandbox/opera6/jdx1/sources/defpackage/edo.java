package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class edo implements trm {
    public final cdo a;
    public final float b;
    public final float c;
    public final zyk d;
    public final zyk e;
    public boolean f;
    public zrm g;
    public cd5 h;

    public edo(cdo cdoVar) {
        this.a = cdoVar;
        this.b = cdoVar.i();
        this.c = cdoVar.a();
        final byte b = 0;
        this.d = z4c.b(new Function0(this) { // from class: ddo
            public final /* synthetic */ edo b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                edo edoVar = this.b;
                switch (b2) {
                    case 0:
                        return new odo(1.0f, edoVar.b, edoVar.c);
                    default:
                        return new ode((odo) edoVar.d.getValue());
                }
            }
        });
        final byte b2 = 1;
        this.e = z4c.b(new Function0(this) { // from class: ddo
            public final /* synthetic */ edo b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                edo edoVar = this.b;
                switch (b22) {
                    case 0:
                        return new odo(1.0f, edoVar.b, edoVar.c);
                    default:
                        return new ode((odo) edoVar.d.getValue());
                }
            }
        });
    }

    public final ListenableFuture a(odo odoVar, boolean z, boolean z2) {
        cd5 cd5Var = new cd5();
        cd5 cd5Var2 = this.h;
        if (cd5Var2 != null) {
            if (z) {
                am2.z("Cancelled due to another zoom value being set.", cd5Var2);
            } else {
                p37.f0(cd5Var, cd5Var2);
            }
        }
        this.h = cd5Var;
        boolean zN = xug.n();
        zyk zykVar = this.e;
        if (zN) {
            ((ode) zykVar.getValue()).r(odoVar);
        } else {
            ((ode) zykVar.getValue()).n(odoVar);
        }
        zrm zrmVar = this.g;
        if (zrmVar != null) {
            float fA = odoVar.a();
            cdo cdoVar = this.a;
            p37.f0(z2 ? cdoVar.m(fA, zrmVar) : cdoVar.c(zrmVar), cd5Var);
        } else {
            am2.z("Camera is not active.", cd5Var);
        }
        return k1g.O(k1g.z(new jl4(cd5Var, (byte) 21)));
    }

    @Override // defpackage.trm
    public final void b(zrm zrmVar) {
        this.g = zrmVar;
        odo odoVar = (odo) ((ode) this.e.getValue()).g();
        if (odoVar == null) {
            odoVar = (odo) this.d.getValue();
        }
        a(odoVar, false, this.f || odoVar.a() != 1.0f);
        this.f = true;
    }

    @Override // defpackage.trm
    public final void reset() {
        a((odo) this.d.getValue(), true, true);
    }
}
