package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class ku implements r37 {

    @NotNull
    public static final Parcelable.Creator<ku> CREATOR = new n2((byte) 10);
    public final j2g a;
    public final boolean b;

    public /* synthetic */ ku() {
        this(null, false);
    }

    public ku(j2g j2gVar, boolean z) {
        this.a = j2gVar;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
