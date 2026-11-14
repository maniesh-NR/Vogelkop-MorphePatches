package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ce2;
import defpackage.edp;
import defpackage.k3p;
import defpackage.kap;
import defpackage.opo;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class bm0 implements edp {
    public final ExecutorService a;
    public final kap b;
    public final kap c;
    public final ia3 d;
    public final kap e;
    public final n90 f;
    public final l7 g;

    public bm0(ExecutorService executorService, kap kapVar, kap kapVar2, ia3 ia3Var, kap kapVar3, n90 n90Var, l7 l7Var) {
        this.a = executorService;
        this.b = kapVar;
        this.c = kapVar2;
        this.d = ia3Var;
        this.e = kapVar3;
        this.f = n90Var;
        this.g = l7Var;
    }

    @Override // defpackage.edp
    public final ListenableFuture a() {
        return yr9.e(new ce2(this, (byte) 8), this.a);
    }

    @Override // defpackage.edp
    public final ListenableFuture a(Context context) {
        ca1 ca1Var = (ca1) this.f.get();
        context.getClass();
        ca1Var.d = context;
        ia3 ia3Var = this.d;
        ia3Var.getClass();
        HashMap map = new HashMap();
        Iterator it = ia3Var.a.iterator();
        while (it.hasNext()) {
            ((opo) it.next()).a(map);
        }
        ca1Var.b = map;
        k3p k3pVarW = pd.w();
        k3pVarW.getClass();
        ca1Var.e = k3pVarW;
        ca1Var.g = ga3.a;
        return ((j63) ca1Var.a().B.get()).b();
    }

    @Override // defpackage.edp
    public final ListenableFuture a(Context context, String str, View view, Activity activity) {
        ca1 ca1Var = (ca1) this.f.get();
        context.getClass();
        ca1Var.d = context;
        ca1Var.f = view;
        ca1Var.h = activity;
        if (!this.g.y()) {
            str = "";
        }
        ca1Var.i = str;
        ia3 ia3Var = this.d;
        ia3Var.getClass();
        HashMap map = new HashMap();
        Iterator it = ia3Var.a.iterator();
        while (it.hasNext()) {
            ((opo) it.next()).a(map, context, view);
        }
        ca1Var.b = map;
        k3p k3pVarW = pd.w();
        k3pVarW.getClass();
        ca1Var.e = k3pVarW;
        ca1Var.g = ga3.b;
        return ((j63) ca1Var.a().B.get()).b();
    }

    @Override // defpackage.edp
    public final void a(MotionEvent motionEvent) {
        y61 y61Var = (y61) this.e.get();
        synchronized (y61Var) {
            y61Var.b = motionEvent;
            if (motionEvent != null) {
                if (motionEvent.getAction() == 1) {
                    y61Var.c = MotionEvent.obtain(motionEvent);
                }
                w61 w61Var = y61Var.d;
                int action = motionEvent.getAction();
                if (action == 0) {
                    w61Var.a++;
                    w61Var.g = 0.0d;
                    w61Var.e = motionEvent.getRawX();
                    w61Var.f = motionEvent.getRawY();
                    w61Var.h = motionEvent.getX();
                    w61Var.i = motionEvent.getY();
                    w61Var.j = motionEvent.getRawX();
                    w61Var.k = motionEvent.getRawY();
                } else if (action == 1) {
                    w61Var.c++;
                    w61Var.g = Math.hypot(motionEvent.getRawX() - w61Var.e, motionEvent.getRawY() - w61Var.f) + w61Var.g;
                    w61Var.e = motionEvent.getRawX();
                    w61Var.f = motionEvent.getRawY();
                } else if (action == 2) {
                    w61Var.b += motionEvent.getHistorySize() + 1;
                    w61Var.g = Math.hypot(motionEvent.getRawX() - w61Var.e, motionEvent.getRawY() - w61Var.f) + w61Var.g;
                    w61Var.e = motionEvent.getRawX();
                    w61Var.f = motionEvent.getRawY();
                } else if (action == 3) {
                    w61Var.d++;
                }
                if (y61Var.a.size() >= 6) {
                    y61Var.a.remove();
                }
                y61Var.a.add(new x61(motionEvent));
            }
        }
    }

    @Override // defpackage.edp
    public final ListenableFuture b(Context context, String str, View view, Activity activity) {
        ia3 ia3Var = this.d;
        ia3Var.getClass();
        HashMap map = new HashMap();
        Iterator it = ia3Var.a.iterator();
        while (it.hasNext()) {
            ((opo) it.next()).b(map);
        }
        y61 y61Var = (y61) this.e.get();
        synchronized (y61Var) {
            MotionEvent motionEvent = y61Var.b;
            if (motionEvent != null) {
                map.put("evt", motionEvent);
            }
            MotionEvent motionEvent2 = y61Var.c;
            if (motionEvent2 != null) {
                map.put("nv", motionEvent2);
            }
            map.put("oe", y61Var.d);
            ArrayDeque arrayDeque = y61Var.a;
            map.put("ro", arrayDeque.toArray(new x61[arrayDeque.size()]));
            y61Var.d = new w61();
            y61Var.a.clear();
            MotionEvent motionEvent3 = y61Var.c;
            if (motionEvent3 != null) {
                motionEvent3.recycle();
                y61Var.c = null;
            }
            y61Var.b = null;
        }
        ca1 ca1Var = (ca1) this.f.get();
        context.getClass();
        ca1Var.d = context;
        ca1Var.f = view;
        ca1Var.h = activity;
        ca1Var.i = str;
        ca1Var.b = map;
        ca1Var.g = ga3.c;
        k3p k3pVarW = pd.w();
        k3pVarW.getClass();
        ca1Var.e = k3pVarW;
        return ((j63) ca1Var.a().B.get()).b();
    }

    @Override // defpackage.edp
    public final String b() {
        return "1.945319811";
    }
}
