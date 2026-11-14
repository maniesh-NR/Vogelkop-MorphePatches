package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tjl {
    public final rwj a;
    public final rwj b;
    public final rwj c;
    public final rwj d;

    public tjl(rwj rwjVar, rwj rwjVar2, rwj rwjVar3, rwj rwjVar4) {
        this.a = rwjVar;
        this.b = rwjVar2;
        this.c = rwjVar3;
        this.d = rwjVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof tjl)) {
            return false;
        }
        tjl tjlVar = (tjl) obj;
        return Intrinsics.a(this.a, tjlVar.a) && Intrinsics.a(this.b, tjlVar.b) && Intrinsics.a(this.c, tjlVar.c) && Intrinsics.a(this.d, tjlVar.d);
    }

    public final int hashCode() {
        rwj rwjVar = this.a;
        int iHashCode = (rwjVar != null ? rwjVar.hashCode() : 0) * 31;
        rwj rwjVar2 = this.b;
        int iHashCode2 = (iHashCode + (rwjVar2 != null ? rwjVar2.hashCode() : 0)) * 31;
        rwj rwjVar3 = this.c;
        int iHashCode3 = (iHashCode2 + (rwjVar3 != null ? rwjVar3.hashCode() : 0)) * 31;
        rwj rwjVar4 = this.d;
        return iHashCode3 + (rwjVar4 != null ? rwjVar4.hashCode() : 0);
    }
}
