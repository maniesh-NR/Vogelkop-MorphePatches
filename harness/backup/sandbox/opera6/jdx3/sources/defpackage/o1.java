package defpackage;

import android.text.TextUtils;
import com.opera.android.siteicons.URLColorTable;
import java.util.Locale;

/* loaded from: classes.dex */
public final class o1 {
    public final /* synthetic */ byte a;
    public String b;
    public int c;
    public int d;

    public o1(int i, int i2, String str) {
        this.a = (byte) 0;
        this.c = i;
        this.d = i2;
        this.b = str;
    }

    public /* synthetic */ o1(String str, int i, int i2, byte b) {
        this.a = b;
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    public o1(String str, int i, int i2, int i3, long j) {
        this.a = (byte) 5;
        this.b = str;
        this.d = i;
        this.c = i2;
    }

    public final mf3 a() {
        mf3 mf3Var = new mf3();
        mf3Var.a = this.c;
        mf3Var.b = this.d;
        mf3Var.c = this.b;
        return mf3Var;
    }

    public final void b(String str) {
        String[] strArr = wqm.a;
        String strS = aik.s(str, aik.a);
        String[] strArr2 = wqm.c;
        int i = 0;
        while (true) {
            if (i >= 2) {
                break;
            }
            String str2 = strArr2[i];
            if (strS.startsWith(str2)) {
                String strSubstring = strS.substring(str2.length());
                if (strSubstring.contains(".")) {
                    strS = strSubstring;
                }
            } else {
                i++;
            }
        }
        oa5 oa5VarA = URLColorTable.a(str);
        this.c = oa5VarA.a;
        this.d = oa5VarA.b;
        this.b = TextUtils.isEmpty(strS) ? "-" : strS.substring(0, 1).toUpperCase(Locale.getDefault());
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                return this.b + ":" + this.c + ":" + this.d;
            default:
                return super.toString();
        }
    }
}
