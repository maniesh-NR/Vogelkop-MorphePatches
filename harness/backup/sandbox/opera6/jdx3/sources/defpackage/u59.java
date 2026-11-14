package defpackage;

import J.N;
import android.R;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import com.google.android.gms.internal.atv_ads_framework.zza;
import com.google.android.gms.internal.atv_ads_framework.zzd;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.tv.ads.controls.FallbackImageActivity;
import com.leanplum.utils.SizeUtil;
import com.opera.android.browser.chromium.ChromiumContent;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.chromium.components.autofill.AutofillProvider;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class u59 implements kud, s37, a5a, tyi, bcf, jzh, gk8, lnk, jak, jz4, jh4 {
    public static u59 c;
    public static final Object d = new Object();
    public static final u59 e = new u59(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f}, 1);
    public static final wu9 f = new wu9((byte) 1);
    public static qt g;
    public final /* synthetic */ byte a;
    public Object b;

    public u59(byte b) {
        nvd nvdVar;
        this.a = b;
        switch (b) {
            case 11:
                new wa(this, (byte) 3);
                this.b = uup.m(new auj((byte) 8));
                break;
            case 15:
                break;
            case SizeUtil.textSize0 /* 20 */:
                this.b = fee.k();
                break;
            case 26:
                this.b = d77.a(CloseCameraDeviceOnCameraGraphCloseQuirk.class);
                break;
            default:
                v6h v6hVar = v6h.c;
                try {
                    nvdVar = (nvd) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    nvdVar = f;
                }
                nvd[] nvdVarArr = {wu9.b, nvdVar};
                h9d h9dVar = new h9d();
                h9dVar.a = nvdVarArr;
                Charset charset = hfb.a;
                this.b = h9dVar;
                break;
        }
    }

    public /* synthetic */ u59(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public u59(mbi mbiVar) {
        this.a = (byte) 7;
        mbiVar.getClass();
        this.b = mbiVar;
        new zzd();
    }

    public u59(qy4 qy4Var) {
        this.a = (byte) 24;
        Objects.requireNonNull(qy4Var);
        this.b = qy4Var;
    }

    public static u59 C(Context context) {
        u59 u59Var;
        synchronized (d) {
            u59Var = c;
            if (u59Var == null) {
                u59Var = new u59(new nv6(context, (byte) 9), (byte) 0);
                c = u59Var;
            }
        }
        return u59Var;
    }

    private final boolean J(nzi nziVar) {
        if (nziVar.e == ahh.select_action_menu_passkey_entry) {
            long j = ((AutofillProvider) this.b).f;
            if (j != 0) {
                N.MviFxyDZ(j);
                return true;
            }
        } else {
            if (nziVar.e != 16908355) {
                return false;
            }
            AutofillProvider autofillProvider = (AutofillProvider) this.b;
            if (autofillProvider.j()) {
                wu2 wu2Var = (wu2) autofillProvider.e.b;
                Rect rectA = autofillProvider.a(wu2Var.b);
                if (rectA != null) {
                    ht2 ht2VarB = autofillProvider.b();
                    View view = autofillProvider.c;
                    int iF = autofillProvider.e.F(wu2Var.a);
                    if (!ht2VarB.c() && !ht2VarB.a()) {
                        try {
                            ht2VarB.b.requestAutofill(view, iF, rectA);
                            return true;
                        } catch (Exception e2) {
                            uu2.b(12, e2);
                        }
                    }
                }
            }
        }
        return true;
    }

    public static u59 M(int i, int i2, int i3, boolean z) {
        return new u59(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3), (byte) 4);
    }

    @Override // defpackage.jz4
    public final void A(ChromiumContent chromiumContent) {
    }

    public final ArrayList B() {
        ArrayList arrayList = new ArrayList();
        long j = ((AutofillProvider) this.b).f;
        if (j != 0 && N.MK_7GdD0(j)) {
            mzi mziVar = new mzi(2132017841);
            mziVar.c = ahh.select_action_menu_passkey_entry;
            mziVar.d = ahh.select_action_menu_delegate_items;
            mziVar.b(1, 100);
            mziVar.i = (byte) 6;
            arrayList.add(mziVar.a());
        }
        if (((AutofillProvider) this.b).j()) {
            mzi mziVar2 = new mzi(R.string.autofill);
            mziVar2.c = R.id.autofill;
            mziVar2.d = ahh.select_action_menu_delegate_items;
            mziVar2.b(196608, 100);
            mziVar2.i = (byte) 4;
            arrayList.add(mziVar2.a());
        }
        return arrayList;
    }

    @Override // defpackage.jz4
    public final boolean D() {
        return true;
    }

    @Override // defpackage.jz4
    public final void E(ChromiumContent chromiumContent) {
        ((rz4) this.b).v.e().d1().a(SystemClock.uptimeMillis(), false);
    }

    public final b2l F() {
        ChromiumContent chromiumContent = (ChromiumContent) this.b;
        return chromiumContent.c().V(chromiumContent.e());
    }

    @Override // defpackage.jz4
    public final void G(ChromiumContent chromiumContent) {
        E(chromiumContent);
        ((rz4) this.b).v.e().d1().g((float) Math.ceil(r2.v.e().g.a), 0.0f);
    }

    public final t59 H() {
        t59 t59VarL = L();
        return t59VarL != null ? t59VarL : t59.d;
    }

    public final void I(msp mspVar) {
        String str;
        mbi mbiVar = (mbi) this.b;
        List list = mspVar.a;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            prp prpVar = (prp) it.next();
            String queryParameter = Uri.parse(prpVar.e).getQueryParameter("atvatc");
            if (queryParameter != null && queryParameter.equals("1")) {
                str = prpVar.e;
                break;
            }
        }
        if (str == null) {
            if (list.isEmpty()) {
                mbiVar.startActivity(new Intent().setClassName(mbiVar.getPackageName(), FallbackImageActivity.class.getName()).putExtra("render_error_message", true));
                return;
            } else {
                mbiVar.startActivity(new Intent().setClassName(mbiVar.getPackageName(), FallbackImageActivity.class.getName()).putExtra("icon_click_fallback_images", (Parcelable) mspVar));
                return;
            }
        }
        try {
            Intent intentPutExtra = new Intent().setAction("com.google.android.tv.ads.intent.action.LAUNCH_ATC_MENU").putExtra("extra_atc_uri", str).putExtra("extra_publisher_package", mbiVar.getPackageName());
            zza zzaVar = zza.zza;
            int iOrdinal = zzd.zza(mbiVar).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    mbiVar.startActivity(intentPutExtra.setPackage("com.google.android.apps.tv.launcherx"));
                    return;
                } else if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        throw new IllegalStateException("AdsControlsManager should only be used on the Android TV platform.");
                    }
                    return;
                }
            }
            mbiVar.startActivity(intentPutExtra.setPackage("com.google.android.tvrecommendations"));
        } catch (ActivityNotFoundException unused) {
            mbiVar.startActivity(new Intent().setClassName(mbiVar.getPackageName(), FallbackImageActivity.class.getName()).putExtra("render_error_message", true));
        }
    }

    public final void K(tj5 tj5Var) {
        for (an2 an2Var : tj5Var.d()) {
            ((fee) this.b).q(an2Var, tj5Var.h(an2Var), tj5Var.i(an2Var));
        }
    }

    public final t59 L() {
        String string = ((SharedPreferences) ((nv6) this.b).a).getString("persistent.installTime", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                return new t59(jSONArray.getLong(0), jSONArray.getLong(1), aik.o(jSONArray.optString(2, null)));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void N(int i) {
        switch (this.a) {
            case 6:
                qt qtVar = g;
                if (qtVar != null) {
                    qtVar.b(hjm.b, 3);
                }
                qt qtVar2 = new qt(new rxh(i), (byte) 0);
                ysj ysjVar = (ysj) this.b;
                ysjVar.getClass();
                ysjVar.b(qtVar2, ijm.b);
                g = qtVar2;
                break;
            default:
                zz1 zz1Var = (zz1) ((s62) this.b).v.o;
                if (zz1Var != null) {
                    zz1Var.d.a(new rxh(i), 2500);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.a5a
    public final boolean Q(int i) {
        return true;
    }

    @Override // defpackage.jz4
    public final int a() {
        return 0;
    }

    public final eb4 b() {
        return new eb4(wrf.f((fee) this.b));
    }

    @Override // defpackage.jz4
    public final int c() {
        return 0;
    }

    public final List d(List list) {
        return list;
    }

    public final void destroy() {
    }

    public final boolean e(nzi nziVar) {
        switch (this.a) {
            case 2:
                return J(nziVar);
            default:
                u59 u59Var = (u59) this.b;
                return u59Var != null && u59Var.e(nziVar);
        }
    }

    public final void f(itd itdVar, boolean z) {
        ((xp1) this.b).q(itdVar);
    }

    @Override // defpackage.jz4
    public final int g() {
        return 0;
    }

    public final List getCues(long j) {
        return j >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    public final long getEventTime(int i) {
        z4o.w(i == 0);
        return 0L;
    }

    public final int getEventTimeCount() {
        return 1;
    }

    public final int getNextEventTimeIndex(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.jz4
    public final int h() {
        return 0;
    }

    public final fee i() {
        throw null;
    }

    @Override // defpackage.jz4
    public final boolean j() {
        return false;
    }

    @Override // defpackage.jak
    public final s6j k() {
        return (cx4) this.b;
    }

    public final boolean l() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [android.app.Dialog, tq3] */
    public final g3o l0(View view, g3o g3oVar) {
        switch (this.a) {
            case 16:
                na3 na3Var = (na3) this.b;
                na3Var.n = g3oVar.a();
                na3Var.o = g3oVar.b();
                na3Var.p = g3oVar.c();
                na3Var.h();
                break;
            default:
                ?? r1 = (tq3) this.b;
                sq3 sq3Var = r1.n;
                if (sq3Var != null) {
                    r1.g.a0.remove(sq3Var);
                }
                sq3 sq3Var2 = new sq3(r1.j, g3oVar);
                r1.n = sq3Var2;
                sq3Var2.e(r1.getWindow());
                BottomSheetBehavior bottomSheetBehavior = r1.g;
                sq3 sq3Var3 = r1.n;
                ArrayList arrayList = bottomSheetBehavior.a0;
                if (!arrayList.contains(sq3Var3)) {
                    arrayList.add(sq3Var3);
                    break;
                }
                break;
        }
        return g3oVar;
    }

    @Override // defpackage.jz4
    public final boolean n(ChromiumContent chromiumContent) {
        return false;
    }

    @Override // defpackage.jz4
    public final void o(ChromiumContent chromiumContent) {
    }

    public final boolean p(itd itdVar) {
        Window.Callback callback = ((xp1) this.b).l.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, itdVar);
        return true;
    }

    @Override // defpackage.a5a
    public final z4a q(int i) {
        int size = ((ArrayList) ((mq2) this.b).i.d).size();
        return size == 1 ? z4a.d : i == 0 ? z4a.a : i == size - 1 ? z4a.b : z4a.c;
    }

    @Override // defpackage.jz4
    public final boolean r(ChromiumContent chromiumContent, boolean z) {
        SelectionPopupControllerImpl selectionPopupControllerImplFromWebContents = SelectionPopupControllerImpl.fromWebContents(((rz4) this.b).v.e());
        if (!selectionPopupControllerImplFromWebContents.D) {
            return false;
        }
        if (z) {
            selectionPopupControllerImplFromWebContents.r();
            return true;
        }
        if (!selectionPopupControllerImplFromWebContents.D()) {
            return false;
        }
        selectionPopupControllerImplFromWebContents.hidePopupsAndPreserveSelection();
        return true;
    }

    public final kyh s(kyh kyhVar, trf trfVar) {
        Resources resources = (Resources) this.b;
        if (kyhVar == null) {
            return null;
        }
        return new ah3(resources, kyhVar);
    }

    @Override // defpackage.jz4
    public final void t(boolean z) {
        jq9 jq9Var = ((rz4) this.b).u;
        if (jq9Var != null) {
            jq9Var.d(z);
        } else {
            h9o.e();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                return "Bradford";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.jz4
    public final void u(ChromiumContent chromiumContent, boolean z) {
    }

    public final void w(Typeface typeface) {
        v85 v85Var = (v85) this.b;
        if (v85Var.w(typeface)) {
            v85Var.l(false);
        }
    }

    public final List x(String str) {
        u59 u59Var;
        return (!str.isEmpty() || (u59Var = (u59) this.b) == null) ? Collections.EMPTY_LIST : u59Var.B();
    }

    @Override // defpackage.jak
    public final void y(Object obj) {
        cx4 cx4Var = (cx4) this.b;
        kak kakVar = cx4Var.g;
        ekc ekcVar = cx4Var.d;
        r6j r6jVar = ekcVar != null ? (r6j) ekcVar.g() : null;
        if (cx4Var.d == null || r6jVar == null) {
            kakVar.getClass();
        } else {
            kakVar.getClass();
            cx4Var.b.n(cx4Var.h(r6jVar, obj, cx4Var.a));
        }
    }
}
