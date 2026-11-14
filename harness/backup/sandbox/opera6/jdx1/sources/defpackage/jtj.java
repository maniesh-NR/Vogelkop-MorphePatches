package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class jtj extends kuk implements Function2 {
    public mqh t;
    public byte u;
    public final /* synthetic */ mtj v;
    public final /* synthetic */ float w;
    public final /* synthetic */ Function1 x;
    public final /* synthetic */ opi y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtj(mtj mtjVar, float f, Function1 function1, opi opiVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = mtjVar;
        this.w = f;
        this.x = function1;
        this.y = opiVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new jtj(this.v, this.w, this.x, this.y, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        mqh mqhVar;
        Object objD;
        mtj mtjVar = this.v;
        rtj rtjVar = mtjVar.a;
        px5 px5Var = px5.a;
        byte b = this.u;
        Function1 function1 = this.x;
        if (b == 0) {
            ybh.y(obj);
            f82 f82Var = (f82) mtjVar.b.a.a;
            float f = this.w;
            float fB = rtjVar.b(f, (Math.signum(f) * ((float) (Math.exp(1.7362676463664735d * f82Var.b(f)) * f82Var.a * f82Var.b))) + 0.0f);
            if (Float.isNaN(fB)) {
                d8b.c("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            mqhVar = new mqh();
            float fSignum = Math.signum(f) * Math.abs(fB);
            mqhVar.a = fSignum;
            function1.invoke(new Float(fSignum));
            float f2 = mqhVar.a;
            itj itjVar = new itj(mqhVar, function1, (byte) 0);
            this.t = mqhVar;
            this.u = (byte) 1;
            objD = mtjVar.d(this.y, f2, this.w, itjVar, this);
            if (objD != px5Var) {
            }
        }
        if (b != 1) {
            if (b == 2) {
                ybh.y(obj);
                return obj;
            }
            qp2.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mqh mqhVar2 = this.t;
        ybh.y(obj);
        mqhVar = mqhVar2;
        objD = obj;
        xe1 xe1Var = (xe1) objD;
        float fA = rtjVar.a(((Number) xe1Var.b()).floatValue());
        if (Float.isNaN(fA)) {
            d8b.c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        mqhVar.a = fA;
        xe1 xe1VarU = cs5.u(xe1Var, 0.0f, 0.0f, 30);
        a2k a2kVar = mtjVar.c;
        itj itjVar2 = new itj(mqhVar, function1, (byte) 1);
        this.t = null;
        this.u = (byte) 2;
        Object objJ = xvg.j(this.y, fA, fA, xe1VarU, a2kVar, itjVar2, this);
        return objJ == px5Var ? px5Var : objJ;
    }
}
