package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class fpd extends gk9 {
    public final x5f d;
    public final tjg e;

    public fpd(ujc ujcVar, x5f x5fVar, tjg tjgVar) {
        super(ujcVar);
        this.d = x5fVar;
        this.e = tjgVar;
    }

    public final void M() {
        u0(ai0.f);
        super.M();
    }

    public final void f() {
    }

    public final void o0() {
        u0(ai0.h);
        super.o0();
    }

    public final void p0() {
        u0(ai0.g);
        super.p0();
    }

    public final void pause() {
        gig gigVar = ((gk9) this).b;
        if (gigVar.e0() || (gigVar.getPlaybackState() == 2 && gigVar.getPlayWhenReady() && gigVar.G() == 0)) {
            u0(ai0.c);
        }
        super.pause();
    }

    public final void play() {
        gig gigVar = ((gk9) this).b;
        if (!gigVar.e0() && (gigVar.getPlaybackState() != 2 || !gigVar.getPlayWhenReady() || gigVar.G() != 0)) {
            u0(ai0.b);
        }
        super.play();
    }

    public final void r() {
        u0(ai0.e);
        super.r();
    }

    public final void seekTo(int i, long j) {
        if (i == ((gk9) this).b.f0()) {
            v0(j);
        }
        super.seekTo(i, j);
    }

    public final void seekTo(long j) {
        v0(j);
        super.seekTo(j);
    }

    public final void stop() {
        u0(ai0.d);
        super.stop();
    }

    public final void u0(ai0 ai0Var) {
        qjd qjdVarG = ((gk9) this).b.g();
        if (qjdVarG != null) {
            tjg tjgVar = this.e;
            rh0 rh0VarR = zkd.R(tjgVar, qjdVarG);
            sh0 sh0Var = tjgVar.k(qjdVarG) == kg7.g ? sh0.b : sh0.c;
            x5f x5fVar = this.d;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                bi0 bi0Var = new bi0(2443, -1, 2);
                bi0Var.q(1, 1, ai0Var);
                vh0 vh0Var = (vh0) bi0Var.n(0);
                if (vh0Var == null) {
                    bi0Var.q(0, 1, zpa.A());
                    vh0Var = (vh0) bi0Var.n(0);
                }
                vh0Var.q(1, 1, rh0VarR);
                vh0Var.q(0, 1, sh0Var);
                x56 x56VarF = zpa.F();
                qd0 qd0VarB = x56VarF.B(zpaVar);
                List list = (List) qd0VarB.n(16);
                ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 16, vep.t(qd0VarB, 16, 1)) : new hf0(qd0VarB, 16, list)).add(bi0Var);
                x5fVar.U0(x56VarF);
            }
        }
    }

    public final void v0(long j) {
        long currentPosition = j - ((gk9) this).b.getCurrentPosition();
        if (Math.abs(30000 - Math.abs(currentPosition)) < 500 || Math.abs(15000 - Math.abs(currentPosition)) < 500) {
            if (currentPosition < 0) {
                u0(ai0.g);
            } else {
                u0(ai0.h);
            }
        }
    }
}
