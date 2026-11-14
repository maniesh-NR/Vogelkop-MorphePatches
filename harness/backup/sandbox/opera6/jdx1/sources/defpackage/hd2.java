package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hd2 {
    public static final hd2 a = new hd2();

    public final boolean a(Object obj, Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj instanceof bza) || !(obj2 instanceof bza)) {
            return Intrinsics.a(obj, obj2);
        }
        bza bzaVar = (bza) obj;
        bza bzaVar2 = (bza) obj2;
        return Intrinsics.a(bzaVar.a, bzaVar2.a) && Intrinsics.a(bzaVar.b, bzaVar2.b) && Intrinsics.a(bzaVar.d, bzaVar2.d) && Intrinsics.a(bzaVar.l, bzaVar2.l) && bzaVar.m == bzaVar2.m && bzaVar.n == bzaVar2.n;
    }

    public final int b(Object obj) {
        if (!(obj instanceof bza)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        bza bzaVar = (bza) obj;
        return bzaVar.n.hashCode() + ((bzaVar.m.hashCode() + ((bzaVar.l.hashCode() + z1m.h(bzaVar.d, (bzaVar.b.hashCode() + (bzaVar.a.hashCode() * 31)) * 961, 961)) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}
