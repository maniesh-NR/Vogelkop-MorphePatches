package defpackage;

import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.VelocityTracker;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.google.common.util.concurrent.ListenableFuture;
import com.opera.android.browser.TabInfo;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class ypd implements qr9, mod, ann, x9l {
    public Object a;
    public Object b;
    public Object c;
    public long d;
    public final /* synthetic */ Object e;

    public ypd(a21 a21Var, z5l z5lVar, pde pdeVar) {
        this.b = a21Var;
        this.c = z5lVar;
        this.e = pdeVar;
        this.a = a21Var;
    }

    public ypd(afe afeVar, Map map, xkn xknVar, long j, Integer num) {
        this.a = afeVar;
        this.b = map;
        this.c = xknVar;
        this.d = j;
        this.e = num;
    }

    public ypd(aqd aqdVar) {
        this.e = aqdVar;
        this.a = vjd.K;
        this.b = "";
        this.d = -9223372036854775807L;
    }

    public ypd(ypd ypdVar, vjd vjdVar, String str, Uri uri, long j) {
        this.e = ypdVar;
        this.a = vjdVar;
        this.b = str;
        this.c = uri;
        this.d = j;
    }

    public static /* synthetic */ void K(ypd ypdVar, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        ypdVar.J(i, 0, i2);
    }

    public final void A(vjd vjdVar) {
        aqd aqdVar = (aqd) this.e;
        bpd bpdVar = aqdVar.j;
        CharSequence queueTitle = ((lhd) ((wub) bpdVar.c).a).a.getQueueTitle();
        CharSequence charSequence = vjdVar.a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        xkg xkgVar = aqdVar.f.t;
        if (!aqdVar.v.a(17) || !xkgVar.P().a(17)) {
            charSequence = null;
        }
        ((xod) bpdVar.b).a.setQueueTitle(charSequence);
    }

    public final void B(int i) {
        bpd bpdVar = ((aqd) this.e).j;
        int i2 = nac.a;
        int i3 = 0;
        if (i != 0) {
            if (i == 1) {
                i3 = 1;
            } else if (i != 2) {
                w7d.K("Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
            } else {
                i3 = 2;
            }
        }
        xod xodVar = (xod) bpdVar.b;
        if (xodVar.j != i3) {
            xodVar.j = i3;
            synchronized (xodVar.d) {
                int iBeginBroadcast = xodVar.f.beginBroadcast() - 1;
                while (true) {
                    RemoteCallbackList remoteCallbackList = xodVar.f;
                    if (iBeginBroadcast >= 0) {
                        try {
                            remoteCallbackList.getBroadcastItem(iBeginBroadcast).onRepeatModeChanged(i3);
                        } catch (RemoteException | SecurityException e) {
                            w7d.r("Dead object in setRepeatMode.", e);
                        }
                        iBeginBroadcast--;
                    } else {
                        remoteCallbackList.finishBroadcast();
                    }
                }
            }
        }
    }

    @Override // defpackage.x9l
    public final ikc C() {
        return (pde) ((a21) this.a).m;
    }

    @Override // defpackage.x9l
    public final boolean D(int i) {
        return ((a21) this.a).D(i);
    }

    @Override // defpackage.x9l
    public final b2l E(int i) {
        return ((a21) this.a).E(i);
    }

    public final void F(boolean z) {
        bpd bpdVar = ((aqd) this.e).j;
        int i = nac.a;
        xod xodVar = (xod) bpdVar.b;
        if (xodVar.k != z) {
            xodVar.k = z ? 1 : 0;
            synchronized (xodVar.d) {
                int iBeginBroadcast = xodVar.f.beginBroadcast() - 1;
                while (true) {
                    RemoteCallbackList remoteCallbackList = xodVar.f;
                    if (iBeginBroadcast >= 0) {
                        try {
                            remoteCallbackList.getBroadcastItem(iBeginBroadcast).C(z ? 1 : 0);
                        } catch (RemoteException | SecurityException e) {
                            w7d.r("Dead object in setShuffleMode.", e);
                        }
                        iBeginBroadcast--;
                    } else {
                        remoteCallbackList.finishBroadcast();
                    }
                }
            }
        }
    }

    public final void G(gql gqlVar) {
        Q(gqlVar);
        M();
    }

    public final boolean H(i iVar) {
        z5l z5lVar = (z5l) this.c;
        s9i s9iVar = z5lVar.e;
        if (s9iVar.Y()) {
            return false;
        }
        if ((iVar instanceof jal) && ((eyj) z5lVar.c.g()).v) {
            ((a21) this.b).X(((jal) iVar).X());
            new gel(iVar, s9iVar, z5lVar.q.l);
        }
        llb llbVar = z5lVar.r;
        clb clbVar = ((glb) llbVar).m;
        RecyclerView recyclerView = ((glb) llbVar).r;
        if ((clb.c(clbVar.f(recyclerView, iVar), recyclerView.getLayoutDirection()) & 16711680) == 0 || iVar.itemView.getParent() != ((glb) llbVar).r) {
            return true;
        }
        VelocityTracker velocityTracker = ((glb) llbVar).t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        ((glb) llbVar).t = VelocityTracker.obtain();
        ((glb) llbVar).i = 0.0f;
        ((glb) llbVar).h = 0.0f;
        llbVar.n(iVar, 2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0286 A[Catch: all -> 0x02fa, TryCatch #1 {all -> 0x02fa, blocks: (B:108:0x0276, B:109:0x0280, B:111:0x0286, B:113:0x029e, B:115:0x02a8, B:116:0x02c8, B:118:0x02d5, B:120:0x02df), top: B:130:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean I(defpackage.jal r23, androidx.recyclerview.widget.i r24) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ypd.I(jal, androidx.recyclerview.widget.i):boolean");
    }

    public final void J(int i, int i2, int i3) {
        z5l z5lVar = (z5l) this.c;
        pde pdeVar = z5lVar.c;
        z5lVar.b();
        if (((pde) this.e).g() == b3c.d) {
            z5lVar.f.H0(i);
            return;
        }
        z5lVar.p.a++;
        RecyclerView recyclerView = z5lVar.f;
        int i4 = ((eyj) pdeVar.g()).E;
        int i5 = ((eyj) pdeVar.g()).F;
        int i6 = i5 < i2 ? i2 : i5;
        int i7 = ((eyj) pdeVar.g()).G;
        exg.y(recyclerView, i, i4, i6, i7 < i3 ? i3 : i7, new u5l(z5lVar, (byte) 1), true);
    }

    @Override // defpackage.w9l
    public final void L(Long l) {
        ((a21) this.a).L(l);
    }

    public final void M() {
        long j;
        Uri uri;
        vjd vjdVar;
        Uri uri2;
        aqd aqdVar = (aqd) this.e;
        npd npdVar = aqdVar.f;
        xkg xkgVar = npdVar.t;
        qjd qjdVarW0 = xkgVar.w0();
        vjd vjdVarY0 = xkgVar.y0();
        long duration = -9223372036854775807L;
        if ((!xkgVar.C(16) || !xkgVar.t0()) && xkgVar.C(16)) {
            duration = xkgVar.getDuration();
        }
        String str = qjdVarW0 != null ? qjdVarW0.a : "";
        Bitmap bitmap = null;
        Uri uri3 = (qjdVarW0 == null || (uri2 = qjdVarW0.g.a) == null) ? null : uri2;
        if (Objects.equals((vjd) this.a, vjdVarY0) && Objects.equals((String) this.b, str) && Objects.equals((Uri) this.c, uri3) && this.d == duration) {
            return;
        }
        this.b = str;
        this.c = uri3;
        this.a = vjdVarY0;
        this.d = duration;
        ListenableFuture listenableFutureF = npdVar.m.f(vjdVarY0);
        if (listenableFutureF != null) {
            aqdVar.p = null;
            if (listenableFutureF.isDone()) {
                try {
                    bitmap = (Bitmap) yr9.a(listenableFutureF);
                } catch (CancellationException | ExecutionException e) {
                    w7d.K("Failed to load bitmap: " + e.getMessage());
                }
                j = duration;
                uri = uri3;
                vjdVar = vjdVarY0;
            } else {
                j = duration;
                uri = uri3;
                vjdVar = vjdVarY0;
                ypd ypdVar = new ypd(this, vjdVar, str, uri, j);
                str = str;
                aqdVar.p = ypdVar;
                Handler handler = npdVar.l;
                Objects.requireNonNull(handler);
                listenableFutureF.addListener(new vr9(listenableFutureF, ypdVar, (byte) 0), new jj5(handler, (byte) 1));
            }
        } else {
            j = duration;
            uri = uri3;
            vjdVar = vjdVarY0;
        }
        aqdVar.j.S(nac.b(vjdVar, str, uri, j, bitmap));
    }

    @Override // defpackage.x9l
    public final void N(z3 z3Var) {
        ((a21) this.a).N(z3Var);
    }

    @Override // defpackage.x9l
    public final void O(Iterable iterable, boolean z, boolean z2) {
        ((a21) this.a).O(iterable, false, z2);
    }

    @Override // defpackage.x9l
    public final void P(Integer num, Set set, vr0 vr0Var) {
        ((a21) this.a).P(num, set, vr0Var);
    }

    public final void Q(gql gqlVar) {
        aqd aqdVar = (aqd) this.e;
        npd npdVar = aqdVar.f;
        xkg xkgVar = npdVar.t;
        if (!aqdVar.v.a(17) || !xkgVar.P().a(17) || gqlVar.p()) {
            aqdVar.j.U((ArrayList) null);
            return;
        }
        int i = nac.a;
        ArrayList arrayList = new ArrayList();
        fql fqlVar = new fql();
        for (int i2 = 0; i2 < gqlVar.o(); i2++) {
            arrayList.add(gqlVar.m(i2, fqlVar, 0L).b);
        }
        ArrayList arrayList2 = new ArrayList();
        qn qnVar = new qn(this, new AtomicInteger(0), arrayList, arrayList2, (byte) 12);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr = ((qjd) arrayList.get(i3)).e.k;
            if (bArr == null) {
                arrayList2.add(null);
                qnVar.run();
            } else {
                ListenableFuture listenableFutureM = npdVar.m.m(bArr);
                arrayList2.add(listenableFutureM);
                Handler handler = npdVar.l;
                Objects.requireNonNull(handler);
                listenableFutureM.addListener(qnVar, new jj5(handler, (byte) 1));
            }
        }
    }

    @Override // defpackage.x9l
    public final boolean X(List list) {
        return ((a21) this.a).X(list);
    }

    public final void a(int i, n3j n3jVar) {
        Bundle bundle = Bundle.EMPTY;
        boolean zIsEmpty = bundle.isEmpty();
        Bundle bundle2 = n3jVar.c;
        if (zIsEmpty) {
            bundle = bundle2;
        } else if (!bundle2.isEmpty()) {
            Bundle bundle3 = new Bundle(bundle2);
            bundle3.putAll(bundle);
            bundle = bundle3;
        }
        bpd bpdVar = ((aqd) this.e).j;
        String str = n3jVar.b;
        bpdVar.getClass();
        if (TextUtils.isEmpty(str)) {
            qp2.o("event cannot be null or empty");
        } else {
            ((xod) bpdVar.b).a.sendSessionEvent(str, bundle);
        }
    }

    @Override // defpackage.ann
    public final void d() {
        ((afe) this.a).setValue(new cff(this.d));
    }

    @Override // defpackage.x9l
    public final void d0(b2l b2lVar) {
        ((a21) this.a).d0(b2lVar);
    }

    @Override // defpackage.ann
    public final void e() {
        ((afe) this.a).setValue(new cff(this.d));
    }

    public final void f() {
    }

    @Override // defpackage.x9l
    public final void g0(Set set, pdb pdbVar, vr0 vr0Var, boolean z) {
        ((a21) this.a).g0(set, pdbVar, vr0Var, z);
    }

    public final void h(int i, c4j c4jVar, boolean z, boolean z2, int i2) {
        aqd aqdVar = (aqd) this.e;
        aqdVar.Y(aqdVar.f.t);
    }

    @Override // defpackage.w9l
    public final b2l h0(b2l b2lVar, TabInfo tabInfo) {
        return ((a21) this.a).h0(b2lVar, tabInfo);
    }

    public final void i(int i, cig cigVar) {
        aqd aqdVar = (aqd) this.e;
        xkg xkgVar = aqdVar.f.t;
        byte b = xkgVar.C(20) ? (byte) 4 : (byte) 0;
        if (aqdVar.q != b) {
            aqdVar.q = b;
            ((xod) aqdVar.j.b).a.setFlags(b | 3);
        }
        aqdVar.Y(xkgVar);
    }

    @Override // defpackage.w9l
    public final b2l j0(p6l p6lVar, TabInfo tabInfo) {
        return ((a21) this.a).j0(p6lVar, tabInfo);
    }

    @Override // defpackage.w9l
    public final b2l k(p6l p6lVar) {
        return ((a21) this.a).k(p6lVar);
    }

    @Override // defpackage.x9l
    public final void k0() {
        ((a21) this.a).k0();
    }

    @Override // defpackage.x9l
    public final void m(b2l b2lVar) {
        ((a21) this.a).m(b2lVar);
    }

    @Override // defpackage.x9l
    public final void m0(LinkedHashSet linkedHashSet) {
        ((a21) this.a).m0(linkedHashSet);
    }

    public final int n(i iVar) {
        boolean zU = exg.u(((z5l) this.c).f);
        if (zU) {
            return (iVar.itemView.getWidth() / 2) + zed.b(iVar.itemView.getTranslationX()) + iVar.itemView.getLeft();
        }
        if (zU) {
            h9o.p();
            return 0;
        }
        return (iVar.itemView.getHeight() / 2) + zed.b(iVar.itemView.getTranslationY()) + iVar.itemView.getTop();
    }

    @Override // defpackage.x9l
    public final void o() {
        ((a21) this.a).o();
    }

    @Override // defpackage.x9l
    public final void o0(Iterable iterable, boolean z, boolean z2) {
        ((a21) this.a).o0(iterable, false, z2);
    }

    public final void onFailure(Throwable th) {
        if (this != ((aqd) ((ypd) this.e).e).p) {
            return;
        }
        w7d.K("Failed to load bitmap: " + th.getMessage());
    }

    public final void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        aqd aqdVar = (aqd) ((ypd) this.e).e;
        if (this != aqdVar.p) {
            return;
        }
        aqdVar.j.S(nac.b((vjd) this.a, (String) this.b, (Uri) this.c, this.d, bitmap));
        npd npdVar = aqdVar.f;
        tym.S(npdVar.o, new gpd(npdVar, (byte) 1));
    }

    public final void p(b2l b2lVar, pdb pdbVar) {
        a21 a21Var = (a21) this.a;
        qdb qdbVar = (qdb) a21Var.a;
        qdbVar.b(vr0.y);
        qdbVar.a(pdbVar);
        ((k6l) a21Var.d).k(b2lVar);
    }

    @Override // defpackage.x9l
    public final void p0(int i) {
        ((a21) this.a).p0(i);
    }

    public final void q(int i) {
        pde pdeVar = (pde) ((a21) this.a).m;
        LinkedHashSet linkedHashSetM0 = CollectionsKt.m0((Iterable) pdeVar.g());
        if (linkedHashSetM0.remove(Integer.valueOf(i))) {
            pdeVar.r(linkedHashSetM0);
        }
    }

    public final void r(int i) {
        ((a21) this.a).e(i);
    }

    public final void s(pf2 pf2Var) {
        aqd aqdVar = (aqd) this.e;
        if (aqdVar.f.t.X().a == 0) {
            bpd bpdVar = aqdVar.j;
            int i = 1;
            if ((pf2Var.b & 1) != 1) {
                switch (pf2Var.c) {
                    case 2:
                        i = 0;
                        break;
                    case 3:
                        i = 8;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        i = 5;
                        break;
                    case 6:
                        i = 2;
                        break;
                    case 11:
                        i = 10;
                        break;
                    case 12:
                    default:
                        i = 3;
                        break;
                    case 13:
                        break;
                }
            }
            xod xodVar = (xod) bpdVar.b;
            xodVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            xodVar.a.setPlaybackToLocal(builder.build());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            r12 = this;
            java.lang.Object r12 = r12.e
            aqd r12 = (aqd) r12
            bpd r0 = r12.j
            npd r1 = r12.f
            xkg r8 = r1.t
            u67 r1 = r8.X()
            int r1 = r1.a
            r9 = 2
            r10 = 1
            r11 = 0
            if (r1 != 0) goto L17
            r1 = 0
            goto L68
        L17:
            cig r1 = r8.P()
            r2 = 26
            r3 = 34
            int[] r2 = new int[]{r2, r3}
            w69 r3 = r1.a
            boolean r2 = r3.a(r2)
            if (r2 == 0) goto L3f
            r2 = 25
            r3 = 33
            int[] r2 = new int[]{r2, r3}
            w69 r1 = r1.a
            boolean r1 = r1.a(r2)
            if (r1 == 0) goto L3d
            r3 = r9
            goto L40
        L3d:
            r3 = r10
            goto L40
        L3f:
            r3 = r11
        L40:
            android.os.Handler r7 = new android.os.Handler
            gig r1 = r8.b
            android.os.Looper r1 = r1.I()
            r7.<init>(r1)
            r1 = 23
            boolean r1 = r8.C(r1)
            if (r1 == 0) goto L59
            int r1 = r8.N()
            r5 = r1
            goto L5a
        L59:
            r5 = r11
        L5a:
            u67 r1 = r8.X()
            wpd r2 = new wpd
            int r4 = r1.c
            java.lang.String r6 = r1.d
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1 = r2
        L68:
            r12.m = r1
            if (r1 != 0) goto Lad
            r12 = 21
            boolean r12 = r8.C(r12)
            if (r12 == 0) goto L79
            pf2 r12 = r8.W()
            goto L7b
        L79:
            pf2 r12 = pf2.i
        L7b:
            int r1 = r12.b
            r1 = r1 & r10
            if (r1 == r10) goto L87
            int r12 = r12.c
            switch(r12) {
                case 2: goto L93;
                case 3: goto L90;
                case 4: goto L8e;
                case 5: goto L8c;
                case 6: goto L94;
                case 7: goto L8c;
                case 8: goto L8c;
                case 9: goto L8c;
                case 10: goto L8c;
                case 11: goto L89;
                case 12: goto L85;
                case 13: goto L87;
                default: goto L85;
            }
        L85:
            r9 = 3
            goto L94
        L87:
            r9 = r10
            goto L94
        L89:
            r9 = 10
            goto L94
        L8c:
            r9 = 5
            goto L94
        L8e:
            r9 = 4
            goto L94
        L90:
            r9 = 8
            goto L94
        L93:
            r9 = r11
        L94:
            java.lang.Object r12 = r0.b
            xod r12 = (xod) r12
            r12.getClass()
            android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
            r0.<init>()
            r0.setLegacyStreamType(r9)
            android.media.session.MediaSession r12 = r12.a
            android.media.AudioAttributes r0 = r0.build()
            r12.setPlaybackToLocal(r0)
            return
        Lad:
            java.lang.Object r12 = r0.b
            xod r12 = (xod) r12
            android.media.session.MediaSession r12 = r12.a
            android.media.VolumeProvider r0 = r1.a()
            r12.setPlaybackToRemote(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ypd.t():void");
    }

    @Override // defpackage.ann
    public final void u(bnn bnnVar) {
        ((afe) this.a).setValue(new cff(this.d));
    }

    public final void v(qjd qjdVar) {
        M();
        aqd aqdVar = (aqd) this.e;
        bpd bpdVar = aqdVar.j;
        if (qjdVar == null) {
            ((xod) bpdVar.b).a.setRatingType(0);
        } else {
            ((xod) bpdVar.b).a.setRatingType(nac.f(qjdVar.e.i));
        }
        aqdVar.Y(aqdVar.f.t);
    }

    @Override // defpackage.x9l
    public final void w(LinkedHashSet linkedHashSet) {
        ((a21) this.a).w(linkedHashSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(int r3, xkg r4, xkg r5) {
        /*
            r2 = this;
            java.lang.Object r3 = r2.e
            aqd r3 = (aqd) r3
            gql r0 = r5.x0()
            if (r4 == 0) goto L14
            gql r1 = r4.x0()
            boolean r1 = java.util.Objects.equals(r1, r0)
            if (r1 != 0) goto L17
        L14:
            r2.G(r0)
        L17:
            r0 = 18
            boolean r1 = r5.C(r0)
            if (r1 == 0) goto L24
            vjd r1 = r5.d0()
            goto L26
        L24:
            vjd r1 = vjd.K
        L26:
            if (r4 == 0) goto L3b
            boolean r0 = r4.C(r0)
            if (r0 == 0) goto L33
            vjd r0 = r4.d0()
            goto L35
        L33:
            vjd r0 = vjd.K
        L35:
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 != 0) goto L3e
        L3b:
            r2.A(r1)
        L3e:
            vjd r0 = r5.y0()
            if (r4 == 0) goto L4e
            vjd r1 = r4.y0()
            boolean r0 = java.util.Objects.equals(r1, r0)
            if (r0 != 0) goto L51
        L4e:
            r2.M()
        L51:
            if (r4 == 0) goto L5d
            boolean r0 = r4.getShuffleModeEnabled()
            boolean r1 = r5.getShuffleModeEnabled()
            if (r0 == r1) goto L64
        L5d:
            boolean r0 = r5.getShuffleModeEnabled()
            r2.F(r0)
        L64:
            if (r4 == 0) goto L70
            int r0 = r4.getRepeatMode()
            int r1 = r5.getRepeatMode()
            if (r0 == r1) goto L77
        L70:
            int r0 = r5.getRepeatMode()
            r2.B(r0)
        L77:
            r5.X()
            r2.t()
            r0 = 20
            boolean r0 = r5.C(r0)
            if (r0 == 0) goto L87
            r0 = 4
            goto L88
        L87:
            r0 = 0
        L88:
            byte r1 = r3.q
            if (r1 == r0) goto L9b
            r3.q = r0
            bpd r1 = r3.j
            java.lang.Object r1 = r1.b
            xod r1 = (xod) r1
            android.media.session.MediaSession r1 = r1.a
            r0 = r0 | 3
            r1.setFlags(r0)
        L9b:
            qjd r0 = r5.w0()
            if (r4 == 0) goto Laf
            qjd r4 = r4.w0()
            boolean r4 = java.util.Objects.equals(r4, r0)
            if (r4 == 0) goto Laf
            r3.Y(r5)
            return
        Laf:
            r2.v(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ypd.x(int, xkg, xkg):void");
    }

    @Override // defpackage.w9l
    public final void y() {
        ((a21) this.a).y();
    }

    @Override // defpackage.ann
    public final void z(cnn cnnVar) {
        dff bffVar;
        long j = this.d;
        Bitmap bitmap = cnnVar.a.g;
        afe afeVar = (afe) this.a;
        if (bitmap != null) {
            yg3 yg3Var = new yg3(new j71(bitmap));
            ((Map) this.b).put((xkn) this.c, yg3Var);
            bffVar = new dff(yg3Var, j, true);
        } else {
            bffVar = new bff(j, (Integer) this.e);
        }
        afeVar.setValue(bffVar);
    }
}
