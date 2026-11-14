package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class dyf {
    public final Context a;
    public c6j h;
    public WeakReference i;
    public WeakReference j;
    public final ay b = new ay((Object) this, (byte) 10);
    public final ud7 c = new ud7(this, 2);
    public final byf d = new byf(this);
    public final WeakHashMap e = new WeakHashMap();
    public cue f = cue.None;
    public final h7f g = new h7f();
    public final ju2 k = new ju2(this);

    public dyf(Context context) {
        this.a = context;
    }

    public final c6j a() {
        c6j c6jVar = this.h;
        if (c6jVar != null) {
            return c6jVar;
        }
        String[] strArr = OperaApplication.K;
        c6j c6jVarH = ((OperaApplication) this.a.getApplicationContext()).y().c().h();
        this.h = c6jVarH;
        return c6jVarH;
    }

    public final zxf b() {
        zxf zxfVar;
        WeakReference weakReference = this.i;
        if (weakReference != null && (zxfVar = (zxf) weakReference.get()) != null) {
            return zxfVar;
        }
        cyf cyfVar = new cyf(this);
        this.i = new WeakReference(cyfVar);
        return cyfVar;
    }

    public final void c() {
        h7f h7fVar = this.g;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((zxf) g7fVarH.next()).g();
        }
    }

    public final void d() {
        cue cueVar;
        c6j c6jVar;
        h7f h7fVar = this.g;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (true) {
            if (!g7fVarH.hasNext()) {
                cueVar = cue.None;
                break;
            } else if (((zxf) g7fVarH.next()).f()) {
                String[] strArr = OperaApplication.K;
                fue fueVarZ = ((OperaApplication) this.a.getApplicationContext()).z();
                fueVarZ.d();
                cueVar = fueVarZ.a;
                break;
            }
        }
        cue cueVar2 = this.f;
        if (cueVar2 != cueVar) {
            int iOrdinal = cueVar2.ordinal();
            byf byfVar = this.d;
            if (iOrdinal == 1 && (c6jVar = this.h) != null) {
                c6jVar.c.remove(byfVar);
                this.h = null;
            }
            this.f = cueVar;
            c6j c6jVarA = cueVar == cue.NewsFeed ? a() : null;
            if (c6jVarA != null) {
                c6jVarA.c.add(byfVar);
            }
        }
    }
}
