package defpackage;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jpi extends oj7 implements tub, i0j {
    public final s9i J;
    public whf K;
    public z6 L;
    public boolean M;
    public boolean N;
    public sae O;
    public dzl P;
    public final sp6 Q;
    public final spi R;
    public final gpi S;
    public final vg9 T;
    public final mq5 U;

    public jpi(v51 v51Var, xs3 xs3Var, h89 h89Var, lde ldeVar, fsf fsfVar, kpi kpiVar, boolean z, boolean z2) throws pxb {
        super(scd.d, z, ldeVar, fsfVar);
        this.J = new s9i((byte) 21);
        sp6 sp6Var = new sp6(new wi6(new oji(epi.c)));
        this.Q = sp6Var;
        spi spiVar = new spi(kpiVar, v51Var, h89Var == null ? sp6Var : h89Var, fsfVar, z2, this.J, this, new hpi(this, (byte) 0));
        this.R = spiVar;
        gpi gpiVar = new gpi(spiVar, z);
        this.S = gpiVar;
        vg9 vg9Var = new vg9(2, null, 10);
        T0(vg9Var);
        this.T = vg9Var;
        mq5 mq5Var = new mq5(fsfVar, spiVar, z2, xs3Var, new hpi(this, (byte) 1));
        T0(mq5Var);
        this.U = mq5Var;
        T0(new hle(gpiVar, this.J));
        us3 us3Var = new us3();
        us3Var.o = mq5Var;
        T0(us3Var);
    }

    @Override // defpackage.b8e
    public final boolean I0() {
        return false;
    }

    @Override // defpackage.b8e
    public final void L0() {
        sae saeVar = this.O;
        if (saeVar != null) {
            ((zm9) saeVar).d = ui6.e0(this).y;
        }
        dzl dzlVar = this.P;
        if (dzlVar != null) {
            ((zm9) dzlVar).d = ui6.e0(this).y;
        }
        if (this.n) {
            n27 n27Var = ui6.e0(this).y;
            sp6 sp6Var = this.Q;
            sp6Var.getClass();
            sp6Var.a = new wi6(new oji(n27Var));
        }
    }

    @Override // defpackage.i0j
    public final void R(q0j q0jVar) {
        if (this.s && (this.K == null || this.L == null)) {
            this.K = new whf(this, (byte) 3);
            this.L = new z6(this, null);
        }
        whf whfVar = this.K;
        if (whfVar != null) {
            xtb[] xtbVarArr = o0j.a;
            q0jVar.b(e0j.d, new c8(null, whfVar));
        }
        z6 z6Var = this.L;
        if (z6Var != null) {
            xtb[] xtbVarArr2 = o0j.a;
            q0jVar.b(e0j.e, z6Var);
        }
    }

    @Override // defpackage.tub
    public final boolean V(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.oj7
    public final Object X0(s71 s71Var, jj4 jj4Var) {
        gfe gfeVar = gfe.b;
        spi spiVar = this.R;
        Object objG = spiVar.g(gfeVar, new mz9(s71Var, spiVar, null, (byte) 21), jj4Var);
        return objG == px5.a ? objG : Unit.a;
    }

    @Override // defpackage.tub
    public final boolean c0(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.s || ((!jub.a(uup.s(keyEvent), jub.D) && !jub.a(c26.c(keyEvent.getKeyCode()), jub.C)) || uup.t(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.R.d == fsf.a;
        mq5 mq5Var = this.U;
        if (z) {
            int iU0 = (int) (mq5Var.U0() & 4294967295L);
            jFloatToRawIntBits = Float.floatToRawIntBits(jub.a(c26.c(keyEvent.getKeyCode()), jub.C) ? iU0 : -iU0) & 4294967295L;
        } else {
            int iU02 = (int) (mq5Var.U0() >> 32);
            jFloatToRawIntBits = Float.floatToRawIntBits(jub.a(c26.c(keyEvent.getKeyCode()), jub.C) ? iU02 : -iU02) << 32;
        }
        na2.B(H0(), null, null, new z6(this, jFloatToRawIntBits, null, (byte) 1), 3);
        return true;
    }

    @Override // defpackage.f17, defpackage.omg
    public final void d() {
        g0();
        sae saeVar = this.O;
        if (saeVar != null) {
            ((zm9) saeVar).d = ui6.e0(this).y;
        }
        dzl dzlVar = this.P;
        if (dzlVar != null) {
            ((zm9) dzlVar).d = ui6.e0(this).y;
        }
        g0();
        if (this.n) {
            n27 n27Var = ui6.e0(this).y;
            sp6 sp6Var = this.Q;
            sp6Var.getClass();
            sp6Var.a = new wi6(new oji(n27Var));
        }
    }

    @Override // defpackage.oj7
    public final void d1(aj7 aj7Var) {
        if (this.n) {
            na2.B(this.J.Q(), null, null, new r8h((Object) aj7Var, (Object) this, (mt5) null, (byte) 10), 3);
        }
    }

    @Override // defpackage.oj7, defpackage.omg
    public final void n(fmg fmgVar, gmg gmgVar, long j) throws pxb {
        byte b;
        byte b2;
        List list = fmgVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((Boolean) this.r.invoke(new vmg(((lmg) list.get(i)).i))).booleanValue()) {
                super.n(fmgVar, gmgVar, j);
                break;
            }
            i++;
        }
        if (this.s) {
            if (this.A == null) {
                cw9 cw9Var = new cw9(this);
                T0(cw9Var);
                this.A = cw9Var;
            }
            gmg gmgVar2 = gmg.a;
            mt5 mt5Var = null;
            if (gmgVar == gmgVar2 && fmgVar.f == 6) {
                if (!this.M) {
                    this.O = new sae(this.R, new u59(ViewConfiguration.get(p37.i0(this).getContext()), (byte) 8), new te5(2, this, jpi.class, "onMouseWheelScrollStopped", "onMouseWheelScrollStopped-TH1AsA0(J)V", 4, (byte) 5), ui6.e0(this).y);
                    this.M = true;
                }
                sae saeVar = this.O;
                if (saeVar != null) {
                    nx5 nx5VarH0 = H0();
                    if (saeVar.h == null) {
                        saeVar.h = na2.B(nx5VarH0, null, null, new p71((byte) 16, (mt5) null, saeVar), 3);
                    }
                }
            }
            sae saeVar2 = this.O;
            if (saeVar2 != null && fmgVar.f == 6) {
                List list2 = fmgVar.a;
                int size2 = list2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        if (gmgVar == gmg.a && ((zm9) saeVar2).a) {
                            saeVar2.i(fmgVar);
                            zm9.a(fmgVar);
                        }
                        if (gmgVar == gmg.b && !((zm9) saeVar2).a && saeVar2.i(fmgVar)) {
                            zm9.a(fmgVar);
                        }
                    } else if (((lmg) list2.get(i2)).c()) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (gmgVar == gmgVar2 && ((b2 = fmgVar.f) == 10 || b2 == 11 || b2 == 12)) {
                if (this.N) {
                    b = 10;
                } else {
                    b = 10;
                    this.P = new dzl(this.R, new te5(2, this, jpi.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, (byte) 6), ui6.e0(this).y);
                    this.N = true;
                }
                dzl dzlVar = this.P;
                if (dzlVar != null) {
                    nx5 nx5VarH02 = H0();
                    if (dzlVar.g == null) {
                        dzlVar.g = na2.B(nx5VarH02, null, null, new jj4((byte) 17, mt5Var, (Object) dzlVar), 3);
                    }
                }
            } else {
                b = 10;
            }
            dzl dzlVar2 = this.P;
            if (dzlVar2 != null) {
                byte b3 = fmgVar.f;
                if (b3 == b || b3 == 11 || b3 == 12) {
                    List list3 = fmgVar.a;
                    int size3 = list3.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        if (((lmg) list3.get(i3)).c()) {
                            return;
                        }
                    }
                    if (gmgVar == gmg.a && ((zm9) dzlVar2).a) {
                        dzlVar2.g(fmgVar);
                        zm9.a(fmgVar);
                    }
                    if (gmgVar == gmg.b && !((zm9) dzlVar2).a && dzlVar2.g(fmgVar)) {
                        zm9.a(fmgVar);
                    }
                }
            }
        }
    }

    public final void o1(v51 v51Var, xs3 xs3Var, h89 h89Var, lde ldeVar, fsf fsfVar, kpi kpiVar, boolean z, boolean z2) {
        boolean z3;
        if (this.s != z) {
            this.S.b = z;
            this.K = null;
            this.L = null;
            aoh.j(this);
        }
        if (h89Var == null) {
            h89Var = this.Q;
        }
        spi spiVar = this.R;
        boolean z4 = true;
        if (Intrinsics.a(spiVar.a, kpiVar)) {
            z3 = false;
        } else {
            spiVar.a = kpiVar;
            z3 = true;
        }
        spiVar.b = v51Var;
        fsf fsfVar2 = spiVar.d;
        if (fsfVar2 != fsfVar) {
            spiVar.d = fsfVar;
            fsfVar2 = fsfVar;
            z3 = true;
        }
        if (spiVar.e != z2) {
            spiVar.e = z2;
        } else {
            z4 = z3;
        }
        spiVar.c = h89Var;
        spiVar.f = this.J;
        mq5 mq5Var = this.U;
        mq5Var.o = fsfVar;
        mq5Var.q = z2;
        mq5Var.r = xs3Var;
        y2 y2Var = scd.d;
        fsf fsfVar3 = fsf.a;
        if (fsfVar2 != fsfVar3) {
            fsfVar3 = fsf.b;
        }
        n1(y2Var, z, ldeVar, fsfVar3, z4);
    }
}
