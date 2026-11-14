package defpackage;

import J.N;
import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import com.leanplum.utils.SizeUtil;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.suggestion.SuggestionListCallback;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.webapps.AddToHomescreenDataFetcherNative;
import com.opera.android.widget.AspectRatioFrameLayout;
import com.opera.android.widget.AspectRatioImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class bi implements ph, h93, vlf, n5o, SuggestionListCallback, p9n, ry, m9n, zph, mm9, krn, bqb, cy1, y62, la2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bi(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void X(Bundle bundle, String str) {
        ((s02) this.b).invoke(Boolean.valueOf(bundle.getInt("result_code") == -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Type inference failed for: r17v3, types: [com.opera.android.Lazy] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r1v4, types: [b59] */
    @Override // defpackage.ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r18, java.lang.String r19, defpackage.tn r20) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi.a(java.lang.String, java.lang.String, tn):void");
    }

    public final int b(int i, d2c d2cVar) {
        return ((rd3) this.b).a(0, i, d2cVar);
    }

    @Override // defpackage.cy1
    public final void c() {
        ((x5f) ((orm) ((ji) ((s62) this.b).c.d).get())).R(12, null);
    }

    @Override // com.opera.android.suggestion.SuggestionListCallback
    public final void d(List list) {
        ht htVar;
        kt ktVar = (kt) this.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Suggestion suggestion = (Suggestion) it.next();
            int i = suggestion.a;
            if (i != 23 && i != 24) {
                switch (i) {
                }
            }
            int iG = ybh.g(suggestion);
            qxh qxhVar = new qxh(suggestion.b);
            String strB = suggestion.b();
            int i2 = suggestion.a;
            if (i2 == 23) {
                htVar = ht.h;
            } else if (i2 != 24) {
                switch (i2) {
                    case 2:
                    case 3:
                        htVar = ht.a;
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        htVar = ht.d;
                        break;
                    default:
                        htVar = ht.i;
                        break;
                }
            } else {
                htVar = ht.g;
            }
            arrayList.add(new st(qxhVar, strB, (String) null, Integer.valueOf(iG), htVar, (Set) null, (String) null, (String) null, 484));
        }
        ktVar.invoke(arrayList);
    }

    @Override // defpackage.la2
    public final void e(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 28:
                int i3 = AspectRatioFrameLayout.d;
                ((AspectRatioFrameLayout) obj).d(i, i2);
                break;
            default:
                int i4 = AspectRatioImageView.l;
                ((AspectRatioImageView) obj).f(i, i2);
                break;
        }
    }

    @Override // defpackage.krn
    public final void f(tc2 tc2Var) {
        r22 r22Var = ((x22) this.b).n;
        if (r22Var != null) {
            r22Var.f(tc2Var);
        }
    }

    public final Object g(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 7:
                return ((kt) obj2).invoke((List) obj);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                AddToHomescreenDataFetcherNative addToHomescreenDataFetcherNative = (AddToHomescreenDataFetcherNative) obj2;
                addToHomescreenDataFetcherNative.g = (Bitmap) obj;
                addToHomescreenDataFetcherNative.h = false;
                iv ivVar = addToHomescreenDataFetcherNative.o;
                if (ivVar != null) {
                    ivVar.run();
                    addToHomescreenDataFetcherNative.o = null;
                }
                return null;
            case SizeUtil.textSize0_1 /* 18 */:
                it1 it1Var = (it1) obj2;
                qii qiiVar = new qii();
                for (ShortcutInfo shortcutInfo : (List) obj) {
                    it1Var.getClass();
                    String strA = it1.a(shortcutInfo);
                    Context context = it1Var.a;
                    if (strA != null) {
                        new ghf(cqp.f0(context), strA, z7h.h(context, 40.0f), it1Var.b, qiiVar, 3000L);
                    }
                }
                return Unit.a;
            default:
                l92 l92Var = (l92) obj2;
                int i = l92.b;
                l92Var.setDrawable(0, new m92((Bitmap) obj, 0));
                l92Var.invalidateSelf();
                return null;
        }
    }

    @Override // defpackage.p9n
    public final void h(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        NativeAdView nativeAdView = ((mx) this.b).E;
        if (relativeLayout.getChildCount() == 1 && (relativeLayout.getChildAt(0) instanceof ImageView)) {
            int iA = fan.a(4.0f, nativeAdView.getResources());
            if (nativeAdView.getResources().getConfiguration().orientation == 2) {
                iA = fan.a(6.0f, nativeAdView.getResources());
            }
            q9n.D(relativeLayout, 0, iA, iA, 0);
        }
    }

    public final void i(String str, String str2) {
        oy oyVar;
        py pyVar = (py) this.b;
        pyVar.b.appendQueryParameter(str, str2);
        oyVar = pyVar.c;
        switch (str) {
            case "pkgver":
                oyVar.f = str2;
                break;
            case "ip_country":
                oyVar.e = str2;
                break;
            case "pkgname":
                oyVar.g = str2;
                break;
            case "gaid":
                oyVar.h = str2;
                break;
            case "opid":
                oyVar.i = str2;
                break;
            case "country":
                oyVar.d = str2;
                break;
        }
    }

    @Override // defpackage.zph
    public final boolean isEmpty() {
        return ((qmj) this.b).I();
    }

    @Override // defpackage.m9n
    public final void j() {
        ((zg) this.b).x();
    }

    public final void k(Object obj) {
        ((Function1) ((afe) this.b).getValue()).invoke(obj);
    }

    public final void l(String str) {
        EditText editText = (EditText) this.b;
        editText.post(new kv(editText, (byte) 0));
        String strC = wqm.C(str);
        editText.setEnabled(true);
        editText.setText(strC);
        editText.setSelection(0, strC.length());
        editText.requestFocus();
    }

    @Override // defpackage.bqb
    public final void n(tw7 tw7Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SizeUtil.textSize1 /* 22 */:
                ole oleVar = (ole) obj;
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    }
                } else {
                    Object obj2 = oleVar.a;
                    break;
                }
                break;
            case 23:
            default:
                q3 q3Var = (q3) obj;
                boolean z = false;
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        t32 t32Var = (t32) ((sw7) tw7Var).a;
                        if (t32Var != null) {
                            if (!(t32Var instanceof s32)) {
                                if (!(t32Var instanceof r32)) {
                                    if (t32Var instanceof u32) {
                                        qp2.o("");
                                        break;
                                    }
                                }
                            } else {
                                z = ((s32) t32Var).a;
                            }
                        }
                        h9o.p();
                        break;
                    }
                }
                q3Var.invoke(Boolean.valueOf(z));
                break;
            case SizeUtil.textSize2 /* 24 */:
                p62 p62Var = (p62) obj;
                p62Var.c.a.clear();
                p62Var.b.m();
                break;
        }
    }

    @Override // defpackage.h93
    public final void s() {
        ((g8j) ((d8j) this.b)).h();
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                ((wk) obj).u.V(z ? 1 : 0, "banner_blocker");
                break;
            default:
                ((uw) obj).I0().f.getClass();
                N.MzJtaipY(z);
                break;
        }
    }
}
