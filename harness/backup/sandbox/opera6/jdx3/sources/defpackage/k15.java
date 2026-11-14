package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class k15 implements Parcelable {
    public final String a;
    public final long b;
    public final l15 c;

    @NotNull
    public static final j15 Companion = new j15();

    @NotNull
    public static final Parcelable.Creator<k15> CREATOR = new hh3(7);
    public static final l4c[] d = {null, null, z4c.a(f7c.b, new nd3((byte) 6))};

    public /* synthetic */ k15(int i, String str, long j, l15 l15Var) {
        if (7 != (i & 7)) {
            x7d.I(i, 7, i15.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j;
        this.c = l15Var;
    }

    public k15(String str, long j, l15 l15Var) {
        this.a = str;
        this.b = j;
        this.c = l15Var;
    }

    public final boolean a() {
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return false;
        }
        h9o.p();
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k15)) {
            return false;
        }
        k15 k15Var = (k15) obj;
        return Intrinsics.a(this.a, k15Var.a) && this.b == k15Var.b && this.c == k15Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c.name());
    }
}
