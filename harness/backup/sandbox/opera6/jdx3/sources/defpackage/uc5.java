package defpackage;

import android.util.Size;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class uc5 implements Comparator {
    public final /* synthetic */ byte a;
    public final boolean b;

    public /* synthetic */ uc5(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        boolean z = this.b;
        switch (b) {
            case 0:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                int iSignum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
                return z ? iSignum * (-1) : iSignum;
            default:
                qvb qvbVar = (qvb) obj;
                qvb qvbVar2 = (qvb) obj2;
                int i = qvbVar.c;
                int i2 = qvbVar.b;
                int i3 = qvbVar2.c;
                int i4 = qvbVar2.b;
                if (i < i3) {
                    return -1;
                }
                if (i > i3) {
                    return 1;
                }
                return z ? Integer.compare(i4, i2) : Integer.compare(i2, i4);
        }
    }
}
