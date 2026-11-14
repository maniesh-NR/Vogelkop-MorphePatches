package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class wtd implements Function1 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wtd(e6e e6eVar, ek6 ek6Var, boolean z, String str, e6g e6gVar) {
        this.c = e6eVar;
        this.d = ek6Var;
        this.b = z;
        this.e = str;
        this.f = e6gVar;
    }

    public /* synthetic */ wtd(Function0 function0, boolean z, yhe yheVar, g4i g4iVar, Function0 function02) {
        this.c = function0;
        this.b = z;
        this.d = yheVar;
        this.e = g4iVar;
        this.f = function02;
    }

    public /* synthetic */ wtd(boolean z, cfe cfeVar, afe afeVar, w2m w2mVar, w2m w2mVar2) {
        this.b = z;
        this.c = cfeVar;
        this.d = afeVar;
        this.e = w2mVar;
        this.f = w2mVar2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                t0g t0gVar = ((cfe) obj5).c;
                afe afeVar = (afe) obj4;
                w2m w2mVar = (w2m) obj3;
                w2m w2mVar2 = (w2m) obj2;
                m1i m1iVar = (m1i) obj;
                float fFloatValue = 0.8f;
                float fFloatValue2 = 1.0f;
                m1iVar.g(!z ? ((Number) w2mVar.h.getValue()).floatValue() : ((Boolean) t0gVar.getValue()).booleanValue() ? 1.0f : 0.8f);
                if (!z) {
                    fFloatValue = ((Number) w2mVar.h.getValue()).floatValue();
                } else if (((Boolean) t0gVar.getValue()).booleanValue()) {
                    fFloatValue = 1.0f;
                }
                m1iVar.h(fFloatValue);
                if (!z) {
                    fFloatValue2 = ((Number) w2mVar2.h.getValue()).floatValue();
                } else if (!((Boolean) t0gVar.getValue()).booleanValue()) {
                    fFloatValue2 = 0.0f;
                }
                m1iVar.c(fFloatValue2);
                m1iVar.r(((a2m) afeVar.getValue()).a);
                return Unit.a;
            case 1:
                Function0 function0 = (Function0) obj5;
                yhe yheVar = (yhe) obj4;
                g4i g4iVar = (g4i) obj3;
                Function0 function02 = (Function0) obj2;
                boolean z2 = ((m4i) obj).a;
                if (!z2) {
                    function0.invoke();
                } else if (z2) {
                    if (z) {
                        ((gjm) yheVar.b).b(g4iVar);
                    }
                    function02.invoke();
                }
                return Unit.a;
            default:
                ek6 ek6Var = (ek6) obj4;
                String str = (String) obj3;
                e6g e6gVar = (e6g) obj2;
                ae5 ae5Var = (ae5) obj;
                Object obj6 = ((e6e) obj5).a.a;
                return (j7i) ((ini) (obj6 == null ? null : (mxb) obj6).c.b).a(uqh.a(j7i.class), (rhk) null, new d6e(ae5Var, ek6Var, this.b, str, e6gVar));
        }
    }
}
