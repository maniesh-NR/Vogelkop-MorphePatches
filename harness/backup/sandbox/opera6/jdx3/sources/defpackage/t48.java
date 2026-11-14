package defpackage;

/* loaded from: classes.dex */
public final class t48 extends tim {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Runnable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t48(uim uimVar, Runnable runnable, byte b) {
        super(uimVar);
        this.b = b;
        this.c = runnable;
    }

    @Override // defpackage.d63
    public final void onFinished(hjm hjmVar) {
        byte b = this.b;
        Runnable runnable = this.c;
        switch (b) {
            case 0:
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
