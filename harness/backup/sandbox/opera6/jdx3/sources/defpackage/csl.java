package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.leanplum.internal.Constants;

/* loaded from: classes.dex */
public interface csl extends Parcelable {

    @NonNull
    public static final Parcelable.Creator<csl> CREATOR = new l7k(10);

    String a1();

    @Override // android.os.Parcelable
    default int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    default void writeToParcel(Parcel parcel, int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this instanceof yv) {
            str = "address";
        } else {
            if (!(this instanceof hhk)) {
                s49.l(this, "Unsupported token id: ");
                return;
            }
            str = Constants.Kinds.STRING;
        }
        sb.append(str);
        sb.append(":");
        sb.append(a1());
        parcel.writeString(sb.toString());
    }
}
