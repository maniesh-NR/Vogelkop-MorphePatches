package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lxpi;", "", "", "a", "Ljava/lang/Boolean;", "isInstantApp", "b", "Z", "isPrivilegedProcess", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class xpi {

    /* renamed from: a, reason: from kotlin metadata */
    @t2j("instant_app")
    public Boolean isInstantApp;

    /* renamed from: b, reason: from kotlin metadata */
    @t2j("is_privileged_process")
    public boolean isPrivilegedProcess;

    public xpi() {
        this(0);
    }

    public xpi(int i) {
        this.isInstantApp = null;
        this.isPrivilegedProcess = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpi)) {
            return false;
        }
        xpi xpiVar = (xpi) obj;
        return Intrinsics.a(this.isInstantApp, xpiVar.isInstantApp) && this.isPrivilegedProcess == xpiVar.isPrivilegedProcess;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Boolean bool = this.isInstantApp;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        boolean z = this.isPrivilegedProcess;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final String toString() {
        return "SdkEnvironment(isInstantApp=" + this.isInstantApp + ", isPrivilegedProcess=" + this.isPrivilegedProcess + ")";
    }
}
