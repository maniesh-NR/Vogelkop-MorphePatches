package defpackage;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class wn6 implements em7 {
    public final UUID b;
    public final s49 c;
    public final tn d;
    public final HashMap e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final yqa i;
    public final i06 j;
    public final zy9 k;
    public final int l;
    public final ArrayList m;
    public final Set n;
    public final Set o;
    public int p;
    public yh8 q;
    public tn6 r;
    public tn6 s;
    public Looper t;
    public Handler u;
    public byte[] v;
    public fjg w;
    public volatile ue2 x;

    public wn6(UUID uuid, tn tnVar, HashMap map, boolean z, int[] iArr, boolean z2, i06 i06Var) {
        s49 s49Var = ro9.e;
        uuid.getClass();
        z4o.v("Use C.CLEARKEY_UUID instead", !q54.b.equals(uuid));
        this.b = uuid;
        this.c = s49Var;
        this.d = tnVar;
        this.e = map;
        this.f = z;
        this.g = iArr;
        this.h = z2;
        this.j = i06Var;
        this.i = new yqa((byte) 12);
        this.k = new zy9(this);
        this.m = new ArrayList();
        this.n = Collections.newSetFromMap(new IdentityHashMap());
        this.o = Collections.newSetFromMap(new IdentityHashMap());
        this.l = 300000;
    }

    public static boolean g(tn6 tn6Var) {
        tn6Var.m();
        if (tn6Var.p != 1) {
            return false;
        }
        wl7 error = tn6Var.getError();
        error.getClass();
        Throwable cause = error.getCause();
        return (cause instanceof ResourceBusyException) || yi4.D(cause);
    }

    public static ArrayList j(vl7 vl7Var, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(vl7Var.d);
        for (int i = 0; i < vl7Var.d; i++) {
            ul7 ul7Var = vl7Var.a[i];
            if ((ul7Var.a(uuid) || (q54.c.equals(uuid) && ul7Var.a(q54.b))) && (ul7Var.e != null || z)) {
                arrayList.add(ul7Var);
            }
        }
        return arrayList;
    }

    @Override // defpackage.em7
    public final void a() throws qnm {
        yh8 hv5Var;
        l(true);
        int i = this.p;
        this.p = i + 1;
        if (i != 0) {
            return;
        }
        if (this.q == null) {
            UUID uuid = this.b;
            this.c.getClass();
            try {
                try {
                    hv5Var = new ro9(uuid);
                } catch (qnm unused) {
                    w7d.q("Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    hv5Var = new hv5();
                }
                this.q = hv5Var;
                hv5Var.g(new tw2(this, (byte) 26));
                return;
            } catch (UnsupportedSchemeException e) {
                throw new qnm(e);
            } catch (Exception e2) {
                throw new qnm(e2);
            }
        }
        if (this.l == -9223372036854775807L) {
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((tn6) arrayList.get(i2)).e(null);
            i2++;
        }
    }

    @Override // defpackage.em7
    public final xl7 b(am7 am7Var, oj9 oj9Var) {
        l(false);
        z4o.H(this.p > 0);
        this.t.getClass();
        return f(this.t, am7Var, oj9Var, true);
    }

    @Override // defpackage.em7
    public final void c(Looper looper, fjg fjgVar) {
        synchronized (this) {
            Looper looper2 = this.t;
            if (looper2 == null) {
                this.t = looper;
                this.u = new Handler(looper);
            } else {
                z4o.H(looper2 == looper);
                this.u.getClass();
            }
        }
        this.w = fjgVar;
    }

    @Override // defpackage.em7
    public final int d(oj9 oj9Var) {
        l(false);
        yh8 yh8Var = this.q;
        yh8Var.getClass();
        int iJ = yh8Var.j();
        vl7 vl7Var = oj9Var.r;
        if (vl7Var == null) {
            int i = dzd.i(oj9Var.n);
            int i2 = 0;
            while (true) {
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    i2 = -1;
                    break;
                }
                if (iArr[i2] == i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return 0;
            }
        } else if (this.v == null) {
            UUID uuid = this.b;
            if (j(vl7Var, uuid, true).isEmpty()) {
                if (vl7Var.d == 1 && vl7Var.a[0].a(q54.b)) {
                    w7d.K("DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = vl7Var.c;
            if (str != null && !"cenc".equals(str) && !"cbcs".equals(str) && ("cbc1".equals(str) || "cens".equals(str))) {
                return 1;
            }
        }
        return iJ;
    }

    @Override // defpackage.em7
    public final dm7 e(am7 am7Var, oj9 oj9Var) {
        z4o.H(this.p > 0);
        this.t.getClass();
        vn6 vn6Var = new vn6(this, am7Var);
        Handler handler = this.u;
        handler.getClass();
        handler.post(new fh4((Object) vn6Var, (Object) oj9Var, (byte) 18));
        return vn6Var;
    }

    public final xl7 f(Looper looper, am7 am7Var, oj9 oj9Var, boolean z) {
        ArrayList arrayListJ;
        byte b = 2;
        if (this.x == null) {
            this.x = new ue2(this, looper, b);
        }
        vl7 vl7Var = oj9Var.r;
        int i = 0;
        tn6 tn6Var = null;
        if (vl7Var == null) {
            int i2 = dzd.i(oj9Var.n);
            yh8 yh8Var = this.q;
            yh8Var.getClass();
            if (yh8Var.j() != 2 || !oo9.c) {
                int[] iArr = this.g;
                while (true) {
                    if (i >= iArr.length) {
                        i = -1;
                        break;
                    }
                    if (iArr[i] == i2) {
                        break;
                    }
                    i++;
                }
                if (i != -1 && yh8Var.j() != 1) {
                    tn6 tn6Var2 = this.r;
                    if (tn6Var2 == null) {
                        a1b a1bVar = h1b.b;
                        tn6 tn6VarI = i(csh.e, true, null, z);
                        this.m.add(tn6VarI);
                        this.r = tn6VarI;
                    } else {
                        tn6Var2.e(null);
                    }
                    return this.r;
                }
            }
            return null;
        }
        if (this.v == null) {
            arrayListJ = j(vl7Var, this.b, false);
            if (arrayListJ.isEmpty()) {
                un6 un6Var = new un6("Media does not support uuid: " + this.b);
                w7d.r("DRM error", un6Var);
                if (am7Var != null) {
                    am7Var.d(un6Var);
                }
                return new m68(new wl7(6003, un6Var));
            }
        } else {
            arrayListJ = null;
        }
        if (this.f) {
            ArrayList arrayList = this.m;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                Object obj = arrayList.get(i3);
                i3++;
                tn6 tn6Var3 = (tn6) obj;
                if (Objects.equals(tn6Var3.a, arrayListJ)) {
                    tn6Var = tn6Var3;
                    break;
                }
            }
        } else {
            tn6Var = this.s;
        }
        if (tn6Var != null) {
            tn6Var.e(am7Var);
            return tn6Var;
        }
        tn6 tn6VarI2 = i(arrayListJ, false, am7Var, z);
        if (!this.f) {
            this.s = tn6VarI2;
        }
        this.m.add(tn6VarI2);
        return tn6VarI2;
    }

    public final tn6 h(List list, boolean z, am7 am7Var) {
        this.q.getClass();
        boolean z2 = this.h | z;
        yh8 yh8Var = this.q;
        byte[] bArr = this.v;
        Looper looper = this.t;
        looper.getClass();
        fjg fjgVar = this.w;
        fjgVar.getClass();
        tn6 tn6Var = new tn6(this.b, yh8Var, this.i, this.k, list, z2, z, bArr, this.e, this.d, looper, this.j, fjgVar);
        tn6Var.e(am7Var);
        if (this.l != -9223372036854775807L) {
            tn6Var.e(null);
        }
        return tn6Var;
    }

    public final tn6 i(List list, boolean z, am7 am7Var, boolean z2) {
        tn6 tn6VarH = h(list, z, am7Var);
        boolean zG = g(tn6VarH);
        int i = this.l;
        Set set = this.o;
        if (zG && !set.isEmpty()) {
            omm ommVarN = u1b.q(set).n();
            while (ommVarN.hasNext()) {
                ((xl7) ommVarN.next()).d(null);
            }
            tn6VarH.d(am7Var);
            if (i != -9223372036854775807L) {
                tn6VarH.d(null);
            }
            tn6VarH = h(list, z, am7Var);
        }
        if (g(tn6VarH) && z2) {
            Set set2 = this.n;
            if (!set2.isEmpty()) {
                omm ommVarN2 = u1b.q(set2).n();
                while (ommVarN2.hasNext()) {
                    ((vn6) ommVarN2.next()).release();
                }
                if (!set.isEmpty()) {
                    omm ommVarN3 = u1b.q(set).n();
                    while (ommVarN3.hasNext()) {
                        ((xl7) ommVarN3.next()).d(null);
                    }
                }
                tn6VarH.d(am7Var);
                if (i != -9223372036854775807L) {
                    tn6VarH.d(null);
                }
                return h(list, z, am7Var);
            }
        }
        return tn6VarH;
    }

    public final void k() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            yh8 yh8Var = this.q;
            yh8Var.getClass();
            yh8Var.release();
            this.q = null;
        }
    }

    public final void l(boolean z) {
        if (z && this.t == null) {
            w7d.L("DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.t;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            w7d.L("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // defpackage.em7
    public final void release() {
        l(true);
        int i = this.p - 1;
        this.p = i;
        if (i != 0) {
            return;
        }
        if (this.l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.m);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((tn6) arrayList.get(i2)).d(null);
            }
        }
        omm ommVarN = u1b.q(this.n).n();
        while (ommVarN.hasNext()) {
            ((vn6) ommVarN.next()).release();
        }
        k();
    }
}
