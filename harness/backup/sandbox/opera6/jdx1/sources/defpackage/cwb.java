package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class cwb {
    public static final z8b a = z8b.G("k");

    public static ArrayList a(esb esbVar, p2d p2dVar, float f, j0n j0nVar, boolean z) {
        esb esbVar2;
        p2d p2dVar2;
        float f2;
        j0n j0nVar2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (esbVar.t() == 6) {
            p2dVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        esbVar.k();
        while (esbVar.o()) {
            if (esbVar.E(a) != 0) {
                esbVar.H();
            } else if (esbVar.t() == 1) {
                esbVar.h();
                if (esbVar.t() == 7) {
                    esb esbVar3 = esbVar;
                    p2d p2dVar3 = p2dVar;
                    float f3 = f;
                    j0n j0nVar3 = j0nVar;
                    boolean z3 = z;
                    zvb zvbVarB = bwb.b(esbVar3, p2dVar3, f3, j0nVar3, false, z3);
                    esbVar2 = esbVar3;
                    p2dVar2 = p2dVar3;
                    f2 = f3;
                    j0nVar2 = j0nVar3;
                    z2 = z3;
                    arrayList.add(zvbVarB);
                } else {
                    esbVar2 = esbVar;
                    p2dVar2 = p2dVar;
                    f2 = f;
                    j0nVar2 = j0nVar;
                    z2 = z;
                    while (esbVar2.o()) {
                        arrayList.add(bwb.b(esbVar2, p2dVar2, f2, j0nVar2, true, z2));
                    }
                }
                esbVar2.l();
                esbVar = esbVar2;
                p2dVar = p2dVar2;
                f = f2;
                j0nVar = j0nVar2;
                z = z2;
            } else {
                esb esbVar4 = esbVar;
                arrayList.add(bwb.b(esbVar4, p2dVar, f, j0nVar, false, z));
                esbVar = esbVar4;
            }
        }
        esbVar.m();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            zvb zvbVar = (zvb) arrayList.get(i2);
            i2++;
            zvb zvbVar2 = (zvb) arrayList.get(i2);
            zvbVar.h = Float.valueOf(zvbVar2.g);
            if (zvbVar.c == null && (obj = zvbVar2.b) != null) {
                zvbVar.c = obj;
                if (zvbVar instanceof a7g) {
                    ((a7g) zvbVar).d();
                }
            }
        }
        zvb zvbVar3 = (zvb) arrayList.get(i);
        if ((zvbVar3.b == null || zvbVar3.c == null) && arrayList.size() > 1) {
            arrayList.remove(zvbVar3);
        }
    }
}
