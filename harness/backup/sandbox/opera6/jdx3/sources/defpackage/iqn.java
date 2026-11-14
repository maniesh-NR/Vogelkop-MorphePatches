package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class iqn implements v5n {
    public final /* synthetic */ mqn a;
    public final /* synthetic */ mrn b;

    public iqn(mqn mqnVar, mrn mrnVar) {
        this.a = mqnVar;
        this.b = mrnVar;
    }

    @Override // defpackage.v5n
    public final void a(long j, String str, Uri uri) {
        mqn mqnVar = this.a;
        vsn vsnVar = mqnVar.w;
        if (ju4.a(j, vsnVar.c.d().g())) {
            this.b.i(str);
            mqnVar.H0(str);
            vsnVar.a(uri);
        }
    }

    @Override // defpackage.v5n
    public final void b(long j, String str) {
        mqn mqnVar = this.a;
        vsn vsnVar = mqnVar.w;
        if (ju4.a(j, vsnVar.c.d().g())) {
            this.b.i(str);
            mqnVar.H0(str);
            vsnVar.h(ux1.c, false, new tu(mqnVar, (byte) 14));
        }
    }

    @Override // defpackage.v5n
    public final void c(long j, String str) {
        mqn mqnVar = this.a;
        vsn vsnVar = mqnVar.w;
        if (ju4.a(j, vsnVar.c.d().g())) {
            this.b.i(str);
            mqnVar.H0(str);
            vsnVar.i(ux1.c);
        }
    }

    @Override // defpackage.v5n
    public final void d(String str) {
        this.b.i(str);
    }
}
