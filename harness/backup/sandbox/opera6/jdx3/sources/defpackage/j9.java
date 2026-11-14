package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j9 implements n37, pn9 {

    @NotNull
    public static final Parcelable.Creator<j9> CREATOR = new n2((byte) 1);
    public final oba a;

    public j9(oba obaVar) {
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
