package defpackage;

import ads_mobile_sdk.am2;
import ads_mobile_sdk.h6;
import ads_mobile_sdk.iu0;
import ads_mobile_sdk.j;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class r1p extends iu0 {
    public final void b(long j) {
        b$1();
        h6 h6Var = (h6) this.b;
        h6Var.bitField0_ |= 1;
        h6Var.lastAccessTimeMs_ = j;
    }

    public final void c(List list) {
        b$1();
        h6 h6Var = (h6) this.b;
        flp flpVar = h6Var.responses_;
        if (!((j) flpVar).a) {
            h6Var.responses_ = y7h.c(flpVar);
        }
        iu0.a(list, h6Var.responses_);
    }

    public final void e() {
        b$1();
        h6 h6Var = (h6) this.b;
        h6Var.getClass();
        h6Var.responses_ = am2.e;
    }

    public final List f() {
        return Collections.unmodifiableList(((h6) this.b).responses_);
    }
}
