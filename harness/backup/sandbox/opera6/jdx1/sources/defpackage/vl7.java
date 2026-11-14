package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class vl7 implements Comparator, Parcelable {
    public static final Parcelable.Creator<vl7> CREATOR = new hh3((byte) 16);
    public final ul7[] a;
    public int b;
    public final String c;
    public final int d;

    public vl7(Parcel parcel) {
        this.c = parcel.readString();
        ul7[] ul7VarArr = (ul7[]) parcel.createTypedArray(ul7.CREATOR);
        String str = tym.a;
        this.a = ul7VarArr;
        this.d = ul7VarArr.length;
    }

    public vl7(String str, ArrayList arrayList) {
        this(str, false, (ul7[]) arrayList.toArray(new ul7[0]));
    }

    public vl7(String str, boolean z, ul7... ul7VarArr) {
        this.c = str;
        ul7VarArr = z ? (ul7[]) ul7VarArr.clone() : ul7VarArr;
        this.a = ul7VarArr;
        this.d = ul7VarArr.length;
        Arrays.sort(ul7VarArr, this);
    }

    public final vl7 a(String str) {
        return Objects.equals(this.c, str) ? this : new vl7(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ul7 ul7Var = (ul7) obj;
        ul7 ul7Var2 = (ul7) obj2;
        UUID uuid = q54.a;
        return uuid.equals(ul7Var.b) ? uuid.equals(ul7Var2.b) ? 0 : 1 : ul7Var.b.compareTo(ul7Var2.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vl7.class == obj.getClass()) {
            vl7 vl7Var = (vl7) obj;
            if (Objects.equals(this.c, vl7Var.c) && Arrays.equals(this.a, vl7Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        String str = this.c;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        this.b = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }
}
