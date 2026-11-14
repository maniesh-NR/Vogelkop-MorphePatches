package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e1o {
    public static int f;
    public ArrayList a;
    public int b;
    public byte c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                e1o e1oVar = (e1o) arrayList.get(i);
                if (this.e == e1oVar.b) {
                    c(this.c, e1oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(jfc jfcVar, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        vo5 vo5Var = ((uo5) arrayList.get(0)).S;
        jfcVar.t();
        vo5Var.b(jfcVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((uo5) arrayList.get(i2)).b(jfcVar, false);
        }
        if (i == 0 && vo5Var.y0 > 0) {
            nb6.e(vo5Var, jfcVar, arrayList, 0);
        }
        if (i == 1 && vo5Var.z0 > 0) {
            nb6.e(vo5Var, jfcVar, arrayList, 1);
        }
        try {
            jfcVar.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            uo5 uo5Var = (uo5) arrayList.get(i3);
            ftj ftjVar = new ftj((byte) 10);
            new WeakReference(uo5Var);
            jfc.n(uo5Var.H);
            jfc.n(uo5Var.I);
            jfc.n(uo5Var.J);
            jfc.n(uo5Var.K);
            jfc.n(uo5Var.L);
            this.d.add(ftjVar);
        }
        if (i == 0) {
            iN = jfc.n(vo5Var.H);
            iN2 = jfc.n(vo5Var.J);
            jfcVar.t();
        } else {
            iN = jfc.n(vo5Var.I);
            iN2 = jfc.n(vo5Var.K);
            jfcVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, e1o e1oVar) {
        int i2 = e1oVar.b;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            uo5 uo5Var = (uo5) obj;
            ArrayList arrayList2 = e1oVar.a;
            if (!arrayList2.contains(uo5Var)) {
                arrayList2.add(uo5Var);
            }
            if (i == 0) {
                uo5Var.m0 = i2;
            } else {
                uo5Var.n0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        byte b = this.c;
        StringBuilder sb = new StringBuilder(b == 0 ? "Horizontal" : b == 1 ? "Vertical" : b == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String strK = p3p.k(this.b, "] <", sb);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            StringBuilder sbR = p3p.r(strK, " ");
            sbR.append(((uo5) obj).g0);
            strK = sbR.toString();
        }
        return strK.concat(" >");
    }
}
