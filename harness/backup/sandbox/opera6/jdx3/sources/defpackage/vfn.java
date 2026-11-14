package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class vfn implements n37 {

    @NotNull
    public static final Parcelable.Creator<vfn> CREATOR = new l7k((byte) 17);
    public final int a;
    public final oba b;

    public vfn() {
        this(0, null, 3);
    }

    public vfn(int i, oba obaVar) {
        this.a = i;
        this.b = obaVar;
    }

    public /* synthetic */ vfn(int i, oba obaVar, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new oba(3, 0, null) : obaVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        this.b.writeToParcel(parcel, i);
    }
}
