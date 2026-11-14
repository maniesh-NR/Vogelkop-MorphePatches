package defpackage;

/* loaded from: classes.dex */
public final class jcj implements jjm {
    public final dcj a;
    public kjm b;
    public boolean c;
    public String d;

    public jcj(dcj dcjVar) {
        this.a = dcjVar;
    }

    @Override // defpackage.jjm
    public final void finish(hjm hjmVar) {
        if (this.c) {
            return;
        }
        this.c = true;
        dcj dcjVar = this.a;
        if (dcjVar != null) {
            dcjVar.b(this, this.d);
        }
        kjm kjmVar = this.b;
        if (kjmVar != null) {
            kjmVar.o(this, hjmVar);
        }
    }

    @Override // defpackage.jjm
    public final void setRequestDismisser(kjm kjmVar) {
        this.b = kjmVar;
    }
}
