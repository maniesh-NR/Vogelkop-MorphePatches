package defpackage;

/* loaded from: classes.dex */
public abstract class l53 implements pz3 {
    public kjm a;
    public boolean b;

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
