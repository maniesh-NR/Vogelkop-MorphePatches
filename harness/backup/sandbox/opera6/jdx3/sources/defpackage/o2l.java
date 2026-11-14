package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o2l {
    public final List a;
    public final List b;
    public final z6l c;
    public final p6l d;
    public final zyk e;
    public final zyk f;
    public final zyk g;

    public o2l(List list, List list2, z6l z6lVar, p6l p6lVar) {
        this.a = list;
        this.b = list2;
        this.c = z6lVar;
        this.d = p6lVar;
        final byte b = 0;
        this.e = z4c.b(new Function0(this) { // from class: n2l
            public final /* synthetic */ o2l b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                int i = 0;
                o2l o2lVar = this.b;
                switch (b2) {
                    case 0:
                        ArrayList arrayList = new ArrayList(o2lVar.b);
                        exg.A(arrayList, o2lVar.c);
                        return (b2l) CollectionsKt.firstOrNull(arrayList);
                    case 1:
                        b2l b2lVar = (b2l) o2lVar.e.getValue();
                        int i2 = -1;
                        if (b2lVar != null) {
                            int iA = o2lVar.a(b2lVar);
                            if (iA != -1) {
                                i2 = iA;
                            } else {
                                Iterator it = o2lVar.a.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        int i3 = i + 1;
                                        if (i < 0) {
                                            j95.n();
                                            throw null;
                                        }
                                        m2l m2lVar = (m2l) next;
                                        if ((m2lVar instanceof t2l) && ((t2l) m2lVar).a().contains(b2lVar)) {
                                            i2 = i;
                                        } else {
                                            i = i3;
                                        }
                                    }
                                }
                            }
                        }
                        return Integer.valueOf(i2);
                    default:
                        Iterator it2 = o2lVar.a.iterator();
                        while (it2.hasNext()) {
                            if (((m2l) it2.next()) instanceof u2l) {
                                i++;
                            }
                        }
                        return Integer.valueOf(i);
                }
            }
        });
        final byte b2 = 1;
        this.f = z4c.b(new Function0(this) { // from class: n2l
            public final /* synthetic */ o2l b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                int i = 0;
                o2l o2lVar = this.b;
                switch (b22) {
                    case 0:
                        ArrayList arrayList = new ArrayList(o2lVar.b);
                        exg.A(arrayList, o2lVar.c);
                        return (b2l) CollectionsKt.firstOrNull(arrayList);
                    case 1:
                        b2l b2lVar = (b2l) o2lVar.e.getValue();
                        int i2 = -1;
                        if (b2lVar != null) {
                            int iA = o2lVar.a(b2lVar);
                            if (iA != -1) {
                                i2 = iA;
                            } else {
                                Iterator it = o2lVar.a.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        int i3 = i + 1;
                                        if (i < 0) {
                                            j95.n();
                                            throw null;
                                        }
                                        m2l m2lVar = (m2l) next;
                                        if ((m2lVar instanceof t2l) && ((t2l) m2lVar).a().contains(b2lVar)) {
                                            i2 = i;
                                        } else {
                                            i = i3;
                                        }
                                    }
                                }
                            }
                        }
                        return Integer.valueOf(i2);
                    default:
                        Iterator it2 = o2lVar.a.iterator();
                        while (it2.hasNext()) {
                            if (((m2l) it2.next()) instanceof u2l) {
                                i++;
                            }
                        }
                        return Integer.valueOf(i);
                }
            }
        });
        final byte b3 = 2;
        this.g = z4c.b(new Function0(this) { // from class: n2l
            public final /* synthetic */ o2l b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b3;
                int i = 0;
                o2l o2lVar = this.b;
                switch (b22) {
                    case 0:
                        ArrayList arrayList = new ArrayList(o2lVar.b);
                        exg.A(arrayList, o2lVar.c);
                        return (b2l) CollectionsKt.firstOrNull(arrayList);
                    case 1:
                        b2l b2lVar = (b2l) o2lVar.e.getValue();
                        int i2 = -1;
                        if (b2lVar != null) {
                            int iA = o2lVar.a(b2lVar);
                            if (iA != -1) {
                                i2 = iA;
                            } else {
                                Iterator it = o2lVar.a.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        int i3 = i + 1;
                                        if (i < 0) {
                                            j95.n();
                                            throw null;
                                        }
                                        m2l m2lVar = (m2l) next;
                                        if ((m2lVar instanceof t2l) && ((t2l) m2lVar).a().contains(b2lVar)) {
                                            i2 = i;
                                        } else {
                                            i = i3;
                                        }
                                    }
                                }
                            }
                        }
                        return Integer.valueOf(i2);
                    default:
                        Iterator it2 = o2lVar.a.iterator();
                        while (it2.hasNext()) {
                            if (((m2l) it2.next()) instanceof u2l) {
                                i++;
                            }
                        }
                        return Integer.valueOf(i);
                }
            }
        });
    }

    public final int a(b2l b2lVar) {
        int i = 0;
        for (Object obj : this.a) {
            int i2 = i + 1;
            if (i < 0) {
                j95.n();
                throw null;
            }
            m2l m2lVar = (m2l) obj;
            if ((m2lVar instanceof u2l) && ((u2l) m2lVar).a.equals(b2lVar)) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2l)) {
            return false;
        }
        o2l o2lVar = (o2l) obj;
        return Intrinsics.a(this.a, o2lVar.a) && Intrinsics.a(this.b, o2lVar.b) && Intrinsics.a(this.c, o2lVar.c) && this.d == o2lVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + z1m.e(rfp.f(this.a.hashCode() * 31, 31, this.b), 31, this.c.a);
    }

    public final String toString() {
        return "";
    }
}
