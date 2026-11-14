package defpackage;

import com.opera.api.Callback;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class lw0 implements ekj, n5o, p9g {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Callback b;

    public /* synthetic */ lw0(Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    @Override // defpackage.ekj
    public final void b(hjm hjmVar) {
        this.b.run(hjmVar);
    }

    public final Object g(Object obj) {
        byte b = this.a;
        Callback callback = this.b;
        switch (b) {
            case 1:
                callback.run(obj);
                break;
            case 2:
                callback.run((c84) obj);
                break;
            case 3:
            default:
                callback.run((ilh) obj);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                callback.run((List) obj);
                break;
        }
        return null;
    }

    public final void k(int[] iArr, String[] strArr) {
        boolean z = false;
        if (iArr.length > 0 && iArr[0] == 0) {
            z = true;
        }
        this.b.run(Boolean.valueOf(z));
    }
}
