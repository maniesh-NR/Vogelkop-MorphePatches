package defpackage;

/* loaded from: classes.dex */
public final class ujc extends gk9 {
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ujc(gig gigVar, byte b) {
        super(gigVar);
        this.d = b;
    }

    public final cig P() {
        switch (this.d) {
            case 0:
                cig cigVarP = ((gk9) this).b.P();
                cigVarP.getClass();
                eme emeVar = new eme(cigVarP);
                emeVar.v0(5);
                emeVar.v0(11);
                emeVar.v0(12);
                emeVar.v0(9);
                emeVar.v0(8);
                emeVar.v0(7);
                emeVar.v0(6);
                return new cig(((nrl) emeVar.a).j());
            default:
                return super.P();
        }
    }

    public final void stop() {
        switch (this.d) {
            case 1:
                super.stop();
                if (!((gk9) this).b.getCurrentTimeline().p()) {
                    seekToDefaultPosition();
                    setPlayWhenReady(false);
                    break;
                }
                break;
            default:
                super.stop();
                break;
        }
    }
}
