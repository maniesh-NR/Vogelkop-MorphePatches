package defpackage;

import android.text.TextUtils;
import com.opera.android.favorites.g;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ei2 implements mr8 {
    public String a;
    public boolean b;

    public ei2(byte b, String str, boolean z) {
        switch (b) {
            case 2:
                this.a = str.toLowerCase(Locale.US);
                this.b = z;
                break;
            default:
                this.a = str;
                this.b = z;
                break;
        }
    }

    public /* synthetic */ ei2(boolean z, String str) {
        this.b = z;
        this.a = str;
    }

    @Override // defpackage.mr8
    public final boolean d(hq8 hq8Var) {
        String str = this.a;
        if (!this.b && (hq8Var instanceof g)) {
            return false;
        }
        String lowerCase = hq8Var.i(p6l.a).toLowerCase(Locale.US);
        if ((!wqm.F(str, false) || !lowerCase.startsWith(str)) && (!str.startsWith("www") || !wqm.G(lowerCase).startsWith(str))) {
            String[] strArr = aik.a;
            String strS = aik.s(lowerCase, strArr);
            if (TextUtils.isEmpty(strS) || !strS.startsWith(str)) {
                if (str.length() >= 3) {
                    String strS2 = aik.s(lowerCase, strArr);
                    int iIndexOf = strS2.indexOf(63);
                    if (iIndexOf >= 0) {
                        strS2 = strS2.substring(0, iIndexOf);
                    }
                    String[] strArrSplit = TextUtils.isEmpty(strS2) ? new String[0] : strS2.split("/");
                    for (int i = 1; i < strArrSplit.length; i++) {
                        if (!strArrSplit[i].startsWith(str)) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }
}
