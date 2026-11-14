package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class qxf extends kuk implements Function2 {
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ sxf v;
    public final /* synthetic */ int w;
    public final /* synthetic */ float x;
    public final /* synthetic */ a2k y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxf(sxf sxfVar, int i, float f, a2k a2kVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = sxfVar;
        this.w = i;
        this.x = f;
        this.y = a2kVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        qxf qxfVar = new qxf(this.v, this.w, this.x, this.y, mt5Var);
        qxfVar.u = obj;
        return qxfVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((toi) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        px5 px5Var = px5.a;
        boolean z = this.t;
        byte b = 1;
        if (!z) {
            ybh.y(obj);
            toi toiVar = (toi) this.u;
            sxf sxfVar = this.v;
            o6c o6cVar = new o6c(toiVar, sxfVar, b);
            this.t = true;
            txf txfVar = uxf.a;
            int i2 = this.w;
            sxfVar.q.i(sxfVar.j(new Integer(i2).intValue()));
            boolean z2 = i2 > sxfVar.e;
            int iE = o6cVar.e();
            int i3 = sxfVar.e;
            int i4 = (iE - i3) + 1;
            if (!z2 ? i2 < i3 : i2 > o6cVar.e()) {
                if (Math.abs(i2 - sxfVar.e) >= 3) {
                    if (z2) {
                        i = i2 - i4;
                        int i5 = sxfVar.e;
                        if (i < i5) {
                            i = i5;
                        }
                    } else {
                        int i6 = i4 + i2;
                        i = sxfVar.e;
                        if (i6 <= i) {
                            i = i6;
                        }
                    }
                    o6cVar.f(i);
                }
            }
            Object objG = mfh.g(o6cVar.b(i2) + this.x, this.y, new hda(new mqh(), o6cVar, (byte) 22), this, 4);
            if (objG != px5Var) {
                objG = Unit.a;
            }
            if (objG == px5Var) {
                return px5Var;
            }
        } else {
            if (!z) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ybh.y(obj);
        }
        return Unit.a;
    }
}
