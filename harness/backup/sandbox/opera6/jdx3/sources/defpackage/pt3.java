package defpackage;

import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.UrlMangler;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class pt3 implements vwh, tvb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ BrowserActivity b;

    public /* synthetic */ pt3(BrowserActivity browserActivity, byte b) {
        this.a = b;
        this.b = browserActivity;
    }

    public final void b(eri eriVar, String str, boolean z, boolean z2) {
        int i = BrowserActivity.E1;
        BrowserActivity browserActivity = this.b;
        browserActivity.o1(0);
        browserActivity.f0(new bsi(eriVar, str, 0, l08.a, null, null, false, z), z2);
    }

    @Override // defpackage.vwh
    public final void f(o93 o93Var) {
        byte b = this.a;
        ijm ijmVar = ijm.b;
        BrowserActivity browserActivity = this.b;
        switch (b) {
            case 0:
                int i = BrowserActivity.E1;
                qim qimVar = browserActivity.o;
                Objects.requireNonNull(qimVar);
                ysj ysjVar = qimVar.e;
                ysjVar.getClass();
                ysjVar.b(o93Var, ijmVar);
                break;
            default:
                int i2 = BrowserActivity.E1;
                qim qimVar2 = browserActivity.o;
                Objects.requireNonNull(qimVar2);
                ysj ysjVar2 = qimVar2.e;
                ysjVar2.getClass();
                ysjVar2.b(o93Var, ijmVar);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context, com.opera.android.BrowserActivity, java.lang.Object, t5d] */
    @Override // defpackage.tvb
    public final void run() {
        byte b = this.a;
        ?? r3 = this.b;
        switch (b) {
            case 12:
                int i = BrowserActivity.E1;
                r3.e1(true);
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            default:
                g25.b(r3, 0, 2132018252, 2132018253, new sk(r3, (byte) 4));
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                int i2 = BrowserActivity.E1;
                BrowserActivity browserActivity = this.b;
                b2l b2lVarW0 = browserActivity.w0();
                browserActivity.i0(b2lVarW0 != null && ((d7l) b2lVarW0).j.m(), b2lVarW0, false, lqm.l, null);
                break;
            case 19:
                int i3 = BrowserActivity.E1;
                b2l b2lVarW02 = r3.w0();
                if (b2lVarW02 != null) {
                    d7l d7lVar = (d7l) b2lVarW02;
                    if (!d7lVar.j.isLoading() && d7lVar.j.z() && !d7lVar.o0() && !UrlMangler.c(d7lVar.j.getUrl()) && !UrlMangler.d(d7lVar.j.getUrl()) && !UrlMangler.isOffline(d7lVar.j.getUrl()) && !UrlMangler.b(d7lVar.j.getUrl())) {
                        r3.g0();
                        break;
                    }
                }
                break;
            case SizeUtil.textSize0 /* 20 */:
                BrowserActivity browserActivity2 = this.b;
                k6l k6lVar = browserActivity2.V;
                if (k6lVar == null) {
                    k6lVar = null;
                }
                if (k6lVar.b.size() > 1) {
                    b2l b2lVarW03 = browserActivity2.w0();
                    if (b2lVarW03 != null) {
                        k6l k6lVar2 = browserActivity2.V;
                        (k6lVar2 != null ? k6lVar2 : null).k(b2lVarW03);
                        break;
                    }
                } else {
                    browserActivity2.z1(1000L, 0L, true);
                    break;
                }
                break;
            case 21:
                int i4 = BrowserActivity.E1;
                BrowserActivity browserActivity3 = this.b;
                browserActivity3.i0(true, browserActivity3.w0(), false, lqm.l, null);
                break;
            case SizeUtil.textSize1 /* 22 */:
                int i5 = BrowserActivity.E1;
                b2l b2lVarW04 = r3.w0();
                if (b2lVarW04 != null) {
                    ((d7l) b2lVarW04).b();
                    break;
                }
                break;
            case 23:
                l24 l24Var = (l24) r3.u.c;
                if (l24Var != null) {
                    l24Var.u();
                    break;
                }
                break;
            case SizeUtil.textSize2 /* 24 */:
                l24 l24Var2 = (l24) r3.u.c;
                if (l24Var2 != null) {
                    l24Var2.Z();
                    break;
                }
                break;
            case 25:
                int i6 = BrowserActivity.E1;
                r3.S0();
                break;
            case 26:
                int i7 = BrowserActivity.E1;
                r3.R0();
                break;
            case 27:
                int i8 = BrowserActivity.E1;
                r3.S0();
                break;
            case 28:
                int i9 = BrowserActivity.E1;
                r3.R0();
                break;
        }
    }
}
