package defpackage;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class lkj extends jkj implements pl3 {
    public final shf d;

    public lkj(long j, String str, shf shfVar) {
        super(j, false, str);
        this.d = shfVar;
    }

    public static lkj k(long j, String str, String str2) {
        return new lkj(j, str, new shf(wqm.C(str2), (byte) 13));
    }

    @Override // defpackage.ol3
    public final String b() {
        return null;
    }

    @Override // defpackage.al3
    public final long d() {
        return 0L;
    }

    @Override // defpackage.pl3
    public final String f() {
        return (String) this.d.a;
    }

    @Override // defpackage.pl3
    public final shf getUrl() {
        return this.d;
    }

    @Override // defpackage.jkj, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString((String) this.d.b);
    }
}
