package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public final class cxg implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<cxg> CREATOR = new yzo((byte) 8);
    public final String a;
    public final String b;
    public final IBinder c;
    public final Bundle d;

    public /* synthetic */ cxg(Parcel parcel) {
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.a = string;
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        this.b = string2;
        if (parcel.readByte() != 0) {
            this.c = parcel.readStrongBinder();
        } else {
            this.c = null;
        }
        Bundle bundle = parcel.readBundle(cxg.class.getClassLoader());
        this.d = bundle == null ? Bundle.EMPTY : bundle;
    }

    public cxg(String str, String str2, IBinder iBinder) {
        Objects.requireNonNull(str, "targetPackage cannot be null");
        this.a = str;
        Objects.requireNonNull(str2, "url cannot be null");
        this.b = str2;
        this.c = iBinder;
        this.d = Bundle.EMPTY;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        IBinder iBinder = this.c;
        if (iBinder != null) {
            parcel.writeByte((byte) 1);
            parcel.writeStrongBinder(iBinder);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeBundle(this.d);
    }
}
