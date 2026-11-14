package defpackage;

import com.opera.android.bubbleview.BubbleView;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final /* synthetic */ class xz3 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ short b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public /* synthetic */ xz3(BubbleView bubbleView, long j, Runnable runnable) {
        this.c = bubbleView;
        this.b = (int) j;
        this.d = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ xz3(p7p p7pVar, int i, String str) {
        this.c = p7pVar;
        this.b = i;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                long j = this.b;
                int i = BubbleView.D;
                ((BubbleView) obj2).a((Runnable) obj, j);
                break;
            default:
                p7p p7pVar = (p7p) obj2;
                voo vooVar = p7pVar.a;
                String str = vooVar.c;
                String str2 = vooVar.b.a;
                String str3 = vooVar.j;
                String strA = d1p.e().a();
                Boolean boolValueOf = Boolean.valueOf(d1p.e().c);
                short s = this.b;
                r5p r5pVar = new r5p(s, boolValueOf, str, str2, str3, strA, (String) obj);
                if (s != 9010 && s != 9011) {
                    switch (s) {
                        case 1003:
                        case 1004:
                            p7p.e(r5pVar, null, p7p.c);
                            break;
                        case 1005:
                        case 1006:
                            break;
                        default:
                            switch (s) {
                                case 1010:
                                case 1011:
                                case 1012:
                                case 1013:
                                case 1014:
                                case 1015:
                                case 1016:
                                case 1017:
                                case 1018:
                                case 1019:
                                    break;
                                default:
                                    switch (s) {
                                        case 9105:
                                        case 9106:
                                        case 9107:
                                            break;
                                        default:
                                            p8p.a(r5pVar);
                                            break;
                                    }
                            }
                    }
                    p7p.e(r5pVar, null, p7pVar.b);
                    break;
                } else {
                    String str4 = r5pVar.i + ":error:" + ((int) s);
                    LinkedHashSet linkedHashSet = p7p.d;
                    if (linkedHashSet.add(str4)) {
                        p8p.a(r5pVar);
                    }
                    p7p.c(str4, null, linkedHashSet);
                    break;
                }
                break;
        }
    }
}
