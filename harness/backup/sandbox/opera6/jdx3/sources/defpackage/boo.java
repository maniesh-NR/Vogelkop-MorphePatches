package defpackage;

import com.leanplum.internal.Constants;

/* loaded from: classes.dex */
public abstract class boo {
    public final String[] a = new String[Constants.Crypt.KEY_LENGTH];

    public boo() {
        for (char c = 0; c < 255; c = (char) (c + 1)) {
            if ((c < '0' || c > '9') && ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z'))) {
                this.a[c] = Integer.toHexString(c).intern();
            } else {
                this.a[c] = null;
            }
        }
    }

    public abstract Object a(sj2 sj2Var);

    public String b(String str) {
        StringBuilder sb = new StringBuilder();
        abp abpVar = new abp(str, (byte) 1);
        while (abpVar.f()) {
            Character chL = (Character) a(abpVar);
            if (chL == null) {
                chL = abpVar.l();
            }
            sb.append(chL);
        }
        return sb.toString();
    }
}
