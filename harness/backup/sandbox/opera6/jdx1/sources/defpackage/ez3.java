package defpackage;

import android.graphics.Rect;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ez3 extends haj {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ez3(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    @Override // defpackage.haj
    public final Shader b(long j) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return (Shader) obj;
            default:
                Rect rectW = zi4.w(zed.b(Float.intBitsToFloat((int) (j >> 32))), zed.b(Float.intBitsToFloat((int) (j & 4294967295L))), 135);
                float f = rectW.left;
                float f2 = rectW.top;
                long jFloatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
                float f3 = rectW.right;
                float f4 = rectW.bottom;
                long jFloatToRawIntBits2 = (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
                List list = (List) obj;
                f03.o0((ArrayList) null, list);
                return i2a.a.a(jFloatToRawIntBits, jFloatToRawIntBits2, f03.m0(list), null, 0);
        }
    }
}
