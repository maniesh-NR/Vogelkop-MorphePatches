package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Size;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class ijc {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;

    public ijc(Context context, ez9 ez9Var) {
        this.g = new ArrayList();
        this.h = new up1(this, (byte) 15);
        this.i = new pjg(this, (byte) 19);
        this.c = context;
        this.d = ez9Var;
        this.e = new Handler();
        this.f = context.getPackageManager();
    }

    public ijc(Looper looper, gjc gjcVar) {
        this(new CopyOnWriteArraySet(), looper, looper.getThread(), kzk.a, gjcVar, true);
    }

    public ijc(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public ijc(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, kzk kzkVar, gjc gjcVar, boolean z) {
        this.c = thread;
        this.f = copyOnWriteArraySet;
        this.e = gjcVar;
        this.i = new Object();
        this.g = new ArrayDeque();
        this.h = new ArrayDeque();
        if (looper == null || kzkVar == null || gjcVar == null) {
            this.d = null;
        } else {
            this.d = kzkVar.a(looper, new cj5(this, (byte) 1));
        }
        this.b = z;
    }

    public ijc(pde pdeVar, RecyclerView recyclerView, t5k t5kVar, njm njmVar) {
        this.c = recyclerView;
        this.d = t5kVar;
        this.e = njmVar;
        this.f = new d6k();
        this.g = new LinkedHashMap();
        this.h = new jde();
        this.i = new Size(0, 0);
        a26.U(njmVar, pdeVar, new bv8(this, (byte) 2), new unj((byte) 7));
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.i) {
            if (this.a) {
                return;
            }
            ((CopyOnWriteArraySet) this.f).add(new hjc(obj));
        }
    }

    public final void b(u5k u5kVar) {
        d6k d6kVar = (d6k) this.f;
        d6kVar.a.add(u5kVar.u());
        ((t5k) this.d).G(u5kVar);
    }

    public final void c() {
        szk szkVar = (szk) this.d;
        ArrayDeque arrayDeque = (ArrayDeque) this.g;
        j();
        ArrayDeque arrayDeque2 = (ArrayDeque) this.h;
        if (arrayDeque2.isEmpty()) {
            return;
        }
        if (((gjc) this.e) != null) {
            szkVar.getClass();
            Handler handler = szkVar.a;
            if (!handler.hasMessages(1)) {
                rzk rzkVarB = szk.b();
                Message messageObtainMessage = handler.obtainMessage(1);
                rzkVarB.a = messageObtainMessage;
                messageObtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(messageObtainMessage);
                rzkVarB.a();
            }
        }
        boolean zIsEmpty = arrayDeque.isEmpty();
        arrayDeque.addAll(arrayDeque2);
        arrayDeque2.clear();
        if (zIsEmpty) {
            while (!arrayDeque.isEmpty()) {
                ((Runnable) arrayDeque.peekFirst()).run();
                arrayDeque.removeFirst();
            }
        }
    }

    public final void d(int i, fjc fjcVar) {
        j();
        ((ArrayDeque) this.h).add(new d50((Object) new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f), i, (Object) fjcVar, (byte) 5));
    }

    public final void e() {
        j();
        synchronized (this.i) {
            this.a = true;
        }
        Iterator it = ((CopyOnWriteArraySet) this.f).iterator();
        while (it.hasNext()) {
            hjc hjcVar = (hjc) it.next();
            gjc gjcVar = (gjc) this.e;
            hjcVar.d = true;
            if (gjcVar != null && hjcVar.c) {
                hjcVar.c = false;
                gjcVar.o(hjcVar.a, hjcVar.b.j());
            }
        }
        ((CopyOnWriteArraySet) this.f).clear();
    }

    public final void f(eig eigVar) {
        j();
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            hjc hjcVar = (hjc) it.next();
            if (hjcVar.a.equals(eigVar)) {
                gjc gjcVar = (gjc) this.e;
                hjcVar.d = true;
                if (gjcVar != null && hjcVar.c) {
                    hjcVar.c = false;
                    gjcVar.o(hjcVar.a, hjcVar.b.j());
                }
                copyOnWriteArraySet.remove(hjcVar);
            }
        }
    }

    public final void g() {
        int i;
        ez9 ez9Var = (ez9) this.d;
        Context context = (Context) this.c;
        PackageManager packageManager = (PackageManager) this.f;
        ArrayList arrayList = (ArrayList) this.g;
        if (this.b) {
            ArrayList arrayList2 = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (!this.a || TextUtils.equals(context.getPackageName(), serviceInfo.packageName)) {
                        arrayList3.add(serviceInfo);
                    }
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it2 = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i2 = 0;
            while (true) {
                boolean zIsEmpty = true;
                if (!it2.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo2 = it2.next().serviceInfo;
                if (serviceInfo2 != null) {
                    if ((dod.c == null ? false : dod.c().i()) && !arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList2.get(i3);
                            i3++;
                            ServiceInfo serviceInfo3 = (ServiceInfo) obj;
                            if (!serviceInfo2.packageName.equals(serviceInfo3.packageName) || !serviceInfo2.name.equals(serviceInfo3.name)) {
                            }
                        }
                    }
                    String str = serviceInfo2.packageName;
                    String str2 = serviceInfo2.name;
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            i4 = -1;
                            break;
                        }
                        ComponentName componentName = ((xrh) arrayList.get(i4)).i;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i4 < 0) {
                        xrh xrhVar = new xrh(context, new ComponentName(serviceInfo2.packageName, serviceInfo2.name));
                        xrhVar.p = new r9g(this, xrhVar);
                        if (!xrhVar.l) {
                            xrhVar.l = true;
                            xrhVar.l();
                        }
                        i = i2 + 1;
                        arrayList.add(i2, xrhVar);
                        ez9Var.a(xrhVar, false);
                    } else if (i4 >= i2) {
                        xrh xrhVar2 = (xrh) arrayList.get(i4);
                        if (!xrhVar2.l) {
                            xrhVar2.l = true;
                            xrhVar2.l();
                        }
                        if (xrhVar2.n == null) {
                            if (!xrhVar2.l) {
                                zIsEmpty = false;
                            } else if (xrhVar2.e == null) {
                                zIsEmpty = true ^ xrhVar2.k.isEmpty();
                            }
                            if (zIsEmpty) {
                                xrhVar2.k();
                                xrhVar2.h();
                            }
                        }
                        i = i2 + 1;
                        Collections.swap(arrayList, i4, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < arrayList.size()) {
                for (int size3 = arrayList.size() - 1; size3 >= i2; size3--) {
                    xrh xrhVar3 = (xrh) arrayList.get(size3);
                    bod bodVarD = ez9Var.d(xrhVar3);
                    if (bodVarD != null) {
                        xrhVar3.getClass();
                        dod.b();
                        xrhVar3.d = null;
                        xrhVar3.g(null);
                        ez9Var.p(bodVarD, null);
                        ez9Var.a.b(514, bodVarD);
                        ez9Var.m.remove(bodVarD);
                    }
                    arrayList.remove(xrhVar3);
                    xrhVar3.p = null;
                    if (xrhVar3.l) {
                        xrhVar3.l = false;
                        xrhVar3.l();
                    }
                }
            }
        }
    }

    public final void h() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((njm) this.e).b();
    }

    public final void i(int i, fjc fjcVar) {
        d(i, fjcVar);
        c();
    }

    public final void j() {
        if (this.b) {
            z4o.H(Thread.currentThread() == ((Thread) this.c));
        }
    }
}
