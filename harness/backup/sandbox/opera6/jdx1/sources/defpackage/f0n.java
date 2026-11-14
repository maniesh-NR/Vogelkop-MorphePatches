package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f0n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new g0n(null, new u7b(parcel.createByteArray()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new g0n[i];
    }
}
