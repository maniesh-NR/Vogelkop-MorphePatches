package defpackage;

/* loaded from: classes.dex */
public final class enn implements tjn {
    public final /* synthetic */ zg a;
    public final /* synthetic */ pg5 b;

    public enn(zg zgVar, pg5 pg5Var) {
        this.a = zgVar;
        this.b = pg5Var;
    }

    @Override // defpackage.tjn
    public final int a() {
        return this.a.a;
    }

    @Override // defpackage.tjn
    public final String e() {
        return ((qln) this.a.b).i();
    }

    @Override // defpackage.tjn
    public final String f() {
        return ((qln) this.a.b).f();
    }

    @Override // defpackage.tjn
    public final void h(int i) {
        qln qlnVar = (qln) this.a.b;
        qlnVar.l.getClass();
        qs7.p = null;
        qlnVar.o(true);
        qlnVar.n(am2.c(i));
        agm agmVar = qlnVar.o;
        if (agmVar.p()) {
            qlnVar.r = true;
            qlnVar.e.Y("wallpaper_current", agmVar.n(qlnVar.i()));
        }
        this.b.b();
    }

    @Override // defpackage.tjn
    public final void n(aln alnVar) {
    }
}
