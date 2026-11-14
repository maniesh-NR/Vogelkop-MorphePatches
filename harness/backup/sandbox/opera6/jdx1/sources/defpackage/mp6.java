package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class mp6 implements fn8 {
    public static final int[] e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final z8b f = new z8b(new cl6((byte) 25));
    public static final z8b g = new z8b(new cl6((byte) 26));
    public csh a;
    public r16 b = new r16();
    public boolean c;
    public boolean d;

    public final void a(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new n7());
                break;
            case 1:
                arrayList.add(new p7());
                break;
            case 2:
                arrayList.add(new oz(0));
                break;
            case 3:
                arrayList.add(new r01());
                break;
            case 4:
                cn8 cn8VarC = f.C(0);
                if (cn8VarC == null) {
                    arrayList.add(new s69());
                    break;
                } else {
                    arrayList.add(cn8VarC);
                    break;
                }
            case 5:
                arrayList.add(new hf9());
                break;
            case 6:
                arrayList.add(new efd(this.b, 0));
                break;
            case 7:
                arrayList.add(new vae(0));
                break;
            case 8:
                r16 r16Var = this.b;
                a1b a1bVar = h1b.b;
                arrayList.add(new wn9(r16Var, 0, null, csh.e, null));
                arrayList.add(new bbe(this.b, 0));
                break;
            case 9:
                arrayList.add(new l9f());
                break;
            case 10:
                arrayList.add(new u8h());
                break;
            case 11:
                if (this.a == null) {
                    a1b a1bVar2 = h1b.b;
                    this.a = csh.e;
                }
                arrayList.add(new p7m(1, 0, this.b, new pql(0L), new gl(0, (List) this.a)));
                break;
            case 12:
                arrayList.add(new vnn());
                break;
            case 14:
                arrayList.add(new tt6(this.c ? 1 : 0));
                break;
            case 15:
                cn8 cn8VarC2 = g.C(new Object[0]);
                if (cn8VarC2 != null) {
                    arrayList.add(cn8VarC2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new tv2(0, this.b));
                break;
            case 17:
                arrayList.add(new sk3((byte) 1));
                break;
            case 18:
                arrayList.add(new wv2((byte) 1));
                break;
            case 19:
                arrayList.add(new sk3((byte) 0));
                break;
            case 20:
                arrayList.add(new v9a(this.d ? 1 : 0));
                break;
            case 21:
                arrayList.add(new wv2((byte) 0));
                break;
        }
    }

    public final synchronized cn8[] createExtractors() {
        return f(Uri.EMPTY, new HashMap());
    }

    public final synchronized cn8[] f(Uri uri, Map map) {
        ArrayList arrayList;
        int[] iArr = e;
        arrayList = new ArrayList(21);
        List list = (List) map.get("Content-Type");
        int iO = y9m.O((list == null || list.isEmpty()) ? null : (String) list.get(0));
        if (iO != -1) {
            a(iO, arrayList);
        }
        int iP = y9m.P(uri);
        if (iP != -1 && iP != iO) {
            a(iP, arrayList);
        }
        for (int i = 0; i < 21; i++) {
            int i2 = iArr[i];
            if (i2 != iO && i2 != iP) {
                a(i2, arrayList);
            }
        }
        return (cn8[]) arrayList.toArray(new cn8[0]);
    }
}
