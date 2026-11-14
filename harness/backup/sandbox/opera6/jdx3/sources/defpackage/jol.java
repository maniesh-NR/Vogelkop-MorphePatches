package defpackage;

/* loaded from: classes.dex */
public final class jol extends zwg {
    public final int a;
    public final int b;
    public final c69 c;
    public eol d = eol.c;

    public jol(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = new c69(i, i2, (byte) 0);
    }

    public final eol j() {
        return this.d;
    }

    public final e2m k() {
        return this.c;
    }

    public final l7l o(m7l m7lVar) {
        l7l l7lVar = m7lVar.c;
        int i = l7lVar.b;
        int i2 = l7lVar.c;
        if (i > i2) {
            if (i2 > (this.b * 80) / 100) {
                this.d = eol.c;
                return l7lVar;
            }
        } else if (i > (this.a * 80) / 100) {
            this.d = eol.c;
            return l7lVar;
        }
        this.d = eol.b;
        return m7lVar.b;
    }
}
