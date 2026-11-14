package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class n6j {
    public final r6j a;
    public final LinkedHashSet b = new LinkedHashSet();
    public final ArrayList c = new ArrayList();

    public n6j(r6j r6jVar) {
        this.a = r6jVar;
    }

    public static void c(n6j n6jVar, int i, int i2, int i3, int i4, List list, int i5) {
        if ((i5 & 8) != 0) {
            i4 = n6jVar.a.e;
        }
        int i6 = i4;
        boolean z = n6jVar.a.f;
        if ((i5 & 32) != 0) {
            list = l08.a;
        }
        n6jVar.getClass();
        p6j p6jVar = new p6j(i2);
        int[] iArr = {i3};
        List list2 = list;
        ArrayList arrayList = new ArrayList(k95.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new p6j(((Number) it.next()).intValue()));
        }
        n6jVar.b(i, p6jVar, iArr, i6, z, arrayList);
    }

    public static void d(n6j n6jVar, int i, int i2, int[] iArr, List list, int i3) {
        if ((i3 & 4) != 0) {
            iArr = new int[0];
        }
        int[] iArr2 = iArr;
        int i4 = (i3 & 8) != 0 ? n6jVar.a.e : 2131232305;
        boolean z = n6jVar.a.f;
        if ((i3 & 32) != 0) {
            list = l08.a;
        }
        n6jVar.getClass();
        p6j p6jVar = new p6j(i2);
        List list2 = list;
        ArrayList arrayList = new ArrayList(k95.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new p6j(((Number) it.next()).intValue()));
        }
        n6jVar.b(i, p6jVar, iArr2, i4, z, arrayList);
    }

    public final void a(int i) {
        this.b.add(Integer.valueOf(i));
    }

    public final void b(int i, p6j p6jVar, int[] iArr, int i2, boolean z, ArrayList arrayList) {
        r6j r6jVar = this.a;
        int i3 = r6jVar.a + i;
        x6j x6jVar = r6jVar.b;
        r6j r6jVar2 = new r6j(i3, new x6j(x6jVar.a, iArr, x6jVar.c), p6jVar, new m6j(r6jVar), i2, z, null, arrayList, 448);
        this.b.add(Integer.valueOf(i3));
        this.c.add(r6jVar2);
    }
}
