package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class pga {
    public final Function2 a;
    public final /* synthetic */ byte b;

    public pga(Function2 function2, byte b) {
        this.b = b;
        this.a = function2;
    }

    public final float a(float f, b2c b2cVar, b2c b2cVar2) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat((int) (b2cVar2.v(b2cVar, (Float.floatToRawIntBits(((int) (b2cVar.h() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)) & 4294967295L));
            default:
                float fH = ((int) (b2cVar.h() & 4294967295L)) / 2.0f;
                return Float.intBitsToFloat((int) (b2cVar2.v(b2cVar, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(fH) & 4294967295L)) >> 32));
        }
    }
}
