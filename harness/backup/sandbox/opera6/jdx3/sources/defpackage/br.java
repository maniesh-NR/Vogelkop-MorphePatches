package defpackage;

import J.N;
import android.os.Looper;
import android.os.Process;
import android.view.View;
import androidx.fragment.app.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.google.android.material.button.MaterialButton;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.api.Callback;
import java.util.concurrent.ScheduledFuture;
import java.util.function.IntConsumer;
import org.chromium.ui.ModalDialogWrapper;
import org.chromium.ui.display.DisplayAndroidManager;

/* loaded from: classes.dex */
public final /* synthetic */ class br implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ br(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ br(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        int i;
        int i2;
        ScheduledFuture scheduledFuture;
        f28 f28Var;
        n99 n99Var;
        byte b = 8;
        switch (this.a) {
            case 0:
                ((dr) this.c).d = this.b;
                return;
            case 1:
                int i3 = this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(i3);
                runnable.run();
                return;
            case 2:
                ((IntConsumer) this.c).accept(this.b);
                return;
            case 3:
                pad padVar = (pad) this.c;
                int i4 = this.b;
                mi8 mi8Var = (mi8) padVar.c;
                String str = tym.a;
                pr prVar = mi8Var.a.D;
                li8 li8Var = new li8(i4);
                prVar.getClass();
                z4o.H(Looper.myLooper() == ((szk) prVar.c).a.getLooper());
                prVar.a++;
                prVar.A(new bi2(prVar, li8Var, b));
                prVar.G(Integer.valueOf(i4));
                return;
            case 4:
                View viewFindViewById = ((im7) this.c).findViewById(this.b);
                if (viewFindViewById != null) {
                    qe6.N(viewFindViewById);
                    return;
                }
                return;
            case 5:
                th3 th3Var = (th3) this.c;
                int i5 = this.b;
                if (th3Var.e) {
                    return;
                }
                if (i5 == 0) {
                    th3Var.k();
                    return;
                } else {
                    th3Var.l(i5);
                    return;
                }
            case 6:
                ((rb4) this.c).a(this.b);
                return;
            case 7:
                sb4 sb4Var = (sb4) this.c;
                int i6 = this.b;
                s1h s1hVar = (s1h) ((igi) sb4Var.b).b;
                if (s1hVar != null) {
                    s1hVar.a(i6);
                    return;
                }
                return;
            case 8:
                ((a06) this.c).G0(this.b + 1);
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ioh.t("Android.Display.IsNullDisplayRemoved", !((DisplayAndroidManager) this.c).e.remove(Integer.valueOf(this.b)));
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                d28 d28Var = (d28) this.c;
                int i7 = this.b;
                boolean z = d28Var.j;
                f28 f28Var2 = d28Var.l;
                if (z) {
                    return;
                }
                switch (vep.A(f28Var2.E)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        f28Var2.j.offer(Integer.valueOf(i7));
                        f28Var2.b();
                        return;
                    default:
                        qp2.n("Unknown state: ".concat(o18.v(f28Var2.E)));
                        return;
                }
            case 11:
                rr8 rr8Var = (rr8) this.c;
                int i8 = this.b;
                if (i8 != rr8Var.m) {
                    rr8Var.m = i8;
                    rr8Var.k.run(Integer.valueOf(i8));
                    return;
                }
                return;
            case 12:
                ((cd9) this.c).B0(this.b);
                return;
            case 13:
                kba kbaVar = (kba) this.c;
                int i9 = this.b;
                RecyclerView recyclerView = kbaVar.a;
                LinearLayoutManager linearLayoutManager = recyclerView.n;
                if (linearLayoutManager instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                    if (linearLayoutManager2.findFirstCompletelyVisibleItemPosition() > i9 || i9 > linearLayoutManager2.findLastCompletelyVisibleItemPosition()) {
                        kbaVar.b = i9;
                        recyclerView.o(kbaVar);
                        recyclerView.H0(i9);
                        return;
                    }
                }
                i iVarM = recyclerView.M(i9);
                if (iVarM != null) {
                    qe6.N(iVarM.itemView);
                    return;
                }
                return;
            case 14:
                ((d2n) this.c).onStatus(this.b);
                return;
            case 15:
                MaterialButton materialButton = (MaterialButton) this.c;
                int i10 = this.b;
                int[] iArr = MaterialButton.O;
                materialButton.E(i10);
                return;
            case 16:
                gid gidVar = (gid) this.c;
                int i11 = this.b;
                t72 t72Var = gidVar.k;
                t72Var.remove(Integer.valueOf(i11));
                gidVar.l.delete(i11);
                m4j m4jVar = gidVar.n;
                if (m4jVar == null || m4jVar.a.c >= 5 || !t72Var.isEmpty()) {
                    return;
                }
                gidVar.m.postDelayed(new ohd(gidVar, (byte) 0), 500L);
                return;
            case 17:
                N.MFGXE2ht(((ModalDialogWrapper) this.c).a, this.b);
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                ((l2f) ((wub) this.c).a).a(this.b, (String) null);
                return;
            case 19:
                ((uff) this.c).c.accept(this.b);
                return;
            case SizeUtil.textSize0 /* 20 */:
                yvg yvgVar = (yvg) this.c;
                int i12 = this.b;
                yvgVar.e = null;
                if (yvgVar.h == null) {
                    if (i12 == 1) {
                        i = 2132022072;
                    } else {
                        if (i12 != 2) {
                            throw null;
                        }
                        i = 2132019158;
                    }
                    if (i12 == 1) {
                        i2 = 2132022071;
                    } else {
                        if (i12 != 2) {
                            throw null;
                        }
                        i2 = 2132019157;
                    }
                    rxh rxhVar = new rxh(i2);
                    r9g r9gVar = new r9g(yvgVar, b);
                    gkj gkjVar = new gkj(false, false);
                    gkjVar.a = null;
                    gkjVar.b = null;
                    gkjVar.c = null;
                    gkjVar.d = null;
                    gkjVar.e = null;
                    gkjVar.f = r9gVar;
                    gkjVar.g = null;
                    gkjVar.h = null;
                    gkjVar.i = null;
                    gkjVar.j = null;
                    gkjVar.k = 2132019218;
                    gkjVar.l = 0;
                    gkjVar.m = i;
                    gkjVar.n = true;
                    gkjVar.o = rxhVar;
                    yvgVar.h = gkjVar;
                    z77 z77Var = yvgVar.c;
                    z77Var.getClass();
                    z77Var.b(gkjVar, ijm.b);
                    return;
                }
                return;
            case 21:
                moh mohVar = (moh) this.c;
                int i13 = this.b;
                int i14 = mohVar.B;
                mohVar.B = i13;
                if (i14 != i13) {
                    if (i13 != 3) {
                        if (i13 != 2 || (scheduledFuture = mohVar.v) == null || !scheduledFuture.cancel(false) || (f28Var = mohVar.s) == null) {
                            return;
                        }
                        f28Var.g.execute(new y18(f28Var, (byte) 3));
                        return;
                    }
                    if (mohVar.q == null) {
                        koh kohVar = mohVar.y;
                        if (kohVar != null) {
                            if (!kohVar.d) {
                                kohVar.d = true;
                                ScheduledFuture scheduledFuture2 = kohVar.f;
                                if (scheduledFuture2 != null) {
                                    scheduledFuture2.cancel(false);
                                    kohVar.f = null;
                                }
                            }
                            mohVar.y = null;
                        }
                        mohVar.o();
                        return;
                    }
                    return;
                }
                return;
            case SizeUtil.textSize1 /* 22 */:
                e8i e8iVar = (e8i) this.c;
                int i15 = this.b;
                if (e8iVar.c.get()) {
                    ((qrm) e8iVar.a.b).w(i15);
                    return;
                }
                return;
            case 23:
                shf shfVar = (shf) this.c;
                ((w) shfVar.a).W(this.b, false);
                ((p7l) shfVar.c).invoke();
                return;
            case SizeUtil.textSize2 /* 24 */:
                ((mrk) this.c).C.G(this.b);
                return;
            case 25:
                ((d7l) this.c).j.h(this.b);
                return;
            case 26:
                int i16 = this.b;
                gal galVar = (gal) this.c;
                if (i16 < -1000) {
                    galVar.g(!galVar.f() ? p6l.b : p6l.a);
                    return;
                } else {
                    if (i16 > 1000) {
                        galVar.g(galVar.f() ? p6l.b : p6l.a);
                        return;
                    }
                    return;
                }
            case 27:
                x77 x77Var = (x77) this.c;
                int i17 = this.b;
                ((od9) x77Var.c).g0();
                if ((i17 & 2) != 0) {
                    n99Var = new n99();
                    n99Var.m = 2132019091;
                } else if ((i17 & 4) != 0) {
                    n99Var = new n99();
                    n99Var.m = 2132019108;
                } else if ((i17 & 8) != 0) {
                    n99Var = new n99();
                    n99Var.m = 2132019096;
                } else {
                    n99Var = new n99();
                }
                n99Var.w0((BrowserActivity) x77Var.d);
                ((Callback) x77Var.b).run(Boolean.FALSE);
                return;
            default:
                ((RecyclerView) this.c).x0(this.b);
                return;
        }
    }
}
