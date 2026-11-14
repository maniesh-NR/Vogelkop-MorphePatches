package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class dw9 implements n37, pn9 {

    @NotNull
    public static final Parcelable.Creator<dw9> CREATOR = new uz8((byte) 14);
    public final oba a;

    public dw9(oba obaVar) {
        this.a = obaVar;
    }

    @Override // defpackage.pn9
    public final oba a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
    }
}
