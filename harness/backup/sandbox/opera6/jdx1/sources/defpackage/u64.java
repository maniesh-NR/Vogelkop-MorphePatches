package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u64 {
    public final int a;
    public final String b;
    public ArrayList c = null;
    public ArrayList d = null;

    public u64(int i, String str) {
        this.a = 0;
        this.b = null;
        this.a = i == 0 ? 1 : i;
        this.b = str;
    }

    public final void a(int i, String str, String str2) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.c = arrayList;
        }
        arrayList.add(new h64(str, i, str2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.a;
        if (i == 2) {
            sb.append("> ");
        } else if (i == 3) {
            sb.append("+ ");
        }
        String str = this.b;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        ArrayList arrayList = this.c;
        int i2 = 0;
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                h64 h64Var = (h64) obj;
                sb.append('[');
                String str2 = h64Var.a;
                String str3 = h64Var.c;
                sb.append(str2);
                int iA = vep.A(h64Var.b);
                if (iA == 1) {
                    sb.append('=');
                    sb.append(str3);
                } else if (iA == 2) {
                    sb.append("~=");
                    sb.append(str3);
                } else if (iA == 3) {
                    sb.append("|=");
                    sb.append(str3);
                }
                sb.append(']');
            }
        }
        ArrayList arrayList2 = this.d;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                sb.append(':');
                sb.append((k64) obj2);
            }
        }
        return sb.toString();
    }
}
