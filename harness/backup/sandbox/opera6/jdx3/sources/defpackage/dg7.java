package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.w;
import androidx.media3.ui.PlayerView;
import com.appsflyer.internal.j;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.bookmarks.h;
import com.opera.android.downloads.DownloadService;
import com.opera.api.Callback;
import java.io.File;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.crypto.NoSuchPaddingException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class dg7 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dg7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte b = this.a;
        int i = 0;
        z = false;
        boolean z = false;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                boolean z2 = DownloadService.e;
                ((DownloadService) obj2).b((Notification) obj, 2131362541);
                break;
            case 1:
                igi igiVar = (igi) obj2;
                HashSet hashSet = (HashSet) igiVar.e;
                hashSet.clear();
                hashSet.addAll((Set) obj);
                kg7 kg7Var = (kg7) igiVar.g;
                if (kg7Var != null) {
                    hashSet.add(kg7Var);
                }
                igiVar.I0();
                break;
            case 2:
                HashMap map = (HashMap) obj2;
                pne pneVar = (pne) obj;
                List list = pneVar.c;
                String str = pneVar.a;
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = pneVar.c.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new mq4(str, new String[]{sko.j("sha256/", (String) it.next())}[0]));
                    }
                    map.put(str, new nq4(CollectionsKt.n0(arrayList), (CertificateChainCleaner) null));
                    break;
                }
                break;
            case 3:
                ua7 ua7Var = (ua7) obj2;
                ua7Var.c = ap7.a;
                ((zo7) ua7Var.d).a.r(bp7.b);
                break;
            case 4:
                ss7 ss7Var = (ss7) obj2;
                ml3 ml3Var = (ml3) obj;
                ml3 ml3Var2 = ss7Var.B;
                if (ml3Var2 != ml3Var) {
                    if (ml3Var2 != null) {
                        ss7Var.z = true;
                    }
                    ss7Var.B = ml3Var;
                    ss7Var.C = qm3.a(ml3Var, ((h) ss7Var.A).o());
                    ss7Var.P0();
                    break;
                }
                break;
            case 5:
                hd hdVar = (hd) obj2;
                int iOrdinal = ((dy1) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        h9o.p();
                        break;
                    } else {
                        joh.h((ysj) hdVar.d, new rxh(2132020435));
                        break;
                    }
                }
                break;
            case 6:
                ((aw7) obj2).l0(false);
                break;
            case 7:
                ((vp2) obj2).l(((Boolean) obj).booleanValue());
                break;
            case 8:
                s28 s28Var = (s28) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) s28Var.b.get();
                byte[] bArrD = ((c36) ((t1) s28Var.f).get()).d((byte[]) obj);
                if (bArrD != null) {
                    j.c(sharedPreferences, "k2", Base64.encodeToString(bArrD, 2));
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((yz5) obj2).finish(hjm.a);
                vx3 vx3VarA = ay3.a("https://support-vpn-pro.opera.com/", lqm.v, false);
                vx3VarA.b = 3;
                o18.t(vx3VarA, true, vx3VarA);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                float fFloatValue = ((Float) obj).floatValue();
                float fS = cs5.s(fFloatValue, 0.0f, 1.0f);
                nj8 nj8Var = (nj8) ((vl6) obj2).c;
                nj8Var.n0(fS);
                nj8Var.U(Math.abs(cs5.s(fFloatValue, -1.0f, 0.0f)));
                break;
            case 11:
                ((dm8) obj2).r.e(new c9g((String) obj), false);
                break;
            case 12:
                ((qmj) obj2).J((String) obj);
                break;
            case 13:
                ((s9i) obj2).k0(((Boolean) obj).booleanValue());
                break;
            case 14:
                ((cv8) obj2).B.a = ((Boolean) obj).booleanValue();
                break;
            case 15:
                ((iw8) obj2).w();
                break;
            case 16:
                xw8 xw8Var = (xw8) obj2;
                xw8Var.h.b0((Collection) obj);
                xw8Var.a();
                break;
            case 17:
                bx8 bx8Var = (bx8) obj2;
                xw8 xw8Var2 = (xw8) obj;
                bx8Var.getClass();
                xw8Var2.c(true);
                hx8 hx8Var = bx8Var.m;
                bwf bwfVar = xw8Var2.b;
                hx8Var.getClass();
                if (bwfVar.a().equals("topnews")) {
                    hx8Var.c(null);
                    break;
                }
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                Boolean bool = (Boolean) obj;
                PlayerView playerView = ((kx8) obj2).s;
                if (playerView != null) {
                    playerView.setKeepScreenOn(bool.booleanValue());
                    break;
                }
                break;
            case 19:
                c59 c59Var = (c59) obj2;
                m59 m59Var = c59Var.b;
                if (m59Var == null) {
                    m59Var = new m59(c59Var.b(), c59Var.c.e, c59Var.h, c59Var);
                    c59Var.b = m59Var;
                }
                if (!c59Var.e) {
                    c59Var.a(m59Var);
                }
                Boolean bool2 = c59Var.j;
                if (bool2 != null) {
                    boolean zBooleanValue = bool2.booleanValue();
                    c59Var.j = null;
                    c59Var.f(zBooleanValue);
                    break;
                }
                break;
            case SizeUtil.textSize0 /* 20 */:
                Context context = ((View) obj).getContext();
                w parentFragmentManager = ((p99) obj2).getParentFragmentManager();
                String[] strArr = {"flow-scan-intro", "flow-generate", "flow-code-verification", "two-factor-authentication"};
                int i2 = 0;
                while (true) {
                    if (i2 < 4) {
                        String str2 = strArr[i2];
                        if (parentFragmentManager.F(str2) != null) {
                            parentFragmentManager.V(1, str2);
                        } else {
                            i2++;
                        }
                    } else {
                        parentFragmentManager.U();
                    }
                }
                BrowserActivity browserActivityO = q9n.o(context);
                if (browserActivityO != null) {
                    ((kxk) ((hxk) browserActivityO.g0.E(hxk.class))).a(new int[0]);
                    break;
                }
                break;
            case 21:
                rc9 rc9Var = (rc9) obj2;
                Boolean bool3 = (Boolean) obj;
                rc9Var.g = null;
                ArrayList arrayList2 = rc9Var.f;
                ArrayList arrayList3 = new ArrayList(arrayList2);
                arrayList2.clear();
                int size = arrayList3.size();
                while (i < size) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    ((Callback) obj3).run(bool3);
                }
                break;
            case SizeUtil.textSize1 /* 22 */:
                ((xc9) obj2).b.K();
                break;
            case 23:
                ((CancellationSignal) obj2).cancel();
                break;
            case SizeUtil.textSize2 /* 24 */:
                jd9 jd9Var = (jd9) obj2;
                if (((Boolean) obj).booleanValue()) {
                    new p99().w0(jd9Var.getActivity());
                    break;
                }
                break;
            case 25:
                hu5 hu5Var = (hu5) obj2;
                if (hu5Var != null) {
                    hu5Var.run(Boolean.FALSE);
                    break;
                }
                break;
            case 26:
                ((pc9) obj2).f(Long.MIN_VALUE, "", "", "", null, "", "", false);
                break;
            case 27:
                b2l b2lVar = (b2l) obj;
                MenuItem menuItem = (MenuItem) ((c37) obj2).b;
                if (b2lVar != null && ((d7l) b2lVar).n()) {
                    z = true;
                }
                menuItem.setEnabled(z);
                break;
            case 28:
                hu9 hu9Var = (hu9) obj2;
                String str3 = (String) obj;
                if (str3 == null) {
                    hu9Var.g("Server error", false, true);
                    break;
                } else if (TextUtils.isEmpty(str3)) {
                    hu9Var.g("No fill", true, false);
                    break;
                } else {
                    try {
                        ArrayList arrayListH = hu9Var.h(str3);
                        if (!arrayListH.isEmpty()) {
                            iu9 iu9Var = hu9Var.l;
                            iu9Var.x = true;
                            iu9Var.w = hu9Var.k;
                            hu9Var.e(arrayListH);
                            break;
                        } else {
                            hu9Var.g("No fill", true, false);
                            break;
                        }
                    } catch (UnsupportedOperationException | JSONException e) {
                        hu9Var.g(e.getMessage(), false, false);
                        return;
                    }
                }
            default:
                tah tahVar = (tah) obj2;
                ly1 ly1Var = (ly1) obj;
                if ((ly1Var != null ? ly1Var.b : null) == null) {
                    joh.h((ysj) ((f0a) tahVar.g).a.getValue(), new rxh(2132019200));
                    break;
                } else {
                    tahVar.getClass();
                    String strValueOf = String.valueOf(System.currentTimeMillis());
                    Uri uri = ly1Var.a;
                    o29 o29Var = ly1Var.d;
                    String str4 = ly1Var.b;
                    String str5 = ly1Var.c;
                    if (o29Var != o29.IMAGE) {
                        zz9 zz9Var = new zz9(o29Var, null, strValueOf);
                        tahVar.c(zz9Var);
                        File fileR = tahVar.r(strValueOf, str5);
                        new rml(Unit.a, (umi) tahVar.c).a(new ry7(tahVar, new py1(uri, fileR), (byte) 15)).t(new tu7((Object) new pr3(tahVar, zz9Var, strValueOf, fileR, o29Var, str4, (byte) 1), (byte) 18)).l();
                        break;
                    } else {
                        tahVar.a(uri, String.valueOf(System.currentTimeMillis()));
                        break;
                    }
                }
        }
    }
}
