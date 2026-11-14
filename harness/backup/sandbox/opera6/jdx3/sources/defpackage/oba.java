package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class oba implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<oba> CREATOR = new uz8(16);
    public final int[] a;
    public final int b;

    public /* synthetic */ oba(int i, int i2, int[] iArr) {
        this((i & 1) != 0 ? new int[0] : iArr, 3);
    }

    public oba(int[] iArr) {
        this(2, 0, iArr);
    }

    public oba(int[] iArr, int i) {
        this.a = iArr;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!oba.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        oba obaVar = (oba) obj;
        return Arrays.equals(this.a, obaVar.a) && this.b == obaVar.b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + this.b;
    }

    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeInt(this.b);
    }
}
