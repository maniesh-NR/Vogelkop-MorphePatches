package defpackage;

import android.content.Context;
import android.print.PageRange;

/* loaded from: classes.dex */
public final class hii extends nji {
    public final /* synthetic */ byte a;
    public final Object b;
    public final /* synthetic */ ndc c;

    public /* synthetic */ hii(ndc ndcVar, Object obj, byte b) {
        this.a = b;
        this.c = ndcVar;
        this.b = obj;
    }

    @Override // defpackage.nji
    public final void b() {
        switch (this.a) {
            case 1:
                pii piiVar = this.c;
                piiVar.M = true;
                piiVar.J0();
                if (piiVar.G.a()) {
                    piiVar.L0();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.nji
    public final void c(int i) {
        PageRange[] pageRangeArr;
        byte b = this.a;
        Object obj = this.b;
        ndc ndcVar = this.c;
        switch (b) {
            case 0:
                iii iiiVar = (iii) ndcVar;
                if (i == 2 && (pageRangeArr = iiiVar.E.p) != null && ((r9g) obj).test(pageRangeArr)) {
                    long j = iiiVar.E.o;
                    if (j != 0) {
                        iiiVar.z.c = j;
                        iiiVar.W();
                        iiiVar.Z();
                        iiiVar.E.e(this);
                        iiiVar.G = null;
                        break;
                    }
                }
                break;
            default:
                pii piiVar = (pii) ndcVar;
                if (i == 0) {
                    piiVar.J0();
                } else if (i == 1) {
                    piiVar.M = false;
                    piiVar.J0();
                } else if (i == 2) {
                    piiVar.M = false;
                    if (piiVar.J == null && !piiVar.L) {
                        piiVar.H0((Context) obj);
                        break;
                    }
                } else if (i == 3) {
                    piiVar.M = false;
                }
                if (piiVar.G.a()) {
                    piiVar.O0(i);
                    break;
                }
                break;
        }
    }
}
