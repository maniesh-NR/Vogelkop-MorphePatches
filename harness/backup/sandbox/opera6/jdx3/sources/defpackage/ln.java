package defpackage;

/* loaded from: classes.dex */
public abstract class ln extends aqi {
    public final boolean u;
    public final String v;

    public ln(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, dl dlVar, String str8, rm rmVar, bp bpVar, i3j i3jVar, ap apVar, String str9) {
        super(str, str2, str3, str4, str5, str6, str7, dlVar, str8, yo.ADMOB, rmVar, bpVar, i3jVar, apVar);
        this.u = z;
        this.v = str9;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ln(rm rmVar, String str, boolean z, dl dlVar, bp bpVar, int i, i3j i3jVar, ap apVar, String str2) {
        this("", "", null, null, "", str + "," + i, str, z, dlVar, "", rmVar, bpVar, i3jVar, apVar, str2);
        yo yoVar = yo.ADMOB;
    }

    @Override // defpackage.yz
    public final void b() {
        if (p()) {
            super.b();
        } else {
            c();
        }
    }

    @Override // defpackage.yz
    public final String j() {
        return this.v;
    }

    @Override // defpackage.yz
    public final boolean p() {
        if (this.u) {
            return false;
        }
        return super.p();
    }
}
