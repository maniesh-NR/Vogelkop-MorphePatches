package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.internal.j;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.chromium.ChromiumContent;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class lwf extends mzg {
    public final /* synthetic */ byte b;
    public final /* synthetic */ nwf c;

    public /* synthetic */ lwf(nwf nwfVar, byte b) {
        this.b = b;
        this.c = nwfVar;
    }

    /* JADX WARN: Type inference failed for: r12v24, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    public final void g() {
        byte b = this.b;
        nwf nwfVar = this.c;
        switch (b) {
            case 0:
                nwfVar.b.c();
                break;
            case 1:
                BrowserActivity browserActivity = nwfVar.b.a;
                int i = BrowserActivity.E1;
                b2l b2lVarW0 = browserActivity.w0();
                if (b2lVarW0 != null) {
                    ((d7l) b2lVarW0).X();
                    break;
                }
                break;
            case 2:
                BrowserActivity browserActivity2 = nwfVar.b.a;
                int i2 = BrowserActivity.E1;
                browserActivity2.g0();
                break;
            case 3:
                nwfVar.b.d();
                break;
            case 4:
                hv3 hv3Var = nwfVar.b;
                hw0 hw0Var = hw0.a;
                hv3Var.e();
                break;
            case 5:
                nwfVar.b.f(hw0.a);
                break;
            case 6:
                nwfVar.b.g();
                break;
            case 7:
                nwfVar.b.a.S().d(true);
                break;
            case 8:
                nwfVar.b.h();
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                gbf gbfVar = nwfVar.b.a.M;
                (gbfVar != null ? gbfVar : null).t(true);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                nwfVar.b.i();
                break;
            case 11:
                nwfVar.b.m();
                break;
            case 12:
                nwfVar.b.s();
                break;
            case 13:
                ?? r12 = nwfVar.b.a;
                int i3 = BrowserActivity.E1;
                r12.B1();
                l5b l5bVar = q9n.c;
                q9n.v(r12.getWindow());
                r12.P0().e(new ic2(), false);
                break;
            case 14:
                pgf pgfVar = (pgf) nwfVar.b.a.Z.getValue();
                ogf ogfVarA = pgfVar.a();
                if (ogfVarA != null) {
                    String str = ogfVarA.a;
                    uy3 uy3VarF = uy3.F(pgfVar.b.o);
                    if (uy3VarF != null) {
                        ChromiumContent chromiumContent = uy3VarF.b;
                        fp1 fp1VarC = chromiumContent.c();
                        Intent intent = (Intent) ogfVarA.b.clone();
                        if (!chromiumContent.t) {
                            String strA = BrowserUtils.a(str);
                            if (!TextUtils.isEmpty(strA)) {
                                SharedPreferences sharedPreferences = (SharedPreferences) pgfVar.a.get();
                                int i4 = sharedPreferences.getInt(strA, 0) + 1;
                                j.b(sharedPreferences, strA, i4);
                                if (i4 == 2 && s9g.h.g(lag.g, strA, false) != kag.GRANTED) {
                                    vo7 vo7Var = (vo7) pgfVar.c.get();
                                    vo7Var.getClass();
                                    to7 to7VarB = vo7Var.b(new GURL(str));
                                    if (!(to7VarB != null ? to7VarB.a.e : false)) {
                                        if (!TextUtils.isEmpty(Uri.parse(str).getHost())) {
                                            z77 z77VarU = sfe.U(fp1VarC);
                                            String string = fp1VarC.getString(2132018988, ogfVarA.d);
                                            String string2 = fp1VarC.getString(2132018987);
                                            qxh qxhVar = string2 != null ? new qxh(string2) : null;
                                            a32 a32Var = new a32(pgfVar, fp1VarC, intent, (byte) 20);
                                            ws1 ws1Var = new ws1(pgfVar, strA, fp1VarC, intent, (byte) 11);
                                            kqd kqdVar = new kqd(pgfVar, (byte) 16);
                                            gkj gkjVar = new gkj(false, false);
                                            gkjVar.a = null;
                                            gkjVar.b = null;
                                            gkjVar.c = null;
                                            gkjVar.d = string;
                                            gkjVar.e = kqdVar;
                                            gkjVar.f = null;
                                            gkjVar.g = null;
                                            gkjVar.h = ws1Var;
                                            gkjVar.i = a32Var;
                                            gkjVar.j = null;
                                            gkjVar.k = 2132018990;
                                            gkjVar.l = 2132018991;
                                            gkjVar.m = 0;
                                            gkjVar.n = true;
                                            gkjVar.o = qxhVar;
                                            z77VarU.getClass();
                                            z77VarU.b(gkjVar, ijm.b);
                                            break;
                                        }
                                    }
                                }
                                fp1VarC.startActivity(intent);
                                break;
                            }
                        } else {
                            fp1VarC.startActivity(intent);
                            break;
                        }
                    }
                }
                break;
            case 15:
                BrowserActivity browserActivity3 = nwfVar.b.a;
                int i5 = BrowserActivity.E1;
                b2l b2lVarW02 = browserActivity3.w0();
                if (b2lVarW02 != null) {
                    hyg.n(browserActivity3, b2lVarW02);
                    break;
                }
                break;
            case 16:
                nwfVar.b.l();
                break;
            case 17:
                nwfVar.b.m();
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                nwfVar.b.n();
                break;
            case 19:
                nwfVar.b.o();
                break;
            case SizeUtil.textSize0 /* 20 */:
                nwfVar.b.q();
                break;
            case 21:
                nwfVar.b.r();
                break;
            case SizeUtil.textSize1 /* 22 */:
                nwfVar.b.s();
                break;
            case 23:
                nwfVar.b.t();
                break;
            default:
                BrowserActivity browserActivity4 = nwfVar.b.a;
                int i6 = BrowserActivity.E1;
                browserActivity4.x1();
                break;
        }
    }

    public final void o() {
        byte b = this.b;
        xl0 xl0Var = xl0.i;
        nwf nwfVar = this.c;
        switch (b) {
            case 0:
                nwfVar.w(xl0.b);
                break;
            case 1:
                nwfVar.w(xl0.c);
                break;
            case 2:
                nwfVar.w(xl0.d);
                break;
            case 3:
                nwfVar.w(xl0.e);
                break;
            case 4:
                nwfVar.w(xl0.z);
                break;
            case 5:
                nwfVar.w(xl0.E);
                break;
            case 6:
                nwfVar.w(xl0.B);
                break;
            case 7:
                nwfVar.w(xl0.h);
                break;
            case 8:
                nwfVar.w(xl0.G);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                nwfVar.w(xl0.g);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                nwfVar.w(xl0.w);
                break;
            case 11:
                nwfVar.w(xl0.x);
                break;
            case 12:
                nwfVar.w(xl0.y);
                break;
            case 13:
                nwfVar.w(xl0.D);
                break;
            case 14:
                nwfVar.w(xl0.t);
                break;
            case 15:
                nwfVar.w(xl0.r);
                break;
            case 16:
                nwfVar.w(xl0.q);
                break;
            case 17:
                nwfVar.w(xl0Var);
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                nwfVar.w(xl0.k);
                break;
            case 19:
                nwfVar.w(xl0.l);
                break;
            case SizeUtil.textSize0 /* 20 */:
                nwfVar.w(xl0.m);
                break;
            case 21:
                nwfVar.w(xl0.o);
                break;
            case SizeUtil.textSize1 /* 22 */:
                nwfVar.w(xl0Var);
                break;
            case 23:
                nwfVar.w(xl0.p);
                break;
            default:
                nwfVar.w(xl0.F);
                break;
        }
    }
}
