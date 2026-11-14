package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ke5 {
    public final List a;
    public final List b;
    public final List c;
    public List d;
    public List e;
    public final zyk f;
    public final zyk g;

    public ke5(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        final byte b = 0;
        this.f = z4c.b(new Function0(this) { // from class: ie5
            public final /* synthetic */ ke5 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                int i = 0;
                ke5 ke5Var = this.b;
                switch (b2) {
                    case 0:
                        List list6 = ke5Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i < size) {
                            o95.t((List) ((Function0) list6.get(i)).invoke(), arrayList);
                            i++;
                        }
                        ke5Var.d = l08.a;
                        return arrayList;
                    default:
                        List list7 = ke5Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i < size2) {
                            o95.t((List) ((Function0) list7.get(i)).invoke(), arrayList2);
                            i++;
                        }
                        ke5Var.e = l08.a;
                        return arrayList2;
                }
            }
        });
        final byte b2 = 1;
        this.g = z4c.b(new Function0(this) { // from class: ie5
            public final /* synthetic */ ke5 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                int i = 0;
                ke5 ke5Var = this.b;
                switch (b22) {
                    case 0:
                        List list6 = ke5Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i < size) {
                            o95.t((List) ((Function0) list6.get(i)).invoke(), arrayList);
                            i++;
                        }
                        ke5Var.d = l08.a;
                        return arrayList;
                    default:
                        List list7 = ke5Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i < size2) {
                            o95.t((List) ((Function0) list7.get(i)).invoke(), arrayList2);
                            i++;
                        }
                        ke5Var.e = l08.a;
                        return arrayList2;
                }
            }
        });
    }
}
