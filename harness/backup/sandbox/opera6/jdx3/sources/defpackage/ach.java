package defpackage;

/* loaded from: classes.dex */
public final class ach implements q8j {
    public final stm a;
    public qtm b;
    public int c;

    public ach(stm stmVar) {
        this.a = stmVar;
    }

    @Override // defpackage.q8j
    public final void a() {
        this.a.b(this);
    }

    @Override // defpackage.q8j
    public final void c(Object obj) {
        this.c++;
        this.b = (qtm) obj;
    }
}
