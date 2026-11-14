package defpackage;

import android.os.SystemClock;
import com.opera.android.settings.SettingsManager;
import java.util.HashMap;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class qke extends y08 {
    public final SettingsManager a;
    public final nw3 b;
    public final HashMap c = new HashMap();
    public final i7f d = new i7f();

    public qke(k6l k6lVar, SettingsManager settingsManager, nw3 nw3Var) {
        k6lVar.b(this);
        this.a = settingsManager;
        this.b = nw3Var;
    }

    public static boolean Z(GURL gurl) {
        if (gurl.b) {
            return gurl.f().equals("http") || gurl.f().equals("https");
        }
        return false;
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void E(b2l b2lVar, NavigationHandle navigationHandle) {
        int i;
        d7l d7lVar = (d7l) b2lVar;
        Integer numValueOf = Integer.valueOf(d7lVar.j.getId());
        HashMap map = this.c;
        oke okeVar = (oke) map.get(numValueOf);
        if (okeVar == null || okeVar.g != navigationHandle) {
            return;
        }
        okeVar.g = null;
        if (navigationHandle.h && !navigationHandle.j && !navigationHandle.i && (((i = navigationHandle.m) < 400 || i >= 600) && Z(navigationHandle.e))) {
            int i2 = navigationHandle.d;
            if ((i2 & 255) != 8 && (i2 & 16777216) == 0) {
                if (okeVar.f != 0 || okeVar.c) {
                    X(b2lVar, okeVar, SystemClock.uptimeMillis());
                    return;
                }
                return;
            }
        }
        map.remove(Integer.valueOf(d7lVar.j.getId()));
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void Q(b2l b2lVar, NavigationHandle navigationHandle) {
        if ((!navigationHandle.c || navigationHandle.b) && Z(navigationHandle.e)) {
            d7l d7lVar = (d7l) b2lVar;
            oke okeVar = (oke) this.c.put(Integer.valueOf(d7lVar.j.getId()), new oke(this.a.i("compression"), d7lVar.j.m(), navigationHandle));
            if (okeVar != null && okeVar.g == null && okeVar.f == 0 && !okeVar.c && navigationHandle.c) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (okeVar.e == 0) {
                    okeVar.e = jUptimeMillis;
                }
                okeVar.f = jUptimeMillis;
                X(b2lVar, okeVar, jUptimeMillis);
            }
        }
    }

    public final void W(pke pkeVar) {
        this.d.b(pkeVar);
    }

    public final void X(b2l b2lVar, oke okeVar, long j) {
        if (okeVar.c || !(okeVar.e == 0 || okeVar.f == 0)) {
            d7l d7lVar = (d7l) b2lVar;
            this.c.remove(Integer.valueOf(d7lVar.j.getId()));
            String url = d7lVar.j.getUrl();
            ydn ydnVarR = this.b.b.R();
            vdn vdnVar = ydnVarR.d;
            boolean z = vdnVar.a;
            boolean zT = true;
            if (z && (!okeVar.d ? vdnVar.a() : z)) {
                zT = ydnVarR.t(url);
            }
            boolean z2 = zT;
            i7f i7fVar = this.d;
            g7f g7fVarC = u35.c(i7fVar, i7fVar);
            while (g7fVarC.hasNext()) {
                ((pke) g7fVarC.next()).w(b2lVar, okeVar, j, z2);
            }
        }
    }

    public final void Y(pke pkeVar) {
        this.d.c(pkeVar);
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void j(b2l b2lVar) {
        oke okeVar = (oke) this.c.get(Integer.valueOf(((d7l) b2lVar).j.getId()));
        if (okeVar == null || okeVar.f != 0) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        okeVar.f = jUptimeMillis;
        if (okeVar.g == null) {
            X(b2lVar, okeVar, jUptimeMillis);
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void l(b2l b2lVar, int i) {
        oke okeVar = (oke) this.c.get(Integer.valueOf(((d7l) b2lVar).j.getId()));
        if (okeVar == null || okeVar.e != 0 || i < 100) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        okeVar.e = jUptimeMillis;
        X(b2lVar, okeVar, jUptimeMillis);
    }
}
