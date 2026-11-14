package defpackage;

import android.text.format.DateUtils;
import com.leanplum.internal.Clock;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class tap extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tap(int i, mt5 mt5Var, byte b) {
        super(i, mt5Var);
        this.t = b;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                tap tapVar = new tap(2, mt5Var, (byte) 0);
                tapVar.u = obj;
                return tapVar;
            default:
                tap tapVar2 = new tap(2, mt5Var, (byte) 1);
                tapVar2.u = obj;
                return tapVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((Throwable) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                UUID.randomUUID();
                try {
                    p0i p0iVar = t0i.b;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    DateUtils.getRelativeTimeSpanString(jCurrentTimeMillis - Clock.DAY_MILLIS, jCurrentTimeMillis, 60000L, 262144);
                } catch (Throwable unused) {
                    p0i p0iVar2 = t0i.b;
                }
                return Unit.a;
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                return Boolean.valueOf(((Throwable) this.u) instanceof o2j);
        }
    }
}
