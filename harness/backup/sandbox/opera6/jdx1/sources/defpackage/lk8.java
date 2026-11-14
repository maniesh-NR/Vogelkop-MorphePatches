package defpackage;

/* loaded from: classes.dex */
public abstract class lk8 {
    public static final hp7 a = new hp7(new be8((byte) 7), (byte) 1);

    public static final void a(kk8 kk8Var, ue5 ue5Var, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(46334870);
        if ((i & 6) == 0) {
            i2 = (vt9Var.f(kk8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.h(ue5Var) ? 32 : 16;
        }
        if (vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            kfo.c(a.a(kk8Var), gyg.P(-1642740010, new bg5(ue5Var, (byte) 1), vt9Var), vt9Var, 56);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new uf1(kk8Var, ue5Var, i, (byte) 5);
        }
    }

    public static final void b(boolean z, ue5 ue5Var, ih5 ih5Var, int i) {
        boolean z2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1228402237);
        int i2 = i | 2;
        if (vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            vt9Var.S();
            if ((i & 1) == 0 || vt9Var.x()) {
                z2 = !(((double) cs5.f0(((sa5) vt9Var.j(ua5.a)).n)) > 0.5d);
            } else {
                vt9Var.Q();
                z2 = z;
            }
            vt9Var.q();
            a(z2 ? new kk8(zi4.v(4289254035L, 4279580681L, 4281486633L, 4291030957L), zi4.v(4292525567L, 4282131802L, 4283645042L, 4293778687L), zi4.v(4288596732L, 4278202966L, 4279585140L, 4291880191L), zi4.v(4292917901L, 4282199587L, 4284041532L, 4294958272L), zi4.v(4286633426L, 4278204214L, 4280441433L, 4288475631L), zi4.v(4294947264L, 4283768108L, 4285608770L, 4294957535L), zi4.v(4290429951L, 4280429665L, 4281942905L, 4292796671L), zi4.v(4293378668L, 4282330624L, 4284369944L, 4294959001L), cs5.c(534963164), cs5.c(2061689820)) : c(), ue5Var, vt9Var, 48);
        } else {
            vt9Var.Q();
            z2 = z;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new sn3(z2, ue5Var, i);
        }
    }

    public static final kk8 c() {
        return new kk8(zi4.v(4282087206L, 4294967295L, 4291487680L, 4278460672L), zi4.v(4287513834L, 4294967295L, 4293778687L, 4282060912L), zi4.v(4284656886L, 4294967295L, 4291880191L, 4278197557L), zi4.v(4288575551L, 4294967295L, 4294237901L, 4281014016L), zi4.v(4278234539L, 4294967295L, 4289915881L, 4278198303L), zi4.v(4294077069L, 4294967295L, 4294954971L, 4284558138L), zi4.v(4278199452L, 4294967295L, 4292469503L, 4278196549L), zi4.v(4293243672L, 4294967295L, 4294565281L, 4280621568L), cs5.c(522197530), cs5.c(2048924186));
    }
}
