package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class qnn implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<qnn> CREATOR;
    public static final qnn a;
    public static final qnn b;
    public static final /* synthetic */ qnn[] c;

    static {
        qnn qnnVar = new qnn("DEFAULT", 0);
        a = qnnVar;
        qnn qnnVar2 = new qnn("NEVER", 1);
        b = qnnVar2;
        c = new qnn[]{qnnVar, qnnVar2, new qnn("ALWAYS", 2)};
        CREATOR = new l7k((byte) 24);
    }

    public static qnn valueOf(String str) {
        return (qnn) Enum.valueOf(qnn.class, str);
    }

    public static qnn[] values() {
        return (qnn[]) c.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
