package defpackage;

import android.content.Context;
import android.util.Size;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class njm implements w6f {
    public final i7f a = new i7f();
    public final ev4 b;

    public njm(View view) {
        this.b = new ev4(view, new j1k(0, this, njm.class, "update", "update()Z", 0, (byte) 29));
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.a.b((bv8) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.a.c((bv8) obj);
    }

    public final boolean a() {
        boolean zB;
        i7f i7fVar = this.a;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        boolean z = false;
        while (g7fVarC.hasNext()) {
            bv8 bv8Var = (bv8) g7fVarC.next();
            byte b = bv8Var.a;
            boolean z2 = true;
            Object obj = bv8Var.b;
            switch (b) {
                case 0:
                    zB = ((cv8) obj).b();
                    break;
                case 1:
                    c5k c5kVar = (c5k) obj;
                    xf8.F0(c5kVar.f0, Boolean.valueOf(c5kVar.l.canScrollVertically(1)));
                    zB = false;
                    break;
                case 2:
                    ijc ijcVar = (ijc) obj;
                    if (ijcVar.b) {
                        ijcVar.b = false;
                        LinkedHashMap linkedHashMap = (LinkedHashMap) ijcVar.g;
                        if (((Size) ijcVar.i).getWidth() > 0 && ((Size) ijcVar.i).getHeight() > 0) {
                            d6k d6kVar = (d6k) ijcVar.f;
                            Context context = ((RecyclerView) ijcVar.c).getContext();
                            int width = ((Size) ijcVar.i).getWidth();
                            int height = ((Size) ijcVar.i).getHeight();
                            c6k c6kVarA = d6kVar.a(context, width, height, d6kVar.a(context, width, height, n08.a).a);
                            ArrayList arrayList = c6kVarA.b;
                            LinkedHashMap linkedHashMap2 = c6kVarA.a;
                            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                xf8.F0(((k6k) entry.getKey()).c, (f6k) entry.getValue());
                            }
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = arrayList.get(i);
                                i++;
                                xf8.F0(((k6k) obj2).c, (Object) null);
                            }
                            ijcVar.a = c6kVarA.c;
                            int size2 = arrayList.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                Object obj3 = arrayList.get(i2);
                                i2++;
                                linkedHashMap.remove(((k6k) obj3).b);
                            }
                            t5k t5kVar = (t5k) ijcVar.d;
                            ehc ehcVarB = a.b();
                            int i3 = 0;
                            for (Object obj4 : linkedHashMap2.keySet()) {
                                int i4 = i3 + 1;
                                if (i3 < 0) {
                                    j95.n();
                                    throw null;
                                }
                                k6k k6kVar = (k6k) obj4;
                                f6k f6kVar = (f6k) k6kVar.c.g();
                                if (f6kVar != null) {
                                    ((jde) ijcVar.h).i(i3, f6kVar.b);
                                }
                                u5k u5kVar = k6kVar.b;
                                ja2 ja2Var = (ja2) linkedHashMap.get(u5kVar);
                                if (ja2Var == null) {
                                    ja2 ja2VarT = u5kVar.t();
                                    linkedHashMap.put(u5kVar, ja2VarT);
                                    ehcVarB.add(ja2VarT);
                                } else if (u5kVar.y(ja2Var)) {
                                    ja2 ja2VarT2 = u5kVar.t();
                                    linkedHashMap.put(u5kVar, ja2VarT2);
                                    ehcVarB.add(ja2VarT2);
                                } else {
                                    ehcVarB.add(ja2Var);
                                }
                                i3 = i4;
                            }
                            ehc ehcVarA = a.a(ehcVarB);
                            ArrayList arrayList2 = t5kVar.a;
                            j87 j87VarK = uup.k(new ik(arrayList2, ehcVarA, (byte) 1), true);
                            arrayList2.clear();
                            arrayList2.addAll(ehcVarA);
                            j87VarK.b(t5kVar);
                        }
                    } else {
                        z2 = false;
                    }
                    zB = z2;
                    break;
                default:
                    zB = ((uvl) obj).a();
                    break;
            }
            z |= zB;
        }
        return z;
    }

    public final void b() {
        ev4 ev4Var = this.b;
        if (ev4Var.b) {
            return;
        }
        ev4Var.b = true;
        p37.C((View) ev4Var.d, ev4Var, new uog(ev4Var, (byte) 0), (ml2) ev4Var.f);
    }
}
