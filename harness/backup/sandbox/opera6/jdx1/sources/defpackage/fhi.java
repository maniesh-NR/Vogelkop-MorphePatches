package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class fhi extends ihi implements Iterator {
    public ghi a;
    public ghi b;

    @Override // defpackage.ihi
    public final void a(ghi ghiVar) {
        ghi ghiVar2 = this.a;
        ghi ghiVar3 = null;
        if (ghiVar2 == ghiVar && ghiVar == this.b) {
            this.b = null;
            this.a = null;
            ghiVar2 = null;
        }
        ghi ghiVar4 = ghiVar2;
        if (ghiVar2 == ghiVar) {
            ghiVar4 = ghiVar2.d;
            this.a = ghiVar4;
        }
        ghi ghiVar5 = this.b;
        if (ghiVar5 == ghiVar) {
            if (ghiVar5 != ghiVar4 && ghiVar4 != null) {
                ghiVar3 = ghiVar5.c;
            }
            this.b = ghiVar3;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ghi ghiVar = this.b;
        ghi ghiVar2 = this.a;
        this.b = (ghiVar == ghiVar2 || ghiVar2 == null) ? null : ghiVar.c;
        return ghiVar;
    }
}
