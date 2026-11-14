package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class xse extends t73 {

    @NotNull
    public static final Parcelable.Creator<xse> CREATOR = new efc((byte) 24);
    public final int a;

    public xse(int i) {
        this.a = i;
    }

    @Override // defpackage.t73
    public final int a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
