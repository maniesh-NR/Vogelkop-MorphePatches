package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.google.android.gms.internal.cast.zzbt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ez9 {
    public int A;
    public dnd B;
    public dnd C;
    public int D;
    public g77 E;
    public cpd F;
    public final eq6 G;
    public final ijc c;
    public cod d;
    public snd e;
    public zzbt f;
    public aod g;
    public final Context h;
    public final pw7 o;
    public final xm5 p;
    public final boolean q;
    public final boolean r;
    public jmd s;
    public final kgg t;
    public final eod u;
    public god v;
    public cod w;
    public cod x;
    public cod y;
    public rnd z;
    public final az9 a = new az9(this);
    public final HashMap b = new HashMap();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public final HashMap l = new HashMap();
    public final ArrayList m = new ArrayList();
    public final ArrayList n = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ez9(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez9.<init>(android.content.Context):void");
    }

    public final void a(und undVar, boolean z) {
        if (d(undVar) == null) {
            bod bodVar = new bod(undVar, z);
            this.m.add(bodVar);
            this.a.b(513, bodVar);
            p(bodVar, undVar.g);
            dod.b();
            undVar.d = this.p;
            undVar.g(this.B);
        }
    }

    public final String b(bod bodVar, String str) {
        String strFlattenToShortString = ((ComponentName) bodVar.d.b).flattenToShortString();
        boolean z = bodVar.c;
        String strV = z ? str : sko.v(strFlattenToShortString, ":", str);
        HashMap map = this.l;
        if (!z) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                if (((cod) arrayList.get(i)).c.equals(strV)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                int i2 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = strV + "_" + i2;
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            i3 = -1;
                            break;
                        }
                        if (((cod) arrayList.get(i3)).c.equals(str2)) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 < 0) {
                        map.put(new lyf(strFlattenToShortString, str), str2);
                        return str2;
                    }
                    i2++;
                }
            }
        }
        map.put(new lyf(strFlattenToShortString, str), strV);
        return strV;
    }

    public final cod c() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            cod codVar = (cod) obj;
            if (codVar != this.w && codVar.c() == this.t && codVar.m("android.media.intent.category.LIVE_AUDIO") && !codVar.m("android.media.intent.category.LIVE_VIDEO") && codVar.f()) {
                return codVar;
            }
        }
        return this.w;
    }

    public final bod d(und undVar) {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            bod bodVar = (bod) obj;
            if (bodVar.a == undVar) {
                return bodVar;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.k.values().iterator();
        if (it.hasNext()) {
            throw p3p.g(it);
        }
        return arrayList;
    }

    public final void f() {
        Iterator it = this.k.values().iterator();
        if (it.hasNext()) {
            throw p3p.g(it);
        }
    }

    public final snd g(cod codVar) {
        snd sndVar;
        if (codVar == this.d && (sndVar = this.e) != null) {
            return sndVar;
        }
        if ((codVar instanceof ynd) && ((ynd) codVar).n()) {
            f();
            return null;
        }
        snd sndVar2 = (snd) this.b.get(codVar.c);
        if (sndVar2 != null) {
            return sndVar2;
        }
        Iterator it = this.k.values().iterator();
        if (it.hasNext()) {
            throw p3p.g(it);
        }
        return sndVar2;
    }

    public final cod h() {
        cod codVar = this.d;
        if (codVar != null) {
            return codVar;
        }
        qp2.n("There is no currently selected route.  The media router has not yet been fully initialized.");
        return null;
    }

    public final boolean i() {
        god godVar = this.v;
        if (this.r) {
            return godVar == null || godVar.a;
        }
        if (godVar == null || !godVar.b) {
            return false;
        }
        return godVar.a;
    }

    public final void j() {
        snd sndVarD;
        if (this.d.e()) {
            List<cod> listUnmodifiableList = Collections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((cod) it.next()).c);
            }
            HashMap map = this.b;
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    snd sndVar = (snd) entry.getValue();
                    sndVar.h(0);
                    sndVar.d();
                    it2.remove();
                }
            }
            for (cod codVar : listUnmodifiableList) {
                if (!map.containsKey(codVar.c) && (sndVarD = codVar.c().d(codVar.b, this.d.b)) != null) {
                    sndVarD.e();
                    map.put(codVar.c, sndVarD);
                }
            }
        }
    }

    public final void k(ez9 ez9Var, cod codVar, snd sndVar, int i, int i2, boolean z, cod codVar2, ArrayList arrayList) {
        zzbt zzbtVar;
        aod aodVar = this.g;
        if (aodVar != null) {
            aodVar.a();
            this.g = null;
        }
        aod aodVar2 = new aod(ez9Var, codVar, sndVar, i, i2, z, codVar2, arrayList);
        this.g = aodVar2;
        if (aodVar2.b != 3 || (zzbtVar = this.f) == null) {
            aodVar2.b();
            return;
        }
        ListenableFuture listenableFutureOnPrepareTransfer = zzbtVar.onPrepareTransfer(this.d, aodVar2.e);
        aod aodVar3 = this.g;
        if (listenableFutureOnPrepareTransfer == null) {
            aodVar3.b();
            return;
        }
        ez9 ez9Var2 = (ez9) aodVar3.h.get();
        if (ez9Var2 == null || ez9Var2.g != aodVar3) {
            aodVar3.a();
            return;
        }
        if (aodVar3.i != null) {
            qp2.n("future is already set");
            return;
        }
        aodVar3.i = listenableFutureOnPrepareTransfer;
        znd zndVar = new znd(aodVar3, (byte) 1);
        az9 az9Var = ez9Var2.a;
        Objects.requireNonNull(az9Var);
        listenableFutureOnPrepareTransfer.addListener(zndVar, new k31(az9Var, (byte) 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        if (r0 != 2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.cod r4, int r5, int r6, boolean r7) {
        /*
            r3 = this;
            java.util.ArrayList r0 = r3.j
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto Lc
            java.util.Objects.toString(r4)
            return
        Lc:
            boolean r0 = r4.g
            if (r0 != 0) goto L14
            r4.toString()
            return
        L14:
            cod r0 = r3.d
            if (r0 == r4) goto L45
            if (r0 == 0) goto L1f
            ynd r0 = r0.a()
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L49
            java.util.ArrayList r1 = r0.v
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            int r1 = r1.size()
            r2 = 1
            if (r1 != r2) goto L49
            androidx.collection.ArrayMap r0 = r0.x
            java.lang.String r1 = r4.c
            java.lang.Object r0 = r0.get(r1)
            qnd r0 = (defpackage.qnd) r0
            if (r0 == 0) goto L3e
            int r0 = r0.b
            goto L3f
        L3e:
            r0 = 4
        L3f:
            r1 = 3
            if (r0 == r1) goto L45
            r1 = 2
            if (r0 != r1) goto L49
        L45:
            r4.toString()
            return
        L49:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L61
            und r0 = r4.c()
            jmd r1 = r3.s
            if (r0 != r1) goto L61
            cod r0 = r3.d
            if (r0 == r4) goto L61
            java.lang.String r3 = r4.b
            r1.m(r3)
            return
        L61:
            r3.m(r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez9.l(cod, int, int, boolean):void");
    }

    public final void m(cod codVar, int i, int i2, boolean z) {
        mi9 mi9Var;
        if (this.d == codVar) {
            return;
        }
        boolean z2 = codVar == this.w;
        if (this.x != null && z2) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i3 = 3; i3 < stackTrace.length; i3++) {
                StackTraceElement stackTraceElement = stackTrace[i3];
                stackTraceElement.getClassName();
                stackTraceElement.getMethodName();
                stackTraceElement.getLineNumber();
            }
            if (this.d != null) {
                Locale locale = Locale.US;
                dod.b();
                cod codVar2 = dod.c().x;
            }
            this.h.getPackageName();
        }
        if (this.y != null) {
            this.y = null;
            rnd rndVar = this.z;
            if (rndVar != null) {
                rndVar.h(3);
                this.z.d();
                this.z = null;
            }
            this.A = 0;
        }
        if (i() && (mi9Var = codVar.a.e) != null && mi9Var.c) {
            und undVarC = codVar.c();
            String str = codVar.b;
            Bundle bundle = new Bundle();
            bundle.putString("clientPackageName", this.h.getPackageName());
            rnd rndVarA = undVarC.a(str, new tnd(bundle));
            if (rndVarA != null) {
                Executor mainExecutor = this.h.getMainExecutor();
                eq6 eq6Var = this.G;
                synchronized (rndVarA.a) {
                    if (mainExecutor == null) {
                        throw new NullPointerException("Executor shouldn't be null");
                    }
                    if (eq6Var == null) {
                        throw new NullPointerException("Listener shouldn't be null");
                    }
                    rndVarA.b = mainExecutor;
                    rndVarA.c = eq6Var;
                    ArrayList arrayList = rndVarA.e;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        bnd bndVar = rndVarA.d;
                        ArrayList arrayList2 = rndVarA.e;
                        rndVarA.d = null;
                        rndVarA.e = null;
                        rndVarA.b.execute(new pnd(rndVarA, eq6Var, bndVar, arrayList2, (byte) 1));
                    }
                }
                this.y = codVar;
                this.z = rndVarA;
                this.A = i2;
                rndVarA.e();
                return;
            }
            codVar.toString();
        }
        und undVarC2 = codVar.c();
        String str2 = codVar.b;
        Bundle bundle2 = new Bundle();
        bundle2.putString("clientPackageName", this.h.getPackageName());
        snd sndVarC = undVarC2.c(str2, new tnd(bundle2));
        if (sndVarC != null) {
            sndVarC.e();
        }
        if (this.d != null) {
            k(this, codVar, sndVarC, i, i2, z, null, null);
            return;
        }
        this.d = codVar;
        this.e = sndVarC;
        sa2 sa2Var = new sa2((byte) 16);
        sa2Var.b = i;
        jzi jziVar = new jzi(sa2Var);
        az9 az9Var = this.a;
        az9Var.getClass();
        Message messageObtainMessage = az9Var.obtainMessage(262, new dz9(null, codVar, jziVar, z));
        messageObtainMessage.arg1 = jziVar.a;
        messageObtainMessage.sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez9.n():void");
    }

    public final void o() {
        cod codVar = this.d;
        if (codVar == null) {
            g77 g77Var = this.E;
            if (g77Var != null) {
                g77Var.g();
                return;
            }
            return;
        }
        int i = codVar.p;
        pw7 pw7Var = this.o;
        pw7Var.b = i;
        pw7Var.c = codVar.q;
        pw7Var.d = (!codVar.e() || dod.h()) ? codVar.o : 0;
        pw7Var.e = this.d.m;
        if (i() && this.d.c() == this.s) {
            pw7Var.f = jmd.j(this.e);
        } else {
            pw7Var.f = null;
        }
        Iterator it = this.n.iterator();
        if (it.hasNext()) {
            throw p3p.g(it);
        }
        g77 g77Var2 = this.E;
        if (g77Var2 != null) {
            cod codVar2 = this.d;
            cod codVar3 = this.w;
            if (codVar3 == null) {
                qp2.n("There is no default route.  The media router has not yet been fully initialized.");
                return;
            }
            if (codVar2 == codVar3 || codVar2 == this.x) {
                g77Var2.g();
                return;
            }
            byte b = pw7Var.d == 1 ? (byte) 2 : (byte) 0;
            int i2 = pw7Var.c;
            int i3 = pw7Var.b;
            String str = (String) pw7Var.f;
            cpd cpdVar = (cpd) g77Var2.a;
            if (cpdVar != null) {
                cz9 cz9Var = (cz9) g77Var2.b;
                if (cz9Var != null && b == 0 && i2 == 0) {
                    cz9Var.b = i3;
                    cz9Var.b().setCurrentVolume(i3);
                    return;
                }
                cz9 cz9Var2 = new cz9();
                cz9Var2.f = g77Var2;
                cz9Var2.d = b;
                cz9Var2.a = i2;
                cz9Var2.b = i3;
                cz9Var2.c = str;
                g77Var2.b = cz9Var2;
                cpdVar.a.a.setPlaybackToRemote(cz9Var2.b());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103 A[LOOP:5: B:50:0x0101->B:51:0x0103, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0158 A[LOOP:1: B:63:0x0156->B:64:0x0158, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0173 A[LOOP:2: B:66:0x0171->B:67:0x0173, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.bod r19, defpackage.mi9 r20) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez9.p(bod, mi9):void");
    }

    public final int q(cod codVar, bnd bndVar) {
        int i = codVar.i(bndVar);
        if (i != 0) {
            int i2 = i & 1;
            az9 az9Var = this.a;
            if (i2 != 0) {
                az9Var.b(259, codVar);
            }
            if ((i & 2) != 0) {
                az9Var.b(260, codVar);
            }
            if ((i & 4) != 0) {
                az9Var.b(261, codVar);
            }
        }
        return i;
    }

    public final void r(boolean z) {
        cod codVar = this.w;
        if (codVar != null && !codVar.f()) {
            Objects.toString(this.w);
            this.w = null;
        }
        cod codVar2 = this.w;
        kgg kggVar = this.t;
        ArrayList arrayList = this.j;
        if (codVar2 == null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                cod codVar3 = (cod) obj;
                if (codVar3.c() == kggVar && codVar3.b.equals("DEFAULT_ROUTE") && codVar3.f()) {
                    this.w = codVar3;
                    Objects.toString(codVar3);
                    break;
                }
            }
        }
        cod codVar4 = this.x;
        if (codVar4 != null && !codVar4.f()) {
            Objects.toString(this.x);
            this.x = null;
        }
        if (this.x == null) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i2);
                i2++;
                cod codVar5 = (cod) obj2;
                if (codVar5.c() == kggVar && codVar5.m("android.media.intent.category.LIVE_AUDIO") && !codVar5.m("android.media.intent.category.LIVE_VIDEO") && codVar5.f()) {
                    this.x = codVar5;
                    Objects.toString(codVar5);
                    break;
                }
            }
        }
        cod codVar6 = this.d;
        if (codVar6 == null || !codVar6.f()) {
            Objects.toString(this.d);
            m(c(), 1, 3, false);
        } else if (z) {
            j();
            o();
        }
    }
}
