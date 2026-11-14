package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class rw extends k2g {

    @NotNull
    public static final Parcelable.Creator<rw> CREATOR = new n2((byte) 11);
    public final vz8[] c;
    public final j2g d;

    public rw(vz8[] vz8VarArr, j2g j2gVar) {
        this.c = vz8VarArr;
        this.d = j2gVar;
    }

    @Override // defpackage.k2g
    public final j2g a() {
        return this.d;
    }

    @Override // defpackage.k2g
    public final vz8[] b() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        vz8[] vz8VarArr = this.c;
        int length = vz8VarArr.length;
        parcel.writeInt(length);
        for (int i2 = 0; i2 != length; i2++) {
            parcel.writeParcelable(vz8VarArr[i2], i);
        }
        parcel.writeParcelable(this.d, i);
    }
}
