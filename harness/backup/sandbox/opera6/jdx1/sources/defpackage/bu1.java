package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lbu1;", "", "", "a", "Ljava/lang/String;", "sequenceNumber", "", "b", "I", "priorRequestCount", "c", "priorRequestInSessionCount", "", "d", "J", "timeInSessionMilliseconds", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class bu1 {

    /* renamed from: a, reason: from kotlin metadata */
    @NotNull
    @t2j("seq_num")
    public final String sequenceNumber;

    /* renamed from: b, reason: from kotlin metadata */
    @t2j("preqs")
    public final int priorRequestCount;

    /* renamed from: c, reason: from kotlin metadata */
    @t2j("preqs_in_session")
    public final int priorRequestInSessionCount;

    /* renamed from: d, reason: from kotlin metadata */
    @t2j("time_in_session")
    public final long timeInSessionMilliseconds;

    public bu1(String str, int i, int i2, long j) {
        this.sequenceNumber = str;
        this.priorRequestCount = i;
        this.priorRequestInSessionCount = i2;
        this.timeInSessionMilliseconds = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu1)) {
            return false;
        }
        bu1 bu1Var = (bu1) obj;
        return Intrinsics.a(this.sequenceNumber, bu1Var.sequenceNumber) && this.priorRequestCount == bu1Var.priorRequestCount && this.priorRequestInSessionCount == bu1Var.priorRequestInSessionCount && this.timeInSessionMilliseconds == bu1Var.timeInSessionMilliseconds;
    }

    public final int hashCode() {
        return Long.hashCode(this.timeInSessionMilliseconds) + n6h.a(this.priorRequestInSessionCount, n6h.a(this.priorRequestCount, this.sequenceNumber.hashCode() * 31));
    }

    public final String toString() {
        String str = this.sequenceNumber;
        int i = this.priorRequestCount;
        int i2 = this.priorRequestInSessionCount;
        long j = this.timeInSessionMilliseconds;
        StringBuilder sbP = sko.p(i, "AppStats(sequenceNumber=", str, ", priorRequestCount=", ", priorRequestInSessionCount=");
        sbP.append(i2);
        sbP.append(", timeInSessionMilliseconds=");
        sbP.append(j);
        sbP.append(")");
        return sbP.toString();
    }
}
