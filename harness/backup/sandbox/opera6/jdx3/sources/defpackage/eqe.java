package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class eqe implements r82 {
    public final ArrayList a = new ArrayList(1);

    @Override // defpackage.r82
    public final void a() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((r82) obj).a();
        }
    }

    @Override // defpackage.r82
    public final void b(boolean z, boolean z2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((r82) obj).b(z, z2);
        }
    }

    @Override // defpackage.r82
    public final void c(int i) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((r82) obj).c(i);
        }
    }

    @Override // defpackage.r82
    public final void d(g82 g82Var, lqm lqmVar, boolean z) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((r82) obj).d(g82Var, lqmVar, z);
        }
    }

    @Override // defpackage.r82
    public final void e() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((r82) obj).e();
        }
    }
}
