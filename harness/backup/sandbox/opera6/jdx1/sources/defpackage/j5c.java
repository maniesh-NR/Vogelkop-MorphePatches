package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j5c {
    public final sji a;
    public final ox0 b;
    public final see c;

    public j5c(sji sjiVar, ox0 ox0Var) {
        this.a = sjiVar;
        this.b = ox0Var;
        long[] jArr = imi.a;
        this.c = new see();
    }

    public final Function2 a(int i, Object obj, Object obj2) {
        see seeVar = this.c;
        i5c i5cVar = (i5c) seeVar.g(obj);
        byte b = 3;
        if (i5cVar != null && i5cVar.c == i && Intrinsics.a(i5cVar.b, obj2)) {
            ue5 ue5Var = i5cVar.d;
            if (ue5Var != null) {
                return ue5Var;
            }
            ue5 ue5Var2 = new ue5(818252804, new hda(i5cVar.e, i5cVar, b), true);
            i5cVar.d = ue5Var2;
            return ue5Var2;
        }
        i5c i5cVar2 = new i5c(this, i, obj, obj2);
        seeVar.m(obj, i5cVar2);
        ue5 ue5Var3 = i5cVar2.d;
        if (ue5Var3 != null) {
            return ue5Var3;
        }
        ue5 ue5Var4 = new ue5(818252804, new hda(this, i5cVar2, b), true);
        i5cVar2.d = ue5Var4;
        return ue5Var4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        i5c i5cVar = (i5c) this.c.g(obj);
        if (i5cVar != null) {
            return i5cVar.b;
        }
        k5c k5cVar = (k5c) this.b.invoke();
        int iC = k5cVar.c(obj);
        if (iC != -1) {
            return k5cVar.b(iC);
        }
        return null;
    }
}
