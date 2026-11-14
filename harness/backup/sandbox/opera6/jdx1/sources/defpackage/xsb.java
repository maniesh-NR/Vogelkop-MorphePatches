package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class xsb {
    public static final z8b a = z8b.G("x", "y");

    public static int a(esb esbVar) {
        esbVar.h();
        int iQ = (int) (esbVar.q() * 255.0d);
        int iQ2 = (int) (esbVar.q() * 255.0d);
        int iQ3 = (int) (esbVar.q() * 255.0d);
        while (esbVar.o()) {
            esbVar.H();
        }
        esbVar.l();
        return Color.argb(255, iQ, iQ2, iQ3);
    }

    public static PointF b(esb esbVar, float f) {
        int iA = vep.A(esbVar.t());
        if (iA == 0) {
            esbVar.h();
            float fQ = (float) esbVar.q();
            float fQ2 = (float) esbVar.q();
            while (esbVar.t() != 2) {
                esbVar.H();
            }
            esbVar.l();
            return new PointF(fQ * f, fQ2 * f);
        }
        if (iA != 2) {
            if (iA != 6) {
                qp2.o("Unknown point starts with ".concat(o18.w(esbVar.t())));
                return null;
            }
            float fQ3 = (float) esbVar.q();
            float fQ4 = (float) esbVar.q();
            while (esbVar.o()) {
                esbVar.H();
            }
            return new PointF(fQ3 * f, fQ4 * f);
        }
        esbVar.k();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (esbVar.o()) {
            int iE = esbVar.E(a);
            if (iE == 0) {
                fD = d(esbVar);
            } else if (iE != 1) {
                esbVar.G();
                esbVar.H();
            } else {
                fD2 = d(esbVar);
            }
        }
        esbVar.m();
        return new PointF(fD * f, fD2 * f);
    }

    public static ArrayList c(esb esbVar, float f) {
        ArrayList arrayList = new ArrayList();
        esbVar.h();
        while (esbVar.t() == 1) {
            esbVar.h();
            arrayList.add(b(esbVar, f));
            esbVar.l();
        }
        esbVar.l();
        return arrayList;
    }

    public static float d(esb esbVar) {
        int iT = esbVar.t();
        int iA = vep.A(iT);
        if (iA != 0) {
            if (iA == 6) {
                return (float) esbVar.q();
            }
            qp2.o("Unknown value for token of type ".concat(o18.w(iT)));
            return 0.0f;
        }
        esbVar.h();
        float fQ = (float) esbVar.q();
        while (esbVar.o()) {
            esbVar.H();
        }
        esbVar.l();
        return fQ;
    }
}
