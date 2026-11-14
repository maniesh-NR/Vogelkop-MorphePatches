package defpackage;

import ads_mobile_sdk.xa2;
import androidx.emoji2.emojipicker.EmojiPickerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;

/* loaded from: classes.dex */
public final class vy7 extends kuk implements Function2 {
    public final /* synthetic */ byte t = 1;
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy7(xa2 xa2Var, int i, mt5 mt5Var) {
        super(2, mt5Var);
        this.w = xa2Var;
        this.u = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy7(EmojiPickerView emojiPickerView, List list, int i, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = emojiPickerView;
        this.w = list;
        this.u = i;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        int i = this.u;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                return new vy7((EmojiPickerView) this.v, (List) obj2, i, mt5Var);
            default:
                vy7 vy7Var = new vy7((xa2) obj2, i, mt5Var);
                vy7Var.v = obj;
                return vy7Var;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        int i = this.u;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                EmojiPickerView emojiPickerView = (EmojiPickerView) this.v;
                ArrayList arrayList = emojiPickerView.g;
                arrayList.clear();
                List list = (List) obj2;
                ArrayList arrayList2 = new ArrayList(k95.o(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new lz7((String) it.next(), 0, 4));
                }
                arrayList.addAll(arrayList2);
                c82 c82Var = emojiPickerView.i;
                if (c82Var != null) {
                    ukb ukbVar = emojiPickerView.h;
                    if (ukbVar == null) {
                        ukbVar = null;
                    }
                    IntRange intRangeD = c82Var.d(ukbVar);
                    ukb ukbVar2 = emojiPickerView.h;
                    if (ukbVar2 == null) {
                        ukbVar2 = null;
                    }
                    if (ukbVar2.b() > i) {
                        jy7 jy7Var = emojiPickerView.j;
                        if (jy7Var == null) {
                            jy7Var = null;
                        }
                        int i2 = ((a) intRangeD).a + i;
                        ukb ukbVar3 = emojiPickerView.h;
                        if (ukbVar3 == null) {
                            ukbVar3 = null;
                        }
                        jy7Var.notifyItemRangeInserted(i2, ukbVar3.b() - i);
                    } else {
                        ukb ukbVar4 = emojiPickerView.h;
                        if (ukbVar4 == null) {
                            ukbVar4 = null;
                        }
                        if (ukbVar4.b() < i) {
                            jy7 jy7Var2 = emojiPickerView.j;
                            if (jy7Var2 == null) {
                                jy7Var2 = null;
                            }
                            int i3 = ((a) intRangeD).a;
                            ukb ukbVar5 = emojiPickerView.h;
                            if (ukbVar5 == null) {
                                ukbVar5 = null;
                            }
                            int iB = ukbVar5.b() + i3;
                            ukb ukbVar6 = emojiPickerView.h;
                            if (ukbVar6 == null) {
                                ukbVar6 = null;
                            }
                            jy7Var2.notifyItemRangeRemoved(iB, i - ukbVar6.b());
                        }
                    }
                    jy7 jy7Var3 = emojiPickerView.j;
                    if (jy7Var3 == null) {
                        jy7Var3 = null;
                    }
                    int i4 = ((a) intRangeD).a;
                    ukb ukbVar7 = emojiPickerView.h;
                    jy7Var3.notifyItemRangeChanged(i4, Math.min(i, (ukbVar7 != null ? ukbVar7 : null).b()));
                    emojiPickerView.f = false;
                }
                break;
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                nx5 nx5Var = (nx5) this.v;
                xa2 xa2Var = (xa2) obj2;
                IntRange intRangeJ = djh.j(0, i);
                ArrayList arrayList3 = new ArrayList(k95.o(intRangeJ, 10));
                acb it2 = intRangeJ.iterator();
                while (it2.c) {
                    ((ubb) it2).nextInt();
                    arrayList3.add(na2.B(nx5Var, xa2Var.b, null, new zhl((byte) 29, (mt5) ukbVar, (Object) xa2Var), 2));
                }
                xa2Var.g = arrayList3;
                break;
        }
        return Unit.a;
    }
}
