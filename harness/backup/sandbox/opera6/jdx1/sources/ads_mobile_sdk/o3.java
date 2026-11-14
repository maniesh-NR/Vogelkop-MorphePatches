package ads_mobile_sdk;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class o3 implements rko {
    public final ek a;
    public final av2 b;
    public final se2 c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);

    public o3(ek ekVar, av2 av2Var, se2 se2Var) {
        this.a = ekVar;
        this.b = av2Var;
        this.c = se2Var;
    }

    public final Object a(mt5 mt5Var) {
        boolean andSet = this.d.getAndSet(false);
        av2 av2Var = this.b;
        ek ekVar = this.a;
        if (andSet) {
            ekVar.getClass();
            AtomicInteger atomicInteger = (AtomicInteger) ekVar.d.get(av2Var);
            if (atomicInteger != null) {
                atomicInteger.decrementAndGet();
            }
        }
        if (this.e.getAndSet(false)) {
            ekVar.getClass();
            AtomicInteger atomicInteger2 = (AtomicInteger) ekVar.e.get(av2Var);
            if (atomicInteger2 != null) {
                atomicInteger2.decrementAndGet();
            }
        }
        return Unit.a;
    }

    public final Object g(mt5 mt5Var) {
        av2 av2Var = this.b;
        switch (av2Var.ordinal()) {
            case 0:
            case 2:
            case 3:
            case 5:
                break;
            case 1:
            case 4:
            case 6:
            case 7:
            case 8:
                if (this.e.getAndSet(false)) {
                    ek ekVar = this.a;
                    ekVar.getClass();
                    AtomicInteger atomicInteger = (AtomicInteger) ekVar.e.get(av2Var);
                    if (atomicInteger != null) {
                        atomicInteger.decrementAndGet();
                        break;
                    }
                }
                break;
            default:
                h9o.p();
                return null;
        }
        return Unit.a;
    }

    public final Object i(mt5 mt5Var) {
        Object objA;
        AtomicBoolean atomicBoolean = this.d;
        if (atomicBoolean.getAndSet(true)) {
            objA = Unit.a;
        } else {
            ek ekVar = this.a;
            ConcurrentHashMap concurrentHashMap = ekVar.d;
            mn mnVar = new mn((byte) 27);
            av2 av2Var = this.b;
            ((AtomicInteger) concurrentHashMap.computeIfAbsent(av2Var, mnVar)).incrementAndGet();
            n3 n3Var = new n3(ekVar, av2Var, atomicBoolean, this.e);
            se2 se2Var = this.c;
            se2Var.getClass();
            objA = se2.a(se2Var, this, n3Var, (nt5) mt5Var);
            if (objA != px5.a) {
                objA = Unit.a;
            }
        }
        return objA == px5.a ? objA : Unit.a;
    }

    public final Unit o(mt5 mt5Var) {
        av2 av2Var = this.b;
        switch (av2Var.ordinal()) {
            case 0:
            case 2:
            case 3:
            case 5:
                break;
            case 1:
            case 4:
            case 6:
            case 7:
            case 8:
                if (!this.e.getAndSet(true)) {
                    ((AtomicInteger) this.a.e.computeIfAbsent(av2Var, new mn((byte) 28))).incrementAndGet();
                    break;
                }
                break;
            default:
                h9o.p();
                return null;
        }
        return Unit.a;
    }

    public final Object q(mt5 mt5Var) {
        av2 av2Var = this.b;
        switch (av2Var.ordinal()) {
            case 0:
            case 2:
            case 3:
            case 5:
                if (!this.e.getAndSet(true)) {
                    ((AtomicInteger) this.a.e.computeIfAbsent(av2Var, new mn((byte) 28))).incrementAndGet();
                    break;
                }
                break;
            case 1:
            case 4:
            case 6:
            case 7:
            case 8:
                break;
            default:
                h9o.p();
                return null;
        }
        return Unit.a;
    }
}
