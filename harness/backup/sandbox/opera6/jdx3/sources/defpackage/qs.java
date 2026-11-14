package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class qs implements r37 {

    @NotNull
    public static final Parcelable.Creator<qs> CREATOR = new n2((byte) 6);
    public final ts a;
    public final st[] b;

    public qs(ts tsVar, st[] stVarArr) {
        this.a = tsVar;
        this.b = stVarArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ts tsVar = this.a;
        if (tsVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tsVar.writeToParcel(parcel, i);
        }
        st[] stVarArr = this.b;
        if (stVarArr == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        int length = stVarArr.length;
        parcel.writeInt(length);
        for (int i2 = 0; i2 != length; i2++) {
            stVarArr[i2].writeToParcel(parcel, i);
        }
    }
}
