package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.i;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.leanplum.utils.SizeUtil;
import com.opera.android.autofill.Address;
import com.opera.android.autofill.AutofillManager;
import com.opera.android.autofill.passwords.picker.AutofillPasswordPickerActivity;
import com.opera.android.bar.BottomBar;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.settings.SettingsManager;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.widget.AspectRatioViewPager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class va2 implements la2, n5o, ykj, AutofillManager.AutofillCallback, tj9, xjj, qcf, m9n, pnn, OnSuccessListener, OnFailureListener, lkm, bcf, nl5, vwh, m94, tya, vlf, yjj {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ va2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void R(ArrayList arrayList) {
        ((gn3) this.b).b.e(alo.j(arrayList));
    }

    @Override // defpackage.qcf
    public final void a(Dialog dialog) {
        ((mi) ((xbf) ((AutofillPasswordPickerActivity) this.b).l.a).b).D.v(dialog);
    }

    public final Object attachCompleter(l94 l94Var) {
        q0b o94Var;
        wg4 wg4Var = (wg4) this.b;
        wg4Var.n.f();
        if (wg4Var.o.isInitialized()) {
            f8i f8iVar = (f8i) wg4Var.o.getValue();
            synchronized (f8iVar.a) {
                f8iVar.b.disable();
                f8iVar.c.clear();
                f8iVar.d = -1;
            }
        }
        hf4 hf4Var = wg4Var.a;
        synchronized (hf4Var.a) {
            boolean zIsEmpty = hf4Var.b.isEmpty();
            o94Var = hf4Var.d;
            if (!zIsEmpty) {
                if (o94Var == null) {
                    l94 l94Var2 = new l94();
                    l94Var2.c = new byh();
                    o94Var = new o94(l94Var2);
                    l94Var2.b = o94Var;
                    l94Var2.a = vep.class;
                    try {
                        synchronized (hf4Var.a) {
                            hf4Var.e = l94Var2;
                        }
                        l94Var2.a = "CameraRepository-deinit";
                    } catch (Exception e) {
                        o94Var.a(e);
                    }
                    hf4Var.d = o94Var;
                }
                hf4Var.c.addAll(hf4Var.b.values());
                for (zd4 zd4Var : hf4Var.b.values()) {
                    zd4Var.release().addListener(new bi2(hf4Var, zd4Var, (byte) 27), n97.a());
                }
                hf4Var.b.clear();
            } else if (o94Var == null) {
                o94Var = q0b.c;
            }
        }
        o94Var.addListener(new bi2(wg4Var, l94Var, (byte) 29), wg4Var.d);
        return "CameraX shutdownInternal";
    }

    @Override // defpackage.nl5
    public final void b(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 15:
                th3 th3Var = (th3) obj;
                th3Var.i.r(new br((Object) th3Var, i, (byte) 5));
                break;
            default:
                wo3 wo3Var = (wo3) obj;
                if (i == 1) {
                    SettingsManager settingsManager = wo3Var.t;
                    y9j y9jVar = settingsManager.a;
                    if (y9jVar.contains("toolbar_bottom_actions")) {
                        y9jVar.remove("toolbar_bottom_actions");
                        settingsManager.Q("toolbar_bottom_actions");
                    }
                    np1 np1Var = wo3Var.I;
                    if (np1Var == null) {
                        np1Var = null;
                    }
                    np1Var.a = true;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.yjj
    public final i c(ViewGroup viewGroup) {
        yw ywVar = (yw) this.b;
        View viewN = j7c.n(viewGroup, 2131558524, viewGroup, false);
        int i = 2131362248;
        yq1 yq1Var = (StylingTextView) w1h.j(2131362248, viewN);
        if (yq1Var != null) {
            i = 2131363660;
            StylingImageView stylingImageView = (StylingImageView) w1h.j(2131363660, viewN);
            if (stylingImageView != null) {
                i = 2131364567;
                StylingTextView stylingTextView = (StylingTextView) w1h.j(2131364567, viewN);
                if (stylingTextView != null) {
                    return new al4(ywVar, new vs((ViewGroup) viewN, (View) yq1Var, (Object) stylingImageView, (Object) stylingTextView, (byte) 4));
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewN.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.tj9
    public final void d(int i) {
        mr2 mr2Var = (mr2) this.b;
        fr2 fr2Var = mr2Var.y;
        gw gwVar = mr2Var.t;
        AutofillManager autofillManager = mr2Var.s;
        if (fr2Var == null) {
            fr2Var = null;
        }
        int iB = fr2Var.b(mr2Var.x);
        fr2 fr2Var2 = mr2Var.y;
        if (fr2Var2 == null) {
            fr2Var2 = null;
        }
        gr2 gr2VarA = fr2Var2.getItem(i);
        String str = gr2VarA.a;
        if (Intrinsics.a(str, "SELECT_BUTTON")) {
            mr2Var.x = null;
            return;
        }
        boolean zA = Intrinsics.a(str, "ADD_BUTTON");
        yp2 yp2Var = yp2.d;
        yp2 yp2Var2 = yp2.c;
        yp2 yp2Var3 = yp2.a;
        if (zA) {
            Context contextRequireContext = mr2Var.requireContext();
            orm ormVar = mr2Var.r;
            ir2 ir2Var = new ir2(mr2Var);
            cr2 cr2Var = mr2Var.u;
            if (cr2Var == null) {
                cr2Var = null;
            }
            kp2 kp2Var = new kp2(ormVar, autofillManager, gwVar, yi4.n(String.valueOf(((OperaTextInputEditText) cr2Var.i).getText())));
            kp2Var.F = ir2Var;
            HashSet hashSet = new HashSet();
            hashSet.add(yp2Var3);
            hashSet.add(yp2Var2);
            hashSet.add(yp2Var);
            if (!kp2Var.isVisible()) {
                kp2Var.K = hashSet;
            }
            zhj.a(kp2Var, 4099).c(contextRequireContext);
            ro9 ro9Var = mr2Var.w;
            if (ro9Var == null) {
                ro9Var = null;
            }
            fr2 fr2Var3 = mr2Var.y;
            ro9Var.a0(iB, (fr2Var3 != null ? fr2Var3 : null).getItem(iB).b);
            return;
        }
        Address address = gr2VarA.c;
        if (address != null) {
            if (qbe.W(autofillManager, address) == 1) {
                mr2Var.x = gr2VarA.a;
                mr2Var.M0();
                return;
            }
            Context contextRequireContext2 = mr2Var.requireContext();
            hr2 hr2Var = mr2Var.A;
            ds2 ds2Var = new ds2(autofillManager, gwVar, address);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(yp2Var3);
            hashSet2.add(yp2Var2);
            hashSet2.add(yp2Var);
            if (!ds2Var.isVisible()) {
                ds2Var.K = hashSet2;
            }
            ds2Var.F = hr2Var;
            zhj.a(ds2Var, 4099).c(contextRequireContext2);
            ro9 ro9Var2 = mr2Var.w;
            if (ro9Var2 == null) {
                ro9Var2 = null;
            }
            fr2 fr2Var4 = mr2Var.y;
            ro9Var2.a0(iB, (fr2Var4 != null ? fr2Var4 : null).getItem(iB).b);
        }
    }

    @Override // defpackage.la2
    public final void e(int i, int i2) {
        AspectRatioViewPager aspectRatioViewPager = (AspectRatioViewPager) this.b;
        int i3 = AspectRatioViewPager.d;
        aspectRatioViewPager.s(i, i2);
    }

    @Override // defpackage.vwh
    public final void f(o93 o93Var) {
        qim qimVar = ((cx3) this.b).c.o;
        Objects.requireNonNull(qimVar);
        ysj ysjVar = qimVar.e;
        ysjVar.getClass();
        ysjVar.b(o93Var, ijm.b);
    }

    public final Object g(Object obj) {
        return ((fd2) this.b).b(obj);
    }

    public final xc h(pc pcVar) {
        yo3 yo3Var = (yo3) this.b;
        int iOrdinal = pcVar.ordinal();
        return iOrdinal != 2 ? iOrdinal != 5 ? iOrdinal != 28 ? pcVar.a : yo3Var.e.f.e(pc.m) != null ? xc.J : xc.K : xc.K : xc.L;
    }

    @Override // defpackage.xjj
    public final void i(Object obj, i iVar) {
        ru2 ru2Var = (ru2) obj;
        zs2 zs2Var = (zs2) iVar;
        int i = ((ws2) this.b).f;
        or2 or2Var = zs2Var.c;
        zs2Var.d = ru2Var;
        String str = ru2Var.c;
        String str2 = ru2Var.b;
        if (str.length() == 0 || str2.length() == 0) {
            ((Space) or2Var.d).setVisibility(8);
        }
        String string = StringsKt.l0(str).toString();
        String string2 = StringsKt.l0(str2).toString();
        if (i == 10 || i == 5) {
            string2 = string;
            string = string2;
        }
        TextView textView = (TextView) or2Var.b;
        ImageView imageView = (ImageView) or2Var.e;
        textView.setText(string2);
        na2.S((TextView) or2Var.f, string);
        lxh lxhVarB0 = j14.b0(zs2Var.b, ru2Var.d);
        if (lxhVarB0 != null) {
            imageView.setImageDrawable(lxhVarB0.f(((FrameLayout) or2Var.c).getContext()));
            imageView.setVisibility(0);
        }
    }

    @Override // defpackage.m9n
    public final void j() {
        ((z43) this.b).d();
    }

    public final Object k(g3d g3dVar) {
        return Integer.valueOf(((ig2) this.b).K);
    }

    public final void l(a4g a4gVar) {
        jh3 jh3Var = (jh3) this.b;
        d83 d83Var = jh3Var.v;
        if (((a4g) d83Var.b) != a4gVar) {
            d83Var.b = a4gVar;
            wth wthVar = (wth) d83Var.d;
            if (wthVar != null) {
                wthVar.b = null;
                d83Var.d = null;
            }
            if (a4gVar == null) {
                d83Var.c = null;
            } else {
                d83Var.c = new ArrayList(Collections.unmodifiableList(((a4g) d83Var.b).a));
            }
            d83Var.notifyDataSetChanged();
        }
        yz7 yz7Var = jh3Var.G;
        if (yz7Var.d || a4gVar == null) {
            return;
        }
        yz7Var.c();
    }

    public final g3o l0(View view, g3o g3oVar) throws Resources.NotFoundException {
        int i;
        int i2;
        byte b = this.a;
        int i3 = 0;
        Object obj = this.b;
        switch (b) {
            case SizeUtil.textSize0 /* 20 */:
                boolean z = BottomBar.r;
                ((BottomBar) obj).setPadding(0, 0, 0, g3oVar.a.i(138).d);
                break;
            default:
                ViewGroup viewGroup = (ViewGroup) obj;
                int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(2131165349);
                WeakHashMap weakHashMap = r5n.a;
                g3o g3oVarA = i5n.a(viewGroup);
                if (g3oVarA != null) {
                    r9b r9bVarI = g3oVarA.a.i(647);
                    int i4 = r9bVarI.a;
                    i2 = r9bVarI.c;
                    i = r9bVarI.d;
                    i3 = i4;
                } else {
                    i = 0;
                    i2 = 0;
                }
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.leftMargin = i3 + dimensionPixelSize;
                    marginLayoutParams.rightMargin = dimensionPixelSize + i2;
                    viewGroup.setLayoutParams(layoutParams);
                }
                p37.p0(i, viewGroup);
                break;
        }
        return g3oVar;
    }

    public final void m(int i) {
        im3 im3Var = (im3) this.b;
        im3Var.y = i;
        ((SharedPreferences) im3Var.z.get()).edit().putInt("bookmarks_sort_order", fki.i(i)).apply();
        xm3 xm3Var = im3Var.x.s;
        if (xm3Var != null) {
            xm3Var.i = im3Var.y;
            xm3Var.J();
        }
    }

    public final void o(uya uyaVar) {
        igi igiVar = (igi) this.b;
        try {
            qya qyaVarE = uyaVar.e();
            s1h s1hVar = (s1h) igiVar.b;
            if (qyaVarE != null) {
                igiVar.Y(qyaVarE);
                return;
            }
            if (s1hVar != null) {
                int i = s1hVar.a;
                new gwa(2, "Failed to acquire latest image", null);
                xug.i();
                s1h s1hVar2 = (s1h) igiVar.b;
                if (s1hVar2 == null || s1hVar2.a != i) {
                    return;
                }
                xwh xwhVar = s1hVar2.f;
                xug.i();
                if (xwhVar.f) {
                    return;
                }
                xug.i();
                throw null;
            }
        } catch (IllegalStateException e) {
            s1h s1hVar3 = (s1h) igiVar.b;
            if (s1hVar3 != null) {
                int i2 = s1hVar3.a;
                new gwa(2, "Failed to acquire latest image", e);
                xug.i();
                s1h s1hVar4 = (s1h) igiVar.b;
                if (s1hVar4 == null || s1hVar4.a != i2) {
                    return;
                }
                xwh xwhVar2 = s1hVar4.f;
                xug.i();
                if (xwhVar2.f) {
                    return;
                }
                xug.i();
                throw null;
            }
        }
    }

    @Override // com.opera.android.autofill.AutofillManager.AutofillCallback
    public final void onAdded(String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                kp2 kp2Var = (kp2) obj;
                es2 es2Var = kp2Var.F;
                if (es2Var != null) {
                    es2Var.onAdded(str);
                }
                ((x5f) kp2Var.L).y(g80.b);
                break;
            case 5:
                ((x5f) ((mp2) obj).r).y(g80.c);
                break;
            default:
                ((x5f) ((np2) obj).y).y(g80.d);
                break;
        }
    }

    public final void onFailure(Exception exc) {
        ((cn7) this.b).run();
    }

    public final void onSuccess(Object obj) {
        hu5 hu5Var = (hu5) this.b;
        RetrieveBytesResponse.BlockstoreData blockstoreData = (RetrieveBytesResponse.BlockstoreData) ((RetrieveBytesResponse) obj).getBlockstoreDataMap().get("com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY");
        if (blockstoreData == null) {
            hu5Var.run(new byte[0]);
        } else {
            hu5Var.run(blockstoreData.getBytes());
        }
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        ((zk4) this.b).I0().b.V(z ? 1 : 0, "automatic_card_save_ask");
    }
}
