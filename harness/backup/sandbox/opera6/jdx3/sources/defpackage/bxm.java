package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bxm {
    public final List a;
    public final Boolean b;
    public final Integer c;

    public bxm(List list, Boolean bool, Integer num) {
        this.a = list;
        this.b = bool;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxm)) {
            return false;
        }
        bxm bxmVar = (bxm) obj;
        return Intrinsics.a(this.a, bxmVar.a) && this.b.equals(bxmVar.b) && Intrinsics.a(this.c, bxmVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "UsercentricsSecondLayerState(serviceDecisions=" + this.a + ", ccpaOptOutToggleValue=" + this.b + ", activeTabIndex=" + this.c + ")";
    }
}
