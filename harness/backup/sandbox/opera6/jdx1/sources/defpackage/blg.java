package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class blg extends e4 {
    public final int h;
    public final int i;
    public final int[] j;
    public final int[] k;
    public final gql[] l;
    public final Object[] m;
    public final HashMap n;

    /* JADX WARN: Illegal instructions before constructor call */
    public blg(ArrayList arrayList, jij jijVar) {
        gql[] gqlVarArr = new gql[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            gqlVarArr[i2] = ((qrd) obj).b();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            objArr[i] = ((qrd) obj2).a();
            i++;
        }
        this(gqlVarArr, objArr, jijVar);
    }

    public blg(gql[] gqlVarArr, Object[] objArr, jij jijVar) {
        super(jijVar);
        int length = gqlVarArr.length;
        this.l = gqlVarArr;
        this.j = new int[length];
        this.k = new int[length];
        this.m = objArr;
        this.n = new HashMap();
        int length2 = gqlVarArr.length;
        int i = 0;
        int iO = 0;
        int iH = 0;
        int i2 = 0;
        while (i < length2) {
            gql gqlVar = gqlVarArr[i];
            this.l[i2] = gqlVar;
            this.k[i2] = iO;
            this.j[i2] = iH;
            iO += gqlVar.o();
            iH += this.l[i2].h();
            this.n.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
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
