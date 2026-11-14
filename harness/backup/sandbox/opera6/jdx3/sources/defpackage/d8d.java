package defpackage;

import J.N;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.Size;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.leanplum.utils.SizeUtil;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.chromium.SSLError;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.privacy_monitor.views.TextCenteredLayout;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.ui.catalog.widget.OperaTextView;
import java.text.NumberFormat;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final /* synthetic */ class d8d implements f7f {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d8d(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v68, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    /* JADX WARN: Type inference failed for: r3v32, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    /* JADX WARN: Type inference failed for: r3v34, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    /* JADX WARN: Type inference failed for: r3v36, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    public final void d0(Object obj) {
        MenuItem menuItemFindItem;
        qxh qxhVar;
        String string;
        vs vsVar;
        int i;
        String string2;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((ylk) obj).s0((h8d) obj2);
                break;
            case 1:
                a9d a9dVar = (a9d) obj2;
                a9dVar.r = (wvg) obj;
                d3k d3kVar = a9dVar.v;
                if (d3kVar == null || !d3kVar.isActive()) {
                    a9dVar.v = na2.B(p7n.a(a9dVar), (CoroutineContext) null, (rx5) null, new x8d(a9dVar, null, (byte) 0), 3);
                    break;
                }
                break;
            case 2:
                ((rkc) obj2).invoke(obj);
                break;
            case 3:
                wcd wcdVar = (wcd) obj2;
                List<l2g> list = (List) obj;
                SparseArray sparseArray = new SparseArray(list.size());
                for (l2g l2gVar : list) {
                    sparseArray.put(l2gVar.a, l2gVar);
                }
                wcdVar.e = sparseArray;
                break;
            case 4:
                gld gldVar = (gld) obj2;
                gldVar.H0();
                gldVar.G0();
                break;
            case 5:
                rld rldVar = (rld) obj2;
                if (((Boolean) obj).booleanValue() && !rldVar.r) {
                    Window window = rldVar.requireActivity().getWindow();
                    l5b l5bVar = q9n.c;
                    window.getDecorView().setSystemUiVisibility(5638);
                    break;
                }
                break;
            case 6:
                ((b0e) obj2).k.N();
                break;
            case 7:
                ((e0e) obj2).X();
                break;
            case 8:
                f0e f0eVar = (f0e) obj2;
                txj txjVar = ((eyj) f0eVar.c.g()).l;
                if (txjVar != null) {
                    Size size = txjVar.e;
                    p37.s0(f0eVar.b.b, size.getWidth(), size.getHeight());
                }
                f0eVar.U();
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((s6h) obj2).Q();
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((rn9) obj2).M();
                break;
            case 11:
                ((pte) obj2).L0((ste) obj);
                break;
            case 12:
                k5o k5oVar = (k5o) obj2;
                ConstraintLayout constraintLayout = (ConstraintLayout) ((or2) k5oVar.b).e;
                constraintLayout.setBackgroundTintList(ColorStateList.valueOf(((v8k) ((tsd) k5oVar.c).g()).d(constraintLayout.getContext())));
                break;
            case 13:
                f1p f1pVar = (f1p) obj2;
                ((Integer) obj).getClass();
                int iIntValue = ((Number) ((pde) f1pVar.b).g()).intValue();
                p37.o0((ConstraintLayout) ((or2) f1pVar.a).e, iIntValue, 0, iIntValue, 0, 10);
                break;
            case 14:
                ((u1f) obj2).b();
                break;
            case 15:
                a3f a3fVar = (a3f) obj2;
                b3f b3fVar = (b3f) obj;
                i06 i06Var = a3f.w;
                OperaListItem operaListItem = a3fVar.H0().f;
                jwk jwkVar = b3fVar.a;
                i06Var.getClass();
                i06.b(operaListItem, jwkVar);
                i06.b(a3fVar.H0().i, b3fVar.b);
                i06.b(a3fVar.H0().e, b3fVar.c);
                i06.b(a3fVar.H0().g, b3fVar.d);
                i06.b(a3fVar.H0().d, b3fVar.e);
                i06.b(a3fVar.H0().c, b3fVar.f);
                i06.b(a3fVar.H0().h, b3fVar.g);
                dmf dmfVar = a3fVar.H0().j.B;
                w0f w0fVar = b3fVar.h;
                int i2 = w0fVar == null ? -1 : z2f.a[w0fVar.ordinal()];
                dmfVar.V(i2 != 1 ? i2 != 2 ? i2 != 3 ? new qxh("") : new rxh(2132020086) : new rxh(2132020084) : new rxh(2132020085));
                break;
            case 16:
                vbf vbfVar = (vbf) obj2;
                vbfVar.q();
                vbfVar.t.f = (List) obj;
                break;
            case 17:
                qgf qgfVar = (qgf) obj2;
                qgfVar.i = (ogf) obj;
                qgfVar.W(qgfVar.b.o);
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                shf shfVar = (shf) obj2;
                mnf mnfVar = (mnf) ((pde) shfVar.a).g();
                ScrollView scrollView = (ScrollView) shfVar.b;
                scrollView.setPadding(scrollView.getPaddingLeft(), mnfVar.a, scrollView.getPaddingRight(), mnfVar.b);
                break;
            case 19:
                kwf kwfVar = (kwf) obj2;
                r9i r9iVarF = kwfVar.f();
                if (r9iVarF != null && (menuItemFindItem = ((m66) r9iVarF.c).findItem(2131363819)) != null) {
                    kze kzeVar = kwfVar.D;
                    menuItemFindItem.setVisible(kzeVar != null && kzeVar.g() == peg.c);
                    break;
                }
                break;
            case SizeUtil.textSize0 /* 20 */:
                q4g q4gVar = (q4g) obj2;
                if (!((Boolean) obj).booleanValue() && q4gVar.H0()) {
                    ((StylingImageButton) q4gVar.D.j).setImageResource(2131232293);
                    c5g.a((StylingTextView) q4gVar.D.f, false);
                    ((StylingTextView) q4gVar.D.f).setText("fakepass");
                    break;
                }
                break;
            case 21:
                hcg hcgVar = (hcg) obj2;
                jcg jcgVar = (jcg) obj;
                zi4 zi4Var = jcgVar.a;
                if (zi4Var.equals(ub.x)) {
                    hcgVar.H0().f.setText(2132021771);
                    hcgVar.H0().e.setText(2132019661);
                    hcgVar.H0().d.setVisibility(8);
                    hcgVar.H0().c.setImageResource(2131231790);
                } else if (!(zi4Var instanceof vb)) {
                    h9o.p();
                    break;
                } else {
                    vb vbVar = (vb) zi4Var;
                    hcgVar.H0().f.setText(vbVar.x);
                    na2.S(hcgVar.H0().e, vbVar.y);
                    hcgVar.H0().d.setVisibility(0);
                    hcgVar.t.c(vbVar.z, new o8f(hcgVar, (byte) 20));
                }
                ((StylingTextView) hcgVar.H0().k.b.b).setText(jcgVar.b);
                hcgVar.J0(hcgVar.H0().j, jcgVar.c);
                hcgVar.J0(hcgVar.H0().h, jcgVar.d);
                hcgVar.J0(hcgVar.H0().g, jcgVar.e);
                hcgVar.J0(hcgVar.H0().i, jcgVar.f);
                break;
            case SizeUtil.textSize1 /* 22 */:
                ((dpf) obj).a(new i4d(obj2, (byte) 15));
                break;
            case 23:
                ((Boolean) obj).getClass();
                ((s14) obj2).M();
                break;
            case SizeUtil.textSize2 /* 24 */:
                ktg ktgVar = (ktg) obj2;
                uvg uvgVar = (uvg) obj;
                if (uvgVar != uvg.LOADING) {
                    int iOrdinal = uvgVar.ordinal();
                    ktgVar.b.r(Boolean.valueOf(iOrdinal == 1 || iOrdinal == 2));
                    break;
                }
                break;
            case 25:
                ((cvg) obj2).H0((gvg) obj);
                break;
            case 26:
                ((ylk) obj).s0((tah) obj2);
                break;
            case 27:
                ((ylk) obj).s0((tah) ((hze) obj2).c);
                break;
            case 28:
                azg azgVar = (azg) obj2;
                czg czgVar = (czg) obj;
                ign ignVar = czgVar.a;
                ?? r3 = azgVar.H0().m;
                boolean z = ignVar.a;
                r3.setVisibility(z ? 0 : 8);
                if (z) {
                    r3.t(ignVar.b);
                    r3.E(new rxh(ignVar.c));
                    u35.k(ignVar.d, (OperaListItem) r3);
                    r3.D(new dxh(ignVar.e));
                }
                sj sjVar = czgVar.b;
                ?? r32 = azgVar.H0().c;
                boolean z2 = sjVar.a;
                int i3 = sjVar.b;
                r32.t(z2);
                r32.C(sjVar.c ? new qxh(r32.getResources().getQuantityString(2131886080, i3, NumberFormat.getNumberInstance().format(Integer.valueOf(i3)))) : new rxh(sjVar.d));
                tyl tylVar = czgVar.c;
                ?? r33 = azgVar.H0().l;
                boolean z3 = tylVar.a;
                int i4 = tylVar.b;
                r33.t(z3);
                r33.C(tylVar.c ? new qxh(r33.getResources().getQuantityString(2131886189, i4, NumberFormat.getNumberInstance().format(Integer.valueOf(i4)))) : new rxh(tylVar.d));
                v0g.m(azgVar.H0().g, azgVar.getResources().getString(czgVar.d.a));
                u35.k(czgVar.f, azgVar.H0().j);
                cgh cghVar = czgVar.e;
                if (cghVar.equals(hwk.a)) {
                    azgVar.H0().i.setVisibility(8);
                } else if (!(cghVar instanceof iwk)) {
                    h9o.p();
                    break;
                } else {
                    azgVar.H0().i.setVisibility(0);
                    azgVar.H0().i.t(((iwk) cghVar).a);
                }
                azgVar.H0().d.t(czgVar.g);
                kfo kfoVar = czgVar.h;
                ?? r2 = azgVar.H0().f;
                ((OperaTextView) ((bpd) r2.B).b).setMaxLines(1);
                if (kfoVar instanceof g35) {
                    qxhVar = new qxh(z4o.V(r2.getContext(), ((g35) kfoVar).k));
                } else if (!kfoVar.equals(h35.k)) {
                    h9o.p();
                    break;
                } else {
                    qxhVar = new qxh(azgVar.getString(2132018238));
                }
                r2.C(qxhVar);
                break;
            default:
                ozg ozgVar = (ozg) obj2;
                p0h p0hVar = ozgVar.b;
                Context context = ((LinearLayout) ozgVar.f.c).getContext();
                hwi hwiVar = ((qwi) obj).b;
                or2 or2Var = ozgVar.f;
                if (or2Var != null) {
                    ((FrameLayout) or2Var.e).removeAllViews();
                    ((FrameLayout) ozgVar.f.d).removeAllViews();
                }
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
                or2 or2Var2 = ozgVar.f;
                FrameLayout frameLayout = (FrameLayout) or2Var2.e;
                FrameLayout frameLayout2 = (FrameLayout) or2Var2.f;
                FrameLayout frameLayout3 = (FrameLayout) or2Var2.d;
                Object obj3 = hwiVar.a;
                int iOrdinal2 = ((nwi) hwiVar.b).ordinal();
                if (iOrdinal2 != 0) {
                    int i5 = 2131363991;
                    int i6 = 2131362296;
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            if (iOrdinal2 == 3) {
                                jwi jwiVar = (jwi) obj3;
                                View viewInflate = layoutInflaterFrom.inflate(2131559335, (ViewGroup) frameLayout, false);
                                frameLayout.addView(viewInflate);
                                TextView textView = (TextView) w1h.j(2131362296, viewInflate);
                                if (textView != null) {
                                    i6 = 2131363231;
                                    TextView textView2 = (TextView) w1h.j(2131363231, viewInflate);
                                    if (textView2 != null) {
                                        View viewInflate2 = layoutInflaterFrom.inflate(2131559255, (ViewGroup) frameLayout2, false);
                                        frameLayout2.addView(viewInflate2);
                                        TextView textView3 = (TextView) w1h.j(2131363991, viewInflate2);
                                        if (textView3 == null) {
                                            t3p.q("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(2131363991)));
                                            break;
                                        } else {
                                            LinearLayout linearLayout = (LinearLayout) viewInflate2;
                                            vs vsVarG = vs.g(layoutInflaterFrom, frameLayout3);
                                            SSLError sSLError = jwiVar.l;
                                            byte[][] bArr = jwiVar.h;
                                            long j = sSLError.d;
                                            long j2 = sSLError.c;
                                            switch (sSLError.a) {
                                                case 0:
                                                    vsVar = vsVarG;
                                                    i = 2132018168;
                                                    break;
                                                case 1:
                                                    vsVar = vsVarG;
                                                    long j3 = sSLError.b;
                                                    if (j3 != -1 && j2 != -1 && j != -1 && j > j2) {
                                                        i = 2132018170;
                                                        break;
                                                    } else if (j < j3 || j > j2) {
                                                        i = 2132018176;
                                                        break;
                                                    } else {
                                                        i = 2132018175;
                                                        break;
                                                    }
                                                    break;
                                                case 2:
                                                case 16:
                                                case 17:
                                                    i = 2132018166;
                                                    vsVar = vsVarG;
                                                    break;
                                                case 3:
                                                    i = 2132018169;
                                                    vsVar = vsVarG;
                                                    break;
                                                case 4:
                                                    i = 2132018173;
                                                    vsVar = vsVarG;
                                                    break;
                                                case 5:
                                                    i = 2132018179;
                                                    vsVar = vsVarG;
                                                    break;
                                                case 6:
                                                    i = 2132018177;
                                                    vsVar = vsVarG;
                                                    break;
                                                case 7:
                                                    i = 2132018171;
                                                    vsVar = vsVarG;
                                                    break;
                                                case 8:
                                                    i = 2132018183;
                                                    vsVar = vsVarG;
                                                    break;
                                                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                                    i = 2132018182;
                                                    vsVar = vsVarG;
                                                    break;
                                                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                                    i = 2132018172;
                                                    vsVar = vsVarG;
                                                    break;
                                                case 11:
                                                    i = 2132018180;
                                                    vsVar = vsVarG;
                                                    break;
                                                case 12:
                                                default:
                                                    i = 0;
                                                    vsVar = vsVarG;
                                                    break;
                                                case 13:
                                                    i = 2132018178;
                                                    vsVar = vsVarG;
                                                    break;
                                                case 14:
                                                    i = 2132018181;
                                                    vsVar = vsVarG;
                                                    break;
                                                case 15:
                                                    i = 2132018167;
                                                    vsVar = vsVarG;
                                                    break;
                                                case SizeUtil.textSize0_1 /* 18 */:
                                                    i = 2132021628;
                                                    vsVar = vsVarG;
                                                    break;
                                                case 19:
                                                    i = 2132018174;
                                                    vsVar = vsVarG;
                                                    break;
                                                case SizeUtil.textSize0 /* 20 */:
                                                    i = 2132018184;
                                                    vsVar = vsVarG;
                                                    break;
                                            }
                                            textView2.setText(i);
                                            if (bArr != null) {
                                                textView.setVisibility(0);
                                                phj.b0(textView, phj.D0(textView.getText().toString()), new nzg(ozgVar, bArr, textView, (byte) 0));
                                            }
                                            byte[][] bArr2 = jwiVar.k;
                                            if (bArr2.length > 0) {
                                                ozgVar.h0(bArr2, textView3);
                                            } else if (jwiVar.i) {
                                                ozgVar.h0(bArr, textView3);
                                            } else {
                                                linearLayout.setVisibility(8);
                                            }
                                            vs vsVar2 = vsVar;
                                            ((TextView) vsVar2.e).setText(ozgVar.getString(2132018353, new Object[]{jwiVar.b}));
                                            TextView textView4 = (TextView) vsVar2.c;
                                            String str = jwiVar.c;
                                            String string3 = jwiVar.g;
                                            String str2 = jwiVar.d;
                                            if (jwiVar.e) {
                                                string2 = ozgVar.getString(2132018352, new Object[]{str, str2});
                                            } else {
                                                if (string3 == null) {
                                                    string3 = ozgVar.getString(2132018187);
                                                }
                                                string2 = ozgVar.getString(2132018351, new Object[]{str, string3, str2});
                                            }
                                            textView4.setText(string2);
                                            ((TextCenteredLayout) vsVar2.d).a(jwiVar.f ? ozgVar.getString(2132018842, new Object[]{(String) N.MN7bz_Mm(new GURL(BrowserUtils.getExternalUrlWithFallback((String) p0hVar.e.g())), 1)}) : ozgVar.getString(2132018843, new Object[]{(String) N.MN7bz_Mm(new GURL(BrowserUtils.getExternalUrlWithFallback((String) p0hVar.e.g())), 1)}));
                                        }
                                    }
                                }
                                t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
                                break;
                            }
                        } else {
                            wnj.a(layoutInflaterFrom, frameLayout);
                            ((TextCenteredLayout) kf.i(layoutInflaterFrom, frameLayout3).c).a(ozgVar.getString(2132018354, new Object[]{(String) N.MN7bz_Mm(new GURL(BrowserUtils.getExternalUrlWithFallback((String) p0hVar.e.g())), 1)}));
                        }
                    } else {
                        kwi kwiVar = (kwi) obj3;
                        View viewInflate3 = layoutInflaterFrom.inflate(2131559336, (ViewGroup) frameLayout, false);
                        frameLayout.addView(viewInflate3);
                        TextView textView5 = (TextView) w1h.j(2131362296, viewInflate3);
                        if (textView5 != null) {
                            i6 = 2131362984;
                            TextCenteredLayout textCenteredLayout = (TextCenteredLayout) w1h.j(2131362984, viewInflate3);
                            if (textCenteredLayout != null) {
                                View viewInflate4 = layoutInflaterFrom.inflate(2131559256, (ViewGroup) frameLayout2, false);
                                frameLayout2.addView(viewInflate4);
                                TextCenteredLayout textCenteredLayout2 = (TextCenteredLayout) w1h.j(2131362984, viewInflate4);
                                if (textCenteredLayout2 != null) {
                                    TextView textView6 = (TextView) w1h.j(2131363991, viewInflate4);
                                    if (textView6 != null) {
                                        LinearLayout linearLayout2 = (LinearLayout) viewInflate4;
                                        vs vsVarG2 = vs.g(layoutInflaterFrom, frameLayout3);
                                        String str3 = kwiVar.l;
                                        String str4 = kwiVar.j;
                                        textCenteredLayout.a(ozgVar.getString(2132022097, new Object[]{str3}));
                                        byte[][] bArr3 = kwiVar.h;
                                        if (bArr3 != null) {
                                            textView5.setVisibility(0);
                                            phj.b0(textView5, phj.D0(textView5.getText().toString()), new nzg(ozgVar, bArr3, textView5, (byte) 0));
                                        }
                                        byte[][] bArr4 = kwiVar.k;
                                        if (bArr4.length > 0 && str4 != null) {
                                            textCenteredLayout2.a(phj.y(ozgVar.getString(2132020604, new Object[]{str4})));
                                            ozgVar.h0(bArr4, textView6);
                                        } else if (!kwiVar.i || str4 == null) {
                                            linearLayout2.setVisibility(8);
                                        } else {
                                            textCenteredLayout2.a(phj.y(ozgVar.getString(2132020604, new Object[]{str4})));
                                            ozgVar.h0(bArr3, textView6);
                                        }
                                        ((TextView) vsVarG2.e).setText(ozgVar.getString(2132018353, new Object[]{kwiVar.b}));
                                        TextView textView7 = (TextView) vsVarG2.c;
                                        String str5 = kwiVar.c;
                                        String string4 = kwiVar.g;
                                        String str6 = kwiVar.d;
                                        if (kwiVar.e) {
                                            string = ozgVar.getString(2132018352, new Object[]{str5, str6});
                                        } else {
                                            if (string4 == null) {
                                                string4 = ozgVar.getString(2132018187);
                                            }
                                            string = ozgVar.getString(2132018351, new Object[]{str5, string4, str6});
                                        }
                                        textView7.setText(string);
                                        ((TextCenteredLayout) vsVarG2.d).a(kwiVar.f ? ozgVar.getString(2132018842, new Object[]{(String) N.MN7bz_Mm(new GURL(BrowserUtils.getExternalUrlWithFallback((String) p0hVar.e.g())), 1)}) : ozgVar.getString(2132018843, new Object[]{(String) N.MN7bz_Mm(new GURL(BrowserUtils.getExternalUrlWithFallback((String) p0hVar.e.g())), 1)}));
                                    }
                                } else {
                                    i5 = 2131362984;
                                }
                                t3p.q("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i5)));
                                break;
                            }
                        }
                        t3p.q("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i6)));
                        break;
                    }
                } else {
                    wnj.a(layoutInflaterFrom, frameLayout);
                    ((TextCenteredLayout) kf.i(layoutInflaterFrom, frameLayout3).c).a(ozgVar.getString(2132018354, new Object[]{(String) N.MN7bz_Mm(new GURL(BrowserUtils.getExternalUrlWithFallback((String) p0hVar.e.g())), 1)}));
                }
                TextView textView8 = (TextView) ozgVar.f.b;
                phj.b0(textView8, phj.D0(textView8.getText().toString()), new o8f(ozgVar, (byte) 26));
                break;
        }
    }
}
