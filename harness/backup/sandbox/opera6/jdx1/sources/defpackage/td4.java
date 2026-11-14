package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class td4 {
    public final ArrayList a;
    public final rn2 b;

    public td4(ArrayList arrayList, rn2 rn2Var) {
        this.a = arrayList;
        this.b = rn2Var;
        jpo.i("Camera ID set cannot be empty.", !arrayList.isEmpty());
    }

    public final String a() {
        ArrayList arrayList = this.a;
        jpo.n("getInternalId() is only available for single-camera identifiers.", arrayList.size() == 1);
        return (String) CollectionsKt.K(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td4)) {
            return false;
        }
        td4 td4Var = (td4) obj;
        return this.a.equals(td4Var.a) && Intrinsics.a(this.b, td4Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        rn2 rn2Var = this.b;
        return iHashCode + (rn2Var != null ? rn2Var.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CameraIdentifier{cameraIds=");
        sb.append(CollectionsKt.P(this.a, ",", (CharSequence) null, (String) null, 0, (Function1) null, 62));
        rn2 rn2Var = this.b;
        if (rn2Var != null) {
            str = ", compatId=" + rn2Var;
        } else {
            str = "";
        }
        return o18.p(sb, str, '}');
    }
}
