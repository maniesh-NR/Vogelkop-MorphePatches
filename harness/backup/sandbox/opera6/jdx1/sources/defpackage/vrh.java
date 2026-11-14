package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class vrh extends rnd implements trh {
    public final String f;
    public final tnd g;
    public String h;
    public String i;
    public boolean j;
    public int l;
    public srh m;
    public final /* synthetic */ xrh o;
    public int k = -1;
    public int n = -1;

    public vrh(xrh xrhVar, String str, tnd tndVar) {
        this.o = xrhVar;
        this.f = str;
        this.g = tndVar;
    }

    public final void a(srh srhVar) {
        urh urhVar = new urh(this);
        this.m = srhVar;
        int i = srhVar.e;
        srhVar.e = i + 1;
        int i2 = srhVar.d;
        srhVar.d = i2 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f);
        bundle.putParcelable("routeControllerOptions", this.g.a);
        srhVar.b(11, i2, i, null, bundle);
        srhVar.h.put(i2, urhVar);
        this.n = i;
        if (this.j) {
            srhVar.a(i);
            int i3 = this.k;
            if (i3 >= 0) {
                srhVar.c(this.n, i3);
                this.k = -1;
            }
            int i4 = this.l;
            if (i4 != 0) {
                srhVar.d(this.n, i4);
                this.l = 0;
            }
        }
    }

    public final int b() {
        return this.n;
    }

    public final void c() {
        srh srhVar = this.m;
        if (srhVar != null) {
            int i = this.n;
            int i2 = srhVar.d;
            srhVar.d = i2 + 1;
            srhVar.b(4, i2, i, null, null);
            this.m = null;
            this.n = 0;
        }
    }

    @Override // defpackage.snd
    public final void d() {
        xrh xrhVar = this.o;
        xrhVar.k.remove(this);
        c();
        xrhVar.l();
    }

    @Override // defpackage.snd
    public final void e() {
        this.j = true;
        srh srhVar = this.m;
        if (srhVar != null) {
            srhVar.a(this.n);
        }
    }

    @Override // defpackage.snd
    public final void f(int i) {
        srh srhVar = this.m;
        if (srhVar != null) {
            srhVar.c(this.n, i);
        } else {
            this.k = i;
            this.l = 0;
        }
    }

    @Override // defpackage.snd
    public final void g() {
        h(0);
    }

    @Override // defpackage.snd
    public final void h(int i) {
        this.j = false;
        srh srhVar = this.m;
        if (srhVar != null) {
            int i2 = this.n;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i);
            int i3 = srhVar.d;
            srhVar.d = i3 + 1;
            srhVar.b(6, i3, i2, null, bundle);
        }
    }

    @Override // defpackage.snd
    public final void i(int i) {
        srh srhVar = this.m;
        if (srhVar != null) {
            srhVar.d(this.n, i);
        } else {
            this.l += i;
        }
    }

    @Override // defpackage.rnd
    public final String j() {
        return this.h;
    }

    @Override // defpackage.rnd
    public final String k() {
        return this.i;
    }

    @Override // defpackage.rnd
    public final void m(String str) {
        srh srhVar = this.m;
        if (srhVar != null) {
            int i = this.n;
            srhVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = srhVar.d;
            srhVar.d = i2 + 1;
            srhVar.b(12, i2, i, null, bundle);
        }
    }

    @Override // defpackage.rnd
    public final void n(String str) {
        srh srhVar = this.m;
        if (srhVar != null) {
            int i = this.n;
            srhVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = srhVar.d;
            srhVar.d = i2 + 1;
            srhVar.b(13, i2, i, null, bundle);
        }
    }

    @Override // defpackage.rnd
    public final void o(ArrayList arrayList) {
        srh srhVar = this.m;
        if (srhVar != null) {
            int i = this.n;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(arrayList));
            int i2 = srhVar.d;
            srhVar.d = i2 + 1;
            srhVar.b(14, i2, i, null, bundle);
        }
    }
}
