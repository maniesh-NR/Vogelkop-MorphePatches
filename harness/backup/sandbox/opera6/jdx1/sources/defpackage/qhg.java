package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lqhg;", "", "", "a", "Ljava/lang/String;", "playStoreVersion", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class qhg {

    /* renamed from: a, reason: from kotlin metadata */
    @t2j("package_version")
    public String playStoreVersion;

    public qhg() {
        this(0);
    }

    public qhg(int i) {
        this.playStoreVersion = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qhg) && Intrinsics.a(this.playStoreVersion, ((qhg) obj).playStoreVersion);
    }

    public final int hashCode() {
        String str = this.playStoreVersion;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return sko.k("PlayStoreSignals(playStoreVersion=", this.playStoreVersion, ")");
    }
}
