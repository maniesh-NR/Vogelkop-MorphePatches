package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class xoj extends cx4 {
    public final /* synthetic */ byte h = 1;
    public final List i;

    /* JADX WARN: Illegal instructions before constructor call */
    public xoj(ggn ggnVar) {
        ekc ekcVar = (ekc) ggnVar.k.getValue();
        d9j[] d9jVarArr = d9j.a;
        super(ekcVar, 45000);
        this.i = l08.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xoj(jvg jvgVar) {
        v9j v9jVar = (v9j) jvgVar.c;
        d9j[] d9jVarArr = d9j.a;
        super(v9jVar, 12000);
        this.i = Arrays.asList(new woj(32000, 2132017533, 2131232197, new voj((byte) 0)), new woj(33000, 2132021549, 2131232127, new voj((byte) 8)), new woj(53000, 2132019549, 2131232126, new voj((byte) 9)), new woj(34000, 2132021553, 2131232158, new voj((byte) 10)), new woj(35000, 2132021539, 2131232013, new voj((byte) 11)), new woj(36000, 2132021552, 2131232137, new voj((byte) 12)), new woj(36500, 2132022712, 2131232318, new voj((byte) 13)), new woj(37000, 2132018993, 2131232078, new voj((byte) 1)), new woj(38000, 2132020583, 2131232133, new voj((byte) 2)), new woj(39000, 2132020447, 2131232067, new voj((byte) 3)), new woj(41000, 2132021072, 2131231965, new voj((byte) 5)), new woj(42000, 2132021457, 2131232281, new voj((byte) 6)), new woj(43000, 2132019772, 2131232283, new voj((byte) 7)));
    }

    @Override // defpackage.s6j
    public final ix4 a(hx4 hx4Var, Object obj) {
        switch (this.h) {
            case 0:
                if (!((yoj) obj).a) {
                    d9j[] d9jVarArr = d9j.a;
                    hx4Var.c.remove(43000);
                }
                break;
            default:
                egn egnVar = (egn) obj;
                byte b = egnVar.b;
                if (b == 2) {
                    dgn[] dgnVarArr = dgn.a;
                    hx4Var.b(2);
                    hx4Var.b(3);
                } else {
                    dgn[] dgnVarArr2 = dgn.a;
                    hx4Var.b(8);
                }
                if (b != 1) {
                    hx4Var.b(6);
                }
                if (b != 2 || !egnVar.d) {
                    hx4Var.b(7);
                }
                if (b != 2 || !egnVar.e) {
                    hx4Var.b(9);
                }
                if (b != 2 || !egnVar.f) {
                    hx4Var.b(10);
                }
                break;
        }
        return hx4Var.a();
    }

    @Override // defpackage.ex4, defpackage.v6j
    public final List d() {
        switch (this.h) {
        }
        return this.i;
    }

    @Override // defpackage.cx4
    public final r6j h(r6j r6jVar, Object obj, int i) {
        switch (this.h) {
            case 0:
                return r6j.b(r6jVar, i, new x6j(qoj.class, new voj((byte) 4)), 2132021562, 0, new tji((Object) this, (byte) 23), 24);
            default:
                return r6j.b(r6jVar, i, new x6j(ben.class, new sul((byte) 10)), ((egn) obj).b == 2 ? 2132022254 : 2132022280, 2131231939, new q0n((byte) 1), 16);
        }
    }
}
