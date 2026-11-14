package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class flf extends g3 {

    @NonNull
    public static final Parcelable.Creator<flf> CREATOR = new s0g((byte) 5);
    public final int c;
    public final float d;
    public final float e;
    public final int f;

    public flf(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt();
        this.d = parcel.readFloat();
        this.e = parcel.readFloat();
        this.f = parcel.readInt();
    }

    public flf(j2d j2dVar, int i, float f, float f2, int i2) {
        super(j2dVar);
        this.c = i;
        this.d = f;
        this.e = f2;
        this.f = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
        parcel.writeInt(this.f);
    }
}
