package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lxfh;", "", "Lbu1;", "a", "Lbu1;", "appStats", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class xfh {

    /* renamed from: a, reason: from kotlin metadata */
    @NotNull
    @t2j("app")
    public final bu1 appStats;

    public xfh(bu1 bu1Var) {
        this.appStats = bu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xfh) && Intrinsics.a(this.appStats, ((xfh) obj).appStats);
    }

    public final int hashCode() {
        return this.appStats.hashCode();
    }

    public final String toString() {
        return "QualitySignals(appStats=" + this.appStats + ")";
    }
}
