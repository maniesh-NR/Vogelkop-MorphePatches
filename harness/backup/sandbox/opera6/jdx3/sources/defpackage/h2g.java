package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h2g extends j2g {

    @NotNull
    public static final Parcelable.Creator<h2g> CREATOR = new kuf((byte) 7);
    public final String c;
    public final sq2 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public h2g(String str, sq2 sq2Var) {
        boolean z;
        String str2;
        if (str == null) {
            str2 = sq2Var.a;
            z = true;
        } else {
            z = false;
            str2 = str;
        }
        super(str2, z);
        this.c = str;
        this.d = sq2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2g)) {
            return false;
        }
        h2g h2gVar = (h2g) obj;
        return Intrinsics.a(this.c, h2gVar.c) && this.d == h2gVar.d;
    }

    public final int hashCode() {
        String str = this.c;
        return this.d.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d.name());
    }
}
