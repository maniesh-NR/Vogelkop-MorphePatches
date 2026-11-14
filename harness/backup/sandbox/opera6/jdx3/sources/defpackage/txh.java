package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class txh extends pxh {

    @NotNull
    public static final Parcelable.Creator<txh> CREATOR = new zug(15);
    public final int a;
    public final int b;
    public final Object[] c;

    public txh(Object[] objArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = objArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!txh.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        txh txhVar = (txh) obj;
        return this.a == txhVar.a && this.b == txhVar.b && Arrays.equals(this.c, txhVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        Object[] objArr = this.c;
        int length = objArr.length;
        parcel.writeInt(length);
        for (int i2 = 0; i2 != length; i2++) {
            parcel.writeValue(objArr[i2]);
        }
    }
}
