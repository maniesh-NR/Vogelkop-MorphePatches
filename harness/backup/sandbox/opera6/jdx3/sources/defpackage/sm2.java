package defpackage;

import com.leanplum.messagetemplates.MessageTemplateConstants;

/* loaded from: classes.dex */
public final class sm2 {
    public final int a;
    public final long b;
    public final String c;

    public sm2(int i, long j, String str) {
        if (i == 0) {
            t3p.q("Null status");
            throw null;
        }
        this.a = i;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sm2)) {
            return false;
        }
        sm2 sm2Var = (sm2) obj;
        if (!vep.e(this.a, sm2Var.a) || this.b != sm2Var.b) {
            return false;
        }
        String str = sm2Var.c;
        String str2 = this.c;
        return str2 == null ? str == null : str2.equals(str);
    }

    public final int hashCode() {
        int iA = (vep.A(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        int i = (iA ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        String str = this.c;
        return i ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : MessageTemplateConstants.Values.OK_TEXT);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.b);
        sb.append(", updatedPseudonymousId=");
        return z1m.l(sb, this.c, "}");
    }
}
