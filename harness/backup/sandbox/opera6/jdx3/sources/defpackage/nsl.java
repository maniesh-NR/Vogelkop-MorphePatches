package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nsl implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<nsl> CREATOR;
    public static final avj d;
    public static final nsl e;
    public static final nsl f;
    public static final nsl g;
    public static final nsl h;
    public static final nsl i;
    public static final nsl j;
    public static final /* synthetic */ nsl[] k;
    public static final /* synthetic */ h58 l;
    public final int a;
    public final boolean b;
    public final boolean c;

    static {
        int i2 = 4;
        nsl nslVar = new nsl(0, 2131364791, i2, "PEN");
        e = nslVar;
        int i3 = 6;
        nsl nslVar2 = new nsl(1, 2131364793, i3, "TEXT");
        f = nslVar2;
        int i4 = 2;
        nsl nslVar3 = new nsl(i4, 2131364792, i4, "PLACEHOLDER");
        g = nslVar3;
        nsl nslVar4 = new nsl(3, 2131364788, i2, "BLUR");
        h = nslVar4;
        nsl nslVar5 = new nsl(i2, 2131364790, i3, "EMOJI");
        i = nslVar5;
        nsl nslVar6 = new nsl("CUTOUT", 5, 2131364789, true, false);
        j = nslVar6;
        nsl[] nslVarArr = {nslVar, nslVar2, nslVar3, nslVar4, nslVar5, nslVar6};
        k = nslVarArr;
        l = new h58(nslVarArr);
        d = new avj((byte) 5);
        CREATOR = new l7k((byte) 11);
    }

    public /* synthetic */ nsl(int i2, int i3, int i4, String str) {
        this(str, i2, i3, (i4 & 2) == 0, (i4 & 4) != 0);
    }

    public nsl(String str, int i2, int i3, boolean z, boolean z2) {
        this.a = i3;
        this.b = z;
        this.c = z2;
    }

    public static nsl valueOf(String str) {
        return (nsl) Enum.valueOf(nsl.class, str);
    }

    public static nsl[] values() {
        return (nsl[]) k.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(name());
    }
}
