package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class n3i implements n37 {

    @NotNull
    public static final Parcelable.Creator<n3i> CREATOR = new zug((byte) 17);
    public final p4i a;

    public n3i(p4i p4iVar) {
        this.a = p4iVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
