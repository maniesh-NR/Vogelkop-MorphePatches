package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class ntj implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ mqh c;
    public final /* synthetic */ opi d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ ntj(float f, mqh mqhVar, opi opiVar, Function1 function1, byte b) {
        this.a = b;
        this.b = f;
        this.c = mqhVar;
        this.d = opiVar;
        this.e = function1;
    }

    public final Object invoke(Object obj) {
        float fA;
        byte b = this.a;
        itj itjVar = this.e;
        opi opiVar = this.d;
        mqh mqhVar = this.c;
        float f = this.b;
        switch (b) {
            case 0:
                itj itjVar2 = itjVar;
                ve1 ve1Var = (ve1) obj;
                float fAbs = Math.abs(((Number) ve1Var.e.getValue()).floatValue());
                float fAbs2 = Math.abs(f);
                t0g t0gVar = ve1Var.e;
                if (fAbs >= fAbs2) {
                    float fM = xvg.m(((Number) t0gVar.getValue()).floatValue(), f);
                    xvg.i(ve1Var, opiVar, itjVar2, fM - mqhVar.a);
                    ve1Var.a();
                    mqhVar.a = fM;
                } else {
                    xvg.i(ve1Var, opiVar, itjVar2, ((Number) t0gVar.getValue()).floatValue() - mqhVar.a);
                    mqhVar.a = ((Number) t0gVar.getValue()).floatValue();
                }
                break;
            default:
                ve1 ve1Var2 = (ve1) obj;
                float fM2 = xvg.m(((Number) ve1Var2.e.getValue()).floatValue(), f);
                float f2 = fM2 - mqhVar.a;
                try {
                    fA = opiVar.a(f2);
                } catch (CancellationException unused) {
                    ve1Var2.a();
                    fA = 0.0f;
                }
                itjVar.invoke(Float.valueOf(fA));
                if (Math.abs(f2 - fA) > 0.5f || fM2 != ((Number) ve1Var2.e.getValue()).floatValue()) {
                    ve1Var2.a();
                }
                mqhVar.a += fA;
                break;
        }
        return Unit.a;
    }
}
