package defpackage;

import android.print.PageRange;
import java.util.Objects;

/* loaded from: classes.dex */
public final class dii extends hji {
    public boolean a;
    public final /* synthetic */ dx3 b;
    public final /* synthetic */ qji c;
    public final /* synthetic */ PageRange[] d;
    public final /* synthetic */ wjh e;
    public final /* synthetic */ pii f;

    public dii(pii piiVar, dx3 dx3Var, qji qjiVar, PageRange[] pageRangeArr, wjh wjhVar) {
        this.b = dx3Var;
        this.c = qjiVar;
        this.d = pageRangeArr;
        this.e = wjhVar;
        Objects.requireNonNull(piiVar);
        this.f = piiVar;
        this.a = true;
    }

    @Override // defpackage.cej
    public final dej createSheet(mej mejVar, b2l b2lVar) {
        this.a = false;
        pii piiVar = this.f;
        umi umiVar = piiVar.s;
        PageRange[] pageRangeArr = this.d;
        return new iii(mejVar, this.b, umiVar, this.c, pageRangeArr, new r9g(pageRangeArr, (byte) 25), this.e, piiVar.t);
    }

    @Override // defpackage.cej
    public final void onFinished(hjm hjmVar) {
        if (this.a) {
            this.c.b();
        }
    }
}
