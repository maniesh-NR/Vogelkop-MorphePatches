package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y31 {
    public final Integer a;
    public final Integer b;
    public final Integer c;

    public y31(Integer num, Integer num2, Integer num3) {
        this.a = num;
        this.b = num2;
        this.c = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y31)) {
            return false;
        }
        y31 y31Var = (y31) obj;
        return this.a.equals(y31Var.a) && Intrinsics.a(this.b, y31Var.b) && Intrinsics.a(this.c, y31Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "ImpressionSequences(impressionSequence=" + this.a + ", formatImpressionSequence=" + this.b + ", slotFormatImpressionSequence=" + this.c + ")";
    }
}
