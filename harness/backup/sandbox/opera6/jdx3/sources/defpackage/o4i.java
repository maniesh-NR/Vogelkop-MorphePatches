package defpackage;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o4i {
    public final String a;
    public final SpannableStringBuilder b;
    public final SpannableStringBuilder c;
    public final n4i d;
    public final n4i e;
    public final Bitmap f;
    public final Bitmap g;

    public o4i(String str, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, n4i n4iVar, n4i n4iVar2, Bitmap bitmap, Bitmap bitmap2) {
        this.a = str;
        this.b = spannableStringBuilder;
        this.c = spannableStringBuilder2;
        this.d = n4iVar;
        this.e = n4iVar2;
        this.f = bitmap;
        this.g = bitmap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4i)) {
            return false;
        }
        o4i o4iVar = (o4i) obj;
        return this.a.equals(o4iVar.a) && this.b.equals(o4iVar.b) && Intrinsics.a(this.c, o4iVar.c) && this.d.equals(o4iVar.d) && Intrinsics.a(this.e, o4iVar.e) && Intrinsics.a(this.f, o4iVar.f) && Intrinsics.a(this.g, o4iVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        SpannableStringBuilder spannableStringBuilder = this.c;
        int iHashCode2 = (this.d.hashCode() + ((iHashCode + (spannableStringBuilder == null ? 0 : spannableStringBuilder.hashCode())) * 31)) * 31;
        n4i n4iVar = this.e;
        int iHashCode3 = (iHashCode2 + (n4iVar == null ? 0 : n4iVar.hashCode())) * 31;
        Bitmap bitmap = this.f;
        int iHashCode4 = (iHashCode3 + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Bitmap bitmap2 = this.g;
        return iHashCode4 + (bitmap2 != null ? bitmap2.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
