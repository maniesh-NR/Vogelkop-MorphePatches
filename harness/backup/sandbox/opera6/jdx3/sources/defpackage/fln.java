package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class fln extends hln {
    public final String b;
    public final int c;
    public final g7j d;
    public final zg e;
    public final zg f;
    public final boolean g;

    public fln(orb orbVar, String str, int i, g7j g7jVar, zg zgVar, zg zgVar2, boolean z) {
        super(orbVar);
        this.b = str;
        this.c = i;
        this.d = g7jVar;
        this.e = zgVar;
        this.f = zgVar2;
        this.g = z;
    }

    public static zg l(orb orbVar, h06 h06Var) {
        String strM = orbVar.m("preview_image_url", "");
        int iK = hln.k(orbVar.e("image_color"));
        g40 g40Var = new g40(orbVar.e("image_url"), (byte) 4);
        g40 g40Var2 = strM.isEmpty() ? null : new g40(strM, (byte) 4);
        h06 h06VarI = hln.i(orbVar, h06Var);
        zg zgVar = new zg();
        zgVar.a = iK;
        zgVar.b = g40Var;
        zgVar.c = g40Var2;
        zgVar.d = h06VarI;
        return zgVar;
    }

    @Override // defpackage.aln
    public final boolean a() {
        return this.f != null;
    }

    @Override // defpackage.aln
    public final g7j b() {
        return this.d;
    }

    @Override // defpackage.aln
    public final xkn c(Context context, o2c o2cVar) {
        g40 g40Var;
        zg zgVar = j(context, o2cVar) ? this.f : this.e;
        if (!o2cVar.c || (g40Var = (g40) zgVar.c) == null) {
            g40Var = (g40) zgVar.b;
        }
        String str = g40Var.b;
        int i = zgVar.a;
        boolean z = !p37.u0(i);
        return new xkn(this, str, i, i, i, z, z, z);
    }

    @Override // defpackage.aln
    public final boolean e() {
        return this.g;
    }

    @Override // defpackage.aln
    public final int f() {
        return this.c;
    }

    @Override // defpackage.aln
    public final h06 g(Context context, o2c o2cVar) {
        return (h06) (j(context, o2cVar) ? this.f : this.e).d;
    }

    @Override // defpackage.aln
    public final String getId() {
        return this.b;
    }

    @Override // defpackage.aln
    public final int getType() {
        return 2;
    }
}
