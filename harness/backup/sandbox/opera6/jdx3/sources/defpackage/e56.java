package defpackage;

import androidx.recyclerview.widget.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e56 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ k56 c;

    public /* synthetic */ e56(k56 k56Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = arrayList;
        this.c = k56Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                int size = arrayList.size();
                while (true) {
                    k56 k56Var = this.c;
                    if (i >= size) {
                        arrayList.clear();
                        k56Var.n.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i);
                        i++;
                        j56 j56Var = (j56) obj;
                        k56Var.t(j56Var.a, j56Var.b, j56Var.c, j56Var.d, j56Var.e);
                    }
                }
            default:
                int size2 = arrayList.size();
                while (true) {
                    k56 k56Var2 = this.c;
                    if (i >= size2) {
                        arrayList.clear();
                        k56Var2.m.remove(arrayList);
                        break;
                    } else {
                        Object obj2 = arrayList.get(i);
                        i++;
                        k56Var2.s((i) obj2);
                    }
                }
        }
    }
}
