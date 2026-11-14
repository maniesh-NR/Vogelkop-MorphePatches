package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class wrh extends snd implements trh {
    public final String a;
    public final String b;
    public final tnd c;
    public boolean d;
    public int e = -1;
    public int f;
    public srh g;
    public int h;
    public final /* synthetic */ xrh i;

    public wrh(xrh xrhVar, String str, String str2, tnd tndVar) {
        this.i = xrhVar;
        this.a = str;
        this.b = str2;
        this.c = tndVar;
    }

    public final void a(srh srhVar) {
        this.g = srhVar;
        int i = srhVar.e;
        srhVar.e = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        bundle.putParcelable("routeControllerOptions", this.c.a);
        int i2 = srhVar.d;
        srhVar.d = i2 + 1;
        srhVar.b(3, i2, i, null, bundle);
        this.h = i;
        if (this.d) {
            srhVar.a(i);
            int i3 = this.e;
            if (i3 >= 0) {
                srhVar.c(this.h, i3);
                this.e = -1;
            }
            int i4 = this.f;
            if (i4 != 0) {
                srhVar.d(this.h, i4);
                this.f = 0;
            }
        }
    }

    public final int b() {
        return this.h;
    }

    public final void c() {
        srh srhVar = this.g;
        if (srhVar != null) {
            int i = this.h;
            int i2 = srhVar.d;
            srhVar.d = i2 + 1;
            srhVar.b(4, i2, i, null, null);
            this.g = null;
            this.h = 0;
        }
    }

    @Override // defpackage.snd
    public final void d() {
        xrh xrhVar = this.i;
        xrhVar.k.remove(this);
        c();
        xrhVar.l();
    }

    @Override // defpackage.snd
    public final void e() {
        this.d = true;
        srh srhVar = this.g;
        if (srhVar != null) {
            srhVar.a(this.h);
        }
    }

    @Override // defpackage.snd
    public final void f(int i) {
        srh srhVar = this.g;
        if (srhVar != null) {
            srhVar.c(this.h, i);
        } else {
            this.e = i;
            this.f = 0;
        }
    }

    @Override // defpackage.snd
    public final void g() {
        h(0);
    }

    @Override // defpackage.snd
    public final void h(int i) {
        this.d = false;
        srh srhVar = this.g;
        if (srhVar != null) {
            int i2 = this.h;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i);
            int i3 = srhVar.d;
            srhVar.d = i3 + 1;
            srhVar.b(6, i3, i2, null, bundle);
        }
    }

    @Override // defpackage.snd
    public final void i(int i) {
        srh srhVar = this.g;
        if (srhVar != null) {
            srhVar.d(this.h, i);
        } else {
            this.f += i;
        }
    }
}
