package defpackage;

import android.graphics.Canvas;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class fya implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<fya> CREATOR = new uz8(26);
    public static long d = SystemClock.uptimeMillis();
    public final eya a;
    public long b;
    public Function1 c;

    public fya(eya eyaVar) {
        this.a = eyaVar;
        long j = d;
        d = 1 + j;
        this.b = j;
    }

    public void a(cya cyaVar) {
    }

    public void b(Canvas canvas, kk7 kk7Var) {
    }

    public final void c(int i, Object obj, Object obj2) {
        if (Intrinsics.a(obj, obj2)) {
            return;
        }
        cya cyaVar = new cya(this, i, obj, obj2);
        Function1 function1 = this.c;
        if (function1 != null) {
            function1.invoke(cyaVar);
        }
    }

    public final void d(Function1 function1) {
        if (Intrinsics.a(this.c, function1)) {
            return;
        }
        this.c = function1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        fya fyaVar = (fya) obj;
        return this.a == fyaVar.a && this.b == fyaVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return getClass().getSimpleName() + "(id=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeInt(this.a.ordinal());
    }
}
