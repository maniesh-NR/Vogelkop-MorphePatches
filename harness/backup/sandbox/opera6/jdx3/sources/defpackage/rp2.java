package defpackage;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class rp2 implements Comparator {
    public final /* synthetic */ byte a;
    public final Collator b;

    public rp2(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                Collator collator = Collator.getInstance(Locale.US);
                this.b = collator;
                collator.setStrength(0);
                break;
            default:
                Collator collator2 = Collator.getInstance(Locale.US);
                this.b = collator2;
                collator2.setStrength(0);
                break;
        }
    }

    public rp2(Collator collator) {
        this.a = (byte) 0;
        this.b = collator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        Collator collator = this.b;
        switch (b) {
            case 0:
                sp2 sp2Var = (sp2) obj;
                sp2 sp2Var2 = (sp2) obj2;
                int iCompare = collator.compare(sp2Var.b, sp2Var2.b);
                return iCompare == 0 ? sp2Var.a.compareTo(sp2Var2.a) : iCompare;
            case 1:
                return collator.compare(((tzb) obj).c, ((tzb) obj2).c);
            default:
                return collator.compare(((lbn) obj).b, ((lbn) obj2).b);
        }
    }
}
