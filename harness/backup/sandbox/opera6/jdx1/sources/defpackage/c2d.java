package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class c2d extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ e2d j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2d(e2d e2dVar, byte b) {
        super(0);
        this.i = b;
        this.j = e2dVar;
    }

    public final Object invoke() {
        byte b = this.i;
        e2d e2dVar = this.j;
        switch (b) {
            case 0:
                float f = 0.0f;
                if (((p2d) e2dVar.i.getValue()) != null) {
                    float fFloatValue = ((Number) e2dVar.f.getValue()).floatValue();
                    t0g t0gVar = e2dVar.e;
                    if (fFloatValue < 0.0f) {
                        if (t0gVar.getValue() != null) {
                            h9o.t();
                            return null;
                        }
                    } else {
                        if (t0gVar.getValue() != null) {
                            h9o.t();
                            return null;
                        }
                        f = 1.0f;
                    }
                }
                return Float.valueOf(f);
            case 1:
                t0g t0gVar2 = e2dVar.f;
                return Float.valueOf((((Boolean) e2dVar.d.getValue()).booleanValue() && e2dVar.b() % 2 == 0) ? -((Number) t0gVar2.getValue()).floatValue() : ((Number) t0gVar2.getValue()).floatValue());
            default:
                return Boolean.valueOf(e2dVar.b() == ((Number) e2dVar.c.getValue()).intValue() && ((Number) e2dVar.k.getValue()).floatValue() == ((Number) e2dVar.m.getValue()).floatValue());
        }
    }
}
