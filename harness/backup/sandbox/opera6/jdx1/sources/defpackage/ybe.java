package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class ybe implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x79 b;

    public /* synthetic */ ybe(x79 x79Var, byte b) {
        this.a = b;
        this.b = x79Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final Object invoke() {
        byte b = this.a;
        float fB = 0.0f;
        uzf uzfVar = null;
        int i = 1;
        x79 x79Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) x79Var.e;
                if (!arrayList.isEmpty()) {
                    ?? r0 = arrayList.get(0);
                    float fB2 = ((uzf) r0).a.b();
                    int size = arrayList.size() - 1;
                    boolean z = r0;
                    if (1 <= size) {
                        while (true) {
                            Object obj = arrayList.get(i);
                            float fB3 = ((uzf) obj).a.b();
                            r0 = z;
                            if (Float.compare(fB2, fB3) < 0) {
                                r0 = obj;
                                fB2 = fB3;
                            }
                            if (i != size) {
                                i++;
                                z = r0;
                            }
                        }
                    }
                    uzfVar = r0;
                }
                uzf uzfVar2 = uzfVar;
                if (uzfVar2 != null) {
                    fB = uzfVar2.a.b();
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) x79Var.e;
                if (!arrayList2.isEmpty()) {
                    ?? r02 = arrayList2.get(0);
                    float fC = ((uzf) r02).a.i.c();
                    int size2 = arrayList2.size() - 1;
                    boolean z2 = r02;
                    if (1 <= size2) {
                        while (true) {
                            Object obj2 = arrayList2.get(i);
                            float fC2 = ((uzf) obj2).a.i.c();
                            r02 = z2;
                            if (Float.compare(fC, fC2) < 0) {
                                r02 = obj2;
                                fC = fC2;
                            }
                            if (i != size2) {
                                i++;
                                z2 = r02;
                            }
                        }
                    }
                    uzfVar = r02;
                }
                uzf uzfVar3 = uzfVar;
                if (uzfVar3 != null) {
                    fB = uzfVar3.a.i.c();
                    break;
                }
                break;
        }
        return Float.valueOf(fB);
    }
}
