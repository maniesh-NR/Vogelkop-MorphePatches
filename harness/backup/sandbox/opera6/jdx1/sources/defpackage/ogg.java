package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class ogg extends CancellationException {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ogg(String str, byte b) {
        super(str);
        this.a = b;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.a) {
            case 0:
                setStackTrace(w7d.f);
                break;
            case 1:
                setStackTrace(sfe.e);
                break;
            default:
                setStackTrace(x7d.g);
                break;
        }
        return this;
    }
}
