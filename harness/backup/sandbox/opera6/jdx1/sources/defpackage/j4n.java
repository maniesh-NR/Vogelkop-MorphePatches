package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lj4n;", "", "", "a", "Z", "startMuted", "b", "clickToExpandRequested", "c", "customControlsRequested", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class j4n {

    /* renamed from: a, reason: from kotlin metadata */
    @t2j("startMuted")
    public boolean startMuted;

    /* renamed from: b, reason: from kotlin metadata */
    @t2j("clickToExpandRequested")
    public boolean clickToExpandRequested;

    /* renamed from: c, reason: from kotlin metadata */
    @t2j("customControlsRequested")
    public boolean customControlsRequested;

    public j4n() {
        this(true, false, false);
    }

    public j4n(boolean z, boolean z2, boolean z3) {
        this.startMuted = z;
        this.clickToExpandRequested = z2;
        this.customControlsRequested = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4n)) {
            return false;
        }
        j4n j4nVar = (j4n) obj;
        return this.startMuted == j4nVar.startMuted && this.clickToExpandRequested == j4nVar.clickToExpandRequested && this.customControlsRequested == j4nVar.customControlsRequested;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public final int hashCode() {
        boolean z = this.startMuted;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.clickToExpandRequested;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        boolean z2 = this.customControlsRequested;
        return i3 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final String toString() {
        boolean z = this.startMuted;
        boolean z2 = this.clickToExpandRequested;
        boolean z3 = this.customControlsRequested;
        StringBuilder sb = new StringBuilder("VideoOptionsSignal(startMuted=");
        sb.append(z);
        sb.append(", clickToExpandRequested=");
        sb.append(z2);
        sb.append(", customControlsRequested=");
        return z1m.m(sb, z3, ")");
    }
}
