package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class qse extends t73 {

    @NotNull
    public static final Parcelable.Creator<qse> CREATOR = new efc((byte) 23);
    public final int a;
    public final String b;
    public final ArrayList c;

    public qse(int i, String str, ArrayList arrayList) {
        this.a = i;
        this.b = str;
        this.c = arrayList;
    }

    @Override // defpackage.t73
    public final int a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeStringList(this.c);
    }
}
