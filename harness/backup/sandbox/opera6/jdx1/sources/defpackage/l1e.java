package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class l1e {
    public static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static float d(float f, float f2, float f3) {
        return v0g.g(f2, f, f3, f);
    }

    public static void e(dvb dvbVar, int i, ArrayList arrayList, dvb dvbVar2, fvb fvbVar) {
        if (dvbVar.a(i, fvbVar.getName())) {
            String name = fvbVar.getName();
            dvb dvbVar3 = new dvb(dvbVar2);
            dvbVar3.a.add(name);
            dvb dvbVar4 = new dvb(dvbVar3);
            dvbVar4.b = fvbVar;
            arrayList.add(dvbVar4);
        }
    }
}
