package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.emoji2.emojipicker.EmojiView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.opera.android.Lazy;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.chromium.components.gcm_driver.instance_id.InstanceIDBridge;

/* loaded from: classes.dex */
public abstract class n1 implements kd1, w7e, wuk, bti, a47, km, cco {
    public final /* synthetic */ byte a;
    public Object b;

    public n1(byte b) {
        this.a = b;
        switch (b) {
            case 6:
                this.b = new ArrayList();
                break;
            default:
                this.b = new ArrayDeque(20);
                break;
        }
    }

    public /* synthetic */ n1(byte b, boolean z) {
        this.a = b;
    }

    public n1(Context context, umi umiVar) {
        this.a = (byte) 7;
        nx1 nx1Var = i0i.a;
        this.b = i16.r(context, umiVar, new t1(context, (byte) 13));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rib */
    public n1(MediaCodecInfo mediaCodecInfo, String str) throws rib {
        this.a = (byte) 9;
        try {
            this.b = mediaCodecInfo.getCapabilitiesForType(str);
        } catch (RuntimeException e) {
            throw new rib(sko.j("Unable to get CodecCapabilities for mime: ", str), e);
        }
    }

    public /* synthetic */ n1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public n1(final ou9 ou9Var) {
        this.a = (byte) 11;
        this.b = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: nu9
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                ou9 ou9Var2 = ou9Var;
                if (ou9Var2.a.equals(str)) {
                    this.a.x0(ou9Var2);
                }
            }
        };
    }

    public n1(w7h w7hVar) {
        this.a = (byte) 15;
        Objects.requireNonNull(w7hVar);
        this.b = w7hVar;
    }

    public static ArrayList r0(List list, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int iF = 0;
        while (it.hasNext()) {
            aln alnVar = (aln) it.next();
            if (1 != alnVar.f() || z2) {
                if (z && alnVar.f() != iF) {
                    arrayList.add(new bkb(alnVar.f()));
                    iF = alnVar.f();
                }
                if (alnVar instanceof ill) {
                    arrayList.add(new hkb(alnVar));
                } else {
                    arrayList.add(new jkb(alnVar));
                }
            }
        }
        return arrayList;
    }

    public final void A(yz yzVar) {
        ((km) this.b).A(yzVar);
    }

    public final void A0(int i, Object obj, xt9 xt9Var, Object obj2) {
        if (Intrinsics.a(obj, hh5.a)) {
            M(i, xt9Var, null);
        }
    }

    public final void B0(tcl tclVar, long j, TimeUnit timeUnit) {
        oml omlVar = (oml) this.b;
        if (omlVar != null) {
            omlVar.cancel(false);
        }
        oml omlVar2 = new oml(tclVar.d(new cbl((Object) this, (byte) 11)));
        this.b = omlVar2;
        omlVar2.b(null, j, timeUnit, null);
    }

    public abstract void C0(Object obj);

    public void D0() {
        ((wjh) this.b).t(null);
    }

    public int E0(Context context) {
        return f03.t(2130970710, context, 2131103876);
    }

    @Override // defpackage.bti
    public final String F(String str) {
        if (!StringsKt.E(str, "PLACEHOLDER", false)) {
            String strP = c.p(str, "%s", "PLACEHOLDER");
            if (!strP.equals(str)) {
                return c.p(m(strP), "PLACEHOLDER", "%s");
            }
        }
        return str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(1:(2:14|(2:16|17)(2:18|19))(3:20|53|54))(3:21|43|44))(8:22|57|23|55|39|40|(3:42|43|44)|51))(1:28))(5:29|(1:31)|32|(1:34)|51)|35|59|36|(5:38|55|39|40|(0))|51|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00da, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00db, code lost:
    
        r4 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F0(kotlin.jvm.functions.Function2 r12, mt5 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n1.F0(kotlin.jvm.functions.Function2, mt5):java.lang.Object");
    }

    public final List G() {
        return (List) this.b;
    }

    public void G0(boolean z) {
    }

    public final boolean H() {
        List list = (List) this.b;
        return list.isEmpty() || (list.size() == 1 && ((zvb) list.get(0)).c());
    }

    public void I() {
    }

    public void J() {
    }

    public void K() {
        EmojiView emojiView;
        int[][] iArr = (int[][]) this.b;
        if (iArr == null) {
            iArr = null;
        }
        for (int[] iArr2 : iArr) {
            LinearLayout linearLayout = new LinearLayout(i0());
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            for (int i : iArr2) {
                if (i == 0) {
                    emojiView = new EmojiView(i0(), (AttributeSet) null);
                } else {
                    EmojiView emojiView2 = new EmojiView(i0(), (AttributeSet) null);
                    emojiView2.a = false;
                    CharSequence charSequence = (CharSequence) q0().get(i - 1);
                    emojiView2.d = charSequence;
                    emojiView2.post(new cn7(charSequence, emojiView2, (byte) 4));
                    emojiView2.setOnClickListener(l0());
                    if (i == 1) {
                        o0().post(new bn7((Object) emojiView2, (byte) 9));
                    }
                    emojiView = emojiView2;
                }
                emojiView.setLayoutParams(new ViewGroup.LayoutParams(p0().getWidth(), p0().getHeight()));
                linearLayout.addView(emojiView);
            }
            o0().addView(linearLayout);
        }
    }

    public final boolean L(int i, xt9 xt9Var, Object obj) {
        ArrayList arrayList = xt9Var.a;
        if (arrayList == null) {
            M(i, xt9Var, null);
            return true;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof qt9)) {
                if (!(obj2 instanceof xt9)) {
                    n57.h(obj2, "Unexpected child source info ");
                    break;
                }
                if (L(i, (xt9) obj2, obj)) {
                    M(0, xt9Var, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                M(0, xt9Var, obj2);
                return true;
            }
            i2++;
        }
        return false;
    }

    public final void M(int i, xt9 xt9Var, Object obj) {
        ((ArrayList) this.b).add(new zg5(i, null, null));
    }

    public int N(Context context) {
        return f03.t(2130970709, context, 2131103876);
    }

    public final dz O() {
        Object obj;
        cz czVarW = W();
        w7h w7hVar = (w7h) this.b;
        HashMap map = w7hVar.h;
        WeakReference weakReference = (WeakReference) map.get(czVarW);
        if (weakReference == null) {
            obj = null;
        } else {
            obj = weakReference.get();
            if (obj == null) {
                map.remove(czVarW);
                obj = null;
            }
        }
        dz dzVar = (dz) obj;
        if (dzVar != null) {
            return dzVar;
        }
        dz dzVarV = V(czVarW);
        w7hVar.h.put(czVarW, new WeakReference(dzVarV));
        return dzVarV;
    }

    public List P(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new akb());
        arrayList.addAll(r0(list, false, true));
        return arrayList;
    }

    public List Q(ArrayList arrayList) {
        return l08.a;
    }

    public abstract void R();

    public final void S() {
        oml omlVar = (oml) this.b;
        if (omlVar != null) {
            omlVar.cancel(false);
            this.b = null;
        }
    }

    public final void T() {
        Object objF = ((Lazy) this.b).f();
        if (objF != null) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(4098);
            ((c5k) ((o8k) objF)).c.dispatchTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    public final n4k U(Uri uri, Parcelable parcelable) {
        cue cueVar = "newsfeed".equals(wqm.m(uri, "newsBackend")) ? cue.NewsFeed : cue.None;
        String strM = wqm.m(uri, "newsCategory");
        n4k n4kVar = new n4k((c5k) ((Lazy) this.b).get(), Intrinsics.a(uri.getHost(), "startpage"), parcelable);
        if (strM != null) {
            n4kVar.g = new f1p(cueVar, strM);
        }
        return n4kVar;
    }

    public abstract dz V(cz czVar);

    public abstract cz W();

    public abstract void X();

    public final void Y(String str) {
        tbc tbcVar = tbc.a;
        if (((tbc) this.b).compareTo(tbcVar) <= 0) {
            Z(tbcVar, str);
        }
    }

    public void Z(tbc tbcVar, String str) {
    }

    public final void a(yz yzVar, dl dlVar) {
        ((km) this.b).a(yzVar, dlVar);
    }

    public abstract Object a0();

    public final void b(yz yzVar, dl dlVar) {
        ((km) this.b).b(yzVar, dlVar);
    }

    public abstract z37 b0();

    public void c(dl dlVar) {
        ((km) this.b).c(dlVar);
    }

    public abstract void c0();

    public final void d0() {
        if (!InstanceIDBridge.d) {
            new zab(this, (byte) 0).b(fe2.e);
            return;
        }
        InstanceIDBridge instanceIDBridge = (InstanceIDBridge) this.b;
        if (instanceIDBridge.c == null) {
            instanceIDBridge.c = abb.a(instanceIDBridge.a);
        }
        C0(a0());
    }

    public abstract void e0();

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                return this == obj;
            default:
                return super.equals(obj);
        }
    }

    public final z0 f0(byte[] bArr) {
        z0 z0VarQ = z0.q(bArr);
        if (((Class) this.b).isInstance(z0VarQ)) {
            return z0VarQ;
        }
        qp2.o("unexpected object: ".concat(sgb.D(z0VarQ)));
        return null;
    }

    public z0 g0(d1 d1Var) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    public z0 h0(p86 p86Var) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    public abstract Context i0();

    public final void j(yz yzVar, hl hlVar) {
        ((km) this.b).j(yzVar, hlVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0.isInstance(r6) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z0 j0(yy2 r7, boolean r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            java.lang.Class r0 = (java.lang.Class) r0
            kfo.x(r7)
            byte r1 = r7.a
            x r2 = r7.d
            r3 = 0
            java.lang.String r4 = "unexpected explicit encoding"
            if (r8 == 0) goto L27
            boolean r6 = r7.u()
            if (r6 == 0) goto L21
            z0 r6 = r2.e()
            boolean r7 = r0.isInstance(r6)
            if (r7 == 0) goto L3c
            goto L72
        L21:
            java.lang.String r6 = "object implicit - explicit expected."
            defpackage.qp2.n(r6)
            return r3
        L27:
            r8 = 1
            if (r8 == r1) goto L87
            z0 r2 = r2.e()
            r5 = 3
            if (r1 == r5) goto L52
            r7 = 4
            if (r1 == r7) goto L40
            boolean r6 = r0.isInstance(r2)
            if (r6 == 0) goto L3c
            r6 = r2
            goto L72
        L3c:
            defpackage.qp2.n(r4)
            return r3
        L40:
            boolean r7 = r2 instanceof d1
            if (r7 == 0) goto L4b
            d1 r2 = (d1) r2
            z0 r6 = r6.g0(r2)
            goto L72
        L4b:
            p86 r2 = (p86) r2
            z0 r6 = r6.h0(r2)
            goto L72
        L52:
            byte r7 = r7.e
            r1 = -1
            switch(r7) {
                case 0: goto L69;
                case 1: goto L60;
                default: goto L58;
            }
        L58:
            v86 r7 = new v86
            r7.<init>(r2, r8)
            r7.d = r1
            goto L6e
        L60:
            v86 r7 = new v86
            r8 = 0
            r7.<init>(r2, r8)
            r7.d = r1
            goto L6e
        L69:
            ry2 r7 = new ry2
            r7.<init>(r2)
        L6e:
            z0 r6 = r6.g0(r7)
        L72:
            boolean r7 = r0.isInstance(r6)
            if (r7 == 0) goto L79
            return r6
        L79:
            java.lang.String r6 = sgb.D(r6)
            java.lang.String r7 = "unexpected object: "
            java.lang.String r6 = r7.concat(r6)
            defpackage.qp2.o(r6)
            return r3
        L87:
            java.lang.String r6 = "object explicit - implicit expected."
            defpackage.qp2.n(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n1.j0(yy2, boolean):z0");
    }

    public void k(yz yzVar, dl dlVar) {
        ((km) this.b).k(yzVar, dlVar);
    }

    public final int k0() {
        return f03.w(2130969437, (Context) this.b, 2131165500);
    }

    public final void l(yz yzVar) {
        ((km) this.b).l(yzVar);
    }

    public abstract View.OnClickListener l0();

    public int m0() {
        return 6;
    }

    public final void n(yz yzVar, boolean z) {
        ((km) this.b).n(yzVar, z);
    }

    public int n0() {
        return 3;
    }

    public abstract LinearLayout o0();

    public void p(yz yzVar, dl dlVar, boolean z) {
        ((km) this.b).p(yzVar, dlVar, z);
    }

    public abstract View p0();

    public abstract List q0();

    public abstract void run();

    public final void s(yz yzVar) {
        ((km) this.b).s(yzVar);
    }

    public int s0(Context context) {
        return f03.t(2130970707, context, 2131103876);
    }

    public void t(dl dlVar) {
        ((km) this.b).t(dlVar);
    }

    public boolean t0() {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable((Activity) ((wjh) this.b).b) == 0;
    }

    public final String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.b;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public final void u0(int i, Function1 function1) {
        va1 va1Var = (va1) this.b;
        ta1 ta1Var = (ta1) va1Var.b.get();
        if (ta1Var != null) {
            if (ta1Var.d.add(Integer.valueOf(i))) {
                function1.invoke(new t02(ta1Var, (byte) 21));
            }
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            function1.invoke(new t02(linkedHashSet, (byte) 22));
            String[] strArr = (String[]) linkedHashSet.toArray(new String[0]);
            va1Var.o((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    public final void v(xz xzVar, yz yzVar, dl dlVar) {
        ((km) this.b).v(xzVar, yzVar, dlVar);
    }

    public final void v0() {
        ((Runnable) this.b).run();
    }

    public final v7e w(d5o d5oVar) {
        return new v24((n19) this.b, (byte) 2);
    }

    public final void w0(sng sngVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(sngVar);
        }
    }

    public final void x(yz yzVar, dl dlVar) {
        ((km) this.b).x(yzVar, dlVar);
    }

    public abstract void x0(ou9 ou9Var);

    public void y(Function1 function1) {
        umi umiVar = (umi) this.b;
        nml nmlVarE = umiVar.e(new r2n((Object) this, (byte) 25));
        nmlVarE.b(umiVar.f(new o62(function1, (byte) 6)));
        nmlVarE.a(Unit.a);
    }

    public final void y0(ta1 ta1Var, ta1 ta1Var2, Throwable th, Object obj) throws Throwable {
        boolean z = false;
        int i = 0;
        int i2 = 0;
        z = false;
        if (ta1Var2 == null) {
            boolean z2 = ta1Var.f;
            ArrayList arrayList = ta1Var.c;
            ArrayList arrayList2 = ta1Var.b;
            LinkedHashSet linkedHashSet = ta1Var.e;
            if (z2 && ta1Var.g) {
                if (!linkedHashSet.isEmpty()) {
                    va1 va1Var = (va1) this.b;
                    String[] strArr = (String[]) linkedHashSet.toArray(new String[0]);
                    va1Var.o((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                linkedHashSet.clear();
                ta1Var.d.clear();
                int size = arrayList2.size();
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    ((Function0) obj2).invoke();
                }
                arrayList2.clear();
            } else {
                try {
                    int size2 = arrayList.size();
                    while (i2 < size2) {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        ((Function0) obj3).invoke();
                    }
                    arrayList.clear();
                } catch (Throwable th2) {
                    if (th == null) {
                        throw th2;
                    }
                    StringBuilder sb = new StringBuilder("Exception while rolling back from an exception.\nOriginal exception: ");
                    sb.append(th);
                    Throwable cause = th.getCause();
                    sb.append("\nwith cause ");
                    sb.append(cause);
                    sb.append("\n\nRollback exception: ");
                    sb.append(th2);
                    throw new Throwable(sb.toString(), th2);
                }
            }
        } else {
            if (ta1Var.f && ta1Var.g) {
                z = true;
            }
            ta1Var2.g = z;
            ta1Var2.b.addAll(ta1Var.b);
            ta1Var2.c.addAll(ta1Var.c);
            ta1Var2.d.addAll(ta1Var.d);
            ta1Var2.e.addAll(ta1Var.e);
        }
        if (th != null) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yqg z0(lac r10) {
        /*
            r9 = this;
            java.util.List r0 = r10.a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = k95.o(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r0.next()
            mac r2 = (mac) r2
            hqg r3 = new hqg
            boolean r4 = r2.b
            java.lang.Object r5 = r9.b
            com.usercentrics.sdk.v2.settings.data.UsercentricsSettings r5 = (com.usercentrics.sdk.v2.settings.data.UsercentricsSettings) r5
            awm r6 = r2.c
            if (r4 == 0) goto L34
            awm r7 = awm.b
            if (r6 != r7) goto L46
            com.usercentrics.sdk.v2.settings.data.UsercentricsLabels r5 = r5.a
            java.lang.String r5 = r5.K0
            goto L4a
        L34:
            awm r7 = awm.b
            if (r6 != r7) goto L3d
            com.usercentrics.sdk.v2.settings.data.UsercentricsLabels r5 = r5.a
            java.lang.String r5 = r5.J0
            goto L4a
        L3d:
            awm r7 = awm.a
            if (r6 != r7) goto L46
            com.usercentrics.sdk.v2.settings.data.UsercentricsLabels r5 = r5.a
            java.lang.String r5 = r5.U
            goto L4a
        L46:
            com.usercentrics.sdk.v2.settings.data.UsercentricsLabels r5 = r5.a
            java.lang.String r5 = r5.f0
        L4a:
            ch6 r6 = new ch6
            long r7 = r2.e
            r6.<init>(r7)
            ah6 r2 = ch6.Companion
            r2.getClass()
            zyk r2 = ch6.d
            java.lang.Object r2 = r2.getValue()
            java.text.SimpleDateFormat r2 = (java.text.SimpleDateFormat) r2
            java.util.Calendar r6 = r6.b
            java.util.Date r6 = r6.getTime()
            java.lang.String r2 = r2.format(r6)
            r3.<init>(r4, r5, r2)
            r1.add(r3)
            goto L13
        L6f:
            yqg r9 = new yqg
            boolean r10 = r10.b
            r9.<init>(r1, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n1.z0(lac):yqg");
    }
}
