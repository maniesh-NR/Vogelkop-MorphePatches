package defpackage;

import android.content.Intent;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.i;
import com.google.common.util.concurrent.ListenableFuture;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class sq1 implements Runnable {
    public final /* synthetic */ byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public /* synthetic */ sq1(byte b, int i, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.c = obj2;
        this.b = i;
        this.d = obj;
    }

    public sq1(flb flbVar, zkb zkbVar, int i) {
        this.a = (byte) 3;
        this.c = zkbVar;
        this.b = i;
        Objects.requireNonNull(flbVar);
        this.d = flbVar;
    }

    public /* synthetic */ sq1(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public sq1(ohc ohcVar, int i, ListenableFuture listenableFuture) {
        this.a = (byte) 4;
        this.d = ohcVar;
        this.b = i;
        this.c = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l94 l94Var;
        ArrayList arrayList;
        int iDecrementAndGet;
        byte b = this.a;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                TextView textView = (TextView) obj2;
                Typeface typeface = (Typeface) obj;
                y3d y3dVar = uq1.a;
                String fontVariationSettings = textView.getFontVariationSettings();
                if (!TextUtils.isEmpty(fontVariationSettings)) {
                    uq1.a(textView, null);
                }
                textView.setTypeface(typeface, i);
                if (TextUtils.isEmpty(fontVariationSettings)) {
                    return;
                }
                uq1.a(textView, fontVariationSettings);
                return;
            case 1:
                ((n84) obj).f(i, (String) obj2, "v2_message", (String) null);
                return;
            case 2:
                xkb xkbVar = (xkb) obj2;
                i iVar = xkbVar.e;
                glb glbVar = (glb) obj;
                RecyclerView recyclerView = glbVar.r;
                if (recyclerView == null || !recyclerView.s || xkbVar.k || iVar.getAbsoluteAdapterPosition() == -1) {
                    return;
                }
                e eVar = glbVar.r.M;
                if (eVar == null || !eVar.h()) {
                    ArrayList arrayList2 = glbVar.p;
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (((xkb) arrayList2.get(i2)).l) {
                        }
                    }
                    glbVar.m.n(iVar, i);
                    return;
                }
                glbVar.r.post(this);
                return;
            case 3:
                zkb zkbVar = (zkb) obj2;
                i iVar2 = ((elb) zkbVar).e;
                flb flbVar = (flb) obj;
                RecyclerView recyclerView2 = flbVar.v;
                if (recyclerView2 == null || !recyclerView2.s || ((elb) zkbVar).q || iVar2.getAdapterPosition() == -1) {
                    return;
                }
                e eVar2 = flbVar.v.M;
                if (eVar2 == null || !eVar2.h()) {
                    ArrayList arrayList3 = flbVar.t;
                    int size2 = arrayList3.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        if (((elb) arrayList3.get(i3)).r) {
                        }
                    }
                    flbVar.q.u(iVar2, i);
                    return;
                }
                flbVar.v.post(this);
                return;
            case 4:
                ohc ohcVar = (ohc) obj;
                ListenableFuture listenableFuture = (ListenableFuture) obj2;
                boolean z = ohcVar.c;
                AtomicInteger atomicInteger = ohcVar.d;
                ArrayList arrayList4 = ohcVar.b;
                if (ohcVar.isDone() || arrayList4 == null) {
                    jpo.n("Future was done before all dependencies completed", z);
                    return;
                }
                try {
                    try {
                        try {
                            try {
                                jpo.n("Tried to set value from future which is not done", listenableFuture.isDone());
                                arrayList4.set(i, k1g.F(listenableFuture));
                                iDecrementAndGet = atomicInteger.decrementAndGet();
                                jpo.n("Less than 0 remaining futures", iDecrementAndGet >= 0);
                            } catch (ExecutionException e) {
                                if (z) {
                                    ohcVar.f.d(e.getCause());
                                }
                                int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                                jpo.n("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
                                if (iDecrementAndGet2 != 0) {
                                    return;
                                }
                                ArrayList arrayList5 = ohcVar.b;
                                if (arrayList5 != null) {
                                    l94Var = ohcVar.f;
                                    arrayList = new ArrayList(arrayList5);
                                }
                            }
                        } catch (RuntimeException e2) {
                            if (z) {
                                ohcVar.f.d(e2);
                            }
                            int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                            jpo.n("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
                            if (iDecrementAndGet3 != 0) {
                                return;
                            }
                            ArrayList arrayList6 = ohcVar.b;
                            if (arrayList6 != null) {
                                l94Var = ohcVar.f;
                                arrayList = new ArrayList(arrayList6);
                            }
                        }
                    } catch (Error e3) {
                        ohcVar.f.d(e3);
                        int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                        jpo.n("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
                        if (iDecrementAndGet4 != 0) {
                            return;
                        }
                        ArrayList arrayList7 = ohcVar.b;
                        if (arrayList7 != null) {
                            l94Var = ohcVar.f;
                            arrayList = new ArrayList(arrayList7);
                        }
                    } catch (CancellationException unused) {
                        if (z) {
                            ohcVar.cancel(false);
                        }
                        int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                        jpo.n("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
                        if (iDecrementAndGet5 != 0) {
                            return;
                        }
                        ArrayList arrayList8 = ohcVar.b;
                        if (arrayList8 != null) {
                            l94Var = ohcVar.f;
                            arrayList = new ArrayList(arrayList8);
                        }
                    }
                    if (iDecrementAndGet == 0) {
                        ArrayList arrayList9 = ohcVar.b;
                        if (arrayList9 != null) {
                            l94Var = ohcVar.f;
                            arrayList = new ArrayList(arrayList9);
                            l94Var.b(arrayList);
                            return;
                        }
                        jpo.n((String) null, ohcVar.isDone());
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    int iDecrementAndGet6 = atomicInteger.decrementAndGet();
                    jpo.n("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
                    if (iDecrementAndGet6 == 0) {
                        ArrayList arrayList10 = ohcVar.b;
                        if (arrayList10 != null) {
                            ohcVar.f.b(new ArrayList(arrayList10));
                        } else {
                            jpo.n((String) null, ohcVar.isDone());
                        }
                    }
                    throw th;
                }
            case 5:
                ((OperaBottomSheetBehavior) obj).K(i, (View) obj2);
                return;
            default:
                ((ezk) obj2).b(i, (Intent) obj);
                return;
        }
    }
}
