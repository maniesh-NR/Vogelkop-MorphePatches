package defpackage;

import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gfl {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;
    public final ArrayList d;

    public gfl(CharSequence charSequence, long j, TextClassification textClassification, ArrayList arrayList) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfl)) {
            return false;
        }
        gfl gflVar = (gfl) obj;
        return Intrinsics.a(this.a, gflVar.a) && xjl.b(this.b, gflVar.b) && Intrinsics.a(this.c, gflVar.c) && this.d.equals(gflVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = xjl.c;
        return this.d.hashCode() + ((this.c.hashCode() + z1m.e(iHashCode, 31, this.b)) * 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + xjl.h(this.b) + ", textClassification=" + this.c + ", icons=" + this.d + ")";
    }
}
