package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class hef implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ nx5 c;
    public final /* synthetic */ u6c d;
    public final /* synthetic */ ndf e;
    public final /* synthetic */ agm f;
    public final /* synthetic */ Map g;
    public final /* synthetic */ fef h;
    public final /* synthetic */ afe i;

    public /* synthetic */ hef(int i, List list, nx5 nx5Var, u6c u6cVar, ndf ndfVar, agm agmVar, Map map, fef fefVar, afe afeVar) {
        this.a = i;
        this.b = list;
        this.c = nx5Var;
        this.d = u6cVar;
        this.e = ndfVar;
        this.f = agmVar;
        this.g = map;
        this.h = fefVar;
        this.i = afeVar;
    }

    public final Object invoke(Object obj) {
        w5f w5fVar = new w5f((byte) 6);
        final List list = this.b;
        final nx5 nx5Var = this.c;
        final u6c u6cVar = this.d;
        final ndf ndfVar = this.e;
        final agm agmVar = this.f;
        final Map map = this.g;
        final fef fefVar = this.h;
        final afe afeVar = this.i;
        h6c.Q((h6c) obj, this.a, w5fVar, new ue5(227642961, new dr9() { // from class: ief
            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                final int iIntValue = ((Integer) obj3).intValue();
                vt9 vt9Var = (ih5) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= vt9Var.d(iIntValue) ? 32 : 16;
                }
                vt9 vt9Var2 = vt9Var;
                if (vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    List list2 = list;
                    int size = list2.size();
                    eef eefVar = (eef) list2.get(((iIntValue % size) + size) % size);
                    int i = iIntValue2 >> 3;
                    final ndf ndfVar2 = ndfVar;
                    boolean zC = ((((i & 14) ^ 6) > 4 && vt9Var2.d(iIntValue)) || (i & 6) == 4) | vt9Var2.c(ndfVar2.d);
                    Object objK = vt9Var2.K();
                    boolean z = false;
                    final u6c u6cVar2 = u6cVar;
                    zpa zpaVar = hh5.a;
                    if (zC || objK == zpaVar) {
                        objK = luj.b(new q14((Object) u6cVar2, (Object) ndfVar2, iIntValue, (byte) 5));
                        vt9Var2.g0(objK);
                    }
                    iak iakVar = (iak) objK;
                    final nx5 nx5Var2 = nx5Var;
                    boolean zH = vt9Var2.h(nx5Var2) | vt9Var2.f(u6cVar2) | vt9Var2.f(ndfVar2);
                    if ((iIntValue2 & 112) == 32) {
                        z = true;
                    }
                    boolean z2 = zH | z;
                    Object objK2 = vt9Var2.K();
                    if (z2 || objK2 == zpaVar) {
                        final afe afeVar2 = afeVar;
                        objK2 = new Function0() { // from class: jef
                            public final Object invoke() {
                                int i2 = iIntValue;
                                afeVar2.setValue(Integer.valueOf(i2));
                                na2.B(nx5Var2, (CoroutineContext) null, (rx5) null, new hj4(u6cVar2, i2, ndfVar2, (mt5) null), 3);
                                return Unit.a;
                            }
                        };
                        vt9Var2.g0(objK2);
                    }
                    fr3.d((Function0) objK2, eefVar, ((Number) iakVar.getValue()).floatValue(), agmVar, ndfVar2.a, map, fefVar, vt9Var2, 0);
                } else {
                    vt9Var2.Q();
                }
                return Unit.a;
            }
        }, true));
        return Unit.a;
    }
}
