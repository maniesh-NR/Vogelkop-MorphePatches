package defpackage;

import android.content.Context;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hp4 implements k7j, q8j, lp4 {
    public final isd a;
    public qtm b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ ip4 e;

    public hp4(ip4 ip4Var, isd isdVar) {
        this.e = ip4Var;
        this.a = isdVar;
        ip4Var.l.b(this);
    }

    @Override // defpackage.q8j
    public final void a() {
        this.e.c();
    }

    @Override // defpackage.k7j
    public final void b() {
        this.c = true;
    }

    @Override // defpackage.q8j
    public final void c(Object obj) {
        qtm qtmVar = (qtm) obj;
        if (this.c) {
            return;
        }
        if (qtmVar == null) {
            e(null, false);
            return;
        }
        this.b = qtmVar;
        ip4 ip4Var = this.e;
        boolean z = ip4Var.o;
        if (g()) {
            f();
            if (!z) {
                return;
            }
        }
        s9i s9iVar = ip4Var.k;
        new mp4((Context) s9iVar.b, (ywh) s9iVar.c, this.b).Q(this);
    }

    @Override // defpackage.lp4
    public final void d(ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = arrayList;
        if (this.c) {
            return;
        }
        if (z && this.d) {
            return;
        }
        boolean z2 = false;
        yqe yqeVar = yqe.d;
        if (arrayList2 == null) {
            if (g()) {
                if (this.d) {
                    return;
                }
                f();
                return;
            } else {
                ArrayList arrayList3 = new ArrayList(1);
                arrayList3.add(yqeVar);
                qtm qtmVar = this.b;
                e(new fp4(qtmVar.a, qtmVar.b, qtmVar.c, qtmVar.d, arrayList3, arrayList3), false);
                return;
            }
        }
        qtm qtmVar2 = this.b;
        URL url = qtmVar2.a.a;
        ip4 ip4Var = this.e;
        ta7 ta7Var = ip4Var.j;
        ta7 ta7Var2 = ip4Var.j;
        ta7Var.s().edit().putLong("categories_features", qtmVar2.b).apply();
        ta7Var2.s().edit().putString("categories_config_bundle", this.b.c).apply();
        i16 i16Var = (i16) ta7Var2.b;
        i16Var.getClass();
        if (!arrayList2.isEmpty() && !arrayList2.contains(yqeVar)) {
            ArrayList arrayList4 = new ArrayList(arrayList2.size() + 1);
            arrayList4.add(yqeVar);
            arrayList4.addAll(arrayList2);
            arrayList2 = arrayList4;
        }
        ArrayList arrayListT = i16Var.t(false, false);
        ArrayList arrayListT2 = i16Var.t(false, true);
        ArrayList arrayList5 = new ArrayList(i16Var.t(true, false));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            int iIndexOf = arrayList5.indexOf(obj);
            if (iIndexOf != -1) {
                arrayList5.set(iIndexOf, obj);
            } else {
                arrayList5.add(cs5.t(arrayList2.indexOf(obj), 0, arrayList5.size()), obj);
            }
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList2);
        hashSet.addAll(arrayListT);
        ArrayList arrayList6 = new ArrayList(hashSet.size());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            yqe yqeVar2 = (yqe) it.next();
            arrayList6.add(new op4(yqeVar2, arrayList2.contains(yqeVar2), (arrayListT.contains(yqeVar2) ? !arrayListT2.contains(yqeVar2) : !yqeVar2.c) ? z2 : true, arrayList5.indexOf(yqeVar2)));
            z2 = false;
        }
        Collections.sort(arrayList6, new yg9((byte) 16));
        i16Var.c = arrayList6;
        ((i32) i16Var.b).g(arrayList6);
        ta7Var2.m = null;
        ta7Var2.h = null;
        ta7Var2.s().edit().putString("categories_host", ta7.q(url)).apply();
        qtm qtmVar3 = this.b;
        yla ylaVar = qtmVar3.a;
        long j = qtmVar3.b;
        String str = qtmVar3.c;
        String str2 = qtmVar3.d;
        ArrayList arrayListT3 = (ArrayList) ta7Var2.m;
        if (arrayListT3 == null) {
            arrayListT3 = ((i16) ta7Var2.b).t(true, false);
            ta7Var2.m = arrayListT3;
        }
        ArrayList arrayList7 = arrayListT3;
        ArrayList arrayListT4 = (ArrayList) ta7Var2.h;
        if (arrayListT4 == null) {
            arrayListT4 = ((i16) ta7Var2.b).t(true, true);
            ta7Var2.h = arrayListT4;
        }
        e(new fp4(ylaVar, j, str, str2, arrayList7, arrayListT4), true);
    }

    public final void e(fp4 fp4Var, boolean z) {
        if (this.c) {
            return;
        }
        ip4 ip4Var = this.e;
        ip4Var.o = false;
        if (this.d) {
            ip4Var.c();
        } else {
            this.d = true;
            this.a.E(fp4Var, z);
        }
    }

    public final void f() {
        qtm qtmVar = this.b;
        yla ylaVar = qtmVar.a;
        long j = qtmVar.b;
        String str = qtmVar.c;
        String str2 = qtmVar.d;
        ip4 ip4Var = this.e;
        ta7 ta7Var = ip4Var.j;
        ArrayList arrayListT = (ArrayList) ta7Var.m;
        if (arrayListT == null) {
            arrayListT = ((i16) ta7Var.b).t(true, false);
            ta7Var.m = arrayListT;
        }
        ta7 ta7Var2 = ip4Var.j;
        ArrayList arrayListT2 = (ArrayList) ta7Var2.h;
        if (arrayListT2 == null) {
            arrayListT2 = ((i16) ta7Var2.b).t(true, true);
            ta7Var2.h = arrayListT2;
        }
        e(new fp4(ylaVar, j, str, str2, arrayListT, arrayListT2), true);
    }

    public final boolean g() {
        long j;
        ip4 ip4Var = this.e;
        ta7 ta7Var = ip4Var.j;
        ta7 ta7Var2 = ip4Var.j;
        ArrayList arrayListT = (ArrayList) ta7Var.m;
        if (arrayListT == null) {
            arrayListT = ((i16) ta7Var.b).t(true, false);
            ta7Var.m = arrayListT;
        }
        if (!arrayListT.isEmpty()) {
            ta7Var2.getClass();
            try {
                j = ta7Var2.s().getLong("categories_features", 0L);
            } catch (ClassCastException unused) {
                j = ta7Var2.s().getInt("categories_features", 0);
            }
            if (j == this.b.b && Objects.equals(ta7Var2.s().getString("categories_config_bundle", null), this.b.c)) {
                URL url = this.b.a.a;
                String string = ta7Var2.s().getString("categories_host", null);
                if (string == null ? true : string.equals(ta7.q(url))) {
                    return true;
                }
            }
        }
        return false;
    }
}
