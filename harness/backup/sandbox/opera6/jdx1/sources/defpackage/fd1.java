package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class fd1 {
    public static final z8b a = z8b.G("k", "x", "y");

    public static vk a(vsb vsbVar, p2d p2dVar) {
        ArrayList arrayList = new ArrayList();
        if (vsbVar.t() == 1) {
            vsbVar.h();
            while (vsbVar.o()) {
                vsb vsbVar2 = vsbVar;
                p2d p2dVar2 = p2dVar;
                arrayList.add(new a7g(p2dVar2, bwb.b(vsbVar2, p2dVar2, dzm.c(), ulp.k, vsbVar.t() == 3, false)));
                vsbVar = vsbVar2;
                p2dVar = p2dVar2;
            }
            vsbVar.l();
            cwb.b(arrayList);
        } else {
            arrayList.add(new zvb(xsb.b(vsbVar, dzm.c())));
        }
        return new vk(arrayList);
    }

    public static kd1 b(vsb vsbVar, p2d p2dVar) {
        vsbVar.k();
        vk vkVarA = null;
        ed1 ed1VarI = null;
        boolean z = false;
        ed1 ed1VarI2 = null;
        while (vsbVar.t() != 4) {
            int iE = vsbVar.E(a);
            if (iE == 0) {
                vkVarA = a(vsbVar, p2dVar);
            } else if (iE != 1) {
                if (iE != 2) {
                    vsbVar.G();
                    vsbVar.H();
                } else if (vsbVar.t() == 6) {
                    vsbVar.H();
                    z = true;
                } else {
                    ed1VarI = zi4.I(vsbVar, p2dVar, true);
                }
            } else if (vsbVar.t() == 6) {
                vsbVar.H();
                z = true;
            } else {
                ed1VarI2 = zi4.I(vsbVar, p2dVar, true);
            }
        }
        vsbVar.m();
        if (z) {
            p2dVar.a("Lottie doesn't support expressions.");
        }
        return vkVarA != null ? vkVarA : new gd1(ed1VarI2, ed1VarI);
    }
}
