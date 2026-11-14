package defpackage;

import android.R;

/* loaded from: classes.dex */
public final class vr8 {
    public static final vr8 l = new vr8(new dxh(R.attr.textColorSecondary), laj.e, new fxh(R.color.transparent), new dxh(2130969727), new dxh(2130969724), new dxh(R.attr.textColorPrimary), new dxh(2130970698), new dxh(2130970698), new dxh(2130969288), new fxh(2131099930), 2);
    public final cxh a;
    public final laj b;
    public final fxh c;
    public final cxh d;
    public final cxh e;
    public final cxh f;
    public final cxh g;
    public final cxh h;
    public final cxh i;
    public final fxh j;
    public final byte k;

    /* JADX WARN: Multi-variable type inference failed */
    public vr8(cxh cxhVar, laj lajVar, fxh fxhVar, cxh cxhVar2, cxh cxhVar3, cxh cxhVar4, cxh cxhVar5, cxh cxhVar6, cxh cxhVar7, fxh fxhVar2, int i) {
        this.a = cxhVar;
        this.b = lajVar;
        this.c = fxhVar;
        this.d = cxhVar2;
        this.e = cxhVar3;
        this.f = cxhVar4;
        this.g = cxhVar5;
        this.h = cxhVar6;
        this.i = cxhVar7;
        this.j = fxhVar2;
        this.k = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr8)) {
            return false;
        }
        vr8 vr8Var = (vr8) obj;
        return this.a.equals(vr8Var.a) && this.b.equals(vr8Var.b) && this.c.equals(vr8Var.c) && this.d.equals(vr8Var.d) && this.e.equals(vr8Var.e) && this.f.equals(vr8Var.f) && this.g.equals(vr8Var.g) && this.h.equals(vr8Var.h) && this.i.equals(vr8Var.i) && this.j.equals(vr8Var.j) && this.k == vr8Var.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + rfp.c(this.j.a, (this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + rfp.c(this.c.a, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "";
    }
}
