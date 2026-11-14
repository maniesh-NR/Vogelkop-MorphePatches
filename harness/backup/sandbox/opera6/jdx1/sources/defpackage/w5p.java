package defpackage;

import ads_mobile_sdk.ri3;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class w5p implements vzo, jto {
    public static w5p e;
    public static w5p f$1;
    public final /* synthetic */ byte a;
    public float b = 0.0f;
    public ContentObserver c;
    public Object d;

    public /* synthetic */ w5p(Object obj, Object obj2, byte b) {
        this.a = b;
    }

    public static w5p a() {
        w5p w5pVar = f$1;
        if (w5pVar != null) {
            return w5pVar;
        }
        w5p w5pVar2 = new w5p(new auj((byte) 11), new dvj((byte) 15), (byte) 1);
        f$1 = w5pVar2;
        return w5pVar2;
    }

    public static w5p b() {
        w5p w5pVar = e;
        if (w5pVar != null) {
            return w5pVar;
        }
        w5p w5pVar2 = new w5p(new urj((byte) 13), new drj((byte) 12), (byte) 0);
        e = w5pVar2;
        return w5pVar2;
    }

    @Override // defpackage.vzo
    public final void a(boolean z) {
        switch (this.a) {
            case 0:
                g6m.f.getClass();
                if (!z) {
                    Handler handler = g6m.h;
                    if (handler != null) {
                        handler.removeCallbacks(g6m.j);
                        g6m.h = null;
                        break;
                    }
                } else {
                    g6m.b();
                    break;
                }
                break;
            default:
                if (!z) {
                    ri3.g.getClass();
                    Handler handler2 = ri3.i;
                    if (handler2 != null) {
                        handler2.removeCallbacks(ri3.k);
                        ri3.i = null;
                        break;
                    }
                } else {
                    ri3.g.getClass();
                    if (ri3.i == null) {
                        Handler handler3 = new Handler(Looper.getMainLooper());
                        ri3.i = handler3;
                        handler3.post(ri3.j);
                        ri3.i.postDelayed(ri3.k, 200L);
                        break;
                    }
                }
                break;
        }
    }
}
