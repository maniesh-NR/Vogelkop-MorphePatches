package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public final class ec3 extends o53 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ec3(k73 k73Var, byte b) {
        super(k73Var);
        this.b = b;
    }

    @Override // defpackage.go5
    public final boolean c(h5o h5oVar) {
        switch (this.b) {
            case 0:
                return h5oVar.j.c;
            case 1:
                return h5oVar.j.e;
            case 2:
                return h5oVar.j.a == 2;
            case 3:
                int i = h5oVar.j.a;
                if (i != 3) {
                    return Build.VERSION.SDK_INT >= 30 && i == 6;
                }
                return true;
            default:
                return h5oVar.j.f;
        }
    }

    @Override // defpackage.o53
    public final int d() {
        switch (this.b) {
            case 0:
                return 6;
            case 1:
                return 5;
            case 2:
            case 3:
                return 7;
            default:
                return 9;
        }
    }

    @Override // defpackage.o53
    public final boolean e(Object obj) {
        boolean zBooleanValue;
        switch (this.b) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                toe toeVar = (toe) obj;
                return (toeVar.a && toeVar.b) ? false : true;
            case 3:
                toe toeVar2 = (toe) obj;
                return !toeVar2.a || toeVar2.c;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
