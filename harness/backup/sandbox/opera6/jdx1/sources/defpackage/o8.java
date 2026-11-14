package defpackage;

/* loaded from: classes.dex */
public final class o8 extends k8 {
    public static o8 o;

    public final int[] R(int i) {
        String str = (String) ((k8) this).a;
        if (str == null) {
            str = null;
        }
        int length = str.length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length) {
            String str2 = (String) ((k8) this).a;
            if (str2 == null) {
                str2 = null;
            }
            if (str2.charAt(i) != '\n' || t0(i)) {
                break;
            }
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !s0(i2)) {
            i2++;
        }
        return V(i, i2);
    }

    public final int[] h0(int i) {
        String str = (String) ((k8) this).a;
        if (str == null) {
            str = null;
        }
        int length = str.length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0) {
            String str2 = (String) ((k8) this).a;
            if (str2 == null) {
                str2 = null;
            }
            if (str2.charAt(i - 1) != '\n' || s0(i)) {
                break;
            }
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && !t0(i2)) {
            i2--;
        }
        return V(i2, i);
    }

    public final boolean s0(int i) {
        if (i <= 0) {
            return false;
        }
        String str = (String) ((k8) this).a;
        if (str == null) {
            str = null;
        }
        if (str.charAt(i - 1) == '\n') {
            return false;
        }
        String str2 = (String) ((k8) this).a;
        if (str2 == null) {
            str2 = null;
        }
        if (i == str2.length()) {
            return true;
        }
        String str3 = (String) ((k8) this).a;
        return (str3 != null ? str3 : null).charAt(i) == '\n';
    }

    public final boolean t0(int i) {
        String str = (String) ((k8) this).a;
        if (str == null) {
            str = null;
        }
        if (str.charAt(i) == '\n') {
            return false;
        }
        if (i != 0) {
            String str2 = (String) ((k8) this).a;
            if ((str2 != null ? str2 : null).charAt(i - 1) != '\n') {
                return false;
            }
        }
        return true;
    }
}
