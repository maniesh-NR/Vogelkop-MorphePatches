package defpackage;

/* loaded from: classes.dex */
public final class hx9 {
    public final boolean a;

    public hx9(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof hx9) && this.a == ((hx9) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) - 1244118056;
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=com.google.android.libraries.ads.mobile.sdk, shouldRecordObservation=" + this.a;
    }
}
