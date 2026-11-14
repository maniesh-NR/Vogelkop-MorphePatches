package defpackage;

/* loaded from: classes.dex */
public final class ssd implements f7f {
    public final ekc a;
    public final f7f b;
    public int c = -1;

    public ssd(ekc ekcVar, f7f f7fVar) {
        this.a = ekcVar;
        this.b = f7fVar;
    }

    public final void d0(Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.d0(obj);
        }
    }
}
