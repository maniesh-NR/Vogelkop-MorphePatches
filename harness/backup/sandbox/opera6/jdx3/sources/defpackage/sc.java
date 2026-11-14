package defpackage;

import android.os.SystemClock;
import android.view.View;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class sc {
    public Object a;
    public Object b;
    public Object c;

    public sc(View view, String str, oam oamVar) throws JSONException {
        e(view, str, oamVar);
    }

    public /* synthetic */ sc(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public sc(x5f x5fVar) {
        this.a = x5fVar;
        this.b = new WeakHashMap();
        this.c = new WeakHashMap();
    }

    public sc(y5i y5iVar) {
        this.a = y5iVar;
        this.b = new AtomicBoolean(false);
        this.c = z4c.b(new j3i(this, (byte) 24));
    }

    public final void a() {
        uio uioVar = (uio) this.a;
        if (uioVar != null) {
            uioVar.c();
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public void b(int i) {
    }

    public final void c(View view) {
        uio uioVar = (uio) this.a;
        if (uioVar == null || uioVar.g) {
            return;
        }
        ozo ozoVar = uioVar.c;
        ozoVar.getClass();
        if (view == null) {
            qp2.o("FriendlyObstruction is null");
            return;
        }
        wxo wxoVarA = ozoVar.a(view);
        if (wxoVarA != null) {
            ozoVar.a.remove(wxoVarA);
        }
    }

    public final void d(View view, pp9 pp9Var, String str) {
        uio uioVar = (uio) this.a;
        if (uioVar == null) {
            return;
        }
        try {
            uioVar.a(view, pp9Var, str);
        } catch (IllegalArgumentException e) {
            e.toString();
        }
    }

    public void e(View view, String str, oam oamVar) throws JSONException {
        uio uioVarD = coh.d(u06.e, str, oamVar);
        this.a = uioVarD;
        if (uioVarD == null) {
            return;
        }
        uioVarD.d(view);
        this.b = zy9.J((uio) this.a);
        this.c = qe6.K((uio) this.a);
        ((uio) this.a).e();
        hog hogVar = hog.STANDALONE;
        zy9 zy9Var = (zy9) this.b;
        zy9Var.getClass();
        uio uioVar = (uio) zy9Var.a;
        zch.c(uioVar);
        zch.j(uioVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", false);
            jSONObject.put("autoPlay", true);
            jSONObject.put("position", hogVar);
        } catch (JSONException unused) {
        }
        if (uioVar.j) {
            qp2.n("Loaded event can only be sent once");
            return;
        }
        yp ypVar = uioVar.e;
        qii.p.m(ypVar.g(), "publishLoadedEvent", new Object[]{jSONObject, ypVar.a});
        uioVar.j = true;
    }

    public final ap9 f() {
        y5i y5iVar = (y5i) this.a;
        y5iVar.a();
        if (((AtomicBoolean) this.b).compareAndSet(false, true)) {
            return (ap9) ((zyk) this.c).getValue();
        }
        String strJ = j();
        y5iVar.a();
        y5iVar.b();
        return y5iVar.i().getWritableDatabase().l(strJ);
    }

    public void g() {
        qe6 qe6Var = (qe6) this.c;
        if (qe6Var != null) {
            uio uioVar = (uio) qe6Var.b;
            zch.c(uioVar);
            JSONObject jSONObject = new JSONObject();
            yqo.b(jSONObject, "interactionType", sdb.CLICK);
            uioVar.e.d("adUserInteraction", jSONObject);
        }
    }

    public void h() {
        zy9 zy9Var = (zy9) this.b;
        if (zy9Var != null) {
            zy9Var.L();
        }
    }

    public rc i(jf jfVar) {
        return new rc((pc) this.b, jfVar, false);
    }

    public abstract String j();

    public final void k(Object obj, boolean z) {
        WeakHashMap weakHashMap = (WeakHashMap) this.b;
        if (!z) {
            neg negVar = (neg) weakHashMap.get(obj);
            if (negVar != null) {
                negVar.a();
                return;
            }
            return;
        }
        neg negVar2 = (neg) weakHashMap.computeIfAbsent(obj, new mn(new m3g((byte) 14), (byte) 15));
        if (negVar2 != null) {
            negVar2.a = SystemClock.uptimeMillis();
            negVar2.b = false;
        }
    }

    public final void l(Object obj, boolean z, boolean z2) {
        neg negVar;
        neg negVar2;
        WeakHashMap weakHashMap = (WeakHashMap) this.c;
        WeakHashMap weakHashMap2 = (WeakHashMap) this.b;
        if (z) {
            if (z2 && (negVar2 = (neg) weakHashMap2.computeIfAbsent(obj, new mn(new m3g((byte) 15), (byte) 16))) != null) {
                negVar2.a = SystemClock.uptimeMillis();
                negVar2.b = false;
            }
            weakHashMap.putIfAbsent(obj, new oeg());
            return;
        }
        if (z2 && (negVar = (neg) weakHashMap2.get(obj)) != null) {
            negVar.a();
        }
        neg negVar3 = (neg) weakHashMap2.remove(obj);
        long j = negVar3 != null ? negVar3.c : 0L;
        oeg oegVar = (oeg) weakHashMap.remove(obj);
        long jUptimeMillis = oegVar != null ? SystemClock.uptimeMillis() - oegVar.a : 0L;
        if (jUptimeMillis <= 0 || jUptimeMillis < j) {
            return;
        }
        x5f x5fVar = (x5f) this.a;
        if (x5fVar.h) {
            x5fVar.T0(new k5f((byte) 0, j, jUptimeMillis));
        }
    }

    public final void m(ap9 ap9Var) {
        if (ap9Var == ((ap9) ((zyk) this.c).getValue())) {
            ((AtomicBoolean) this.b).set(false);
        }
    }

    public final void n(Object obj) {
        neg negVar = (neg) ((WeakHashMap) this.b).get(obj);
        if (negVar != null) {
            negVar.a();
        }
    }
}
