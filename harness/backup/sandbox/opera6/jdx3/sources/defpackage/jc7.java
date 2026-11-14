package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class jc7 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;

    public /* synthetic */ jc7(float f, long j, byte b) {
        this.a = b;
        this.b = f;
        this.c = j;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        float f = this.b;
        switch (b) {
            case 0:
                mk7 mk7Var = (mk7) obj;
                float fO0 = mk7Var.o0(f);
                long jFloatToRawIntBits = Float.floatToRawIntBits(mk7Var.o0(f) / 2.0f) << 32;
                float fO02 = mk7Var.o0(f) / 2.0f;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (mk7Var.e() & 4294967295L));
                mk7.p0(mk7Var, this.c, jFloatToRawIntBits, (Float.floatToRawIntBits(fO02) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), fO0, 496);
                break;
            default:
                mk7 mk7Var2 = (mk7) obj;
                float fO03 = mk7Var2.o0(f);
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(mk7Var2.o0(f) / 2.0f) & 4294967295L;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (mk7Var2.e() >> 32));
                float fO04 = mk7Var2.o0(f) / 2.0f;
                mk7.p0(mk7Var2, this.c, jFloatToRawIntBits2, (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fO04) & 4294967295L), fO03, 496);
                break;
        }
        return Unit.a;
    }
}
