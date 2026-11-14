package ads_mobile_sdk;

import defpackage.gyg;
import defpackage.ia6;
import defpackage.jbp;
import defpackage.tso;
import defpackage.w7d;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class n3 implements jbp {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public n3(ek ekVar, av2 av2Var, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2) {
        this.a = ekVar;
        this.b = av2Var;
        this.c = atomicBoolean;
        this.d = atomicBoolean2;
    }

    public n3(ia6 ia6Var) {
        this.b = this;
        this.a = ia6Var;
        nj0 nj0Var = new nj0(w7d.j);
        ob1 ob1Var = (ob1) ia6Var.b;
        ob1 ob1Var2 = (ob1) ia6Var.d;
        tso tsoVar = (tso) ia6Var.x;
        tso tsoVar2 = (tso) ia6Var.z;
        tso tsoVar3 = (tso) ia6Var.o;
        ob1 ob1Var3 = (ob1) ia6Var.j;
        nj0 nj0Var2 = new nj0(new dm0(ob1Var, ob1Var2, tsoVar, nj0Var, tsoVar2, tsoVar3, ob1Var3));
        this.c = nj0Var2;
        this.d = new nj0(new dm0(ob1Var2, nj0Var2, tsoVar, (tso) ia6Var.w, new nj0(gyg.j), new n90(this), ob1Var3));
    }

    @Override // defpackage.jbp
    public final Object b(mt5 mt5Var) {
        av2 av2Var = (av2) this.b;
        ek ekVar = (ek) this.a;
        if (((AtomicBoolean) this.c).getAndSet(false)) {
            ekVar.getClass();
            AtomicInteger atomicInteger = (AtomicInteger) ekVar.d.get(av2Var);
            if (atomicInteger != null) {
                atomicInteger.decrementAndGet();
            }
        }
        if (((AtomicBoolean) this.d).getAndSet(false)) {
            ekVar.getClass();
            AtomicInteger atomicInteger2 = (AtomicInteger) ekVar.e.get(av2Var);
            if (atomicInteger2 != null) {
                atomicInteger2.decrementAndGet();
            }
        }
        return Unit.a;
    }
}
