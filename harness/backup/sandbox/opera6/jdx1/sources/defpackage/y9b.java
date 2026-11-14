package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class y9b implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;

    public /* synthetic */ y9b(int i, ifg ifgVar, int i2) {
        this.a = (byte) 1;
        this.b = i;
        this.c = ifgVar;
        this.d = i2;
    }

    public /* synthetic */ y9b(Object obj, int i, int i2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = i2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        int i = this.d;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                p1d.f((p1d) obj, (ifg) obj2, i2, i);
                break;
            case 1:
                p1d.f((p1d) obj, (ifg) obj2, zed.b((i2 - r10.a) / 2.0f), zed.b((i - r10.b) / 2.0f));
                break;
            case 2:
                p1d.f((p1d) obj, (ifg) obj2, i2, i);
                break;
            default:
                d91 d91Var = (d91) obj2;
                tzf tzfVar = (tzf) obj;
                y81 y81Var = tzfVar.a;
                int iB = tzfVar.b(i2);
                int iB2 = tzfVar.b(i);
                CharSequence charSequence = y81Var.e;
                if (iB < 0 || iB > iB2 || iB2 > charSequence.length()) {
                    int length = charSequence.length();
                    StringBuilder sbO = sko.o(iB, iB2, "start(", ") or end(", ") is out of range [0..");
                    sbO.append(length);
                    sbO.append("], or start > end!");
                    b8b.a(sbO.toString());
                }
                Path path = new Path();
                ljl ljlVar = y81Var.d;
                ljlVar.f.getSelectionPath(iB, iB2, path);
                int i3 = ljlVar.h;
                if (i3 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i3);
                }
                long jFloatToRawIntBits = Float.floatToRawIntBits(tzfVar.f) & 4294967295L;
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                d91Var.a.addPath(path, 0.0f, 0.0f);
                break;
        }
        return Unit.a;
    }
}
