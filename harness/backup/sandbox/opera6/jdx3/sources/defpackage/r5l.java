package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class r5l extends gph implements w6f {
    public final i7f a = new i7f();

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.a.b((g3l) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.a.c((g3l) obj);
    }

    public final void b() throws Resources.NotFoundException {
        j();
    }

    public final void f(int i, int i2) throws Resources.NotFoundException {
        j();
    }

    public final void h(int i, int i2) throws Resources.NotFoundException {
        j();
    }

    public final void j() throws Resources.NotFoundException {
        g7f g7fVar = new g7f(this.a);
        while (g7fVar.hasNext()) {
            g3l g3lVar = (g3l) g7fVar.next();
            switch (g3lVar.a) {
                case 0:
                    ((j1c) g3lVar.b).a();
                    break;
                default:
                    r9l r9lVar = (r9l) g3lVar.b;
                    r9lVar.q.p.setEnabled(r9lVar.f().v.o.b.size() != 0);
                    break;
            }
        }
    }
}
