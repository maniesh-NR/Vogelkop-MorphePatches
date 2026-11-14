package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class az9 extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ ez9 c;

    public az9(ez9 ez9Var) {
        this.c = ez9Var;
    }

    public static void a(xnd xndVar, int i, Object obj, int i2) {
        jzi jziVar;
        cod codVar;
        cod codVar2;
        dod dodVar = xndVar.a;
        wnd wndVar = xndVar.b;
        int i3 = 65280 & i;
        if (i3 != 256) {
            if (i3 != 512) {
                if (i3 == 768 && i == 769) {
                    wndVar.onRouterParamsChanged(dodVar, (god) obj);
                    return;
                }
                return;
            }
            bod bodVar = (bod) obj;
            switch (i) {
                case 513:
                    wndVar.onProviderAdded(dodVar, bodVar);
                    return;
                case 514:
                    wndVar.onProviderRemoved(dodVar, bodVar);
                    return;
                case 515:
                    wndVar.onProviderChanged(dodVar, bodVar);
                    return;
                default:
                    return;
            }
        }
        if (i == 264 || i == 262) {
            dz9 dz9Var = (dz9) obj;
            cod codVar3 = dz9Var.b;
            cod codVar4 = dz9Var.a;
            jziVar = dz9Var.d;
            codVar = codVar3;
            codVar2 = codVar4;
        } else {
            if (i == 265 || i == 266) {
                throw sko.g(obj);
            }
            codVar = (cod) obj;
            codVar2 = null;
            jziVar = null;
        }
        if (codVar != null) {
            boolean zD = true;
            if ((xndVar.d & 2) == 0 && !codVar.h(xndVar.c)) {
                god godVar = dod.c().v;
                zD = ((godVar == null ? false : godVar.d) && codVar.d() && i == 262 && i2 == 3 && codVar2 != null) ? true ^ codVar2.d() : false;
            }
            if (zD) {
                switch (i) {
                    case 257:
                        wndVar.onRouteAdded(dodVar, codVar);
                        return;
                    case 258:
                        wndVar.onRouteRemoved(dodVar, codVar);
                        return;
                    case 259:
                        wndVar.onRouteChanged(dodVar, codVar);
                        return;
                    case 260:
                        wndVar.onRouteVolumeChanged(dodVar, codVar);
                        return;
                    case 261:
                        wndVar.onRoutePresentationDisplayChanged(dodVar, codVar);
                        return;
                    case 262:
                        wndVar.onRouteSelected(dodVar, codVar, codVar, jziVar);
                        return;
                    case 263:
                        wndVar.onRouteUnselected(dodVar, codVar, i2);
                        return;
                    case 264:
                        wndVar.onRouteSelected(dodVar, codVar, codVar2, jziVar);
                        return;
                    case 265:
                        wndVar.onRouteConnected(dodVar, codVar2, codVar);
                        return;
                    case 266:
                        wndVar.onRouteDisconnected(dodVar, codVar2, codVar, i2);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public final void b(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int iK;
        ArrayList arrayList = this.a;
        ez9 ez9Var = this.c;
        ArrayList arrayList2 = ez9Var.i;
        kgg kggVar = ez9Var.t;
        int i = message.what;
        Object obj = message.obj;
        int i2 = message.arg1;
        if (i == 259 && ez9Var.h().c.equals(((cod) obj).c)) {
            ez9Var.r(true);
        }
        int i3 = 0;
        ArrayList arrayList3 = this.b;
        if (i == 262) {
            dz9 dz9Var = (dz9) obj;
            cod codVar = dz9Var.b;
            if (dz9Var.c) {
                kggVar.p(codVar);
            }
            if (ez9Var.w != null && codVar.d()) {
                int size = arrayList3.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList3.get(i4);
                    i4++;
                    kggVar.o((cod) obj2);
                }
                arrayList3.clear();
            }
        } else if (i != 264) {
            switch (i) {
                case 257:
                    kggVar.n((cod) obj);
                    break;
                case 258:
                    kggVar.o((cod) obj);
                    break;
                case 259:
                    cod codVar2 = (cod) obj;
                    kggVar.getClass();
                    if (codVar2.c() != kggVar && (iK = kggVar.k(codVar2)) >= 0) {
                        kgg.t((ngg) kggVar.r.get(iK));
                        break;
                    }
                    break;
            }
        } else {
            dz9 dz9Var2 = (dz9) obj;
            cod codVar3 = dz9Var2.b;
            arrayList3.add(codVar3);
            kggVar.n(codVar3);
            if (dz9Var2.c) {
                kggVar.p(codVar3);
            }
        }
        try {
            int size2 = arrayList2.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    int size3 = arrayList.size();
                    while (i3 < size3) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        a((xnd) obj3, i, obj, i2);
                    }
                    return;
                }
                dod dodVar = (dod) ((WeakReference) arrayList2.get(size2)).get();
                if (dodVar == null) {
                    arrayList2.remove(size2);
                } else {
                    arrayList.addAll(dodVar.b);
                }
            }
        } finally {
            arrayList.clear();
        }
    }
}
