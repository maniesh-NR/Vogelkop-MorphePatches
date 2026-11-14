package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class q9 extends dx4 {
    public final /* synthetic */ byte g;
    public final Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(byte b) {
        super(1000);
        this.g = b;
        switch (b) {
            case 1:
                d9j[] d9jVarArr = d9j.a;
                super(14000);
                this.h = l08.a;
                break;
            default:
                d9j[] d9jVarArr2 = d9j.a;
                this.h = l08.a;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(lw3 lw3Var) {
        super(13000);
        this.g = (byte) 2;
        d9j[] d9jVarArr = d9j.a;
        this.h = lw3Var;
    }

    @Override // defpackage.t6j
    public final ix4 b(hx4 hx4Var) {
        switch (this.g) {
            case 2:
                if (((Boolean) ((lw3) this.h).get()).booleanValue()) {
                    ub6[] ub6VarArr = ub6.a;
                    hx4Var.b(2);
                    hx4Var.b(6);
                } else {
                    ub6[] ub6VarArr2 = ub6.a;
                    hx4Var.b(7);
                }
                return hx4Var.a();
            default:
                return super.b(hx4Var);
        }
    }

    @Override // defpackage.ex4, defpackage.v6j
    public final List d() {
        switch (this.g) {
            case 0:
                return (l08) this.h;
            case 1:
                return (l08) this.h;
            default:
                return super.d();
        }
    }

    @Override // defpackage.dx4
    public final r6j h(r6j r6jVar, int i) {
        switch (this.g) {
            case 0:
                return r6jVar.a(i, new x6j(d8j.class, new ve5((byte) 4)), 2132021064, 2131231961, true, new y2((byte) 2));
            case 1:
                return r6j.b(r6jVar, i, new x6j(d8j.class, new ali((byte) 7)), 2132021010, 0, null, 56);
            default:
                return r6j.b(r6jVar, i, new x6j(d8j.class, new ah5((byte) 24)), 2132021176, 0, new tb6((byte) 0), 24);
        }
    }
}
