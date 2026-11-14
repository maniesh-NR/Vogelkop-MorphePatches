package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class sxh extends pxh {

    @NotNull
    public static final Parcelable.Creator<sxh> CREATOR = new zug(14);
    public final int a;
    public final Object[] b;

    public sxh(int i, Object[] objArr) {
        this.a = i;
        this.b = objArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!sxh.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        sxh sxhVar = (sxh) obj;
        return this.a == sxhVar.a && Arrays.equals(this.b, sxhVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a * 31);
    }

    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        Object[] objArr = this.b;
        int length = objArr.length;
        parcel.writeInt(length);
        for (int i2 = 0; i2 != length; i2++) {
            parcel.writeValue(objArr[i2]);
        }
    }
}
