package ads_mobile_sdk;

import defpackage.jjj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ig3 implements zcp {
    public final Integer a;
    public final String b;

    public /* synthetic */ ig3(int i, Integer num) {
        this((i & 1) != 0 ? null : num, (String) null);
    }

    public ig3(Integer num, String str) {
        this.a = num;
        this.b = str;
    }

    public final void a(jjj jjjVar) {
        jjjVar.topics = this.b;
        jjjVar.topicsApiStatus = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig3)) {
            return false;
        }
        ig3 ig3Var = (ig3) obj;
        return Intrinsics.a(this.a, ig3Var.a) && Intrinsics.a(this.b, ig3Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TopicsSignal(topicsApiStatus=" + this.a + ", topics=" + this.b + ")";
    }
}
