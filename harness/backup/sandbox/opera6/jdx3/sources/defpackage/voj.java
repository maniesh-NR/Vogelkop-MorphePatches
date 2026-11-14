package defpackage;

import com.leanplum.utils.SizeUtil;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class voj implements Function2 {
    public final /* synthetic */ byte a;

    public /* synthetic */ voj(byte b) {
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = 0;
        switch (this.a) {
            case 0:
                ((qoj) obj).b.e(new d01(), false);
                return Unit.a;
            case 1:
                ((qoj) obj).b.e(new zl8(), false);
                return Unit.a;
            case 2:
                ((qoj) obj).a(2132020583, lag.d);
                return Unit.a;
            case 3:
                ((qoj) obj).a(2132020447, lag.h);
                return Unit.a;
            case 4:
                ((qoj) obj).b.e(new moj(), false);
                return Unit.a;
            case 5:
                ((rj) ((qoj) obj).c.get()).b.e(ij.a, false);
                return Unit.a;
            case 6:
                zhj.a(new vyl(), 4099).c(((syl) ((qoj) obj).d.get()).a);
                return Unit.a;
            case 7:
                ((g0c) ((qoj) obj).e.get()).a(new int[0]);
                return Unit.a;
            case 8:
                ((qoj) obj).a(2132021549, lag.c);
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((qoj) obj).a(2132019549, lag.i);
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((qoj) obj).a(2132021553, lag.b);
                return Unit.a;
            case 11:
                ((qoj) obj).a(2132021539, lag.f);
                return Unit.a;
            case 12:
                ((qoj) obj).a(2132021552, lag.e);
                return Unit.a;
            case 13:
                ((qoj) obj).b.e(new ido(), false);
                return Unit.a;
            case 14:
                int[] iArr = (int[]) obj2;
                ((g8j) ((d8j) obj)).i(Arrays.copyOf(iArr, iArr.length));
                return Unit.a;
            case 15:
                k6k k6kVar = (k6k) obj;
                k6k k6kVar2 = (k6k) obj2;
                List list = d6k.d;
                Iterator it = list.iterator();
                int i3 = 0;
                while (true) {
                    i = -1;
                    if (!it.hasNext()) {
                        i3 = -1;
                    } else if (((e6k) it.next()) != k6kVar.a) {
                        i3++;
                    }
                }
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((e6k) it2.next()) == k6kVar2.a) {
                            i = i2;
                        } else {
                            i2++;
                        }
                    }
                }
                return Integer.valueOf(Intrinsics.b(i3, i));
            case 16:
                int[] iArr2 = (int[]) obj2;
                ((g8j) ((d8j) obj)).j(c8j.b, Arrays.copyOf(iArr2, iArr2.length));
                return Unit.a;
            case 17:
                ((Integer) obj2).getClass();
                kfo.r((ih5) obj, aoh.m(1));
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                l0a l0aVar = (l0a) obj2;
                if (((hv7) obj).d == null) {
                    l0aVar.getClass();
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                int[] iArr3 = (int[]) obj2;
                ((kxk) ((hxk) obj)).a(Arrays.copyOf(iArr3, iArr3.length));
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                return Integer.valueOf(Intrinsics.b(((w6l) obj).a(), ((w6l) obj2).a()));
            case 21:
                return new fo8((fvl) obj, (qp3) obj2);
            case SizeUtil.textSize1 /* 22 */:
                return Integer.valueOf(((pfd) obj).E(((Integer) obj2).intValue()));
            case 23:
                return Integer.valueOf(((pfd) obj).J(((Integer) obj2).intValue()));
            case SizeUtil.textSize2 /* 24 */:
                return Integer.valueOf(((pfd) obj).z(((Integer) obj2).intValue()));
            case 25:
                return Integer.valueOf(((pfd) obj).c(((Integer) obj2).intValue()));
            case 26:
                vhl vhlVar = (vhl) obj2;
                return Arrays.asList(Float.valueOf(vhlVar.a.h()), Boolean.valueOf(((fsf) vhlVar.f.getValue()) == fsf.a));
            case 27:
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!(element instanceof dml)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? element : Integer.valueOf(iIntValue + 1);
            case 28:
                dml dmlVar = (dml) obj;
                dml dmlVar2 = (CoroutineContext.Element) obj2;
                if (dmlVar != null) {
                    return dmlVar;
                }
                if (dmlVar2 instanceof dml) {
                    return dmlVar2;
                }
                return null;
            default:
                lml lmlVar = (lml) obj;
                dml dmlVar3 = (CoroutineContext.Element) obj2;
                if (dmlVar3 instanceof dml) {
                    dml dmlVar4 = dmlVar3;
                    CoroutineContext coroutineContext = lmlVar.a;
                    Object objUpdateThreadContext = dmlVar4.updateThreadContext();
                    Object[] objArr = lmlVar.b;
                    int i4 = lmlVar.d;
                    objArr[i4] = objUpdateThreadContext;
                    dml[] dmlVarArr = lmlVar.c;
                    lmlVar.d = i4 + 1;
                    dmlVarArr[i4] = dmlVar4;
                }
                return lmlVar;
        }
    }
}
