package defpackage;

import android.net.Uri;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lzo {
    public final a3p a;
    public final yjo b;
    public final String c;
    public final String d;
    public final ng2 e;

    public lzo(a3p a3pVar, yjo yjoVar, String str, String str2) {
        this.a = a3pVar;
        this.b = yjoVar;
        this.c = str;
        this.d = str2;
        ng2 ng2Var = new ng2((byte) 8);
        ng2Var.b = (byte) 0;
        this.e = ng2Var;
    }

    public final void a() {
        a3p a3pVar = this.a;
        a3pVar.g("window.operaBridge.notifyOnDestroy()");
        a3pVar.j = null;
        t5p t5pVar = d1p.a;
        d1p.d.remove(a3pVar.e0);
        j2p j2pVar = a3pVar.o;
        if (j2pVar != null) {
            j2pVar.a(4000L);
        }
        a3pVar.o = null;
        j2p j2pVar2 = a3pVar.p;
        if (j2pVar2 != null) {
            j2pVar2.a(4000L);
        }
        a3pVar.p = null;
        this.e.b = (byte) 5;
    }

    public final void b() {
        ng2 ng2Var = this.e;
        byte b = ng2Var.b;
        if (b == 2 || b == 3) {
            a3p a3pVar = this.a;
            j2p j2pVar = a3pVar.o;
            if (j2pVar != null) {
                Objects.toString(j2pVar);
                Objects.toString(a3pVar.v);
                ito[] itoVarArr = ito.a;
                if (a3pVar.v != n2p.EXPANDED) {
                    j2pVar.onPause();
                }
            }
            ng2Var.b = (byte) 4;
        }
    }

    public final void c() {
        ng2 ng2Var = this.e;
        if (ng2Var.b == 0) {
            ng2Var.b = (byte) 1;
            a3p a3pVar = this.a;
            String str = this.c;
            String str2 = this.d;
            a3pVar.b0 = str;
            a3pVar.c0 = str2;
            yjo yjoVar = this.b;
            Intrinsics.a(yjoVar.c.getAbsolutePath(), a3pVar.a.getAbsolutePath());
            Uri uriBuild = new Uri.Builder().scheme("https").authority("appassets.androidplatform.net").path(a3pVar.l).appendPath(yjoVar.a).build();
            a3pVar.F = uriBuild;
            p7p p7pVar = a3pVar.g;
            if (p7pVar != null) {
                voo vooVar = p7pVar.a;
                ylp ylpVar = vooVar instanceof ylp ? (ylp) vooVar : null;
                if (ylpVar != null) {
                    p7p.e(new cap(ylpVar.c, ylpVar.b.a, ylpVar.j, ylpVar.l, d1p.e().a(), Boolean.valueOf(d1p.e().c)), null, p7pVar.b);
                }
            }
            a3pVar.o.loadUrl(uriBuild.toString());
        }
    }

    public final void d() {
        ng2 ng2Var = this.e;
        if (ng2Var.b == 1) {
            ng2Var.b = (byte) 2;
            a3p a3pVar = this.a;
            a3pVar.setVisibility(0);
            a3pVar.I = true;
            a3pVar.b();
        }
    }
}
