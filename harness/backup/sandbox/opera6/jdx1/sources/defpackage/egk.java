package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class egk implements s3j {
    public final /* synthetic */ fgk a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ qsm d;
    public final /* synthetic */ to2 e;
    public final /* synthetic */ to2 f;

    public /* synthetic */ egk(fgk fgkVar, String str, String str2, qsm qsmVar, to2 to2Var, to2 to2Var2) {
        this.a = fgkVar;
        this.b = str;
        this.c = str2;
        this.d = qsmVar;
        this.e = to2Var;
        this.f = to2Var2;
    }

    @Override // defpackage.s3j
    public final void a(u3j u3jVar) {
        fgk fgkVar = this.a;
        if (fgkVar.e() != null) {
            fgkVar.I();
            fgkVar.G(fgkVar.J(this.b, this.c, this.d, this.e, this.f));
            fgkVar.r();
            jan janVar = fgkVar.t;
            janVar.getClass();
            xug.i();
            Iterator it = janVar.a.iterator();
            while (it.hasNext()) {
                janVar.c((qrm) it.next());
            }
        }
    }
}
