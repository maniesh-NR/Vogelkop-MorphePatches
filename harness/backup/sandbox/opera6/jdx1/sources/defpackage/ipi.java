package defpackage;

import android.os.SystemClock;
import java.lang.reflect.InvocationTargetException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ipi extends kuk implements Function2 {
    public final /* synthetic */ byte t = 0;
    public final /* synthetic */ long u;
    public /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipi(long j, mt5 mt5Var) {
        super(2, mt5Var);
        this.u = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipi(z8p z8pVar, long j, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = z8pVar;
        this.u = j;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                ipi ipiVar = new ipi(this.u, mt5Var);
                ipiVar.v = obj;
                return ipiVar;
            default:
                return new ipi((z8p) this.v, this.u, mt5Var);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((qpi) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                qpi qpiVar = (qpi) this.v;
                long j = this.u;
                spi spiVar = qpiVar.a;
                spiVar.d(spiVar.k, j, 1);
                break;
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                zyk zykVar = aap.a;
                aap.c = (z8p) this.v;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j2 = ((z8p) this.v).C;
                long j3 = this.u;
                if (j3 > 0 && j3 < jCurrentTimeMillis && j3 + j2 > jCurrentTimeMillis) {
                    aap.f = ((this.u + j2) - jCurrentTimeMillis) + SystemClock.elapsedRealtime();
                }
                break;
        }
        return Unit.a;
    }
}
