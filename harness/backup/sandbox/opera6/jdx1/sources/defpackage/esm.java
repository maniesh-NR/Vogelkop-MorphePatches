package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class esm extends kuk implements Function1 {
    public final /* synthetic */ ism A;
    public final /* synthetic */ List B;
    public final /* synthetic */ List C;
    public final /* synthetic */ List D;
    public final /* synthetic */ jyc E;
    public final /* synthetic */ y10 F;
    public final /* synthetic */ long G;
    public Object t;
    public List u;
    public List v;
    public jyc w;
    public y10 x;
    public long y;
    public byte z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esm(ism ismVar, List list, List list2, List list3, jyc jycVar, y10 y10Var, long j, mt5 mt5Var) {
        super(1, mt5Var);
        this.A = ismVar;
        this.B = list;
        this.C = list2;
        this.D = list3;
        this.E = jycVar;
        this.F = y10Var;
        this.G = j;
    }

    public final mt5 create(mt5 mt5Var) {
        return new esm(this.A, this.B, this.C, this.D, this.E, this.F, this.G, mt5Var);
    }

    public final Object invoke(Object obj) {
        return create((mt5) obj).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        jyc jycVar;
        Object objK;
        y10 y10Var;
        List list;
        List list2;
        List list3;
        long j;
        AutoCloseable autoCloseable;
        Object objK2;
        AutoCloseable autoCloseable2;
        Throwable th;
        px5 px5Var = px5.a;
        byte b = this.z;
        try {
            try {
                if (b == 0) {
                    ybh.y(obj);
                    ism ismVar = this.A;
                    List list4 = this.B;
                    List list5 = this.C;
                    List list6 = this.D;
                    jycVar = this.E;
                    y10 y10Var2 = this.F;
                    long j2 = this.G;
                    nd4 nd4VarA = ismVar.c.a();
                    this.t = list4;
                    this.u = list5;
                    this.v = list6;
                    this.w = jycVar;
                    this.x = y10Var2;
                    this.y = j2;
                    this.z = (byte) 1;
                    objK = nd4VarA.k(this);
                    if (objK != px5Var) {
                        y10Var = y10Var2;
                        list = list6;
                        list2 = list5;
                        list3 = list4;
                        j = j2;
                    }
                    return px5Var;
                }
                if (b != 1) {
                    if (b != 2) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    autoCloseable2 = (AutoCloseable) this.t;
                    try {
                        ybh.y(obj);
                        objK2 = obj;
                        h07 h07Var = (h07) objK2;
                        fr3.t(autoCloseable2, null);
                        return h07Var;
                    } catch (Throwable th2) {
                        th = th2;
                        autoCloseable = autoCloseable2;
                        th = th;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            fr3.t(autoCloseable, th);
                            throw th3;
                        }
                    }
                }
                long j3 = this.y;
                y10 y10Var3 = this.x;
                jycVar = this.w;
                List list7 = this.v;
                List list8 = this.u;
                List list9 = (List) this.t;
                ybh.y(obj);
                list2 = list8;
                list3 = list9;
                j = j3;
                list = list7;
                y10Var = y10Var3;
                objK = obj;
                this.t = autoCloseable;
                this.u = null;
                this.v = null;
                this.w = null;
                this.x = null;
                this.z = (byte) 2;
                objK2 = qd4.k((qd4) autoCloseable, list3, list2, list, jycVar, y10Var, null, j, j, this, 7175);
                if (objK2 != px5Var) {
                    autoCloseable2 = autoCloseable;
                    h07 h07Var2 = (h07) objK2;
                    fr3.t(autoCloseable2, null);
                    return h07Var2;
                }
                return px5Var;
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
            autoCloseable = (AutoCloseable) objK;
        } catch (CancellationException unused) {
            return ism.l;
        }
    }
}
