package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class tuj {
    public final /* synthetic */ byte a;
    public long b;
    public boolean c;
    public final Object d;
    public final Object e;
    public Object f;
    public final Object g;
    public final Object h;
    public Object i;
    public Object j;
    public Object k;

    public tuj(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                WeakHashMap weakHashMap = new WeakHashMap(10);
                uto utoVar = new uto();
                Handler handler = new Handler(Looper.myLooper());
                this.b = 0L;
                this.g = weakHashMap;
                this.h = utoVar;
                this.k = handler;
                this.j = new iv(this, (byte) 0);
                this.d = new ArrayList(50);
                this.e = new ml2(this, (byte) 6);
                this.f = new WeakReference(null);
                a(context, null);
                break;
            default:
                WeakHashMap weakHashMap2 = new WeakHashMap(10);
                rii riiVar = new rii();
                Handler handler2 = new Handler(Looper.myLooper());
                this.b = 0L;
                this.g = weakHashMap2;
                this.h = riiVar;
                this.k = handler2;
                this.j = new iv(this);
                this.d = new ArrayList(50);
                this.e = new ml2(this, (byte) 5);
                this.f = new WeakReference(null);
                a(context, null);
                break;
        }
    }

    public tuj(Function1 function1) {
        this.a = (byte) 0;
        this.d = function1;
        this.e = new AtomicReference(null);
        this.f = new nqi(this, (byte) 8);
        this.g = new tji(this, (byte) 26);
        this.h = new dfe(new suj[16]);
        this.i = new Object();
        this.b = -1L;
    }

    public final void a(Context context, View view) {
        View viewF;
        View viewC;
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 1:
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) ((WeakReference) this.f).get();
                if ((viewTreeObserver == null || !viewTreeObserver.isAlive()) && (viewF = upj.f(context, view)) != null) {
                    ViewTreeObserver viewTreeObserver2 = viewF.getViewTreeObserver();
                    if (viewTreeObserver2.isAlive()) {
                        this.f = new WeakReference(viewTreeObserver2);
                        viewTreeObserver2.addOnPreDrawListener((ml2) obj);
                        break;
                    }
                }
                break;
            default:
                ViewTreeObserver viewTreeObserver3 = (ViewTreeObserver) ((WeakReference) this.f).get();
                if ((viewTreeObserver3 == null || !viewTreeObserver3.isAlive()) && (viewC = aoh.c(context, view)) != null) {
                    ViewTreeObserver viewTreeObserver4 = viewC.getViewTreeObserver();
                    if (viewTreeObserver4.isAlive()) {
                        this.f = new WeakReference(viewTreeObserver4);
                        viewTreeObserver4.addOnPreDrawListener((ml2) obj);
                        break;
                    }
                }
                break;
        }
    }

    public final void b(View view, View view2, int i, int i2, Integer num) {
        a(view2.getContext(), view2);
        WeakHashMap weakHashMap = (WeakHashMap) this.g;
        rvo rvoVar = (rvo) weakHashMap.get(view2);
        if (rvoVar == null) {
            rvoVar = new rvo();
            weakHashMap.put(view2, rvoVar);
            if (!this.c) {
                this.c = true;
                ((Handler) this.k).postDelayed((iv) this.j, 100L);
            }
        }
        int iMin = Math.min(i2, i);
        rvoVar.d = view;
        rvoVar.a = i;
        rvoVar.b = iMin;
        long j = this.b;
        rvoVar.c = j;
        rvoVar.e = num;
        long j2 = 1 + j;
        this.b = j2;
        if (j2 % 50 == 0) {
            long j3 = j - 49;
            ArrayList arrayList = (ArrayList) this.d;
            for (Map.Entry entry : weakHashMap.entrySet()) {
                if (((rvo) entry.getValue()).c < j3) {
                    arrayList.add((View) entry.getKey());
                }
            }
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                weakHashMap.remove((View) obj);
            }
            arrayList.clear();
        }
    }

    public final void c() {
        synchronized (this.i) {
            dfe dfeVar = (dfe) this.h;
            Object[] objArr = dfeVar.a;
            int i = dfeVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                suj sujVar = (suj) objArr[i2];
                sujVar.e.a();
                sujVar.f.a();
                sujVar.l.a();
                sujVar.m.clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d() throws pxb {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.i) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.e;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List listSubList = null;
                if (obj != null) {
                    if (obj instanceof Set) {
                        set2 = (Set) obj;
                    } else {
                        if (!(obj instanceof List)) {
                            mh5.b("Unexpected notification");
                            t3p.v();
                            return false;
                        }
                        List list2 = (List) obj;
                        Set set3 = (Set) list2.get(0);
                        if (list2.size() == 2) {
                            listSubList = list2.get(1);
                        } else if (list2.size() > 2) {
                            listSubList = list2.subList(1, list2.size());
                        }
                        set2 = set3;
                        list = listSubList;
                    }
                    while (!atomicReference.compareAndSet(obj, list)) {
                        if (atomicReference.get() != obj) {
                            break;
                        }
                    }
                    set = set2;
                    break;
                }
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.i) {
                dfe dfeVar = (dfe) this.h;
                Object[] objArr = dfeVar.a;
                int i = dfeVar.c;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((suj) objArr[i2]).a(set) || z2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01f3 A[Catch: all -> 0x01f9, TRY_ENTER, TRY_LEAVE, TryCatch #9 {, blocks: (B:116:0x01f3, B:85:0x01c3), top: B:129:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.Object r24, kotlin.jvm.functions.Function1 r25, kotlin.jvm.functions.Function0 r26) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tuj.e(java.lang.Object, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):void");
    }

    public final void f() {
        nqi nqiVar = (nqi) this.f;
        ytj.b(ytj.a);
        synchronized (ytj.c) {
            ytj.h = CollectionsKt.W(nqiVar, ytj.h);
        }
        this.j = new txi(nqiVar, (byte) 8);
    }
}
