package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class ex4 extends v6j {
    public final l08 c;
    public ekc d;
    public final k9 e;

    public ex4(int i) {
        super(i);
        this.c = l08.a;
        this.e = new k9((Object) this, (byte) 25);
    }

    @Override // defpackage.v6j
    public List d() {
        return this.c;
    }

    public abstract void g(r6j r6jVar);
}
