package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class c94 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Callback b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c94(Callback callback, Object obj, byte b) {
        this.a = b;
        this.b = callback;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        Callback callback = this.b;
        switch (b) {
            case 0:
                callback.run(obj);
                break;
            default:
                callback.run(obj);
                break;
        }
    }
}
