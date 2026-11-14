package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class hhi extends ihi implements Iterator {
    public ghi a;
    public boolean b = true;
    public final /* synthetic */ jhi c;

    public hhi(jhi jhiVar) {
        this.c = jhiVar;
    }

    @Override // defpackage.ihi
    public final void a(ghi ghiVar) {
        ghi ghiVar2 = this.a;
        if (ghiVar == ghiVar2) {
            ghi ghiVar3 = ghiVar2.d;
            this.a = ghiVar3;
            this.b = ghiVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        ghi ghiVar = this.a;
        return (ghiVar == null || ghiVar.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            this.b = false;
            ghi ghiVar = this.c.a;
            this.a = ghiVar;
            return ghiVar;
        }
        ghi ghiVar2 = this.a;
        ghi ghiVar3 = ghiVar2 != null ? ghiVar2.c : null;
        this.a = ghiVar3;
        return ghiVar3;
    }
}
