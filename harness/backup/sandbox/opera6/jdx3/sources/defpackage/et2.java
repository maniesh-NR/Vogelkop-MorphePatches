package defpackage;

import J.N;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.content.browser.ChildProcessLauncherHelperImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class et2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ et2(c0l c0lVar, String str) {
        this.a = (byte) 4;
        this.b = str;
    }

    public /* synthetic */ et2(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                N.MP0_t_nz(str);
                break;
            case 1:
                N.Mk6fI$HM(str);
                break;
            case 2:
                rl rlVar = ChildProcessLauncherHelperImpl.l;
                N.MmS4zlEt(veg.b(str));
                break;
            case 3:
                am2.v(ay3.a(str, lqm.d, true));
                break;
            case 4:
                jag jagVarF = s9g.h.f(str, false);
                if (jagVarF == null) {
                    rmj.a.k(str);
                    break;
                } else {
                    lag lagVar = lag.b;
                    if (Intrinsics.a(jagVarF.b(lagVar), Boolean.TRUE)) {
                        kag kagVarA = jagVarF.a(lagVar, (kag) null);
                        int i = kagVarA == null ? -1 : b0l.a[kagVarA.ordinal()];
                        if (i != -1) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        h9o.p();
                                        break;
                                    }
                                }
                            } else {
                                rmj.a.j(System.currentTimeMillis(), true, str);
                                break;
                            }
                        }
                        rmj.a.k(str);
                        break;
                    } else {
                        rmj.a.k(str);
                        break;
                    }
                }
                break;
            case 5:
                ikp ikpVar = sjo.d;
                Pair pair = new Pair(str, Long.valueOf((System.currentTimeMillis() + 1800000) / 1000));
                ArrayList arrayList = ikpVar.a;
                arrayList.add(pair);
                int size = arrayList.size();
                int i2 = ikpVar.b;
                if (size > i2) {
                    int size2 = arrayList.size();
                    arrayList.subList(0, arrayList.size() - i2).clear();
                    if (size2 >= (i2 << 1)) {
                        arrayList.trimToSize();
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (Pair pair2 : Collections.unmodifiableList(ikpVar.a)) {
                    sb.append((String) pair2.first);
                    sb.append("ExpireTimestamp");
                    sb.append(pair2.second);
                    sb.append("PlaceHolder");
                }
                String string = sb.toString();
                sjo.j("missingUrls", string.substring(0, string.lastIndexOf("PlaceHolder")));
                break;
            case 6:
                File fileT = vtp.t(str);
                if (fileT != null && fileT.exists()) {
                    gxo.a(new fmn((Object) str, (Object) new roj(str, fileT, (byte) 26), (byte) 19));
                    break;
                }
                break;
            default:
                List list = sjo.a;
                String strK = sjo.k((Context) phf.a.a, "geoCountryCode");
                if (TextUtils.isEmpty(strK) || !TextUtils.equals(str, strK)) {
                    sjo.j("geoCountryCode", str);
                    break;
                }
                break;
        }
    }
}
