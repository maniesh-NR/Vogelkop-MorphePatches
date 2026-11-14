package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.autofill.AutofillValue;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s09 extends x09 {

    @NotNull
    public static final Parcelable.Creator<s09> CREATOR = new uz8((byte) 2);
    public final AutofillValue a;

    public s09(AutofillValue autofillValue) {
        this.a = autofillValue;
    }

    public final Object a() {
        return Long.valueOf(this.a.getDateValue());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
