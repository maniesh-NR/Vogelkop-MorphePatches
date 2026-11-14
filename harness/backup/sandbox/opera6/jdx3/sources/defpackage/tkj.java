package defpackage;

import java.util.ArrayList;
import java.util.Date;

/* loaded from: classes.dex */
public final class tkj extends tq8 {
    public final ukj h;
    public final boolean i;

    public tkj(tq8 tq8Var) {
        ukj ukjVar = new ukj(tq8Var);
        boolean zY = tq8Var.y();
        ArrayList arrayListJ = nb6.J(new zlb(tq8Var, new b10((byte) 26), (byte) 1));
        this.h = ukjVar;
        this.i = zY;
        int size = arrayListJ.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListJ.get(i);
            i++;
            s(-1, (hq8) obj);
        }
    }

    @Override // defpackage.hq8
    public final String c() {
        return (String) this.h.b;
    }

    @Override // defpackage.hq8
    public final long e() {
        return this.h.a;
    }

    @Override // defpackage.hq8
    public final String g() {
        return (String) this.h.f;
    }

    @Override // defpackage.hq8
    public final String h() {
        return (String) this.h.c;
    }

    @Override // defpackage.hq8
    public final String i(p6l p6lVar) {
        p6l p6lVar2 = p6l.b;
        ukj ukjVar = this.h;
        return (String) (p6lVar == p6lVar2 ? ukjVar.e : ukjVar.d);
    }

    @Override // defpackage.hq8
    public final void q(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tq8
    public final boolean y() {
        return this.i;
    }

    @Override // defpackage.tq8
    public final Date z() {
        return (Date) this.h.g;
    }
}
