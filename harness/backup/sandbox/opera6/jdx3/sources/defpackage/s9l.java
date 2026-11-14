package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final /* synthetic */ class s9l implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t9l b;

    public /* synthetic */ s9l(t9l t9lVar, byte b) {
        this.a = b;
        this.b = t9lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        t9l t9lVar = this.b;
        switch (b) {
            case 0:
                ((kze) t9lVar.c).k(new w4i(new n6k(t9lVar, (byte) 27), (byte) 25));
                ViewGroup viewGroup = (ViewGroup) t9lVar.a;
                if (!viewGroup.isLaidOut()) {
                    viewGroup.postOnAnimation(new s9l(t9lVar, b2));
                    break;
                } else {
                    ((gyf) t9lVar.d).a();
                    t9lVar.f();
                    break;
                }
            default:
                ViewGroup viewGroup2 = (ViewGroup) t9lVar.a;
                if (!viewGroup2.isLaidOut()) {
                    viewGroup2.postOnAnimation(new s9l(t9lVar, b2));
                    break;
                } else {
                    ((gyf) t9lVar.d).a();
                    t9lVar.f();
                    break;
                }
        }
    }
}
