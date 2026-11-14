package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.i;
import com.leanplum.utils.SizeUtil;
import com.opera.android.bar.OmniButtonView;
import com.opera.android.custom_views.SeparatorView;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.widget.FaqItemView;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class rqd implements vqd, k2m, n5o, xjj, lr8, lua, fn8, hvb, v2p, wgb, tff, lo7, wqe, urg, jtl, p9n {
    public final /* synthetic */ byte a;

    public /* synthetic */ rqd(byte b) {
        this.a = b;
    }

    public static /* synthetic */ void c(int i, Object obj) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + obj);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: vib */
    public static void d(m37 m37Var) throws vib {
        throw new vib("encountered deserialization error", m37Var);
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void p(Throwable th) {
        throw new RuntimeException(th);
    }

    @Override // defpackage.lr8
    public final boolean a(String str) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void accept(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rqd.accept(java.lang.Object):void");
    }

    public final Object apply(Object obj) {
        bxd bxdVar = (bxd) obj;
        bxdVar.getClass();
        d7h d7hVar = o6h.a;
        d7hVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            d7hVar.a(bxdVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final sff b(z7 z7Var, t9f t9fVar) {
        return new sff(z7Var, t9fVar);
    }

    @Override // defpackage.fn8
    public final cn8[] createExtractors() {
        switch (this.a) {
            case 8:
                return new cn8[]{new bbe(tnk.Ap, 16)};
            default:
                return new cn8[]{new l9f()};
        }
    }

    public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    public final Object g(Object obj) {
        fxd fxdVarA;
        Uri uri;
        qsh qshVarB;
        switch (this.a) {
            case 3:
                gxd gxdVar = (gxd) obj;
                Context context = gxdVar.a;
                Cursor cursorQuery = null;
                try {
                    try {
                        if (gxd.b(context, "com.facebook.katana.provider.InstallReferrerProvider") != null) {
                            uri = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/120257965334518");
                        } else if (gxd.b(context, "com.instagram.contentprovider.InstallReferrerProvider") != null) {
                            uri = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/120257965334518");
                        } else {
                            if (gxd.b(context, "com.facebook.lite.provider.InstallReferrerProvider") == null) {
                                return fxd.f;
                            }
                            uri = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/120257965334518");
                        }
                        cursorQuery = context.getContentResolver().query(uri, new String[]{"install_referrer", "actual_timestamp"}, null, null, null);
                        if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                            fxdVarA = fxd.g;
                        } else {
                            long j = cursorQuery.getLong(cursorQuery.getColumnIndex("actual_timestamp"));
                            String string = cursorQuery.getString(cursorQuery.getColumnIndex("install_referrer"));
                            if (TextUtils.isEmpty(string)) {
                                fxdVarA = fxd.g;
                            } else {
                                String strA0 = oup.a0(2, string);
                                fxdVarA = (TextUtils.isEmpty(strA0) || (qshVarB = ((d3j) e3j.t(context).i()).b(5)) == null) ? fxd.h : gxdVar.a(j, strA0, (String) qshVarB.b);
                            }
                        }
                    } catch (Exception unused) {
                        fxdVarA = fxd.g;
                    }
                    return fxdVarA;
                } finally {
                    xvg.l((Closeable) null);
                }
            default:
                long j2 = 0L;
                a74 a74Var = ((t9f) xne.b.get()).k;
                if (a74Var == null) {
                    return j2;
                }
                try {
                    return Long.valueOf(a74Var.a.size());
                } catch (IOException unused2) {
                    return j2;
                }
        }
    }

    @Override // defpackage.wgb
    public final pne get() {
        switch (this.a) {
            case 13:
                return cqp.g0(cqp.m);
            default:
                return cqp.h0(cqp.m);
        }
    }

    @Override // defpackage.p9n
    public final void h(View view) {
        ((OmniButtonView) view).invalidate();
    }

    @Override // defpackage.xjj
    public final void i(Object obj, i iVar) {
        switch (this.a) {
            case 4:
                e0e e0eVar = (e0e) iVar;
                e0eVar.l = (zzd) obj;
                e0eVar.Z();
                break;
            default:
                d0e d0eVar = (d0e) iVar;
                d0eVar.l = (yzd) obj;
                d0eVar.X();
                d0eVar.Y();
                break;
        }
    }

    public final r6h j(oup oupVar) {
        r6h r6hVar = ((cbc) oupVar).f;
        r6hVar.d.ordinal();
        return r6hVar;
    }

    @Override // defpackage.jtl
    public final Object k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131558883, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131363709;
        FaqItemView faqItemView = (FaqItemView) w1h.j(2131363709, viewInflate);
        if (faqItemView != null) {
            i = 2131364287;
            OperaListItem operaListItem = (OperaListItem) w1h.j(2131364287, viewInflate);
            if (operaListItem != null) {
                i = 2131364290;
                OperaListItem operaListItem2 = (OperaListItem) w1h.j(2131364290, viewInflate);
                if (operaListItem2 != null) {
                    i = 2131364291;
                    OperaListItem operaListItem3 = (OperaListItem) w1h.j(2131364291, viewInflate);
                    if (operaListItem3 != null) {
                        i = 2131364322;
                        OperaListItem operaListItem4 = (OperaListItem) w1h.j(2131364322, viewInflate);
                        if (operaListItem4 != null) {
                            i = 2131364330;
                            OperaListItem operaListItem5 = (OperaListItem) w1h.j(2131364330, viewInflate);
                            if (operaListItem5 != null) {
                                i = 2131364332;
                                OperaListItem operaListItem6 = (OperaListItem) w1h.j(2131364332, viewInflate);
                                if (operaListItem6 != null) {
                                    i = 2131364339;
                                    if (((SeparatorView) w1h.j(2131364339, viewInflate)) != null) {
                                        i = 2131364380;
                                        OperaListItem operaListItem7 = (OperaListItem) w1h.j(2131364380, viewInflate);
                                        if (operaListItem7 != null) {
                                            i = 2131364650;
                                            OperaListItem operaListItem8 = (OperaListItem) w1h.j(2131364650, viewInflate);
                                            if (operaListItem8 != null) {
                                                return new fm9((LinearLayout) viewInflate, faqItemView, operaListItem, operaListItem2, operaListItem3, operaListItem4, operaListItem5, operaListItem6, operaListItem7, operaListItem8);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public final Object l(npd npdVar, nod nodVar, int i) {
        kod kodVar = npdVar.e;
        npdVar.r(nodVar);
        kodVar.getClass();
        return yr9.c(new e4j(-6));
    }

    @Override // defpackage.wqe
    public final boolean n(String str) {
        return false;
    }

    @Override // defpackage.urg
    public final boolean test(Object obj) {
        bwf bwfVar = (bwf) obj;
        switch (this.a) {
            case SizeUtil.textSize0 /* 20 */:
                return "cur_city_id".equals(bwfVar.a());
            default:
                return "top_news".equals(bwfVar.a());
        }
    }

    @Override // defpackage.lo7
    public final no7 x(Context context) {
        switch (this.a) {
            case 17:
                return new bqe(context, 17, "news_country_settings");
            case SizeUtil.textSize0_1 /* 18 */:
            default:
                return new z7f(context, 17, "ofa_appearances");
            case 19:
                return new hte(context, 17, "news_settings");
        }
    }
}
