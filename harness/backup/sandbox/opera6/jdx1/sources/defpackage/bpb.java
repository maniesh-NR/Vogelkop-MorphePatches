package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bpb {
    public final ArrayList a;

    public bpb(ctn ctnVar, ArrayList arrayList) {
        this.a = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            v63 v63Var = (v63) obj;
            if (v63Var != null) {
                v63Var.f = ctnVar;
            }
        }
    }
}
