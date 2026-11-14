package defpackage;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.leanplum.utils.SizeUtil;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.custom_views.BottomIndicatorButton;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z4k implements vlf, rba, kjm, krf, ffn, ll7, jrp, OnCompleteListener, cpp {
    public final /* synthetic */ byte a;
    public Object b;

    public z4k(byte b) {
        this.a = b;
        switch (b) {
            case 11:
                this.b = ByteBuffer.allocate(4);
                break;
            case 21:
                this.b = new ezh((byte) 1, 20971520);
                break;
            case 26:
                this.b = new HashSet();
                break;
            default:
                this.b = new SparseArray();
                break;
        }
    }

    public /* synthetic */ z4k(h61 h61Var) {
        this.a = (byte) 24;
        z4k z4kVar = new z4k((Object) h61Var, (byte) 22);
        jrp jrpVarB = arp.b(new bxk((Object) z4kVar, (byte) 20));
        jrp jrpVarB2 = arp.b(new tvk(h61Var));
        jrp jrpVarB3 = arp.b(new nqp(z4kVar, (byte) 1));
        jrp jrpVarB4 = arp.b(new w7j(jrpVarB, jrpVarB2, jrpVarB3, arp.b(new nqp(z4kVar, (byte) 0))));
        jrp jrpVarB5 = arp.b(new uto(z4kVar, (byte) 3));
        this.b = arp.b(new dcl(arp.b(new agm(jrpVarB4, arp.b(new t9l(z4kVar, jrpVarB5, jrpVarB3, new rii((Object) jrpVarB5, (byte) 29))), jrpVarB5, (byte) 14))));
    }

    public /* synthetic */ z4k(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0010, code lost:
    
        if (r5 == 4) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(com.opera.android.browser.chromium.ChromiumContent r4, int r5, boolean r6) {
        /*
            int r5 = vep.A(r5)
            r0 = 1
            if (r5 == 0) goto L17
            r1 = 2
            if (r5 == r0) goto L19
            r2 = 3
            if (r5 == r1) goto L16
            if (r5 == r2) goto L14
            r0 = 4
            if (r5 != r0) goto L16
        L12:
            r0 = r2
            goto L1a
        L14:
            r1 = r0
            goto L12
        L16:
            r0 = r2
        L17:
            r1 = r0
            goto L1a
        L19:
            r0 = r1
        L1a:
            long r4 = r4.n
            r2 = 0
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L23
            return
        L23:
            J.N.Mp3QsSyD(r4, r0, r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z4k.h(com.opera.android.browser.chromium.ChromiumContent, int, boolean):void");
    }

    public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.b)) {
            ((ByteBuffer) this.b).position(0);
            messageDigest.update(((ByteBuffer) this.b).putInt(num.intValue()).array());
        }
    }

    @Override // defpackage.ll7
    public final boolean b(int i) {
        qkn qknVar = (qkn) this.b;
        return qknVar.j.P(qknVar.b.i()) == i;
    }

    public final xhp c(whp whpVar) {
        xhp xhpVar;
        synchronized (((ezh) this.b)) {
            xhpVar = (xhp) ((ezh) this.b).get(whpVar);
        }
        return xhpVar;
    }

    @Override // defpackage.rba
    public final void d() {
        nv6 nv6VarB = ru9.c(((r4m) ((ala) ((kt3) this.b).d).g).b.c).b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("translate_web_pages.tap_to_select_language_hint.shown", true);
        nv6VarB.w();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(nt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.aon
            if (r0 == 0) goto L13
            r0 = r6
            aon r0 = (defpackage.aon) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            aon r0 = new aon
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            ybh.y(r6)
            goto L3e
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r3
        L2e:
            ybh.y(r6)
            java.lang.Object r5 = r5.b
            e3j r5 = (defpackage.e3j) r5
            r0.v = r4
            java.lang.Object r6 = a26.k(r5, r0)
            if (r6 != r1) goto L3e
            return r1
        L3e:
            d3j r6 = (defpackage.d3j) r6
            r5 = 41
            r0 = 0
            c3j r5 = r6.d(r5, r0)
            if (r5 == 0) goto L56
            java.lang.Comparable r5 = r5.d
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = kotlin.text.StringsKt.N(r5)
            if (r6 != 0) goto L54
            r3 = r5
        L54:
            if (r3 != 0) goto L58
        L56:
            java.lang.String r3 = "mobile-weather.opera-api.com"
        L58:
            java.lang.String r5 = "https://"
            java.lang.String r5 = r5.concat(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z4k.e(nt5):java.lang.Object");
    }

    public final boolean f(ChromiumContent chromiumContent) {
        return ((ChromiumContent) this.b) == chromiumContent;
    }

    public final void g(ifn ifnVar, boolean z) {
        ydn ydnVar = (ydn) this.b;
        EnumSet enumSet = ydnVar.E;
        if (ydnVar.S == 6) {
            ydnVar.G = 3;
            hfn hfnVar = hfn.OFFLINE;
            Throwable cause = ifnVar.getCause();
            Objects.requireNonNull(cause);
            ifnVar = new ifn(hfnVar, cause, false);
        } else {
            if (z) {
                xdn xdnVar = ydnVar.A;
                long j = xdnVar.d;
                long j2 = xdnVar.c;
                if (j != j2) {
                    xdnVar.d = j2;
                    gfn gfnVar = xdnVar.f.c;
                    String str = xdnVar.a;
                    String[] strArr = aik.a;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = xdnVar.b;
                    gfnVar.a(j2, str, str2 != null ? str2 : "").d();
                }
            }
            ydnVar.G = 0;
            boolean z2 = ifnVar.b;
            hfn hfnVar2 = ifnVar.a;
            if (z2 && !enumSet.contains(hfnVar2)) {
                enumSet.add(hfnVar2);
                ks3.D(ifnVar);
            }
        }
        vdn vdnVar = ydnVar.d;
        boolean z3 = vdnVar.a;
        boolean zB = vdnVar.b();
        ydnVar.I(new vdn(ydnVar.p().a && z3, ydnVar.c.isEnabled() ? false : zB, null, ifnVar.a));
        ydnVar.e.I(ydnVar.m(), ydnVar.d.a);
        ydnVar.v();
    }

    public final synchronized void i(Object obj) {
        Iterator it = ((HashSet) this.b).iterator();
        while (it.hasNext()) {
            ((zak) it.next()).a(obj);
        }
    }

    @Override // defpackage.ll7
    public final boolean l(int i) {
        return ((ArrayList) ((qkn) this.b).j.d).get(i) instanceof hkb;
    }

    @Override // defpackage.kjm
    public final void o(jjm jjmVar, hjm hjmVar) {
        uwf uwfVar;
        r22 r22Var = (r22) this.b;
        ((ArrayDeque) r22Var.a).remove(jjmVar);
        ((ArrayDeque) r22Var.b).remove(jjmVar);
        qim qimVar = (qim) r22Var.c;
        isj isjVar = qimVar.j;
        qie qieVar = qimVar.i;
        p77 p77Var = qimVar.h;
        if (jjmVar instanceof b87) {
            p77Var.c((b87) jjmVar);
        } else if (jjmVar instanceof cej) {
            cej cejVar = (cej) jjmVar;
            Pair pair = (Pair) qieVar.b;
            if (pair != null && pair.first == cejVar) {
                qieVar.h();
            }
        } else if (jjmVar instanceof o93) {
            o93 o93Var = (o93) jjmVar;
            isjVar.a(o93Var);
            isj isjVarB = qimVar.k.B();
            if (isjVarB != null) {
                isjVarB.a(o93Var);
            }
        } else {
            boolean z = jjmVar instanceof z9l;
            hjm hjmVar2 = hjm.b;
            if (z) {
                z9l z9lVar = (z9l) jjmVar;
                int i = z9lVar.b;
                jjm jjmVar2 = z9lVar.c;
                int iA = vep.A(i);
                if (iA == 0) {
                    p77Var.c((b87) jjmVar2);
                } else if (iA == 1) {
                    cej cejVar2 = (cej) jjmVar2;
                    Pair pair2 = (Pair) qieVar.b;
                    if (pair2 != null && pair2.first == cejVar2) {
                        qieVar.h();
                    }
                } else if (iA == 2) {
                    isjVar.a((o93) jjmVar2);
                } else if (iA == 3 && (uwfVar = qimVar.l) != null) {
                    s2f s2fVar = (s2f) jjmVar2;
                    Pair pair3 = uwfVar.a;
                    if (pair3 != null && pair3.first == s2fVar) {
                        ((q2f) pair3.second).f(hjmVar2);
                    }
                }
            } else {
                z8b z8bVar = qimVar.m;
                if (z8bVar != null && (jjmVar instanceof pz3)) {
                    pz3 pz3Var = (pz3) jjmVar;
                    Pair pair4 = (Pair) z8bVar.a;
                    if (pair4 != null && pair4.first == pz3Var) {
                        ((lz3) pair4.second).b(hjmVar2);
                    }
                }
            }
        }
        u7k u7kVar = qimVar.n;
        if (u7kVar != null && ((z9l) u7kVar.a) == jjmVar) {
            qimVar.n = null;
        }
        vml.c(new mim(qimVar, (byte) 1));
    }

    public final void onComplete(Task task) {
        if (task.isSuccessful()) {
            ((opp) this.b).setImageBitmap((Bitmap) task.getResult());
        } else {
            task.getException();
        }
    }

    @Override // defpackage.rba
    public final void s() {
        ((BottomIndicatorButton) ((pt1) ((ala) ((kt3) this.b).d).a).c).callOnClick();
    }

    @Override // defpackage.rba
    public final void t() {
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        ((v7k) this.b).I0().getClass();
    }

    @Override // defpackage.rba
    public final void z() {
    }

    @Override // defpackage.jrp
    /* renamed from: zza */
    public final Object mo1zza() {
        switch (this.a) {
            case SizeUtil.textSize1 /* 22 */:
                return ((h61) this.b).a;
            default:
                rsp rspVar = (rsp) ((cpp) this.b).mo1zza();
                if (rspVar != null) {
                    return rspVar;
                }
                t3p.q("Cannot return null from a non-@Nullable @Provides method");
                return null;
        }
    }
}
