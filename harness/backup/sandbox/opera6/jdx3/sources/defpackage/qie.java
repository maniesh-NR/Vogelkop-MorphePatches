package defpackage;

import android.app.assist.AssistStructure;
import android.content.Context;
import android.os.Trace;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.f;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.internal.play_billing.zzca;
import com.leanplum.internal.ResourceQualifiers;
import com.leanplum.utils.SizeUtil;
import com.opera.android.oauth2.OAuth2Account;
import com.opera.android.oauth2.OperaAccessToken;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.usercentrics.sdk.v2.settings.data.ConsentDisclosureObject;
import com.usercentrics.sdk.v2.settings.data.ServiceConsentTemplate;
import com.usercentrics.sdk.v2.settings.data.UsercentricsService;
import com.usercentrics.sdk.v2.translation.data.LegalBasisLocalization;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.chromium.base.task.PostTask;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* loaded from: classes.dex */
public final class qie implements q03, qye, ahf, u13, cn, sic, b5n, xx5, boi, vlf, u18, onk {
    public static qie c;
    public final /* synthetic */ byte a;
    public Object b;

    public qie(byte b) {
        this.a = b;
        boolean z = false;
        switch (b) {
            case 12:
                isd isdVar = new isd((byte) 17, z);
                isdVar.b = new yp9(isdVar, 134, (byte) 2);
                this.b = isdVar;
                break;
            case 19:
                this.b = new ArrayDeque();
                break;
            case SizeUtil.textSize1 /* 22 */:
                this.b = new auj((byte) 0);
                break;
            case 28:
                this.b = new r16();
                break;
            default:
                ehc ehcVarB = a.b();
                nf2 nf2Var = nf2.PASSWORD;
                ehcVarB.add(new Pair(224, nf2Var));
                nf2 nf2Var2 = nf2.EMAIL_ADDRESS;
                ehcVarB.add(new Pair(208, nf2Var2));
                Integer numValueOf = Integer.valueOf(ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_MASK);
                nf2 nf2Var3 = nf2.OTHER;
                ehcVarB.add(new Pair(numValueOf, nf2Var3));
                ehcVarB.add(new Pair(176, nf2Var3));
                ehcVarB.add(new Pair(160, nf2Var3));
                ehcVarB.add(new Pair(144, nf2Var));
                ehcVarB.add(new Pair(Integer.valueOf(ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL), nf2Var));
                ehcVarB.add(new Pair(112, nf2.ADDRESS));
                nf2 nf2Var4 = nf2.NAME;
                ehcVarB.add(new Pair(96, nf2Var4));
                ehcVarB.add(new Pair(80, nf2Var3));
                ehcVarB.add(new Pair(64, nf2Var3));
                ehcVarB.add(new Pair(48, nf2Var3));
                ehcVarB.add(new Pair(32, nf2Var2));
                ehcVarB.add(new Pair(16, nf2Var3));
                ehcVarB.add(new Pair(16384, nf2Var4));
                this.b = a.a(ehcVarB);
                break;
        }
    }

    public /* synthetic */ qie(byte b, boolean z) {
        this.a = b;
    }

