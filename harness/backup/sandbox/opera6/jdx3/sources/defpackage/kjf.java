package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import androidx.annotation.NonNull;
import com.opera.android.sheet.OperaBottomSheetBehavior;

/* loaded from: classes.dex */
public final class kjf extends g3 {

    @NonNull
    public static final Parcelable.Creator<kjf> CREATOR = new ouj((byte) 4);
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public kjf(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt() == 1;
        this.f = parcel.readInt() == 1;
    }

    public kjf(OperaBottomSheetBehavior operaBottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.c = operaBottomSheetBehavior.q;
        this.d = operaBottomSheetBehavior.e;
        this.e = operaBottomSheetBehavior.n;
        this.f = operaBottomSheetBehavior.o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
