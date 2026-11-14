package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class exe implements n37, pn9 {

    @NotNull
    public static final Parcelable.Creator<exe> CREATOR = new efc((byte) 26);
    public final boolean a;
    public final oba b;

    public exe() {
        this(3, (oba) null);
    }

    public /* synthetic */ exe(int i, oba obaVar) {
        this((i & 1) == 0, (i & 2) != 0 ? new oba(3, 0, null) : obaVar);
    }

    public exe(boolean z, oba obaVar) {
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
