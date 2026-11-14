package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class pb6 implements n37, pn9 {

    @NotNull
    public static final Parcelable.Creator<pb6> CREATOR = new hh3((byte) 12);
    public final boolean a;
    public final oba b;

    public pb6() {
        this(true, new oba(3, 0, null));
    }

    public pb6(boolean z, oba obaVar) {
        this.a = z;
        this.b = obaVar;
    }

    @Override // defpackage.pn9
    public final oba a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        this.b.writeToParcel(parcel, i);
    }
}
