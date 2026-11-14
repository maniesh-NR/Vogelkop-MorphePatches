package ads_mobile_sdk;

/* loaded from: classes.dex */
public final class wf1 {
    public final String a;
    public final String b;

    public wf1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf1)) {
            return false;
        }
        wf1 wf1Var = (wf1) obj;
        return this.a.equals(wf1Var.a) && this.b.equals(wf1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return sko.l("InternalMuteThisAdReason(description=", this.a, ", muteUrl=", this.b, ")");
    }
}
