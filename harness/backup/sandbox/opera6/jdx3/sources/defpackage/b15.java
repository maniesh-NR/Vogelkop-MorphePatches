package defpackage;

import android.content.Context;
import android.net.Uri;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b15 implements k7j, q8j {
    public final isd a;
    public fp4 b;
    public z05 c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ c15 f;

    public b15(c15 c15Var, isd isdVar) {
        this.f = c15Var;
        this.a = isdVar;
        c15Var.l.b(this);
    }

    @Override // defpackage.q8j
    public final void a() {
        this.f.c();
    }

    @Override // defpackage.k7j
    public final void b() {
        this.d = true;
    }

    @Override // defpackage.q8j
    public final void c(Object obj) {
        fp4 fp4Var = (fp4) obj;
        if (this.d) {
            return;
        }
        if (fp4Var == null) {
            d(null, false);
            return;
        }
        this.b = fp4Var;
        c15 c15Var = this.f;
        boolean z = c15Var.o;
        if (c15Var.j.v(fp4Var)) {
            e(this.b);
            if (!z) {
                return;
            }
        }
        fp4 fp4Var2 = this.b;
        boolean z2 = fp4Var2.g;
        yla ylaVar = fp4Var2.a;
        if (z2 && ylaVar.e != null) {
            s9i s9iVar = c15Var.k;
            vw9 vw9Var = new vw9((Context) s9iVar.b, (ga6) s9iVar.c, fp4Var2);
            Uri.Builder builderC = vw9Var.c();
            builderC.appendEncodedPath("city/locate");
            vw9Var.e.a(new z7(builderC.build().toString(), "", (byte) 1), new k82(vw9Var, this, (byte) 3));
            return;
        }
        ta7 ta7Var = c15Var.j;
        long j = fp4Var2.b;
        String str = fp4Var2.c;
        URL url = ylaVar.a;
        List list = Collections.EMPTY_LIST;
        ta7Var.z(j, str, url, list, null, false);
        fp4 fp4Var3 = this.b;
        d(new z05(fp4Var3.a, fp4Var3.b, fp4Var3.c, fp4Var3.d, fp4Var3.e, fp4Var3.f, list, -1, false, false), true);
    }

    public final void d(z05 z05Var, boolean z) {
        if (this.d) {
            return;
        }
        if (this.e && Objects.equals(z05Var, this.c)) {
            return;
        }
        c15 c15Var = this.f;
        boolean z2 = false;
        c15Var.o = false;
        ta7 ta7Var = c15Var.j;
        this.c = z05Var;
        if (z05Var != null) {
            i3j i3jVar = c15Var.m;
            bre breVarT = ta7Var.t();
            boolean zU = ta7Var.u();
            ta7 ta7Var2 = (ta7) i3jVar.a;
            l0c l0cVar = z05Var.a.e;
            if (l0cVar != null && z05Var.d != null) {
                if (!c15.g(z05Var, breVarT, zU)) {
                    breVarT = null;
                }
                String str = l0cVar.a;
                String str2 = l0cVar.b;
                i3jVar.c = new cre(breVarT, zU, str, str2);
                i3jVar.d = z05Var;
                cre creVarO = ta7Var2.o(str, str2);
                bre breVar = creVarO != null ? creVarO.a : null;
                if (breVarT == null ? breVar == null : breVarT.equals(breVar)) {
                    if (creVarO != null && creVarO.b) {
                        z2 = true;
                    }
                    if (breVarT != null && zU != z2) {
                        ta7Var2.F((cre) i3jVar.c, zU);
                    }
                } else {
                    i3jVar.H(zU, true);
                }
            }
        }
        if (this.e) {
            c15Var.c();
        } else {
            this.e = true;
            this.a.E(z05Var, z);
        }
    }

    public final void e(fp4 fp4Var) {
        c15 c15Var = this.f;
        List listN = c15Var.j.n();
        ta7 ta7Var = c15Var.j;
        bre breVarT = ta7Var.t();
        d(new z05(fp4Var.a, fp4Var.b, fp4Var.c, fp4Var.d, fp4Var.e, fp4Var.f, listN, listN.indexOf(breVarT), ta7Var.u(), c15.g(fp4Var, breVarT, ta7Var.u())), true);
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        if (this.d) {
            return;
        }
        if (z && this.e) {
            return;
        }
        fp4 fp4Var = this.b;
        if (fp4Var == null || fp4Var.a.e == null) {
            d(null, false);
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        if (arrayList2 != null) {
            arrayList3.addAll(arrayList2);
        }
        boolean zIsEmpty = arrayList3.isEmpty();
        c15 c15Var = this.f;
        if (zIsEmpty) {
            if (!c15Var.j.v(this.b)) {
                fp4 fp4Var2 = this.b;
                d(new z05(fp4Var2.a, fp4Var2.b, fp4Var2.c, fp4Var2.d, fp4Var2.e, fp4Var2.f, Collections.EMPTY_LIST, -1, false, false), false);
                return;
            } else {
                if (this.e) {
                    return;
                }
                e(this.b);
                return;
            }
        }
        ta7 ta7Var = c15Var.j;
        ta7 ta7Var2 = c15Var.j;
        l0c l0cVar = this.b.a.e;
        cre creVarO = ta7Var.o(l0cVar.a, l0cVar.b);
        boolean z2 = creVarO != null && creVarO.b;
        bre breVar = z2 ? creVarO.a : null;
        if (breVar == null && !arrayList3.isEmpty()) {
            breVar = (bre) arrayList3.get(0);
        }
        ta7 ta7Var3 = c15Var.j;
        fp4 fp4Var3 = this.b;
        ta7Var3.z(fp4Var3.b, fp4Var3.c, fp4Var3.a.a, arrayList3, breVar, z2);
        List listN = ta7Var2.n();
        bre breVarT = ta7Var2.t();
        fp4 fp4Var4 = this.b;
        d(new z05(fp4Var4.a, fp4Var4.b, fp4Var4.c, fp4Var4.d, fp4Var4.e, fp4Var4.f, listN, listN.indexOf(breVarT), z2, c15.g(this.b, breVarT, ta7Var2.u())), true);
    }
}
