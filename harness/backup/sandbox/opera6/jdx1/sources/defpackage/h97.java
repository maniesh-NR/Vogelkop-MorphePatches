package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class h97 extends e37 {
    public int m;

    public h97(f1o f1oVar) {
        super(f1oVar);
        if (f1oVar instanceof tga) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.e37
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            z27 z27Var = (z27) obj;
            z27Var.a(z27Var);
        }
    }
}
