package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g0n implements Parcelable {

    @NotNull
    public static final f0n CREATOR = new f0n();
    public final k2j a;
    public final l4c b;

    public g0n(k2j k2jVar, l4c l4cVar) {
        this.a = k2jVar;
        this.b = l4cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray((byte[]) this.b.getValue());
    }
}
