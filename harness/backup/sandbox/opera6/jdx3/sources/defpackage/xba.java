package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class xba implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<xba> CREATOR = new uz8(17);
    public final wba a;
    public final Parcelable b;

    public xba(Parcel parcel) {
        wba wbaVar = (wba) wba.e.get(parcel.readInt());
        this.a = wbaVar;
        this.b = kfo.b0(parcel, wbaVar.getClass().getClassLoader(), Parcelable.class);
    }

    public xba(wba wbaVar, Parcelable parcelable) {
        this.a = wbaVar;
        this.b = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.ordinal());
        parcel.writeParcelable(this.b, i);
    }
}
