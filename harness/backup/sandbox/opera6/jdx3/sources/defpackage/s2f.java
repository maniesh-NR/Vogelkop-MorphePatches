package defpackage;

/* loaded from: classes.dex */
public final class s2f implements jjm {
    public kjm a;
    public boolean b;
    public final String c;
    public final boolean d;

    public s2f(String str, boolean z) {
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.jjm
    public final void finish(hjm hjmVar) {
        if (this.b) {
            return;
        }
        this.b = true;
        kjm kjmVar = this.a;
        if (kjmVar == null) {
            return;
        }
        kjmVar.o(this, hjmVar);
    }

    @Override // defpackage.jjm
    public final void setRequestDismisser(kjm kjmVar) {
        this.a = kjmVar;
    }
}
