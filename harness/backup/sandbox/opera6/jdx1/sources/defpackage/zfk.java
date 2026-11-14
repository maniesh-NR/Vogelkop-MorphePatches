package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zfk implements Comparable, Parcelable {
    public static final Parcelable.Creator<zfk> CREATOR = new l7k((byte) 2);
    public static final String d;
    public static final String e;
    public static final String f;
    public final int a;
    public final int b;
    public final int c;

    static {
        String str = tym.a;
        d = "0";
        e = "1";
        f = "2";
    }

    public zfk(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public zfk(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zfk zfkVar = (zfk) obj;
        int i = this.a - zfkVar.a;
        return (i == 0 && (i = this.b - zfkVar.b) == 0) ? this.c - zfkVar.c : i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zfk.class == obj.getClass()) {
            zfk zfkVar = (zfk) obj;
            if (this.a == zfkVar.a && this.b == zfkVar.b && this.c == zfkVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return this.a + "." + this.b + "." + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
