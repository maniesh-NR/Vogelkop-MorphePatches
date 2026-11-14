package defpackage;

import com.leanplum.utils.SizeUtil;
import com.opera.android.custom_views.StylingImageRadio;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u91 implements Function1 {
    public static final u91 b = new u91(0);
    public static final u91 c = new u91(1);
    public static final u91 d = new u91(2);
    public static final u91 e = new u91(3);
    public static final u91 f = new u91(4);
    public static final u91 g = new u91(5);
    public static final u91 h = new u91(6);
    public static final u91 i = new u91(7);
    public static final u91 j = new u91(8);
    public static final u91 k = new u91(9);
    public static final u91 l = new u91(10);
    public static final u91 m = new u91(11);
    public static final u91 n = new u91(12);
    public static final u91 o = new u91(13);
    public static final u91 p = new u91(14);
    public static final u91 q = new u91(15);
    public static final u91 r = new u91(16);
    public static final u91 s = new u91(17);
    public static final u91 t = new u91(18);
    public static final u91 u = new u91(19);
    public static final u91 v = new u91(20);
    public final /* synthetic */ byte a;

    public /* synthetic */ u91(byte b2) {
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        List list;
        List listH;
        List listE0;
        switch (this.a) {
            case 0:
                return Unit.a;
            case 1:
                float[] fArr = ((afd) obj).a;
                return Unit.a;
            case 2:
                float[] fArr2 = ((afd) obj).a;
                return Unit.a;
            case 3:
                return new u7a((String) obj);
            case 4:
                return new z7a((String) obj);
            case 5:
                return new a8a((String) obj);
            case 6:
                return new b8a((String) obj);
            case 7:
                return new c8a((String) obj);
            case 8:
                return new d8a((String) obj);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new e8a((String) obj);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((Number) obj).intValue();
                return null;
            case 11:
                ((Number) obj).intValue();
                return null;
            case 12:
                List list2 = (List) obj;
                list = list2.size() > 1 ? list2 : null;
                return (list == null || (listH = CollectionsKt.H(list)) == null) ? list2 : listH;
            case 13:
                return Intrinsics.a(obj, Boolean.FALSE) ? new u95(u95.g) : new u95(cs5.c(((Integer) obj).intValue()));
            case 14:
                return Unit.a;
            case 15:
                return null;
            case 16:
                return Boolean.valueOf(obj instanceof StylingImageRadio);
            case 17:
                return Boolean.valueOf(obj instanceof ax7);
            case SizeUtil.textSize0_1 /* 18 */:
                return Boolean.valueOf(obj instanceof ax7);
            case 19:
                return Boolean.valueOf(obj instanceof ax7);
            case SizeUtil.textSize0 /* 20 */:
                return Boolean.valueOf(obj instanceof ax7);
            default:
                List list3 = (List) obj;
                if (list3.isEmpty()) {
                    listE0 = l08.a;
                } else {
                    ListIterator listIterator = list3.listIterator(list3.size());
                    while (listIterator.hasPrevious()) {
                        if (((i7i) listIterator.previous()) instanceof z6i) {
                            listE0 = CollectionsKt.e0(list3, listIterator.nextIndex() + 1);
                        }
                    }
                    listE0 = l08.a;
                }
                list = listE0.isEmpty() ? null : listE0;
                return list == null ? CollectionsKt.e0(list3, 1) : list;
        }
    }
}
