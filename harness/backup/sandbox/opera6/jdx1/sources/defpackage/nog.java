package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class nog {
    public final boolean a;
    public final ArrayList b;

    public nog(ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nog)) {
            return false;
        }
        nog nogVar = (nog) obj;
        return this.a == nogVar.a && this.b.equals(nogVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Posture(isTabletop=" + this.a + ", hinges=[" + CollectionsKt.P(this.b, ", ", (CharSequence) null, (String) null, 0, (Function1) null, 62) + "])";
    }
}
