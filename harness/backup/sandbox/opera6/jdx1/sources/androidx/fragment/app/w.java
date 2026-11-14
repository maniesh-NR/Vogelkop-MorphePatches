package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.w;
import defpackage.bm9;
import defpackage.cm9;
import defpackage.di;
import defpackage.dzc;
import defpackage.e06;
import defpackage.em9;
import defpackage.gm9;
import defpackage.hdf;
import defpackage.hl9;
import defpackage.kcf;
import defpackage.kp5;
import defpackage.lcf;
import defpackage.ltd;
import defpackage.mm9;
import defpackage.ncf;
import defpackage.ndc;
import defpackage.o18;
import defpackage.ol9;
import defpackage.pki;
import defpackage.qcc;
import defpackage.qdc;
import defpackage.ql9;
import defpackage.qp5;
import defpackage.r16;
import defpackage.rki;
import defpackage.rl9;
import defpackage.sh;
import defpackage.sl9;
import defpackage.t3p;
import defpackage.tcc;
import defpackage.tl9;
import defpackage.ul9;
import defpackage.vcf;
import defpackage.vm9;
import defpackage.w7n;
import defpackage.wcf;
import defpackage.wl9;
import defpackage.x1p;
import defpackage.xl9;
import defpackage.xm9;
import defpackage.y51;
import defpackage.yh;
import defpackage.z1m;
import defpackage.z8b;
import defpackage.zh;
import defpackage.zl9;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class w {
    public Fragment A;
    public ol9 B;
    public final ul9 C;
    public final r16 D;
    public yh E;
    public yh F;
    public yh G;
    public ArrayDeque H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public ArrayList N;
    public ArrayList O;
    public ArrayList P;
    public x Q;
    public final vl9 R;
    public boolean b;
    public ArrayList e;
    public kcf g;
    public final z8b p;
    public final CopyOnWriteArrayList q;
    public final sl9 r;
    public final sl9 s;
    public final sl9 t;
    public final sl9 u;
    public final tl9 v;
    public int w;
    public ql9 x;
    public hl9 y;
    public Fragment z;
    public final ArrayList a = new ArrayList();
    public final a0 c = new a0();
    public ArrayList d = new ArrayList();
    public final t f = new t(this);
    public a h = null;
    public boolean i = false;
    public final u j = new u(this);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());
    public final Map n = Collections.synchronizedMap(new HashMap());
    public final ArrayList o = new ArrayList();

    /* JADX WARN: Type inference failed for: r1v12, types: [sl9] */
    /* JADX WARN: Type inference failed for: r1v13, types: [sl9] */
    /* JADX WARN: Type inference failed for: r1v14, types: [sl9] */
    /* JADX WARN: Type inference failed for: r1v15, types: [sl9] */
    public w() {
        z8b z8bVar = new z8b();
        z8bVar.a = this;
        z8bVar.b = new CopyOnWriteArrayList();
        this.p = z8bVar;
        this.q = new CopyOnWriteArrayList();
        final byte b = 0;
        this.r = new qp5(this) { // from class: sl9
            public final /* synthetic */ w b;

            {
                this.b = this;
            }

            @Override // defpackage.qp5
            public final void accept(Object obj) {
                byte b2 = b;
                w wVar = this.b;
                switch (b2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (wVar.P()) {
                            wVar.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (wVar.P() && num.intValue() == 80) {
                            wVar.m(false);
                            break;
                        }
                        break;
                    case 2:
                        lce lceVar = (lce) obj;
                        if (wVar.P()) {
                            wVar.n(lceVar.a, false);
                            break;
                        }
                        break;
                    default:
                        qeg qegVar = (qeg) obj;
                        if (wVar.P()) {
                            wVar.s(qegVar.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.s = new qp5(this) { // from class: sl9
            public final /* synthetic */ w b;

            {
                this.b = this;
            }

            @Override // defpackage.qp5
            public final void accept(Object obj) {
                byte b22 = b2;
                w wVar = this.b;
                switch (b22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (wVar.P()) {
                            wVar.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (wVar.P() && num.intValue() == 80) {
                            wVar.m(false);
                            break;
                        }
                        break;
                    case 2:
                        lce lceVar = (lce) obj;
                        if (wVar.P()) {
                            wVar.n(lceVar.a, false);
                            break;
                        }
                        break;
                    default:
                        qeg qegVar = (qeg) obj;
                        if (wVar.P()) {
                            wVar.s(qegVar.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final byte b3 = 2;
        this.t = new qp5(this) { // from class: sl9
            public final /* synthetic */ w b;

            {
                this.b = this;
            }

            @Override // defpackage.qp5
            public final void accept(Object obj) {
                byte b22 = b3;
                w wVar = this.b;
                switch (b22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (wVar.P()) {
                            wVar.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (wVar.P() && num.intValue() == 80) {
                            wVar.m(false);
                            break;
                        }
                        break;
                    case 2:
                        lce lceVar = (lce) obj;
                        if (wVar.P()) {
                            wVar.n(lceVar.a, false);
                            break;
                        }
                        break;
                    default:
                        qeg qegVar = (qeg) obj;
                        if (wVar.P()) {
                            wVar.s(qegVar.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final byte b4 = 3;
        this.u = new qp5(this) { // from class: sl9
            public final /* synthetic */ w b;

            {
                this.b = this;
            }

            @Override // defpackage.qp5
            public final void accept(Object obj) {
                byte b22 = b4;
                w wVar = this.b;
                switch (b22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (wVar.P()) {
                            wVar.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (wVar.P() && num.intValue() == 80) {
                            wVar.m(false);
                            break;
                        }
                        break;
                    case 2:
                        lce lceVar = (lce) obj;
                        if (wVar.P()) {
                            wVar.n(lceVar.a, false);
                            break;
                        }
                        break;
                    default:
                        qeg qegVar = (qeg) obj;
                        if (wVar.P()) {
                            wVar.s(qegVar.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.v = new tl9(this);
        this.w = -1;
        this.B = null;
        this.C = new ul9(this, (byte) 0);
        this.D = new r16();
        this.H = new ArrayDeque();
        this.R = new vl9(this, (byte) 0);
    }

    public static HashSet H(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < aVar.c.size(); i++) {
            Fragment fragment = ((xm9) aVar.c.get(i)).b;
            if (fragment != null && aVar.i) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public static boolean N(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean O(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        ArrayList arrayListE = fragment.mChildFragmentManager.c.e();
        int size = arrayListE.size();
        boolean zO = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            Fragment fragment2 = (Fragment) obj;
            if (fragment2 != null) {
                zO = O(fragment2);
            }
            if (zO) {
                return true;
            }
        }
        return false;
    }

    public static boolean Q(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        w wVar = fragment.mFragmentManager;
        return fragment.equals(wVar.A) && Q(wVar.z);
    }

    public final boolean A(boolean z) {
        boolean zA;
        a aVar;
        z(z);
        if (!this.i && (aVar = this.h) != null) {
            aVar.u = false;
            aVar.g();
            if (N(3)) {
                Objects.toString(this.h);
                Objects.toString(this.a);
            }
            this.h.i(false, false);
            this.a.add(0, this.h);
            ArrayList arrayList = this.h.c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Fragment fragment = ((xm9) obj).b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.h = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.N;
            ArrayList arrayList3 = this.O;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size2 = this.a.size();
                        zA = false;
                        for (int i2 = 0; i2 < size2; i2++) {
                            zA |= ((bm9) this.a.get(i2)).a(arrayList2, arrayList3);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                o0();
                v();
                this.c.b.values().removeAll(Collections.singleton(null));
                return z2;
            }
            z2 = true;
            this.b = true;
            try {
                d0(this.N, this.O);
            } finally {
                d();
            }
        }
    }

    public final void B(a aVar, boolean z) {
        if (z && (this.x == null || this.L)) {
            return;
        }
        z(z);
        a aVar2 = this.h;
        if (aVar2 != null) {
            aVar2.u = false;
            aVar2.g();
            if (N(3)) {
                Objects.toString(this.h);
                Objects.toString(aVar);
            }
            this.h.i(false, false);
            this.h.a(this.N, this.O);
            ArrayList arrayList = this.h.c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Fragment fragment = ((xm9) obj).b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.h = null;
        }
        aVar.a(this.N, this.O);
        this.b = true;
        try {
            d0(this.N, this.O);
            d();
            o0();
            v();
            this.c.b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x021c A[PHI: r15
      0x021c: PHI (r15v14 int) = (r15v13 int), (r15v16 int) binds: [B:100:0x0209, B:104:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(java.util.ArrayList r27, java.util.ArrayList r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 1368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w.C(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final void D() {
        A(true);
        G();
    }

    public final Fragment E(int i) {
        a0 a0Var = this.c;
        ArrayList arrayList = a0Var.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (z zVar : a0Var.b.values()) {
            if (zVar != null) {
                Fragment fragment2 = zVar.c;
                if (fragment2.mFragmentId == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment F(String str) {
        a0 a0Var = this.c;
        ArrayList arrayList = a0Var.a;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (z zVar : a0Var.b.values()) {
            if (zVar != null) {
                Fragment fragment2 = zVar.c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final void G() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar.f) {
                hVar.f = false;
                hVar.e();
            }
        }
    }

    public final a I(int i) {
        if (i != this.d.size()) {
            return (a) this.d.get(i);
        }
        a aVar = this.h;
        if (aVar != null) {
            return aVar;
        }
        t3p.t();
        return null;
    }

    public final int J() {
        return this.d.size() + (this.h != null ? 1 : 0);
    }

    public final ViewGroup K(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.y.c()) {
            return null;
        }
        View viewB = this.y.b(fragment.mContainerId);
        if (viewB instanceof ViewGroup) {
            return (ViewGroup) viewB;
        }
        return null;
    }

    public final ol9 L() {
        ol9 ol9Var = this.B;
        if (ol9Var != null) {
            return ol9Var;
        }
        Fragment fragment = this.z;
        return fragment != null ? fragment.mFragmentManager.L() : this.C;
    }

    public final r16 M() {
        Fragment fragment = this.z;
        return fragment != null ? fragment.mFragmentManager.M() : this.D;
    }

    public final boolean P() {
        Fragment fragment = this.z;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.z.getParentFragmentManager().P();
    }

    public final boolean R() {
        return this.J || this.K;
    }

    public final void S(int i, boolean z) {
        ql9 ql9Var;
        if (this.x == null && i != -1) {
            qp2.n("No activity");
            return;
        }
        if (z || i != this.w) {
            this.w = i;
            a0 a0Var = this.c;
            HashMap map = a0Var.b;
            ArrayList arrayList = a0Var.a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                z zVar = (z) map.get(((Fragment) obj).mWho);
                if (zVar != null) {
                    zVar.i();
                }
            }
            for (z zVar2 : map.values()) {
                if (zVar2 != null) {
                    zVar2.i();
                    Fragment fragment = zVar2.c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !a0Var.c.containsKey(fragment.mWho)) {
                            a0Var.i(zVar2.l(), fragment.mWho);
                        }
                        a0Var.h(zVar2);
                    }
                }
            }
            m0();
            if (this.I && (ql9Var = this.x) != null && this.w == 7) {
                ((q) ql9Var).e.invalidateMenu();
                this.I = false;
            }
        }
    }

    public final void T() {
        if (this.x != null) {
            this.J = false;
            this.K = false;
            this.Q.g = false;
            for (Fragment fragment : this.c.f()) {
                if (fragment != null) {
                    fragment.noteStateNotSaved();
                }
            }
        }
    }

    public final void U() {
        y(new cm9(this, null, -1, 0), false);
    }

    public final void V(int i, String str) {
        y(new cm9(this, str, -1, i), false);
    }

    public final void W(int i, boolean z) {
        if (i >= 0) {
            y(new cm9(this, null, i, 1), z);
        } else {
            qp2.o(sko.i(i, "Bad id: "));
        }
    }

    public final boolean X() {
        return Y(-1, 0, null);
    }

    public final boolean Y(int i, int i2, String str) {
        A(false);
        z(true);
        Fragment fragment = this.A;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().X()) {
            return true;
        }
        boolean Z = Z(this.N, this.O, str, i, i2);
        if (Z) {
            this.b = true;
            try {
                d0(this.N, this.O);
            } finally {
                d();
            }
        }
        o0();
        v();
        this.c.b.values().removeAll(Collections.singleton(null));
        return Z;
    }

    public final boolean Z(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        int size = -1;
        if (!this.d.isEmpty()) {
            if (str != null || i >= 0) {
                int size2 = this.d.size() - 1;
                while (size2 >= 0) {
                    a aVar = (a) this.d.get(size2);
                    if ((str != null && str.equals(aVar.k)) || (i >= 0 && i == aVar.v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        a aVar2 = (a) this.d.get(size - 1);
                        if ((str == null || !str.equals(aVar2.k)) && (i < 0 || i != aVar2.v)) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.d.size() - 1) {
                    size = size2 + 1;
                }
            } else {
                size = z ? 0 : this.d.size() - 1;
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.d.size() - 1; size3 >= size; size3--) {
            arrayList.add((a) this.d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final z a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            vm9.c(fragment, str);
        }
        if (N(2)) {
            fragment.toString();
        }
        z zVarG = g(fragment);
        fragment.mFragmentManager = this;
        a0 a0Var = this.c;
        a0Var.g(zVarG);
        if (!fragment.mDetached) {
            a0Var.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (O(fragment)) {
                this.I = true;
            }
        }
        return zVarG;
    }

    public final void a0(Bundle bundle, Fragment fragment, String str) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            n0(new IllegalStateException(o18.o("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(ql9 ql9Var, hl9 hl9Var, Fragment fragment) {
        x xVar;
        if (this.x != null) {
            qp2.n("Already attached");
            return;
        }
        this.x = ql9Var;
        this.y = hl9Var;
        this.z = fragment;
        CopyOnWriteArrayList copyOnWriteArrayList = this.q;
        if (fragment != null) {
            copyOnWriteArrayList.add(new xl9(fragment));
        } else if (ql9Var instanceof gm9) {
            copyOnWriteArrayList.add((gm9) ql9Var);
        }
        if (this.z != null) {
            o0();
        }
        if (ql9Var instanceof lcf) {
            lcf lcfVar = (lcf) ql9Var;
            kcf onBackPressedDispatcher = lcfVar.getOnBackPressedDispatcher();
            this.g = onBackPressedDispatcher;
            ndc ndcVar = lcfVar;
            if (fragment != null) {
                ndcVar = fragment;
            }
            onBackPressedDispatcher.a(ndcVar, this.j);
        }
        byte b = 0;
        if (fragment != null) {
            x xVar2 = fragment.mFragmentManager.Q;
            HashMap map = xVar2.c;
            xVar = (x) map.get(fragment.mWho);
            if (xVar == null) {
                xVar = new x(xVar2.e);
                map.put(fragment.mWho, xVar);
            }
            this.Q = xVar;
        } else if (ql9Var instanceof w7n) {
            plk plkVar = new plk(((w7n) ql9Var).getViewModelStore(), x.h, e06.b);
            s15 s15VarA = uqh.a(x.class);
            String strB = s15VarA.b();
            if (strB == null) {
                qp2.o("Local and anonymous classes can not be ViewModels");
                return;
            } else {
                xVar = (x) plkVar.n(s15VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                this.Q = xVar;
            }
        } else {
            xVar = new x(false);
            this.Q = xVar;
        }
        xVar.g = R();
        this.c.d = this.Q;
        Object obj = this.x;
        byte b2 = 3;
        if ((obj instanceof rki) && fragment == null) {
            pki savedStateRegistry = ((rki) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new y51(this, b2));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                e0(bundleA);
            }
        }
        Object obj2 = this.x;
        if (obj2 instanceof di) {
            zh activityResultRegistry = ((di) obj2).getActivityResultRegistry();
            String strConcat = "FragmentManager:".concat(fragment != null ? z1m.l(new StringBuilder(), fragment.mWho, ":") : "");
            this.E = activityResultRegistry.c(strConcat.concat("StartActivityForResult"), new sh((byte) 1), new qe6(this, (byte) 13));
            this.F = activityResultRegistry.c(strConcat.concat("StartIntentSenderForResult"), new sh(b2), new ga6(this, (byte) 13));
            this.G = activityResultRegistry.c(strConcat.concat("RequestPermissions"), new sh(b), new d06(this));
        }
        Object obj3 = this.x;
        if (obj3 instanceof ncf) {
            ((ncf) obj3).addOnConfigurationChangedListener(this.r);
        }
        Object obj4 = this.x;
        if (obj4 instanceof hdf) {
            ((hdf) obj4).addOnTrimMemoryListener(this.s);
        }
        Object obj5 = this.x;
        if (obj5 instanceof vcf) {
            ((vcf) obj5).addOnMultiWindowModeChangedListener(this.t);
        }
        Object obj6 = this.x;
        if (obj6 instanceof wcf) {
            ((wcf) obj6).addOnPictureInPictureModeChangedListener(this.u);
        }
        Object obj7 = this.x;
        if ((obj7 instanceof ltd) && fragment == null) {
            ((ltd) obj7).addMenuProvider(this.v);
        }
    }

    public final void b0(x1p x1pVar, boolean z) {
        ((CopyOnWriteArrayList) this.p.b).add(new rl9(x1pVar, z));
    }

    public final void c(Fragment fragment) {
        if (N(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.c.a(fragment);
            if (N(2)) {
                fragment.toString();
            }
            if (O(fragment)) {
                this.I = true;
            }
        }
    }

    public final void c0(Fragment fragment) {
        if (N(2)) {
            Objects.toString(fragment);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        a0 a0Var = this.c;
        synchronized (a0Var.a) {
            a0Var.a.remove(fragment);
        }
        fragment.mAdded = false;
        if (O(fragment)) {
            this.I = true;
        }
        fragment.mRemoving = true;
        l0(fragment);
    }

    public final void d() {
        this.b = false;
        this.O.clear();
        this.N.clear();
    }

    public final void d0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            qp2.n("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((a) arrayList.get(i)).r) {
                if (i2 != i) {
                    C(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((a) arrayList.get(i2)).r) {
                        i2++;
                    }
                }
                C(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            C(arrayList, arrayList2, i2, size);
        }
    }

    public final HashSet e() {
        h hVar;
        HashSet hashSet = new HashSet();
        ArrayList arrayListD = this.c.d();
        int size = arrayListD.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListD.get(i);
            i++;
            ViewGroup viewGroup = ((z) obj).c.mContainer;
            if (viewGroup != null) {
                r16 r16VarM = M();
                Object tag = viewGroup.getTag(2131364518);
                if (tag instanceof h) {
                    hVar = (h) tag;
                } else {
                    r16VarM.getClass();
                    hVar = new h(viewGroup);
                    viewGroup.setTag(2131364518, hVar);
                }
                hashSet.add(hVar);
            }
        }
        return hashSet;
    }

    public final void e0(Bundle bundle) {
        z8b z8bVar;
        int i;
        int i2;
        z zVar;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.x.b.getClassLoader());
                this.m.put(str.substring(7), bundle4);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.x.b.getClassLoader());
                map.put(str2.substring(9), bundle3);
            }
        }
        a0 a0Var = this.c;
        HashMap map2 = a0Var.c;
        HashMap map3 = a0Var.b;
        map2.clear();
        map2.putAll(map);
        em9 em9Var = (em9) bundle.getParcelable("state");
        if (em9Var == null) {
            return;
        }
        map3.clear();
        ArrayList arrayList = em9Var.a;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            z8bVar = this.p;
            i = 2;
            if (i3 >= size) {
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            Bundle bundleI = a0Var.i(null, (String) obj);
            if (bundleI != null) {
                Fragment fragment = (Fragment) this.Q.b.get(((y) bundleI.getParcelable("state")).b);
                if (fragment != null) {
                    if (N(2)) {
                        fragment.toString();
                    }
                    zVar = new z(z8bVar, a0Var, fragment, bundleI);
                    bundle2 = bundleI;
                } else {
                    zVar = new z(this.p, this.c, this.x.b.getClassLoader(), L(), bundleI);
                    bundle2 = bundleI;
                }
                Fragment fragment2 = zVar.c;
                fragment2.mSavedFragmentState = bundle2;
                fragment2.mFragmentManager = this;
                if (N(2)) {
                    fragment2.toString();
                }
                zVar.j(this.x.b.getClassLoader());
                a0Var.g(zVar);
                zVar.e = this.w;
            }
        }
        x xVar = this.Q;
        xVar.getClass();
        ArrayList arrayList2 = new ArrayList(xVar.b.values());
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            Fragment fragment3 = (Fragment) obj2;
            if (map3.get(fragment3.mWho) == null) {
                if (N(2)) {
                    fragment3.toString();
                    Objects.toString(em9Var.a);
                }
                this.Q.h(fragment3);
                fragment3.mFragmentManager = this;
                z zVar2 = new z(z8bVar, a0Var, fragment3);
                zVar2.e = 1;
                zVar2.i();
                fragment3.mRemoving = true;
                zVar2.i();
            }
        }
        ArrayList arrayList3 = em9Var.b;
        a0Var.a.clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj3 = arrayList3.get(i5);
                i5++;
                String str3 = (String) obj3;
                Fragment fragmentB = a0Var.b(str3);
                if (fragmentB == null) {
                    qp2.n(sko.k("No instantiated fragment for (", str3, ")"));
                    return;
                } else {
                    if (N(2)) {
                        fragmentB.toString();
                    }
                    a0Var.a(fragmentB);
                }
            }
        }
        if (em9Var.c != null) {
            this.d = new ArrayList(em9Var.c.length);
            int i6 = 0;
            while (true) {
                b[] bVarArr = em9Var.c;
                if (i6 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i6];
                ArrayList arrayList4 = bVar.b;
                a aVar = new a(this);
                int[] iArr = bVar.a;
                int i7 = 0;
                int i8 = 0;
                while (i7 < iArr.length) {
                    xm9 xm9Var = new xm9();
                    int i9 = i7 + 1;
                    xm9Var.a = iArr[i7];
                    if (N(i)) {
                        Objects.toString(aVar);
                        int i10 = iArr[i9];
                    }
                    int i11 = i;
                    xm9Var.h = qcc.values()[bVar.c[i8]];
                    xm9Var.i = qcc.values()[bVar.d[i8]];
                    int i12 = i7 + 2;
                    xm9Var.c = iArr[i9] != 0;
                    int i13 = iArr[i12];
                    xm9Var.d = i13;
                    int i14 = iArr[i7 + 3];
                    xm9Var.e = i14;
                    int i15 = i7 + 5;
                    int i16 = iArr[i7 + 4];
                    xm9Var.f = i16;
                    i7 += 6;
                    int i17 = iArr[i15];
                    xm9Var.g = i17;
                    aVar.d = i13;
                    aVar.e = i14;
                    aVar.f = i16;
                    aVar.g = i17;
                    aVar.b(xm9Var);
                    i8++;
                    i = i11;
                }
                int i18 = i;
                aVar.h = bVar.e;
                aVar.k = bVar.f;
                aVar.i = true;
                aVar.l = bVar.h;
                aVar.m = bVar.i;
                aVar.n = bVar.j;
                aVar.o = bVar.k;
                aVar.p = bVar.l;
                aVar.q = bVar.m;
                aVar.r = bVar.n;
                aVar.v = bVar.g;
                for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                    String str4 = (String) arrayList4.get(i19);
                    if (str4 != null) {
                        ((xm9) aVar.c.get(i19)).b = a0Var.b(str4);
                    }
                }
                aVar.f(1);
                if (N(i18)) {
                    aVar.toString();
                    PrintWriter printWriter = new PrintWriter(new dzc());
                    aVar.k("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVar);
                i6++;
                i = i18;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = new ArrayList();
        }
        this.k.set(em9Var.d);
        String str5 = em9Var.e;
        if (str5 != null) {
            Fragment fragmentB2 = a0Var.b(str5);
            this.A = fragmentB2;
            r(fragmentB2);
        }
        ArrayList arrayList5 = em9Var.f;
        if (arrayList5 != null) {
            while (i2 < arrayList5.size()) {
                this.l.put((String) arrayList5.get(i2), (uz2) em9Var.g.get(i2));
                i2++;
            }
        }
        this.H = new ArrayDeque(em9Var.h);
    }

    public final HashSet f(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        h hVar;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((a) arrayList.get(i)).c;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                Fragment fragment = ((xm9) obj).b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    r16 r16VarM = M();
                    Object tag = viewGroup.getTag(2131364518);
                    if (tag instanceof h) {
                        hVar = (h) tag;
                    } else {
                        r16VarM.getClass();
                        hVar = new h(viewGroup);
                        viewGroup.setTag(2131364518, hVar);
                    }
                    hashSet.add(hVar);
                }
            }
            i++;
        }
        return hashSet;
    }

    public final Bundle f0() {
        int i;
        ArrayList arrayList;
        b[] bVarArr;
        Bundle bundle = new Bundle();
        G();
        x();
        A(true);
        this.J = true;
        this.Q.g = true;
        a0 a0Var = this.c;
        a0Var.getClass();
        HashMap map = a0Var.b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (z zVar : map.values()) {
            if (zVar != null) {
                Fragment fragment = zVar.c;
                a0Var.i(zVar.l(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (N(2)) {
                    fragment.toString();
                    Objects.toString(fragment.mSavedFragmentState);
                }
            }
        }
        HashMap map2 = this.c.c;
        if (!map2.isEmpty()) {
            a0 a0Var2 = this.c;
            synchronized (a0Var2.a) {
                if (a0Var2.a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(a0Var2.a.size());
                    ArrayList arrayList3 = a0Var2.a;
                    int size = arrayList3.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList3.get(i2);
                        i2++;
                        Fragment fragment2 = (Fragment) obj;
                        arrayList.add(fragment2.mWho);
                        if (N(2)) {
                            fragment2.toString();
                        }
                    }
                }
            }
            int size2 = this.d.size();
            if (size2 > 0) {
                bVarArr = new b[size2];
                for (i = 0; i < size2; i++) {
                    bVarArr[i] = new b((a) this.d.get(i));
                    if (N(2)) {
                        Objects.toString(this.d.get(i));
                    }
                }
            } else {
                bVarArr = null;
            }
            em9 em9Var = new em9();
            em9Var.e = null;
            ArrayList arrayList4 = new ArrayList();
            em9Var.f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            em9Var.g = arrayList5;
            em9Var.a = arrayList2;
            em9Var.b = arrayList;
            em9Var.c = bVarArr;
            em9Var.d = this.k.get();
            Fragment fragment3 = this.A;
            if (fragment3 != null) {
                em9Var.e = fragment3.mWho;
            }
            arrayList4.addAll(this.l.keySet());
            arrayList5.addAll(this.l.values());
            em9Var.h = new ArrayList(this.H);
            bundle.putParcelable("state", em9Var);
            for (String str : this.m.keySet()) {
                bundle.putBundle(sko.j("result_", str), (Bundle) this.m.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(sko.j("fragment_", str2), (Bundle) map2.get(str2));
            }
        }
        return bundle;
    }

    public final z g(Fragment fragment) {
        String str = fragment.mWho;
        a0 a0Var = this.c;
        z zVar = (z) a0Var.b.get(str);
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(this.p, a0Var, fragment);
        zVar2.j(this.x.b.getClassLoader());
        zVar2.e = this.w;
        return zVar2;
    }

    public final void g0() {
        synchronized (this.a) {
            if (this.a.size() == 1) {
                this.x.c.removeCallbacks(this.R);
                this.x.c.post(this.R);
                o0();
            }
        }
    }

    public final void h(Fragment fragment) {
        if (N(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (N(2)) {
                fragment.toString();
            }
            a0 a0Var = this.c;
            synchronized (a0Var.a) {
                a0Var.a.remove(fragment);
            }
            fragment.mAdded = false;
            if (O(fragment)) {
                this.I = true;
            }
            l0(fragment);
        }
    }

    public final void h0(Fragment fragment, boolean z) {
        ViewGroup viewGroupK = K(fragment);
        if (viewGroupK == null || !(viewGroupK instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupK).d = !z;
    }

    public final void i(boolean z, Configuration configuration) {
        if (z && (this.x instanceof ncf)) {
            n0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.i(true, configuration);
                }
            }
        }
    }

    public final void i0(String str, ndc ndcVar, mm9 mm9Var) {
        tcc lifecycle = ndcVar.getLifecycle();
        if (((qdc) lifecycle).i == qcc.a) {
            return;
        }
        wl9 wl9Var = new wl9(this, str, mm9Var, lifecycle);
        zl9 zl9Var = (zl9) this.n.put(str, new zl9(lifecycle, mm9Var, wl9Var));
        if (zl9Var != null) {
            zl9Var.a.b(zl9Var.c);
        }
        if (N(2)) {
            lifecycle.toString();
            Objects.toString(mm9Var);
        }
        lifecycle.a(wl9Var);
    }

    public final boolean j(MenuItem menuItem) {
        if (this.w < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void j0(Fragment fragment, qcc qccVar) {
        if (fragment.equals(this.c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = qccVar;
        } else {
            kp5.d("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                Fragment fragment2 = (Fragment) this.e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void k0(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                kp5.d("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        Fragment fragment2 = this.A;
        this.A = fragment;
        r(fragment2);
        r(this.A);
    }

    public final void l() {
        this.L = true;
        A(true);
        x();
        ql9 ql9Var = this.x;
        boolean z = ql9Var instanceof w7n;
        a0 a0Var = this.c;
        if (z ? a0Var.d.f : true ^ ql9Var.b.isChangingConfigurations()) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((uz2) it.next()).a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    a0Var.d.g((String) obj, false);
                }
            }
        }
        u(-1);
        Object obj2 = this.x;
        if (obj2 instanceof hdf) {
            ((hdf) obj2).removeOnTrimMemoryListener(this.s);
        }
        Object obj3 = this.x;
        if (obj3 instanceof ncf) {
            ((ncf) obj3).removeOnConfigurationChangedListener(this.r);
        }
        Object obj4 = this.x;
        if (obj4 instanceof vcf) {
            ((vcf) obj4).removeOnMultiWindowModeChangedListener(this.t);
        }
        Object obj5 = this.x;
        if (obj5 instanceof wcf) {
            ((wcf) obj5).removeOnPictureInPictureModeChangedListener(this.u);
        }
        Object obj6 = this.x;
        if ((obj6 instanceof ltd) && this.z == null) {
            ((ltd) obj6).removeMenuProvider(this.v);
        }
        this.x = null;
        this.y = null;
        this.z = null;
        if (this.g != null) {
            this.j.remove();
            this.g = null;
        }
        yh yhVar = this.E;
        if (yhVar != null) {
            yhVar.b();
            this.F.b();
            this.G.b();
        }
    }

    public final void l0(Fragment fragment) {
        ViewGroup viewGroupK = K(fragment);
        if (viewGroupK != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (viewGroupK.getTag(2131365029) == null) {
                    viewGroupK.setTag(2131365029, fragment);
                }
                ((Fragment) viewGroupK.getTag(2131365029)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void m(boolean z) {
        if (z && (this.x instanceof hdf)) {
            n0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.m(true);
                }
            }
        }
    }

    public final void m0() {
        ArrayList arrayListD = this.c.d();
        int size = arrayListD.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListD.get(i);
            i++;
            z zVar = (z) obj;
            Fragment fragment = zVar.c;
            if (fragment.mDeferStart) {
                if (this.b) {
                    this.M = true;
                } else {
                    fragment.mDeferStart = false;
                    zVar.i();
                }
            }
        }
    }

    public final void n(boolean z, boolean z2) {
        if (z2 && (this.x instanceof vcf)) {
            n0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.n(z, true);
                }
            }
        }
    }

    public final void n0(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new dzc());
        ql9 ql9Var = this.x;
        try {
            if (ql9Var != null) {
                ((q) ql9Var).e.dump("  ", null, printWriter, new String[0]);
            } else {
                w("  ", null, printWriter, new String[0]);
            }
            throw illegalStateException;
        } catch (Exception unused) {
            throw illegalStateException;
        }
    }

    public final void o() {
        ArrayList arrayListE = this.c.e();
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            Fragment fragment = (Fragment) obj;
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.o();
            }
        }
    }

    public final void o0() {
        synchronized (this.a) {
            if (!this.a.isEmpty()) {
                this.j.setEnabled(true);
                if (N(3)) {
                    toString();
                }
            } else {
                boolean z = J() > 0 && Q(this.z);
                if (N(3)) {
                    toString();
                }
                this.j.setEnabled(z);
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.w < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void q(Menu menu) {
        if (this.w >= 1) {
            for (Fragment fragment : this.c.f()) {
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    public final void r(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void s(boolean z, boolean z2) {
        if (z2 && (this.x instanceof wcf)) {
            n0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.s(z, true);
                }
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean z = false;
        if (this.w < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.z;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.z)));
            sb.append("}");
        } else {
            ql9 ql9Var = this.x;
            if (ql9Var != null) {
                sb.append(ql9Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.x)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i) {
        try {
            this.b = true;
            for (z zVar : this.c.b.values()) {
                if (zVar != null) {
                    zVar.e = i;
                }
            }
            S(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((h) it.next()).i();
            }
            this.b = false;
            A(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.M) {
            this.M = false;
            m0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strU = sko.u(str, "    ");
        a0 a0Var = this.c;
        ArrayList arrayList = a0Var.a;
        String strU2 = sko.u(str, "    ");
        HashMap map = a0Var.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (z zVar : map.values()) {
                printWriter.print(str);
                if (zVar != null) {
                    Fragment fragment = zVar.c;
                    printWriter.println(fragment);
                    fragment.dump(strU2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                Fragment fragment2 = (Fragment) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment3 = (Fragment) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                a aVar = (a) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.k(strU, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            int size4 = this.a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (bm9) this.a.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.y);
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.J);
        printWriter.print(" mStopped=");
        printWriter.print(this.K);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.L);
        if (this.I) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.I);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((h) it.next()).i();
        }
    }

    public final void y(bm9 bm9Var, boolean z) {
        if (!z) {
            if (this.x == null) {
                if (this.L) {
                    qp2.n("FragmentManager has been destroyed");
                    return;
                } else {
                    qp2.n("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (R()) {
                qp2.n("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            if (this.x == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.a.add(bm9Var);
                g0();
            }
        }
    }

    public final void z(boolean z) {
        if (this.b) {
            qp2.n("FragmentManager is already executing transactions");
            return;
        }
        if (this.x == null) {
            if (this.L) {
                qp2.n("FragmentManager has been destroyed");
                return;
            } else {
                qp2.n("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.x.c.getLooper()) {
            qp2.n("Must be called from main thread of fragment host");
            return;
        }
        if (!z && R()) {
            qp2.n("Can not perform this action after onSaveInstanceState");
        } else if (this.N == null) {
            this.N = new ArrayList();
            this.O = new ArrayList();
        }
    }
}
