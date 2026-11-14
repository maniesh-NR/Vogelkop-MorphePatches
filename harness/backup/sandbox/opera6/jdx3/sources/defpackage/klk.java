package defpackage;

/* loaded from: classes.dex */
public final class klk extends ekc {
    public final /* synthetic */ byte l;
    public final Object m;
    public final Object n;

    public klk(db dbVar) {
        this.l = (byte) 0;
        this.n = new nj2(this, (byte) 4);
        this.m = dbVar;
    }

    public klk(ydn ydnVar) {
        this.l = (byte) 1;
        this.n = new nlk(this, (byte) 3);
        this.m = ydnVar;
        r(Boolean.valueOf(ydnVar.c.isEnabled()));
    }

    public final void l() {
        byte b = this.l;
        Object obj = this.n;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                s();
                ((db) obj2).a((nj2) obj);
                break;
            default:
                ydn ydnVar = (ydn) obj2;
                ydnVar.F((nlk) obj);
                r(Boolean.valueOf(ydnVar.c.isEnabled()));
                break;
        }
    }

    public final void m() {
        switch (this.l) {
            case 0:
                ((db) this.m).h((nj2) this.n);
                break;
            default:
                ((ydn) this.m).H((nlk) this.n);
                break;
        }
    }

    public final void s() {
        db dbVar = (db) this.m;
        Boolean boolValueOf = Boolean.valueOf(dbVar.f() && !dbVar.d());
        if (boolValueOf.equals(g())) {
            return;
        }
        r(boolValueOf);
    }
}
