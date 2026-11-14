package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class w4l implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a5l b;

    public /* synthetic */ w4l(a5l a5lVar, byte b) {
        this.a = b;
        this.b = a5lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        a5l a5lVar = this.b;
        switch (b) {
            case 0:
                new rml(Unit.a, a5lVar.a).a(new n6k((Object) a5lVar, (byte) 21)).m(a5lVar.g);
                break;
            default:
                gpk gpkVar = a5l.l;
                ava.a.a(new w4l(a5lVar, (byte) 0));
                break;
        }
    }
}
