package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class sf1 implements CharSequence {
    public final List a;
    public final String b;
    public final ArrayList c;
    public final ArrayList d;

    static {
        c67 c67Var = zki.a;
    }

    public sf1(String str) {
        this(str, (List) l08.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sf1(String str, List list) {
        List list2 = list;
        this(list2.isEmpty() ? null : list2, str);
    }

    public sf1(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.a = list;
        this.b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                rf1 rf1Var = (rf1) list.get(i);
                Object obj = rf1Var.a;
                if (obj instanceof rwj) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(rf1Var);
                } else if (obj instanceof yzf) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(rf1Var);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.c = arrayList;
        this.d = arrayList2;
        List listC0 = arrayList2 != null ? CollectionsKt.c0(new yg9((byte) 10), arrayList2) : null;
        List list2 = listC0;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int i2 = ((rf1) CollectionsKt.K(listC0)).c;
        ide ideVar = vbb.a;
        ide ideVar2 = new ide(1);
        ideVar2.a(i2);
        int size2 = listC0.size();
        for (int i3 = 1; i3 < size2; i3++) {
            rf1 rf1Var2 = (rf1) listC0.get(i3);
            while (true) {
                if (ideVar2.b == 0) {
                    break;
                }
                int iD = ideVar2.d();
                if (rf1Var2.b >= iD) {
                    ideVar2.e(ideVar2.b - 1);
                } else {
                    int i4 = rf1Var2.c;
                    if (i4 > iD) {
                        b8b.a("Paragraph overlap not allowed, end " + i4 + " should be less than or equal to " + iD);
                    }
                }
            }
            ideVar2.a(rf1Var2.c);
        }
    }

    public final List a(int i) {
        List list = this.a;
        if (list == null) {
            return l08.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            rf1 rf1Var = (rf1) obj;
            if ((rf1Var.a instanceof pfc) && tf1.b(0, i, rf1Var.b, rf1Var.c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List b(int i, int i2, String str) {
        List list = this.a;
        if (list == null) {
            return l08.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            rf1 rf1Var = (rf1) list.get(i3);
            Object obj = rf1Var.a;
            int i4 = rf1Var.c;
            int i5 = rf1Var.b;
            String str2 = rf1Var.d;
            if ((obj instanceof ehk) && str.equals(str2) && tf1.b(i, i2, i5, i4)) {
                arrayList.add(new rf1(str2, i5, i4, ((ehk) rf1Var.a).a));
            }
        }
        return arrayList;
    }

    public final sf1 c(Function1 function1) {
        qf1 qf1Var = new qf1(this);
        ArrayList arrayList = qf1Var.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            rf1 rf1Var = (rf1) function1.invoke(((pf1) arrayList.get(i)).a(LinearLayoutManager.INVALID_OFFSET));
            Object obj = rf1Var.a;
            arrayList.set(i, new pf1(rf1Var.d, rf1Var.b, rf1Var.c, obj));
        }
        return qf1Var.h();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    @Override // java.lang.CharSequence
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final sf1 subSequence(int i, int i2) {
        if (!(i <= i2)) {
            b8b.a("start (" + i + ") should be less or equal to end (" + i2 + ")");
        }
        String str = this.b;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        sf1 sf1Var = tf1.a;
        if (i > i2) {
            b8b.a("start (" + i + ") should be less than or equal to end (" + i2 + ")");
        }
        List list = this.a;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                rf1 rf1Var = (rf1) list.get(i3);
                int i4 = rf1Var.b;
                int i5 = rf1Var.c;
                if (tf1.b(i, i2, i4, i5)) {
                    arrayList2.add(new rf1(rf1Var.d, Math.max(i, rf1Var.b) - i, Math.min(i2, i5) - i, rf1Var.a));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new sf1(arrayList, strSubstring);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf1)) {
            return false;
        }
        sf1 sf1Var = (sf1) obj;
        return Intrinsics.a(this.b, sf1Var.b) && Intrinsics.a(this.a, sf1Var.a);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        List list = this.a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b;
    }
}
