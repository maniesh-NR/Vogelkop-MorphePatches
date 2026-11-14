package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.leanplum.internal.Constants;
import com.opera.android.browser.chromium.ChromiumContent;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class qqe implements shj {
    public final ChromiumContent a;
    public final nw3 b;

    public qqe(ChromiumContent chromiumContent, nw3 nw3Var) {
        this.a = chromiumContent;
        this.b = nw3Var;
    }

    @Override // defpackage.shj
    public final boolean b(NavigationHandle navigationHandle, GURL gurl, boolean z, boolean z2) {
        uqe uqeVarC;
        msh mshVarE;
        lsh lshVarD;
        String strG = gurl.g();
        String[] strArr = wqm.a;
        if (strG != null && strG.startsWith("feed-news:")) {
            String strS = aik.s(strG.substring(12), aik.a);
            int iIndexOf = strS.indexOf(63);
            if (iIndexOf >= 0) {
                strS = strS.substring(0, iIndexOf);
            }
            String[] strArrSplit = TextUtils.isEmpty(strS) ? new String[0] : strS.split("/");
            if (strArrSplit.length >= 1) {
                if ("feedback".equals(strArrSplit[0])) {
                    Uri uri = Uri.parse(strG);
                    String strM = wqm.m(uri, "entry_id");
                    if (!TextUtils.isEmpty(strM) && (mshVarE = (uqeVarC = this.b.b.y().c()).e(strM, false)) != null) {
                        String str = strArrSplit[strArrSplit.length - 1];
                        if ("like".equals(str)) {
                            String strM2 = wqm.m(uri, Constants.Params.VALUE);
                            if (!TextUtils.isEmpty(strM2) && (lshVarD = lsh.d(strM2)) != null && ((lsh) mshVarE.e.get()) != lshVarD) {
                                mshVarE.c(lshVarD);
                                uy8 uy8Var = uqeVarC.h;
                                String str2 = lshVarD.a;
                                uy8Var.getClass();
                                if (mshVarE instanceof ure) {
                                    uy8Var.e(new gy8(mshVarE, str2, "web_page"));
                                    return true;
                                }
                                uy8Var.c(new gy8(mshVarE, str2, "web_page"));
                                return true;
                            }
                        } else if ("negative_feedback".equals(str)) {
                            f1p f1pVar = new f1p();
                            f1pVar.a = uqeVarC;
                            f1pVar.b = mshVarE;
                            i16 i16Var = new i16(this, uqeVarC, mshVarE, (byte) 26);
                            c37 c37Var = new c37();
                            c37Var.a = uqeVarC;
                            c37Var.b = mshVarE;
                            this.a.p.d(new xq3(null, k1g.y(mshVarE, f1pVar, i16Var, c37Var)));
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }
}
