package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class dj5 extends e4 {
    public final int h;
    public final int i;
    public final int[] j;
    public final int[] k;
    public final gql[] l;
    public final Object[] m;
    public final HashMap n;

    public dj5(ArrayList arrayList, jij jijVar) {
        super(jijVar);
        int size = arrayList.size();
        this.j = new int[size];
        this.k = new int[size];
        this.l = new gql[size];
        this.m = new Object[size];
        this.n = new HashMap();
        int size2 = arrayList.size();
        int iO = 0;
        int iH = 0;
        int i = 0;
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            gj5 gj5Var = (gj5) obj;
            gql[] gqlVarArr = this.l;
            jcd jcdVar = gj5Var.a.o;
            gqlVarArr[i] = jcdVar;
            this.k[i] = iO;
            this.j[i] = iH;
            iO += jcdVar.e.o();
            iH += this.l[i].h();
            Object[] objArr = this.m;
            Object obj2 = gj5Var.b;
            objArr[i] = obj2;
            this.n.put(obj2, Integer.valueOf(i));
            i++;
        }
        this.h = iO;
        this.i = iH;
    }

    @Override // defpackage.gql
    public final int h() {
        return this.i;
    }

    @Override // defpackage.gql
    public final int o() {
        return this.h;
    }

    @Override // defpackage.e4
    public final int q(Object obj) {
        Integer num = (Integer) this.n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // defpackage.e4
    public final int r(int i) {
        return tym.e(this.j, i + 1, false, false);
    }

    @Override // defpackage.e4
    public final int s(int i) {
        return tym.e(this.k, i + 1, false, false);
    }

    @Override // defpackage.e4
    public final Object t(int i) {
        return this.m[i];
    }

    @Override // defpackage.e4
    public final int u(int i) {
        return this.j[i];
    }

    @Override // defpackage.e4
    public final int v(int i) {
        return this.k[i];
    }

    @Override // defpackage.e4
    public final gql x(int i) {
        return this.l[i];
    }
}
