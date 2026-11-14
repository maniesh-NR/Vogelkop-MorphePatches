package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class waj implements j0n {
    public static final waj a = new waj();
    public static final z8b b = z8b.G("c", "v", "i", "o");

    @Override // defpackage.j0n
    public final Object n(esb esbVar, float f) {
        if (esbVar.t() == 1) {
            esbVar.h();
        }
        esbVar.k();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zP = false;
        while (esbVar.o()) {
            int iE = esbVar.E(b);
            if (iE == 0) {
                zP = esbVar.p();
            } else if (iE == 1) {
                arrayListC = xsb.c(esbVar, f);
            } else if (iE == 2) {
                arrayListC2 = xsb.c(esbVar, f);
            } else if (iE != 3) {
                esbVar.G();
                esbVar.H();
            } else {
                arrayListC3 = xsb.c(esbVar, f);
            }
        }
        esbVar.m();
        if (esbVar.t() == 2) {
            esbVar.l();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            qp2.o("Shape data was missing information.");
            return null;
        }
        if (arrayListC.isEmpty()) {
            return new vaj(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListC.get(i);
            int i2 = i - 1;
            arrayList.add(new v36(l1e.a((PointF) arrayListC.get(i2), (PointF) arrayListC3.get(i2)), l1e.a(pointF2, (PointF) arrayListC2.get(i)), pointF2));
        }
        if (zP) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i3 = size - 1;
            arrayList.add(new v36(l1e.a((PointF) arrayListC.get(i3), (PointF) arrayListC3.get(i3)), l1e.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new vaj(pointF, zP, arrayList);
    }
}
