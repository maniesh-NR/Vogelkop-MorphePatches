package defpackage;

import android.media.MediaFormat;

/* loaded from: classes.dex */
public final /* synthetic */ class c28 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v18 b;

    public /* synthetic */ c28(v18 v18Var, byte b) {
        this.a = b;
        this.b = v18Var;
    }

    public /* synthetic */ c28(v18 v18Var, MediaFormat mediaFormat) {
        this.a = (byte) 2;
        this.b = v18Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.m();
                break;
            case 1:
            default:
                this.b.getClass();
                break;
            case 2:
                this.b.p(new yt7((byte) 7));
                break;
        }
    }
}
