package defpackage;

/* loaded from: classes.dex */
public final class eue implements q8j {
    public final fqe a;
    public final /* synthetic */ fue b;

    public eue(fqe fqeVar, fue fueVar) {
        this.b = fueVar;
        this.a = fqeVar;
    }

    @Override // defpackage.q8j
    public final void a() {
        fue fueVar = this.b;
        if (fueVar.f.i("news_is_blocked_by_personalization_change")) {
            fueVar.b = null;
        }
        this.a.a(fueVar.c);
    }

    @Override // defpackage.q8j
    public final void c(Object obj) {
        fue fueVar = this.b;
        fueVar.b = (l1c) obj;
        fueVar.d();
    }
}
