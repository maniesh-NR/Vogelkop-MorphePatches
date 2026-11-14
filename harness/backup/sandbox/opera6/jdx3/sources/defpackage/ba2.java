package defpackage;

/* loaded from: classes.dex */
public abstract class ba2 implements fa2, aa2, ea2 {
    public final Class a;

    public ba2(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.fa2
    public final aa2 S() {
        return this;
    }

    @Override // defpackage.fa2
    public final Class g() {
        return this.a;
    }

    @Override // defpackage.fa2
    public final ea2 j() {
        return this;
    }

    @Override // defpackage.fa2
    public void onDestroy() {
    }
}
