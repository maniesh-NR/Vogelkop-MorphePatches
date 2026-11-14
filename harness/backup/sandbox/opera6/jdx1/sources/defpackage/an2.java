package defpackage;

import android.hardware.camera2.CaptureRequest;

/* loaded from: classes.dex */
public final class an2 {
    public final String a;
    public final Class b;
    public final CaptureRequest.Key c;

    public an2(String str, Class cls, CaptureRequest.Key key) {
        this.a = str;
        if (cls == null) {
            t3p.q("Null valueClass");
            throw null;
        }
        this.b = cls;
        this.c = key;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof an2)) {
            return false;
        }
        an2 an2Var = (an2) obj;
        if (!this.a.equals(an2Var.a) || !this.b.equals(an2Var.b)) {
            return false;
        }
        CaptureRequest.Key key = an2Var.c;
        CaptureRequest.Key key2 = this.c;
        return key2 == null ? key == null : key2.equals(key);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        CaptureRequest.Key key = this.c;
        return iHashCode ^ (key == null ? 0 : key.hashCode());
    }

    public final String toString() {
        return "Option{id=" + this.a + ", valueClass=" + this.b + ", token=" + this.c + "}";
    }
}