    public qie(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 15:
                mjk mjkVar = new mjk();
                if (ddh.v("b")) {
                    this.b = new wh5(new uil[]{mjkVar, new wh5(context)});
                    return;
                } else {
                    qp2.o("Invalid tag: b");
                    throw null;
                }
            default:
                this.b = i0l.h(context);
                return;
        }
    }

    public qie(Context context, h42 h42Var) {
        this.a = (byte) 26;
        h42 h42Var2 = new h42();
        ru9 ru9VarC = ru9.c(context);
        h42Var2.r(new kpk(new mpk(ru9VarC.a.getInt("startpage.last_suggestion_count", 0)), npk.a));
        h42Var2.s(h42Var, new wj(ru9VarC, h42Var2, (byte) 6));
        this.b = h42Var2;
    }

    public qie(OAuth2Account oAuth2Account, ab abVar) {
        this.a = (byte) 3;
        this.b = abVar;
        Objects.requireNonNull(oAuth2Account);
    }

    public /* synthetic */ qie(isd isdVar) {
        this.a = (byte) 10;
        this.b = (zzca) isdVar.b;
    }

    public /* synthetic */ qie(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public qie(p03 p03Var, bx7 bx7Var) {
        this.a = (byte) 0;
        this.b = bx7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    public static iac s(sn5 sn5Var, List list, LegalBasisLocalization legalBasisLocalization) {
        Object next;
        List list2;
        String str;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            UsercentricsService usercentricsService = (UsercentricsService) next;
            if (Intrinsics.a(sn5Var.d(), usercentricsService.a) && Intrinsics.a(sn5Var.c(), usercentricsService.b)) {
                break;
            }
        }
        UsercentricsService usercentricsService2 = (UsercentricsService) next;
        if (usercentricsService2 == null) {
            String description = sn5Var.getDescription();
            String strD = sn5Var.d();
            String strC = sn5Var.c();
            boolean zA = sn5Var.a();
            String strB = sn5Var.b();
            Boolean boolF = sn5Var.f();
            Boolean boolE = sn5Var.e();
            boolean zBooleanValue = boolE != null ? boolE.booleanValue() : false;
            l08 l08Var = l08.a;
            usercentricsService2 = new UsercentricsService(strD, strC, (String) null, (List) null, "", l08Var, (String) null, "", "", "", l08Var, l08Var, l08Var, l08Var, l08Var, l08Var, l08Var, (List) null, "", (String) null, (String) null, (Boolean) null, "", "", "", "", strB, (String) null, "", "", "", "", "", (String) null, "", description, (Long) null, (Boolean) null, (String) null, new ConsentDisclosureObject(), (String) null, zA, (String) null, boolF, (Boolean) null, (Boolean) null, false, (String) null, zBooleanValue);
        }
        String str2 = usercentricsService2.e;
        ?? SingletonList = usercentricsService2.p;
        List list3 = usercentricsService2.m;
        zpg zpgVar = new zpg(usercentricsService2.G, usercentricsService2.I);
        List list4 = usercentricsService2.n;
        if (list4.isEmpty()) {
            list4 = usercentricsService2.f;
        }
        List list5 = list4;
        List list6 = usercentricsService2.o;
        String str3 = usercentricsService2.j;
        String strD2 = sn5Var.d();
        boolean z = sn5Var instanceof ServiceConsentTemplate;
        if (z && (list2 = ((ServiceConsentTemplate) sn5Var).k) != null && (!list2.isEmpty())) {
            List<String> list7 = list2;
            SingletonList = new ArrayList(k95.o(list7, 10));
            for (String str4 : list7) {
                Map map = legalBasisLocalization.c;
                if (map != null && (str = (String) map.get(str4)) != null) {
                    str4 = str;
                }
                SingletonList.add(str4);
            }
        } else if (((Collection) SingletonList).isEmpty()) {
            SingletonList = Collections.singletonList(usercentricsService2.x);
        }
        List list8 = SingletonList;
        if (str2 == null || StringsKt.N(str2)) {
            str2 = "";
        }
        return new iac(list3, zpgVar, list5, list6, str3, strD2, list8, str2, z ? ((ServiceConsentTemplate) sn5Var).l : Boolean.FALSE, new uqg(usercentricsService2.i, usercentricsService2.D, usercentricsService2.h), usercentricsService2.C, usercentricsService2.k, new org(usercentricsService2.F, usercentricsService2.w, usercentricsService2.y, usercentricsService2.E), sn5Var.c(), usercentricsService2.K, usercentricsService2.L, usercentricsService2.M, usercentricsService2.N, usercentricsService2.O, usercentricsService2.P);
    }

    public static int[] v(String str) {
        try {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Version string is empty");
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            int iCountTokens = stringTokenizer.countTokens();
            int[] iArr = new int[iCountTokens];
            for (int i = 0; i < iCountTokens; i++) {
                iArr[i] = Integer.parseInt(stringTokenizer.nextToken());
            }
            return iArr;
        } catch (RuntimeException e) {
            throw new IllegalArgumentException(sko.k("Unable to parse HTTP flags version string: `", str, "`"), e);
        }
    }

    public static qie x(e79 e79Var, String str, String str2, boolean z) {
        lni.h("Cronet ResolvedFlags#resolve");
        try {
            int[] iArrV = v(str2);
            HashMap map = new HashMap();
            for (Map.Entry entry : e79Var.b().entrySet()) {
                try {
                    gyh gyhVarB = gyh.b((z69) entry.getValue(), str, iArrV, z);
                    if (gyhVarB != null) {
                        map.put((String) entry.getKey(), gyhVarB);
                    }
                } catch (RuntimeException e) {
                    throw new IllegalArgumentException("Unable to resolve HTTP flag `" + ((String) entry.getKey()) + "`", e);
                }
            }
            qie qieVar = new qie((Object) map, (byte) 14);
            Trace.endSection();
            return qieVar;
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final int A(View view) {
        return ((f) this.b).getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
    }

    public final void I(int i, int i2, Object obj) {
    }

    public final void S(int i, int i2) {
        okg okgVar = ((tjg) this.b).k;
        okgVar.c.c(i, i2);
        okgVar.b.b();
    }

    @Override // defpackage.ahf
    public final void V(OperaAccessToken operaAccessToken) {
        new dhf(this, operaAccessToken, (ab) this.b).k();
    }

    public final void a(boolean z) {
        PostTask.d(7, new gh2((byte) 6, (bx7) this.b, z));
    }

    @Override // defpackage.ahf
    public final void b() {
        ((ab) this.b).run(null);
    }

    public final void c() {
        npf npfVar = (npf) ((x79) this.b).e;
        npfVar.a("loadAd: onAdImpression");
        MediationBannerAdCallback mediationBannerAdCallback = npfVar.c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    public final int d(View view) {
        return ((f) this.b).getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
    }

    public final Object e(wx5 wx5Var) {
        return ((gbb) this.b).invoke(wx5Var);
    }

    public final void f(int i, int i2) {
    }

    public final void g(cm cmVar) {
        switch (this.a) {
            case 4:
                npf npfVar = (npf) ((x79) this.b).e;
                npfVar.a("loadAd: onAdFailedToLoad, error=" + cmVar);
                npfVar.a.onFailure(rm5.q(cmVar.b, cmVar.c));
                break;
            default:
                qpf qpfVar = (qpf) ((ghf) this.b).d;
                qpfVar.a("loadAd: onAdFailedToLoad, error=" + cmVar);
                qpfVar.b.onFailure(rm5.q(cmVar.b, cmVar.c));
                break;
        }
    }

    public final void h() {
        android.util.Pair pair = (android.util.Pair) this.b;
        if (pair != null) {
            dej dejVar = (dej) pair.second;
            dejVar.b.Q(hjm.b);
            this.b = null;
        }
    }

    public final int i() {
        return ((f) this.b).getPaddingLeft();
    }

    @Override // defpackage.qye
    public final nf2 k(AssistStructure.ViewNode viewNode) {
        int iIntValue;
        nf2 nf2Var;
        int inputType = viewNode.getInputType();
        mea meaVarListIterator = ((ehc) this.b).listIterator(0);
        do {
            mea meaVar = meaVarListIterator;
            if (!meaVar.hasNext()) {
                return null;
            }
            Pair pair = (Pair) meaVar.next();
            iIntValue = ((Number) pair.a).intValue();
            nf2Var = (nf2) pair.b;
        } while ((inputType & iIntValue) != iIntValue);
        return nf2Var;
    }

    @Override // defpackage.u18
    public final boolean l(Object obj, File file, trf trfVar) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        jl6 jl6Var = (jl6) this.b;
        byte[] bArr = (byte[]) jl6Var.i(byte[].class, 65536);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, i);
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    jl6Var.o(bArr);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    jl6Var.o(bArr);
                    throw th;
                }
            }
            fileOutputStream2.close();
            try {
                fileOutputStream2.close();
            } catch (IOException unused4) {
            }
            jl6Var.o(bArr);
            return true;
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final int m() {
        f fVar = (f) this.b;
        return fVar.getWidth() - fVar.getPaddingRight();
    }

    public final p1j n(oml omlVar, Object obj) {
        boolean zIsEmpty;
        q1j q1jVar = new q1j(omlVar, obj);
        synchronized (((ArrayDeque) this.b)) {
            zIsEmpty = ((ArrayDeque) this.b).isEmpty();
            ((ArrayDeque) this.b).add(q1jVar);
        }
        if (zIsEmpty) {
            o();
        }
        return new p1j(this, q1jVar);
    }

    public final void o() {
        synchronized (((ArrayDeque) this.b)) {
            q1j q1jVar = (q1j) ((ArrayDeque) this.b).peek();
            if (q1jVar == null) {
                return;
            }
            q1jVar.a.a(q1jVar.b, new jri(this, q1jVar, (byte) 6));
        }
    }

    public final void onAdClicked() {
        npf npfVar = (npf) ((x79) this.b).e;
        npfVar.a("loadAd: onAdClicked");
        MediationBannerAdCallback mediationBannerAdCallback = npfVar.c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    public final void onAdLoaded(Object obj) {
        switch (this.a) {
            case 4:
                npf npfVar = (npf) ((x79) this.b).e;
                npfVar.a("loadAd: onAdLoaded, refresh=" + ((q13) obj).a);
                if (npfVar.c == null) {
                    npfVar.c = (MediationBannerAdCallback) npfVar.a.onSuccess(npfVar);
                    break;
                }
                break;
            default:
                qpf qpfVar = (qpf) ((ghf) this.b).d;
                qpfVar.a("loadAd: onAdLoaded");
                qpfVar.e = (i2i) obj;
                qpfVar.d = (MediationRewardedAdCallback) qpfVar.b.onSuccess(qpfVar);
                break;
        }
    }

    public final SpannableStringBuilder p(String str) {
        String str2;
        wh5 wh5Var = (wh5) this.b;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        k1j k1jVarA = t1j.a(new pkl(str, null));
        while (k1jVarA.hasNext()) {
            mkl mklVar = (okl) k1jVarA.next();
            if (mklVar != null) {
                if (mklVar instanceof mkl) {
                    mkl mklVar2 = mklVar;
                    String str3 = mklVar2.a;
                    if (!mklVar2.b) {
                        ril rilVarB = wh5Var.b(str3, spannableStringBuilder);
                        if (!(rilVarB instanceof ril)) {
                            if (rilVarB.equals(sil.a)) {
                                qp2.o(p3p.w("Unhandled start tag ", str3, " in text ", str));
                                return null;
                            }
                            h9o.p();
                            return null;
                        }
                        if (rilVarB.a) {
                            arrayList.add(str3);
                        }
                    } else {
                        if (!str3.equalsIgnoreCase((String) CollectionsKt.R(arrayList))) {
                            bxl.d(p3p.w("End tag ", str3, " with no corresponding start tag in text ", str));
                            return null;
                        }
                        arrayList.remove(arrayList.size() - 1);
                        if (!wh5Var.a(str3, spannableStringBuilder)) {
                            bxl.d(p3p.w("Unhandled end tag ", str3, " in text ", str));
                            return null;
                        }
                    }
                } else if (mklVar instanceof nkl) {
                    spannableStringBuilder.append((CharSequence) ((nkl) mklVar).a);
                }
            }
            h9o.p();
            return null;
        }
        q1i it = new r1i(arrayList).iterator();
        do {
            ListIterator listIterator = (ListIterator) it.b;
            if (!listIterator.hasPrevious()) {
                return spannableStringBuilder;
            }
            str2 = (String) listIterator.previous();
        } while (wh5Var.a(str2, spannableStringBuilder));
        bxl.d(p3p.w("Unhandled end tag ", str2, " in text ", str));
        return null;
    }

    public final g4h q(String str) {
        if (axn.q.a()) {
            return new g4h((ProfileBoundaryInterface) fr3.m(ProfileBoundaryInterface.class, ((ProfileStoreBoundaryInterface) this.b).getOrCreateProfile(str)));
        }
        throw axn.a();
    }

    public final Pattern r(String str) {
        Object obj;
        isd isdVar = (isd) this.b;
        synchronized (isdVar) {
            obj = ((yp9) isdVar.b).get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern != null) {
            return pattern;
        }
        Pattern patternCompile = Pattern.compile(str);
        isd isdVar2 = (isd) this.b;
        synchronized (isdVar2) {
            ((yp9) isdVar2.b).put(str, patternCompile);
        }
        return patternCompile;
    }

    public final void t(int i, int i2) {
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        switch (this.a) {
            case 23:
                ((wzj) this.b).b.V(z ? 1 : 0, "speed_dial.large_icons");
                break;
            default:
                ((v7k) this.b).I0().b.V(z ? 1 : 0, "speed_dial.enabled");
                break;
        }
    }

    public final View w(int i) {
        return ((f) this.b).getChildAt(i);
    }

    public final o94 y(Object obj) {
        xug.i();
        return k1g.z(new mgf((Object) this, obj, (byte) 2));
    }
}
