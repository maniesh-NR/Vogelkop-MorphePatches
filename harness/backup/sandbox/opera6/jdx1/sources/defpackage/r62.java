package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public class r62 extends q59 {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r62(ekc ekcVar, Callback callback, byte b) {
        super(ekcVar, callback);
        this.e = b;
    }

    public boolean a(Object obj) {
        switch (this.e) {
            case 0:
                u42 u42Var = (u42) obj;
                y42 y42Var = u42Var != null ? u42Var.a : null;
                int i = y42Var == null ? -1 : q62.a[y42Var.ordinal()];
                if (i != -1) {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            if (i != 4) {
                                h9o.p();
                            } else {
                                qp2.o("");
                            }
                        }
                    }
                    break;
                }
                break;
            case 1:
                if (obj == null) {
                    break;
                }
                break;
            default:
                if (((m18) obj) != m18.b) {
                    break;
                }
                break;
        }
        return false;
    }
}
