package defpackage;

/* loaded from: classes.dex */
public final class n94 extends x6 {
    public final /* synthetic */ o94 h;

    public n94(o94 o94Var) {
        this.h = o94Var;
    }

    @Override // defpackage.x6
    public final String h() {
        l94 l94Var = (l94) this.h.a.get();
        return l94Var == null ? "Completer object has been garbage collected, future will fail soon" : am2.o(new StringBuilder("tag=["), l94Var.a, "]");
    }
}
