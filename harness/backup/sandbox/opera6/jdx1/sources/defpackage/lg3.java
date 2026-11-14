package defpackage;

import android.content.Context;
import android.graphics.Point;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class lg3 extends okj {
    public final Context n;
    public final int o;

    public lg3(Context context) {
        super(new qj6[1], new kg3[1]);
        this.n = context;
        this.o = -1;
    }

    @Override // defpackage.okj
    public final rj6 c() {
        return new kg3(this);
    }

    @Override // defpackage.okj
    public final oj6 e(qj6 qj6Var, rj6 rj6Var, boolean z) throws ClassNotFoundException, NumberFormatException {
        kg3 kg3Var = (kg3) rj6Var;
        ByteBuffer byteBuffer = qj6Var.e;
        byteBuffer.getClass();
        z4o.H(byteBuffer.hasArray());
        z4o.w(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.o;
            if (iMax == -1) {
                Context context = this.n;
                if (context != null) {
                    Point pointV = tym.v(context);
                    int i = pointV.x;
                    int i2 = pointV.y;
                    oj9 oj9Var = qj6Var.c;
                    if (oj9Var != null) {
                        int i3 = oj9Var.M;
                        if (i3 != -1) {
                            i *= i3;
                        }
                        int i4 = oj9Var.N;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                    }
                    iMax = (Math.max(i, i2) << 1) - 1;
                } else {
                    iMax = 4096;
                }
            }
            kg3Var.e = m41.c(byteBuffer.remaining(), iMax, byteBuffer.array());
            kg3Var.c = qj6Var.g;
            return null;
        } catch (s1g e) {
            return new kwa("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new kwa(e2);
        }
    }
}
