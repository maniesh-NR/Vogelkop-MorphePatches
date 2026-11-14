package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Le77;", "", "Lmc3;", "a", "Lmc3;", "batterySignals", "Lpy3;", "b", "Lpy3;", "browserSignals", "Ldtd;", "c", "Ldtd;", "memorySignals", "Lh77;", "d", "Lh77;", "deviceTierSignals", "Lsoe;", "e", "Lsoe;", "networkSignals", "Lqhg;", "f", "Lqhg;", "playStoreSignals", "", "g", "Ljava/lang/String;", "buildName", "", "h", "Ljava/lang/Long;", "remainingDataPartitionSpaceKilobytes", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class e77 {

    /* renamed from: a, reason: from kotlin metadata */
    @NotNull
    @t2j("battery")
    public final mc3 batterySignals;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    @t2j("browser")
    public final py3 browserSignals;

    /* renamed from: c, reason: from kotlin metadata */
    @NotNull
    @t2j("android_mem_info")
    public dtd memorySignals;

    /* renamed from: d, reason: from kotlin metadata */
    @NotNull
    @t2j("device_tier")
    public final h77 deviceTierSignals;

    /* renamed from: e, reason: from kotlin metadata */
    @NotNull
    @t2j("network")
    public final soe networkSignals;

    /* renamed from: f, reason: from kotlin metadata */
    @NotNull
    @t2j("play_store")
    public final qhg playStoreSignals;

    /* renamed from: g, reason: from kotlin metadata */
    @t2j("build")
    public String buildName;

    /* renamed from: h, reason: from kotlin metadata */
    @t2j("remaining_data_partition_space")
    public Long remainingDataPartitionSpaceKilobytes;

    public e77() {
        this(0);
    }

    public e77(int i) {
        mc3 mc3Var = new mc3(0);
        py3 py3Var = new py3(0);
        dtd dtdVar = new dtd(0);
        h77 h77Var = new h77(0);
        soe soeVar = new soe(0);
        qhg qhgVar = new qhg(0);
        this.batterySignals = mc3Var;
        this.browserSignals = py3Var;
        this.memorySignals = dtdVar;
        this.deviceTierSignals = h77Var;
        this.networkSignals = soeVar;
        this.playStoreSignals = qhgVar;
        this.buildName = null;
        this.remainingDataPartitionSpaceKilobytes = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e77)) {
            return false;
        }
        e77 e77Var = (e77) obj;
        return Intrinsics.a(this.batterySignals, e77Var.batterySignals) && Intrinsics.a(this.browserSignals, e77Var.browserSignals) && Intrinsics.a(this.memorySignals, e77Var.memorySignals) && Intrinsics.a(this.deviceTierSignals, e77Var.deviceTierSignals) && Intrinsics.a(this.networkSignals, e77Var.networkSignals) && Intrinsics.a(this.playStoreSignals, e77Var.playStoreSignals) && Intrinsics.a(this.buildName, e77Var.buildName) && Intrinsics.a(this.remainingDataPartitionSpaceKilobytes, e77Var.remainingDataPartitionSpaceKilobytes);
    }

    public final int hashCode() {
        int iHashCode = (this.playStoreSignals.hashCode() + ((this.networkSignals.hashCode() + ((this.deviceTierSignals.hashCode() + ((this.memorySignals.hashCode() + ((this.browserSignals.hashCode() + (this.batterySignals.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.buildName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.remainingDataPartitionSpaceKilobytes;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceSignals(batterySignals=" + this.batterySignals + ", browserSignals=" + this.browserSignals + ", memorySignals=" + this.memorySignals + ", deviceTierSignals=" + this.deviceTierSignals + ", networkSignals=" + this.networkSignals + ", playStoreSignals=" + this.playStoreSignals + ", buildName=" + this.buildName + ", remainingDataPartitionSpaceKilobytes=" + this.remainingDataPartitionSpaceKilobytes + ")";
    }
}
