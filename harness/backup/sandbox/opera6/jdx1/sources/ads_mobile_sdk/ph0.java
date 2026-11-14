package ads_mobile_sdk;

import android.os.Bundle;
import defpackage.acf;
import defpackage.bpd;
import defpackage.d2i;
import defpackage.dvj;
import defpackage.eno;
import defpackage.fsg;
import defpackage.im;
import defpackage.sgb;
import defpackage.udj;
import defpackage.ulp;
import defpackage.xp9;
import defpackage.zhl;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ph0 implements rko, fkp, eip {
    public final nx5 a;
    public final kh3 b;
    public final ux2 c;
    public im d;
    public bpd g;
    public final ArrayBlockingQueue q;
    public final AtomicBoolean r = new AtomicBoolean(true);

    public ph0(nx5 nx5Var, qr0 qr0Var, kh3 kh3Var, ux2 ux2Var) {
        this.a = nx5Var;
        this.b = kh3Var;
        this.c = ux2Var;
        this.q = new ArrayBlockingQueue(((Number) qr0Var.a("gads:app_event_queue_size", (Object) 20, (Function1) fo.a$11)).intValue());
    }

    public final im a() {
        im imVar;
        synchronized (this) {
            imVar = this.d;
        }
        return imVar;
    }

    public final Object a(Bundle bundle, mt5 mt5Var) {
        Object objQ = sgb.q(new ch0(this, null, (byte) 4), mt5Var);
        return objQ == px5.a ? objQ : Unit.a;
    }

    public final Object a(xp9 xp9Var, mt5 mt5Var) {
        dvj dvjVar = ax0.f;
        defpackage.na2.B(sgb.b(kotlin.coroutines.e.a(dze.b, mt5Var.getContext()).minusKey(rh3.b).minusKey(psp.b).minusKey(ulp.h)), null, null, new udj((mt5) null, (Object) this, (Object) xp9Var, (byte) 16), 3);
        return Unit.a;
    }

    public final Unit a(d2i d2iVar, mt5 mt5Var) {
        dvj dvjVar = ax0.f;
        defpackage.na2.B(sgb.b(kotlin.coroutines.e.a(dze.b, mt5Var.getContext()).minusKey(rh3.b).minusKey(psp.b).minusKey(ulp.h)), null, null, new eno((mt5) null, this, d2iVar), 3);
        return Unit.a;
    }

    public final Unit a(String str, String str2, mt5 mt5Var) {
        mt5 mt5Var2 = null;
        if (!this.r.get()) {
            dvj dvjVar = ax0.f;
            defpackage.na2.B(sgb.b(kotlin.coroutines.e.a(dze.b, mt5Var.getContext()).minusKey(rh3.b).minusKey(psp.b).minusKey(ulp.h)), null, null, new bh0(mt5Var2, this, str, str2, (byte) 1), 3);
            return Unit.a;
        }
        if (!this.q.offer(new Pair(str, str2))) {
            xu0.b("The queue for app events is full, dropping the new event.", null);
            ux2 ux2Var = this.c;
            fw0 fw0Var = fw0.CUI_NAME_UNKNOWN;
            l08 l08Var = l08.a;
            kh3 kh3Var = this.b;
            if (hh3.b().a == null) {
                wk2 wk2VarA = ux2.a(ux2Var, fw0Var, l08Var, kh3Var);
                try {
                    xh3.a("App events queue overflow. name: " + str + ", data: " + str2, null, 6);
                    wk2VarA.close();
                } catch (Throwable th) {
                    try {
                        wk2VarA.b(th);
                        if (th instanceof iyo) {
                            throw th;
                        }
                        wk2VarA.a(th);
                        if (th instanceof kql) {
                            throw new uw0((kql) th);
                        }
                        if (th instanceof CancellationException) {
                            throw new ou0(th);
                        }
                        if (th instanceof mv0) {
                            throw th;
                        }
                        throw new tu0(th);
                    } finally {
                    }
                }
            } else {
                rg3 rg3VarA = hh3.a(fw0Var, l08Var, true);
                try {
                    xh3.a("App events queue overflow. name: " + str + ", data: " + str2, null, 6);
                    rg3VarA.close();
                } catch (Throwable th2) {
                    try {
                        rg3VarA.b(th2);
                        if (th2 instanceof iyo) {
                            throw th2;
                        }
                        rg3VarA.a(th2);
                        if (th2 instanceof kql) {
                            throw new uw0((kql) th2);
                        }
                        if (th2 instanceof CancellationException) {
                            throw new ou0(th2);
                        }
                        if (th2 instanceof mv0) {
                            throw th2;
                        }
                        throw new tu0(th2);
                    } finally {
                    }
                }
            }
        }
        return Unit.a;
    }

    public final Unit a(String str, mt5 mt5Var) {
        dvj dvjVar = ax0.f;
        defpackage.na2.B(sgb.b(kotlin.coroutines.e.a(dze.b, mt5Var.getContext()).minusKey(rh3.b).minusKey(psp.b).minusKey(ulp.h)), null, null, new udj((mt5) null, (Object) this, (Object) str, (byte) 29), 3);
        return Unit.a;
    }

    public final Unit a(defpackage.qq qqVar, mt5 mt5Var) {
        dvj dvjVar = ax0.f;
        defpackage.na2.B(sgb.b(kotlin.coroutines.e.a(dze.b, mt5Var.getContext()).minusKey(rh3.b).minusKey(psp.b).minusKey(ulp.h)), null, null, new udj((mt5) null, (Object) this, (Object) qqVar, (byte) 23), 3);
        return Unit.a;
    }

    public final void a(acf acfVar) {
        synchronized (this) {
        }
        mt5 mt5Var = null;
        defpackage.na2.B(this.a, h.a, null, new fsg(new zhl((byte) 22, mt5Var, (Object) this), mt5Var, (byte) 3), 2);
    }

    public final void a(bpd bpdVar) {
        synchronized (this) {
            this.g = bpdVar;
            a((im) bpdVar);
            a((acf) bpdVar);
        }
    }

    public final void a(im imVar) {
        synchronized (this) {
            this.d = imVar;
        }
    }

    public final Unit e(mt5 mt5Var) {
        dvj dvjVar = ax0.f;
        defpackage.na2.B(sgb.b(kotlin.coroutines.e.a(dze.b, mt5Var.getContext()).minusKey(rh3.b).minusKey(psp.b).minusKey(ulp.h)), null, null, new ch0(this, null, (byte) 6), 3);
        return Unit.a;
    }

    public final Object g(mt5 mt5Var) {
        dvj dvjVar = ax0.f;
        defpackage.na2.B(sgb.b(kotlin.coroutines.e.a(dze.b, mt5Var.getContext()).minusKey(rh3.b).minusKey(psp.b).minusKey(ulp.h)), null, null, new ch0(this, null, (byte) 1), 3);
        return Unit.a;
    }

    public final Object n(mt5 mt5Var) {
        dvj dvjVar = ax0.f;
        defpackage.na2.B(sgb.b(kotlin.coroutines.e.a(dze.b, mt5Var.getContext()).minusKey(rh3.b).minusKey(psp.b).minusKey(ulp.h)), null, null, new ch0(this, null, (byte) 0), 3);
        return Unit.a;
    }

    public final Unit o(mt5 mt5Var) {
        dvj dvjVar = ax0.f;
        defpackage.na2.B(sgb.b(kotlin.coroutines.e.a(dze.b, mt5Var.getContext()).minusKey(rh3.b).minusKey(psp.b).minusKey(ulp.h)), null, null, new ch0(this, null, (byte) 5), 3);
        return Unit.a;
    }

    public final Object q(mt5 mt5Var) {
        dvj dvjVar = ax0.f;
        defpackage.na2.B(sgb.b(kotlin.coroutines.e.a(dze.b, mt5Var.getContext()).minusKey(rh3.b).minusKey(psp.b).minusKey(ulp.h)), null, null, new ch0(this, null, (byte) 2), 3);
        return Unit.a;
    }
}
