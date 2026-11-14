package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;

/* loaded from: classes.dex */
public final /* synthetic */ class l51 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ l51(ArrayList arrayList) {
        this.a = (byte) 8;
        mnj mnjVar = mnj.a;
        this.b = arrayList;
    }

    public /* synthetic */ l51(ArrayList arrayList, byte b) {
        this.a = b;
        this.b = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    public final Object invoke(Object obj) {
        hf0 hf0Var;
        byte b = this.a;
        boolean z = false;
        int i = 1;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                p1d p1dVar = (p1d) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    p1d.h(p1dVar, (ifg) arrayList.get(i2), 0, 0);
                }
                return Unit.a;
            case 1:
                p1d p1dVar2 = (p1d) obj;
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    p1d.h(p1dVar2, (ifg) arrayList.get(i3), 0, 0);
                }
                return Unit.a;
            case 2:
                int size3 = arrayList.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    ((File) obj2).delete();
                }
                return Unit.a;
            case 3:
                tb0 tb0VarC = ((ck0) obj).c();
                int size4 = arrayList.size();
                int i5 = 0;
                while (i5 < size4) {
                    Object obj3 = arrayList.get(i5);
                    i5++;
                    String str = (String) obj3;
                    tb0VarC.a.getClass();
                    zc0 zc0Var = new zc0(2443, -1, 2);
                    tb0VarC.b.B().add(zc0Var);
                    zc0Var.p(0, 1, 29L);
                    zc0Var.q(1, str == null ? 0 : 1, str);
                }
                return Unit.a;
            case 4:
                e66 e66Var = ((ck0) obj).i().a;
                List list = (List) e66Var.n(30);
                if (list == null || list.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    e66Var.q(30, 1, arrayList2);
                    hf0Var = new hf0(e66Var, 30, arrayList2);
                } else {
                    hf0Var = new hf0(e66Var, 30, list);
                }
                hf0Var.addAll(arrayList);
                return Unit.a;
            case 5:
                p1d p1dVar3 = (p1d) obj;
                int size5 = arrayList.size();
                int i6 = 0;
                while (i6 < size5) {
                    wfd wfdVar = (wfd) arrayList.get(i6);
                    ?? r7 = wfdVar.b;
                    boolean z2 = wfdVar.g;
                    if (wfdVar.k == Integer.MIN_VALUE) {
                        d8b.a("position() should be called first");
                    }
                    int size6 = r7.size();
                    for (?? r10 = z; r10 < size6; r10++) {
                        ifg ifgVar = (ifg) r7.get(r10);
                        int[] iArr = wfdVar.i;
                        int i7 = r10 << 1;
                        long jC = ybb.c((iArr[i7] << 32) | (iArr[i7 + i] & 4294967295L), wfdVar.c);
                        if (z2) {
                            p1d.r(p1dVar3, ifgVar, jC);
                        } else {
                            p1d.n(p1dVar3, ifgVar, jC);
                        }
                        i = 1;
                    }
                    i6++;
                    z = false;
                    i = 1;
                }
                return Unit.a;
            case 6:
                p1d p1dVar4 = (p1d) obj;
                int size7 = arrayList.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    p1d.l(p1dVar4, (ifg) arrayList.get(i8), 0, 0);
                }
                return Unit.a;
            case 7:
                p1d p1dVar5 = (p1d) obj;
                int size8 = arrayList.size();
                for (int i9 = 0; i9 < size8; i9++) {
                    p1d.f(p1dVar5, (ifg) arrayList.get(i9), 0, 0);
                }
                return Unit.a;
            case 8:
                mnj mnjVar = mnj.a;
                onj onjVar = (onj) obj;
                if (onjVar instanceof pnj) {
                    pnj pnjVar = (pnj) onjVar;
                    if (pnjVar.b.a == mnjVar) {
                        Function1 function1 = pnjVar.c;
                        if (function1 != null) {
                            arrayList.add(function1);
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return (CharSequence) arrayList.get(Integer.parseInt((String) ((MatchResult) obj).a().get(1)) - 1);
            default:
                arrayList.add((String) obj);
                return Unit.a;
        }
    }
}
