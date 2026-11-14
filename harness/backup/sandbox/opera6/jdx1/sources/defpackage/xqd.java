package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import androidx.collection.ArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class xqd extends Binder implements ssa {
    public static final /* synthetic */ int g = 0;
    public final WeakReference a;
    public final vzk b;
    public final Set c;
    public bsh d;
    public int e;
    public wqd f;

    public xqd(npd npdVar) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.a = new WeakReference(npdVar);
        this.b = new vzk(npdVar);
        this.c = Collections.synchronizedSet(new HashSet());
        this.d = bsh.f;
    }

    public static ListenableFuture S0(npd npdVar, nod nodVar, int i, vqd vqdVar, op5 op5Var) {
        if (npdVar.i()) {
            return r0b.b;
        }
        ListenableFuture listenableFuture = (ListenableFuture) vqdVar.l(npdVar, nodVar, i);
        c5j c5jVar = new c5j();
        listenableFuture.addListener(new qn(npdVar, c5jVar, op5Var, listenableFuture, (byte) 14), m97.a);
        return c5jVar;
    }

    public static void Y0(npd npdVar, nod nodVar, int i, e4j e4jVar) {
        try {
            mod modVar = nodVar.d;
            modVar.getClass();
            modVar.j(i, e4jVar);
            npdVar.c.a(true, true);
        } catch (RemoteException e) {
            w7d.L("Failed to send result to controller " + nodVar, e);
        }
    }

    public static yzb Z0(op5 op5Var) {
        return new yzb(new kqd(op5Var, (byte) 0), (byte) 29);
    }

    @Override // defpackage.ssa
    public final void A(ksa ksaVar, int i, int i2, int i3) {
        if (ksaVar == null) {
            return;
        }
        W0(ksaVar, i, 27, Z0(new fqd(this, i2, i3)));
    }

    @Override // defpackage.ssa
    public final void B0(ksa ksaVar, int i, Bundle bundle) {
        K(ksaVar, i, bundle, true);
    }

    @Override // defpackage.ssa
    public final void C0(ksa ksaVar, int i) {
        if (ksaVar == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            npd npdVar = (npd) this.a.get();
            if (npdVar != null && !npdVar.i()) {
                tym.S(npdVar.l, new hpd(this, ksaVar, (byte) 2));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.ssa
    public final void D(ksa ksaVar, int i) {
        if (ksaVar == null) {
            return;
        }
        W0(ksaVar, i, 2, Z0(new kpd((byte) 25)));
    }

    @Override // defpackage.ssa
    public final void E(ksa ksaVar, int i, int i2) {
        if (ksaVar == null || i2 < 0) {
            return;
        }
        W0(ksaVar, i, 10, new yzb(new gqd(this, i2, (byte) 0), (byte) 29));
    }

    @Override // defpackage.ssa
    public final void E0(ksa ksaVar, int i, Surface surface) {
        if (ksaVar == null) {
            return;
        }
        W0(ksaVar, i, 27, Z0(new z0c(this, surface, (byte) 19)));
    }

    @Override // defpackage.ssa
    public final void F0(ksa ksaVar, int i, Bundle bundle) {
        WeakReference weakReference = this.a;
        npd npdVar = (npd) weakReference.get();
        if (ksaVar == null || bundle == null || npdVar == null) {
            exg.n(ksaVar);
            return;
        }
        try {
            Context context = npdVar.f;
            gm5 gm5VarA = gm5.a(bundle);
            int callingUid = Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            String str = gm5VarA.c;
            if (str != null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
                if (packagesForUid != null && packagesForUid.length != 0) {
                    for (String str2 : packagesForUid) {
                        if (!str2.equals(str)) {
                        }
                    }
                }
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                if (callingPid == 0) {
                    callingPid = gm5VarA.d;
                }
                try {
                    bqd bqdVar = new bqd(str, callingPid, callingUid);
                    boolean zM = zy9.K(context).M(bqdVar);
                    int i2 = gm5VarA.a;
                    int i3 = gm5VarA.b;
                    nod nodVar = new nod(bqdVar, i2, i3, zM, new sqd(ksaVar, i3), gm5VarA.e);
                    npd npdVar2 = (npd) weakReference.get();
                    if (npdVar2 == null || npdVar2.i()) {
                        exg.n(ksaVar);
                    } else {
                        this.c.add(nodVar);
                        tym.S(npdVar2.l, new qn(this, nodVar, npdVar2, ksaVar, (byte) 13));
                    }
                    return;
                } finally {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            }
            w7d.K("Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
            exg.n(ksaVar);
        } catch (RuntimeException e) {
            w7d.L("Ignoring malformed Bundle for ConnectionRequest", e);
        }
    }

    @Override // defpackage.ssa
    public final void G(ksa ksaVar, int i) {
        if (ksaVar == null) {
            return;
        }
        W0(ksaVar, i, 26, Z0(new kpd((byte) 17)));
    }

    @Override // defpackage.ssa
    public final void H(ksa ksaVar, int i, boolean z) {
        if (ksaVar == null) {
            return;
        }
        W0(ksaVar, i, 1, Z0(new go4((byte) 7, z)));
    }

    @Override // defpackage.ssa
    public final void H0(ksa ksaVar, int i, int i2) {
        if (ksaVar == null || i2 < 0) {
            return;
        }
        W0(ksaVar, i, 25, Z0(new gz3((byte) 13, i2)));
    }

    @Override // defpackage.ssa
    public final void K(ksa ksaVar, int i, Bundle bundle, boolean z) {
        if (ksaVar == null || bundle == null) {
            return;
        }
        try {
            qjd qjdVarB = qjd.b(bundle);
            nod nodVarI = this.b.I(ksaVar.asBinder());
            if (nodVarI != null) {
                X0(nodVarI, i, 31, new lqd(new z0c(new vw((byte) 8, qjdVarB, z), new kpd((byte) 29), (byte) 20), (byte) 1));
            }
        } catch (RuntimeException e) {
            w7d.L("Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.ssa
    public final void L(ksa ksaVar) {
        nod nodVarI;
        if (ksaVar == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            npd npdVar = (npd) this.a.get();
            if (npdVar != null && !npdVar.i() && (nodVarI = this.b.I(ksaVar.asBinder())) != null) {
                tym.S(npdVar.l, new hpd(this, nodVarI, (byte) 3));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.ssa
    public final void L0(ksa ksaVar, int i) {
        nod nodVarI;
        if (ksaVar == null || (nodVarI = this.b.I(ksaVar.asBinder())) == null) {
            return;
        }
        X0(nodVarI, i, 7, Z0(new kpd((byte) 11)));
    }

    @Override // defpackage.ssa
    public final void M(ksa ksaVar, int i, Bundle bundle) {
        if (ksaVar == null || bundle == null) {
            return;
        }
        try {
            W0(ksaVar, i, 13, Z0(new vhd(new thg(bundle.getFloat(thg.e, 1.0f), bundle.getFloat(thg.f, 1.0f)), (byte) 2)));
        } catch (RuntimeException e) {
            w7d.L("Ignoring malformed Bundle for PlaybackParameters", e);
        }
    }

    @Override // defpackage.ssa
    public final void M0(ksa ksaVar, int i, int i2) {
        if (ksaVar != null) {
            if (i2 == 2 || i2 == 0 || i2 == 1) {
                W0(ksaVar, i, 15, Z0(new gz3((byte) 12, i2)));
            }
        }
    }

    @Override // defpackage.ssa
    public final void N(ksa ksaVar, int i) {
        if (ksaVar == null) {
            return;
        }
        W0(ksaVar, i, 20, Z0(new kpd((byte) 27)));
    }

    @Override // defpackage.ssa
    public final void O(ksa ksaVar, int i, final boolean z, final int i2) {
        if (ksaVar == null) {
            return;
        }
        W0(ksaVar, i, 34, Z0(new op5() { // from class: iqd
            @Override // defpackage.op5
            public final void accept(Object obj) {
                ((xkg) obj).i(i2, z);
            }
        }));
    }

    @Override // defpackage.ssa
    public final void O0(ksa ksaVar, int i, int i2, int i3) {
        if (ksaVar == null || i2 < 0 || i3 < 0) {
            return;
        }
        W0(ksaVar, i, 20, Z0(new gi8(i2, i3, (byte) 5)));
    }

    @Override // defpackage.ssa
    public final void P(ksa ksaVar, int i, Bundle bundle) {
        if (ksaVar == null || bundle == null) {
            return;
        }
        try {
            W0(ksaVar, i, 19, Z0(new di8(vjd.b(bundle), (byte) 2)));
        } catch (RuntimeException e) {
            w7d.L("Ignoring malformed Bundle for MediaMetadata", e);
        }
    }

    @Override // defpackage.ssa
    public final void P0(ksa ksaVar, int i, int i2, Bundle bundle) {
        if (ksaVar == null || bundle == null || i2 < 0) {
            return;
        }
        try {
            W0(ksaVar, i, 20, new lqd(new z0c(new mo4(qjd.b(bundle), (byte) 4), new gqd(this, i2, (byte) 2), (byte) 21), (byte) 1));
        } catch (RuntimeException e) {
            w7d.L("Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.ssa
    public final void Q(ksa ksaVar, int i, Surface surface, int i2, int i3) {
        if (ksaVar == null) {
            return;
        }
        W0(ksaVar, i, 27, Z0(new rhd(this, surface, i2, i3, (byte) 2)));
    }

    @Override // defpackage.ssa
    public final void Q0(ksa ksaVar, int i, boolean z) {
        if (ksaVar == null) {
            return;
        }
        W0(ksaVar, i, 14, Z0(new go4((byte) 9, z)));
    }

    @Override // defpackage.ssa
    public final void R(ksa ksaVar, int i, boolean z) {
        if (ksaVar == null) {
            return;
        }
        W0(ksaVar, i, 26, Z0(new go4((byte) 8, z)));
    }

    public final ijg R0(ijg ijgVar) {
        h1b h1bVar = ijgVar.F.a;
        z0b z0bVarP = h1b.p();
        t0b t0bVar = new t0b(4);
        for (int i = 0; i < h1bVar.size(); i++) {
            ezl ezlVar = (ezl) h1bVar.get(i);
            eyl eylVar = ezlVar.b;
            String string = (String) this.d.get(eylVar);
            if (string == null) {
                StringBuilder sb = new StringBuilder();
                int i2 = this.e;
                this.e = i2 + 1;
                String str = tym.a;
                sb.append(Integer.toString(i2, 36));
                sb.append("-");
                sb.append(eylVar.b);
                string = sb.toString();
            }
            t0bVar.i(eylVar, string);
            z0bVarP.c(new ezl(new eyl(string, ezlVar.b.d), ezlVar.c, ezlVar.d, ezlVar.e));
        }
        this.d = t0bVar.d();
        ijg ijgVarB = ijgVar.b(new fzl(z0bVarP.g()));
        nyl nylVar = ijgVarB.G;
        if (nylVar.H.isEmpty()) {
            return ijgVarB;
        }
        myl mylVarC = nylVar.a().c();
        omm ommVarN = nylVar.H.l().n();
        while (ommVarN.hasNext()) {
            kyl kylVar = (kyl) ommVarN.next();
            eyl eylVar2 = kylVar.a;
            String str2 = (String) this.d.get(eylVar2);
            if (str2 != null) {
                mylVarC.a(new kyl(new eyl(str2, eylVar2.d), kylVar.b));
            } else {
                mylVarC.a(kylVar);
            }
        }
        return ijgVarB.m(mylVarC.b());
    }

    @Override // defpackage.ssa
    public final void S(ksa ksaVar, int i) {
        nod nodVarI;
        if (ksaVar == null || (nodVarI = this.b.I(ksaVar.asBinder())) == null) {
            return;
        }
        X0(nodVarI, i, 3, Z0(new kpd((byte) 21)));
    }

    public final int T0(nod nodVar, xkg xkgVar, int i) {
        if (xkgVar.C(17)) {
            vzk vzkVar = this.b;
            if (!vzkVar.T(nodVar, 17) && vzkVar.T(nodVar, 16)) {
                return xkgVar.f0() + i;
            }
        }
        return i;
    }

    @Override // defpackage.ssa
    public final void U(ksa ksaVar, int i, final int i2, final int i3, final int i4) {
        if (ksaVar == null || i2 < 0 || i3 < i2 || i4 < 0) {
            return;
        }
        W0(ksaVar, i, 20, Z0(new op5() { // from class: hqd
            @Override // defpackage.op5
            public final void accept(Object obj) {
                ((xkg) obj).i0(i2, i3, i4);
            }
        }));
    }

    public final void U0(final ksa ksaVar, final int i, Bundle bundle, Bundle bundle2, boolean z) {
        final nod nodVarI;
        if (ksaVar == null || bundle == null || bundle2 == null) {
            return;
        }
        try {
            final n3j n3jVarA = n3j.a(bundle);
            if (!vb5.k(n3jVarA.b)) {
                a(ksaVar, i, n3jVarA, 0, new lqd(new kpd(z, n3jVarA, bundle2), (byte) 1));
                return;
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                final npd npdVar = (npd) this.a.get();
                if (npdVar != null && !npdVar.i() && (nodVarI = this.b.I(ksaVar.asBinder())) != null) {
                    tym.S(npdVar.l, new Runnable() { // from class: mqd
                        @Override // java.lang.Runnable
                        public final void run() {
                            n3j n3jVar = n3jVarA;
                            String str = n3jVar.b;
                            npd npdVar2 = npdVar;
                            int i2 = i;
                            xqd xqdVar = this.a;
                            vzk vzkVar = xqdVar.b;
                            nod nodVar = nodVarI;
                            if (vzkVar.S(nodVar)) {
                                try {
                                    vb5 vb5VarB = vb5.b(n3jVar);
                                    Object obj = vb5VarB.j;
                                    int i3 = vb5VarB.b;
                                    if (!vb5VarB.a()) {
                                        w7d.K("Can't execute predefined custom command: " + str);
                                        xqd.Y0(npdVar2, nodVar, i2, new e4j(-6));
                                        return;
                                    }
                                    n3j n3jVar2 = vb5VarB.a;
                                    if (n3jVar2 != null) {
                                        z4o.H(n3jVar2.a == 40010);
                                        xqdVar.a(ksaVar, i2, null, 40010, new lqd(new qqd(vb5VarB), (byte) 1));
                                        return;
                                    }
                                    xkg xkgVar = npdVar2.t;
                                    if (i3 == 1) {
                                        if (obj != null) {
                                            zBooleanValue = ((Boolean) obj).booleanValue();
                                        } else if (!xkgVar.getPlayWhenReady()) {
                                            zBooleanValue = true;
                                        }
                                    }
                                    if (zBooleanValue) {
                                        xqdVar.V0(nodVar, i2);
                                    } else if (i3 == 31) {
                                        obj.getClass();
                                        xqdVar.X0(nodVar, i2, 31, new lqd(new z0c(new vw((byte) 8, (qjd) obj, true), new kpd((byte) 29), (byte) 20), (byte) 1));
                                    } else {
                                        xqdVar.X0(nodVar, i2, i3, xqd.Z0(new qqd(vb5VarB)));
                                    }
                                    vzkVar.B(nodVar);
                                } catch (RuntimeException e) {
                                    w7d.L("Failed to convert predefined custom command: " + str, e);
                                    xqd.Y0(npdVar2, nodVar, i2, new e4j(-3));
                                }
                            }
                        }
                    });
                }
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e) {
            w7d.L("Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    public final void V0(nod nodVar, int i) {
        X0(nodVar, i, 1, Z0(new z0c(this, nodVar, (byte) 18)));
    }

    @Override // defpackage.ssa
    public final void W(ksa ksaVar, int i, Bundle bundle) {
        wl5 wl5Var;
        if (ksaVar == null || bundle == null) {
            return;
        }
        try {
            e4j e4jVarA = e4j.a(bundle);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                vzk vzkVar = this.b;
                IBinder iBinderAsBinder = ksaVar.asBinder();
                synchronized (vzkVar.a) {
                    nod nodVarI = vzkVar.I(iBinderAsBinder);
                    wl5Var = nodVarI != null ? (wl5) ((ArrayMap) vzkVar.c).get(nodVarI) : null;
                }
                m59 m59Var = wl5Var != null ? wl5Var.b : null;
                if (m59Var != null) {
                    m59Var.n(i, e4jVarA);
                }
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e) {
            w7d.L("Ignoring malformed Bundle for SessionResult", e);
        }
    }

    public final void W0(ksa ksaVar, int i, int i2, vqd vqdVar) {
        nod nodVarI = this.b.I(ksaVar.asBinder());
        if (nodVarI != null) {
            X0(nodVarI, i, i2, vqdVar);
        }
    }

    @Override // defpackage.ssa
    public final void X(ksa ksaVar, int i, Bundle bundle, boolean z) {
        if (ksaVar == null || bundle == null) {
            return;
        }
        try {
            W0(ksaVar, i, 35, Z0(new vw((byte) 9, pf2.a(bundle), z)));
        } catch (RuntimeException e) {
            w7d.L("Ignoring malformed Bundle for AudioAttributes", e);
        }
    }

    public final void X0(nod nodVar, int i, int i2, vqd vqdVar) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            npd npdVar = (npd) this.a.get();
            if (npdVar != null && !npdVar.i()) {
                tym.S(npdVar.l, new bz4(this, nodVar, i2, npdVar, i, vqdVar));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.ssa
    public final void Y(ksa ksaVar, int i, Bundle bundle, long j) {
        if (ksaVar == null || bundle == null) {
            return;
        }
        try {
            W0(ksaVar, i, 31, new lqd(new z0c(new qhd(j, qjd.b(bundle)), new kpd((byte) 29), (byte) 20), (byte) 1));
        } catch (RuntimeException e) {
            w7d.L("Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.ssa
    public final void Z(ksa ksaVar, int i) {
        if (ksaVar == null) {
            return;
        }
        W0(ksaVar, i, 24, Z0(new kpd((byte) 22)));
    }

    public final void a(ksa ksaVar, final int i, final n3j n3jVar, final int i2, final vqd vqdVar) {
        final nod nodVarI;
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final npd npdVar = (npd) this.a.get();
            if (npdVar != null && !npdVar.i() && (nodVarI = this.b.I(ksaVar.asBinder())) != null) {
                tym.S(npdVar.l, new Runnable() { // from class: jqd
                    @Override // java.lang.Runnable
                    public final void run() {
                        vzk vzkVar = this.a.b;
                        nod nodVar = nodVarI;
                        if (vzkVar.S(nodVar)) {
                            n3j n3jVar2 = n3jVar;
                            npd npdVar2 = npdVar;
                            int i3 = i;
                            if (n3jVar2 != null) {
                                if (!vzkVar.V(nodVar, n3jVar2)) {
                                    xqd.Y0(npdVar2, nodVar, i3, new e4j(-4));
                                    return;
                                }
                            } else if (!vzkVar.U(nodVar, i2)) {
                                xqd.Y0(npdVar2, nodVar, i3, new e4j(-4));
                                return;
                            }
                            vqdVar.l(npdVar2, nodVar, i3);
                        }
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.ssa
    public final void a0(ksa ksaVar, int i) {
        nod nodVarI;
        if (ksaVar == null || (nodVarI = this.b.I(ksaVar.asBinder())) == null) {
            return;
        }
        V0(nodVarI, i);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.ssa
    public final void d(ksa ksaVar, int i) {
        nod nodVarI;
        if (ksaVar == null || (nodVarI = this.b.I(ksaVar.asBinder())) == null) {
            return;
        }
        X0(nodVarI, i, 1, Z0(new kpd((byte) 6)));
    }

    @Override // defpackage.ssa
    public final void d0(ksa ksaVar, int i, IBinder iBinder, int i2, long j) {
        if (ksaVar == null || iBinder == null) {
            return;
        }
        if (i2 == -1 || i2 >= 0) {
            try {
                h1b h1bVarA = k14.a(iBinder);
                z0b z0bVarP = h1b.p();
                for (int i3 = 0; i3 < h1bVarA.size(); i3++) {
                    Bundle bundle = (Bundle) h1bVarA.get(i3);
                    bundle.getClass();
                    z0bVarP.c(qjd.b(bundle));
                }
                W0(ksaVar, i, 20, new lqd(new z0c(new oo4(i2, j, z0bVarP.g()), new kpd((byte) 29), (byte) 20), (byte) 1));
            } catch (RuntimeException e) {
                w7d.L("Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    @Override // defpackage.ssa
    public final void e0(ksa ksaVar, int i) {
        if (ksaVar == null) {
            return;
        }
        W0(ksaVar, i, 8, Z0(new kpd((byte) 7)));
    }

    @Override // defpackage.ssa
    public final void f0(ksa ksaVar, int i, float f) {
        if (ksaVar == null || f <= 0.0f) {
            return;
        }
        W0(ksaVar, i, 13, Z0(new io4(f, (byte) 5)));
    }

    @Override // defpackage.ssa
    public final void g(ksa ksaVar, int i) {
        if (ksaVar == null) {
            return;
        }
        W0(ksaVar, i, 24, Z0(new kpd((byte) 5)));
    }

    @Override // defpackage.ssa
    public final void k(ksa ksaVar, int i, int i2, int i3) {
        if (ksaVar == null || i2 < 0) {
            return;
        }
        W0(ksaVar, i, 33, Z0(new gi8(i2, i3, (byte) 4)));
    }

    @Override // defpackage.ssa
    public final void k0(ksa ksaVar, int i, int i2) {
        if (ksaVar == null) {
            return;
        }
        W0(ksaVar, i, 34, Z0(new gz3((byte) 11, i2)));
    }

    @Override // defpackage.ssa
    public final void m0(ksa ksaVar, int i, int i2) {
        if (ksaVar == null) {
            return;
        }
        W0(ksaVar, i, 34, Z0(new gz3((byte) 10, i2)));
    }

    @Override // defpackage.ssa
    public final void n(ksa ksaVar, int i, float f) {
        if (ksaVar == null || f < 0.0f || f > 1.0f) {
            return;
        }
        W0(ksaVar, i, 24, Z0(new io4(f, (byte) 6)));
    }

    @Override // defpackage.ssa
    public final void n0(ksa ksaVar, int i, IBinder iBinder, boolean z) {
        if (ksaVar == null || iBinder == null) {
            return;
        }
        try {
            h1b h1bVarA = k14.a(iBinder);
            z0b z0bVarP = h1b.p();
            for (int i2 = 0; i2 < h1bVarA.size(); i2++) {
                Bundle bundle = (Bundle) h1bVarA.get(i2);
                bundle.getClass();
                z0bVarP.c(qjd.b(bundle));
            }
            W0(ksaVar, i, 20, new lqd(new z0c(new vw((byte) 10, z0bVarP.g(), z), new kpd((byte) 29), (byte) 20), (byte) 1));
        } catch (RuntimeException e) {
            w7d.L("Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.ssa
    public final void o(ksa ksaVar, int i) {
        if (ksaVar == null) {
            return;
        }
        W0(ksaVar, i, 26, Z0(new kpd((byte) 9)));
    }

    @Override // defpackage.ssa
    public final void o0(ksa ksaVar, int i, int i2, int i3, IBinder iBinder) {
        if (ksaVar == null || iBinder == null || i2 < 0 || i3 < i2) {
            return;
        }
        try {
            h1b h1bVarA = k14.a(iBinder);
            z0b z0bVarP = h1b.p();
            for (int i4 = 0; i4 < h1bVarA.size(); i4++) {
                Bundle bundle = (Bundle) h1bVarA.get(i4);
                bundle.getClass();
                z0bVarP.c(qjd.b(bundle));
            }
            byte b = 1;
            W0(ksaVar, i, 20, new lqd(new z0c(new ki8(z0bVarP.g(), b), new fqd(this, i2, i3), (byte) 21), b));
        } catch (RuntimeException e) {
            w7d.L("Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        byte b = 1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        byte b2 = 20;
        switch (i) {
            case 3002:
                n(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                H0(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3004:
                o(lid.a(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3005:
                G(lid.a(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3006:
                R(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3007:
                K(lid.a(parcel.readStrongBinder()), parcel.readInt(), (Bundle) c26.G(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                Y(lid.a(parcel.readStrongBinder()), parcel.readInt(), (Bundle) c26.G(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                K(lid.a(parcel.readStrongBinder()), parcel.readInt(), (Bundle) c26.G(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                n0(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                n0(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                d0(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                H(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3014:
                W(lid.a(parcel.readStrongBinder()), parcel.readInt(), (Bundle) c26.G(parcel, Bundle.CREATOR));
                return true;
            case 3015:
                F0(lid.a(parcel.readStrongBinder()), parcel.readInt(), (Bundle) c26.G(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                ksa ksaVarA = lid.a(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                U0(ksaVarA, i3, (Bundle) c26.G(parcel, creator), (Bundle) c26.G(parcel, creator), false);
                return true;
            case 3017:
                M0(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3018:
                Q0(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3019:
                v(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3020:
                u(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3021:
                N(lid.a(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3022:
                O0(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3023:
                U(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3024:
                a0(lid.a(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3025:
                d(lid.a(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3026:
                D(lid.a(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3027:
                M(lid.a(parcel.readStrongBinder()), parcel.readInt(), (Bundle) c26.G(parcel, Bundle.CREATOR));
                return true;
            case 3028:
                f0(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3029:
                ksa ksaVarA2 = lid.a(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                Bundle bundle = (Bundle) c26.G(parcel, Bundle.CREATOR);
                if (ksaVarA2 != null && bundle != null) {
                    try {
                        W0(ksaVarA2, i4, 20, new lqd(new z0c(new mo4(qjd.b(bundle), (byte) 5), new kpd((byte) 19), (byte) 21), b));
                    } catch (RuntimeException e) {
                        w7d.L("Ignoring malformed Bundle for MediaItem", e);
                    }
                }
                return true;
            case 3030:
                r(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) c26.G(parcel, Bundle.CREATOR));
                return true;
            case 3031:
                r0(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3032:
                v0(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3033:
                P(lid.a(parcel.readStrongBinder()), parcel.readInt(), (Bundle) c26.G(parcel, Bundle.CREATOR));
                return true;
            case 3034:
                S(lid.a(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3035:
                C0(lid.a(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3036:
                u0(lid.a(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3037:
                E(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3038:
                y0(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                return true;
            case 3039:
                q0(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readLong());
                return true;
            case 3040:
                s(lid.a(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3041:
                q(lid.a(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3042:
                w0(lid.a(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3043:
                e0(lid.a(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3044:
                E0(lid.a(parcel.readStrongBinder()), parcel.readInt(), (Surface) c26.G(parcel, Surface.CREATOR));
                return true;
            case 3045:
                L(lid.a(parcel.readStrongBinder()));
                return true;
            case 3046:
                L0(lid.a(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3047:
                p0(lid.a(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3048:
                p(lid.a(parcel.readStrongBinder()), parcel.readInt(), (Bundle) c26.G(parcel, Bundle.CREATOR));
                return true;
            case 3049:
                ksa ksaVarA3 = lid.a(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                String string = parcel.readString();
                Bundle bundle2 = (Bundle) c26.G(parcel, Bundle.CREATOR);
                if (ksaVarA3 != null && string != null && bundle2 != null) {
                    if (TextUtils.isEmpty(string)) {
                        w7d.K("setRatingWithMediaId(): Ignoring empty mediaId");
                    } else {
                        try {
                            a(ksaVarA3, i5, null, 40010, new lqd(new kpd(string, xjh.a(bundle2)), b));
                        } catch (RuntimeException e2) {
                            w7d.L("Ignoring malformed Bundle for Rating", e2);
                        }
                    }
                }
                return true;
            case 3050:
                ksa ksaVarA4 = lid.a(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                Bundle bundle3 = (Bundle) c26.G(parcel, Bundle.CREATOR);
                if (ksaVarA4 != null && bundle3 != null) {
                    try {
                        a(ksaVarA4, i6, null, 40010, new lqd(new rqd(xjh.a(bundle3)), b));
                    } catch (RuntimeException e3) {
                        w7d.L("Ignoring malformed Bundle for Rating", e3);
                    }
                }
                return true;
            case 3051:
                k(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3052:
                k0(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3053:
                m0(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3054:
                O(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
                return true;
            case 3055:
                P0(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) c26.G(parcel, Bundle.CREATOR));
                return true;
            case 3056:
                o0(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3057:
                X(lid.a(parcel.readStrongBinder()), parcel.readInt(), (Bundle) c26.G(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3058:
                g(lid.a(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3059:
                Z(lid.a(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3060:
                ksa ksaVarA5 = lid.a(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                U0(ksaVarA5, i7, (Bundle) c26.G(parcel, creator2), (Bundle) c26.G(parcel, creator2), parcel.readInt() != 0);
                return true;
            case 3061:
                Q(lid.a(parcel.readStrongBinder()), parcel.readInt(), (Surface) c26.G(parcel, Surface.CREATOR), parcel.readInt(), parcel.readInt());
                return true;
            case 3062:
                A(lid.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            default:
                switch (i) {
                    case 4001:
                        ksa ksaVarA6 = lid.a(parcel.readStrongBinder());
                        int i8 = parcel.readInt();
                        Bundle bundle4 = (Bundle) c26.G(parcel, Bundle.CREATOR);
                        if (ksaVarA6 != null) {
                            if (bundle4 != null) {
                                try {
                                    sjd.a(bundle4);
                                    a(ksaVarA6, i8, null, 50000, new lqd(new kpd((byte) 24), z ? (byte) 1 : (byte) 0));
                                } catch (RuntimeException e4) {
                                    w7d.L("Ignoring malformed Bundle for LibraryParams", e4);
                                }
                            } else {
                                a(ksaVarA6, i8, null, 50000, new lqd(new kpd((byte) 24), z ? (byte) 1 : (byte) 0));
                            }
                        }
                        return true;
                    case 4002:
                        ksa ksaVarA7 = lid.a(parcel.readStrongBinder());
                        int i9 = parcel.readInt();
                        String string2 = parcel.readString();
                        if (ksaVarA7 != null) {
                            if (TextUtils.isEmpty(string2)) {
                                w7d.K("getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            a(ksaVarA7, i9, null, 50004, new lqd(new kpd((byte) 13), z ? (byte) 1 : (byte) 0));
                            return true;
                        }
                        return true;
                    case 4003:
                        ksa ksaVarA8 = lid.a(parcel.readStrongBinder());
                        int i10 = parcel.readInt();
                        String string3 = parcel.readString();
                        int i11 = parcel.readInt();
                        int i12 = parcel.readInt();
                        Bundle bundle5 = (Bundle) c26.G(parcel, Bundle.CREATOR);
                        if (ksaVarA8 != null) {
                            if (TextUtils.isEmpty(string3)) {
                                w7d.K("getChildren(): Ignoring empty parentId");
                            } else if (i11 < 0) {
                                w7d.K("getChildren(): Ignoring negative page");
                            } else if (i12 < 1) {
                                w7d.K("getChildren(): Ignoring pageSize less than 1");
                            } else if (bundle5 != null) {
                                try {
                                    sjd.a(bundle5);
                                    a(ksaVarA8, i10, null, 50003, new lqd(new kpd((byte) 4), z ? (byte) 1 : (byte) 0));
                                } catch (RuntimeException e5) {
                                    w7d.L("Ignoring malformed Bundle for LibraryParams", e5);
                                }
                            } else {
                                a(ksaVarA8, i10, null, 50003, new lqd(new kpd((byte) 4), z ? (byte) 1 : (byte) 0));
                            }
                        }
                        return true;
                    case 4004:
                        ksa ksaVarA9 = lid.a(parcel.readStrongBinder());
                        int i13 = parcel.readInt();
                        String string4 = parcel.readString();
                        Bundle bundle6 = (Bundle) c26.G(parcel, Bundle.CREATOR);
                        if (ksaVarA9 != null) {
                            if (TextUtils.isEmpty(string4)) {
                                w7d.K("search(): Ignoring empty query");
                            } else if (bundle6 != null) {
                                try {
                                    sjd.a(bundle6);
                                    a(ksaVarA9, i13, null, 50005, new lqd(new kpd((byte) 28), z ? (byte) 1 : (byte) 0));
                                } catch (RuntimeException e6) {
                                    w7d.L("Ignoring malformed Bundle for LibraryParams", e6);
                                }
                            } else {
                                a(ksaVarA9, i13, null, 50005, new lqd(new kpd((byte) 28), z ? (byte) 1 : (byte) 0));
                            }
                        }
                        return true;
                    case 4005:
                        ksa ksaVarA10 = lid.a(parcel.readStrongBinder());
                        int i14 = parcel.readInt();
                        String string5 = parcel.readString();
                        int i15 = parcel.readInt();
                        int i16 = parcel.readInt();
                        Bundle bundle7 = (Bundle) c26.G(parcel, Bundle.CREATOR);
                        if (ksaVarA10 != null) {
                            if (TextUtils.isEmpty(string5)) {
                                w7d.K("getSearchResult(): Ignoring empty query");
                            } else if (i15 < 0) {
                                w7d.K("getSearchResult(): Ignoring negative page");
                            } else if (i16 < 1) {
                                w7d.K("getSearchResult(): Ignoring pageSize less than 1");
                            } else if (bundle7 != null) {
                                try {
                                    sjd.a(bundle7);
                                    a(ksaVarA10, i14, null, 50006, new lqd(new kpd(b2), z ? (byte) 1 : (byte) 0));
                                } catch (RuntimeException e7) {
                                    w7d.L("Ignoring malformed Bundle for LibraryParams", e7);
                                }
                            } else {
                                a(ksaVarA10, i14, null, 50006, new lqd(new kpd(b2), z ? (byte) 1 : (byte) 0));
                            }
                        }
                        return true;
                    case 4006:
                        ksa ksaVarA11 = lid.a(parcel.readStrongBinder());
                        int i17 = parcel.readInt();
                        String string6 = parcel.readString();
                        Bundle bundle8 = (Bundle) c26.G(parcel, Bundle.CREATOR);
                        if (ksaVarA11 != null) {
                            if (TextUtils.isEmpty(string6)) {
                                w7d.K("subscribe(): Ignoring empty parentId");
                            } else if (bundle8 != null) {
                                try {
                                    sjd.a(bundle8);
                                    a(ksaVarA11, i17, null, 50001, new lqd(new kpd((byte) 26), z ? (byte) 1 : (byte) 0));
                                } catch (RuntimeException e8) {
                                    w7d.L("Ignoring malformed Bundle for LibraryParams", e8);
                                }
                            } else {
                                a(ksaVarA11, i17, null, 50001, new lqd(new kpd((byte) 26), z ? (byte) 1 : (byte) 0));
                            }
                        }
                        return true;
                    case 4007:
                        ksa ksaVarA12 = lid.a(parcel.readStrongBinder());
                        int i18 = parcel.readInt();
                        String string7 = parcel.readString();
                        if (ksaVarA12 != null) {
                            if (TextUtils.isEmpty(string7)) {
                                w7d.K("unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            a(ksaVarA12, i18, null, 50002, new lqd(new kpd((byte) 3), z ? (byte) 1 : (byte) 0));
                            return true;
                        }
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
        }
    }

    @Override // defpackage.ssa
    public final void p(ksa ksaVar, int i, Bundle bundle) {
        if (ksaVar == null || bundle == null) {
            return;
        }
        try {
            W0(ksaVar, i, 29, Z0(new z0c(this, nyl.b(bundle), (byte) 17)));
        } catch (RuntimeException e) {
            w7d.L("Ignoring malformed Bundle for TrackSelectionParameters", e);
        }
    }

    @Override // defpackage.ssa
    public final void p0(ksa ksaVar, int i) {
        nod nodVarI;
        if (ksaVar == null || (nodVarI = this.b.I(ksaVar.asBinder())) == null) {
            return;
        }
        X0(nodVarI, i, 9, Z0(new kpd((byte) 15)));
    }

    @Override // defpackage.ssa
    public final void q(ksa ksaVar, int i) {
        nod nodVarI;
        if (ksaVar == null || (nodVarI = this.b.I(ksaVar.asBinder())) == null) {
            return;
        }
        X0(nodVarI, i, 12, Z0(new kpd((byte) 14)));
    }

    @Override // defpackage.ssa
    public final void q0(ksa ksaVar, int i, int i2, long j) {
        if (ksaVar == null || i2 < 0) {
            return;
        }
        W0(ksaVar, i, 10, new yzb(new oo4(i2, j, this), (byte) 29));
    }

    @Override // defpackage.ssa
    public final void r(ksa ksaVar, int i, int i2, Bundle bundle) {
        if (ksaVar == null || bundle == null || i2 < 0) {
            return;
        }
        try {
            byte b = 1;
            W0(ksaVar, i, 20, new lqd(new z0c(new mo4(qjd.b(bundle), (byte) 3), new gqd(this, i2, b), (byte) 21), b));
        } catch (RuntimeException e) {
            w7d.L("Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.ssa
    public final void r0(ksa ksaVar, int i, IBinder iBinder) {
        if (ksaVar == null || iBinder == null) {
            return;
        }
        try {
            h1b h1bVarA = k14.a(iBinder);
            z0b z0bVarP = h1b.p();
            for (int i2 = 0; i2 < h1bVarA.size(); i2++) {
                Bundle bundle = (Bundle) h1bVarA.get(i2);
                bundle.getClass();
                z0bVarP.c(qjd.b(bundle));
            }
            W0(ksaVar, i, 20, new lqd(new z0c(new ki8(z0bVarP.g(), (byte) 3), new kpd((byte) 18), (byte) 21), (byte) 1));
        } catch (RuntimeException e) {
            w7d.L("Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.ssa
    public final void s(ksa ksaVar, int i) {
        nod nodVarI;
        if (ksaVar == null || (nodVarI = this.b.I(ksaVar.asBinder())) == null) {
            return;
        }
        X0(nodVarI, i, 11, Z0(new kpd((byte) 10)));
    }

    @Override // defpackage.ssa
    public final void u(ksa ksaVar, int i, int i2, int i3) {
        if (ksaVar == null || i2 < 0 || i3 < i2) {
            return;
        }
        W0(ksaVar, i, 20, new yzb(new fqd(this, i2, i3), (byte) 29));
    }

    @Override // defpackage.ssa
    public final void u0(ksa ksaVar, int i) {
        if (ksaVar == null) {
            return;
        }
        W0(ksaVar, i, 4, Z0(new kpd((byte) 23)));
    }

    @Override // defpackage.ssa
    public final void v(ksa ksaVar, int i, int i2) {
        if (ksaVar == null || i2 < 0) {
            return;
        }
        W0(ksaVar, i, 20, new yzb(new gqd(this, i2, (byte) 4), (byte) 29));
    }

    @Override // defpackage.ssa
    public final void v0(ksa ksaVar, int i, int i2, IBinder iBinder) {
        if (ksaVar == null || iBinder == null || i2 < 0) {
            return;
        }
        try {
            h1b h1bVarA = k14.a(iBinder);
            z0b z0bVarP = h1b.p();
            for (int i3 = 0; i3 < h1bVarA.size(); i3++) {
                Bundle bundle = (Bundle) h1bVarA.get(i3);
                bundle.getClass();
                z0bVarP.c(qjd.b(bundle));
            }
            W0(ksaVar, i, 20, new lqd(new z0c(new ki8(z0bVarP.g(), (byte) 2), new gqd(this, i2, (byte) 3), (byte) 21), (byte) 1));
        } catch (RuntimeException e) {
            w7d.L("Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.ssa
    public final void w0(ksa ksaVar, int i) {
        if (ksaVar == null) {
            return;
        }
        W0(ksaVar, i, 6, Z0(new kpd((byte) 12)));
    }

    @Override // defpackage.ssa
    public final void y0(ksa ksaVar, int i, long j) {
        if (ksaVar == null) {
            return;
        }
        W0(ksaVar, i, 5, Z0(new rh2(j)));
    }
}
