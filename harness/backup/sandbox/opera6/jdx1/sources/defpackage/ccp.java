package defpackage;

import androidx.fragment.app.r;

/* loaded from: classes.dex */
public final class ccp {
    public final r a;
    public final dbh b;

    public ccp(r rVar, dbh dbhVar) {
        this.a = rVar;
        this.b = dbhVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ccp)) {
            return false;
        }
        ccp ccpVar = (ccp) obj;
        return this.a.equals(ccpVar.a) && this.b.equals(ccpVar.b);
    }

    public final int hashCode() {
        return (((-717379947) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return sko.l("StandardIntegrityDialogRequest{typeCode=4, activity=", this.a.toString(), ", standardIntegrityResponse=", this.b.toString(), "}");
    }
}
