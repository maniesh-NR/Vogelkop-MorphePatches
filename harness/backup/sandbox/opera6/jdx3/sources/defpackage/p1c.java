package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import com.opera.android.OperaApplication;
import com.opera.android.annotations.WeakOwner;
import com.opera.android.settings.SettingsManager;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class p1c extends t7j {
    public final Context j;
    public final umi k;
    public final x5f l;
    public final SettingsManager m;
    public final bqe n;
    public final hte o;

    @NonNull
    @WeakOwner
    private final q1c p;
    public final AtomicReference q;
    public boolean r;

    public p1c(Context context, umi umiVar, x5f x5fVar, SettingsManager settingsManager, bqe bqeVar, hte hteVar, tm5 tm5Var) {
        super(tm5Var);
        this.q = new AtomicReference();
        Context applicationContext = context.getApplicationContext();
        this.j = applicationContext;
        this.k = umiVar;
        this.l = x5fVar;
        this.m = settingsManager;
        this.n = bqeVar;
        this.o = hteVar;
        final vr9 vr9Var = new vr9(new dnb(this, (byte) 5), 3);
        avj avjVar = cak.d;
        avj.g(4, vr9Var);
        ac8.c(new o1c(this));
        final byte b = 0;
        bqeVar.F(new mo7(this) { // from class: m1c
            public final /* synthetic */ p1c b;

            {
                this.b = this;
            }

            @Override // defpackage.mo7
            public final void o(boolean z) {
                byte b2 = b;
                vr9 vr9Var2 = vr9Var;
                p1c p1cVar = this.b;
                switch (b2) {
                    case 0:
                        if (!z) {
                            p1cVar.f();
                            break;
                        } else {
                            vr9Var2.run();
                            break;
                        }
                    default:
                        if (!z) {
                            p1cVar.f();
                            break;
                        } else {
                            vr9Var2.run();
                            break;
                        }
                }
            }
        });
        final byte b2 = 1;
        hteVar.F(new mo7(this) { // from class: m1c
            public final /* synthetic */ p1c b;

            {
                this.b = this;
            }

            @Override // defpackage.mo7
            public final void o(boolean z) {
                byte b22 = b2;
                vr9 vr9Var2 = vr9Var;
                p1c p1cVar = this.b;
                switch (b22) {
                    case 0:
                        if (!z) {
                            p1cVar.f();
                            break;
                        } else {
                            vr9Var2.run();
                            break;
                        }
                    default:
                        if (!z) {
                            p1cVar.f();
                            break;
                        } else {
                            vr9Var2.run();
                            break;
                        }
                }
            }
        });
        q1c q1cVar = new q1c(applicationContext, this);
        if (q1cVar.e() != null || q1cVar.d() != null) {
            b(q1cVar);
        }
        this.p = q1cVar;
    }

    public static n1c e(bqe bqeVar, hte hteVar) {
        ite iteVar = (ite) hteVar.i();
        cqe cqeVar = (cqe) bqeVar.i();
        return new n1c(new LinkedHashSet(iteVar.a), cqeVar.a, iteVar.b || cqeVar.b);
    }

    @Override // defpackage.t7j
    public final k7j a(isd isdVar) {
        n5o ne5Var = new ne5();
        ((ne5) ne5Var).a = this.l;
        ((ne5) ne5Var).b = this.m;
        ((ne5) ne5Var).c = this.n;
        ((ne5) ne5Var).d = this.o;
        ((ne5) ne5Var).e = new n0c(this.j);
        ((ne5) ne5Var).f = this.q;
        oml omlVarC = this.k.e(ne5Var).c(new yzb((Object) isdVar, (byte) 1));
        ((ne5) ne5Var).g = omlVarC;
        omlVarC.a(null, null);
        return ne5Var;
    }

    public final void f() {
        if (this.r) {
            n1c n1cVarE = e(this.n, this.o);
            n1c n1cVar = (n1c) this.q.getAndSet(n1cVarE);
            if (n1cVar == null || !n1cVar.equals(n1cVarE)) {
                c();
            }
        }
    }

    public final void g(l0c l0cVar) {
        String[] strArr = OperaApplication.K;
        SettingsManager settingsManagerJ = ((OperaApplication) this.j.getApplicationContext()).J();
        settingsManagerJ.getClass();
        settingsManagerJ.Y("recommendations_language_region", l0cVar.a + ':' + l0cVar.b);
    }
}
