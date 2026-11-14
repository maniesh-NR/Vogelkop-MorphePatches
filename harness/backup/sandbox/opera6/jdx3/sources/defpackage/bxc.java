package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class bxc {
    public final String a;
    public final SparseArray b;

    public bxc(String str, SparseArray sparseArray) {
        this.a = str;
        this.b = sparseArray;
    }

    public final String a(int i, Context context) throws Resources.NotFoundException {
        String str = (String) this.b.get(i);
        if (!TextUtils.isEmpty(str)) {
            String string = context.getResources().getString(2132019347);
            String str2 = this.a;
            if (!string.equals(str2)) {
                int iIndexOf = string.indexOf(45);
                if (iIndexOf >= 0) {
                    string = string.substring(0, iIndexOf);
                }
                if (!string.equals(str2)) {
                    return null;
                }
            }
        }
        return str;
    }
}
