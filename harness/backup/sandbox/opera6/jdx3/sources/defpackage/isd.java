package defpackage;

import J.N;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Region;
import android.net.Uri;
import android.nfc.FormatException;
import android.nfc.NdefMessage;
import android.nfc.tech.Ndef;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.leanplum.internal.Constants;
import com.leanplum.internal.RequestBuilder;
import com.leanplum.internal.ResourceQualifiers;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.suggestion.adapter.ProductSuggestionListItem;
import com.opera.android.ui.catalog.widget.OperaProgressIndicator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.MissingFormatArgumentException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import okhttp3.internal._CacheControlCommonKt;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class isd implements hsd, rcc, dn, bwe, f94, vwf, jak, d94, w7e, zqb, tri, n2k {
    public final /* synthetic */ byte a;
    public Object b;

    public isd(byte b) {
        this.a = b;
        switch (b) {
            case 23:
                this.b = new Region();
                break;
            case SizeUtil.textSize2 /* 24 */:
            case 25:
            default:
                this.b = new p7e(500L);
                break;
            case 26:
                this.b = new SparseIntArray();
                break;
            case 27:
                this.b = new drj((byte) 1);
                break;
        }
    }

    public /* synthetic */ isd(byte b, boolean z) {
        this.a = b;
    }

    public isd(int i) {
        this.a = (byte) 13;
        this.b = new qfb[i];
        for (int i2 = 0; i2 < i; i2++) {
            ((qfb[]) this.b)[i2] = new qfb((byte) 22);
        }
    }

    public isd(Bundle bundle) {
        this.a = (byte) 6;
        if (bundle != null) {
            this.b = new Bundle(bundle);
        } else {
            t3p.q(Constants.Params.DATA);
            throw null;
        }
    }

    public isd(cie cieVar, bn bnVar) {
        this.a = (byte) 3;
        this.b = bnVar;
    }

    public /* synthetic */ isd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public isd(String str, eof eofVar) {
        esd esdVarX;
        this.a = (byte) 18;
        this.b = eofVar;
        if (str.isEmpty()) {
            eofVar.run(Boolean.FALSE);
            return;
        }
        t9f t9fVar = (t9f) xne.b.get();
        fvh fvhVar = new fvh();
        Regex regex = esd.e;
        try {
            esdVarX = wyh.x("application/json");
        } catch (IllegalArgumentException unused) {
            esdVarX = null;
        }
        fvhVar.e(RequestBuilder.POST, rvh.create("{}", esdVarX));
        fvhVar.h(Uri.parse((String) N.MKuJ$OHt()).buildUpon().appendEncodedPath("reset_passwords/").build().toString());
        fvhVar.d("Authorization", "Bearer ".concat(str));
        c74 c74VarCommonNoCache = _CacheControlCommonKt.commonNoCache(new c74());
        c74VarCommonNoCache.getClass();
        c74 c74VarCommonNoStore = _CacheControlCommonKt.commonNoStore(c74VarCommonNoCache);
        c74VarCommonNoStore.getClass();
        fvhVar.b(_CacheControlCommonKt.commonBuild(c74VarCommonNoStore));
        t9fVar.c(new kvh(fvhVar)).enqueue(this);
    }

    public isd(mig migVar) {
        this.a = (byte) 12;
        this.b = new vdf(migVar, (byte) 28);
    }

    public isd(rcc rccVar, rcc rccVar2) {
        final byte b = 1;
        this.a = (byte) 1;
        pcc pccVar = pcc.b;
        rdc rdcVar = new rdc();
        rdcVar.b = v08.a;
        rdcVar.c = pccVar;
        this.b = rdcVar;
        final pqh pqhVar = new pqh();
        pcc state = rccVar.getState();
        pcc pccVar2 = pcc.a;
        pqhVar.a = state == pccVar2 ? pccVar2 : pccVar;
        final pqh pqhVar2 = new pqh();
        pccVar = rccVar2.getState() == pccVar2 ? pccVar2 : pccVar;
        pqhVar2.a = pccVar;
        pcc pccVar3 = (Comparable) pqhVar.a;
        D(pccVar3.compareTo(pccVar) <= 0 ? pccVar3 : pccVar);
        if (pqhVar.a == pccVar2 || pqhVar2.a == pccVar2) {
            return;
        }
        final byte b2 = 0;
        jx4 jx4Var = new jx4(new Function1() { // from class: vud
            public final Object invoke(Object obj) {
                byte b3 = b2;
                pqh pqhVar3 = pqhVar2;
                isd isdVar = this;
                pqh pqhVar4 = pqhVar;
                pcc pccVar4 = (pcc) obj;
                switch (b3) {
                    case 0:
                        pqhVar4.a = pccVar4;
                        pcc pccVar5 = (Comparable) pqhVar3.a;
                        if (pccVar4.compareTo(pccVar5) > 0) {
                            pccVar4 = pccVar5;
                        }
                        isdVar.D(pccVar4);
                        break;
                    default:
                        pqhVar4.a = pccVar4;
                        pcc pccVar6 = (Comparable) pqhVar3.a;
                        if (pccVar4.compareTo(pccVar6) > 0) {
                            pccVar4 = pccVar6;
                        }
                        isdVar.D(pccVar4);
                        break;
                }
                return Unit.a;
            }
        }, (byte) 2);
        jx4 jx4Var2 = new jx4(new Function1() { // from class: vud
            public final Object invoke(Object obj) {
                byte b3 = b;
                pqh pqhVar3 = pqhVar;
                isd isdVar = this;
                pqh pqhVar4 = pqhVar2;
                pcc pccVar4 = (pcc) obj;
                switch (b3) {
                    case 0:
                        pqhVar4.a = pccVar4;
                        pcc pccVar5 = (Comparable) pqhVar3.a;
                        if (pccVar4.compareTo(pccVar5) > 0) {
                            pccVar4 = pccVar5;
                        }
                        isdVar.D(pccVar4);
                        break;
                    default:
                        pqhVar4.a = pccVar4;
                        pcc pccVar6 = (Comparable) pqhVar3.a;
                        if (pccVar4.compareTo(pccVar6) > 0) {
                            pccVar4 = pccVar6;
                        }
                        isdVar.D(pccVar4);
                        break;
                }
                return Unit.a;
            }
        }, (byte) 2);
        rccVar.h(jx4Var);
        rccVar2.h(jx4Var2);
        if (((pcc) rdcVar.c) != pccVar2) {
            rdcVar.h(new wud(rccVar, jx4Var, rccVar2, jx4Var2));
        } else {
            rccVar.g(jx4Var);
            rccVar2.g(jx4Var2);
        }
    }

    public isd(t9f t9fVar) {
        this.a = (byte) 7;
        this.b = t9fVar;
        a74 a74Var = t9fVar.k;
    }

    public static boolean B(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static void N(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    public final long[] A() throws JSONException {
        JSONArray jSONArrayR = r("gcm.n.vibrate_timings");
        if (jSONArrayR == null) {
            return null;
        }
        try {
            if (jSONArrayR.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayR.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayR.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            jSONArrayR.toString();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r0.b(r1) == r7) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(nt5 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            lpe r0 = (defpackage.lpe) r0
            boolean r1 = r7 instanceof defpackage.jpe
            if (r1 == 0) goto L17
            r1 = r7
            jpe r1 = (defpackage.jpe) r1
            int r2 = r1.w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.w = r2
            goto L1c
        L17:
            jpe r1 = new jpe
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r6 = r1.u
            px5 r7 = px5.a
            int r2 = r1.w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            ybh.y(r6)
            goto L6d
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r6)
            return r5
        L35:
            java.util.Iterator r2 = r1.t
            ybh.y(r6)
            goto L49
        L3b:
            ybh.y(r6)
            java.util.Map r6 = r0.z
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
            r2 = r6
        L49:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L62
            java.lang.Object r6 = r2.next()
            mtb r6 = (mtb) r6
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r1.t = r2
            r1.w = r4
            java.lang.Object r6 = r6.invoke(r1)
            if (r6 != r7) goto L49
            goto L6c
        L62:
            r1.t = r5
            r1.w = r3
            java.lang.Object r6 = r0.b(r1)
            if (r6 != r7) goto L6d
        L6c:
            return r7
        L6d:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isd.C(nt5):java.lang.Object");
    }

    public final void D(pcc pccVar) {
        rdc rdcVar = (rdc) this.b;
        int iOrdinal = pccVar.ordinal();
        if (iOrdinal == 0) {
            int iOrdinal2 = ((pcc) rdcVar.c).ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    vtp.A(rdcVar);
                    vtp.B(rdcVar);
                    return;
                } else if (iOrdinal2 == 2 || iOrdinal2 == 3 || iOrdinal2 == 4) {
                    vtp.B(rdcVar);
                    return;
                } else {
                    h9o.p();
                    return;
                }
            }
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                int iOrdinal3 = ((pcc) rdcVar.c).ordinal();
                if (iOrdinal3 != 0) {
                    if (iOrdinal3 == 1) {
                        vtp.A(rdcVar);
                        return;
                    }
                    if (iOrdinal3 != 2) {
                        if (iOrdinal3 == 3 || iOrdinal3 == 4) {
                            vtp.Z(rdcVar);
                            return;
                        } else {
                            h9o.p();
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    h9o.p();
                    return;
                }
                int iOrdinal4 = ((pcc) rdcVar.c).ordinal();
                if (iOrdinal4 != 0) {
                    if (iOrdinal4 == 1 || iOrdinal4 == 2 || iOrdinal4 == 3) {
                        vtp.T(rdcVar);
                        return;
                    } else {
                        if (iOrdinal4 != 4) {
                            h9o.p();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            int iOrdinal5 = ((pcc) rdcVar.c).ordinal();
            if (iOrdinal5 != 0) {
                if (iOrdinal5 == 1 || iOrdinal5 == 2) {
                    vtp.X(rdcVar);
                    return;
                }
                if (iOrdinal5 != 3) {
                    if (iOrdinal5 != 4) {
                        h9o.p();
                    } else if (((pcc) rdcVar.c) == pcc.e) {
                        rdcVar.onPause();
                    }
                }
            }
        }
    }

    public final void E(Object obj, boolean z) {
        t7j t7jVar = (t7j) this.b;
        t7jVar.g = false;
        t7jVar.f = false;
        t7jVar.d = obj;
        t7jVar.a = true;
        fwh fwhVar = t7jVar.i;
        if (z) {
            fwhVar.d = false;
            fwhVar.d();
        } else {
            if (!fwhVar.d) {
                fwhVar.d = true;
            }
            fwhVar.d();
        }
        HashSet hashSet = t7jVar.c;
        while (!hashSet.isEmpty() && t7jVar.a) {
            q8j q8jVar = (q8j) hashSet.iterator().next();
            hashSet.remove(q8jVar);
            t7jVar.b.add(q8jVar);
            q8jVar.c(t7jVar.d);
        }
    }

    public final Bundle F() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public final void G() {
        mrk mrkVar = (mrk) this.b;
        BrowserActivity browserActivity = mrkVar.d.b.a;
        if (browserActivity.getLifecycle().i.d(qcc.e)) {
            gbf gbfVar = browserActivity.M;
            if (gbfVar == null) {
                gbfVar = null;
            }
            gbfVar.l(null, hbf.d);
            z43 z43Var = browserActivity.z;
            (z43Var != null ? z43Var : null).d();
        }
        ((FrameLayout) mrkVar.y.c).post(new erk(mrkVar, (byte) 1));
    }

    public final void H() {
        int i = 0;
        while (true) {
            qfb[] qfbVarArr = (qfb[]) this.b;
            if (i >= qfbVarArr.length) {
                return;
            }
            qfb qfbVar = qfbVarArr[i];
            short[] sArr = (short[]) qfbVar.b;
            int i2 = 1;
            for (int i3 = ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL; i3 >= 2; i3 >>= 1) {
                int i4 = 0;
                while (i4 < 256) {
                    int i5 = i2 + 1;
                    short s = fsp.h[i2];
                    int i6 = i4;
                    while (i6 < i4 + i3) {
                        short s2 = sArr[i6];
                        int i7 = i6 + i3;
                        short sM = uyg.m(sArr[i7] * s);
                        sArr[i7] = (short) (s2 - sM);
                        sArr[i6] = (short) (s2 + sM);
                        i6++;
                    }
                    i4 = i6 + i3;
                    i2 = i5;
                }
            }
            qfbVar.B();
            i++;
        }
    }

    public final void I(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.w(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(or4 r21, kotlin.jvm.functions.Function0 r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.Object r2 = r0.b
            a7f r2 = (defpackage.a7f) r2
            if (r2 != 0) goto Lf
            java.lang.String r2 = "Called runAndWatch on a manager that has been disposed of"
            bpg.b(r2)
        Lf:
            java.lang.Object r2 = r0.b
            a7f r2 = (defpackage.a7f) r2
            boolean r3 = r2 instanceof defpackage.emj
            if (r3 == 0) goto L9c
            emj r2 = (defpackage.emj) r2
            or4 r3 = r2.g
            if (r3 == 0) goto L9c
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L9c
            ice r3 = new ice
            r3.<init>()
            or4 r4 = r2.g
            if (r4 != 0) goto L31
            java.lang.String r5 = "promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second"
            bpg.b(r5)
        L31:
            tee r5 = r2.e
            java.util.ArrayList r6 = r3.d
            if (r5 != 0) goto L42
            java.lang.Object r5 = r2.c
            fce r7 = new fce
            r7.<init>(r5, r4)
            r6.add(r7)
            goto L94
        L42:
            java.lang.Object[] r7 = r5.b
            long[] r5 = r5.a
            int r8 = r5.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L94
            r10 = 0
        L4c:
            r11 = r5[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L8f
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L66:
            if (r15 >= r13) goto L8c
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L83
            int r16 = r10 << 3
            int r16 = r16 + r15
            r9 = r7[r16]
            r16 = r14
            fce r14 = new fce
            r14.<init>(r9, r4)
            r6.add(r14)
            goto L85
        L83:
            r16 = r14
        L85:
            long r11 = r11 >> r16
            int r15 = r15 + 1
            r14 = r16
            goto L66
        L8c:
            r9 = r14
            if (r13 != r9) goto L94
        L8f:
            if (r10 == r8) goto L94
            int r10 = r10 + 1
            goto L4c
        L94:
            r3.c()
            r2.d()
            r0.b = r3
        L9c:
            java.lang.Object r0 = r0.b
            a7f r0 = (defpackage.a7f) r0
            kotlin.jvm.functions.Function1 r2 = r0.e(r1)
            ttj r3 = ytj.h()
            ttj r2 = r3.u(r2)
            r0.b(r1)
            ttj r1 = r2.j()     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r3 = r22.invoke()     // Catch: java.lang.Throwable -> Lc1
            ttj.q(r1)     // Catch: java.lang.Throwable -> Lc6
            r2.c()
            r0.c()
            return r3
        Lc1:
            r0 = move-exception
            ttj.q(r1)     // Catch: java.lang.Throwable -> Lc6
            throw r0     // Catch: java.lang.Throwable -> Lc6
        Lc6:
            r0 = move-exception
            r2.c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isd.J(or4, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    public final void K(ccb ccbVar) {
        ((Region) this.b).set(ccbVar.a, ccbVar.b, ccbVar.c, ccbVar.d);
    }

    public final void L(byte[] bArr) {
        int i = 0;
        while (true) {
            qfb[] qfbVarArr = (qfb[]) this.b;
            if (i >= qfbVarArr.length) {
                return;
            }
            int i2 = i * 384;
            short[] sArr = (short[]) qfbVarArr[i].b;
            for (int i3 = 0; i3 < 256; i3++) {
                short s = (short) (sArr[i3] - 3329);
                sArr[i3] = (short) (s + ((s >> 15) & 3329));
            }
            for (int i4 = 0; i4 < 128; i4++) {
                int i5 = i4 << 1;
                short s2 = sArr[i5];
                short s3 = sArr[i5 + 1];
                int i6 = (i4 * 3) + i2;
                bArr[i6] = (byte) s2;
                bArr[i6 + 1] = (byte) ((s2 >> 8) | (s3 << 4));
                bArr[i6 + 2] = (byte) (s3 >> 4);
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        r1.t = r8;
        r1.u = r9;
        r1.x = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (r2.invoke(r1) == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        if (r0.b(r1) == r10) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0079 -> B:24:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(java.util.EnumSet r9, nt5 r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            lpe r0 = (defpackage.lpe) r0
            boolean r1 = r10 instanceof defpackage.kpe
            if (r1 == 0) goto L17
            r1 = r10
            kpe r1 = (defpackage.kpe) r1
            int r2 = r1.x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.x = r2
            goto L1c
        L17:
            kpe r1 = new kpe
            r1.<init>(r8, r10)
        L1c:
            java.lang.Object r8 = r1.v
            px5 r10 = px5.a
            int r2 = r1.x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            ybh.y(r8)
            goto L89
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r8)
            return r5
        L35:
            java.util.Iterator r9 = r1.u
            java.util.EnumSet r2 = r1.t
            ybh.y(r8)
            goto L7a
        L3d:
            ybh.y(r8)
            java.util.Map r8 = r0.z
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
            r7 = r9
            r9 = r8
            r8 = r7
        L4d:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r9.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r6 = r2.getKey()
            cs4 r6 = (defpackage.cs4) r6
            java.lang.Object r2 = r2.getValue()
            mtb r2 = (mtb) r2
            boolean r6 = r8.contains(r6)
            if (r6 == 0) goto L4d
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r1.t = r8
            r1.u = r9
            r1.x = r4
            java.lang.Object r2 = r2.invoke(r1)
            if (r2 == r10) goto L88
            r2 = r8
        L7a:
            r8 = r2
            goto L4d
        L7c:
            r1.t = r5
            r1.u = r5
            r1.x = r3
            java.lang.Object r8 = r0.b(r1)
            if (r8 != r10) goto L89
        L88:
            return r10
        L89:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isd.M(java.util.EnumSet, nt5):java.lang.Object");
    }

    public final boolean a(String str) {
        String strX = x(str);
        return "1".equals(strX) || Boolean.parseBoolean(strX);
    }

    public final void b() {
        ProductSuggestionListItem productSuggestionListItem = (ProductSuggestionListItem) this.b;
        productSuggestionListItem.s = true;
        productSuggestionListItem.t();
    }

    public final Integer c(String str) {
        String strX = x(str);
        if (TextUtils.isEmpty(strX)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strX));
        } catch (NumberFormatException unused) {
            N(str);
            return null;
        }
    }

    @Override // defpackage.tri
    public final void d(View view) {
        Object tag = view.getTag();
        if (!(tag instanceof eri)) {
            tag = null;
        }
        if (tag != null) {
            ((ori) ((akg) this.b).n).J((eri) tag);
        }
    }

    @Override // defpackage.hsd
    public final void e(cie cieVar) {
        byte b;
        jsd jsdVar = (jsd) this.b;
        u2p u2pVar = new u2p(jsdVar.getContext(), null);
        jsdVar.a(u2pVar);
        jsdVar.a.put(cieVar, u2pVar);
        cieVar.w0 = u2pVar;
        jsd.c(u2pVar, cieVar);
        String str = cieVar.o;
        if (TextUtils.isEmpty(str)) {
            str = cieVar.p;
        }
        ImageView.ScaleType scaleType = jsdVar.b;
        ImageView imageView = u2pVar.u;
        byte b2 = 2;
        if (imageView != null) {
            imageView.setImageBitmap(null);
            fip.b(u2pVar.getContext(), str, new ugo(u2pVar, scaleType, b2));
        }
        fio fioVar = cieVar.f;
        if (fioVar == null || (b = fioVar.a) == 1 || (fioVar.e & b) == 0) {
            return;
        }
        ArrayList arrayList = u2pVar.d;
        ArrayList arrayList2 = new ArrayList();
        byte b3 = 19;
        int i = 0;
        if (!m5h.d(arrayList)) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (obj != null) {
                    View view = (View) obj;
                    arrayList2.add(view);
                    if (g1p.j && b == 2) {
                        view.setOnClickListener(new pkm(u2pVar, b3));
                    } else {
                        view.setClickable(true);
                    }
                }
            }
        }
        ImageView imageView2 = u2pVar.u;
        if (imageView2 != null) {
            arrayList2.add(imageView2);
            u2pVar.u.setOnClickListener(new pkm(u2pVar, b3));
        }
        View view2 = u2pVar.k;
        if (view2 != null) {
            arrayList2.add(view2);
        }
        dgo dgoVar = new dgo(u2pVar, (byte) 8);
        u2pVar.t.getClass();
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            if (obj2 != null) {
                ((View) obj2).setOnTouchListener(new xgo(dgoVar, u2pVar, fioVar));
            }
        }
    }

    public final boolean f() {
        return ((Ndef) this.b).makeReadOnly();
    }

    public final void g(lcc lccVar) {
        ((rdc) this.b).g(lccVar);
    }

    public final pcc getState() {
        return (pcc) ((rdc) this.b).c;
    }

    public final void h(lcc lccVar) {
        ((rdc) this.b).h(lccVar);
    }

    @Override // defpackage.dn
    public final void i() {
        ((bn) this.b).i();
    }

    public final boolean j() {
        return ((Ndef) this.b).getNdefMessage() == null;
    }

    @Override // defpackage.jak
    public final s6j k() {
        return (d1g) this.b;
    }

    @Override // defpackage.tri
    public final void l(View view) {
        int positionForView;
        r9i r9iVarF = ((akg) this.b).f();
        if (r9iVarF == null || !((o66) r9iVarF.d).j()) {
            r9iVarF = null;
        }
        if (r9iVarF != null) {
            l56 l56Var = ((o66) r9iVarF.d).f;
            im7 im7Var = l56Var != null ? ((ListPopupWindow) l56Var).c : null;
            if (im7Var == null || (positionForView = im7Var.getPositionForView(view)) == -1) {
                return;
            }
            im7Var.performItemClick(view, positionForView, im7Var.getItemIdAtPosition(positionForView));
        }
    }

    @Override // defpackage.vwf
    public final void m() {
        float f;
        ro9 ro9Var = (ro9) this.b;
        OperaProgressIndicator operaProgressIndicator = (OperaProgressIndicator) ro9Var.c;
        int i = ro9Var.b;
        if (i == 0) {
            f = 0.0f;
        } else {
            float f2 = ((wwf) ro9Var.d).c + 1.0f;
            float f3 = i;
            f = f2 > f3 ? 1.0f : f2 / f3;
        }
        operaProgressIndicator.r(f);
    }

    public final void n(NdefMessage ndefMessage) throws IOException, FormatException {
        Ndef ndef = (Ndef) this.b;
        ndef.writeNdefMessage(ndefMessage);
        ndef.close();
    }

    @Override // defpackage.vwf
    public final void o() {
        float f;
        ro9 ro9Var = (ro9) this.b;
        OperaProgressIndicator operaProgressIndicator = (OperaProgressIndicator) ro9Var.c;
        int i = ro9Var.b;
        if (i == 0) {
            f = 0.0f;
        } else {
            float f2 = ((wwf) ro9Var.d).c + 1.0f;
            float f3 = i;
            f = f2 > f3 ? 1.0f : f2 / f3;
        }
        operaProgressIndicator.r(f);
    }

    public final void onFailure(v84 v84Var, IOException iOException) {
        byte b = 2;
        switch (this.a) {
            case 8:
                if (!v84Var.isCanceled()) {
                    vml.c(new qif(this, b));
                    break;
                }
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                vml.e(new wxh(this, b));
                break;
            default:
                ((b94) this.b).run(new w3k(iOException));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #2 {all -> 0x0083, blocks: (B:5:0x000c, B:8:0x0012, B:10:0x001a, B:11:0x001c, B:13:0x0022, B:15:0x002c, B:17:0x0036, B:18:0x0043, B:24:0x006c, B:27:0x0071, B:23:0x0064, B:20:0x0049), top: B:82:0x000c, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResponse(defpackage.v84 r8, pzh r9) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isd.onResponse(v84, pzh):void");
    }

    public final void onSuccess() {
        ProductSuggestionListItem productSuggestionListItem = (ProductSuggestionListItem) this.b;
        productSuggestionListItem.s = false;
        productSuggestionListItem.t();
    }

    @Override // defpackage.dn
    public final void p(bm bmVar) {
        ((bn) this.b).m(bmVar);
    }

    @Override // defpackage.n2k
    public final m2k q() {
        return (drj) this.b;
    }

    public final JSONArray r(String str) {
        String strX = x(str);
        if (TextUtils.isEmpty(strX)) {
            return null;
        }
        try {
            return new JSONArray(strX);
        } catch (JSONException unused) {
            N(str);
            return null;
        }
    }

    public final NdefMessage read() {
        return ((Ndef) this.b).getNdefMessage();
    }

    public final int[] s() throws JSONException {
        JSONArray jSONArrayR = r("gcm.n.light_settings");
        if (jSONArrayR == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayR.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayR.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayR.optInt(1);
            iArr[2] = jSONArrayR.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e) {
            jSONArrayR.toString();
            e.getMessage();
            return null;
        } catch (JSONException unused) {
            jSONArrayR.toString();
            return null;
        }
    }

    public final Object[] t(String str) {
        JSONArray jSONArrayR = r(str.concat("_loc_args"));
        if (jSONArrayR == null) {
            return null;
        }
        int length = jSONArrayR.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayR.optString(i);
        }
        return strArr;
    }

    public final String u(String str) {
        return x(str.concat("_loc_key"));
    }

    public final String v(String str, Resources resources, String str2) {
        String strX = x(str2);
        if (!TextUtils.isEmpty(strX)) {
            return strX;
        }
        String strU = u(str2);
        if (TextUtils.isEmpty(strU)) {
            return null;
        }
        int identifier = resources.getIdentifier(strU, Constants.Kinds.STRING, str);
        if (identifier == 0) {
            N(str2.concat("_loc_key"));
            return null;
        }
        Object[] objArrT = t(str2);
        if (objArrT == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrT);
        } catch (MissingFormatArgumentException unused) {
            N(str2);
            Arrays.toString(objArrT);
            return null;
        }
    }

    public final v7e w(d5o d5oVar) {
        return new fc2((Resources) this.b, wlm.b);
    }

    public final String x(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    @Override // defpackage.jak
    public final void y(Object obj) {
        d1g d1gVar = (d1g) this.b;
        r6j r6jVarG = d1gVar.g(d1gVar.a, obj);
        d1gVar.e = r6jVarG.h;
        d1gVar.b.n(r6jVarG);
    }

    public final void z(orb orbVar) {
        ((ilm) this.b).run(orbVar.a.toString());
    }
}
