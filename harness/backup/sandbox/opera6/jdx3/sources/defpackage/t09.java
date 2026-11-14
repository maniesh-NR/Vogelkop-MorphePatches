package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.autofill.AutofillValue;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class t09 extends x09 {

    @NotNull
    public static final Parcelable.Creator<t09> CREATOR = new uz8((byte) 3);
    public final AutofillValue a;

    public t09(AutofillValue autofillValue) {
        this.a = autofillValue;
    }

    public final Object a() {
        return Integer.valueOf(this.a.getListValue());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
